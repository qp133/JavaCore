public class Player {
    private int number;
    private String fullName;
    private Enum Position;

    public Player() {
    }

    public Player(int number, String fullName, Enum position) {
        this.number = number;
        this.fullName = fullName;
        Position = position;
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

    public Enum getPosition() {
        return Position;
    }

    public void setPosition(Enum position) {
        Position = position;
    }

    @Override
    public String toString() {
        return number + " - " + fullName + " - " + Position;
    }
}
