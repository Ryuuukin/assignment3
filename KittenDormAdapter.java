import java.util.Map;

public class KittenDormAdapter implements KittenDormClient {
    private final KittenDormService adaptee;

    public KittenDormAdapter(KittenDormService adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public KittenInfo getKittenInfo(String collarName) {
        Map<String, Object> rawKittenData = adaptee.fetchKittenData(collarName);
        KittenInfo kittenInfo = convertToKittenInfo(rawKittenData);
        return kittenInfo;
    }

    private KittenInfo convertToKittenInfo(Map<String, Object> rawKittenData) {
        String name = (String) rawKittenData.get("KittenName");
        if (rawKittenData.containsKey("KittenAge")) {
            int age = (int) rawKittenData.get("KittenAge");
            return new KittenInfo(name, age);
        } else {
            return null;
        }
    }
}
