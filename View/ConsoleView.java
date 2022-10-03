package home4.update.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner scanner;

    public ConsoleView(){
        scanner = new Scanner(System.in);
    }

    public String getString(String string){
        System.out.printf("%s", string);
        return scanner.nextLine();
    }

    public int getValueChoice(String title, int choice) {
        System.out.printf("%s", title);
        int number = scanner.nextInt();
        while(number > choice || number < 1){
            System.out.printf("Enter no less than 1 and no more than %d\n", choice);
            number = scanner.nextInt();
        }
        return number;
    }

    public String getChoicePriority(){
        int value = getValueChoice("Enter priority:\n1 - low priority\n2 - medium priority\n3 - high priority\nChoice: ",3);
        String priority = "";
              switch (value) {
            case 1 -> priority = "low";
            case 2 -> priority = "medium";
            case 3 -> priority = "high";
        }
        return priority;
    }
}
