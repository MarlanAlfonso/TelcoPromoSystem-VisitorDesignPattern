import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {

    private static Map<String, String> allowanceDescMap = new HashMap<>();

    static {
        allowanceDescMap.put("Smart", "Smart Data Usage Offer");
        allowanceDescMap.put("Globe", "Globe Data Usage Offer");
        allowanceDescMap.put("Ditto", "Ditto Data Usage Offer");
    }

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        String description = allowanceDescMap.getOrDefault(telcoName, telcoName + " promo");
        return description + " at " + (int) promoPrice;
    }
}