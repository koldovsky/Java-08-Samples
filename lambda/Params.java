package lambda;

interface ExecWithParams {
    String execute(String param);
}

class RunnerWithParams {
    void execute(ExecWithParams execWithParams) {
        System.out.println(execWithParams.execute("Greetings!"));
    }
}

public class Params {
    public static void main(String[] args) {
        ExecWithParams lambda = (param) -> "Hello there " + param;
        new RunnerWithParams().execute(lambda);
    }
}
