package chapter2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        String title = sc.next();

        switch (type) {
            case "List":
                List<String> strList = new ArrayList<>();
                while (true) {
                    String recipe = sc.nextLine();
                    if (recipe.equals("끝")) {
                        break;
                    }
                    strList.add(recipe);
                }

                System.out.println("[ List로 저장된 " + title + " ]");

                for (int i = 0; i < strList.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strList.get(i));
                }
                break;
            case "Set":
                Set<String> strSet = new HashSet<>();
                while (true) {
                    String recipe = sc.nextLine();
                    if (recipe.equals("끝")) {
                        break;
                    }
                    strSet.add(recipe);
                }

                System.out.println("[ Set 으로 저장된 " + title + " ]");

                Iterator<String> iterator = strSet.iterator();
                for (int i = 0; i < strSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + iterator.next());
                }
                break;
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int lineNumber = 1;
                while (true) {
                    // 한줄씩 입력받아서 strList 에 저장
                    String recipe = sc.nextLine();
                    if (recipe.equals("끝")) {
                        break;
                    }
                    strMap.put(lineNumber++, recipe);
                }

                System.out.println("[ Map 으로 저장된 " + title + " ]");

                for (int i = 0; i < strMap.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strMap.get(i + 1));
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }

    }
}
