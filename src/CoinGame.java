public class CoinGame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    private int roundTracker = 1; // *** ADDED TO ENABLE TESTING ***

    public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }


    /**
     * Returns the number of coins (1, 2, or 3) that player 1 will spend.
     * NOTE: THIS CODE WAS NOT PROVIDED IN THE FRQ ("implementation not shown")
     * BUT IS INCLUDED HERE TO ENABLE TESTING
     */
    public int getPlayer1Move() {
        int result;
        if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
            result = 2;
        } else if (roundTracker == 3) {
            result = 1;
        } else {
            result = 3;
        }
        roundTracker++;
        return result;
    }


    /**
     * Returns the number of coins (1, 2, or 3) that player 2 will spend,
     * as described in part (a).
     */
    public int getPlayer2Move(int round) {
        if (round % 3 == 0) {
            return 3;
        } else if (round % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }


    /**
     * Plays a simulated game between two players, as described in part
     * (b).
     */
    public void playGame() {
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;

        for (int i = 1; i <= maxRounds && (player1Coins >= 3 && player2Coins >= 3); i++) {
            int player1Move = getPlayer1Move();
            int player2Move = getPlayer2Move(i);
            player1Coins -= player1Move;
            player2Coins -= player2Move;
            if (player1Move == player2Move) {
                player2Coins++;
            } else if (player1Move - player2Move == 1 || player1Move - player2Move == -1) {
                player2Coins++;
            } else if (player1Move - player2Move == 2 || player1Move - player2Move == -2) {
                player1Coins += 2;
            }
        }

        if (player1Coins == player2Coins) {
            System.out.println("tie game");
        } else if (player1Coins > player2Coins) {
            System.out.println("Player 1 Wins!");
        } else {
            System.out.println("Player 2 Wins!");
        }
    }

}
