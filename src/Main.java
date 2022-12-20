public class Main {
    public static void main(String[] args) {
        int ticket = 100; //рублей
        int bonus = 20; //рублей

        System.out.println("Купили билет за 100 рублей. За каждые 20 рублей, потраченные на билет, начисляется 1 миля");
        System.out.println((ticket / bonus) + " бонусных миль получено за купленный билет");

    }
}