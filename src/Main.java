import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Задача 1
        Scanner sc = new Scanner(System.in);

        System.out.println("Задача 1");

        System.out.println("Укажите ОС вашего смартфона:");
        System.out.println("Введите '0' если у вас iOS");
        System.out.println("Введите '1' если у вас Android");
        int clientOsActual = sc.nextInt();
        if(clientOsActual == 0 ){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2

        System.out.println("Задача 2");

        System.out.println("Укажите ОС вашего смартфона:");
        System.out.println("Введите '0' если у вас iOS");
        System.out.println("Введите '1' если у вас Android");
        clientOsActual = sc.nextInt();
        int clientDeviceYear = 2015;
        System.out.println("Укажите год выпуска смартфона");
        System.out.println("Введите год выпуска смартфона в формате ГГГГ без слова ''год'' ");
        int clientDeviceYearActual = sc.nextInt();

        if(clientOsActual == 0 && clientDeviceYearActual < clientDeviceYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if(clientOsActual == 0 && clientDeviceYearActual > clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOsActual == 1 && clientDeviceYearActual < clientDeviceYear){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        /*
        if(clientOsActual == 0){
            if (clientDeviceYearActual < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }else{
            if(clientDeviceYearActual < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        */

        //Задача 3

        System.out.println("Задача 3");

        System.out.println("Введите год в формате ГГГГ без слова ''год''");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year > 1584){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }

        //Задача 4

        System.out.println("Задача 4");

        System.out.println("Введите дистанцию до вашего местоположения в км.");
        int deliveryDistance = sc.nextInt();
        int timeDelivery = 0;

        if(deliveryDistance > 0 && deliveryDistance <= 20){
            timeDelivery += 1;
            System.out.println("Потребуется дней : "+ timeDelivery);
        }else if(deliveryDistance <= 60){
            timeDelivery += 2;
            System.out.println("Потребуется дней : "+ timeDelivery);
        }else if(deliveryDistance <= 100){
            timeDelivery += 3;
            System.out.println("Потребуется дней : "+ timeDelivery);
        }else{
            System.out.println("Доставки нет");
        }

        //Задача 5

        System.out.println("Задача 5");

        System.out.println("Введите номер месяца");
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень ");
                break;
            default:
                System.out.println("Такого месяца не существует, их всего 12");
        }

        /*
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println(monthNumber + "-й месяц принадлежит к сезону зима ");
            case 3, 4, 5 -> System.out.println(monthNumber + "-й месяц принадлежит к сезону весна ");
            case 6, 7, 8 -> System.out.println(monthNumber + "-й месяц принадлежит к сезону лето ");
            case 9, 10, 11 -> System.out.println(monthNumber + "-й месяц принадлежит к сезону осень ");
            default -> System.out.println("Такого месяца не существует, их всего 12");
        }*/

    }
}