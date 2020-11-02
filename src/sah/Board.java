package sah;

public class Board {
    Position[][] spots;

    public void initializeBoard()
    {
        spots[0][0] = new Position(0, 0, new Rook(true));
        spots[0][1] = new Position(0, 1, new Knight(true));
        spots[0][2] = new Position(0, 2, new Bishop(true));
        spots[0][3] = new Position(0, 3, new Queen(true));
        spots[0][4] = new Position(0, 4, new King(true));
        spots[0][5] = new Position(0, 5, new Bishop(true));
        spots[0][6] = new Position(0, 6, new Knight(true));
        spots[0][7] = new Position(0, 7, new Rook(true));

        spots[7][0] = new Position(7, 0, new Rook(false));
        spots[7][1] = new Position(7, 1, new Knight(false));
        spots[7][2] = new Position(7, 2, new Bishop(false));
        spots[7][3] = new Position(7, 3, new Queen(false));
        spots[7][4] = new Position(7, 4, new King(false));
        spots[7][5] = new Position(7, 5, new Bishop(false));
        spots[7][6] = new Position(7, 6, new Knight(false));
        spots[7][7] = new Position(7, 7, new Rook(false));

        for(int i = 0; i < 8; i++)
        {
            spots[1][i] = new Position(1, i, new Pawn(true));
            spots[6][i] = new Position(6, i, new Pawn(false));
        }

        for(int i = 2; i <= 5; i++)
        {
            for(int j = 0; j < 8; j++)
                spots[i][j] = new Position(i, j, null);
        }
    }
}
