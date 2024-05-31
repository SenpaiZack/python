public class KeyFinder {

    public static int findKey(int input1, int input2, int input3) {
        int thousandsDigitInput1 = input1 / 1000;
        int hundredsDigitInput2 = (input2 / 100) % 10;

        int smallestDigitInput3 = 9;
        while (input3 > 0) {
            int digit = input3 % 10;
            if (digit < smallestDigitInput3) {
                smallestDigitInput3 = digit;
            }
            input3 /= 10;
        }

        return (thousandsDigitInput1 * hundredsDigitInput2) + smallestDigitInput3;
    }
}
