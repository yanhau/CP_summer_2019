import java.util.Scanner;

public class Homework_2 {
    public static int row, col;
    public static Scanner scan = new Scanner(System.in);
    public static char[][] board = new char[3][3];
    public static char turn = 'O';

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }

        Game();

    }

    public static void Game() {
        boolean playing = true;
        PrintBoard();
        while(playing) {
            row = scan.nextInt() - 1;
            col = scan.nextInt() - 1;
            board[row][col] = turn;
            if (EndGame(row, col)) {
                playing = false;
                System.out.println("Game has Ended " + turn + " wins");

            }
            PrintBoard();

            if (turn == 'O')
                turn = 'X';
            else
                turn = 'O';
        }

    }

    public static void PrintBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " | ");
            }
        }
        System.out.println();
    }

    public static boolean EndGame(int rowMove, int colMove) {
        if (board[0][colMove] == board[1][colMove]
                && board[0][colMove] == board[2][colMove])
            return true;
        if (board[rowMove][0] == board[rowMove][1]
                && board[rowMove][0] == board[rowMove][2])
            return true;
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
                && board[1][1] != '_')
            return true;
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]
                && board[1][1] != '_')
            return true;
        return false;
    }
}
