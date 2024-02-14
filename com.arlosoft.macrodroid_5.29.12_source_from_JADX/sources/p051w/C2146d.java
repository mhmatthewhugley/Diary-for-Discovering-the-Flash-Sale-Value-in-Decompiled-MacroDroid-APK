package p051w;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C1463d;
import java.util.List;
import java.util.Locale;
import org.apache.commons.p353io.IOUtils;
import p012b0.C1397a;
import p049u.C2103b;
import p049u.C2111j;
import p049u.C2112k;
import p049u.C2113l;
import p050v.C2117b;
import p050v.C2122g;

/* renamed from: w.d */
/* compiled from: Layer */
public class C2146d {

    /* renamed from: a */
    private final List<C2117b> f6697a;

    /* renamed from: b */
    private final C1463d f6698b;

    /* renamed from: c */
    private final String f6699c;

    /* renamed from: d */
    private final long f6700d;

    /* renamed from: e */
    private final C2147a f6701e;

    /* renamed from: f */
    private final long f6702f;
    @Nullable

    /* renamed from: g */
    private final String f6703g;

    /* renamed from: h */
    private final List<C2122g> f6704h;

    /* renamed from: i */
    private final C2113l f6705i;

    /* renamed from: j */
    private final int f6706j;

    /* renamed from: k */
    private final int f6707k;

    /* renamed from: l */
    private final int f6708l;

    /* renamed from: m */
    private final float f6709m;

    /* renamed from: n */
    private final float f6710n;

    /* renamed from: o */
    private final int f6711o;

    /* renamed from: p */
    private final int f6712p;
    @Nullable

    /* renamed from: q */
    private final C2111j f6713q;
    @Nullable

    /* renamed from: r */
    private final C2112k f6714r;
    @Nullable

    /* renamed from: s */
    private final C2103b f6715s;

    /* renamed from: t */
    private final List<C1397a<Float>> f6716t;

    /* renamed from: u */
    private final C2148b f6717u;

    /* renamed from: v */
    private final boolean f6718v;

    /* renamed from: w.d$a */
    /* compiled from: Layer */
    public enum C2147a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: w.d$b */
    /* compiled from: Layer */
    public enum C2148b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C2146d(List<C2117b> list, C1463d dVar, String str, long j, C2147a aVar, long j2, @Nullable String str2, List<C2122g> list2, C2113l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable C2111j jVar, @Nullable C2112k kVar, List<C1397a<Float>> list3, C2148b bVar, @Nullable C2103b bVar2, boolean z) {
        this.f6697a = list;
        this.f6698b = dVar;
        this.f6699c = str;
        this.f6700d = j;
        this.f6701e = aVar;
        this.f6702f = j2;
        this.f6703g = str2;
        this.f6704h = list2;
        this.f6705i = lVar;
        this.f6706j = i;
        this.f6707k = i2;
        this.f6708l = i3;
        this.f6709m = f;
        this.f6710n = f2;
        this.f6711o = i4;
        this.f6712p = i5;
        this.f6713q = jVar;
        this.f6714r = kVar;
        this.f6716t = list3;
        this.f6717u = bVar;
        this.f6715s = bVar2;
        this.f6718v = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1463d mo24352a() {
        return this.f6698b;
    }

    /* renamed from: b */
    public long mo24353b() {
        return this.f6700d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C1397a<Float>> mo24354c() {
        return this.f6716t;
    }

    /* renamed from: d */
    public C2147a mo24355d() {
        return this.f6701e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<C2122g> mo24356e() {
        return this.f6704h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C2148b mo24357f() {
        return this.f6717u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo24358g() {
        return this.f6699c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo24359h() {
        return this.f6702f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo24360i() {
        return this.f6712p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo24361j() {
        return this.f6711o;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: k */
    public String mo24362k() {
        return this.f6703g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<C2117b> mo24363l() {
        return this.f6697a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo24364m() {
        return this.f6708l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo24365n() {
        return this.f6707k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo24366o() {
        return this.f6706j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public float mo24367p() {
        return this.f6710n / this.f6698b.mo17056e();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: q */
    public C2111j mo24368q() {
        return this.f6713q;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: r */
    public C2112k mo24369r() {
        return this.f6714r;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: s */
    public C2103b mo24370s() {
        return this.f6715s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public float mo24371t() {
        return this.f6709m;
    }

    public String toString() {
        return mo24375w("");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C2113l mo24373u() {
        return this.f6705i;
    }

    /* renamed from: v */
    public boolean mo24374v() {
        return this.f6718v;
    }

    /* renamed from: w */
    public String mo24375w(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo24358g());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        C2146d s = this.f6698b.mo17070s(mo24359h());
        if (s != null) {
            sb.append("\t\tParents: ");
            sb.append(s.mo24358g());
            C2146d s2 = this.f6698b.mo17070s(s.mo24359h());
            while (s2 != null) {
                sb.append("->");
                sb.append(s2.mo24358g());
                s2 = this.f6698b.mo17070s(s2.mo24359h());
            }
            sb.append(str);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (!mo24356e().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(mo24356e().size());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (!(mo24366o() == 0 || mo24365n() == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(mo24366o()), Integer.valueOf(mo24365n()), Integer.valueOf(mo24364m())}));
        }
        if (!this.f6697a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (C2117b next : this.f6697a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sb.toString();
    }
}
