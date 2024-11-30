package player;

import board.Board;

public class HardComputerPlayer implements Player {
    private char symbol;

    public HardComputerPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public void makeMove(Board board, char symbol) {
        // Пробуем найти свободную ячейку
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board.isCellEmpty(row, col)) {
                    board.makeMove(row, col, symbol);
                    System.out.println("Компьютер сделал ход в ячейку: (" + row + ", " + col + ")");
                    return;
                }
            }
        }

        throw new IllegalStateException("Нет доступных ячеек для хода.");
    }
}
