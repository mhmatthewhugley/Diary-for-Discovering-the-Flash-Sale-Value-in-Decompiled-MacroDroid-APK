package twitter4j.media;

public final class Version {
    private static final String TITLE = "Twitter4J Media support";
    private static final String VERSION = "4.0.4";

    private Version() {
        throw new AssertionError();
    }

    public static String getVersion() {
        return VERSION;
    }

    public static void main(String[] strArr) {
        System.out.println("Twitter4J Media support 4.0.4");
    }
}
