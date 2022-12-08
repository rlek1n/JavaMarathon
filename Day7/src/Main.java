import football.Player;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("QA", 2000, 142.3, 1234.5);
        Airplane airplane2 = new Airplane("DevO", 1994, 320.3, 2203.2);
        int result = airplane1.compareAirplanes(airplane2);
        switch (result) {
            case -1 -> System.out.println("Нас самолёт короче");
            case 0 -> System.out.println("Самолёты равны");
            case 1 -> System.out.println("Наш самолет больше");
        }
        System.out.println();
        Player player1 = new Player((int) (Math.random() * 10 + 90));
        Player player2 = new Player((int) (Math.random() * 10 + 90));
        Player player3 = new Player((int) (Math.random() * 10 + 90));
        Player player4 = new Player((int) (Math.random() * 10 + 90));
        Player player5 = new Player((int) (Math.random() * 10 + 90));
        Player player6 = new Player((int) (Math.random() * 10 + 90));
        Player.info();
        for (int i = 0; i < 91; i++) {
            player1.run();
            player2.run();
            player3.run();
            player4.run();
            player5.run();
            player6.run();
        }
    }
}