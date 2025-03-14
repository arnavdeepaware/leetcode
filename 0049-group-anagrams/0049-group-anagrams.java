class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c - 'a']++;
            }

            //Key to put s into the map
            String sortedS = Arrays.toString(count);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());

        
    }
}