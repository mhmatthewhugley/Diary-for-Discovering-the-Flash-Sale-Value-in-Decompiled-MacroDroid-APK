package p345o7;

/* renamed from: o7.d */
/* compiled from: Protocol */
public enum C15814d {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String protocol;

    private C15814d(String str) {
        this.protocol = str;
    }

    public String toString() {
        return this.protocol;
    }
}
