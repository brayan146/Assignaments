package Pagination;

public class PaginationRunner {
    public static void main(String[] args) {
        UserInputService userInput = new UserInput();
        System.out.println("Ingrese el tamaño de la página:");
        int pageSize = Integer.parseInt(userInput.getNextLine());
        PaginationApp paginationApp = new PaginationApp(pageSize, userInput);
        paginationApp.start();
        userInput.close();
    }
}
