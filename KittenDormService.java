import java.util.HashMap;
import java.util.Map;

public class KittenDormService {
    private Map<String, Object> kittenData = new HashMap<>();

    public KittenDormService() {
        kittenData.put("Fluffy", 2);
        kittenData.put("Whiskers", 3);
    }

    public Map<String, Object> fetchKittenData(String kittenId) {
        Map<String, Object> data = new HashMap<>();
        if (kittenData.containsKey(kittenId)) {
            data.put("KittenName", kittenId);
            data.put("KittenAge", kittenData.get(kittenId));
        }
        return data;
    }

    public void addFoundKitten(RawKittenData foundKitten) {
        kittenData.put(foundKitten.getKittenName(), foundKitten.getKittenAge());
    }
}
