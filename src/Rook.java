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

        if (obstacles(chessBoard, line, column, toLine, toColumn)) {
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

    private boolean obstacles(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (line == toLine) {
            if (column < toColumn) {
                for (int i = column+1; i < toColumn; i++) {
                    if (chessBoard.board[line][i] != null) {
                        return true;
                    }
                }
            }
        }
        if (column == toColumn) {
            if (line < toLine) {
                for (int i = line+1; i < toLine; i++) {
                    if (chessBoard.board[i][column] != null) {
                        return true;
                    }
                }
            }
        }

        if (line == toLine) {
            if (column > toColumn) {
                for (int i = column-1; i > toColumn; i--) {
                    if (chessBoard.board[line][i] != null) {
                        return true;
                    }
                }
            }
        }
        if (column == toColumn) {
            if (line > toLine) {
                for (int i = line-1; i > toLine; i--) {
                    if (chessBoard.board[i][column] != null) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}