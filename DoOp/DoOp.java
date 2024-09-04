// package DoOp;

public class DoOp {
    public static String operate(String[] args) {
        int result = 0;
        if (args.length != 3){
            return "it depend on the input.";
        }
        if (!args[1].equals("+") && !args[1].equals("-") && !args[1].equals("%")){
            return "Error";
        }
        if (args.length == 0){
            return "Error";
        }
        if (args[1] == "+"){
            result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
        }else if (args[1] == "-"){
            result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
        }else if ((args[1] == "%")){
            if (args[2] != "0"){
                result = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
            }else{
                return "Error";
            }
        }else if (args[1] == "*"){
            result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
        }
        return String.valueOf(result);
    }
}
