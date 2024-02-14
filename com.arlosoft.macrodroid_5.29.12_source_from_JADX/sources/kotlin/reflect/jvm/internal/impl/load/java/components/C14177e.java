package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14645v;
import p288ib.C12479a;
import p297ja.C13337s;
import p362pb.C16157f;
import p370qa.C16254a;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.e */
/* compiled from: JavaAnnotationMapper.kt */
public final class C14177e extends C14172b {

    /* renamed from: h */
    static final /* synthetic */ C16887m<Object>[] f62859h = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14177e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final C17006i f62860g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.e$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C14178a extends C13708q implements C16254a<Map<C16157f, ? extends C14645v>> {

        /* renamed from: a */
        public static final C14178a f62861a = new C14178a();

        C14178a() {
            super(0);
        }

        /* renamed from: a */
        public final Map<C16157f, C14645v> invoke() {
            return C13613s0.m87741f(C13337s.m85692a(C14174c.f62850a.mo72690b(), new C14645v("Deprecated in Java")));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14177e(C12479a aVar, C14301g gVar) {
        super(gVar, aVar, C13902k.C13903a.f62287y);
        C13706o.m87929f(gVar, "c");
        this.f62860g = gVar.mo72918e().mo80221f(C14178a.f62861a);
    }

    /* renamed from: a */
    public Map<C16157f, C14617g<?>> mo72240a() {
        return (Map) C17011m.m100276a(this.f62860g, this, f62859h[0]);
    }
}
