package arrays;

public class Arrays {

    public static void main(String[] args) {
        char[][] board = new char[10][10];
        board[0][0] = '.';
        board[1][1] = '.';
        board[2][2] = '.';
        board[3][3] = '.';
        board[4][4] = '.';
        board[5][5] = '@';
        board[5][4] = '@';
        board[6][6] = '.';
        board[7][7] = '.';
        board[8][8] = '.';
        board[9][9] = '.';
        for (int i = 0; i <= board[0].length - 1; i++){
            for (int j = 0; j <= board[1].length - 1; j++) {
                if (j < board[1].length - 1) {
                    if (board[i][j] != '@') {
                        System.out.print(".");
                    } else {
                        System.out.print(board[i][j]);
                    }
                } else {
                    if (board[i][j] != 'x') {
                        System.out.println(".");
                    } else {
                        System.out.println(board[i][j]);
                    }
                }
            }
        }
    }
    
}
