import game.TicTacToeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем Scanner один раз
        TicTacToeGame game = new TicTacToeGame(scanner); // Передаем Scanner в игру
        game.startGame();
        scanner.close(); // Закрываем Scanner в конце программы
    }
}
