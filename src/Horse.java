public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        }
        if (line == toLine && column == toColumn) {
            return false;
        }

            if ((line + 1 == toLine || line - 1 == toLine) && (column + 2 == toColumn || column - 2 == toColumn)) {
                return true;
            }
            return ((line + 2) == toLine || (line - 2) == toLine) && ((column + 1) == toColumn || (column - 1) == toColumn);

    }

    @Override
    public String getSymbol () {
        return "H";
    }
}