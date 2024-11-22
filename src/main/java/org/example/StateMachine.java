package org.example;

public class StateMachine {

    public enum State {
        S,
        ONE,
        TWO,
        THREE,
        F
    }

    public static State findTest(String input) {
        State currentState = State.S;

        for (char c : input.toCharArray()) {
            switch (currentState) {
                case S:
                    if (c == 'T') currentState = State.ONE;
                    break;
                case ONE:
                    if (c == 'E') currentState = State.TWO;
                    else if (c == 'T') break;
                    else currentState = State.S;
                    break;
                case TWO:
                    if (c == 'S') currentState = State.THREE;
                    else if (c == 'T') currentState = State.ONE;
                    else currentState = State.S;
                    break;
                case THREE:
                    if (c == 'T') currentState = State.F;
                    else currentState = State.S;
                    break;
                case F:
                    break;
            }
        }
        return currentState;
    }
}
