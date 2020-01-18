package sudoko_solver;

public class utility {
	
	public static boolean isSafe_row(int [][] board, int x, int y, int value) {
		for(int i =0; i < board.length; i++) {
			if (board[x][i] == value) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSafe_col(int [][] board, int x , int y, int value) {
		for(int i =0; i < board.length; i++) {
			if (board[i][y] == value) {
				return false;
			}
		}
		return true;
		
	}
	public static boolean isSafe_square(int [][] board, int x, int y, int value) {
	// first determine the square the new value falls into
		int start_row = x - x %3;
		int start_col = y - y%3;
		for(int i = start_row; i < start_row + 3; i++) {
			for(int j = start_col; j < start_col +3; j++ ) {
				if (board[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int[] find_next_empty(int[][] board) {
		// The coordinates of the next empty spot
		int[] temp = { -1 , -1};
		for(int i =0; i< 9;i++) {
			for(int j =0; j< 9;j++) {
				if(board[i][j]==-1) {
					temp[0] = i;
					temp[1] = j;
					return temp;
				}
			}
		}
		return temp;
	}
	
	

}
