class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String s: strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sortedS = new String(temp);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}