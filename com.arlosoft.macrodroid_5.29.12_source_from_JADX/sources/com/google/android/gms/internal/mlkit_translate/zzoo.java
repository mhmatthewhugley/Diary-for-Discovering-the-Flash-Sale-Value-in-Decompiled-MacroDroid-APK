package com.google.android.gms.internal.mlkit_translate;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class zzoo implements Closeable {

    /* renamed from: p */
    private static final Map f44350p = new HashMap();

    /* renamed from: a */
    private final String f44351a;

    /* renamed from: c */
    private int f44352c;

    /* renamed from: d */
    private double f44353d;

    /* renamed from: f */
    private long f44354f;

    /* renamed from: g */
    private long f44355g;

    /* renamed from: o */
    private long f44356o;

    private zzoo(String str) {
        this.f44355g = 2147483647L;
        this.f44356o = -2147483648L;
        this.f44351a = str;
    }

    /* renamed from: b */
    private final void m62084b() {
        this.f44352c = 0;
        this.f44353d = 0.0d;
        this.f44355g = 2147483647L;
        this.f44356o = -2147483648L;
    }

    /* renamed from: f */
    public static zzoo m62085f(String str) {
        zzrf.m62243a();
        if (!zzrf.m62244b()) {
            return zzom.f44349s;
        }
        Map map = f44350p;
        if (map.get(str) == null) {
            map.put(str, new zzoo(str));
        }
        return (zzoo) map.get(str);
    }

    /* renamed from: c */
    public void mo52368c(long j) {
        mo52370e(j * 1000);
    }

    public void close() {
        throw new IllegalStateException("Did you forget to call start()?");
    }

    /* renamed from: e */
    public void mo52370e(long j) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f44354f;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            m62084b();
        }
        this.f44354f = elapsedRealtimeNanos;
        this.f44352c++;
        this.f44353d += (double) j;
        this.f44355g = Math.min(this.f44355g, j);
        this.f44356o = Math.max(this.f44356o, j);
        if (this.f44352c % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", new Object[]{this.f44351a, Long.valueOf(j), Integer.valueOf(this.f44352c), Long.valueOf(this.f44355g), Long.valueOf(this.f44356o), Integer.valueOf((int) (this.f44353d / ((double) this.f44352c)))});
            zzrf.m62243a();
        }
        if (this.f44352c % 500 == 0) {
            m62084b();
        }
    }
}
