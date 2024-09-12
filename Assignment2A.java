import java.util.Scanner;

class CricketPlayer {
    int pid;
    String pname;
    int totalruns;
    int inningsplayed;
    int notouttimes;

    CricketPlayer(int pid, String pname, int totalruns, int inningsplayed, int notouttimes) {
        this.pid = pid;
        this.pname = pname;
        this.totalruns = totalruns;
        this.inningsplayed = inningsplayed;
        this.notouttimes = notouttimes;
    }

    double calculateAverage() {
        if (inningsplayed - notouttimes == 0) {
            return 0;
        }
        return (double) totalruns / (inningsplayed - notouttimes);
    }
}

public class CricketPlayerDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter player " + (i + 1) + " id: ");
            int pid = scanner.nextInt();
            System.out.print("Enter player " + (i + 1) + " name: ");
            String pname = scanner.next();
            System.out.print("Enter player " + (i + 1) + " total runs: ");
            int totalruns = scanner.nextInt();
            System.out.print("Enter player " + (i + 1) + " innings played: ");
            int inningsplayed = scanner.nextInt();
            System.out.print("Enter player " + (i + 1) + " not out times: ");
            int notouttimes = scanner.nextInt();

            players[i] = new CricketPlayer(pid, pname, totalruns, inningsplayed, notouttimes);
        }

        double maxAverage = 0;
        CricketPlayer maxAveragePlayer = null;

        for (CricketPlayer player : players) {
            double average = player.calculateAverage();
            if (average > maxAverage) {
                maxAverage = average;
                maxAveragePlayer = player;
            }
        }

        System.out.println("Player with maximum average:");
        System.out.println("ID: " + maxAveragePlayer.pid);
        System.out.println("Name: " + maxAveragePlayer.pname);
        System.out.println("Total Runs: " + maxAveragePlayer.totalruns);
        System.out.println("Innings Played: " + maxAveragePlayer.inningsplayed);
        System.out.println("Not Out Times: " + maxAveragePlayer.notouttimes);
        System.out.println("Average: " + maxAverage);
    }
}
