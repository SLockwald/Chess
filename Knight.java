
public class Knight extends Piece{
	Knight(PieceColor color, Pos pos) {
		super(color, pos);
	}
	
	@Override
	public void moveTo(Pos newpos, Board b) {
		int[] delta = this.getPos().getDelta(newpos);
		int deltax = delta[0];
		int deltay = delta[1];
		
		if ((Math.abs(deltax) == 1 && Math.abs(deltay) == 2) || (Math.abs(deltax) == 2 && Math.abs(deltay) == 1)) {
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
		String symbol = color + "N";
		return symbol;
	}
}
