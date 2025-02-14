package Bank_0213;

public class Sample {
    public static void doSomething() {
        System.out.println("Hello, Do!");
    }

    @Override
    public Sample clone() {
        return this;
    }

    // @Override
    // public Sample clone() {
    // return new Sample();
    // }
}

class Test {
    public static void main(String[] args) {
        // Sample s = new Sample();
        // s.doSomething();
        // Sample.doSomething();
        // doSomething();
        // AccountNumberGenerator a1 =
        // AccountNumberGenerator.getAccountNumberGenerator();
        // AccountNumberGenerator a2 =
        // AccountNumberGenerator.getAccountNumberGenerator();

        // System.out.println(a1.getAccountNumber());
        // System.out.println(a2.getAccountNumber());

        Sample s = new Sample();
        Sample s2 = s.clone();

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

    }
}