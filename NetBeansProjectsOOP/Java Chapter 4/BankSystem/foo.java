package BankSystem;

public class foo {
    public static void main(String[] args) {
        foo f = new foo();
        f.method1();
    }

    public void method1() {
        method2();
    }

    public static void method2() {
        bankaccount a = new bankaccount();
        System.out.println(a.printResult());
    }
    
}
