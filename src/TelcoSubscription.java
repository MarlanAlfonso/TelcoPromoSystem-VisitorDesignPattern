public interface TelcoSubscription {
    String accept(UsagePromo promo, String telcoName, double price);
    String accept(UnliCallTextOffer offer, String telcoName, boolean unliCallText);
}