public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main Class");

//        MyPattern myPattern = new MyPattern();
//        myPattern.pattern10(5);

        int[] numbers = {1, 56, 87, 96, 5, 41, 2, 54, 98, 65};
        int target = 2;

        Numbers numberClass = new Numbers();
        System.out.println(numberClass.linearSearchElement(numbers, target) + " Found in index " + numberClass.linearSearchIndex(numbers, target));

        System.out.println("Minimum number is " + numberClass.minimumNumber(numbers));
        System.out.println("Maximum number is " + numberClass.maximumNumber(numbers));
    }


}