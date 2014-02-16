package behavioral.template;

public abstract class Game {

    protected int playersCount;
    protected abstract void initializeGame();
    protected abstract void makePlay(int player);
    protected abstract boolean endOfGame();
    protected abstract void printWinner();
 
    /* A template method : */
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()) {
            makePlay(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }
}
