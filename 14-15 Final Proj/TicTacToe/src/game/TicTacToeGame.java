package game;

import board.Board;
import display.Display;
import player.Player;

import java.util.Random;

public class TicTacToeGame implements Game {
    private Board board;
    private Display display;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;

    public TicTacToeGame(Board board, Display display, Player playerX, Player playerO) {
        this.board = board;       // Доска передаётся извне
        this.display = display;   // Отображение передаётся извне
        this.playerX = playerX;   // Игрок X передаётся извне
        this.playerO = playerO;   // Игрок O передаётся извне
        setRandomStartingPlayer(); // Устанавливаем случайного игрока
    }

    @Override
    public void startGame() {
        board.reset();
        display.showBoard(board);

        while (true) {
            display.showMessage("Ход игрока " + currentPlayer.getSymbol());
            currentPlayer.makeMove(board, currentPlayer.getSymbol());
            display.showBoard(board);

            if (board.checkWin(currentPlayer.getSymbol())) {
                display.showMessage("Игрок " + currentPlayer.getSymbol() + " победил!");
                break;
            }

            if (board.isFull()) {
                display.showMessage("Ничья!");
                break;
            }

            switchPlayer();
        }
    }

    @Override
    public void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    @Override
    public void setRandomStartingPlayer() {
        currentPlayer = new Random().nextBoolean() ? playerX : playerO;
    }
}
