import static java.lang.Math.*;

public class Story {
    public static void main(String[] args) {

        /** считает расстояние между двумя объектами */
        WorkWithLocations distanceBetween = (Location location1, Location location2) -> {
            int x1 = location1.getCOORDINATE_X();
            int y1 = location1.getCOORDINATE_Y();
            int x2 = location2.getCOORDINATE_X();
            int y2 = location2.getCOORDINATE_Y();
            return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
        };
        Alice alice = new Alice(99999);
        Hole hole = new Hole(12,-12, Straightness.STRAIGHT, Abruptness.ABRUPT);
        Well well = new Well(13,12,30, new WallContentThings[]{WallContentThings.CUPBOARDS_AND_SHELVES, WallContentThings.PICTURES_AND_MAPS});
        Someone someone = new Someone(hole);
        alice.rushedAfter(someone);
        System.out.print(". ");
        hole.goStraight().breakOff();
        alice.gasp().fall(well);
        System.out.print(". ");
        alice.findReason(Reasons.reasonsMayBe).thinkHasTimeOrNot(alice.getNecessaryActions());
        System.out.print(". ");
        System.out.println(well.getWallsContent().length);
        alice.lookAround();
        System.out.println("Расстояние между " + well + "и " + hole + "было равно примерно " + (int) distanceBetween.smth(well, hole) + " метра. ");
    }
}





