package sem_5.task2;

import java.util.Scanner;

public class ToDoListView {
    private Scanner scanner;

    public ToDoListView() {
        scanner = new Scanner(System.in);
    }

    public int choise(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public String readText(String prompt1){
        System.out.print(prompt1);
        return scanner.next();
    }

}





