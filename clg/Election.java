package clg;
import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        final int numCandidates = 5;
        int[] voteCount = new int[numCandidates];
        int spoiltBallots = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of ballots:");
        int numBallots = scanner.nextInt();

        System.out.println("Enter the ballot votes (candidate numbers 1 to 5):");

        for (int i = 0; i < numBallots; i++) {
            int vote = scanner.nextInt();

            if (vote >= 1 && vote <= 5) {
                voteCount[vote - 1]++;
            } else {
                spoiltBallots++;
            }
        }
        scanner.close();

        System.out.println("Vote count for each candidate:");
        for (int i = 0; i < numCandidates; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + voteCount[i] + " votes");
        }

        System.out.println("Number of spoilt ballots: " + spoiltBallots);
    }
}
