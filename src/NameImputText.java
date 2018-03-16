import java.util.Scanner;

public class NameImputText implements ImputText {

    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return name;
    }
}