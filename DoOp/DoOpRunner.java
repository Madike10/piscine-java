// package DoOp;

public class DoOpRunner {
    public static void main(String[] args) {
        System.out.println(DoOp.operate(new String[]{"1","+","2"}));
        System.out.println(DoOp.operate(new String[]{"1","-","1"}));
        System.out.println(DoOp.operate(new String[]{"1","%","0"}));
        System.out.println(DoOp.operate(args));
    }
}
