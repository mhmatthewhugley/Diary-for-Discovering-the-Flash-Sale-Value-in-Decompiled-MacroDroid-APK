package p467mf;

import p459ef.C17156d;
import p463if.C17175a;
import p473rx.internal.operators.C17318b;

/* renamed from: mf.b */
/* compiled from: SerializedObserver */
public class C17190b<T> implements C17156d<T> {

    /* renamed from: a */
    private final C17156d<? super T> f68739a;

    /* renamed from: c */
    private boolean f68740c;

    /* renamed from: d */
    private volatile boolean f68741d;

    /* renamed from: f */
    private C17191a f68742f;

    /* renamed from: g */
    private final C17318b<T> f68743g = C17318b.m101039e();

    /* renamed from: mf.b$a */
    /* compiled from: SerializedObserver */
    static final class C17191a {

        /* renamed from: a */
        Object[] f68744a;

        /* renamed from: b */
        int f68745b;

        C17191a() {
        }

        /* renamed from: a */
        public void mo80477a(Object obj) {
            int i = this.f68745b;
            Object[] objArr = this.f68744a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f68744a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[((i >> 2) + i)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.f68744a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.f68745b = i + 1;
        }
    }

    public C17190b(C17156d<? super T> dVar) {
        this.f68739a = dVar;
    }

    public void onCompleted() {
        if (!this.f68741d) {
            synchronized (this) {
                if (!this.f68741d) {
                    this.f68741d = true;
                    if (this.f68740c) {
                        C17191a aVar = this.f68742f;
                        if (aVar == null) {
                            aVar = new C17191a();
                            this.f68742f = aVar;
                        }
                        aVar.mo80477a(this.f68743g.mo80646b());
                        return;
                    }
                    this.f68740c = true;
                    this.f68739a.onCompleted();
                }
            }
        }
    }

    public void onError(Throwable th) {
        C17175a.m100684d(th);
        if (!this.f68741d) {
            synchronized (this) {
                if (!this.f68741d) {
                    this.f68741d = true;
                    if (this.f68740c) {
                        C17191a aVar = this.f68742f;
                        if (aVar == null) {
                            aVar = new C17191a();
                            this.f68742f = aVar;
                        }
                        aVar.mo80477a(this.f68743g.mo80647c(th));
                        return;
                    }
                    this.f68740c = true;
                    this.f68739a.onError(th);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7.f68739a.onNext(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = r7.f68742f;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        if (r1 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        r7.f68740c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0037, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        r7.f68742f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003d, code lost:
        r1 = r1.f68744a;
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0040, code lost:
        if (r2 >= r3) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0042, code lost:
        r4 = r1[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0044, code lost:
        if (r4 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004f, code lost:
        if (r7.f68743g.mo80645a(r7.f68739a, r4) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        r7.f68741d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0054, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0058, code lost:
        r7.f68741d = true;
        p463if.C17175a.m100684d(r1);
        r7.f68739a.onError(p473rx.exceptions.OnErrorThrowable.m101032a(r1, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006b, code lost:
        r7.f68741d = true;
        p463if.C17175a.m100686f(r1, r7.f68739a, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNext(T r8) {
        /*
            r7 = this;
            boolean r0 = r7.f68741d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r7)
            boolean r0 = r7.f68741d     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r7)     // Catch:{ all -> 0x0073 }
            return
        L_0x000c:
            boolean r0 = r7.f68740c     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0026
            mf.b$a r0 = r7.f68742f     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x001b
            mf.b$a r0 = new mf.b$a     // Catch:{ all -> 0x0073 }
            r0.<init>()     // Catch:{ all -> 0x0073 }
            r7.f68742f = r0     // Catch:{ all -> 0x0073 }
        L_0x001b:
            rx.internal.operators.b<T> r1 = r7.f68743g     // Catch:{ all -> 0x0073 }
            java.lang.Object r8 = r1.mo80649f(r8)     // Catch:{ all -> 0x0073 }
            r0.mo80477a(r8)     // Catch:{ all -> 0x0073 }
            monitor-exit(r7)     // Catch:{ all -> 0x0073 }
            return
        L_0x0026:
            r0 = 1
            r7.f68740c = r0     // Catch:{ all -> 0x0073 }
            monitor-exit(r7)     // Catch:{ all -> 0x0073 }
            ef.d<? super T> r1 = r7.f68739a     // Catch:{ all -> 0x006a }
            r1.onNext(r8)     // Catch:{ all -> 0x006a }
        L_0x002f:
            monitor-enter(r7)
            mf.b$a r1 = r7.f68742f     // Catch:{ all -> 0x0067 }
            r2 = 0
            if (r1 != 0) goto L_0x0039
            r7.f68740c = r2     // Catch:{ all -> 0x0067 }
            monitor-exit(r7)     // Catch:{ all -> 0x0067 }
            return
        L_0x0039:
            r3 = 0
            r7.f68742f = r3     // Catch:{ all -> 0x0067 }
            monitor-exit(r7)     // Catch:{ all -> 0x0067 }
            java.lang.Object[] r1 = r1.f68744a
            int r3 = r1.length
        L_0x0040:
            if (r2 >= r3) goto L_0x002f
            r4 = r1[r2]
            if (r4 != 0) goto L_0x0047
            goto L_0x002f
        L_0x0047:
            rx.internal.operators.b<T> r5 = r7.f68743g     // Catch:{ all -> 0x0057 }
            ef.d<? super T> r6 = r7.f68739a     // Catch:{ all -> 0x0057 }
            boolean r4 = r5.mo80645a(r6, r4)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0054
            r7.f68741d = r0     // Catch:{ all -> 0x0057 }
            return
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0057:
            r1 = move-exception
            r7.f68741d = r0
            p463if.C17175a.m100684d(r1)
            ef.d<? super T> r0 = r7.f68739a
            java.lang.Throwable r8 = p473rx.exceptions.OnErrorThrowable.m101032a(r1, r8)
            r0.onError(r8)
            return
        L_0x0067:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0067 }
            throw r8
        L_0x006a:
            r1 = move-exception
            r7.f68741d = r0
            ef.d<? super T> r0 = r7.f68739a
            p463if.C17175a.m100686f(r1, r0, r8)
            return
        L_0x0073:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0073 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p467mf.C17190b.onNext(java.lang.Object):void");
    }
}
