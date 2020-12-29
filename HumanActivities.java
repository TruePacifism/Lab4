import java.util.ArrayList;

/**
 * Интерфейс, содержащий действия, которые могут выполнять люди
 */
public interface HumanActivities {
    /** реализует "ах" */
    Alice gasp();

    /** реализует падение */
    Alice fall();

    /** реализует падение в колодец */
    Alice fall(Well well);

    /** возвращает boolean, результат проверки, хватит ли времени на действия */
    boolean hasTimeFor(ArrayList<Actions> actions);

    /** реализует раздумия, хватит ли времени для действий */
    Alice thinkHasTimeOrNot(ArrayList<Actions> actions);

    /** меняет локацию */
    Alice changeLocation(Location location);

    Alice rushedAfter(Character character);

    Alice lookAround();
}
