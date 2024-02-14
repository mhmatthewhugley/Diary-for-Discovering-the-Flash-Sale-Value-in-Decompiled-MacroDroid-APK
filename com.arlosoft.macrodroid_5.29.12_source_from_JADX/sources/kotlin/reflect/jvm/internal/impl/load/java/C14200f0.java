package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13695i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.f0 */
/* compiled from: ReportLevel.kt */
public enum C14200f0 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    

    /* renamed from: a */
    public static final C14201a f62885a = null;
    private final String description;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.f0$a */
    /* compiled from: ReportLevel.kt */
    public static final class C14201a {
        private C14201a() {
        }

        public /* synthetic */ C14201a(C13695i iVar) {
            this();
        }
    }

    static {
        f62885a = new C14201a((C13695i) null);
    }

    private C14200f0(String str) {
        this.description = str;
    }

    /* renamed from: d */
    public final boolean mo72728d() {
        return this == IGNORE;
    }

    /* renamed from: e */
    public final boolean mo72729e() {
        return this == WARN;
    }

    public final String getDescription() {
        return this.description;
    }
}
