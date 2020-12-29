/**
 * Класс, реализующий нору (пещерообразная локация)
 */
public class Hole extends Location implements Cavernous {

    /** хранит прямоту норы. Остаётся неизменным */
    private final Straightness STRAIGHTNESS;
    private final String NAME = "нора ";

    /** хранит информацию, является ли пещера обрывистой. Неизменна */
    private final boolean IS_ABRUPTNESS;

    /** хранит координаты норы */
    private final int COORDINATE_X, COORDINATE_Y;

    public WallContentThings[] wallsContent = null;

    public WallContentThings[] getWallsContent() {
        return wallsContent;
    }

    /** описывает то, как идет пещера (прямо или криво) */
    public Hole goStraight() {
        if (STRAIGHTNESS == STRAIGHTNESS.STRAIGHT) {
            System.out.print(this + "шла ровно, как тоннель, ");
        } else {
            System.out.print(this + "шла криво, ");
        }
        return this;
    }

    public int getCOORDINATE_X() {
        return this.COORDINATE_X;
    }

    public int getCOORDINATE_Y() {
        return this.COORDINATE_Y;
    }

    public boolean equals(Object object) {
        if (object instanceof Hole) {
            return (COORDINATE_Y == ((Hole) object).COORDINATE_Y & COORDINATE_X == ((Hole) object).COORDINATE_X);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return COORDINATE_X * COORDINATE_Y;
    }

    /** реализует спуск пещеры. Зависит от обрывистости пещеры */
    public Hole breakOff() {
        if (IS_ABRUPTNESS) {
            System.out.print(this + "резко и круто оборвалась, ");
        } else {
            System.out.print("в " + this + "показался гладкий спуск, ");
        }
        return this;
    }

    public String toString() {
        return NAME;
    }

    public Hole(int coordinateX, int coordinateY, Straightness straightness, Abruptness abruptness) {
        this.COORDINATE_X = coordinateX;
        this.COORDINATE_Y = coordinateY;
        this.STRAIGHTNESS = straightness;
        IS_ABRUPTNESS = abruptness == abruptness.ABRUPT;
    }
}