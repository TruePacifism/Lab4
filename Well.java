/**
 * Класс, реализующий колодец, как тип локации
 */
public class Well extends Location {

    /** хранит глубину колодца */
    private final int DEPTH;
    private final String NAME;

    /** глубина, от которой колодец считается глубоким */
    public static final int DEEP_DEPTH = 20;

    /** координаты колодца */
    private final int COORDINATE_X, COORDINATE_Y;

    /** хранит информацию, считается ли глубоким данный колодец */
    public final boolean IS_DEEP;

    private WallContentThings[] wallsContent;

    public WallContentThings[] getWallsContent() {
        return wallsContent;
    }

    public Well(int coordinateX, int coordinateY, int depth, WallContentThings[] wallsContent) {
        this.DEPTH = depth;
        this.COORDINATE_X = coordinateX;
        this.COORDINATE_Y = coordinateY;
        this.wallsContent = wallsContent;

        IS_DEEP = (depth > DEEP_DEPTH);
        if (IS_DEEP) {
            NAME = "очень-очень глубокий колодец ";
        } else {
            NAME = "колодец ";
        }
    }

    public int getCOORDINATE_X() {
        return this.COORDINATE_X;
    }

    public int getCOORDINATE_Y() {
        return this.COORDINATE_Y;
    }

    public boolean equals(Object object) {
        if (object instanceof Well) {
            return (COORDINATE_Y == ((Well) object).COORDINATE_Y & COORDINATE_X == ((Well) object).COORDINATE_X);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return COORDINATE_X * COORDINATE_Y;
    }

    public String toString() {
        return NAME;
    }
}