package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA = " + dataA);
        System.out.println("before method call : dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("after method call : dataA.value =" + dataA.value);
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
}
