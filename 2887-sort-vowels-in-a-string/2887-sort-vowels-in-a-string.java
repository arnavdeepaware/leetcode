class Solution {
    public String sortVowels(String s) {
        /*
            - Create a stringbuilder for string s
            - If char c is consonant - do nothing
            - if c is a vowel, then add it to another sb
            - vowel sb - chararray - sort - sorted vowel sb
            - traverse the stringbuilder again and replace vowels with sorted vowels
            - return sb as string
        
         */

         StringBuilder res = new StringBuilder();
         StringBuilder vowels = new StringBuilder();
         HashSet<Character> vowel = new HashSet<>();

         vowel.add('a');
         vowel.add('e');
         vowel.add('i');
         vowel.add('o');
         vowel.add('u');
         vowel.add('A');
         vowel.add('E');
         vowel.add('I');
         vowel.add('O');
         vowel.add('U');

         res.append(s);
         for(char c: s.toCharArray()){
            if(vowel.contains(c)){
                vowels.append(c);
            }
         }

         char[] chars = vowels.toString().toCharArray();
         Arrays.sort(chars);
         vowels = new StringBuilder(new String(chars));

         int j = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(vowel.contains(s.charAt(i))){
                res.setCharAt(i, vowels.charAt(j));
                j++;
            }
        }

        return res.toString();
    }
}