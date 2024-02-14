package p393t6;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: t6.d */
/* compiled from: LruCache */
public class C16577d<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f67376a;

    /* renamed from: b */
    private long f67377b;

    /* renamed from: c */
    private long f67378c;

    /* renamed from: d */
    private int f67379d;

    /* renamed from: e */
    private int f67380e;

    /* renamed from: f */
    private int f67381f;

    /* renamed from: g */
    private int f67382g;

    /* renamed from: h */
    private int f67383h;

    public C16577d(long j) {
        if (j > 0) {
            this.f67378c = j;
            this.f67376a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: e */
    private long m98807e(K k, V v) {
        long f = mo79390f(k, v);
        if (f >= 0) {
            return f;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m98808g(long r7) {
        /*
            r6 = this;
        L_0x0000:
            monitor-enter(r6)
            long r0 = r6.f67377b     // Catch:{ all -> 0x0079 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x005a
            java.util.LinkedHashMap<K, V> r0 = r6.f67376a     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0017
            long r0 = r6.f67377b     // Catch:{ all -> 0x0079 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x005a
        L_0x0017:
            long r0 = r6.f67377b     // Catch:{ all -> 0x0079 }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0058
            java.util.LinkedHashMap<K, V> r0 = r6.f67376a     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0058
        L_0x0026:
            java.util.LinkedHashMap<K, V> r0 = r6.f67376a     // Catch:{ all -> 0x0079 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0079 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0079 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0079 }
            java.util.LinkedHashMap<K, V> r2 = r6.f67376a     // Catch:{ all -> 0x0079 }
            r2.remove(r1)     // Catch:{ all -> 0x0079 }
            long r2 = r6.f67377b     // Catch:{ all -> 0x0079 }
            long r4 = r6.m98807e(r1, r0)     // Catch:{ all -> 0x0079 }
            long r2 = r2 - r4
            r6.f67377b = r2     // Catch:{ all -> 0x0079 }
            int r2 = r6.f67381f     // Catch:{ all -> 0x0079 }
            r3 = 1
            int r2 = r2 + r3
            r6.f67381f = r2     // Catch:{ all -> 0x0079 }
            monitor-exit(r6)     // Catch:{ all -> 0x0079 }
            r2 = 0
            r6.mo79389b(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0058:
            monitor-exit(r6)     // Catch:{ all -> 0x0079 }
            return
        L_0x005a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0079 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r8.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.Class r0 = r6.getClass()     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0079 }
            r8.append(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r8.append(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0079 }
            r7.<init>(r8)     // Catch:{ all -> 0x0079 }
            throw r7     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0079 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p393t6.C16577d.m98808g(long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public V mo79396a(K k) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo79389b(boolean z, K k, V v, V v2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = mo79396a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.f67380e++;
        r1 = r6.f67376a.put(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r6.f67376a.put(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r6.f67377b += m98807e(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        mo79389b(false, r7, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        m98808g(r6.f67378c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo79397c(K r7) {
        /*
            r6 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r7, r0)
            monitor-enter(r6)
            java.util.LinkedHashMap<K, V> r0 = r6.f67376a     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0016
            int r7 = r6.f67382g     // Catch:{ all -> 0x0054 }
            int r7 = r7 + 1
            r6.f67382g = r7     // Catch:{ all -> 0x0054 }
            monitor-exit(r6)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x0016:
            int r0 = r6.f67383h     // Catch:{ all -> 0x0054 }
            int r0 = r0 + 1
            r6.f67383h = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r6)     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r6.mo79396a(r7)
            if (r0 != 0) goto L_0x0025
            r7 = 0
            return r7
        L_0x0025:
            monitor-enter(r6)
            int r1 = r6.f67380e     // Catch:{ all -> 0x0051 }
            int r1 = r1 + 1
            r6.f67380e = r1     // Catch:{ all -> 0x0051 }
            java.util.LinkedHashMap<K, V> r1 = r6.f67376a     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.put(r7, r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x003a
            java.util.LinkedHashMap<K, V> r2 = r6.f67376a     // Catch:{ all -> 0x0051 }
            r2.put(r7, r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0043
        L_0x003a:
            long r2 = r6.f67377b     // Catch:{ all -> 0x0051 }
            long r4 = r6.m98807e(r7, r0)     // Catch:{ all -> 0x0051 }
            long r2 = r2 + r4
            r6.f67377b = r2     // Catch:{ all -> 0x0051 }
        L_0x0043:
            monitor-exit(r6)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004b
            r2 = 0
            r6.mo79389b(r2, r7, r0, r1)
            return r1
        L_0x004b:
            long r1 = r6.f67378c
            r6.m98808g(r1)
            return r0
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0051 }
            throw r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p393t6.C16577d.mo79397c(java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public final V mo79398d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f67379d++;
            this.f67377b += m98807e(k, v);
            put = this.f67376a.put(k, v);
            if (put != null) {
                this.f67377b -= m98807e(k, put);
            }
        }
        if (put != null) {
            mo79389b(false, k, put, v);
        }
        m98808g(this.f67378c);
        return put;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo79390f(K k, V v) {
        throw null;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f67382g;
        i2 = this.f67383h + i;
        return String.format(Locale.ENGLISH, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Long.valueOf(this.f67378c), Integer.valueOf(this.f67382g), Integer.valueOf(this.f67383h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }
}
