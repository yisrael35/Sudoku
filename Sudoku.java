import java.util.Arrays;
import java.util.Random;


/*yisrael bar 22/09/20202 */


public class Sudoku {
	final int defulatSize = 9;
	int [][] board;
	int size;
	int boxSize;
	int counterr ;

	//empty Contractor
	public Sudoku() {
		board = new int [defulatSize][defulatSize];
		this.boxSize = (int) Math.sqrt(defulatSize);
		this.size = defulatSize;
				Init();
		counterr = 0;
		//		solveBoard(copyTheArray());
		//		solveBoard();
	}


	private void Init() {


		//0
		board[0][0] = 5;
		board[0][1] = 3;
		board[0][2] = 4;
		board[0][3] = 6;
		board[0][4] = 7;
		board[0][5] = 8;
		board[0][6] = 9;
		board[0][7] = 1;
		board[0][8] = 2;
		//1
		board[1][0] = 6;
		board[1][1] = 7;
		board[1][2] = 2;
		board[1][3] = 1;
		board[1][4] = 9;
		board[1][5] = 5;
		board[1][6] = 3;
		board[1][7] = 4;
		board[1][8] = 8;
		//2
		board[2][0] = 1;
		board[2][1] = 9;
		board[2][2] = 8;
		board[2][3] = 3;
		board[2][4] = 4;
		board[2][5] = 2;
		board[2][6] = 5;
		board[2][7] = 6;
		board[2][8] = 7;
		//3
		board[3][0] = 8;
		board[3][1] = 5;
		board[3][2] = 9;
		board[3][3] = 7;
		board[3][4] = 6;
		board[3][5] = 1;
		board[3][6] = 4;
		board[3][7] = 2;
		board[3][8] = 3;
		//4
		board[4][0] = 4;
		board[4][1] = 2;
		board[4][2] = 6;
		board[4][3] = 8;
		board[4][4] = 5;
		board[4][5] = 3;
		board[4][6] = 7;
		board[4][7] = 9;
		board[4][8] = 1;
		//5
		board[5][0] = 7;
		board[5][1] = 1;
		board[5][2] = 3;
		board[5][3] = 9;
		board[5][4] = 2;
		board[5][5] = 4;
		board[5][6] = 8;
		board[5][7] = 5;
		board[5][8] = 6;
		//6
		board[6][0] = 9;
		board[6][1] = 6;
		board[6][2] = 1;
		board[6][3] = 5;
		board[6][4] = 3;
		board[6][5] = 7;
		board[6][6] = 2;
		board[6][7] = 8;
		board[6][8] = 4;
		//7
		board[7][0] = 2;
		board[7][1] = 8;
		board[7][2] = 7;
		board[7][3] = 4;
		board[7][4] = 1;
		board[7][5] = 9;
		board[7][6] = 6;
		board[7][7] = 3;
		board[7][8] = 5;
		//8
		board[8][0] = 3;
		board[8][1] = 4;
		board[8][2] = 5;
		board[8][3] = 2;
		board[8][4] = 8;
		board[8][5] = 6;
		board[8][6] = 1;
		board[8][7] = 7;
		board[8][8] = 9;

	}
	private void Init1() {


		//0
		board[0][0] = 5;
		board[0][1] = 3;
		//		board[0][2] = 4;
		//		board[0][3] = 6;
		board[0][4] = 7;
		//		board[0][5] = 8;
		//		board[0][6] = 9;
		//		board[0][7] = 1;
		//		board[0][8] = 2;
		//1
		board[1][0] = 6;
		//		board[1][1] = 7;
		//		board[1][2] = 2;
		board[1][3] = 1;
		board[1][4] = 9;
		board[1][5] = 5;
		//		board[1][6] = 3;
		//		board[1][7] = 4;
		//		board[1][8] = 8;
		//2
		//		board[2][0] = 1;
		board[2][1] = 9;
		board[2][2] = 8;
		//		board[2][3] = 3;
		//		board[2][4] = 4;
		//		board[2][5] = 2;
		//		board[2][6] = 5;
		board[2][7] = 6;
		//		board[2][8] = 7;
		//3
		board[3][0] = 8;
		//		board[3][1] = 5;
		//		board[3][2] = 9;
		//		board[3][3] = 7;
		board[3][4] = 6;
		//		board[3][5] = 1;
		//		board[3][6] = 4;
		//		board[3][7] = 2;
		board[3][8] = 3;
		//4
		board[4][0] = 4;
		//		board[4][1] = 2;
		//		board[4][2] = 6;
		board[4][3] = 8;
		//		board[4][4] = 5;
		board[4][5] = 3;
		//		board[4][6] = 7;
		//		board[4][7] = 9;
		board[4][8] = 1;
		//5
		board[5][0] = 7;
		//		board[5][1] = 1;
		//		board[5][2] = 3;
		//		board[5][3] = 9;
		board[5][4] = 2;
		//		board[5][5] = 4;
		//		board[5][6] = 8;
		//		board[5][7] = 5;
		board[5][8] = 6;
		//6
		//		board[6][0] = 9;
		board[6][1] = 6;
		//		board[6][2] = 1;
		//		board[6][3] = 5;
		//		board[6][4] = 3;
		//		board[6][5] = 7;
		board[6][6] = 2;
		board[6][7] = 8;
		//		board[6][8] = 4;
		//7
		//		board[7][0] = 2;
		//		board[7][1] = 8;
		//		board[7][2] = 7;
		board[7][3] = 4;
		board[7][4] = 1;
		board[7][5] = 9;
		//		board[7][6] = 6;
		//		board[7][7] = 3;
		board[7][8] = 5;
		//8
		//		board[8][0] = 3;
		//		board[8][1] = 4;
		//		board[8][2] = 5;
		//		board[8][3] = 2;
		board[8][4] = 8;
		//		board[8][5] = 6;
		//		board[8][6] = 1;
		board[8][7] = 7;
		board[8][8] = 9;

	}

