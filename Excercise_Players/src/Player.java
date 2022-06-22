public class Player {
    private int number;
    private String fullName;
    private position;

    public Player() {
    }

    public Player(int number, String fullName, position) {
        this.number = number;
        this.fullName = fullName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return number + " - " + fullName + " - " + Position;
    }
}
