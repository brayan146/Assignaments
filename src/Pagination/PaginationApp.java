package Pagination;

public class PaginationApp {
    private UserInputService userInputService;
    private PaginationService paginationService;

    public PaginationApp(int pageSize,UserInputService userInputService) {
        this.paginationService = new Pagination(pageSize);
        this.userInputService = userInputService;
    }
    public void start() {
        Menu menu = new Menu(userInputService, paginationService);
        menu.display();
    }
}
