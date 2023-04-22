public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1");
        tack1 ();
        System.out.println(" Задача 2");
        tack2 ();
        System.out.println(" Задача 3");
        tack3 ();
    }
    public static void jestHigh(int year) {
        System.out.println(year+ " год является високосным");
    }
    public static void notHigh (int year){
        System.out.println(year+" год не является високосным");
    }
    public static void tack1() {

        int year = 2029;
        if (year % 400 != 0 && year % 100 != 0 && year % 4 != 0)
            notHigh(year);
        else
            jestHigh(year);
    }
    public static void instalLink (int clientOS, int clientDeviceYear) {
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        else {
            if (clientOS == 0){
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void tack2() {
        int clientOS = 0;
        int clientDeviceYear = 2014;
        instalLink(clientOS, clientDeviceYear);
    }

    public static int deliveryDays () {
return 0;
    }

    public static void tack3() {
        int deliveryDistance = 40;
        int total = deliveryDays();
        if (deliveryDistance > 20) {
            total++;
        }
        if (deliveryDistance > 60) {
            total++;
        }
        System.out.println("Потребуется дней: "+ total);


    }


}

