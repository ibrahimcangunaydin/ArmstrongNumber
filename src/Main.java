import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, digitCounter = 0, tempNumber, digitValue, total = 1, result = 0;

        for (int l = 100; l <= 999; l++) {
            number = l;
            tempNumber = number;

            while (tempNumber != 0) {
                tempNumber /= 10;
                digitCounter++;
            }

            tempNumber = number;
            for (int i = 1; i <= digitCounter; i++) {
                digitValue = tempNumber % 10;
                for (int k = 1; k <= digitCounter; k++) {
                    total *= digitValue;
                }
                result += total;
                total = 1;
                tempNumber /= 10;
            }

            if (number == result) {
                System.out.println(result);
            }
            digitCounter = 0;
            result = 0;

        }
    }
}
