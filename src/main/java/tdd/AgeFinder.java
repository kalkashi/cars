package tdd;

public class AgeFinder {

    //fn to extract the digits

    public int findDigits(String input){
        if(input == null || input.length() == 0) {
            throw new IllegalArgumentException("Empty license string");
        }

        //Find the 2 digits
        String ageId = input.substring(2,4);
        int numAgeId = Integer.parseInt(ageId);
        return numAgeId;
    }

    //fn to fnd next age id
    public String findNextAge(String input) {

        int numAgeId = findDigits(input);
        String numStr = Integer.toString(numAgeId);
        if(numAgeId >=0 && numAgeId <=9){
            numStr = "0" + numStr;
        }
        if(numStr.length() != 2){
            throw new IllegalArgumentException("No 2 digits");
        }

        String result = "";

        if(numAgeId > 50){
            result = Integer.toString(numAgeId - 49);
            if(result.length()==1){
                result = "0" + result;
            }
            return result;
        }

        else if(numAgeId == 50){
            return "00";
        }

        else if(numAgeId < 50){
            result = Integer.toString(numAgeId + 50);
            return result;
        }


        else{
            throw new IllegalArgumentException("Not valid id");
        }


    }
}
