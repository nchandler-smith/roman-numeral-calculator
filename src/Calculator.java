public class Calculator {

    public String calculate(String input){
        String[] splitString = input.split("[+]");
        return splitString[0] + splitString[1];
    }
}
