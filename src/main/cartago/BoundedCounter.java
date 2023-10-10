import cartago.Artifact;
import cartago.OPERATION;

public class BoundedCounter extends Artifact {
    private int max;

    void init(final int max) {
        this.max = max;
        defineObsProperty("count", 0);
    }

    @OPERATION
    void inc() {
        final var observableCount = getObsProperty("count");
        if (observableCount.intValue() < this.max) {
            observableCount.updateValue(observableCount.intValue() + 1);
            signal("tick");
        } else {
            /* Add your code for the failure generation here. */
        }
    }
}
