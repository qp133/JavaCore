import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        ArrayList<Player> allPlayer = team.getAllPlayer();
//        System.out.println(allPlayer.size());

        System.out.println("Chọn cầu thủ theo mô hình 1:");
        ArrayList<Player> chooseTeam1 = team.buildTeam(allPlayer, 4,4,2);
        for(Player p : chooseTeam1) {
            System.out.println(p);
        }

        System.out.println("------------");
        System.out.println("Chọn cầu thủ theo mô hình 2:");
        ArrayList<Player> chooseTeam2 = team.buildTeam(allPlayer, 4,3,3);
        for(Player p : chooseTeam2) {
            System.out.println(p);
        }

        System.out.println("------------");
        System.out.println("Chọn cầu thủ theo mô hình 3:");
        ArrayList<Player> chooseTeam3 = team.buildTeam(allPlayer, 3,5,2);
        for(Player p : chooseTeam3) {
            System.out.println(p);
        }
    }
}
