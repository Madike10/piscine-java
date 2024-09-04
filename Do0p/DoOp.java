// package Do0p;

public class DoOp {
    public static String operate(String[] args) {
        int result = 0;
        if (args.length != 3){
            return "it depend on the input.";
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
        }
        return String.valueOf(result);
    }
}
