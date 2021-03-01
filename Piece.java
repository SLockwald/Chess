
public abstract class Piece {
	Piece(PieceColor color, Pos pos) {
		_color = color;
		_pos = pos;
	}

		protected PieceColor _color;
		protected Pos _pos;
		
		Pos getPos() {
			return _pos;

		}
		public abstract void moveTo(Pos newpos, Board b);
		/*{
			b.movePiece(piece this, newpos);
			_pos = newpos;
		}*/

}
