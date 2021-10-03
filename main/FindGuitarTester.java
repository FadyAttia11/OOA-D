public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        Guitar guitar = inventory.search(whatErinLikes);

        if(guitar != null) {
            System.out.println(guitar);
        } else {
            System.out.println("No Guitar Found!");
        }
    }
}
