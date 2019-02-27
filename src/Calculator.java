public class Calculator {

    public String calculate(String input){
        String[] splitString = input.split("[+]");
        String result = splitString[0] + splitString[1];
        if (result.contains("IIIII")) {
            result = result.replace("IIIII", "V");
            return result;
        }
        if (result.contains("IIII")) {
            result = result.replace("IIII", "IV");
            return result;
        }
        if (result.contains("VV")) {
            result = result.replace("VV", "X");
            return result;
        }
        return result;

    }
}
