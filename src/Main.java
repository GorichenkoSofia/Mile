public class Main {
    public static void main(String[] args) {
        int ticket = 100; //рублей
        int bonus = 20; //рублей
        int result = ticket / bonus;

        System.out.println("Купили билет за 100 рублей. За каждые 20 рублей, потраченные на билет, начисляется 1 миля");
        System.out.println(result + " бонусных миль получено за купленный билет");

    }
}