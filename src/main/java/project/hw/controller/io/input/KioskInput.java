package project.hw.controller.io.input;

import java.util.Scanner;

public class KioskInput {
    private final Scanner scanner = new Scanner(System.in);

    public int selectNumber(){
        return scanner.nextInt();
    }
}
