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

    @Override
    public String toString() {
        return id + " - " + Util.formatDate(date) + " - " + info + " - " + accountNumber + " - " + money;
    }
}
