package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.util.C15004f;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.t */
/* compiled from: modifierChecks.kt */
public abstract class C15040t implements C15004f {

    /* renamed from: a */
    private final String f64217a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.t$a */
    /* compiled from: modifierChecks.kt */
    public static final class C15041a extends C15040t {

        /* renamed from: b */
        private final int f64218b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C15041a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L_0x0018
                java.lang.String r1 = "s"
                goto L_0x001a
            L_0x0018:
                java.lang.String r1 = ""
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f64218b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.C15040t.C15041a.<init>(int):void");
        }

        /* renamed from: b */
        public boolean mo74266b(C14154y yVar) {
            C13706o.m87929f(yVar, "functionDescriptor");
            return yVar.mo72235g().size() >= this.f64218b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.t$b */
    /* compiled from: modifierChecks.kt */
    public static final class C15042b extends C15040t {

        /* renamed from: b */
        private final int f64219b;

        public C15042b(int i) {
            super("must have exactly " + i + " value parameters", (C13695i) null);
            this.f64219b = i;
        }

        /* renamed from: b */
        public boolean mo74266b(C14154y yVar) {
            C13706o.m87929f(yVar, "functionDescriptor");
            return yVar.mo72235g().size() == this.f64219b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.t$c */
    /* compiled from: modifierChecks.kt */
    public static final class C15043c extends C15040t {

        /* renamed from: b */
        public static final C15043c f64220b = new C15043c();

        private C15043c() {
            super("must have no value parameters", (C13695i) null);
        }

        /* renamed from: b */
        public boolean mo74266b(C14154y yVar) {
            C13706o.m87929f(yVar, "functionDescriptor");
            return yVar.mo72235g().isEmpty();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.t$d */
    /* compiled from: modifierChecks.kt */
    public static final class C15044d extends C15040t {

        /* renamed from: b */
        public static final C15044d f64221b = new C15044d();

        private C15044d() {
            super("must have a single value parameter", (C13695i) null);
        }

        /* renamed from: b */
        public boolean mo74266b(C14154y yVar) {
            C13706o.m87929f(yVar, "functionDescriptor");
            return yVar.mo72235g().size() == 1;
        }
    }

    private C15040t(String str) {
        this.f64217a = str;
    }

    public /* synthetic */ C15040t(String str, C13695i iVar) {
        this(str);
    }

    /* renamed from: a */
    public String mo74265a(C14154y yVar) {
        return C15004f.C15005a.m93212a(this, yVar);
    }

    public String getDescription() {
        return this.f64217a;
    }
}
