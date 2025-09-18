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

            //Array to store count of meeting per room
            int[] roomCount = new int[n];

            //Heap to store freeRooms.. sorted by n
            PriorityQueue<int[]> freeRooms = new PriorityQueue<>((a,b) -> a[1] - b[1]);

            //Heap to store usedRooms... sorted by endtime then n
            PriorityQueue<int[]> usedRooms = new PriorityQueue<>((a,b) -> {
                
                if(a[0] == b[0]){
                    return a[1] - b[1];
                }

                return a[0] - b[0];
            }
            );

            //Sort meetings by start time
            Arrays.sort(meetings, (a,b) -> a[0] - b[0]);

            //Populate free rooms
            for(int i = 0; i < n; i++){
                freeRooms.offer(new int[]{0, i});
            }

            //Traversal / Simulation
            //Loop through all meetings
            for(int[] meeting: meetings){

                int start = meeting[0];
                int duration = meeting[1] - meeting[0];

                //After we know the start time, we need to update any rooms that may have gotten free 
                while(!usedRooms.isEmpty() && usedRooms.peek()[0] <= start){
                    freeRooms.offer(usedRooms.poll());
                }

                int[] room;
                int difference = 0;

                //Case 1: use a free room from the heap,if available
                if(!freeRooms.isEmpty()){
                    room = freeRooms.poll();
                }

                //Case 2: wait the next room is available
                else{
                    room = usedRooms.poll();
                    difference = room[0] - start; //wait until room is free
                }

                room[0] = start + duration + difference;
                roomCount[room[1]] ++;
                usedRooms.offer(room);
            }

            int max = 0;
            int maxRoom = 0;

            for(int i = 0; i < n; i++){
                if(roomCount[i] > max){
                    max = roomCount[i];
                    maxRoom = i;
                }
            }

            return maxRoom;
        }
    }