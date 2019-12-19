import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Console {
    private Scanner scanner = new Scanner(System.in);
    private Date date = new Date();
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    void out(String msg) {
        System.out.print(msg);
    }

    void out(ArrayList<Character> msg) {
        int i = 0;
        int size = msg.size();
        while (i < size) {
            System.out.print(msg.get(i));
            i++;
        }
    }

    String readLine() {
        return scanner.nextLine();
    }

    String readNext() {
        return scanner.next();
    }

    boolean hasInt(){
        return scanner.hasNextInt();
    }

    void log(int level, String msg) {
        switch (level) {
            case 1:
                this.out(ANSI_GREEN + "[" + date.toString() + "] " + ANSI_RESET + msg + "\n");
                return;
            case 2:
                this.out(ANSI_YELLOW + "Ошибка: " + ANSI_RESET + msg + "\n");
                return;
            case 3:
                this.out(ANSI_RED + "ВНИМАНИЕ: " + ANSI_RESET + msg + "\n");
                return;
        }
    }
}