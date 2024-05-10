package counter;

import counter.items.Apple;

import java.util.Comparator;

import static counter.AppleComparator.Outcomes.*;

public class AppleComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        if (o1.bestBefore().equals(o2.bestBefore())) { return EQUAL_TO.result; }
        if (o1.bestBefore().isBefore(o2.bestBefore())) { return LESS_THAN.result; }
        if (o1.bestBefore().isAfter(o2.bestBefore())) { return GREATER_THAN.result; }

        return 0;
    }

    protected enum Outcomes {
        LESS_THAN(-1),
        EQUAL_TO(0),
        GREATER_THAN(1);

        private final int result;

        private Outcomes(final int result) {
            this.result = result;
        }
    }
}
