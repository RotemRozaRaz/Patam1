package test;

import java.util.Arrays;

public class Word {

	private Tile[] tiles;
    private int row;
    private int col;
    private boolean vertical;

    public Word(Tile[] in_tiles, int in_row, int in_col, boolean in_vertical){

        this.tiles = in_tiles;
        this.row = in_row;
        this.col = in_col;
        this.vertical = in_vertical;
    }

    
    /** 
     * @return Tile[]
     */
    public Tile[] getTiles() {
        return tiles;
    }

    
    /** 
     * @return int
     */
    public int getRow() {
        return row;
    }

    
    /** 
     * @return int
     */
    public int getCol() {
        return col;
    }

    
    /** 
     * @return boolean
     */
    public boolean isVertical() {
        return vertical;
    }

    
    /** 
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(tiles);
        result = prime * result + row;
        result = prime * result + col;
        result = prime * result + (vertical ? 1231 : 1237);
        return result;
    }

    
    /** 
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Word other = (Word) obj;
        if (!Arrays.equals(tiles, other.tiles))
            return false;
        if (row != other.row)
            return false;
        if (col != other.col)
            return false;
        if (vertical != other.vertical)
            return false;
        return true;
    }

    
}
