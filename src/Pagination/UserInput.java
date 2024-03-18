package Pagination;
import java.util.Scanner;

public class UserInput implements UserInputService{
    private Scanner scanner;
    public UserInput() {
        this.scanner = new Scanner(System.in);
    }
    @Override
    public String getNextLine() {
        return scanner.nextLine();
    }
    @Override
    public int getNextInt() {
        return Integer.parseInt(scanner.nextLine());
    }
    @Override
    public void close() {
        scanner.close();
    }
}
