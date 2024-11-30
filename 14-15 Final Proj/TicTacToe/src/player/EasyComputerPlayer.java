package player;

import board.Board;

public class EasyComputerPlayer implements Player {
    private char symbol;

    public EasyComputerPlayer(char symbol) {
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
                if (board.isCellEmpty(row, col)) {
                    board.makeMove(row, col, symbol);
                    System.out.println("Easy Computer сделал ход в ячейку: (" + row + ", " + col + ")");
                    return;
                }
            }
        }
    }
}
