package Pagination;

import java.util.ArrayList;
import java.util.List;

public class Pagination implements PaginationService{
    private List<List <String >> pages;
    private int pageSize;
    private int currentPage;

    public Pagination(int pageSize) {
        this.pages = new ArrayList<>();
        this.pages.add(new ArrayList<>());
        this.pageSize = pageSize;
        this.currentPage = 0;
    }

    public void addItem(String item) {
        if (pages.isEmpty() || currentPage>=pages.size()){
            pages.add(new ArrayList<>());
        }
        List<String> currentPageItems = pages.get(currentPage);
        if (currentPageItems.size() == pageSize) {
            currentPageItems = new ArrayList<>();
            pages.add (currentPageItems);
            currentPage++;
        }
        currentPageItems.add(item);
    }

    public void setPageSize(int pageSize) {
        List<String> allItems = new ArrayList<>();
        for (List<String> page : pages) {
            allItems.addAll(page);
        }
        this.pageSize = pageSize;
        this .pages = new ArrayList<>();
        this.currentPage = 0;

        for (String item : allItems) {
            addItem(item);
        }
    }

    public List<String> getCurrentPageItems() {
        return pages.get(currentPage);
    }

    public void firstPage() {
        currentPage = 0;
    }

    public void lastPage() {
        currentPage = pages.size() - 1;
    }

    public void nextPage() {
        if (currentPage< pages.size() -1) {
            currentPage++;
        }else {
            pages.add(new ArrayList<>());
            currentPage++;
        }
    }

    public void prevPage() {
        if (currentPage > 0) {
            currentPage--;
        }
    }

    public void goToPage(int page) {
        if (page >= 1 && page <= pages.size()) {
            currentPage = page-1;
        }else {
            System.out.println("Página no encontrada");
        }
    }
    public int getCurrentPage() {
        return currentPage+1;
    }

}
