package LuyenTap.CustomerAndInvoice;

public class Invoice {
    private int idInvoice;
    private Customer customer;
    private double amount;

    public Invoice(int idInvoice, Customer customer, double amount) {
        this.idInvoice= idInvoice;
        this.customer = customer;
        this.amount = amount;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setId(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount = this.amount - this.amount*customer.getDiscount()/100;

    }

    @Override
    public String toString() {
        return "Invoice{" +
                "idInvoice=" + idInvoice +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
