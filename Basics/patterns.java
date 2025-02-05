public class patterns {
    public static void main(String args[]) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        pattern7();
    }

    // Pattern 1
    public static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void pattern4() {
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 5
    public static void pattern5() {
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // ADVANCED PATTERS
    public static void pattern6() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7() {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int l = 0; l < i - 1; l++) {
                System.out.print("*");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
