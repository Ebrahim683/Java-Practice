public class Arrays {


    public void main() {
        int[][] arrays = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int target = 50;
        int[] numbers = {2, 30, 5};
//        twoDArray();
//        searchIn2dArrays(arrays,target);
//        System.out.println(max(arrays));
        System.out.println(evenNumberOfDigits(numbers));
    }

    public void twoDArray() {
        int[][] arrays = {{10, 20}, {30, 40}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }

        System.out.println(java.util.Arrays.toString(arrays));
        System.out.println(java.util.Arrays.deepToString(arrays));
    }

    public void searchIn2dArrays(int[][] array, int target) {
        int[] ans = search(array, target);
        System.out.println(java.util.Arrays.toString(ans));
    }

    public int[] search(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int max(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    }

    public int evenNumberOfDigits(int[] array) {
        int count = 0;
        for (int num : array) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    public boolean even(int count) {
        int digits = digitsInANumber(count);
        return digits % 2 == 0;
    }

    public int digitsInANumber(int numbers) {
        int count = 0;
        while (numbers > 0) {
            count++;
            numbers /= 10;
        }
        return count;
    }

}
