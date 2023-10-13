package io.github.cakelier;

import cartago.Artifact;
import cartago.OPERATION;

public class BoundedCounterSolution extends Artifact {
    private int max;

    private void init(final int max) {
        this.max = max;
        defineObsProperty("count", 0);
    }

    @OPERATION
    public void inc() {
        final var observableCount = getObsProperty("count");
        if (observableCount.intValue() < this.max) {
            observableCount.updateValue(observableCount.intValue() + 1);
            signal("tick");
        } else {
            /*
             * Outside the error reason, also a tuple specifying the error can be passed to the "failed" method.
             * The "tupleDesc" argument is the functor and all the following parameters the tuple elements.
             */
            failed(
                "The counter reached the max value and cannot be incremented anymore",
                "max_reached",
                 this.max
            );
        }
    }
}
