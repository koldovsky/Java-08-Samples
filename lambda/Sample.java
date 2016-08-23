package lambda;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable executable) {
        executable.execute();
    }
}

public class Sample {
    public static void main (String[] args) {
        // Old approach using anonymous class
        new Runner().run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Do something...");
            }
        });
        // New approach using lambdas
        new Runner().run( () -> System.out.println("Do something with lambda") );
        // Multiple statements
        new Runner().run( () -> {
            System.out.println("Do something with lambda");
            System.out.println("Another statement goes here");
        } );
    }
}
