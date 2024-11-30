import board.TicTacToeBoard;
import display.ConsoleDisplay;
import game.TicTacToeGame;
import player.EasyComputerPlayer;
import player.HardComputerPlayer;
import player.HumanPlayer;
import player.Player;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToeBoard board = new TicTacToeBoard();
        ConsoleDisplay display = new ConsoleDisplay();

        System.out.println("Выберите режим игры:");
        System.out.println("1. Игрок против Компьютера");
        System.out.println("2. Компьютер против Компьютера");
        int choice = scanner.nextInt();

        Player playerX;
        Player playerO;

        if (choice == 1) {
            // Игрок против компьютера
            playerX = new HumanPlayer('X', scanner);
            System.out.println("Выберите сложность для Компьютера O:");
            playerO = chooseComputerPlayer('O', scanner);
        } else {
            // Компьютер против компьютера
            System.out.println("Выберите сложность для Компьютера X:");
            playerX = chooseComputerPlayer('X', scanner);
            System.out.println("Выберите сложность для Компьютера O:");
            playerO = chooseComputerPlayer('O', scanner);
        }

        TicTacToeGame game = new TicTacToeGame(board, display, playerX, playerO);
        game.startGame();

        scanner.close();
    }

    private static Player chooseComputerPlayer(char symbol, Scanner scanner) {
        System.out.println("1. Легкий уровень");
        System.out.println("2. Сложный уровень");
        int difficulty = scanner.nextInt();

        if (difficulty == 2) {
            return new HardComputerPlayer(symbol);
        } else {
            return new EasyComputerPlayer(symbol);
        }
    }
}
