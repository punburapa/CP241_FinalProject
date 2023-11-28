public class Bill {
    String customerName;
    Order[] order;
    double total;
    Bill() {
    }
    Bill(Order[] order, double total) {
        this("Anonymous", order, total);
    }
    Bill(String name, Order[] order, double total) {
        this.customerName = name;
        this.order = order;
        this.total = total;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setOrder(Order[] order) {
        this.order = order;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Order[] getOrder() {
        return order;
    }

    public double getTotal() {
        return total;
    }
}
