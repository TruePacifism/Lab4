public enum WallContentThings {
    CUPBOARDS_AND_SHELVES("шли сплошь шкафы и шкафчики, полки и полочки"),
    PICTURES_AND_MAPS("кое-где были развешаны картинки и географические карты");
    private final String DESCRIBTION;
    WallContentThings(String describtion) {
        this.DESCRIBTION = describtion;
    }

    public String toString() {
        return DESCRIBTION;
    }
    public static String describeLocationsWalls(Location location) {
        String s = "";
        for (WallContentThings thing: location.getWallsContent()) {
            s += thing.toString() + ", ";
        }
        s = s.substring(0,s.length()-2);
        return s + ". ";
    }
}
