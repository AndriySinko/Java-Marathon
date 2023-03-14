package Day016;

public class Chessboard {
    private ChessPiece[][] chessPieces;
    public Chessboard(ChessPiece[][] chessPieces){
        this.chessPieces = chessPieces;
    }
    public void print(){
        for (ChessPiece[] chessPiece : chessPieces) {
            for (ChessPiece piece : chessPiece) {
                System.out.print(piece.getS());
            }
            System.out.println();
        }
    }
}
