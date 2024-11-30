package board;

public class TicTacToeBoard implements Board {
    private char[][] grid;

    public TicTacToeBoard() {
        grid = new char[3][3];
        reset();
    }

    @Override
    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '*';
            }
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) return true;
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) return true;
        }
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) return true;
        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) return true;
        return false;
    }

    @Override
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == '*') return false;
            }
        }
        return true;
    }

    @Override
    public void makeMove(int row, int col, char symbol) {
        if (grid[row][col] == '*') {
            grid[row][col] = symbol;
        } else {
            throw new IllegalArgumentException("Ячейка занята. Ход невозможен.");
        }
    }

    @Override
    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == '*';
    }
}
