
public class Queen extends Piece {
	Queen(PieceColor color, Pos pos) {
		super(color, pos);
		}
			
	@Override
	public void moveTo(Pos newpos, Board b) {
		int[] delta = this.getPos().getDelta(newpos);
		int deltax = delta[0];
		int deltay = delta[1];
		
		if ((Math.abs(deltax) == Math.abs(deltay)) || (deltax == this.getPos().getx() || deltay == this.getPos().gety())) {
			
			for 
			
			b.movePiece(this, newpos); //this moves the piece
			_pos = newpos; //this moves the piece on the board
		}
		else {
			System.out.println("Illegal Move");
		}
	}
	
	@Override
	public String toString() {
		String color = _color == PieceColor.WHITE ? "W" : "B";
		String symbol = color + "Q";
		return symbol;
	}
}
