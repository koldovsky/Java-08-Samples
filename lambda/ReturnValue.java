package lambda;

interface Returnable {
    String execute();
}

class RunnerReturnable {
    void execute(Returnable returnable) {
        System.out.println(returnable.execute());
    }
}

public class ReturnValue {
    public static void main(String[] args) {
        new RunnerReturnable().execute( () -> "Hello there" );
    }
}
