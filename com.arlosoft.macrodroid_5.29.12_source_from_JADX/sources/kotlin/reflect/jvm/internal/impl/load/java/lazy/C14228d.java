package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14174c;
import p288ib.C12479a;
import p288ib.C12486d;
import p362pb.C16152c;
import p370qa.C16265l;
import p442yb.C17005h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.d */
/* compiled from: LazyJavaAnnotations.kt */
public final class C14228d implements C13921g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14301g f62952a;

    /* renamed from: c */
    private final C12486d f62953c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f62954d;

    /* renamed from: f */
    private final C17005h<C12479a, C13915c> f62955f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.d$a */
    /* compiled from: LazyJavaAnnotations.kt */
    static final class C14229a extends C13708q implements C16265l<C12479a, C13915c> {
        final /* synthetic */ C14228d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14229a(C14228d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final C13915c invoke(C12479a aVar) {
            C13706o.m87929f(aVar, "annotation");
            return C14174c.f62850a.mo72693e(aVar, this.this$0.f62952a, this.this$0.f62954d);
        }
    }

    public C14228d(C14301g gVar, C12486d dVar, boolean z) {
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(dVar, "annotationOwner");
        this.f62952a = gVar;
        this.f62953c = dVar;
        this.f62954d = z;
        this.f62955f = gVar.mo72914a().mo72783u().mo80217b(new C14229a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r3.f62955f.invoke(r0);
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c mo72247H(p362pb.C16152c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            ib.d r0 = r3.f62953c
            ib.a r0 = r0.mo68961H(r4)
            if (r0 == 0) goto L_0x0017
            yb.h<ib.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r1 = r3.f62955f
            java.lang.Object r0 = r1.invoke(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c) r0
            if (r0 != 0) goto L_0x0021
        L_0x0017:
            kotlin.reflect.jvm.internal.impl.load.java.components.c r0 = kotlin.reflect.jvm.internal.impl.load.java.components.C14174c.f62850a
            ib.d r1 = r3.f62953c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g r2 = r3.f62952a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = r0.mo72689a(r4, r1, r2)
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.C14228d.mo72247H(pb.c):kotlin.reflect.jvm.internal.impl.descriptors.annotations.c");
    }

    public boolean isEmpty() {
        return this.f62953c.getAnnotations().isEmpty() && !this.f62953c.mo68962I();
    }

    public Iterator<C13915c> iterator() {
        return C15132p.m93487p(C15132p.m93497z(C15132p.m93494w(C13566b0.m87412N(this.f62953c.getAnnotations()), this.f62955f), C14174c.f62850a.mo72689a(C13902k.C13903a.f62287y, this.f62953c, this.f62952a))).iterator();
    }

    /* renamed from: n1 */
    public boolean mo72249n1(C16152c cVar) {
        return C13921g.C13924b.m88505b(this, cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14228d(C14301g gVar, C12486d dVar, boolean z, int i, C13695i iVar) {
        this(gVar, dVar, (i & 4) != 0 ? false : z);
    }
}
