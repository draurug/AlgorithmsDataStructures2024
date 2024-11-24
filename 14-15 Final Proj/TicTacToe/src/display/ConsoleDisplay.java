package display;

import board.Board;

public class ConsoleDisplay implements Display {
    @Override
    public void showBoard(Board board) {
        board.display();
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
