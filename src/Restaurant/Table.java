package Restaurant;

public interface Table {
    int getNumber();
    Order getOrder();
    void setOrder(Order order);
    String getStatus();
    void setStatus(String status);
}
