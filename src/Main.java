public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 6");
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int x = 10; x >= 1; x--){
            System.out.println(x);
        }
        System.out.println("Задача 3");
        for (int f = 0; f <= 17; f = f + 2){
            System.out.println(f);
        }
        System.out.println("Задача 4");
        for (int g = 10; g >= -10; g--){
            System.out.println(g);
        }
        System.out.println("Задача 5");
        for (int h = 1904; h <= 2096; h = h + 4){
            System.out.println(h+" год является високосным");
        }
        System.out.println("Задача 6");
        for (int j = 7; j <= 98; j = j + 7){
            System.out.println(j);
        }
        System.out.println("Задача 7");
        for (int k = 1; k <= 512; k = k*2){
            System.out.println(k);
        }
        System.out.println("Задача 8");
        int monthMoney = 29000;
        int total = 0;
        for (int k = 0; k <= 12; k++) {
            total = total + monthMoney;
            System.out.println("Месяц "+k+", сумма накоплений равнв "+total+" рублей");
        }
        System.out.println("Задача 9");

        int total2 = 0;
        for (int k = 0; k <= 12; k++) {

            total2 = total2 + monthMoney;
            total2 = total2 + total2/100;
            System.out.println("Месяц " + k + ", сумма накоплений равнв " + total2 + " рублей");
        }
        System.out.println("Задача 10");
        for (int l = 1; l <= 10; l++) {
            System.out.println("2*"+l+"="+2*l);

        }

    }
}