package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();

        add(data);
        add(data);
        add(data);

        System.out.println("value = " + data.value);
    }

    static void add(ValueData data) {
        data.value++;
        System.out.println("value up : " + data.value);
    }
}
