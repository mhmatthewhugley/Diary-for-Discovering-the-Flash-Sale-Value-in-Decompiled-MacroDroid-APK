package kotlin.reflect.jvm.internal.impl.types;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.r1 */
/* compiled from: Variance.kt */
public enum C14970r1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    private C14970r1(String str, boolean z, boolean z2, int i) {
        this.label = str;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i;
    }

    /* renamed from: d */
    public final boolean mo74232d() {
        return this.allowsOutPosition;
    }

    /* renamed from: e */
    public final String mo74233e() {
        return this.label;
    }

    public String toString() {
        return this.label;
    }
}
