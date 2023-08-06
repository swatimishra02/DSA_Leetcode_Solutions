public class roundedNumber {
    public static int roundToNearestMultipleOfTen(int number) {
        return Math.round(number / 10.0f) * 10;
    }

    public static void main(String[] args) {
        int number = 43;
        int roundedNumber = roundToNearestMultipleOfTen(number);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);
    }
}
