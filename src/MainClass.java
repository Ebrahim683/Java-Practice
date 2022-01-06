public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main Class");

//        MyPattern myPattern = new MyPattern();
//        myPattern.pattern10(5);

        int[] numbers = {1, 56, 87, 96, 5, 41, 2, 54, 98, 65};
        int target = 2;
//        System.out.println(linearSearch(numbers, target));
        System.out.println(linearSearchElement(numbers, target) + " Found in index " + linearSearchIndex(numbers, target));

        System.out.println("Minimum number is " + minimumNumber(numbers));
        System.out.println("Maximum number is " + maximumNumber(numbers));
    }

    public static int linearSearchIndex(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchElement(int[] numbers, int target) {
        boolean found = false;
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        if (found) {
            return target;
        } else return -1;
    }

    public static int minimumNumber(int[] numbers) {
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    public static int maximumNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}