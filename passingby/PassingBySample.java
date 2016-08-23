package passingby;

public class PassingBySample {
    public static void main(String[] args) {
        Box<Integer> someVal = new Box<>(10);
        someMethod(someVal);
        System.out.println(someVal.getValue());
    }

    static void someMethod(Box<Integer> arg) {
        arg.setValue(100);
    }
}
