package sah;

public abstract class Piece {
    private boolean killed = false;
    private boolean white = false;

    public Piece(boolean white)
    {
        this.white = white;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean getWhite()
    {
        return this.white;
    }

    public boolean getKilled()
    {
        return this.killed;
    }

    public abstract boolean canMove(Board board, Position initial, Position end);
}
