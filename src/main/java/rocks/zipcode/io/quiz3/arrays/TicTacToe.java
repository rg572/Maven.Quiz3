package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] returnArray = {board[0][value],board[1][value],board[2][value]};
        return returnArray;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return row[0].equals(row[1]) && row[1].equals(row[2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] col = getColumn(columnIndex);
        return col[0].equals(col[1]) && col[1].equals(col[2]);
    }

    public String getWinner() {
        for(int i = 0; i < 2; i++){
            if(isRowHomogenous(i) || isColumnHomogeneous(i)){
                return board[i][i];
            }
        }
        if((board[1][1].equals(board[0][0]) && board[1][1].equals(board[2][2])) ||
            board[1][1].equals(board[0][2]) && board[1][1].equals(board[2][0])){
            return board[1][1];
        }
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
