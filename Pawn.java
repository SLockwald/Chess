
public class Pawn extends Piece {
	Pawn(PieceColor color, Pos pos) {
		super(color, pos);
	}
	
	@Override
	public void moveTo(Pos newpos, Board b) {
		int[] delta = this.getPos().getDelta(newpos);
		int deltax = delta[0];
		int deltay = delta[1];
		
		/**if (Pos.gety() == 2 || Pos.gety() == 7) {
			
		}*/
		
		if (deltax >= 1) {
			if (Board.get(deltax, deltay) == null) {
				System.out.println("Illegal Move");
			}
			
			if (Board.get(deltax, deltay) != null) {
				String col = Board.get(deltax, deltay).toString();
				if (col.contains("W")) {
					col = "WHITE";
				}
				else {
					col = "BLACK";
				}
				if (col != _color.toString()) {
					b.movePiece(this, newpos);
					_pos = newpos;
				}
				else {
					System.out.println("Illegal Move");
				}
			}	
		}
		
		else {
			if (_color == PieceColor.BLACK && deltay == -1) {
			b.movePiece(this, newpos);
			_pos = newpos;
			}
			if (_color == PieceColor.WHITE && deltay == 1) {
			b.movePiece(this, newpos);
			_pos = newpos;
			}
			
			else {
				System.out.println("Illegal Move");
		}
		}
	}
	
	@Override
	public String toString() {
		String color = _color == PieceColor.WHITE ? "W" : "B";
		String symbol = color + "P";
		return symbol;
	}

}
