class Solution {
    public int findCenter(int[][] edges) {
        
        /*
            We are given that a star graph
                - Every node is connected to the center and no other node
                - If we take two edges
                - There will be exactly 3 nodes involved in the two edges
                - However, the edges will have exactly 4 nodes
                - The common node is the center
        */

        int a = edges[0][1];
        int b = edges[0][0];

        if(a == edges[1][0] || a == edges[1][1]){
            return a;
        }

        return b;
    }
}