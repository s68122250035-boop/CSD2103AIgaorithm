class MyException extends RuntimeException {
    public MyException(String message) {
        super(message); // ส่ง message ไป JVM
    }
}

public class TestDemoException {
   
    static void checkAge(int age) {
        if (age < 18) {
            throw new MyException("Age must be at least 18");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}