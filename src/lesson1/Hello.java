package lesson1;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        byte byteVar = 16; // 8-bit signed
        short shortVar = -10000; // 16-bit signed
        int intVar = 100000; // 32-bit signed
        long longVar = 100000L; // 64-bit signed
        float floatVar = 123.4F; // 32-bit
        double doubleVar = 123.4D; // 64-bit
        boolean boolVar = true;
        char charVar = 's'; // single-quoted
        String strVar = "some chars"; // double-quoted

        System.out.println("variable values: " + byteVar + ", " + shortVar + ", " + intVar + ", " + longVar + ", " + floatVar + ", " + doubleVar + ", " + boolVar + ", " + charVar + ", " + strVar);
    }
}