	private void Init2() {


		//0
		//		board[0][0] = 9;
		board[0][1] = 2;
		//		board[0][2] = 4;
		board[0][3] = 8;
		//		board[0][4] = 5;
		//		board[0][5] = 4;
		//		board[0][6] = 9;
		//		board[0][7] = 1;
		//		board[0][8] = 2;
		//1
		//		board[1][0] = 3;
		//		board[1][1] = 5;
		//		board[1][2] = 7;
		//		board[1][3] = 1;
		//		board[1][4] = 9;
		//		board[1][5] = 5;
		//		board[1][6] = 3;
		//		board[1][7] = 6;
		board[1][8] = 4;
		//2
		//		board[2][0] = 4;
		board[2][1] = 9;
		board[2][2] = 4;
		//				board[2][3] = 8;
		//				board[2][4] = 7;
		//				board[2][5] = 3;
		//		board[2][6] = 5;
		//		board[2][7] = 6;
		board[2][8] = 7;
		//3
		//		board[3][0] = 7;
		//				board[3][1] = 8;
		//		board[3][2] = 9;
		//		board[3][3] = 3;
		board[3][4] = 6;
		board[3][5] = 8;
		board[3][6] = 4;
		//				board[3][7] = 1;
		//		board[3][8] = 3;
		//4
		//		board[4][0] = 4;
		//		board[4][1] = 2;
		//				board[4][2] = 2;
		//		board[4][3] = 8;
		//				board[4][4] = 1;
		board[4][5] = 3;
		//		board[4][6] = 7;
		board[4][7] = 1;
		//		board[4][8] = 1;
		//5
		board[5][0] = 9;
		//				board[5][1] = 9;
		board[5][2] = 2;
		board[5][3] = 1;
		//		board[5][4] = 2;
		//		board[5][5] = 4;
		board[5][6] = 7;
		board[5][7] = 3;
		//		board[5][8] = 6;
		//6
		//				board[6][0] = 9;
		//		board[6][1] = 6;
		//		board[6][2] = 1;
		//		board[6][3] = 5;
		//		board[6][4] = 3;
		//				board[6][5] = 9;
		//		board[6][6] = 2;
		board[6][7] = 9;
		board[6][8] = 3;
		//7
		//		board[7][0] = 2;
		//		board[7][1] = 8;
		//		board[7][2] = 7;
		board[7][3] = 6;
		//		board[7][4] = 1;
		//		board[7][5] = 9;
		board[7][6] = 2;
		//		board[7][7] = 3;
		board[7][8] = 1;
		//8
		board[8][0] = 1;
		//		board[8][1] = 4;
		board[8][2] = 3;
		board[8][3] = 4;
		//		board[8][4] = 8;
		//		board[8][5] = 9;
		//		board[8][6] = 1;
		//		board[8][7] = 2;
		//		board[8][8] = 9;

	}

