package p126l4;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p090f5.C7316k;

@RequiresApi(19)
/* renamed from: l4.m */
/* compiled from: SizeConfigStrategy */
public class C7683m implements C7681k {

    /* renamed from: d */
    private static final Bitmap.Config[] f18608d;

    /* renamed from: e */
    private static final Bitmap.Config[] f18609e;

    /* renamed from: f */
    private static final Bitmap.Config[] f18610f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    private static final Bitmap.Config[] f18611g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    private static final Bitmap.Config[] f18612h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final C7686c f18613a = new C7686c();

    /* renamed from: b */
    private final C7672g<C7685b, Bitmap> f18614b = new C7672g<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f18615c = new HashMap();

    /* renamed from: l4.m$a */
    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class C7684a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18616a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18616a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18616a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18616a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18616a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p126l4.C7683m.C7684a.<clinit>():void");
        }
    }

    @VisibleForTesting
    /* renamed from: l4.m$b */
    /* compiled from: SizeConfigStrategy */
    static final class C7685b implements C7682l {

        /* renamed from: a */
        private final C7686c f18617a;

        /* renamed from: b */
        int f18618b;

        /* renamed from: c */
        private Bitmap.Config f18619c;

        public C7685b(C7686c cVar) {
            this.f18617a = cVar;
        }

        /* renamed from: a */
        public void mo37706a() {
            this.f18617a.mo37689c(this);
        }

        /* renamed from: b */
        public void mo37723b(int i, Bitmap.Config config) {
            this.f18618b = i;
            this.f18619c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7685b)) {
                return false;
            }
            C7685b bVar = (C7685b) obj;
            if (this.f18618b != bVar.f18618b || !C7316k.m30208c(this.f18619c, bVar.f18619c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f18618b * 31;
            Bitmap.Config config = this.f18619c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C7683m.m32040h(this.f18618b, this.f18619c);
        }
    }

    @VisibleForTesting
    /* renamed from: l4.m$c */
    /* compiled from: SizeConfigStrategy */
    static class C7686c extends C7668c<C7685b> {
        C7686c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C7685b mo37687a() {
            return new C7685b(this);
        }

        /* renamed from: e */
        public C7685b mo37728e(int i, Bitmap.Config config) {
            C7685b bVar = (C7685b) mo37688b();
            bVar.mo37723b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f18608d = configArr;
        f18609e = configArr;
    }

    /* renamed from: f */
    private void m32038f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j = m32042j(bitmap.getConfig());
        Integer num2 = (Integer) j.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo37716a(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            j.remove(num);
        } else {
            j.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: g */
    private C7685b m32039g(int i, Bitmap.Config config) {
        C7685b e = this.f18613a.mo37728e(i, config);
        Bitmap.Config[] i2 = m32041i(config);
        int length = i2.length;
        int i3 = 0;
        while (i3 < length) {
            Bitmap.Config config2 = i2[i3];
            Integer ceilingKey = m32042j(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i3++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f18613a.mo37689c(e);
                return this.f18613a.mo37728e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: h */
    static String m32040h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: i */
    private static Bitmap.Config[] m32041i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f18609e;
        }
        int i = C7684a.f18616a[config.ordinal()];
        if (i == 1) {
            return f18608d;
        }
        if (i == 2) {
            return f18610f;
        }
        if (i == 3) {
            return f18611g;
        }
        if (i == 4) {
            return f18612h;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: j */
    private NavigableMap<Integer, Integer> m32042j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f18615c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f18615c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public String mo37716a(Bitmap bitmap) {
        return m32040h(C7316k.m30212g(bitmap), bitmap.getConfig());
    }

    /* renamed from: b */
    public String mo37717b(int i, int i2, Bitmap.Config config) {
        return m32040h(C7316k.m30211f(i, i2, config), config);
    }

    /* renamed from: c */
    public void mo37718c(Bitmap bitmap) {
        C7685b e = this.f18613a.mo37728e(C7316k.m30212g(bitmap), bitmap.getConfig());
        this.f18614b.mo37698d(e, bitmap);
        NavigableMap<Integer, Integer> j = m32042j(bitmap.getConfig());
        Integer num = (Integer) j.get(Integer.valueOf(e.f18618b));
        Integer valueOf = Integer.valueOf(e.f18618b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        j.put(valueOf, Integer.valueOf(i));
    }

    @Nullable
    /* renamed from: d */
    public Bitmap mo37719d(int i, int i2, Bitmap.Config config) {
        C7685b g = m32039g(C7316k.m30211f(i, i2, config), config);
        Bitmap a = this.f18614b.mo37697a(g);
        if (a != null) {
            m32038f(Integer.valueOf(g.f18618b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: e */
    public int mo37720e(Bitmap bitmap) {
        return C7316k.m30212g(bitmap);
    }

    @Nullable
    public Bitmap removeLast() {
        Bitmap f = this.f18614b.mo37699f();
        if (f != null) {
            m32038f(Integer.valueOf(C7316k.m30212g(f)), f);
        }
        return f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f18614b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f18615c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f18615c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
