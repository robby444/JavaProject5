package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(StateMachine.findTest("ABC"));
        System.out.println(StateMachine.findTest("ABCTEST"));
        System.out.println(StateMachine.findTest("TEST"));
        System.out.println(StateMachine.findTest("TESTAAA"));
        System.out.println(StateMachine.findTest("TESTEST"));
        System.out.println(StateMachine.findTest("AATES"));
        System.out.println(StateMachine.findTest("AATE"));
        System.out.println(StateMachine.findTest("TDS"));
        System.out.println(StateMachine.findTest("TTEST"));
        System.out.println(StateMachine.findTest("TETEST"));
    }
}