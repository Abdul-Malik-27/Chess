public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        if (line == 0 && column == 2) {
            if (board.board[1][0].getColor().equals("White") && board.board[1][0].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[2][1].getColor().equals("White") && board.board[2][1].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[2][3].getColor().equals("White") && board.board[2][3].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[1][4].getColor().equals("White") && board.board[1][4].getSymbol().equals("H")) {
                return false;
            }


            if (board.board[1][1].getColor().equals("White") && (board.board[1][1].getSymbol().equals("P") || board.board[1][1].getSymbol().equals("B") || board.board[1][1].getSymbol().equals("Q") || board.board[1][1].getSymbol().equals("K"))) {
                return false;
            }
            if (board.board[1][3].getColor().equals("White") && (board.board[1][3].getSymbol().equals("P") || board.board[1][3].getSymbol().equals("B") || board.board[1][3].getSymbol().equals("Q") || board.board[1][3].getSymbol().equals("K"))) {
                return false;
            }

            if (board.board[2][0].getColor().equals("White") && (board.board[2][0].getSymbol().equals("Q") || board.board[2][0].getSymbol().equals("B"))) {
                if (board.board[1][1] == null) {
                    return false;
                }
            }
            if (board.board[2][4].getColor().equals("White") && (board.board[2][4].getSymbol().equals("Q") || board.board[2][4].getSymbol().equals("B"))) {
                if (board.board[1][3] == null) {
                    return false;
                }
            }
            if (board.board[3][5].getColor().equals("White") && (board.board[3][5].getSymbol().equals("Q") || board.board[3][5].getSymbol().equals("B"))) {
                if (board.board[1][3] == null) {
                    if (board.board[2][4] == null) {
                        return false;
                    }
                }
            }
            if (board.board[4][6].getColor().equals("White") && (board.board[4][6].getSymbol().equals("Q") || board.board[4][6].getSymbol().equals("B"))) {
                if (board.board[1][3] == null) {
                    if (board.board[2][4] == null) {
                        if (board.board[3][5] == null) {
                            return false;
                        }
                    }
                }
            }
            if (board.board[5][7].getColor().equals("White") && (board.board[5][7].getSymbol().equals("Q") || board.board[5][7].getSymbol().equals("B"))) {
                if (board.board[1][3] == null) {
                    if (board.board[2][4] == null) {
                        if (board.board[3][5] == null) {
                            if (board.board[4][6] == null)
                            return false;
                        }
                    }
                }
            }


            if (board.board[1][2].getColor().equals("White") && (board.board[1][2].getSymbol().equals("R") || board.board[1][2].getSymbol().equals("Q") || board.board[1][2].getSymbol().equals("K"))) {
                return false;
            }
            if (board.board[2][2].getColor().equals("White") && (board.board[2][2].getSymbol().equals("R") || board.board[2][2].getSymbol().equals("Q"))) {
                if (board.board[1][2] == null) {
                    return false;
                }
            }
            if (board.board[3][2].getColor().equals("White") && (board.board[3][2].getSymbol().equals("R") || board.board[3][2].getSymbol().equals("Q"))) {
                if (board.board[1][2] == null) {
                    if (board.board[2][2] == null) {
                        return false;
                    }
                }
            }
            if (board.board[4][2].getColor().equals("White") && (board.board[4][2].getSymbol().equals("R") || board.board[4][2].getSymbol().equals("Q"))) {
                if (board.board[1][2] == null) {
                    if (board.board[2][2] == null) {
                        if (board.board[3][2] == null) {
                            return false;
                        }
                    }
                }
            }
            if (board.board[5][2].getColor().equals("White") && (board.board[5][2].getSymbol().equals("R") || board.board[5][2].getSymbol().equals("Q"))) {
                if (board.board[1][2] == null) {
                    if (board.board[2][2] == null) {
                        if (board.board[3][2] == null) {
                            if (board.board[4][2] == null) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (board.board[6][2].getColor().equals("White") && (board.board[6][2].getSymbol().equals("R") || board.board[6][2].getSymbol().equals("Q"))) {
                if (board.board[1][2] == null) {
                    if (board.board[2][2] == null) {
                        if (board.board[3][2] == null) {
                            if (board.board[4][2] == null) {
                                if (board.board[5][2] == null) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            if (board.board[7][2].getColor().equals("White") && (board.board[7][2].getSymbol().equals("R") || board.board[7][2].getSymbol().equals("Q"))) {
                if (board.board[1][2] == null) {
                    if (board.board[2][2] == null) {
                        if (board.board[3][2] == null) {
                            if (board.board[4][2] == null) {
                                if (board.board[5][2] == null) {
                                    if (board.board[6][2] == null) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }




        if (line == 0 && column == 6) {

            if (board.board[1][4].getColor().equals("White") && board.board[1][4].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[2][5].getColor().equals("White") && board.board[2][5].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[2][7].getColor().equals("White") && board.board[2][7].getSymbol().equals("H")) {
                return false;
            }


            if (board.board[1][7].getColor().equals("White") && (board.board[1][7].getSymbol().equals("P") || board.board[1][7].getSymbol().equals("B") || board.board[1][7].getSymbol().equals("Q") || board.board[1][7].getSymbol().equals("K"))) {
                return false;
            }
            if (board.board[1][5].getColor().equals("White") && (board.board[1][5].getSymbol().equals("P") || board.board[1][5].getSymbol().equals("B") || board.board[1][5].getSymbol().equals("Q") || board.board[1][5].getSymbol().equals("K"))) {
                return false;
            }


            if (board.board[2][4].getColor().equals("White") && (board.board[2][4].getSymbol().equals("Q") || board.board[2][4].getSymbol().equals("B"))) {
                if (board.board[1][5] == null) {
                    return false;
                }
            }
            if (board.board[3][3].getColor().equals("White") && (board.board[3][3].getSymbol().equals("Q") || board.board[3][3].getSymbol().equals("B"))) {
                if (board.board[1][5] == null) {
                    if (board.board[2][4] == null) {
                        return false;
                    }
                }
            }
            if (board.board[4][2].getColor().equals("White") && (board.board[4][2].getSymbol().equals("Q") || board.board[4][2].getSymbol().equals("B"))) {
                if (board.board[1][5] == null) {
                    if (board.board[2][4] == null) {
                        if (board.board[3][3] == null) {
                            return false;
                        }
                    }
                }
            }
            if (board.board[5][1].getColor().equals("White") && (board.board[5][1].getSymbol().equals("Q") || board.board[5][1].getSymbol().equals("B"))) {
                if (board.board[1][5] == null) {
                    if (board.board[2][4] == null) {
                        if (board.board[3][3] == null) {
                            if (board.board[4][2] == null)
                                return false;
                        }
                    }
                }
            }
            if (board.board[5][0].getColor().equals("White") && (board.board[5][0].getSymbol().equals("Q") || board.board[5][0].getSymbol().equals("B"))) {
                if (board.board[1][5] == null) {
                    if (board.board[2][4] == null) {
                        if (board.board[3][3] == null) {
                            if (board.board[4][2] == null) {
                                if (board.board[5][1] == null)
                                return false;
                            }
                        }
                    }
                }
            }



            if (board.board[1][6].getColor().equals("White") && (board.board[1][6].getSymbol().equals("R") || board.board[1][6].getSymbol().equals("Q") || board.board[1][6].getSymbol().equals("K"))) {
                return false;
            }


            if (board.board[2][6].getColor().equals("White") && (board.board[2][6].getSymbol().equals("R") || board.board[2][6].getSymbol().equals("Q"))) {
                if (board.board[1][6] == null) {
                    return false;
                }
            }
            if (board.board[3][6].getColor().equals("White") && (board.board[3][6].getSymbol().equals("R") || board.board[3][6].getSymbol().equals("Q"))) {
                if (board.board[1][6] == null) {
                    if (board.board[2][6] == null) {
                        return false;
                    }
                }
            }
            if (board.board[4][6].getColor().equals("White") && (board.board[4][6].getSymbol().equals("R") || board.board[4][6].getSymbol().equals("Q"))) {
                if (board.board[1][6] == null) {
                    if (board.board[2][6] == null) {
                        if (board.board[3][6] == null) {
                            return false;
                        }
                    }
                }
            }
            if (board.board[5][6].getColor().equals("White") && (board.board[5][6].getSymbol().equals("R") || board.board[5][6].getSymbol().equals("Q"))) {
                if (board.board[1][6] == null) {
                    if (board.board[2][6] == null) {
                        if (board.board[3][6] == null) {
                            if (board.board[4][6] == null) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (board.board[6][6].getColor().equals("White") && (board.board[6][6].getSymbol().equals("R") || board.board[6][6].getSymbol().equals("Q"))) {
                if (board.board[1][6] == null) {
                    if (board.board[2][6] == null) {
                        if (board.board[3][6] == null) {
                            if (board.board[4][6] == null) {
                                if (board.board[5][6] == null) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            if (board.board[7][6].getColor().equals("White") && (board.board[7][6].getSymbol().equals("R") || board.board[7][6].getSymbol().equals("Q"))) {
                if (board.board[1][6] == null) {
                    if (board.board[2][6] == null) {
                        if (board.board[3][6] == null) {
                            if (board.board[4][6] == null) {
                                if (board.board[5][6] == null) {
                                    if (board.board[6][6] == null) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        if (line == 7 && column == 2) {

            if (board.board[6][0].getColor().equals("Black") && board.board[6][0].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[5][1].getColor().equals("Black") && board.board[5][1].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[5][3].getColor().equals("Black") && board.board[5][3].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[7][4].getColor().equals("Black") && board.board[7][4].getSymbol().equals("H")) {
                return false;
            }


            if (board.board[6][1].getColor().equals("Black") && (board.board[6][1].getSymbol().equals("P") || board.board[6][1].getSymbol().equals("B") || board.board[6][1].getSymbol().equals("Q") || board.board[6][1].getSymbol().equals("K"))) {
                return false;
            }
            if (board.board[6][3].getColor().equals("Black") && (board.board[6][3].getSymbol().equals("P") || board.board[6][3].getSymbol().equals("B") || board.board[6][3].getSymbol().equals("Q") || board.board[6][3].getSymbol().equals("K"))) {
                return false;
            }


            if (board.board[5][0].getColor().equals("Black") && (board.board[5][0].getSymbol().equals("Q") || board.board[5][0].getSymbol().equals("B"))) {
                if (board.board[6][1] == null) {
                    return false;
                }
            }
            if (board.board[5][4].getColor().equals("Black") && (board.board[5][4].getSymbol().equals("Q") || board.board[5][4].getSymbol().equals("B"))) {
                if (board.board[6][3] == null) {
                    return false;
                }
            }
            if (board.board[4][5].getColor().equals("Black") && (board.board[4][5].getSymbol().equals("Q") || board.board[4][5].getSymbol().equals("B"))) {
                if (board.board[5][4] == null) {
                    if (board.board[6][3] == null) {
                        return false;
                    }
                }
            }
            if (board.board[3][6].getColor().equals("Black") && (board.board[3][6].getSymbol().equals("Q") || board.board[3][6].getSymbol().equals("B"))) {
                if (board.board[4][5] == null) {
                    if (board.board[5][4] == null) {
                        if (board.board[6][3] == null) {
                            return false;
                        }
                    }
                }
            }
            if (board.board[2][7].getColor().equals("Black") && (board.board[2][7].getSymbol().equals("Q") || board.board[2][7].getSymbol().equals("B"))) {
                if (board.board[3][6] == null) {
                    if (board.board[4][5] == null) {
                        if (board.board[5][4] == null) {
                            if (board.board[6][3] == null) {
                                return false;
                            }
                        }
                    }
                }
            }



            if (board.board[6][2].getColor().equals("Black") && (board.board[6][2].getSymbol().equals("R") || board.board[6][2].getSymbol().equals("Q") || board.board[6][2].getSymbol().equals("K"))) {
                return false;
            }


            if (board.board[5][2].getColor().equals("Black") && (board.board[5][2].getSymbol().equals("R") || board.board[5][2].getSymbol().equals("Q"))) {
                if (board.board[6][2] == null) {
                    return false;
                }
            }
            if (board.board[4][2].getColor().equals("Black") && (board.board[4][2].getSymbol().equals("R") || board.board[4][2].getSymbol().equals("Q"))) {
                if (board.board[5][2] == null) {
                    if (board.board[6][2] == null) {
                        return false;
                    }
                }
            }
            if (board.board[3][2].getColor().equals("Black") && (board.board[3][2].getSymbol().equals("R") || board.board[3][2].getSymbol().equals("Q"))) {
                if (board.board[4][2] == null) {
                    if (board.board[5][2] == null) {
                        if (board.board[6][2] == null) {
                            return false;
                        }
                    }
                }
            }
            if (board.board[2][2].getColor().equals("Black") && (board.board[2][2].getSymbol().equals("R") || board.board[2][2].getSymbol().equals("Q"))) {
                if (board.board[3][2] == null) {
                    if (board.board[4][2] == null) {
                        if (board.board[5][2] == null) {
                            if (board.board[6][2] == null) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (board.board[1][2].getColor().equals("Black") && (board.board[1][2].getSymbol().equals("R") || board.board[1][2].getSymbol().equals("Q"))) {
                if (board.board[2][2] == null) {
                    if (board.board[3][2] == null) {
                        if (board.board[4][2] == null) {
                            if (board.board[5][2] == null) {
                                if (board.board[6][2] == null) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            if (board.board[0][2].getColor().equals("Black") && (board.board[0][2].getSymbol().equals("R") || board.board[0][2].getSymbol().equals("Q"))) {
                if (board.board[1][2] == null) {
                    if (board.board[2][6] == null) {
                        if (board.board[3][6] == null) {
                            if (board.board[4][6] == null) {
                                if (board.board[5][6] == null) {
                                    if (board.board[6][6] == null) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (line == 7 && column == 6) {

            if (board.board[6][4].getColor().equals("Black") && board.board[6][4].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[5][5].getColor().equals("Black") && board.board[5][5].getSymbol().equals("H")) {
                return false;
            }
            if (board.board[5][7].getColor().equals("Black") && board.board[5][7].getSymbol().equals("H")) {
                return false;
            }


            if (board.board[6][5].getColor().equals("Black") && (board.board[6][5].getSymbol().equals("P") || board.board[6][5].getSymbol().equals("B") || board.board[6][5].getSymbol().equals("Q") || board.board[6][5].getSymbol().equals("K"))) {
                return false;
            }
            if (board.board[6][7].getColor().equals("Black") && (board.board[6][7].getSymbol().equals("P") || board.board[6][7].getSymbol().equals("B") || board.board[6][7].getSymbol().equals("Q") || board.board[6][7].getSymbol().equals("K"))) {
                return false;
            }


            if (board.board[5][4].getColor().equals("Black") && (board.board[5][4].getSymbol().equals("Q") || board.board[5][4].getSymbol().equals("B"))) {
                if (board.board[6][5] == null) {
                    return false;
                }
            }
            if (board.board[4][3].getColor().equals("Black") && (board.board[4][3].getSymbol().equals("Q") || board.board[4][3].getSymbol().equals("B"))) {
                if (board.board[5][4] == null) {
                    if (board.board[6][5] == null) {
                        return false;
                    }
                }
            }
            if (board.board[3][2].getColor().equals("Black") && (board.board[3][2].getSymbol().equals("Q") || board.board[3][2].getSymbol().equals("B"))) {
                if (board.board[4][3] == null) {
                    if (board.board[5][4] == null) {
                        if (board.board[6][5] == null) {
                            return false;
                        }
                    }
                }
            }
            if (board.board[2][1].getColor().equals("Black") && (board.board[2][1].getSymbol().equals("Q") || board.board[2][1].getSymbol().equals("B"))) {
                if (board.board[3][2] == null) {
                    if (board.board[4][3] == null) {
                        if (board.board[5][4] == null) {
                            if (board.board[6][5] == null) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (board.board[1][0].getColor().equals("Black") && (board.board[1][0].getSymbol().equals("Q") || board.board[1][0].getSymbol().equals("B"))) {
                if (board.board[2][1] == null) {
                    if (board.board[3][2] == null) {
                        if (board.board[4][3] == null) {
                            if (board.board[5][4] == null) {
                                if (board.board[6][5] == null) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }



            if (board.board[6][6].getColor().equals("Black") && (board.board[6][6].getSymbol().equals("R") || board.board[6][6].getSymbol().equals("Q") || board.board[6][6].getSymbol().equals("K"))) {
                return false;
            }


            if (board.board[5][6].getColor().equals("Black") && (board.board[5][6].getSymbol().equals("R") || board.board[5][6].getSymbol().equals("Q"))) {
                if (board.board[6][6] == null) {
                    return false;
                }
            }
            if (board.board[4][6].getColor().equals("Black") && (board.board[4][6].getSymbol().equals("R") || board.board[4][6].getSymbol().equals("Q"))) {
                if (board.board[5][6] == null) {
                    if (board.board[6][6] == null) {
                        return false;
                    }
                }
            }
            if (board.board[3][6].getColor().equals("Black") && (board.board[3][6].getSymbol().equals("R") || board.board[3][6].getSymbol().equals("Q"))) {
                if (board.board[4][6] == null) {
                    if (board.board[5][6] == null) {
                        if (board.board[6][6] == null) {
                            return false;
                        }
                    }
                }
            }
            if (board.board[2][6].getColor().equals("Black") && (board.board[2][6].getSymbol().equals("R") || board.board[2][6].getSymbol().equals("Q"))) {
                if (board.board[3][6] == null) {
                    if (board.board[4][6] == null) {
                        if (board.board[5][6] == null) {
                            if (board.board[6][6] == null) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (board.board[1][6].getColor().equals("Black") && (board.board[1][6].getSymbol().equals("R") || board.board[1][6].getSymbol().equals("Q"))) {
                if (board.board[2][6] == null) {
                    if (board.board[3][6] == null) {
                        if (board.board[4][6] == null) {
                            if (board.board[5][6] == null) {
                                if (board.board[6][6] == null) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            if (board.board[0][6].getColor().equals("Black") && (board.board[0][6].getSymbol().equals("R") || board.board[0][6].getSymbol().equals("Q"))) {
                if (board.board[1][6] == null) {
                    if (board.board[2][6] == null) {
                        if (board.board[3][6] == null) {
                            if (board.board[4][6] == null) {
                                if (board.board[5][6] == null) {
                                    if (board.board[6][6] == null) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
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


            if (line == toLine && column + 1 == toColumn) {
                return true;
            }
            if (line == toLine && column - 1 == toColumn) {
                return true;
            }
            if (line + 1 == toLine && column == toColumn) {
                return true;
            }
            if (line - 1 == toLine && column == toColumn) {
                return true;
            }
            if (line + 1 == toLine && column + 1 == toColumn) {
                return true;
            }
            if (line + 1 == toLine && column - 1 == toColumn) {
                return true;
            }
            if (line - 1 == toLine && column - 1 == toColumn) {
                return true;
            }
            if (line - 1 == toLine && column + 1 == toColumn) {
                return true;
            }
        return false;
    }


    @Override
    public String getSymbol() {
        return "K";
    }
}
