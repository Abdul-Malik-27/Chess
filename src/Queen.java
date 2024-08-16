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

        if (obstacles(chessBoard, line, column, toLine, toColumn)) {
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
