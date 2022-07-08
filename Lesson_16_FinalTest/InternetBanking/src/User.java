public class User {
    private int accountBalance = 5000000;
    private int phoneNumber;
    private String password;
    private int accountNumber;

    public User(int phoneNumber, String password, int accountNumber, int accountBalance) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public User() {
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return phoneNumber + " - " + password + " - " + accountNumber + " - " + accountBalance;
    }
}
