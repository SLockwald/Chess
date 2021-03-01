
public class Pos {
public Pos(int x, int y) throws Exception {
		
		if ((x >= Board.MIN) && (x <= Board.MAX)) {
			_x = x;
		}
		--y;
		
		if ((y >= Board.MIN) && (y <= Board.MAX)) {
			_y = y;
		}
		if ((x < 0) || (y < 0)) {
			throw new Exception("Illegal Position value. Must be 1-8");
		}
	}
	
	public Pos(char rank, int file) throws Exception {
		this((int)rank - 'a', file);
	}
	
	public int getx() { 
		return _x; 
	}
	
	public int gety() { 
		return _y; 
	}
	
	public int[] getDelta(Pos p) {
		int deltax = p._x - this._x;
		int deltay = p._y - this._y;
		return new int[] {deltax, deltay};
	}
	
	private int _x = -1;
	private int _y = -1;
}

