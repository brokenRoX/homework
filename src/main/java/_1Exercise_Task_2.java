public class _1Exercise_Task_2 {
    public static void main(String[] args) {
        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[2]);
        String operator = args[1];

        double result;
        //noinspection EnhancedSwitchMigration
        switch (operator) {
            case "+": {
                result = firstNumber + secondNumber;
                break;
            }
            case "-": {
                result = firstNumber - secondNumber;
                break;
            }
            case "x":
            case "*": {
                result = firstNumber * secondNumber;
                break;
            }
            case "/": {
                result = firstNumber / secondNumber;
                break;
            }
            default: {
                System.out.println("Couldn't recognize the operator:" + operator);
                return; // Exit program
            }
        }
        System.out.println(firstNumber + operator + secondNumber + " = " + result);    }
}
