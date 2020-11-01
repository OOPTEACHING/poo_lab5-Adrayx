package sah;

public class Pawn extends Piece {
    public Pawn(boolean white)
    {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Position initial, Position end)
    {
        if(end.getPiece().getWhite() == this.getWhite())
        {
            return false;
        }
        return true;
    }
}
