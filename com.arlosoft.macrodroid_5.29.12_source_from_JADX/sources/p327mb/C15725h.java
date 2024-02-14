package p327mb;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p308kb.C13530v;
import p308kb.C13537w;

/* renamed from: mb.h */
/* compiled from: VersionRequirement.kt */
public final class C15725h {

    /* renamed from: b */
    public static final C15726a f65073b = new C15726a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C15725h f65074c = new C15725h(C13614t.m87748j());

    /* renamed from: a */
    private final List<C13530v> f65075a;

    /* renamed from: mb.h$a */
    /* compiled from: VersionRequirement.kt */
    public static final class C15726a {
        private C15726a() {
        }

        public /* synthetic */ C15726a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C15725h mo75167a(C13537w wVar) {
            C13706o.m87929f(wVar, "table");
            if (wVar.mo71630x() == 0) {
                return mo75168b();
            }
            List<C13530v> y = wVar.mo71631y();
            C13706o.m87928e(y, "table.requirementList");
            return new C15725h(y, (C13695i) null);
        }

        /* renamed from: b */
        public final C15725h mo75168b() {
            return C15725h.f65074c;
        }
    }

    private C15725h(List<C13530v> list) {
        this.f65075a = list;
    }

    public /* synthetic */ C15725h(List list, C13695i iVar) {
        this(list);
    }
}
