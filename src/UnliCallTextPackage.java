import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallTextOffer {

    private Map<String, Boolean> offerMap;

    public UnliCallTextPackage() {
        offerMap = new HashMap<>();
        // Example: populate telco offers
        offerMap.put("Globe", true);
        offerMap.put("Smart", false);
        offerMap.put("Sun", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        // Update the map if necessary
        offerMap.put(telcoName, unliCallText);

        Boolean isAvailable = offerMap.get(telcoName);

        if (isAvailable != null && isAvailable) {
            return telcoName + " unlimited calls and text: Available";
        } else {
            return telcoName + " unlimited calls and text: Not available";
        }
    }

    public Map<String, Boolean> getAllOffers() {
        return offerMap;
    }
}