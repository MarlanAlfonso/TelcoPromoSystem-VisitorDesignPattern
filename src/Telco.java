public class Telco implements TelcoSubscription {

    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, String telcoName, double price) {
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallTextOffer offer, String telcoName, boolean unliCallText) {
        return offer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }
}