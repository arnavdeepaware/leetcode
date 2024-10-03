class Solution {
    public int romanToInt(String s) {
        
        HashMap <Character, Integer> hm = new HashMap <Character, Integer> ();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0;
        int prev = Integer.MAX_VALUE;
       

        for (int i = 0; i < s.length(); i++){
            
            if (hm.get(s.charAt(i)) > prev){
                sum -= prev * 2;
            } 

            sum += hm.get(s.charAt(i));
            prev = hm.get(s.charAt(i));
            //System.out.println("i = " + i + "; sum = " + sum);
        }

    return sum;
    }
}