public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7 || line == toLine) {
            return false;
        }

            if (line == 1 && column == toColumn && (line + 1 == toLine || line + 2 == toLine)) {
                return true;
            }


            if (line == 6 && column == toColumn && (line - 1 == toLine || line - 2 == toLine)) {
                return true;
            }

            if (column == toColumn && (line + 1 == toLine || line - 1 == toLine)) {
                return true;
            }

            if (chessBoard.board[line][column].getColor().equals("White") && chessBoard.board[toLine][toColumn].getColor().equals("Black")) {
                if (line + 1 == toLine && column + 1 == toColumn) {
                    return true;
                }
                if (line + 1 == toLine && column - 1 == toColumn) {
                    return true;
                }
            }

            if (chessBoard.board[line][column].getColor().equals("Black") && chessBoard.board[toLine][toColumn].getColor().equals("White")) {
                if (line - 1 == toLine && column - 1 == toColumn) {
                    return true;
                }
                if (line - 1 == toLine && column + 1 == toColumn) {
                    return true;
                }
            }

        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}