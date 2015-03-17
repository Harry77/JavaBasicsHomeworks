import java.util.Scanner;

public class InstructionSet {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opCode = input.nextLine();
        //Got to a new line before the first output
        System.out.println();
        
        while (!opCode.equals("END")) {
            String[] codeArgs = opCode.split(" ");
            
            long result = 0;
            switch (codeArgs[0]) {
                case "INC": {
                    int operandOne = Integer.parseInt(codeArgs[1]);
                    //casting to "long" in case of reaching value greater than Integer
                    result = (long)operandOne + 1;
                    break;
                }
                case "DEC": {
                    int operandOne = Integer.parseInt(codeArgs[1]);
                    //casting to "long" in case of reaching value greater than Integer
                    result = (long)operandOne - 1;
                    break;
                }
                case "ADD": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    //casting to "long" in case of reaching value greater than Integer
                    result = (long)operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    //casting to "long" in case of reaching value greater than Integer
                    result = (long)operandOne * operandTwo;
                    break;
                }
                default:
                    break;
            }

            System.out.println(result);
            //reading the nextLine to avoid the infinity cycling
            opCode = input.nextLine();
        }        
    }
}
