package static20feb;

public class MathHelper {
	static int square(int number) { return number * number; }
    static int max(int a, int b) { return (a > b) ? a : b; }

    public static void main(String[] args) {
        System.out.println(MathHelper.square(5)); // 25
        System.out.println(MathHelper.max(3, 7)); // 7
    }

}
