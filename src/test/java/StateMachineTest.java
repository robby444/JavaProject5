import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.StateMachine;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class StateMachineTest {
    @ParameterizedTest
    @MethodSource("dataProvider")
    void testResultingState(String input, StateMachine.State expected) {
        assertEquals(expected, StateMachine.findTest(input));
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("A", StateMachine.State.S),
                Arguments.of("T", StateMachine.State.ONE),
                Arguments.of("TA", StateMachine.State.S),
                Arguments.of("TE", StateMachine.State.TWO),
                Arguments.of("TEA", StateMachine.State.S),
                Arguments.of("TES", StateMachine.State.THREE),
                Arguments.of("TESA", StateMachine.State.S),
                Arguments.of("TEST", StateMachine.State.F),
                Arguments.of("TESTA", StateMachine.State.F),

                Arguments.of("TTEST", StateMachine.State.F),
                Arguments.of("TETEST", StateMachine.State.F)
        );
    }
}

