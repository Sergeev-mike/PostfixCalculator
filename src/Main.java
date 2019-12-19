public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        Calculate calculate = new Calculate();
        console.out("Введите выражение: ");
        String str = calculate.start(console.readLine());
        console.out("Ваш ответ: ");
        console.out(str);
    }
}