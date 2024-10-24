import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

class CricketPlayer {
    String name;
    int noOfInnings;
    int noOfTimesNotOut;
    int totalRuns;

    // Constructor
    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
    }

    // Static method to calculate batting average
    public static double avg(int totalRuns, int noOfInnings) {
        return noOfInnings > 0 ? (double) totalRuns / noOfInnings : 0;
    }

    // Get the batting average for the current player
    public double getBattingAverage() {
        return avg(totalRuns, noOfInnings);
    }

    // Static method to sort players by their batting average
    public static void sortPlayersByAverage(CricketPlayer[] players) {
        Arrays.sort(players, (a, b) -> Double.compare(b.getBattingAverage(), a.getBattingAverage()));
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Innings: %d, Not Out: %d, Total Runs: %d, Batting Avg: %.2f",
                name, noOfInnings, noOfTimesNotOut, totalRuns, getBattingAverage());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = scanner.nextInt();
        CricketPlayer[] players = new CricketPlayer[n];

        // Input player details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name, innings, not out, and total runs for player " + (i + 1) + ": ");
            String name = scanner.next();
            int innings = scanner.nextInt();
            int notOut = scanner.nextInt();
            int totalRuns = scanner.nextInt();
            players[i] = new CricketPlayer(name, innings, notOut, totalRuns);
        }

        // Sort players by batting average
        CricketPlayer.sortPlayersByAverage(players);

        // Display sorted players
        System.out.println("\nPlayers sorted by batting average:");
        for (CricketPlayer player : players) {
            System.out.println(player);
        }

        scanner.close();
    }
}

// javac s2q2.java
// java Main


