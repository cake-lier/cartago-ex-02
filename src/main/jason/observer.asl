!observe.

+!observe : true <-
    !discover(CounterId);
    focus(CounterId);
    +counter(CounterId).

+!discover(I) : true <-
    lookupArtifact("c0", I).

-!discover(I) : true <-
    !discover(I).

+count(N) : true <-
    println("New count value perceived: ", N).

+tick[artifact_id(CounterId)] : counter(CounterId) <-
    println("New tick perceived").

{ include("$jacamoJar/templates/common-cartago.asl") }