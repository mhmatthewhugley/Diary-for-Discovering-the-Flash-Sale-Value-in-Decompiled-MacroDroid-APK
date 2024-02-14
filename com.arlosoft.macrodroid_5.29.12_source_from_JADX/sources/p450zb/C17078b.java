package p450zb;

/* renamed from: zb.b */
/* compiled from: ErrorEntity.kt */
public enum C17078b {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");
    
    private final String debugText;

    private C17078b(String str) {
        this.debugText = str;
    }

    /* renamed from: d */
    public final String mo80345d() {
        return this.debugText;
    }
}
