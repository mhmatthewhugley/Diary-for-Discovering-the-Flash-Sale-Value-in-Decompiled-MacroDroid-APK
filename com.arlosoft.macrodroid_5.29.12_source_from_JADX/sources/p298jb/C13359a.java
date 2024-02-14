package p298jb;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p349ob.C15834e;

/* renamed from: jb.a */
/* compiled from: KotlinClassHeader.kt */
public final class C13359a {

    /* renamed from: a */
    private final C13360a f61357a;

    /* renamed from: b */
    private final C15834e f61358b;

    /* renamed from: c */
    private final String[] f61359c;

    /* renamed from: d */
    private final String[] f61360d;

    /* renamed from: e */
    private final String[] f61361e;

    /* renamed from: f */
    private final String f61362f;

    /* renamed from: g */
    private final int f61363g;

    /* renamed from: h */
    private final String f61364h;

    /* renamed from: i */
    private final byte[] f61365i;

    /* renamed from: jb.a$a */
    /* compiled from: KotlinClassHeader.kt */
    public enum C13360a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: a */
        public static final C13361a f61366a = null;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final Map<Integer, C13360a> f61367c = null;

        /* renamed from: id */
        private final int f61375id;

        /* renamed from: jb.a$a$a */
        /* compiled from: KotlinClassHeader.kt */
        public static final class C13361a {
            private C13361a() {
            }

            public /* synthetic */ C13361a(C13695i iVar) {
                this();
            }

            /* renamed from: a */
            public final C13360a mo70771a(int i) {
                C13360a aVar = (C13360a) C13360a.f61367c.get(Integer.valueOf(i));
                return aVar == null ? C13360a.UNKNOWN : aVar;
            }
        }

        static {
            int i;
            f61366a = new C13361a((C13695i) null);
            C13360a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(values.length), 16));
            for (C13360a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f61375id), aVar);
            }
            f61367c = linkedHashMap;
        }

        private C13360a(int i) {
            this.f61375id = i;
        }

        /* renamed from: e */
        public static final C13360a m85707e(int i) {
            return f61366a.mo70771a(i);
        }
    }

    public C13359a(C13360a aVar, C15834e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        C13706o.m87929f(aVar, "kind");
        C13706o.m87929f(eVar, "metadataVersion");
        this.f61357a = aVar;
        this.f61358b = eVar;
        this.f61359c = strArr;
        this.f61360d = strArr2;
        this.f61361e = strArr3;
        this.f61362f = str;
        this.f61363g = i;
        this.f61364h = str2;
        this.f61365i = bArr;
    }

    /* renamed from: h */
    private final boolean m85694h(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public final String[] mo70760a() {
        return this.f61359c;
    }

    /* renamed from: b */
    public final String[] mo70761b() {
        return this.f61360d;
    }

    /* renamed from: c */
    public final C13360a mo70762c() {
        return this.f61357a;
    }

    /* renamed from: d */
    public final C15834e mo70763d() {
        return this.f61358b;
    }

    /* renamed from: e */
    public final String mo70764e() {
        String str = this.f61362f;
        if (this.f61357a == C13360a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final List<String> mo70765f() {
        String[] strArr = this.f61359c;
        List<String> list = null;
        if (!(this.f61357a == C13360a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        if (strArr != null) {
            list = C13593l.m87557d(strArr);
        }
        return list == null ? C13614t.m87748j() : list;
    }

    /* renamed from: g */
    public final String[] mo70766g() {
        return this.f61361e;
    }

    /* renamed from: i */
    public final boolean mo70767i() {
        return m85694h(this.f61363g, 2);
    }

    /* renamed from: j */
    public final boolean mo70768j() {
        return m85694h(this.f61363g, 64) && !m85694h(this.f61363g, 32);
    }

    /* renamed from: k */
    public final boolean mo70769k() {
        return m85694h(this.f61363g, 16) && !m85694h(this.f61363g, 32);
    }

    public String toString() {
        return this.f61357a + " version=" + this.f61358b;
    }
}
