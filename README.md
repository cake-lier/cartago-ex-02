# JaCaMo by exercises — Exercise 02 — Action Failure

This exercise is a simple variation of the previous one, to show action failure. 
As in the previous case, two agents create, use and observe a shared artifact,
but in this case it's a "bounded" counter.
This means that it should be initialized with a value and, when invoking the "inc" operation,
after reaching the maximum value a failure should be generated.
The "user" agent must create a "BoundedCounter"
and try to increment it past its limit: as soon as the maximum value is reached, a repairing plan must be executed.

## Solution

All solution files are marked with the "solution" suffix, don't open them before solving the exercise!
