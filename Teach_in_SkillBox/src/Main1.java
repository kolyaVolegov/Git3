import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

//        Static static1 = new Static();
//        static1.forTeach();
//        System.out.println(static1.forTeach());

        int letht = 1;//задача:найти сумму, количество и среднее.
        int right = 3;
        int sum = 0;
        int count = 0;
        for (int i = letht; i <= right; i++) {
            sum += i;
            count++;
        }
        double avg = sum/count;
        System.out.println("Сумма = " + sum);
        System.out.println("Количество = " + count);
        System.out.println("Среднее = " + avg);
    }
}

