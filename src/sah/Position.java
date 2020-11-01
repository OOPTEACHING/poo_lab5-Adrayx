package sah;

public class Position {
    private Piece piece;
    private int x;
    private int y;

    public Position(int x, int y, Piece piece)
    {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public Piece getPiece()
    {
        return this.piece;
    }

    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
