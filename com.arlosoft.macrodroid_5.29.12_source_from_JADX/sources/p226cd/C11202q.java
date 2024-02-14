package p226cd;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, mo71668d2 = {"Lcd/q;", "Lcd/y;", "Lcd/b;", "sink", "", "byteCount", "m0", "Lcd/z;", "q", "Lja/u;", "close", "Lcd/d;", "upstream", "<init>", "(Lcd/d;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.q */
/* compiled from: PeekSource.kt */
public final class C11202q implements C11212y {

    /* renamed from: a */
    private final C11186d f54128a;

    /* renamed from: c */
    private final C11179b f54129c;

    /* renamed from: d */
    private C11206t f54130d;

    /* renamed from: f */
    private int f54131f;

    /* renamed from: g */
    private boolean f54132g;

    /* renamed from: o */
    private long f54133o;

    public C11202q(C11186d dVar) {
        int i;
        C13706o.m87929f(dVar, "upstream");
        this.f54128a = dVar;
        C11179b buffer = dVar.getBuffer();
        this.f54129c = buffer;
        C11206t tVar = buffer.f54090a;
        this.f54130d = tVar;
        if (tVar == null) {
            i = -1;
        } else {
            i = tVar.f54143b;
        }
        this.f54131f = i;
    }

    public void close() {
        this.f54132g = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f54143b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo62392m0(p226cd.C11179b r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            r0 = 0
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x000f
            r5 = 1
            goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f54132g
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x007b
            cd.t r5 = r8.f54130d
            if (r5 == 0) goto L_0x002a
            cd.b r6 = r8.f54129c
            cd.t r6 = r6.f54090a
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f54131f
            kotlin.jvm.internal.C13706o.m87926c(r6)
            int r6 = r6.f54143b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 == 0) goto L_0x006f
            if (r4 != 0) goto L_0x0030
            return r1
        L_0x0030:
            cd.d r0 = r8.f54128a
            long r1 = r8.f54133o
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            cd.t r0 = r8.f54130d
            if (r0 != 0) goto L_0x0053
            cd.b r0 = r8.f54129c
            cd.t r0 = r0.f54090a
            if (r0 == 0) goto L_0x0053
            r8.f54130d = r0
            kotlin.jvm.internal.C13706o.m87926c(r0)
            int r0 = r0.f54143b
            r8.f54131f = r0
        L_0x0053:
            cd.b r0 = r8.f54129c
            long r0 = r0.mo62399D()
            long r2 = r8.f54133o
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            cd.b r2 = r8.f54129c
            long r4 = r8.f54133o
            r3 = r9
            r6 = r10
            r2.mo62433g(r3, r4, r6)
            long r0 = r8.f54133o
            long r0 = r0 + r10
            r8.f54133o = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r9 = kotlin.jvm.internal.C13706o.m87936m(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p226cd.C11202q.mo62392m0(cd.b, long):long");
    }

    /* renamed from: q */
    public C11213z mo62393q() {
        return this.f54128a.mo62393q();
    }
}
