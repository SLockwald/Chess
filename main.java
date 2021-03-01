import java.util.*;

public class main {

	public static void main(String[] args) throws Exception {
		// Game game = new Game();
		//game.start();
		
		
		Board gameboard = new Board();
		gameboard.printBoard();
		
		ArrayList<Piece> whiteArmy = new ArrayList<>();
		ArrayList<Piece> blackArmy = new ArrayList<>();
		
		Pos wp = new Pos('e', 1);
		King wk = new King(PieceColor.WHITE, wp);
		gameboard.addPiece(wk);
		whiteArmy.add(wk);
		
		Pos bp = new Pos('e', 8);
		King bk = new King(PieceColor.BLACK, bp);
		gameboard.addPiece(bk);
		blackArmy.add(bk);
		
		//gameboard.printBoard();
		//bk.moveTo(new Pos('e', 7), gameboard);
		//blackArmy.get(0).moveTo(new Pos('e', 7), gameboard);
		
		Pos newpos = new Pos('f', 2);		
		/**wk.moveTo(newpos, gameboard);
		gameboard.printBoard();*/
		
		wp = new Pos('c', 1);
		Bishop wb1 = new Bishop(PieceColor.WHITE, wp);
		gameboard.addPiece(wb1);
		whiteArmy.add(wb1);
		//gameboard.printBoard();
		
		/**wb1.moveTo(new Pos('d', 2), gameboard);
		gameboard.printBoard();*/
		
		wp = new Pos('f', 1);
		Bishop wb2 = new Bishop(PieceColor.WHITE, wp);
		gameboard.addPiece(wb2);
		whiteArmy.add(wb2);
		//gameboard.printBoard();
		
		/**wb2.moveTo(new Pos('e', 2), gameboard);
		gameboard.printBoard();*/
		
		bp = new Pos('c', 8);
		Bishop bb1 = new Bishop(PieceColor.BLACK, bp);
		gameboard.addPiece(bb1);
		blackArmy.add(bb1);
		//gameboard.printBoard();
		
		/**bb1.moveTo(new Pos('d', 7), gameboard);
		gameboard.printBoard();*/
		
		bp = new Pos('f', 8);
		Bishop bb2 = new Bishop(PieceColor.BLACK, bp);
		gameboard.addPiece(bb2);
		blackArmy.add(bb2);
		//gameboard.printBoard();
		
		/**bb2.moveTo(new Pos('d', 7), gameboard);
		gameboard.printBoard();*/
		
		wp = new Pos('a', 1);
		Rook wr1 = new Rook(PieceColor.WHITE, wp);
		gameboard.addPiece(wr1);
		whiteArmy.add(wr1);
		//gameboard.printBoard();
		
		/**wr1.moveTo(new Pos('h', 1), gameboard);
		gameboard.printBoard();*/
		
		wp = new Pos('h', 1);
		Rook wr2 = new Rook(PieceColor.WHITE, wp);
		gameboard.addPiece(wr2);
		whiteArmy.add(wr2);
		//gameboard.printBoard();
		
		bp = new Pos('a', 8);
		Rook br1 = new Rook(PieceColor.BLACK, bp);
		gameboard.addPiece(br1);
		blackArmy.add(br1);
		//gameboard.printBoard();
		
		bp = new Pos('h', 8);
		Rook br2 = new Rook(PieceColor.BLACK, bp);
		gameboard.addPiece(br2);
		blackArmy.add(br2);
		//gameboard.printBoard();
		
		wp = new Pos('d', 1);
		Queen wq = new Queen(PieceColor.WHITE, wp);
		gameboard.addPiece(wq);
		whiteArmy.add(wq);
		//gameboard.printBoard();
		
		/**wq.moveTo(new Pos('c', 5), gameboard);
		gameboard.printBoard();*/
		
		bp = new Pos('d', 8);
		Queen bq = new Queen(PieceColor.BLACK, bp);
		gameboard.addPiece(bq);
		blackArmy.add(bq);
		//gameboard.printBoard();
		
		wp = new Pos('b', 1);
		Knight wn1 = new Knight(PieceColor.WHITE, wp);
		gameboard.addPiece(wn1);
		whiteArmy.add(wn1);
		//gameboard.printBoard();
		
		/**wn1.moveTo(new Pos('c', 3), gameboard);
		gameboard.printBoard();*/
		
		wp = new Pos('g', 1);
		Knight wn2 = new Knight(PieceColor.WHITE, wp);
		gameboard.addPiece(wn2);
		whiteArmy.add(wn2);
		//gameboard.printBoard();
		
		bp = new Pos('b', 8);
		Knight bn1 = new Knight(PieceColor.BLACK, bp);
		gameboard.addPiece(bn1);
		blackArmy.add(bn1);
		//gameboard.printBoard();
		
		bp = new Pos('g', 8);
		Knight bn2 = new Knight(PieceColor.BLACK, bp);
		gameboard.addPiece(bn2);
		blackArmy.add(bn2);
		//gameboard.printBoard();
		
		wp = new Pos('a', 2);
		Pawn wp1 = new Pawn(PieceColor.WHITE, wp);
		gameboard.addPiece(wp1);
		whiteArmy.add(wp1);
		//gameboard.printBoard();
		
		/**wp1.moveTo(new Pos('c', 3), gameboard);
		gameboard.printBoard();*/
		
		wp = new Pos('b', 2);
		Pawn wp2 = new Pawn(PieceColor.WHITE, wp);
		gameboard.addPiece(wp2);
		whiteArmy.add(wp2);
		//gameboard.printBoard();
		
		wp = new Pos('c', 2);
		Pawn wp3 = new Pawn(PieceColor.WHITE, wp);
		gameboard.addPiece(wp3);
		whiteArmy.add(wp3);
		//gameboard.printBoard();
		
		wp = new Pos('d', 2);
		Pawn wp4 = new Pawn(PieceColor.WHITE, wp);
		gameboard.addPiece(wp4);
		whiteArmy.add(wp4);
		//gameboard.printBoard();
		
		wp = new Pos('e', 2);
		Pawn wp5 = new Pawn(PieceColor.WHITE, wp);
		gameboard.addPiece(wp5);
		whiteArmy.add(wp5);
		//gameboard.printBoard();
		
		wp = new Pos('f', 2);
		Pawn wp6 = new Pawn(PieceColor.WHITE, wp);
		gameboard.addPiece(wp6);
		whiteArmy.add(wp6);
		//gameboard.printBoard();
		
		wp = new Pos('g', 2);
		Pawn wp7 = new Pawn(PieceColor.WHITE, wp);
		gameboard.addPiece(wp7);
		whiteArmy.add(wp7);
		//gameboard.printBoard();
		
		wp = new Pos('h', 2);
		Pawn wp8 = new Pawn(PieceColor.WHITE, wp);
		gameboard.addPiece(wp8);
		whiteArmy.add(wp8);
		//gameboard.printBoard();
		
		bp = new Pos('a', 7);
		Pawn bp1 = new Pawn(PieceColor.BLACK, bp);
		gameboard.addPiece(bp1);
		blackArmy.add(bp1);
		//gameboard.printBoard();
		
		bp = new Pos('b', 7);
		Pawn bp2 = new Pawn(PieceColor.BLACK, bp);
		gameboard.addPiece(bp2);
		blackArmy.add(bp2);
		//gameboard.printBoard();
		
		bp = new Pos('c', 7);
		Pawn bp3 = new Pawn(PieceColor.BLACK, bp);
		gameboard.addPiece(bp3);
		blackArmy.add(bp3);
		//gameboard.printBoard();
		
		bp = new Pos('d', 7);
		Pawn bp4 = new Pawn(PieceColor.BLACK, bp);
		gameboard.addPiece(bp4);
		blackArmy.add(bp4);
		//gameboard.printBoard();
		
		bp = new Pos('e', 7);
		Pawn bp5 = new Pawn(PieceColor.BLACK, bp);
		gameboard.addPiece(bp5);
		blackArmy.add(bp5);
		//gameboard.printBoard();
		
		bp = new Pos('f', 7);
		Pawn bp6 = new Pawn(PieceColor.BLACK, bp);
		gameboard.addPiece(bp6);
		blackArmy.add(bp6);
		//gameboard.printBoard();
		
		bp = new Pos('g', 7);
		Pawn bp7 = new Pawn(PieceColor.BLACK, bp);
		gameboard.addPiece(bp7);
		blackArmy.add(bp7);
		//gameboard.printBoard();
		
		bp = new Pos('h', 7);
		Pawn bp8 = new Pawn(PieceColor.BLACK, bp);
		gameboard.addPiece(bp8);
		blackArmy.add(bp8);
		gameboard.printBoard();
		
		
		System.out.println();
		System.out.println(whiteArmy);
		System.out.println(blackArmy);
		
		//System.out.println(Board.get(0,1));

	}	
}
