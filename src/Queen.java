public class Queen extends ChessPiece {

    public Queen(String color) {
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

            if (line == toLine && (column > toColumn || column < toColumn)) {
                return true;
            }
            if (column == toColumn && (line > toLine || line < toLine)) {
                return true;
            }
            if (line > toLine && column > toColumn) {
                if (line - toLine == column - toColumn) {
                    return true;
                }
            }
            if (line > toLine && column < toColumn) {
                if (line - toLine == toColumn - column) {
                    return true;
                }
            }
            if (line < toLine && column > toColumn) {
                if (toLine - line == column - toColumn) {
                    return true;
                }
            }
            if (line < toLine && column < toColumn) {
                return (toLine - line) == (toColumn - column);
            }

        return false;

    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
