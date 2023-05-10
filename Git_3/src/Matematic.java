public class Matematic {
    private int a;
    private int b;
    private int c;
    private int sum;

    public Matematic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int sum() {
        sum = a + b + c;
        return sum;
    }
}
