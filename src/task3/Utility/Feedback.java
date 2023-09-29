package task3.Utility;

public class Feedback {
    private int id;
    private String description;
    public Customer customer;

    public Feedback(int id, String description, Customer customer) {
        this.id = id;
        this.description = description;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", description='" + description + '\'' +
                ", customer=" + customer;
    }
}
