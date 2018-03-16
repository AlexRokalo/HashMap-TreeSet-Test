import java.util.Scanner;

public class ConsoleImputText implements ImputText {
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder line = new StringBuilder();
        while (scanner.hasNextLine()) {
            line.append(scanner.nextLine());
            line.append(" ");
            if (line.indexOf("STOP") > 0) break;
        }

        return line.toString();
    }
}