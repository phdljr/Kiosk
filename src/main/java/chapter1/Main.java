package chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        int score = (int)sc.nextFloat();
        sc.nextLine(); // 라인피드용 코드

        StringBuilder recipe = new StringBuilder();
        for(int i=0;i<10;i++){
            String sequence = sc.nextLine();
            recipe.append(String.format("%d. %s\n", i + 1, sequence));
        }

        System.out.printf("[%s]\n", title);
        System.out.printf("별점: %d (%.1f%%)\n", score, (float)score/5 * 100);
        System.out.println(recipe);
    }
}
