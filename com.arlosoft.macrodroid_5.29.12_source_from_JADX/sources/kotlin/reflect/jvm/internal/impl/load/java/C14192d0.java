package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p362pb.C16152c;
import p362pb.C16155e;
import p370qa.C16265l;
import p442yb.C16986f;
import p442yb.C17005h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.d0 */
/* compiled from: JavaNullabilityAnnotationSettings.kt */
public final class C14192d0<T> implements C14167c0<T> {

    /* renamed from: b */
    private final Map<C16152c, T> f62878b;

    /* renamed from: c */
    private final C16986f f62879c;

    /* renamed from: d */
    private final C17005h<C16152c, T> f62880d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.d0$a */
    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    static final class C14193a extends C13708q implements C16265l<C16152c, T> {
        final /* synthetic */ C14192d0<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14193a(C14192d0<T> d0Var) {
            super(1);
            this.this$0 = d0Var;
        }

        /* renamed from: a */
        public final T invoke(C16152c cVar) {
            C13706o.m87928e(cVar, "it");
            return C16155e.m97010a(cVar, this.this$0.mo72719b());
        }
    }

    public C14192d0(Map<C16152c, ? extends T> map) {
        C13706o.m87929f(map, "states");
        this.f62878b = map;
        C16986f fVar = new C16986f("Java nullability annotation states");
        this.f62879c = fVar;
        C17005h<C16152c, T> b = fVar.mo80217b(new C14193a(this));
        C13706o.m87928e(b, "storageManager.createMem…cificFqname(states)\n    }");
        this.f62880d = b;
    }

    /* renamed from: a */
    public T mo72682a(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return this.f62880d.invoke(cVar);
    }

    /* renamed from: b */
    public final Map<C16152c, T> mo72719b() {
        return this.f62878b;
    }
}
