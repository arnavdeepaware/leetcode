class Solution {
    public String reverseWords(String s) {
        
        ArrayList<String> list = new ArrayList<>();

        String word = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                
                if(word.length() > 0){
                    list.add(word);
                }

                word = "";

                while(i < s.length() && s.charAt(i) == ' '){
                    i++;
                }
            }

            if(i < s.length()){
                word += s.charAt(i);
            }            
        }

        if(word.length() > 0){
            list.add(word);
        }

        String res = "";
        for(int i = list.size() - 1; i>=0; i--){
            res += list.get(i) + ' ';
        }

        return res.substring(0, res.length() - 1);
    }
}