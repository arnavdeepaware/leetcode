class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        ArrayList<int[]> ans = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1 < nums1.length && p2 < nums2.length){

            int[] pair = new int[2];
            //Equal
            if(nums1[p1][0] == nums2[p2][0]){
                pair[0] = nums1[p1][0];
                pair[1] = nums1[p1][1] + nums2[p2][1];
                p1++;
                p2++;
            } else if(nums1[p1][0] < nums2[p2][0]){
                pair = nums1[p1];
                p1++;
            } else{
                pair = nums2[p2];
                p2++;
            }

            ans.add(pair);
        }

        while(p1 < nums1.length){
            ans.add(nums1[p1]);
            p1++;
        }

        while(p2 < nums2.length){
            ans.add(nums2[p2]);
            p2++;
        }

        // Convert List<int[]> to int[][]
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}