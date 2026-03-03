public class TelcoPromo {

    public static void main(String[] args) {

        Telco smart = new Telco(15, 500, "Smart", false);
        Telco globe = new Telco(10, 450, "Globe", true);
        Telco ditto = new Telco(8, 400, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " +
                smart.accept(promo, smart.getTelcoName(), smart.getPromoPrice()));

        System.out.println("Globe Data Usage Offer and price: " +
                globe.accept(promo, globe.getTelcoName(), globe.getPromoPrice()));

        System.out.println("Ditto Data Usage Offer and price: " +
                ditto.accept(promo, ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " +
                smart.accept(unli, smart.getTelcoName(), smart.getUnliCallText()));

        System.out.println("Globe unlimited calls and text package: " +
                globe.accept(unli, globe.getTelcoName(), globe.getUnliCallText()));

        System.out.println("Ditto unlimited calls and text package: " +
                ditto.accept(unli, ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}