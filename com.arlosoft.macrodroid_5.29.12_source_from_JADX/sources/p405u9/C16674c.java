package p405u9;

/* renamed from: u9.c */
/* compiled from: PerfMark */
public final class C16674c {

    /* renamed from: a */
    private static final C16672a f67564a;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            r1 = 0
            java.lang.String r2 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x000e, all -> 0x000b }
            r3 = r1
            goto L_0x0014
        L_0x000b:
            r2 = move-exception
            r3 = r2
            goto L_0x0013
        L_0x000e:
            r0 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            r3 = r0
            r0 = r2
        L_0x0013:
            r2 = r1
        L_0x0014:
            if (r2 == 0) goto L_0x0038
            java.lang.Class<u9.a> r4 = p405u9.C16672a.class
            java.lang.Class r2 = r2.asSubclass(r4)     // Catch:{ all -> 0x0036 }
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0036 }
            java.lang.Class<u9.d> r6 = p405u9.C16675d.class
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x0036 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch:{ all -> 0x0036 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0036 }
            u9.d r5 = p405u9.C16672a.f67561a     // Catch:{ all -> 0x0036 }
            r4[r7] = r5     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ all -> 0x0036 }
            u9.a r2 = (p405u9.C16672a) r2     // Catch:{ all -> 0x0036 }
            r1 = r2
            goto L_0x0038
        L_0x0036:
            r2 = move-exception
            r3 = r2
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            f67564a = r1
            goto L_0x0046
        L_0x003d:
            u9.a r1 = new u9.a
            u9.d r2 = p405u9.C16672a.f67561a
            r1.<init>(r2)
            f67564a = r1
        L_0x0046:
            if (r3 == 0) goto L_0x0057
            java.lang.Class<u9.c> r1 = p405u9.C16674c.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.lang.String r2 = "Error during PerfMark.<clinit>"
            r1.log(r0, r2, r3)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p405u9.C16674c.<clinit>():void");
    }

    private C16674c() {
    }

    /* renamed from: a */
    public static C16675d m99119a(String str) {
        return f67564a.mo79569a(str, Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static C16675d m99120b(String str, long j) {
        return f67564a.mo79569a(str, j);
    }

    /* renamed from: c */
    public static void m99121c(String str, C16675d dVar) {
        f67564a.mo79570b(str, dVar);
    }

    /* renamed from: d */
    public static void m99122d(C16673b bVar) {
        f67564a.mo79571c(bVar);
    }

    /* renamed from: e */
    public static C16673b m99123e() {
        return f67564a.mo79572d();
    }

    /* renamed from: f */
    public static void m99124f(String str) {
        f67564a.mo79573e(str);
    }

    /* renamed from: g */
    public static void m99125g(String str, C16675d dVar) {
        f67564a.mo79574f(str, dVar);
    }

    /* renamed from: h */
    public static void m99126h(String str) {
        f67564a.mo79575g(str);
    }

    /* renamed from: i */
    public static void m99127i(String str, C16675d dVar) {
        f67564a.mo79576h(str, dVar);
    }
}
