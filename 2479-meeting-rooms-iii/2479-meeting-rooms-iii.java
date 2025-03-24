class Solution {
    public int mostBooked(int n, int[][] meetings) {
        
        /*                              p
             Start  --> 2   3   7   17  18
             End    --> 13  12  10  19. 19

             Rooms:   end ct  n
                  F   19  2   0
                  F   12  1   1
                  F   19  2   2
                  F   00  0   3

                t = 0

            Need to store count for each room
            Need to return max count
            Store min endtime -- heap?
            efficient way to find earliest room or to know all rooms are full ?
            2 heaps: one for free rooms, other for occupied rooms
                - sorted by end time and then room number
            
            - We can check for empty rooms and poll the earliest one
            - If empty, poll the room ending first, assign the room 

            - Sort the array to start time
            - heaps of int[3] -- free and taken
            - traverse
            - find max room
        */

        //Sorting and heaps
        Arrays.sort(meetings, (a,b) -> a[0] - b[0]);

        PriorityQueue<int[]> free = new PriorityQueue<>((a, b) -> a[3] - b[3]);

        PriorityQueue<int[]> taken = new PriorityQueue<>((a, b) -> {
            if(a[1] == b[1]){
                return a[3] - b[3];
            }

            return a[1] - b[1];
        });

        //Populate free heap
        for(int i = 0; i < n; i++){
            int[] meeting = new int[]{
                0, 0, 0, i 
            };

            free.offer(meeting);
        }

        //Traversal
        for(int i = 0; i < meetings.length; i++){

            while(!taken.isEmpty() && taken.peek()[1] <= meetings[i][0]){
                free.offer(taken.poll());
            }
            
            //Check if a room is free
            if(free.size() > 0){
                //Assign the first room to the meeting
                int[] room = free.poll();
                room[0] = 1;
                room[1] = meetings[i][1];
                room[2] ++;
                
                //Put updated room into taken heap
                taken.offer(room);
                System.out.println(i);
            }
            //If no room is available at the moment
            else{
                //Get the room with earliest finish time
                int[] room = taken.poll();

                //Update current meeting timings
                if(room[1] > meetings[i][0]){
                    int difference = room[1] - meetings[i][0]; //EndTime of room - start of meeting
                    meetings[i][0] += difference;
                    meetings[i][1] += difference;
                }

                //Update room with updated meeting times
                room[0] = 1;
                room[1] = meetings[i][1];
                room[2] ++;

                taken.offer(room);
                System.out.println(i);
            }   

            
        }

        //Post - Traversal find max room
        int maxRoom = 101;
        int maxCount = -1;

        while(!free.isEmpty()){
            taken.offer(free.poll());
        }

        
        while(!taken.isEmpty()){
            int[] room = taken.poll();
            System.out.println("" + room[1] + " " + room[2] + " " + room[3]);

            
            if(maxCount <= room[2]){     //Compares the count of room and room no
                if(maxCount == room[2] && maxRoom < room[3]){
                    continue;
                }
                maxRoom = room[3];
                maxCount = room[2];

                System.out.println("Max Room = " + maxRoom + "\tMax count = " + maxCount);
            }  
        }



        return maxRoom;
    }
}