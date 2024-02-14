package p090f5;

import android.graphics.Bitmap;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p146p4.C8101l;

/* renamed from: f5.k */
/* compiled from: Util */
public final class C7316k {

    /* renamed from: a */
    private static final char[] f17896a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f17897b = new char[64];

    /* renamed from: f5.k$a */
    /* compiled from: Util */
    static /* synthetic */ class C7317a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17898a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17898a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17898a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17898a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17898a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17898a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p090f5.C7316k.C7317a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m30206a() {
        if (!m30221p()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m30207b(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof C8101l) {
            return ((C8101l) obj).mo38117a(obj2);
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m30208c(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @NonNull
    /* renamed from: d */
    private static String m30209d(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f17896a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @NonNull
    /* renamed from: e */
    public static <T> Queue<T> m30210e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m30211f(int i, int i2, @Nullable Bitmap.Config config) {
        return i * i2 * m30213h(config);
    }

    /* renamed from: g */
    public static int m30212g(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    /* renamed from: h */
    private static int m30213h(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C7317a.f17898a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    @NonNull
    /* renamed from: i */
    public static <T> List<T> m30214i(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m30215j(float f) {
        return m30216k(f, 17);
    }

    /* renamed from: k */
    public static int m30216k(float f, int i) {
        return m30217l(Float.floatToIntBits(f), i);
    }

    /* renamed from: l */
    public static int m30217l(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: m */
    public static int m30218m(@Nullable Object obj, int i) {
        return m30217l(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: n */
    public static int m30219n(boolean z, int i) {
        return m30217l(z ? 1 : 0, i);
    }

    /* renamed from: o */
    public static boolean m30220o() {
        return !m30221p();
    }

    /* renamed from: p */
    public static boolean m30221p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    private static boolean m30222q(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: r */
    public static boolean m30223r(int i, int i2) {
        return m30222q(i) && m30222q(i2);
    }

    @NonNull
    /* renamed from: s */
    public static String m30224s(@NonNull byte[] bArr) {
        String d;
        char[] cArr = f17897b;
        synchronized (cArr) {
            d = m30209d(bArr, cArr);
        }
        return d;
    }
}
