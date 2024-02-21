package matrixTest;

public class Matrix4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 6; j++) {
                System.out.printf("%3d * %d =%3d", j, i, i*j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 6; j < 10; j++) {
                System.out.printf("%3d * %d =%3d", j, i, i*j);
            }
            System.out.println();
        }
    }
}
