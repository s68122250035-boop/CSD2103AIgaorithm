public class Example{
    private int count = 0;

    public static void main(String[] argv) {
        try {
            Example ex = new Example();
            ex.f();
        } catch (Exception e) {
            System.out.println("Boom")
        }
    }
    public void f() throws Exception {
        add(2);
        add(3)
    }
    public void add(int val) throws Exeption {
        if (val == 2)
        throw new Exeption();
        count += val;
    }
}   public void mult(int val) {
    count *= val;
}