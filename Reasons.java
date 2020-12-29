import java.util.ArrayList;

/**
 * хранит типы причин и их название, а так же список возможных для данного
 * момента причин
 */
public enum Reasons {
    DEEP_WELL("колодец был действительно уж очень глубокий"),
    FAST_FALL("падала уж очень не спеша"),
    STARS_AGREE("звёзды сошлись");
    final String NAME;

    /** создает список актуальных причин */
    public static ArrayList<Reasons> reasonsMayBe = new ArrayList<>();
    Reasons(String name) {
        this.NAME = name;
    }

    public String toString() {
        return NAME;
    }

    /** добавляет причину в список актуальных */
    public static void addReason(Reasons reasons) {
        reasonsMayBe.add(reasons);
    }
}
