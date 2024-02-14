package p126l4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: l4.j */
/* compiled from: LruBitmapPool */
public class C7678j implements C7669d {

    /* renamed from: k */
    private static final Bitmap.Config f18597k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final C7681k f18598a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f18599b;

    /* renamed from: c */
    private final long f18600c;

    /* renamed from: d */
    private final C7679a f18601d;

    /* renamed from: e */
    private long f18602e;

    /* renamed from: f */
    private long f18603f;

    /* renamed from: g */
    private int f18604g;

    /* renamed from: h */
    private int f18605h;

    /* renamed from: i */
    private int f18606i;

    /* renamed from: j */
    private int f18607j;

    /* renamed from: l4.j$a */
    /* compiled from: LruBitmapPool */
    private interface C7679a {
        /* renamed from: a */
        void mo37714a(Bitmap bitmap);

        /* renamed from: b */
        void mo37715b(Bitmap bitmap);
    }

    /* renamed from: l4.j$b */
    /* compiled from: LruBitmapPool */
    private static final class C7680b implements C7679a {
        C7680b() {
        }

        /* renamed from: a */
        public void mo37714a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo37715b(Bitmap bitmap) {
        }
    }

    C7678j(long j, C7681k kVar, Set<Bitmap.Config> set) {
        this.f18600c = j;
        this.f18602e = j;
        this.f18598a = kVar;
        this.f18599b = set;
        this.f18601d = new C7680b();
    }

    /* renamed from: f */
    private static void m32011f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    /* renamed from: g */
    private static Bitmap m32012g(int i, int i2, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f18597k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    private void m32013h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m32014i();
        }
    }

    /* renamed from: i */
    private void m32014i() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f18604g);
        sb.append(", misses=");
        sb.append(this.f18605h);
        sb.append(", puts=");
        sb.append(this.f18606i);
        sb.append(", evictions=");
        sb.append(this.f18607j);
        sb.append(", currentSize=");
        sb.append(this.f18603f);
        sb.append(", maxSize=");
        sb.append(this.f18602e);
        sb.append("\nStrategy=");
        sb.append(this.f18598a);
    }

    /* renamed from: j */
    private void m32015j() {
        m32021q(this.f18602e);
    }

    /* renamed from: k */
    private static Set<Bitmap.Config> m32016k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static C7681k m32017l() {
        return new C7683m();
    }

    @Nullable
    /* renamed from: m */
    private synchronized Bitmap m32018m(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap d;
        m32011f(config);
        d = this.f18598a.mo37719d(i, i2, config != null ? config : f18597k);
        if (d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f18598a.mo37717b(i, i2, config));
            }
            this.f18605h++;
        } else {
            this.f18604g++;
            this.f18603f -= (long) this.f18598a.mo37720e(d);
            this.f18601d.mo37714a(d);
            m32020p(d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f18598a.mo37717b(i, i2, config));
        }
        m32013h();
        return d;
    }

    /* renamed from: o */
    private static void m32019o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    private static void m32020p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m32019o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m32021q(long j) {
        while (this.f18603f > j) {
            Bitmap removeLast = this.f18598a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m32014i();
                }
                this.f18603f = 0;
                return;
            }
            this.f18601d.mo37714a(removeLast);
            this.f18603f -= (long) this.f18598a.mo37720e(removeLast);
            this.f18607j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f18598a.mo37716a(removeLast));
            }
            m32013h();
            removeLast.recycle();
        }
    }

    /* renamed from: a */
    public void mo37690a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i >= 40) {
            mo37691b();
        } else if (i >= 20 || i == 15) {
            m32021q(mo37713n() / 2);
        }
    }

    /* renamed from: b */
    public void mo37691b() {
        Log.isLoggable("LruBitmapPool", 3);
        m32021q(0);
    }

    /* renamed from: c */
    public synchronized void mo37692c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f18598a.mo37720e(bitmap)) <= this.f18602e) {
                        if (this.f18599b.contains(bitmap.getConfig())) {
                            int e = this.f18598a.mo37720e(bitmap);
                            this.f18598a.mo37718c(bitmap);
                            this.f18601d.mo37715b(bitmap);
                            this.f18606i++;
                            this.f18603f += (long) e;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f18598a.mo37716a(bitmap));
                            }
                            m32013h();
                            m32015j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f18598a.mo37716a(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f18599b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    @NonNull
    /* renamed from: d */
    public Bitmap mo37693d(int i, int i2, Bitmap.Config config) {
        Bitmap m = m32018m(i, i2, config);
        if (m == null) {
            return m32012g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    @NonNull
    /* renamed from: e */
    public Bitmap mo37694e(int i, int i2, Bitmap.Config config) {
        Bitmap m = m32018m(i, i2, config);
        return m == null ? m32012g(i, i2, config) : m;
    }

    /* renamed from: n */
    public long mo37713n() {
        return this.f18602e;
    }

    public C7678j(long j) {
        this(j, m32017l(), m32016k());
    }
}
