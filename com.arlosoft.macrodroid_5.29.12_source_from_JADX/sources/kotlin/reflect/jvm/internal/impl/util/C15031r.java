package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.util.C15004f;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.r */
/* compiled from: modifierChecks.kt */
public abstract class C15031r implements C15004f {

    /* renamed from: a */
    private final String f64206a;

    /* renamed from: b */
    private final C16265l<C13853h, C14900e0> f64207b;

    /* renamed from: c */
    private final String f64208c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$a */
    /* compiled from: modifierChecks.kt */
    public static final class C15032a extends C15031r {

        /* renamed from: d */
        public static final C15032a f64209d = new C15032a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$a$a */
        /* compiled from: modifierChecks.kt */
        static final class C15033a extends C13708q implements C16265l<C13853h, C14900e0> {

            /* renamed from: a */
            public static final C15033a f64210a = new C15033a();

            C15033a() {
                super(1);
            }

            /* renamed from: a */
            public final C14900e0 invoke(C13853h hVar) {
                C13706o.m87929f(hVar, "$this$null");
                C14951m0 n = hVar.mo72141n();
                C13706o.m87928e(n, "booleanType");
                return n;
            }
        }

        private C15032a() {
            super("Boolean", C15033a.f64210a, (C13695i) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$b */
    /* compiled from: modifierChecks.kt */
    public static final class C15034b extends C15031r {

        /* renamed from: d */
        public static final C15034b f64211d = new C15034b();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$b$a */
        /* compiled from: modifierChecks.kt */
        static final class C15035a extends C13708q implements C16265l<C13853h, C14900e0> {

            /* renamed from: a */
            public static final C15035a f64212a = new C15035a();

            C15035a() {
                super(1);
            }

            /* renamed from: a */
            public final C14900e0 invoke(C13853h hVar) {
                C13706o.m87929f(hVar, "$this$null");
                C14951m0 D = hVar.mo72113D();
                C13706o.m87928e(D, "intType");
                return D;
            }
        }

        private C15034b() {
            super("Int", C15035a.f64212a, (C13695i) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$c */
    /* compiled from: modifierChecks.kt */
    public static final class C15036c extends C15031r {

        /* renamed from: d */
        public static final C15036c f64213d = new C15036c();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$c$a */
        /* compiled from: modifierChecks.kt */
        static final class C15037a extends C13708q implements C16265l<C13853h, C14900e0> {

            /* renamed from: a */
            public static final C15037a f64214a = new C15037a();

            C15037a() {
                super(1);
            }

            /* renamed from: a */
            public final C14900e0 invoke(C13853h hVar) {
                C13706o.m87929f(hVar, "$this$null");
                C14951m0 Z = hVar.mo72132Z();
                C13706o.m87928e(Z, "unitType");
                return Z;
            }
        }

        private C15036c() {
            super("Unit", C15037a.f64214a, (C13695i) null);
        }
    }

    private C15031r(String str, C16265l<? super C13853h, ? extends C14900e0> lVar) {
        this.f64206a = str;
        this.f64207b = lVar;
        this.f64208c = "must return " + str;
    }

    public /* synthetic */ C15031r(String str, C16265l lVar, C13695i iVar) {
        this(str, lVar);
    }

    /* renamed from: a */
    public String mo74265a(C14154y yVar) {
        return C15004f.C15005a.m93212a(this, yVar);
    }

    /* renamed from: b */
    public boolean mo74266b(C14154y yVar) {
        C13706o.m87929f(yVar, "functionDescriptor");
        return C13706o.m87924a(yVar.getReturnType(), this.f64207b.invoke(C16519a.m98613f(yVar)));
    }

    public String getDescription() {
        return this.f64208c;
    }
}
