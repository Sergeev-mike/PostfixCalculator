import java.util.Scanner;

class Console {
    void Console(String msg) {
        System.out.print(msg);
    }

    void Console(Double msg) {
        System.out.print(msg);
    }

    String inputConsole() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}