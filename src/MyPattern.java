public class MyPattern {

    public static void main(String[] args) {

        System.out.println();
        pattern7(5);

    }

    static void pattern1(int n) {
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalNumOfCol = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalNumOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalNumOfCol = row > n ? row - n + 1 : n - row + 1;
            for (int col = 1; col <= totalNumOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        //   *
        //  * *
        // * * *
        //* * * *
        for (int row = 1; row <= n; row++) {
            int totalCol = row;
            int spaces = n - totalCol;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        for (int row = 1; row <= n; row++) {
            int totalCol = n - row + 1;
            int spaces = n - totalCol;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        for (int row = 1; row <= 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int spaces = n - totalCol;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}