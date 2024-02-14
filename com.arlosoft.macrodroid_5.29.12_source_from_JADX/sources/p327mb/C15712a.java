package p327mb;

import androidx.core.p007os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import org.apache.http.cookie.ClientCookie;
import p370qa.C16265l;

/* renamed from: mb.a */
/* compiled from: BinaryVersion.kt */
public abstract class C15712a {

    /* renamed from: f */
    public static final C15713a f65019f = new C15713a((C13695i) null);

    /* renamed from: a */
    private final int[] f65020a;

    /* renamed from: b */
    private final int f65021b;

    /* renamed from: c */
    private final int f65022c;

    /* renamed from: d */
    private final int f65023d;

    /* renamed from: e */
    private final List<Integer> f65024e;

    /* renamed from: mb.a$a */
    /* compiled from: BinaryVersion.kt */
    public static final class C15713a {
        private C15713a() {
        }

        public /* synthetic */ C15713a(C13695i iVar) {
            this();
        }
    }

    public C15712a(int... iArr) {
        List<Integer> list;
        C13706o.m87929f(iArr, "numbers");
        this.f65020a = iArr;
        Integer G = C13596m.m87582G(iArr, 0);
        int i = -1;
        this.f65021b = G != null ? G.intValue() : -1;
        Integer G2 = C13596m.m87582G(iArr, 1);
        this.f65022c = G2 != null ? G2.intValue() : -1;
        Integer G3 = C13596m.m87582G(iArr, 2);
        this.f65023d = G3 != null ? G3.intValue() : i;
        if (iArr.length <= 3) {
            list = C13614t.m87748j();
        } else if (iArr.length <= 1024) {
            list = C13566b0.m87402F0(C13593l.m87556c(iArr).subList(3, iArr.length));
        } else {
            throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + FilenameUtils.EXTENSION_SEPARATOR);
        }
        this.f65024e = list;
    }

    /* renamed from: a */
    public final int mo75147a() {
        return this.f65021b;
    }

    /* renamed from: b */
    public final int mo75148b() {
        return this.f65022c;
    }

    /* renamed from: c */
    public final boolean mo75149c(int i, int i2, int i3) {
        int i4 = this.f65021b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f65022c;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.f65023d >= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo75150d(C15712a aVar) {
        C13706o.m87929f(aVar, ClientCookie.VERSION_ATTR);
        return mo75149c(aVar.f65021b, aVar.f65022c, aVar.f65023d);
    }

    /* renamed from: e */
    public final boolean mo75151e(int i, int i2, int i3) {
        int i4 = this.f65021b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f65022c;
        if (i5 < i2) {
            return true;
        }
        if (i5 <= i2 && this.f65023d <= i3) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && C13706o.m87924a(getClass(), obj.getClass())) {
            C15712a aVar = (C15712a) obj;
            return this.f65021b == aVar.f65021b && this.f65022c == aVar.f65022c && this.f65023d == aVar.f65023d && C13706o.m87924a(this.f65024e, aVar.f65024e);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo75153f(p327mb.C15712a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ourVersion"
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            int r0 = r4.f65021b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0016
            int r0 = r5.f65021b
            if (r0 != 0) goto L_0x0021
            int r0 = r4.f65022c
            int r5 = r5.f65022c
            if (r0 != r5) goto L_0x0021
            goto L_0x0022
        L_0x0016:
            int r3 = r5.f65021b
            if (r0 != r3) goto L_0x0021
            int r0 = r4.f65022c
            int r5 = r5.f65022c
            if (r0 > r5) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p327mb.C15712a.mo75153f(mb.a):boolean");
    }

    /* renamed from: g */
    public final int[] mo75154g() {
        return this.f65020a;
    }

    public int hashCode() {
        int i = this.f65021b;
        int i2 = i + (i * 31) + this.f65022c;
        int i3 = i2 + (i2 * 31) + this.f65023d;
        return i3 + (i3 * 31) + this.f65024e.hashCode();
    }

    public String toString() {
        int[] g = mo75154g();
        ArrayList arrayList = new ArrayList();
        int length = g.length;
        for (int i = 0; i < length; i++) {
            int i2 = g[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? EnvironmentCompat.MEDIA_UNKNOWN : C13566b0.m87432g0(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);
    }
}
