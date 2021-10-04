import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.search(whatErinLikes);

        if(!matchingGuitars.isEmpty()) {
            System.out.println("we might have a guitar for you");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec guitarSpec = guitar.getSpec();
                System.out.println(" We have a " +
                        guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
                        guitarSpec.getType() + " guitar:\n " +
                        guitarSpec.getBackWood() + " back and sides,\n " +
                        guitarSpec.getTopWood() + " top.\n You can have it for only $" +
                        guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("No Guitar Found!");
        }
    }
}
