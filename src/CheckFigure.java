public interface CheckFigure {

    default boolean obstacles(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

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
