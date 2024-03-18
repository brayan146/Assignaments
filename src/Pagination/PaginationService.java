package Pagination;

import java.util.List;

public interface PaginationService {
    void  addItem(String item) ;
    void setPageSize(int pageSize);
    List<String> getCurrentPageItems();
    void firstPage();
    void lastPage();
    void nextPage();
    void prevPage();
    void goToPage(int page);
    int getCurrentPage();

}
