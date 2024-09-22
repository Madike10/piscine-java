public class ConcatStrategy implements OperationStrategy {

    @Override
    public int execute(int a, int b) {
        // Concatenate the integers by converting them to strings and parsing them back to int
        return Integer.parseInt("" + a + b);
    }
}
