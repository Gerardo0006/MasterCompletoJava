import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month, numDays = 0;

        System.out.print("Ingrese el año (YYYY): ");
        year = scanner.nextInt();

        System.out.print("Ingrese el mes (1-12): ");
        month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0))) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                numDays = 0;
        }
        System.out.println("numDays = " + numDays);
    }
}
