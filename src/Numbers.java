public class Numbers {
    public  int linearSearchIndex(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    public  int linearSearchElement(int[] numbers, int target) {
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

    public  int minimumNumber(int[] numbers) {
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    public  int maximumNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
