package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if (handSign == "rock") {
            return "paper";
            } else if (handSign == "paper") {
            return "rock";
                } else {return "scissor";}
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign == "rock") {
            return "scissor";
            } else if (handSign == "paper") {
                        return "rock"; }
                            else {return "paper";}
            }



    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "scissor") {
            return "rock";}
                else if (handSignOfPlayer1 == "scissors" && handSignOfPlayer2 == "paper") {
                    return "scissor";}
                        else if (handSignOfPlayer1 == "paper" && handSignOfPlayer2 == "rock") {
                            return "paper";}
                        return null;
    }
}
