public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int result = calculator.plus.apply(2, 3);
        System.out.println(result);
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        int c;
        //Ошибка из-за деления на ноль, можно дописать проверку для выявления случаев, когда b = 0, как прописано в коде ниже
        if (b != 0) {
            c = calculator.devide.apply(a, b);
        } else {
            c = 0;
        }

        calculator.println.accept(c);
    }

}