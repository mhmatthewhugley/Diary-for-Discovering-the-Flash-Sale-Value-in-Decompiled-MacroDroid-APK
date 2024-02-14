package twitter4j;

public class ScopesImpl implements Scopes {
    private final String[] placeIds;

    ScopesImpl() {
        this.placeIds = new String[0];
    }

    public String[] getPlaceIds() {
        return this.placeIds;
    }

    public ScopesImpl(String[] strArr) {
        this.placeIds = strArr;
    }
}
