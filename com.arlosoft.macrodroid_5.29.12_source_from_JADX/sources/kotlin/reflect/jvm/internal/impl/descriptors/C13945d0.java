package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C13695i;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d0 */
/* compiled from: Modality.kt */
public enum C13945d0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    

    /* renamed from: a */
    public static final C13946a f62416a = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d0$a */
    /* compiled from: Modality.kt */
    public static final class C13946a {
        private C13946a() {
        }

        public /* synthetic */ C13946a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C13945d0 mo72279a(boolean z, boolean z2, boolean z3) {
            if (z) {
                return C13945d0.SEALED;
            }
            if (z2) {
                return C13945d0.ABSTRACT;
            }
            if (z3) {
                return C13945d0.OPEN;
            }
            return C13945d0.FINAL;
        }
    }

    static {
        f62416a = new C13946a((C13695i) null);
    }
}