	//Contractor
	public Sudoku(int size) {
		counterr =0;
		board = new int [size][size];
		this.boxSize = (int) Math.sqrt(size);
		this.size = size;
	}
	//put a number on the board
	public void updateBoard(int i , int j, int num) {
		if (isAllowed(i,j,num)) {
			board[i][j] = num;
		}
	}
	//check if the number you want to put on the board is allowed
	private boolean isAllowed(int i , int j, int num) {
		if (num > size) {
			return false;
		}
		//check the row and the col if the number already exist
		for (int k = 0; k < board.length; k++) {
			if (board[i][k] == num || board[k][j] == num) {
				return false;
			}
		}
		//check the box if the number already exist
		int row = 0;
		int col = 0;
		//
		if (i < 3  && i >= 0 ) {
			row = 0;
		}
		if (i < 6  && i >= 3 ) {
			row = 3;
		}
		if (i < 9  && i >= 6 ) {
			row = 6;
		}
		if (j < 3  && j >= 0 ) {
			col = 0;
		}
		if (j < 6  && j >= 3 ) {
			col = 3;
		}
		if (j < 9  && j >= 6 ) {
			col = 6;
		}

		for (int k = 0; k < boxSize; k++) {
			for (int k2 = 0; k2 < boxSize; k2++) {
				if (board[k+row][k2+col] == num) {
					return false;
				}
			}
		}

		return true;
	}
	private boolean isAllowed(int i , int j, int num,int [][] board) {
		if (num > size) {
			return false;
		}
		//check the row and the col if the number already exist
		for (int k = 0; k < board.length; k++) {
			if (board[i][k] == num || board[k][j] == num) {
				return false;
			}
		}
		//check the box if the number already exist
		int row = 0;
		int col = 0;
		//
		if (i < 3  && i >= 0 ) {
			row = 0;
		}
		if (i < 6  && i >= 3 ) {
			row = 3;
		}
		if (i < 9  && i >= 6 ) {
			row = 6;
		}
		if (j < 3  && j >= 0 ) {
			col = 0;
		}
		if (j < 6  && j >= 3 ) {
			col = 3;
		}
		if (j < 9  && j >= 6 ) {
			col = 6;
		}


		for (int k = 0; k < boxSize; k++) {
			for (int k2 = 0; k2 < boxSize; k2++) {
				if (board[k+row][k2+col] == num) {

					return false;
				}
			}
		}

		return true;
	}
	public void printBoard() {
		System.out.println();
		System.out.println("|-----------------------------|");

		for (int i = 0; i < board.length; i++) {
			if (i%boxSize==0 && i!=0) {
				System.out.println("|---------+---------+---------|");
			}
			for (int j = 0; j < board.length; j++) {
				if (j%boxSize==0 ) {
					System.out.print("|");
				}
				if (board[i][j] == 0) {
					System.out.print("' '");
				}else System.out.print("'"+board[i][j]+"'");
			}
			System.out.print("|");
			System.out.println();


		}
		System.out.println("|-----------------------------|");



		//		for (int i = 0; i < board.length; i++) {
		//
		//
		//			System.out.println(Arrays.toString(this.board[i]));
		//		}

	}
	private void printBoard(int [][] board) {
		System.out.println();
		System.out.println("|-----------------------------|");

		for (int i = 0; i < board.length; i++) {
			if (i%boxSize==0 && i!=0) {
				System.out.println("|---------+---------+---------|");
			}
			for (int j = 0; j < board.length; j++) {
				if (j%boxSize==0 ) {
					System.out.print("|");
				}
				if (board[i][j] == 0) {
					System.out.print("' '");
				}else System.out.print("'"+board[i][j]+"'");
			}
			System.out.print("|");
			System.out.println();


		}
		System.out.println("|-----------------------------|");



		//		for (int i = 0; i < board.length; i++) {
		//
		//
		//			System.out.println(Arrays.toString(this.board[i]));
		//		}

	}


