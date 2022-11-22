public class Runner {
    public static void main(String[] args) {
        FRQClass frq = new FRQClass();

        CoinGame game1 = new CoinGame(10, 5);
        game1.playGame();  // should print: tie game

        CoinGame game2 = new CoinGame(10, 4);
        game2.playGame(); // should print: tie game

        CoinGame game3 = new CoinGame(10, 3);
        game3.playGame(); // should print: player 1 wins

        CoinGame game4 = new CoinGame(10, 2);
        game4.playGame(); // should print: player 2 wins

        CoinGame game5 = new CoinGame(10, 6);
        game5.playGame(); // should print: player 2 wins

        CoinGame game6 = new CoinGame(5, 4);
        game6.playGame(); // should print: player 2 wins

        CoinGame game7 = new CoinGame(7, 4);
        game7.playGame(); // should print: tie game

    }
}
