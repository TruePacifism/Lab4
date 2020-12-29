import java.util.ArrayList;

/**
 * Enum, содержащий список действий и некоторую информацию о них
 */
public enum Actions {
    LOOK_AROUND(10, "осмотреться кругом "),
    THINK_ABOUT_FUTURE(60, "подумать о том, что ждёт впереди ");

    /** время, нужное, чтобы совершить соотетствующее действие */
    final int TIME_TO_DO;

    /** название действия */
    final String NAME;

    Actions(int timeToDo, String name) {
        this.TIME_TO_DO = timeToDo;
        this.NAME = name;
    }

    public String toString() {
        return NAME;
    }

    /** статический метод, который описывает несколько действий разом */
    public static String describeACTIONS(ArrayList<Actions> actions) {
        String describe = "";
        for (Actions thisAction:actions) {
            describe += thisAction + ", ";
        }
        return describe.substring(0, describe.length() - 2);
    }
}