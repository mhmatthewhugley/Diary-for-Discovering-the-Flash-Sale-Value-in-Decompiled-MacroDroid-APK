package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14053l0;
import p217bb.C11117a;
import p217bb.C11119b;
import p217bb.C11120c;
import p297ja.C13321g;
import p297ja.C13326k;
import p370qa.C16254a;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a */
/* compiled from: BuiltInsLoader.kt */
public interface C13843a {

    /* renamed from: a */
    public static final C13844a f62061a = C13844a.f62062a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a */
    /* compiled from: BuiltInsLoader.kt */
    public static final class C13844a {

        /* renamed from: a */
        static final /* synthetic */ C13844a f62062a = new C13844a();

        /* renamed from: b */
        private static final C13321g<C13843a> f62063b = C13323i.m85668a(C13326k.PUBLICATION, C13845a.f62064a);

        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a$a */
        /* compiled from: BuiltInsLoader.kt */
        static final class C13845a extends C13708q implements C16254a<C13843a> {

            /* renamed from: a */
            public static final C13845a f62064a = new C13845a();

            C13845a() {
                super(0);
            }

            /* renamed from: a */
            public final C13843a invoke() {
                Class<C13843a> cls = C13843a.class;
                ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
                C13706o.m87928e(load, "implementations");
                C13843a aVar = (C13843a) C13566b0.m87423X(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        private C13844a() {
        }

        /* renamed from: a */
        public final C13843a mo72106a() {
            return f62063b.getValue();
        }
    }

    /* renamed from: a */
    C14053l0 mo72105a(C17012n nVar, C13958g0 g0Var, Iterable<? extends C11119b> iterable, C11120c cVar, C11117a aVar, boolean z);
}
