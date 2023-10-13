!create_and_use.

+!create_and_use : true <-
    makeArtifact("c0", "io.github.cakelier.BoundedCounterSolution", [10], CounterId);
    .wait(1000);
    for (.range(_, 0, 10)) {
        inc;
    }.

/* The error reason and the error tuple specified through the "failed" method can be extracted on the agent side. */
-!create_and_use [error_msg(Msg), env_failure_reason(max_reached(Value))] : true <-
    println(Msg);
    println("Last value was ", Value).

{ include("$jacamoJar/templates/common-cartago.asl") }
