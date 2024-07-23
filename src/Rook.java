public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine && column == toColumn) {
            return false;
        }
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        }

            if (line == toLine && (column > toColumn || column < toColumn)) {
                return true;
            }
            return (line > toLine || line < toLine) && column == toColumn;


    }

    @Override
    public String getSymbol() {
        return "R";
    }
}