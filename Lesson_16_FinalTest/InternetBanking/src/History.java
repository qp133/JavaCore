import java.time.LocalDate;
public class History {
    private int id;
    private LocalDate date;
    private String info;
    private int accountNumber;
    private int money;

    public History(LocalDate date, String info, int accountNumber, int money) {
        this.id = Util.randomNumber(0,100);
        this.date = date;
        this.info = info;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public History() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return id + " - " + Util.formatDate(date) + " - " + info + " - " + accountNumber + " - " + money;
    }
}
