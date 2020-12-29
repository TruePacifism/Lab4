import com.sun.xml.internal.ws.api.model.WSDLOperationMapping;

import java.util.ArrayList;

/**
 * Класс, реализующий Алису, как действующее лицо.
 */
public class Alice extends Character implements HumanActivities {
    private final String NAME = "Алиса ";

    /** хранит кол-во свободного времени Алисы в данный момент */
    private int freeTime;

    /** хранит числовой код ДНК */
    private final String DNA = "312312144";

    /** хранит локацию, в которой Алиса находится в данный момент */
    private Location location;

    /** хранит список действий, которые нужно выполнить немедленно */
    private ArrayList<Actions> necessaryActions = new ArrayList<>();

    /** возвращает список срочных действий (necessaryActions) */
    public ArrayList<Actions> getNecessaryActions() {
        return necessaryActions;
    }

    public int[] x[] = {};

    public Alice(int freeTime) {
        this.freeTime = freeTime;
    }

    public boolean equals(Object object) {
        return object instanceof Alice;
    }

    public int hashCode() {
        return Integer.parseInt(DNA);
    }

    public Location getLocation() {
        return location;
    }

    /** реализует поиск Алисой причин для чего бы то ни было */
    public Alice findReason(ArrayList<Reasons> reasons) {
        String allReasonsDescribe = "";
        for (Reasons thisReason: reasons) {
            allReasonsDescribe += "то ли " + thisReason + ", ";
        }
        System.out.print(allReasonsDescribe.substring(0, allReasonsDescribe.length() - 1) + " но ");
        return this;
    }

    /** реализует "ах" Алисы. Ни на что не влияет */
    public Alice gasp() {
        System.out.print(this + "ахнуть не успела, как ");
        return this;
    }

    /** реализует падение Алисы */
    public Alice fall() {
        System.out.print(this + "полетела вниз ");
        return this;
    }

    /** реализует падение Алисы в колодец. Изменяет свободное время, локацию, необходимые действия
     *  и может добавить причину(зависит от колодца) */
    public Alice fall(Well well) {
        changeLocation(well);
        freeTime = 1000;
        System.out.print(this + "полетела вниз, в " + well);
        Reasons.addReason(Reasons.FAST_FALL);
        if (well.IS_DEEP) {
            Reasons.addReason(Reasons.DEEP_WELL);
        }
        necessaryActions.add(Actions.LOOK_AROUND);
        necessaryActions.add(Actions.THINK_ABOUT_FUTURE);
        return this;
    }

    public String toString() {
        return NAME;
    }

    /** проверяет наличие у Алисы свободного времени для нескольких действий
     *  Возвращает boolean в зависимости от результата */
    public boolean hasTimeFor(ArrayList<Actions> actions) {
        int fullActionsTime = 0;
        for (Actions thisAction:actions) {
            fullActionsTime += thisAction.TIME_TO_DO;
        }
        return fullActionsTime <= freeTime;
    }

    /** Меняет локацию Алисы. Используется в основном другими методами */
    public Alice changeLocation(Location location) {
        this.location = location;
        return this;
    }

    /** Алиса думает, хватит ли у неё времени для нужных действий */
    public Alice thinkHasTimeOrNot(ArrayList<Actions> actions){
        if (hasTimeFor(actions)) {
            System.out.print("вскоре " + this + "поняла, что времени вволю, чтобы " + Actions.describeACTIONS(actions));
        } else {
            System.out.print("вскоре " + this + "поняла, что времени в обрез, чтобы " + Actions.describeACTIONS(actions));
        }
        return this;
    }

    public Alice shouldThink(Thoughts thoughts) {
        System.out.print("А кой о чём подумать ей не мешало бы - ну хоть " + thoughts);
        return this;
    }

    public Alice rushedAfter(Character character) {
        System.out.print("В ту же секунду " + this + "не раздумывая ринулась за " + character + ". ");
        changeLocation(character.getLocation());
        if (location instanceof Hole) {
            shouldThink(Thoughts.HOW_TO_GO_OUT);
        }
        return this;
    }

    public Alice lookDown() {
        System.out.print(this + "поглядела вниз и попыталась разобрать, куда же она летит, но там всё было слишком темно; ");
        return this;
    }

    public Alice lookWalls() {
        System.out.println(this + "стала рассматривать стены " + location + "и заметила, что " + WallContentThings.describeLocationsWalls(location));
        return this;
    }
    @Override
    public Alice lookAround() {
        if (location instanceof Well) {
            lookDown().lookWalls();
        } else {
            lookWalls();
        }
        return this;
    }
}