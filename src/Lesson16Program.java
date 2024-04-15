import java.util.Random;

public class Lesson16Program {
    public static void main(String[] args) {

        //0,1,1,2,3,5,8,13,21...
        int number = 30;
        fibanacciNumbers(number);

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 10;
        int simpleNumber = foundSimpleNumber(randomNumber);
        System.out.println(randomNumber);
        System.out.println(simpleNumber);
    }

    public static void fibanacciNumbers(int number) {
        int fibNum = 0;
        int previousNumber = 0;
        int currentNumber = 1;
        for (int i = 0; i < number; i++) {
            fibNum = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = fibNum;
            System.out.println(fibNum);
        }
    }

    public static int foundSimpleNumber(int randomNumber) {
        int simpleNumber = 0;
        for (int i = randomNumber; i > 0; i--) {
            int count = 0;
            for (int j = 1; j < randomNumber; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (count <= 2) {
                simpleNumber = i;
                break;
            }
        }
        return simpleNumber;
    }
}
