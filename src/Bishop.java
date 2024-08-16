public class Bishop extends ChessPiece {

    public Bishop(String color) {
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

        if (obstacles(chessBoard, line, column, toLine, toColumn)) {
            return false;
        }

        if (line > toLine && column > toColumn) {
            if ((line - toLine) == (column - toColumn)) {
                return true;
            }
        }
        if (line > toLine && column < toColumn) {
            if ((line - toLine) == (toColumn - column)) {
                return true;
            }
        }
        if (line < toLine && column > toColumn) {
            if ((toLine - line) == (column - toColumn)) {
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
        return "B";
    }

    private boolean obstacles(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (line < toLine && column < toColumn) {
            if ((toLine - line) == (toColumn - column)) {
                while ((++line) < toLine && (++column) < toColumn) {
                    if (chessBoard.board[line][column] != null) {
                        return true;
                    }

                }
            }
        }
        if (line < toLine && column > toColumn) {
            if ((toLine - line) == (column - toColumn)) {
                while ((++line) < toLine && (--column) > toColumn) {
                    if (chessBoard.board[line][column] != null) {
                        return true;
                    }

                }
            }
        }
        if (line > toLine && column < toColumn) {
            if ((line - toLine) == (toColumn - column)) {
                while ((--line) > toLine && (++column) < toColumn) {
                    if (chessBoard.board[line][column] != null) {
                        return true;
                    }

                }
            }
        }
        if (line > toLine && column > toColumn) {
            if ((line - toLine) == (column - toColumn)) {
                while ((--line) > toLine && (--column) > toColumn) {
                    if (chessBoard.board[line][column] != null) {
                        return true;
                    }

                }
            }
        }

        return false;
    }
}