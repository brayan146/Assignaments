package Pagination;

import java.util.List;

public class Menu {
    private static final String ADD_ITEM = "1";
    private static final String CHANGE_PAGE_SIZE = "2";
    private static final String FIRST_PAGE = "3";
    private static final String LAST_PAGE = "4";
    private static final String NEXT_PAGE = "5";
    private static final String PREVIOUS_PAGE = "6";
    private static final String SPECIFIC_PAGE = "7";
    private static final String EXIT = "8";

    private PaginationService pagination;
    private UserInputService userInput;

    public Menu(UserInputService userInput, PaginationService pagination) {
        this.userInput = userInput;
        this.pagination = pagination;
    }

    public void display() {
        while (true) {
            displayMenu();
            String command = userInput.getNextLine();
            switch (command) {
                case ADD_ITEM:
                    addItem();
                    break;
                case CHANGE_PAGE_SIZE:
                    changePageSize();
                    break;
                case FIRST_PAGE:
                    pagination.firstPage();
                    break;
                case LAST_PAGE:
                    pagination.lastPage();
                    break;
                case NEXT_PAGE:
                    pagination.nextPage();
                    break;
                case PREVIOUS_PAGE:
                    pagination.prevPage();
                    break;
                case SPECIFIC_PAGE:
                    goToSpecificPage();
                    break;
                case EXIT:
                    return;
            }
            displayCurrentPage();
        }
    }
    private void displayMenu() {
        System.out.println("1.-Agregar un elemento");
        System.out.println("2.-Cambiar el tamaño de la página");
        System.out.println("3.-Ir a la primera página");
        System.out.println("4.-Ir a la última página");
        System.out.println("5.-Ir a la página siguiente");
        System.out.println("6.-Ir a la página anterior");
        System.out.println("7.-Ir a una página específica");
        System.out.println("8.-Salir");
        System.out.println("Ingrese un comando:");
    }
    private void addItem() {
        System.out.println("Ingrese el elemento a agregar:");
        String item = userInput.getNextLine();
        pagination.addItem(item);
    }
    private void changePageSize() {
        System.out.println("Ingrese el nuevo tamaño de la página:");
        int pageSize = userInput.getNextInt();
        pagination.setPageSize(pageSize);
    }
    private void goToSpecificPage() {
        System.out.println("Ingrese el número de la página:");
        int page = userInput.getNextInt();
        pagination.goToPage(page);
    }

    private void displayCurrentPage() {
        System.out.println();
        System.out.println("Página actual: " + pagination.getCurrentPage());
        System.out.println("Elemntos Pagina Actual " );
        System.out.println("-------------------");
        List<String> currentPageItems = pagination.getCurrentPageItems();
        for (String item : currentPageItems) {
            System.out.println(item);
        }
        System.out.println("-------------------");
        System.out.println();
    }
}

