package player;

import board.Board;

public class ComputerPlayer implements Player {
    private char symbol;

    public ComputerPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public void makeMove(Board board, char symbol) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                try {
                    board.makeMove(row, col, symbol);
                    System.out.println("Компьютер сделал ход в ячейку: (" + row + ", " + col + ")");
                    return;
                } catch (IllegalArgumentException ignored) {
                    // Пробуем следующую ячейку
                }
            }
        }
    }
}
