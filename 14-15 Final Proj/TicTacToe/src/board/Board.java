package board;

public interface Board {
    void reset();
    void display();
    boolean checkWin(char symbol);
    boolean isFull();
    void makeMove(int row, int col, char symbol);

    // Новый метод для проверки, пуста ли ячейка
    boolean isCellEmpty(int row, int col);
}
