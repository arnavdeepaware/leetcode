class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows < 2){
            return s;
        }

        int n = s.length();
        int charsInSection = numRows * 2 - 2;
        StringBuilder sb = new StringBuilder();

        for(int row = 0; row < numRows; row++){
            //Starts the row
            int index = row;

            while(index < n){
                //Append the first char of the section
                sb.append(s.charAt(index));

                //Check for middle rows
                //Add second character for the section
                if(row != 0 && row != numRows-1){
                    int charsInBetween = charsInSection - 2 * row;
                    int secondIndex = index + charsInBetween;

                    if(secondIndex < n){
                        sb.append(s.charAt(secondIndex));
                    }
                }

                //Move to the next section
                index += charsInSection;
            }
        }

        return sb.toString();
    }
}