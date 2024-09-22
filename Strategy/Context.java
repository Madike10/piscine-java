public class Context {

    private OperationStrategy operationStrategy;

    public Context() {
        // Initialize with AddStrategy by default
        this.operationStrategy = new AddStrategy();
    }

    // Method to change the strategy
    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    // Method to execute the current strategy
    public int execute(int a, int b) {
        return operationStrategy.execute(a, b);
    }
}
