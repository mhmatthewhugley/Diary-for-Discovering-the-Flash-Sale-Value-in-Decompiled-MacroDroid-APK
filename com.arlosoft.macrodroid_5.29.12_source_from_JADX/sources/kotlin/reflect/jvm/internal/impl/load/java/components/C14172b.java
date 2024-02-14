package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p271gb.C12336g;
import p288ib.C12482b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.b */
/* compiled from: JavaAnnotationMapper.kt */
public class C14172b implements C13915c, C12336g {

    /* renamed from: f */
    static final /* synthetic */ C16887m<Object>[] f62843f = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14172b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    private final C16152c f62844a;

    /* renamed from: b */
    private final C14158z0 f62845b;

    /* renamed from: c */
    private final C17006i f62846c;

    /* renamed from: d */
    private final C12482b f62847d;

    /* renamed from: e */
    private final boolean f62848e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.b$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C14173a extends C13708q implements C16254a<C14951m0> {

        /* renamed from: $c */
        final /* synthetic */ C14301g f62849$c;
        final /* synthetic */ C14172b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14173a(C14301g gVar, C14172b bVar) {
            super(0);
            this.f62849$c = gVar;
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final C14951m0 invoke() {
            C14951m0 p = this.f62849$c.mo72917d().mo72296m().mo72142o(this.this$0.mo72241e()).mo72274p();
            C13706o.m87928e(p, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return p;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        r2 = r3.getArguments();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14172b(kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g r2, p288ib.C12479a r3, p362pb.C16152c r4) {
        /*
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            r1.<init>()
            r1.f62844a = r4
            if (r3 == 0) goto L_0x0020
            kotlin.reflect.jvm.internal.impl.load.java.lazy.b r4 = r2.mo72914a()
            hb.b r4 = r4.mo72782t()
            hb.a r4 = r4.mo67445a(r3)
            if (r4 == 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = kotlin.reflect.jvm.internal.impl.descriptors.C14158z0.f62778a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.C13706o.m87928e(r4, r0)
        L_0x0027:
            r1.f62845b = r4
            yb.n r4 = r2.mo72918e()
            kotlin.reflect.jvm.internal.impl.load.java.components.b$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.b$a
            r0.<init>(r2, r1)
            yb.i r2 = r4.mo80221f(r0)
            r1.f62846c = r2
            if (r3 == 0) goto L_0x0047
            java.util.Collection r2 = r3.getArguments()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = kotlin.collections.C13566b0.m87423X(r2)
            ib.b r2 = (p288ib.C12482b) r2
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            r1.f62847d = r2
            r2 = 1
            r4 = 0
            if (r3 == 0) goto L_0x0055
            boolean r3 = r3.mo68951f()
            if (r3 != r2) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            r1.f62848e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.C14172b.<init>(kotlin.reflect.jvm.internal.impl.load.java.lazy.g, ib.a, pb.c):void");
    }

    /* renamed from: a */
    public Map<C16157f, C14617g<?>> mo72240a() {
        return C13615t0.m87759i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C12482b mo72686b() {
        return this.f62847d;
    }

    /* renamed from: c */
    public C14951m0 getType() {
        return (C14951m0) C17011m.m100276a(this.f62846c, this, f62843f[0]);
    }

    /* renamed from: e */
    public C16152c mo72241e() {
        return this.f62844a;
    }

    /* renamed from: f */
    public boolean mo68666f() {
        return this.f62848e;
    }

    public C14158z0 getSource() {
        return this.f62845b;
    }
}