	public boolean solveBoard (int [][] board1) {

		if (placesAvilable(board1)) {
			if (solveBoardHelper( board1)) {

				printBoard(board1);
				System.out.println("found!!");
				return true;
			}
		}else return winCheck(board1);
		return false;
	}
	public boolean solveBoard () {

		if (placesAvilable(this.board)) {
			if (solveBoardHelper( board)) {
				System.out.println("found!!");
				//				printBoard(board);
				//				System.out.println(winCheck(board));
				return true;
			}
		}else return winCheck(board);
		return false;
	}	



	private boolean solveBoardHelper( int [][] board1) {
		//		printBoard(board1);
		if (counterr >= Integer.MAX_VALUE-2) {
			System.out.println("it's too far");
			return false;
		}
		counterr++;
		//		System.out.println(counterr);
		if (!placesAvilable(board1)) {
			return winCheck(board1);
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (board1[i][j] == 0) {

					boolean [] rowCheck = new boolean[size];
					boolean [] colCheck = new boolean[size];
					boolean [] boxCheck = new boolean[size];

					for (int k = 0; k < size; k++) {
						if (board1[i][k] != 0) {				
							rowCheck[board1[i][k]-1] = true;
						}
					}
					for (int k = 0; k < size; k++) {
						if (board1[k][j] != 0) {				
							colCheck[board1[k][j]-1] = true;
						}
					}
					int row = 0;
					int col = 0;
					//
					if (i < 3  && i >= 0 ) {
						row = 0;
					}
					if (i < 6  && i >= 3 ) {
						row = 3;
					}
					if (i < 9  && i >= 6 ) {
						row = 6;
					}
					if (j < 3  && j >= 0 ) {
						col = 0;
					}
					if (j < 6  && j >= 3 ) {
						col = 3;
					}
					if (j < 9  && j >= 6 ) {
						col = 6;
					}

					for (int k = 0; k < boxSize; k++) {
						for (int k2 = 0; k2 < boxSize; k2++) {
							if (board[k+row][k2+col] != 0) {
								boxCheck[board[k+row][k2+col]-1] = true;
							}
						}
					}
					int counter = 0 ;
					int index = 0;
					for (int k = 0; k < size; k++) {
						if (!boxCheck[k] && !rowCheck[k] && !colCheck[k]) {
							counter++;
							index = k + 1;
						}
					}
					if (counter == 0) {
						return false;
					}
					else {

						for (int k = 0; k < size; k++) {							
							if (!boxCheck[k] && !rowCheck[k] && !colCheck[k]) {

								if(isAllowed(i, j, k + 1, board1))
								{
									board1[i][j] = k + 1;

									if(solveBoardHelper(board1)) {
										return true;
									}else board1[i][j] = 0;
								}
							}
						}
						if (board1[i][j] == 0) {
							return false;
						}

					}
				}

			}

		}
		System.out.println("im here"+ winCheck(board1));
		return winCheck(board1);



	}

	public boolean winCheck() {
		boolean [] rowCheck= new boolean[size];
		for (int i = 0; i < rowCheck.length; i++) {
			rowCheck[i] = false;
		}
		//check all the rows if there is the numbers 1 to size
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != 0) {

					rowCheck[board[i][j]-1]=true;
				}else return false;
			}
			//check if all numbers in the row is from 1 to size
			for (int j = 0; j < rowCheck.length; j++) {
				if (rowCheck[j] == false) {
					return false;
				}else rowCheck[j]=false;
			}

		}
		//check all the cols if there is the numbers 1 to size
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][i]!=0) {
					rowCheck[board[j][i]-1]=true;
				}else return false;
			}
			//check if all numbers in the col is from 1 to size
			for (int j = 0; j < rowCheck.length; j++) {
				if (rowCheck[j] == false) {
					return false;
				}else rowCheck[j]=false;
			}

		}
		//check all the boxs
		for (int i = 0; i < board.length; i++) {
			int row=0;
			int col=0;
			switch (i) {
			case 1:
				row = 0;
				col = 0;
				break;
			case 2:
				row = 0;
				col = 3;
				break;
			case 3:
				row = 0;
				col = 6;
				break;
			case 4:
				row = 3;
				col = 0;
				break;
			case 5:
				row = 3;
				col = 3;
				break;
			case 6:
				row = 3;
				col = 6;
				break;
			case 7:
				row = 6;
				col = 0;
				break;
			case 8:
				row = 6;
				col = 3;
				break;
			case 9:
				row = 6;
				col = 6;
				break;
			default:
				break;
			}

			for (int j = 0; j < boxSize; j++) {
				for (int j2 = 0; j2 < boxSize; j2++) {
					if (board[j+row][j2+col] != 0) {
						rowCheck[board[j+row][j2+col]-1] = true;
					}else return false;

				}
			}
			//check if all numbers in the box's is from 1 to size
			for (int j = 0; j < rowCheck.length; j++) {
				if (rowCheck[j] == false) {
					return false;
				}else rowCheck[j]=false;
			}
		}


		return true;
	}

	private int  [][] copyTheArray() {
		int [][] board1 = new int [defulatSize][defulatSize];
		for (int i = 0; i < board1.length; i++) {
			for (int j = 0; j < board1.length; j++) {
				board1[i][j] = board [i][j];
			}
		}
		return board1;
	}

	private boolean placesAvilable(int [][]board1) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (board1[i][j]==0) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean winCheck(int [][] board) {
		boolean [] rowCheck= new boolean[size];
		for (int i = 0; i < rowCheck.length; i++) {
			rowCheck[i] = false;
		}
		//check all the rows if there is the numbers 1 to size
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] != 0) {

					rowCheck[board[i][j]-1]=true;
				}else return false;
			}
			//check if all numbers in the row is from 1 to size
			for (int j = 0; j < rowCheck.length; j++) {
				if (rowCheck[j] == false) {
					return false;
				}else rowCheck[j]=false;
			}

		}
		//check all the cols if there is the numbers 1 to size
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][i]!=0) {
					rowCheck[board[j][i]-1]=true;
				}else return false;
			}
			//check if all numbers in the col is from 1 to size
			for (int j = 0; j < rowCheck.length; j++) {
				if (rowCheck[j] == false) {
					return false;
				}else rowCheck[j]=false;
			}

		}
		//check all the boxs
		for (int i = 0; i < board.length; i++) {
			int row=0;
			int col=0;
			switch (i) {
			case 1:
				row = 0;
				col = 0;
				break;
			case 2:
				row = 0;
				col = 3;
				break;
			case 3:
				row = 0;
				col = 6;
				break;
			case 4:
				row = 3;
				col = 0;
				break;
			case 5:
				row = 3;
				col = 3;
				break;
			case 6:
				row = 3;
				col = 6;
				break;
			case 7:
				row = 6;
				col = 0;
				break;
			case 8:
				row = 6;
				col = 3;
				break;
			case 9:
				row = 6;
				col = 6;
				break;
			default:
				break;
			}

			for (int j = 0; j < boxSize; j++) {
				for (int j2 = 0; j2 < boxSize; j2++) {
					if (board[j+row][j2+col] != 0) {
						rowCheck[board[j+row][j2+col]-1] = true;
					}else return false;

				}
			}
			//check if all numbers in the box's is from 1 to size
			for (int j = 0; j < rowCheck.length; j++) {
				if (rowCheck[j] == false) {
					return false;
				}else rowCheck[j]=false;
			}
		}


		return true;
	}

	public void generateABoard (int difficultyLevel) {
//		cleanBoard();
//		solveBoard();
		Random rand = new Random(); 

		// Generate random integers in range 0 to 8
		switch (difficultyLevel) {
		case 1:
			for (int i = 0; i < 100; i++) {
				int rand_int1 = rand.nextInt(9); 
				int rand_int2 = rand.nextInt(9); 
				board[rand_int1][rand_int2] = 0;
			}

			break;
		case 2:
			for (int i = 0; i < 150; i++) {
				int rand_int1 = rand.nextInt(9); 
				int rand_int2 = rand.nextInt(9); 
				board[rand_int1][rand_int2] = 0;
			}
			break;
		case 3:
			for (int i = 0; i < 170; i++) {
				int rand_int1 = rand.nextInt(9); 
				int rand_int2 = rand.nextInt(9); 
				board[rand_int1][rand_int2] = 0;
			}

			break;
		default:
			break;
		}
	}
	private void cleanBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				this.board[i][j] = 0;
			}
		}
	}

}
