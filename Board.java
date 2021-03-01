
public class Board {

	public static final int MIN = 0;
	public final static int MAX = 7;
	private static final int DIM = Board.MAX - Board.MIN +1;
	
	void addPiece(Piece piece) {
		Pos pos = piece.getPos();
		_pieces[pos.getx()][pos.gety()] = piece;
		
	}
	
	void movePiece(Piece piece, Pos newpos) {
		_pieces[piece.getPos().getx()][piece.getPos().gety()] = null;
		_pieces[newpos.getx()][newpos.gety()] = piece;
	}
	
	void printBoard() {
		System.out.println("***");
		for (int file = Board.MAX; file >= Board.MIN; file--) {
			for (int rank = Board.MIN; rank <= Board.MAX; rank++) {
				Piece p = _pieces[rank][file];
				if (p==null) {
					System.out.print("---");
				}
				else {
					System.out.print(" " + p.toString() + " ");
				}
				
			}
			System.out.println();
			
		}
	}
	
	public static Piece get(int x, int y) {
		return _pieces[x][y];
	}
	
	private static Piece[][] _pieces = new Piece[DIM][DIM];
}
