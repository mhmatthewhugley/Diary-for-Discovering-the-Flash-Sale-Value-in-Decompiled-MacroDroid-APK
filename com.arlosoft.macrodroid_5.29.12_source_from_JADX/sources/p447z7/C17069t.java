package p447z7;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* renamed from: z7.t */
/* compiled from: UIDSet */
public class C17069t {

    /* renamed from: a */
    public long f68512a;

    /* renamed from: b */
    public long f68513b;

    public C17069t() {
    }

    public C17069t(long j, long j2) {
        this.f68512a = j;
        this.f68513b = j2;
    }

    /* renamed from: a */
    public static C17069t[] m100406a(String str) {
        C17069t tVar;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",:", true);
        loop0:
        while (true) {
            tVar = null;
            while (stringTokenizer.hasMoreTokens()) {
                try {
                    String nextToken = stringTokenizer.nextToken();
                    if (nextToken.equals(",")) {
                        if (tVar != null) {
                            arrayList.add(tVar);
                        }
                    } else if (!nextToken.equals(":")) {
                        long parseLong = Long.parseLong(nextToken);
                        if (tVar != null) {
                            tVar.f68513b = parseLong;
                        } else {
                            tVar = new C17069t(parseLong, parseLong);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
            break loop0;
        }
        if (tVar != null) {
            arrayList.add(tVar);
        }
        return (C17069t[]) arrayList.toArray(new C17069t[arrayList.size()]);
    }

    /* renamed from: c */
    public static long m100407c(C17069t[] tVarArr) {
        long j = 0;
        if (tVarArr != null) {
            for (C17069t b : tVarArr) {
                j += b.mo80336b();
            }
        }
        return j;
    }

    /* renamed from: d */
    private static long m100408d(C17069t[] tVarArr, long j) {
        long j2;
        if (tVarArr == null) {
            return 0;
        }
        long j3 = 0;
        for (C17069t tVar : tVarArr) {
            if (j < 0) {
                j2 = tVar.mo80336b();
            } else {
                long j4 = tVar.f68512a;
                if (j4 <= j) {
                    long j5 = tVar.f68513b;
                    if (j5 < j) {
                        j3 += (j5 - j4) + 1;
                    } else {
                        j2 = (j - j4) + 1;
                    }
                }
            }
            j3 += j2;
        }
        return j3;
    }

    /* renamed from: e */
    public static long[] m100409e(C17069t[] tVarArr) {
        if (tVarArr == null) {
            return null;
        }
        long[] jArr = new long[((int) m100407c(tVarArr))];
        int i = 0;
        for (C17069t tVar : tVarArr) {
            long j = tVar.f68512a;
            while (j <= tVar.f68513b) {
                jArr[i] = j;
                j++;
                i++;
            }
        }
        return jArr;
    }

    /* renamed from: f */
    public static long[] m100410f(C17069t[] tVarArr, long j) {
        if (tVarArr == null) {
            return null;
        }
        long[] jArr = new long[((int) m100408d(tVarArr, j))];
        int i = 0;
        for (C17069t tVar : tVarArr) {
            long j2 = tVar.f68512a;
            while (j2 <= tVar.f68513b && (j < 0 || j2 <= j)) {
                jArr[i] = j2;
                j2++;
                i++;
            }
        }
        return jArr;
    }

    /* renamed from: b */
    public long mo80336b() {
        return (this.f68513b - this.f68512a) + 1;
    }
}
