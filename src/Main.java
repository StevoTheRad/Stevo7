public class Main {

    public static void main(String[] args) {
        int ticketPrice = 30_000;
        byte mileCost = 20;
        int bonusMiles = ticketPrice / mileCost;
        System.out.println("Ваши бонусные мили - " + bonusMiles);
    }
}