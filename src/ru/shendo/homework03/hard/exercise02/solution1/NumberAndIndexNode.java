package ru.shendo.homework03.hard.exercise02.solution1;

public class NumberAndIndexNode implements Comparable<NumberAndIndexNode> {
    private final int NUMBER;
    private final int INDEX;

    public NumberAndIndexNode(int number, int index) {
        this.NUMBER = number;
        this.INDEX = index;
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public int getINDEX() {
        return INDEX;
    }

    @Override
    public int compareTo(NumberAndIndexNode o) {
        return Integer.compare(getNUMBER(), o.getNUMBER());
    }

}