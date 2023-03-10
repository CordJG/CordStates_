package app;
import app.product.*;
import app.product.subproduct.*;


public class Menu {
    private final Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }

    public void printMenu(){
        System.out.println("[π»] λ©λ΄");
        System.out.println("-".repeat(60));

        printHamburgers(true);
        printSides(true);
        printDrinks(true);

        System.out.println(" ");
        System.out.println("π (0) μ₯λ°κ΅¬λ");
        System.out.println("π° (+) μ£Όλ¬ΈνκΈ°");
        System.out.println("-".repeat(60));
        System.out.println("[π’] λ©λ΄λ₯Ό μ νν΄μ£ΌμΈμ : ");
    }

    protected void printDrinks(boolean printPirce) {
        System.out.println("π₯€ μλ£");
        for(Product product : products){
            if(product instanceof Drink){
                printEachMenu(product, printPirce);
            }
        }

        System.out.println(" ");
    }

    protected void printSides(boolean printPirce) {
        System.out.println("π μ¬μ΄λ");
        for(Product product : products){
            if(product instanceof Side){
                printEachMenu(product,printPirce);
            }
        }
        System.out.println("   ");
    }

    protected void printHamburgers(boolean printPirce) {
        System.out.println("π νλ²κ±°");
        for(Product product : products) {
            if(product instanceof Hamburger) {
                printEachMenu(product,printPirce);
            }
        }
        System.out.println("                                             ");
    }

    private static void printEachMenu(Product product, boolean printPrice) {
        if(printPrice) System.out.printf("   (%d) %s %5dKcal %5dμ\n", product.getId(), product.getName(), product.getKcal(), product.getPrice());
        else System.out.printf("   (%d) %s %5dKcal\n", product.getId(), product.getName(), product.getKcal());

    }
}
