 class OperatorPrecedenceTwo {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a * 2 - --a / a++ + (a-- * 2) % 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
