package player;

import board.Board;

public interface Player {
    char getSymbol();
    void makeMove(Board board, char symbol);
}
