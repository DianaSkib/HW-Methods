import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // task 1
        int year = 2021;
        printLeapYearResult(year);

        // task 2
        recommendAppVersion(0, 2014); //   task 2
        recommendAppVersion(1, 2016); //   task 2
        recommendAppVersion(0, 2030); //   task 2
        recommendAppVersion(2, 2020); //   task 2
    }

    public static void printLeapYearResult(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // task 2
    public static void recommendAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean isLegacyDevice = clientDeviceYear < 2015 || clientDeviceYear > currentYear;

        String osName;
        String message;

        if (osType == 0) {
            osName = "iOS";
        } else if (osType == 1) {
            osName = "Android";
        } else {
            System.out.println("Неподдерживаемая операционная система");
            return;
        }

        if (isLegacyDevice) {
            message = "Установите облегчённую версию приложения для " + osName + " по ссылке";
        } else {
            message = "Установите приложение для " + osName + " по ссылке";
        }

        System.out.println(message);
    }
}