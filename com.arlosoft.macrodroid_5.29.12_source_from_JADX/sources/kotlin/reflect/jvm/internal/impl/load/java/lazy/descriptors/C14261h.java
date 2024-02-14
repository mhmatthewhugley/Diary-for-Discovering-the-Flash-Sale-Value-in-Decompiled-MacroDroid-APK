package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14041z;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14222a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14298e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14458p;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14465r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14471w;
import p288ib.C12492g;
import p288ib.C12507u;
import p288ib.C12513z;
import p297ja.C13328m;
import p297ja.C13337s;
import p298jb.C13359a;
import p362pb.C16151b;
import p362pb.C16152c;
import p370qa.C16254a;
import p398tb.C16609d;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h */
/* compiled from: LazyJavaPackageFragment.kt */
public final class C14261h extends C14041z {

    /* renamed from: E */
    static final /* synthetic */ C16887m<Object>[] f63007E;

    /* renamed from: A */
    private final C14235d f63008A;

    /* renamed from: B */
    private final C17006i<List<C16152c>> f63009B;

    /* renamed from: C */
    private final C13921g f63010C;

    /* renamed from: D */
    private final C17006i f63011D;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C12507u f63012p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C14301g f63013s;

    /* renamed from: z */
    private final C17006i f63014z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h$a */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C14262a extends C13708q implements C16254a<Map<String, ? extends C14459q>> {
        final /* synthetic */ C14261h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14262a(C14261h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* renamed from: a */
        public final Map<String, C14459q> invoke() {
            C14471w o = this.this$0.f63013s.mo72914a().mo72777o();
            String b = this.this$0.mo72551e().mo78556b();
            C13706o.m87928e(b, "fqName.asString()");
            List<String> a = o.mo73216a(b);
            C14261h hVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (String str : a) {
                C16151b m = C16151b.m96975m(C16609d.m98929d(str).mo79456e());
                C13706o.m87928e(m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                C14459q b2 = C14458p.m90655b(hVar.f63013s.mo72914a().mo72772j(), m);
                C13328m a2 = b2 != null ? C13337s.m85692a(str, b2) : null;
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return C13615t0.m87768r(arrayList);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h$b */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C14263b extends C13708q implements C16254a<HashMap<C16609d, C16609d>> {
        final /* synthetic */ C14261h this$0;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h$b$a */
        /* compiled from: LazyJavaPackageFragment.kt */
        public /* synthetic */ class C14264a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f63015a;

            static {
                int[] iArr = new int[C13359a.C13360a.values().length];
                iArr[C13359a.C13360a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                iArr[C13359a.C13360a.FILE_FACADE.ordinal()] = 2;
                f63015a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14263b(C14261h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* renamed from: a */
        public final HashMap<C16609d, C16609d> invoke() {
            HashMap<C16609d, C16609d> hashMap = new HashMap<>();
            for (Map.Entry next : this.this$0.mo72855M0().entrySet()) {
                C16609d d = C16609d.m98929d((String) next.getKey());
                C13706o.m87928e(d, "byInternalName(partInternalName)");
                C13359a b = ((C14459q) next.getValue()).mo67427b();
                int i = C14264a.f63015a[b.mo70762c().ordinal()];
                if (i == 1) {
                    String e = b.mo70764e();
                    if (e != null) {
                        C16609d d2 = C16609d.m98929d(e);
                        C13706o.m87928e(d2, "byInternalName(header.mu…: continue@kotlinClasses)");
                        hashMap.put(d, d2);
                    }
                } else if (i == 2) {
                    hashMap.put(d, d);
                }
            }
            return hashMap;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h$c */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C14265c extends C13708q implements C16254a<List<? extends C16152c>> {
        final /* synthetic */ C14261h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14265c(C14261h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* renamed from: a */
        public final List<C16152c> invoke() {
            Collection<C12507u> t = this.this$0.f63012p.mo69007t();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(t, 10));
            for (C12507u e : t) {
                arrayList.add(e.mo69006e());
            }
            return arrayList;
        }
    }

    static {
        Class<C14261h> cls = C14261h.class;
        f63007E = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14261h(C14301g gVar, C12507u uVar) {
        super(gVar.mo72917d(), uVar.mo69006e());
        C13921g gVar2;
        C13706o.m87929f(gVar, "outerContext");
        C13706o.m87929f(uVar, "jPackage");
        this.f63012p = uVar;
        C14301g d = C14222a.m89811d(gVar, this, (C12513z) null, 0, 6, (Object) null);
        this.f63013s = d;
        this.f63014z = d.mo72918e().mo80221f(new C14262a(this));
        this.f63008A = new C14235d(d, uVar, this);
        this.f63009B = d.mo72918e().mo80216a(new C14265c(this), C13614t.m87748j());
        if (d.mo72914a().mo72771i().mo73092b()) {
            gVar2 = C13921g.f62330v.mo72251b();
        } else {
            gVar2 = C14298e.m90143a(d, uVar);
        }
        this.f63010C = gVar2;
        this.f63011D = d.mo72918e().mo80221f(new C14263b(this));
    }

    /* renamed from: L0 */
    public final C13948e mo72854L0(C12492g gVar) {
        C13706o.m87929f(gVar, "jClass");
        return this.f63008A.mo72801j().mo72861O(gVar);
    }

    /* renamed from: M0 */
    public final Map<String, C14459q> mo72855M0() {
        return (Map) C17011m.m100276a(this.f63014z, this, f63007E[0]);
    }

    /* renamed from: N0 */
    public C14235d mo72205n() {
        return this.f63008A;
    }

    /* renamed from: O0 */
    public final List<C16152c> mo72857O0() {
        return (List) this.f63009B.invoke();
    }

    public C13921g getAnnotations() {
        return this.f63010C;
    }

    public C14158z0 getSource() {
        return new C14465r(this);
    }

    public String toString() {
        return "Lazy Java package fragment: " + mo72551e() + " of module " + this.f63013s.mo72914a().mo72775m();
    }
}
