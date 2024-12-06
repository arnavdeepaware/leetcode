class Solution {
    public int partitionString(String s) {
        

        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i < s.length(); i++){
            //If in set
            if(set.contains(s.charAt(i))){
                set.clear();
                count++;
            }

            set.add(s.charAt(i));
        }

        return ++count;
    }
}