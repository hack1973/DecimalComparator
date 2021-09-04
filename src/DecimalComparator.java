public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double firstDouble, double secondDouble) {

        int first3DigitDouble = (int) (firstDouble * 1000);
        int second3DigitDouble = (int) (secondDouble * 1000);

        if (first3DigitDouble - second3DigitDouble == 0) {
            return true;
        }
        return false;
    }
}
