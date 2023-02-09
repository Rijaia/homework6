public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 7");
        System.out.println("Задача 1");

        int total3 = 0;
        int monthes = 0;
        int cash = 15000;
        while (total3 < 2_459_000) {
            monthes = monthes + 1;
            total3 = total3 + total3/100;
            total3 = total3 + cash;
            System.out.println(total3);
        }
        System.out.println(monthes);
        System.out.println("Задача 2");
        int r = 0;
        int l = 11;
        while (r < 10) {
            r=r+1;
            System.out.print(" "+r);
        }
        System.out.println();
        for (;l > 1;) {
            l = l-1;
            System.out.print(" "+l);
        }
        System.out.println();
        System.out.println("Задача 3");
        int people = 12_000_000;
        int born = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + people*born/1000 - people*death/1000;
            System.out.println("Год "+year+" численность населения составляет "+people+" человек");
        }
        System.out.println("Задача 4");
        int start = 15000;
        int n = 0;
        while (n <= 9*12) {
            start = start + start * 7 / 100;
            n = n + 1;
            if (n % 6 == 0){
            System.out.println(start);
            }
        }
        System.out.println("Копить нужно будет "+n+" месяцев");
        System.out.println("Задача 7");
        int numberOfFriday = 3;
        System.out.println("Сегодня пятница, "+numberOfFriday+"-е число. Необходимо подготовить отчет.");
        while (numberOfFriday <= 31-7) {
            numberOfFriday = numberOfFriday + 7;
            System.out.println("Сегодня пятница, "+numberOfFriday+"-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        int yearNow = 2023;
        int yearCommet = yearNow - 200;
        while (yearCommet <= yearNow) {
            yearCommet = yearCommet + 1;
            if (yearCommet % 79 == 0) {
                System.out.println(yearCommet);
            }
        }
       yearNow = yearNow + 100;
        while (yearCommet <= yearNow) {
            yearCommet = yearCommet + 1;
            if (yearCommet % 79 == 0) {
                System.out.println(yearCommet);
            }
        }


    }
}