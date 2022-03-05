import java.util.Scanner;

/**
 * Project-01 Baseball Scores
 *
 * This program tells us about the winner, score log and no. of perfect innings in a baseball match based on user input.
 *
 * @author Advit Bhullar
 * @version 09/22/2021
 */
public class BaseballScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter Team One Name:");
        String teamOne = scanner.nextLine();
        System.out.println("Enter Team Two Name:");
        String teamTwo = scanner.nextLine();
        System.out.println("Enter Inning Scores:");
        String scores = scanner.nextLine();


        scanner.close();

        // The scores for each inning are calculated and stored in the variables below.
        int currentScoreIndex = 0;
        int teamOneInningOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));

        currentScoreIndex += 3;
        int teamOneInningTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));

        currentScoreIndex += 3;
        int teamOneInningThree = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningThree = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));

        currentScoreIndex += 3;
        int teamOneInningFour = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningFour = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));

        currentScoreIndex += 3;
        int teamOneInningFive = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningFive = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));

        currentScoreIndex += 3;
        int teamOneInningSix = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningSix = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));

        currentScoreIndex += 3;
        int teamOneInningSeven = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningSeven = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));

        currentScoreIndex += 3;
        int teamOneInningEight = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningEight = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));


        currentScoreIndex += 3;
        int teamOneInningNine = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int teamTwoInningNine = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));


        int teamOneTotalScore = teamOneInningOne + teamOneInningTwo + teamOneInningThree + teamOneInningFour +
                teamOneInningFive + teamOneInningSix + teamOneInningSeven + teamOneInningEight + teamOneInningNine;
        int teamTwoTotalScore = teamTwoInningOne + teamTwoInningTwo + teamTwoInningThree +
                teamTwoInningFour + teamTwoInningFive + teamTwoInningSix +
                teamTwoInningSeven + teamTwoInningEight + teamTwoInningNine;
        int scoreDifferential = Math.abs(teamOneTotalScore - teamTwoTotalScore);

        String inningResultTeamOneInningOne;
        String inningResultTeamTwoInningOne;
        String inningResultTeamOneInningTwo;
        String inningResultTeamTwoInningTwo;
        String inningResultTeamOneInningThree;
        String inningResultTeamTwoInningThree;
        String inningResultTeamOneInningFour;
        String inningResultTeamTwoInningFour;
        String inningResultTeamOneInningFive;
        String inningResultTeamTwoInningFive;
        String inningResultTeamOneInningSix;
        String inningResultTeamTwoInningSix;
        String inningResultTeamOneInningSeven;
        String inningResultTeamTwoInningSeven;
        String inningResultTeamOneInningEight;
        String inningResultTeamTwoInningEight;
        String inningResultTeamOneInningNine;
        String inningResultTeamTwoInningNine;
        int teamOnePerfectInnings = 0;
        int teamTwoPerfectInnings = 0;



        if (teamOneInningOne - teamTwoInningOne > 0) {
            inningResultTeamOneInningOne = "W";
            inningResultTeamTwoInningOne = "L";
        } else if (teamOneInningOne - teamTwoInningOne == 0) {
            inningResultTeamOneInningOne = "T";
            inningResultTeamTwoInningOne = "T";
        } else {
            inningResultTeamOneInningOne = "L";
            inningResultTeamTwoInningOne = "W";
        }
        if (teamOneInningTwo - teamTwoInningTwo > 0) {
            inningResultTeamOneInningTwo = "W";
            inningResultTeamTwoInningTwo = "L";
        } else if (teamOneInningTwo - teamTwoInningTwo == 0) {
            inningResultTeamOneInningTwo = "T";
            inningResultTeamTwoInningTwo = "T";
        } else {
            inningResultTeamOneInningTwo = "L";
            inningResultTeamTwoInningTwo = "W";
        }
        if (teamOneInningThree - teamTwoInningThree > 0) {
            inningResultTeamOneInningThree = "W";
            inningResultTeamTwoInningThree = "L";
        } else if (teamOneInningThree - teamTwoInningThree == 0) {
            inningResultTeamOneInningThree = "T";
            inningResultTeamTwoInningThree = "T";
        } else {
            inningResultTeamOneInningThree = "L";
            inningResultTeamTwoInningThree = "W";
        }
        if (teamOneInningFour - teamTwoInningFour > 0) {
            inningResultTeamOneInningFour = "W";
            inningResultTeamTwoInningFour = "L";
        } else if (teamOneInningFour - teamTwoInningFour == 0) {
            inningResultTeamOneInningFour = "T";
            inningResultTeamTwoInningFour = "T";
        } else {
            inningResultTeamOneInningFour = "L";
            inningResultTeamTwoInningFour = "W";
        }
        if (teamOneInningFive - teamTwoInningFive > 0) {
            inningResultTeamOneInningFive = "W";
            inningResultTeamTwoInningFive = "L";
        } else if (teamOneInningFive - teamTwoInningFive == 0) {
            inningResultTeamOneInningFive = "T";
            inningResultTeamTwoInningFive = "T";
        } else {
            inningResultTeamOneInningFive = "L";
            inningResultTeamTwoInningFive = "W";
        }
        if (teamOneInningSix - teamTwoInningSix > 0) {
            inningResultTeamOneInningSix = "W";
            inningResultTeamTwoInningSix = "L";
        } else if (teamOneInningSix - teamTwoInningSix == 0) {
            inningResultTeamOneInningSix = "T";
            inningResultTeamTwoInningSix = "T";
        } else {
            inningResultTeamOneInningSix = "L";
            inningResultTeamTwoInningSix = "W";
        }
        if (teamOneInningSeven - teamTwoInningSeven > 0) {
            inningResultTeamOneInningSeven = "W";
            inningResultTeamTwoInningSeven = "L";
        } else if (teamOneInningSeven - teamTwoInningSeven == 0) {
            inningResultTeamOneInningSeven = "T";
            inningResultTeamTwoInningSeven = "T";
        } else {
            inningResultTeamOneInningSeven = "L";
            inningResultTeamTwoInningSeven = "W";
        }
        if (teamOneInningEight - teamTwoInningEight > 0) {
            inningResultTeamOneInningEight = "W";
            inningResultTeamTwoInningEight = "L";
        } else if (teamOneInningEight - teamTwoInningEight == 0) {
            inningResultTeamOneInningEight = "T";
            inningResultTeamTwoInningEight = "T";
        } else {
            inningResultTeamOneInningEight = "L";
            inningResultTeamTwoInningEight = "W";
        }
        if (teamOneInningNine - teamTwoInningNine > 0) {
            inningResultTeamOneInningNine = "W";
            inningResultTeamTwoInningNine = "L";
        } else if (teamOneInningNine - teamTwoInningNine == 0) {
            inningResultTeamOneInningNine = "T";
            inningResultTeamTwoInningNine = "T";
        } else {
            inningResultTeamOneInningNine = "L";
            inningResultTeamTwoInningNine = "W";
        }


        if (teamOneTotalScore > teamTwoTotalScore) {
            System.out.printf("The winner is: %s, with a score differential of %d\n", teamOne, scoreDifferential);
        }
        if (teamTwoTotalScore > teamOneTotalScore) {
            System.out.printf("The winner is: %s, with a score differential of %d\n", teamTwo, scoreDifferential);
        }
        System.out.printf("%s scored %d points.\n", teamOne, teamOneTotalScore);
        System.out.printf("%s scored %d points.\n", teamTwo, teamTwoTotalScore);
        System.out.printf("%s Game Log: %s-%s-%s-%s-%s-%s-%s-%s-%s\n", teamOne, inningResultTeamOneInningOne,
                inningResultTeamOneInningTwo, inningResultTeamOneInningThree, inningResultTeamOneInningFour,
                inningResultTeamOneInningFive, inningResultTeamOneInningSix,
                inningResultTeamOneInningSeven, inningResultTeamOneInningEight, inningResultTeamOneInningNine);
        System.out.printf("%s Game Log: %s-%s-%s-%s-%s-%s-%s-%s-%s\n", teamTwo, inningResultTeamTwoInningOne,
                    inningResultTeamTwoInningTwo, inningResultTeamTwoInningThree,
                inningResultTeamTwoInningFour,
                inningResultTeamTwoInningFive, inningResultTeamTwoInningSix, inningResultTeamTwoInningSeven,
                inningResultTeamTwoInningEight, inningResultTeamTwoInningNine);

        if (teamOneInningOne == 0 && teamTwoInningOne >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningOne == 0 && teamOneInningOne >= 1)
            teamTwoPerfectInnings++;
        if (teamOneInningTwo == 0 && teamTwoInningTwo >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningTwo == 0 && teamOneInningTwo >= 1)
            teamTwoPerfectInnings++;
        if (teamOneInningThree == 0 && teamTwoInningThree >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningThree == 0 && teamOneInningThree >= 1)
            teamTwoPerfectInnings++;
        if (teamOneInningFour == 0 && teamTwoInningFour >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningFour == 0 && teamOneInningFour >= 1)
            teamTwoPerfectInnings++;
        if (teamOneInningFive == 0 && teamTwoInningFive >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningFive == 0 && teamOneInningFive >= 1)
            teamTwoPerfectInnings++;
        if (teamOneInningSix == 0 && teamTwoInningSix >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningSix == 0 && teamOneInningSix >= 1)
            teamTwoPerfectInnings++;
        if (teamOneInningSeven == 0 && teamTwoInningSeven >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningSeven == 0 && teamOneInningSeven >= 1)
            teamTwoPerfectInnings++;
        if (teamOneInningEight == 0 && teamTwoInningEight >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningEight == 0 && teamOneInningEight >= 1)
            teamTwoPerfectInnings++;
        if (teamOneInningNine == 0 && teamTwoInningNine >= 1)
            teamOnePerfectInnings++;
        if (teamTwoInningNine == 0 && teamOneInningNine >= 1)
            teamTwoPerfectInnings++;

        System.out.printf("%s Perfect Innings: %d\n", teamOne, teamTwoPerfectInnings );
        System.out.printf("%s Perfect Innings: %d\n", teamTwo, teamOnePerfectInnings );

    }
}

