package p050v;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import java.util.List;
import p045q.C2049c;
import p045q.C2066r;
import p049u.C2102a;
import p049u.C2103b;
import p049u.C2105d;
import p051w.C2140a;

/* renamed from: v.p */
/* compiled from: ShapeStroke */
public class C2134p implements C2117b {

    /* renamed from: a */
    private final String f6630a;
    @Nullable

    /* renamed from: b */
    private final C2103b f6631b;

    /* renamed from: c */
    private final List<C2103b> f6632c;

    /* renamed from: d */
    private final C2102a f6633d;

    /* renamed from: e */
    private final C2105d f6634e;

    /* renamed from: f */
    private final C2103b f6635f;

    /* renamed from: g */
    private final C2136b f6636g;

    /* renamed from: h */
    private final C2137c f6637h;

    /* renamed from: i */
    private final float f6638i;

    /* renamed from: j */
    private final boolean f6639j;

    /* renamed from: v.p$a */
    /* compiled from: ShapeStroke */
    static /* synthetic */ class C2135a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6640a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6641b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                v.p$c[] r0 = p050v.C2134p.C2137c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6641b = r0
                r1 = 1
                v.p$c r2 = p050v.C2134p.C2137c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6641b     // Catch:{ NoSuchFieldError -> 0x001d }
                v.p$c r3 = p050v.C2134p.C2137c.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6641b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.p$c r4 = p050v.C2134p.C2137c.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                v.p$b[] r3 = p050v.C2134p.C2136b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6640a = r3
                v.p$b r4 = p050v.C2134p.C2136b.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f6640a     // Catch:{ NoSuchFieldError -> 0x0043 }
                v.p$b r3 = p050v.C2134p.C2136b.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f6640a     // Catch:{ NoSuchFieldError -> 0x004d }
                v.p$b r1 = p050v.C2134p.C2136b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050v.C2134p.C2135a.<clinit>():void");
        }
    }

    /* renamed from: v.p$b */
    /* compiled from: ShapeStroke */
    public enum C2136b {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: b */
        public Paint.Cap mo24332b() {
            int i = C2135a.f6640a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    /* renamed from: v.p$c */
    /* compiled from: ShapeStroke */
    public enum C2137c {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: b */
        public Paint.Join mo24333b() {
            int i = C2135a.f6641b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public C2134p(String str, @Nullable C2103b bVar, List<C2103b> list, C2102a aVar, C2105d dVar, C2103b bVar2, C2136b bVar3, C2137c cVar, float f, boolean z) {
        this.f6630a = str;
        this.f6631b = bVar;
        this.f6632c = list;
        this.f6633d = aVar;
        this.f6634e = dVar;
        this.f6635f = bVar2;
        this.f6636g = bVar3;
        this.f6637h = cVar;
        this.f6638i = f;
        this.f6639j = z;
    }

    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        return new C2066r(fVar, aVar, this);
    }

    /* renamed from: b */
    public C2136b mo24322b() {
        return this.f6636g;
    }

    /* renamed from: c */
    public C2102a mo24323c() {
        return this.f6633d;
    }

    /* renamed from: d */
    public C2103b mo24324d() {
        return this.f6631b;
    }

    /* renamed from: e */
    public C2137c mo24325e() {
        return this.f6637h;
    }

    /* renamed from: f */
    public List<C2103b> mo24326f() {
        return this.f6632c;
    }

    /* renamed from: g */
    public float mo24327g() {
        return this.f6638i;
    }

    /* renamed from: h */
    public String mo24328h() {
        return this.f6630a;
    }

    /* renamed from: i */
    public C2105d mo24329i() {
        return this.f6634e;
    }

    /* renamed from: j */
    public C2103b mo24330j() {
        return this.f6635f;
    }

    /* renamed from: k */
    public boolean mo24331k() {
        return this.f6639j;
    }
}
