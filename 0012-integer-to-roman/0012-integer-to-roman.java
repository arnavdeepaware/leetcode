class Solution {
    public String intToRoman(int num) {

        /*
            Use a hashmap
            Divide the num by highest symbol
            how to identify 4 or 9 case?
            the mappings are parallel.. for ex if not 1000, we can check 900
                                               if not 500, then 400
                                               if not 100 then 90
                                               if not 50, then 40
                                               if not 10, then 9
                                               if not 5, then 4
                                               if not 1, still 1

            We divide the num by highest symbol, if 0, we divide by smaller hashmap
                - we add max 3 of highest symbols or one of smaller hm symbols
            - Take the remainder for next iteration
            - Move the current symbols parallely


            - Need symbols array
            - Need symbols hashmaps x2
            - StringBuilder
        */

        HashMap<Integer, String> bigger = new HashMap<>();
        HashMap<Integer, String> smaller = new HashMap<>();
        int[][] symbols = {
                        {1000, 900},
                        {500, 400},
                        {100, 90},
                        {50, 40},
                        {10, 9},
                        {5, 4},
                        {1, 1},
        };

        bigger.put(1, "I");
        bigger.put(5, "V");
        bigger.put(10, "X");
        bigger.put(50, "L");
        bigger.put(100, "C");
        bigger.put(500, "D");
        bigger.put(1000, "M");

        smaller.put(1, "I");
        smaller.put(4, "IV");
        smaller.put(9, "IX");
        smaller.put(40, "XL");
        smaller.put(90, "XC");
        smaller.put(400, "CD");
        smaller.put(900, "CM");


        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < symbols.length; i++){

            //Higher symbol as divisor
            int symbolVal = symbols[i][0];
            int temp = num / symbolVal;

            //Case 1 - adding current symbols
            if(temp > 0){
                while(temp > 0){
                    sb.append(bigger.get(symbolVal));
                    temp--;
                }
            }else{
                //Change to smaller hashmap - only 1 string added
                symbolVal = symbols[i][1];
                temp = num / symbolVal;
                while(temp > 0){
                    sb.append(smaller.get(symbolVal));
                    temp--;
                }
            }

            //Update num
            num %= symbolVal;
            if(i < symbols.length - 1 && num >= symbols[i][1]){
                i--;
            }
        }
        

    return sb.toString();
    }

}