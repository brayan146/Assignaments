package Restaurant;

public class RestaurantTable implements Table{
    private int number;
    private Order order;
    private String status;

    public RestaurantTable(int number) {
        this.number = number;
        this.status = "Vacant";
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public Invoice generateInvoice() {
        return new RestaurantInvoice(order);
    }
}
