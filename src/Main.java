public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1000; // стоимость билета
        int amount = 20;        // кол-во рублей для одной бонусной мили
        int bonusMile = ticketPrice / amount; // расчет начисленных миль за купленный билет
        System.out.println("Количество начисленных миль за купленный билет:");
        System.out.println(bonusMile);
    }
}