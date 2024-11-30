package player;

import board.Board;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private char symbol;
    private Scanner scanner;

    public HumanPlayer(char symbol, Scanner scanner) { // Принимаем Scanner
        this.symbol = symbol;
        this.scanner = scanner;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public void makeMove(Board board, char symbol) {
        int row, col;

        while (true) {
            try {
                System.out.println("Введите строку (0-2) и столбец (0-2):1 ");
                row = scanner.nextInt();
                col = scanner.nextInt();
                board.makeMove(row, col, symbol);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Попробуйте снова.");
                scanner.nextLine(); // Сбрасываем некорректный ввод
            }
        }
    }
}
