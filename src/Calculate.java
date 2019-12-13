import java.util.Stack;

class Calculate {

    void start() {
        Check check = new Check();
        Console console = new Console();
        Stack<Double> stack = new Stack<Double>();
        double tmp1, tmp2;
        console.Console("Enter numbers and operations: ");
        String[] strings = console.inputConsole().split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (check.isNumber(strings[i])) {
                stack.push(Double.parseDouble(strings[i]));
            } else {
                if (!stack.empty()) {
                    tmp1 = stack.pop();
                } else {
                    console.Console("Error: not enough numbers ");
                    return;
                }
                if (!stack.empty()) {
                    tmp2 = stack.pop();
                } else {
                    console.Console("Error: not enough numbers ");
                    return;
                }
                if (check.isNumber(String.valueOf(tmp1)) && check.isNumber(String.valueOf(tmp2)))
                    switch (strings[i]) {
                        case "+":
                            stack.push(tmp1 + tmp2);
                            break;
                        case "-":
                            stack.push(tmp2 - tmp1);
                            break;
                        case "/":
                            if (tmp1 != 0)
                                stack.push(tmp2 / tmp1);
                            else {
                                console.Console("Error: a/0");
                                return;
                            }
                            break;
                        case "*":
                            stack.push(tmp1 * tmp2);
                            break;
                    }
                else {
                    console.Console("Error: not enough signs...");
                    return;
                }
            }
        }
        if (!stack.empty()) {
            console.Console("Result: " + stack.pop());
        } else {
            console.Console("Error");
        }
    }
}
