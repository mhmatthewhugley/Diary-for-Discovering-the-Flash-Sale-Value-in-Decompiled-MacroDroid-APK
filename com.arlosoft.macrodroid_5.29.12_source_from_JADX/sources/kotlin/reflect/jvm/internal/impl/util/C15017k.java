package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.util.C15004f;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.k */
/* compiled from: modifierChecks.kt */
public abstract class C15017k implements C15004f {

    /* renamed from: a */
    private final String f64145a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.k$a */
    /* compiled from: modifierChecks.kt */
    public static final class C15018a extends C15017k {

        /* renamed from: b */
        public static final C15018a f64146b = new C15018a();

        private C15018a() {
            super("must be a member function", (C13695i) null);
        }

        /* renamed from: b */
        public boolean mo74266b(C14154y yVar) {
            C13706o.m87929f(yVar, "functionDescriptor");
            return yVar.mo72231L() != null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.k$b */
    /* compiled from: modifierChecks.kt */
    public static final class C15019b extends C15017k {

        /* renamed from: b */
        public static final C15019b f64147b = new C15019b();

        private C15019b() {
            super("must be a member or an extension function", (C13695i) null);
        }

        /* renamed from: b */
        public boolean mo74266b(C14154y yVar) {
            C13706o.m87929f(yVar, "functionDescriptor");
            return (yVar.mo72231L() == null && yVar.mo72232P() == null) ? false : true;
        }
    }

    private C15017k(String str) {
        this.f64145a = str;
    }

    public /* synthetic */ C15017k(String str, C13695i iVar) {
        this(str);
    }

    /* renamed from: a */
    public String mo74265a(C14154y yVar) {
        return C15004f.C15005a.m93212a(this, yVar);
    }

    public String getDescription() {
        return this.f64145a;
    }
}
