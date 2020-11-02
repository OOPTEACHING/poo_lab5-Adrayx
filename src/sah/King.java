package sah;

public class King extends Piece {
    public King(boolean white)
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

        int x = Math.abs(end.getX() - initial.getX());
        int y = Math.abs(end.getY() - initial.getY());
        return x + y == 1;
    }
}
