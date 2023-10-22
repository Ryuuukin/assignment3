import java.util.HashMap;
import java.util.Map;

public class KittenDormService {
    private Map<String, Object> kittenData = new HashMap<>();

    public KittenDormService() {
        // Initialize with some initial data (for demonstration)
        kittenData.put("Fluffy", 2);
        kittenData.put("Whiskers", 3);
    }

    public Map<String, Object> fetchKittenData(String kittenId) {
        // Retrieve kitten data by ID (in this case, kitten name)
        Map<String, Object> data = new HashMap<>();
        if (kittenData.containsKey(kittenId)) {
            data.put("KittenName", kittenId);
            data.put("KittenAge", kittenData.get(kittenId));
        }
        return data;
    }

    public void addFoundKitten(RawKittenData foundKitten) {
        // Add found kitten to the service's data
        kittenData.put(foundKitten.getKittenName(), foundKitten.getKittenAge());
    }
}
