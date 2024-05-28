package counter.items;

import counter.Countable;
import java.time.LocalDate;

public record Apple(Colour colour, LocalDate datePicked, LocalDate bestBefore) implements Countable {
    public int getCount() {
        return 1;
    }

    @Override
    public String toString() {
        return "Apple: " +
                "Colour = " +
                colour.toString() +
                " Date Picked = " +
                datePicked.toString() +
                " Best Before = " +
                bestBefore.toString();
    }
}
