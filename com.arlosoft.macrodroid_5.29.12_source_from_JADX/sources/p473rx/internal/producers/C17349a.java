package p473rx.internal.producers;

import p459ef.C17157e;

/* renamed from: rx.internal.producers.a */
/* compiled from: ProducerArbiter */
public final class C17349a implements C17157e {

    /* renamed from: p */
    static final C17157e f69058p = new C17350a();

    /* renamed from: a */
    long f69059a;

    /* renamed from: c */
    C17157e f69060c;

    /* renamed from: d */
    boolean f69061d;

    /* renamed from: f */
    long f69062f;

    /* renamed from: g */
    long f69063g;

    /* renamed from: o */
    C17157e f69064o;

    /* renamed from: rx.internal.producers.a$a */
    /* compiled from: ProducerArbiter */
    static class C17350a implements C17157e {
        C17350a() {
        }

        public void request(long j) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r9 = r14.f69059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r9 == androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r9 = r9 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r9 < 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r9 != androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r9 = r9 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r9 < 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r14.f69059a = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        throw new java.lang.IllegalStateException("more produced than requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r14.f69059a = androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL;
        r9 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r4 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r4 != f69058p) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r14.f69060c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        r14.f69060c = r4;
        r4.request(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        r2 = r14.f69060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r7 == 0) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        r2.request(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80668a() {
        /*
            r14 = this;
        L_0x0000:
            monitor-enter(r14)
            long r0 = r14.f69062f     // Catch:{ all -> 0x0061 }
            long r2 = r14.f69063g     // Catch:{ all -> 0x0061 }
            ef.e r4 = r14.f69064o     // Catch:{ all -> 0x0061 }
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0018
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0018
            if (r4 != 0) goto L_0x0018
            r0 = 0
            r14.f69061d = r0     // Catch:{ all -> 0x0061 }
            monitor-exit(r14)     // Catch:{ all -> 0x0061 }
            return
        L_0x0018:
            r14.f69062f = r5     // Catch:{ all -> 0x0061 }
            r14.f69063g = r5     // Catch:{ all -> 0x0061 }
            r8 = 0
            r14.f69064o = r8     // Catch:{ all -> 0x0061 }
            monitor-exit(r14)     // Catch:{ all -> 0x0061 }
            long r9 = r14.f69059a
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0048
            long r9 = r9 + r0
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0045
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            long r9 = r9 - r2
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x003d
            r14.f69059a = r9
            goto L_0x0048
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "more produced than requested"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            r14.f69059a = r11
            r9 = r11
        L_0x0048:
            if (r4 == 0) goto L_0x0057
            ef.e r0 = f69058p
            if (r4 != r0) goto L_0x0051
            r14.f69060c = r8
            goto L_0x0000
        L_0x0051:
            r14.f69060c = r4
            r4.request(r9)
            goto L_0x0000
        L_0x0057:
            ef.e r2 = r14.f69060c
            if (r2 == 0) goto L_0x0000
            if (r7 == 0) goto L_0x0000
            r2.request(r0)
            goto L_0x0000
        L_0x0061:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0061 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p473rx.internal.producers.C17349a.mo80668a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.f69060c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
        if (r3 == null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0015, code lost:
        r3.request(r2.f69059a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
        mo80668a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001f, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.f69061d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0024, code lost:
        throw r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80669b(p459ef.C17157e r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f69061d     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x000d
            if (r3 != 0) goto L_0x0009
            ef.e r3 = f69058p     // Catch:{ all -> 0x0028 }
        L_0x0009:
            r2.f69064o = r3     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            return
        L_0x000d:
            r0 = 1
            r2.f69061d = r0     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            r2.f69060c = r3     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001a
            long r0 = r2.f69059a     // Catch:{ all -> 0x001e }
            r3.request(r0)     // Catch:{ all -> 0x001e }
        L_0x001a:
            r2.mo80668a()     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-enter(r2)
            r0 = 0
            r2.f69061d = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p473rx.internal.producers.C17349a.mo80669b(ef.e):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = r5.f69059a + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r2 >= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        r2 = androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r5.f69059a = r2;
        r0 = r5.f69060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r0 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r0.request(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        mo80668a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.f69061d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void request(long r6) {
        /*
            r5 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x003f
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            monitor-enter(r5)
            boolean r2 = r5.f69061d     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x0015
            long r0 = r5.f69062f     // Catch:{ all -> 0x003c }
            long r0 = r0 + r6
            r5.f69062f = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r5)     // Catch:{ all -> 0x003c }
            return
        L_0x0015:
            r2 = 1
            r5.f69061d = r2     // Catch:{ all -> 0x003c }
            monitor-exit(r5)     // Catch:{ all -> 0x003c }
            long r2 = r5.f69059a     // Catch:{ all -> 0x0032 }
            long r2 = r2 + r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0025
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0025:
            r5.f69059a = r2     // Catch:{ all -> 0x0032 }
            ef.e r0 = r5.f69060c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002e
            r0.request(r6)     // Catch:{ all -> 0x0032 }
        L_0x002e:
            r5.mo80668a()     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r6 = move-exception
            monitor-enter(r5)
            r7 = 0
            r5.f69061d = r7     // Catch:{ all -> 0x0039 }
            monitor-exit(r5)     // Catch:{ all -> 0x0039 }
            throw r6
        L_0x0039:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0039 }
            throw r6
        L_0x003c:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003c }
            throw r6
        L_0x003f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "n >= 0 required"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p473rx.internal.producers.C17349a.request(long):void");
    }
}
