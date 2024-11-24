package game;

import board.Board;
import board.TicTacToeBoard;
import display.ConsoleDisplay;
import display.Display;
import player.ComputerPlayer;
import player.HumanPlayer;
import player.Player;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame implements Game {
    private Board board;
    private Display display;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;

    public TicTacToeGame(Scanner scanner) { // Принимаем Scanner
        board = new TicTacToeBoard();
        display = new ConsoleDisplay();
        playerX = new HumanPlayer('X', scanner); // Передаем Scanner игроку
        playerO = new ComputerPlayer('O'); // Для компьютера Scanner не нужен
        setRandomStartingPlayer();
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
