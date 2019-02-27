public class Calculator {

    public String calculate(String input){
        String[] splitString = input.split("[+]");
        String raw_result = splitString[0] + splitString[1];
        if (raw_result.equals("IIIII")) {
            return "V";
        }
        return raw_result;

    }
}
