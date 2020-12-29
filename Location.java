/**
 * абстрактный класс, реализующий разного рода локации
 */
public abstract class Location {
    final int COORDINATE_X = 0;
    final int COORDINATE_Y = 0;
    final String NAME = "";
    private WallContentThings[] wallsContent = {};

    abstract public WallContentThings[] getWallsContent();

    public int getCOORDINATE_X() {
        return COORDINATE_X;
    }

    public int getCOORDINATE_Y() {
        return COORDINATE_Y;
    }

    public int hashCode() {
        return COORDINATE_X * COORDINATE_Y;
    }

    public String toString() {
        return NAME;
    }
}
