package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.g */
/* compiled from: modifierChecks.kt */
public abstract class C15006g {

    /* renamed from: a */
    private final boolean f64130a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.g$a */
    /* compiled from: modifierChecks.kt */
    public static final class C15007a extends C15006g {

        /* renamed from: b */
        public static final C15007a f64131b = new C15007a();

        private C15007a() {
            super(false, (C13695i) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.g$b */
    /* compiled from: modifierChecks.kt */
    public static final class C15008b extends C15006g {

        /* renamed from: b */
        private final String f64132b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15008b(String str) {
            super(false, (C13695i) null);
            C13706o.m87929f(str, "error");
            this.f64132b = str;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.g$c */
    /* compiled from: modifierChecks.kt */
    public static final class C15009c extends C15006g {

        /* renamed from: b */
        public static final C15009c f64133b = new C15009c();

        private C15009c() {
            super(true, (C13695i) null);
        }
    }

    private C15006g(boolean z) {
        this.f64130a = z;
    }

    public /* synthetic */ C15006g(boolean z, C13695i iVar) {
        this(z);
    }

    /* renamed from: a */
    public final boolean mo74268a() {
        return this.f64130a;
    }
}
