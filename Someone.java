import java.util.Objects;

public class Someone extends Character {
    private Location location;

    public final String NAME = "Некто ";

    public Location getLocation() {
        return location;
    }

    private final String DNA = "43412412";

    public boolean equals(Object o) {
        return this.getClass() == o.getClass();
    }

    public int hashCode() {
        return Objects.hash(DNA);
    }

    public Someone(Location location) {
        this.location = location;
    }

    public String toString() {
        return NAME;
    }
}
