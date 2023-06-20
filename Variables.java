/*
    ? There are 5 types of Data Types in Java
    1. int
    2. float
    3. charecter
    4. boolean
    5. string
 */


class Variables {
    public static void main(String[] args) {
        // The integer has further 4 types (long[64 byte], int[32 byte], short[16 byte], byte[8 byte])
        // The float type has 2 types (double[64 byte], float[32 byte])
        // Let's see each data type in action

        int one = 1;
        long v2 = 882082038;
        float number = 56;
        double num2 = 78.7;
        char ch = 'A';
        boolean isTrue = true;

        // You can specify an int in Binary form starting JDK7, to start the Value with 0b or 0B
        int x = 0B1010;

        System.out.println(one);
        System.out.println(v2);
        System.out.println(number);
        System.out.println(num2);
        System.out.println(ch);
        System.out.println(isTrue);
        System.out.println(x);
    }
}