import java.util.ArrayList;
import java.util.Random;

public class Team {
    public ArrayList<Player> getAllPlayer() {
        ArrayList<Player> allPlayer = new ArrayList<>();

        allPlayer.add(new Player(1, "Alisson Becker", Position.GK));
        allPlayer.add(new Player(13, "Adrian San Miguel", Position.GK));
        allPlayer.add(new Player(62, "Caoimhin Kelleherr", Position.GK));
        allPlayer.add(new Player(47, "Nathaniel Phillips", Position.DF));
        allPlayer.add(new Player(66, "Alexander-Arnold", Position.DF));
        allPlayer.add(new Player(12, "Jose Gomez", Position.DF));
        allPlayer.add(new Player(32, "Joel Matip", Position.DF));
        allPlayer.add(new Player(4, "Virgil van Dijk", Position.DF));
        allPlayer.add(new Player(26, "Andrew Robertson", Position.DF));
        allPlayer.add(new Player(72, "Sepp Van Den Berg", Position.DF));
        allPlayer.add(new Player(6, "Thiago Alcantara", Position.MF));
        allPlayer.add(new Player(3, "Fabinho", Position.MF));
        allPlayer.add(new Player(17, "Curtis Jones", Position.MF));
        allPlayer.add(new Player(14, "Jordan Henderson", Position.MF));
        allPlayer.add(new Player(7, "James Milner", Position.MF));
        allPlayer.add(new Player(67, "Harvey Elliott", Position.MF));
        allPlayer.add(new Player(58, "Ben Woodburn", Position.MF));
        allPlayer.add(new Player(20, "Diogo Jota", Position.FW));
        allPlayer.add(new Player(23, "Luis Diaz", Position.FW));
        allPlayer.add(new Player(11, "Mohamed Salah", Position.FW));
        allPlayer.add(new Player(10, "Sadio Mane", Position.FW));
        allPlayer.add(new Player(18, "Takumi Minamino", Position.FW));
        allPlayer.add(new Player(9, "Roberto Firmino", Position.FW));

        return allPlayer;
    }

    public ArrayList<Player> buildTeam(ArrayList<Player> allPlayer, int df, int mf, int fw) {
        ArrayList<Player> team = new ArrayList<>();
        Random rd = new Random();

        int goalKeeper = 0;
        int defender = 0;
        int midfielder = 0;
        int forward = 0;

        //Chọn thủ môn
        while (goalKeeper <= 0) {
            int rdGoalKeeper = rd.nextInt(23);
            if(allPlayer.get(rdGoalKeeper).getPosition() == Position.GK) {
                team.add(allPlayer.get(rdGoalKeeper));
                goalKeeper++;
            }
        }

        //Chọn DF
        while (defender < df) {
            int rdDefender = rd.nextInt(23);
            if(allPlayer.get(rdDefender).getPosition() == Position.DF) {
                if(!team.contains(allPlayer.get(rdDefender))) {
                    team.add(allPlayer.get(rdDefender));
                    defender++;
                }
            }
        }

        //Chọn MF
        while (midfielder < mf) {
            int rdMidfielder = rd.nextInt(23);
            if(allPlayer.get(rdMidfielder).getPosition() == Position.MF) {
                if(!team.contains((allPlayer.get(rdMidfielder)))) {
                    team.add(allPlayer.get(rdMidfielder));
                    midfielder++;
                }
            }
        }

        while (forward < fw) {
            int rdForward = rd.nextInt(23);
            if (allPlayer.get(rdForward).getPosition() == Position.FW) {
                if (!team.contains(allPlayer.get(rdForward))) {
                    team.add(allPlayer.get(rdForward));
                    forward++;
                }
            }
        }
        return team;
    }
}
