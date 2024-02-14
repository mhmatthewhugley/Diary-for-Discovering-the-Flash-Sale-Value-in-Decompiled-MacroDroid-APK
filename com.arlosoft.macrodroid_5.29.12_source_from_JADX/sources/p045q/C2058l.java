package p045q;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p050v.C2124h;

/* renamed from: q.l */
/* compiled from: MergePathsContent */
public class C2058l implements C2060m, C2056j {

    /* renamed from: a */
    private final Path f6363a = new Path();

    /* renamed from: b */
    private final Path f6364b = new Path();

    /* renamed from: c */
    private final Path f6365c = new Path();

    /* renamed from: d */
    private final String f6366d;

    /* renamed from: e */
    private final List<C2060m> f6367e = new ArrayList();

    /* renamed from: f */
    private final C2124h f6368f;

    /* renamed from: q.l$a */
    /* compiled from: MergePathsContent */
    static /* synthetic */ class C2059a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6369a;

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
                v.h$a[] r0 = p050v.C2124h.C2125a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6369a = r0
                v.h$a r1 = p050v.C2124h.C2125a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6369a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.h$a r1 = p050v.C2124h.C2125a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6369a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.h$a r1 = p050v.C2124h.C2125a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6369a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.h$a r1 = p050v.C2124h.C2125a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6369a     // Catch:{ NoSuchFieldError -> 0x003e }
                v.h$a r1 = p050v.C2124h.C2125a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p045q.C2058l.C2059a.<clinit>():void");
        }
    }

    public C2058l(C2124h hVar) {
        this.f6366d = hVar.mo24279c();
        this.f6368f = hVar;
    }

    /* renamed from: a */
    private void m8508a() {
        for (int i = 0; i < this.f6367e.size(); i++) {
            this.f6365c.addPath(this.f6367e.get(i).getPath());
        }
    }

    /* renamed from: c */
    private void m8509c(Path.Op op) {
        this.f6364b.reset();
        this.f6363a.reset();
        for (int size = this.f6367e.size() - 1; size >= 1; size--) {
            C2060m mVar = this.f6367e.get(size);
            if (mVar instanceof C2050d) {
                C2050d dVar = (C2050d) mVar;
                List<C2060m> i = dVar.mo24133i();
                for (int size2 = i.size() - 1; size2 >= 0; size2--) {
                    Path path = i.get(size2).getPath();
                    path.transform(dVar.mo24134j());
                    this.f6364b.addPath(path);
                }
            } else {
                this.f6364b.addPath(mVar.getPath());
            }
        }
        C2060m mVar2 = this.f6367e.get(0);
        if (mVar2 instanceof C2050d) {
            C2050d dVar2 = (C2050d) mVar2;
            List<C2060m> i2 = dVar2.mo24133i();
            for (int i3 = 0; i3 < i2.size(); i3++) {
                Path path2 = i2.get(i3).getPath();
                path2.transform(dVar2.mo24134j());
                this.f6363a.addPath(path2);
            }
        } else {
            this.f6363a.set(mVar2.getPath());
        }
        this.f6365c.op(this.f6363a, this.f6364b, op);
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        for (int i = 0; i < this.f6367e.size(); i++) {
            this.f6367e.get(i).mo24124b(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24135f(java.util.ListIterator<p045q.C2049c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            q.c r0 = (p045q.C2049c) r0
            boolean r1 = r0 instanceof p045q.C2060m
            if (r1 == 0) goto L_0x000d
            java.util.List<q.m> r1 = r2.f6367e
            q.m r0 = (p045q.C2060m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045q.C2058l.mo24135f(java.util.ListIterator):void");
    }

    public Path getPath() {
        this.f6365c.reset();
        if (this.f6368f.mo24280d()) {
            return this.f6365c;
        }
        int i = C2059a.f6369a[this.f6368f.mo24278b().ordinal()];
        if (i == 1) {
            m8508a();
        } else if (i == 2) {
            m8509c(Path.Op.UNION);
        } else if (i == 3) {
            m8509c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m8509c(Path.Op.INTERSECT);
        } else if (i == 5) {
            m8509c(Path.Op.XOR);
        }
        return this.f6365c;
    }
}
