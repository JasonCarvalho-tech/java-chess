package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.Collection;



public abstract class Piece {

    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final Boolean isFirstMove;

    Piece(final int piecePosition, final Alliance pieceAlliance) {
        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
        //TODO more work here
        this.isFirstMove = false;
    }

    public int getPiecePosition() {
        return this.piecePosition;
    }

    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }

    public Boolean isFirstMove() {
        return this.isFirstMove;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);
}
