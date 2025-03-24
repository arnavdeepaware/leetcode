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


        // Count array and heaps
        int[] roomCounts = new int[n];  //n-1 rooms

        // int[3] with endtime, count, roomNumber
        PriorityQueue<int[]> freeRooms = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        PriorityQueue<int[]> usedRooms = new PriorityQueue<>((a,b) -> {
            //endtime first then room number
            if(a[0] == b[0]){
                return a[2] - b[2];
            }

            return a[0] - b[0];
        });

        //Populate heap
        for(int i = 0; i < n; i++){
            int[] room = new int[]{0, 0, i};
            freeRooms.offer(room);
        }

        Arrays.sort(meetings, (a,b) -> a[0] - b[0]);

        //Traversal
        for(int[] meeting: meetings){
            int start = meeting[0], duration = meeting[1] - meeting[0], difference = 0;

            //Update usedRooms to freeRooms
            while(!usedRooms.isEmpty() && usedRooms.peek()[0] <= meeting[0]){
                freeRooms.offer(usedRooms.poll());
            }

            int[] room;

            if(!freeRooms.isEmpty()){
                room = freeRooms.poll();
            }else{
                room = usedRooms.poll();
                difference = room[0] - meeting[0];
            }

            room[0] = start + duration + difference;
            room[1] ++;
            roomCounts[room[2]]++;
            usedRooms.offer(room);
        }

        int maxCount = -1;
        int maxRoom = 0;

        for(int i=0; i < n; i++){
            if(roomCounts[i] > maxCount){
                maxCount = roomCounts[i];
                maxRoom = i;
            }
        }

        return maxRoom;


        
        

    }
}