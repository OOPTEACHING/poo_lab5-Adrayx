package sah;

public class Knight extends Piece {
    public Knight(boolean white)
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
        int y = Math.abs(end.getX() - initial.getX());

        return x * y == 2;
    }
}
