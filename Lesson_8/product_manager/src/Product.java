public class Product {
    private int id;
    private String name;
    private String info;
    private int amount;
    private long price;
    private String unit;

    public Product() {
    }

    public Product(int id, String name, String info, int amount, long price, String unit) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.amount = amount;
        this.price = price;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + info + " - " + amount + " - " + price + " - " + unit;
    }
}
