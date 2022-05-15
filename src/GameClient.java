public class GameClient {
    public static void main(String[] args) {
        PCBasedGame Game1 = new PCBasedGame("CounterStrike", 256, 3000, 1.8);
        PCBasedGame Game2 = new PCBasedGame("NFL", 128, 1500, 1.5);
        System.out.println(Game1 + "\n" + Game2);
        if (Game1.equals(Game2))
            System.out.println("\n" + Game1.getDescription() + " and " + Game2.getDescription() + " are equal");
        else
            System.out.println("\n" + Game1.getDescription() + " and " + Game2.getDescription() + " are not equal");
        Game2.setDescription("CounterStrike");
        Game2.setRamMB(256);
        Game2.setHdMB(3000);
        Game2.setCpuGhz(1.8);
        System.out.println(Game1 + "\n" + Game2);
        if (Game1.equals(Game2))
            System.out.println("\n" + Game1.getDescription() + " and " + Game2.getDescription() + " are equal");
        else
            System.out.println("\n" + Game1.getDescription() + " and " + Game2.getDescription() + " are not equal");
    }
}
