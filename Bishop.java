
public class Bishop extends Piece {
	Bishop(PieceColor color, Pos pos) {
		super(color, pos);
	}
	
	public void moveTo(Pos newpos, Board b) {
		int[] delta = this.getPos().getDelta(newpos);
		int deltax = delta[0];
		int deltay = delta[1];
		
		if (Math.abs(deltax) == Math.abs(deltay)) {
			b.movePiece(this, newpos);
			_pos = newpos;
		}
		
		else {
			System.out.println("Illegal Move");
		}
	}
	
	@Override
	public String toString() {
		String color = _color == PieceColor.WHITE ? "W" : "B";
		String symbol = color + "B";
		return symbol;
	}
}
