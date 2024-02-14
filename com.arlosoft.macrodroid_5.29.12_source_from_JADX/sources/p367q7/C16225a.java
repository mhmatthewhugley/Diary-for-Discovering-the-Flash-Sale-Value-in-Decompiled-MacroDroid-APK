package p367q7;

import android.util.Log;
import com.stericson.RootShell.exceptions.RootDeniedException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import p376r7.C16351a;
import p376r7.C16355b;

/* renamed from: q7.a */
/* compiled from: RootShell */
public class C16225a {

    /* renamed from: a */
    public static boolean f66520a = false;

    /* renamed from: b */
    public static boolean f66521b = true;

    /* renamed from: c */
    public static int f66522c = 20000;

    /* renamed from: q7.a$a */
    /* compiled from: RootShell */
    class C16226a extends C16351a {

        /* renamed from: p */
        final /* synthetic */ List f66523p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16226a(int i, boolean z, String[] strArr, List list) {
            super(i, z, strArr);
            this.f66523p = list;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            C16225a.m97490m(str);
            this.f66523p.add(str);
            super.mo25775c(i, str);
        }
    }

    /* renamed from: q7.a$b */
    /* compiled from: RootShell */
    class C16227b extends C16351a {

        /* renamed from: p */
        final /* synthetic */ List f66524p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16227b(int i, boolean z, String[] strArr, List list) {
            super(i, z, strArr);
            this.f66524p = list;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            C16225a.m97490m(str);
            this.f66524p.add(str);
            super.mo25775c(i, str);
        }
    }

    /* renamed from: q7.a$c */
    /* compiled from: RootShell */
    class C16228c extends C16351a {

        /* renamed from: p */
        final /* synthetic */ String f66525p;

        /* renamed from: q */
        final /* synthetic */ List f66526q;

        /* renamed from: r */
        final /* synthetic */ String f66527r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16228c(int i, boolean z, String[] strArr, String str, List list, String str2) {
            super(i, z, strArr);
            this.f66525p = str;
            this.f66526q = list;
            this.f66527r = str2;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (str.contains("File: ") && str.contains(this.f66525p)) {
                this.f66526q.add(this.f66527r);
                C16225a.m97490m(this.f66525p + " was found here: " + this.f66527r);
            }
            C16225a.m97490m(str);
            super.mo25775c(i, str);
        }
    }

    /* renamed from: q7.a$d */
    /* compiled from: RootShell */
    class C16229d extends C16351a {

        /* renamed from: p */
        final /* synthetic */ Set f66528p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16229d(int i, boolean z, String[] strArr, Set set) {
            super(i, z, strArr);
            this.f66528p = set;
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            if (i == 158) {
                this.f66528p.addAll(Arrays.asList(str.split(" ")));
            }
            super.mo25775c(i, str);
        }
    }

    /* renamed from: q7.a$e */
    /* compiled from: RootShell */
    static /* synthetic */ class C16230e {

        /* renamed from: a */
        static final /* synthetic */ int[] f66529a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                q7.a$f[] r0 = p367q7.C16225a.C16231f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66529a = r0
                q7.a$f r1 = p367q7.C16225a.C16231f.VERBOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66529a     // Catch:{ NoSuchFieldError -> 0x001d }
                q7.a$f r1 = p367q7.C16225a.C16231f.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66529a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q7.a$f r1 = p367q7.C16225a.C16231f.DEBUG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66529a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q7.a$f r1 = p367q7.C16225a.C16231f.WARN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p367q7.C16225a.C16230e.<clinit>():void");
        }
    }

    /* renamed from: q7.a$f */
    /* compiled from: RootShell */
    public enum C16231f {
        VERBOSE,
        ERROR,
        DEBUG,
        WARN
    }

    /* renamed from: a */
    public static void m97478a() throws IOException {
        C16355b.m98092z();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m97479b(p376r7.C16355b r3, p376r7.C16351a r4) throws java.lang.Exception {
        /*
        L_0x0000:
            boolean r0 = r4.mo79017j()
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "RootShell v1.6"
            java.lang.String r1 = r3.mo79027G(r4)
            m97491n(r0, r1)
            java.lang.String r0 = "RootShell v1.6"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Processed "
            r1.append(r2)
            int r2 = r4.f66845d
            r1.append(r2)
            java.lang.String r2 = " of "
            r1.append(r2)
            int r2 = r4.f66844c
            r1.append(r2)
            java.lang.String r2 = " output from command."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m97491n(r0, r1)
            monitor-enter(r4)
            boolean r0 = r4.mo79017j()     // Catch:{ InterruptedException -> 0x0046 }
            if (r0 != 0) goto L_0x0046
            r0 = 2000(0x7d0, double:9.88E-321)
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0046 }
            goto L_0x0046
        L_0x0043:
            r3 = move-exception
            goto L_0x00e5
        L_0x0046:
            monitor-exit(r4)     // Catch:{ all -> 0x0043 }
            boolean r0 = r4.mo79016i()
            if (r0 != 0) goto L_0x0000
            boolean r0 = r4.mo79017j()
            if (r0 != 0) goto L_0x0000
            boolean r0 = r3.f66876l
            if (r0 != 0) goto L_0x0087
            boolean r1 = r3.f66877m
            if (r1 != 0) goto L_0x0087
            java.lang.String r0 = "RootShell v1.6"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Waiting for a command to be executed in a shell that is not executing and not reading! \n\n Command: "
            r1.append(r2)
            java.lang.String r2 = r4.mo79014g()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m97491n(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r0.setStackTrace(r1)
            goto L_0x0000
        L_0x0087:
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r3.f66877m
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "RootShell v1.6"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Waiting for a command to be executed in a shell that is executing but not reading! \n\n Command: "
            r1.append(r2)
            java.lang.String r2 = r4.mo79014g()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m97491n(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r0.setStackTrace(r1)
            goto L_0x0000
        L_0x00b9:
            java.lang.String r0 = "RootShell v1.6"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Waiting for a command to be executed in a shell that is not reading! \n\n Command: "
            r1.append(r2)
            java.lang.String r2 = r4.mo79014g()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m97491n(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r0.setStackTrace(r1)
            goto L_0x0000
        L_0x00e5:
            monitor-exit(r4)     // Catch:{ all -> 0x0043 }
            throw r3
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p367q7.C16225a.m97479b(r7.b, r7.a):void");
    }

    /* renamed from: c */
    public static boolean m97480c(String str) {
        return m97481d(str, false);
    }

    /* renamed from: d */
    public static boolean m97481d(String str, boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("ls ");
        sb.append(z ? "-d " : " ");
        String sb2 = sb.toString();
        C16226a aVar = new C16226a(0, false, new String[]{sb2 + str}, arrayList);
        try {
            m97485h(false).mo79032w(aVar);
            m97479b(m97485h(false), aVar);
            for (String trim : arrayList) {
                if (trim.trim().equals(str)) {
                    return true;
                }
            }
            arrayList.clear();
            C16227b bVar = new C16227b(0, false, new String[]{sb2 + str}, arrayList);
            try {
                m97485h(true).mo79032w(bVar);
                m97479b(m97485h(true), bVar);
                for (String trim2 : new ArrayList(arrayList)) {
                    if (trim2.trim().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                m97490m("Exception: " + e);
                return false;
            }
        } catch (Exception e2) {
            m97490m("Exception: " + e2);
            return false;
        }
    }

    /* renamed from: e */
    public static List<String> m97482e(String str, List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            list = m97484g();
        }
        m97490m("Checking for " + str);
        boolean z2 = false;
        try {
            for (String next : list) {
                if (!next.endsWith("/")) {
                    next = next + "/";
                }
                String str2 = next;
                m97479b(m97485h(false), m97485h(false).mo79032w(new C16228c(0, false, new String[]{"stat " + str2 + str}, str, arrayList, str2)));
                if (arrayList.size() > 0 && z) {
                    break;
                }
            }
            z2 = !arrayList.isEmpty();
        } catch (Exception unused) {
            m97490m(str + " was not found, more information MAY be available with Debugging on.");
        }
        if (!z2) {
            m97490m("Trying second method");
            for (String next2 : list) {
                if (!next2.endsWith("/")) {
                    next2 = next2 + "/";
                }
                if (m97480c(next2 + str)) {
                    m97490m(str + " was found here: " + next2);
                    arrayList.add(next2);
                    if (arrayList.size() > 0 && z) {
                        break;
                    }
                } else {
                    m97490m(str + " was NOT found here: " + next2);
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: f */
    public static List<String> m97483f(String str, boolean z) {
        return m97482e(str, (List<String>) null, z);
    }

    /* renamed from: g */
    public static List<String> m97484g() {
        return Arrays.asList(System.getenv("PATH").split(":"));
    }

    /* renamed from: h */
    public static C16355b m97485h(boolean z) throws IOException, TimeoutException, RootDeniedException {
        return m97486i(z, 0);
    }

    /* renamed from: i */
    public static C16355b m97486i(boolean z, int i) throws IOException, TimeoutException, RootDeniedException {
        return m97487j(z, i, C16355b.f66860A, 3);
    }

    /* renamed from: j */
    public static C16355b m97487j(boolean z, int i, C16355b.C16359d dVar, int i2) throws IOException, TimeoutException, RootDeniedException {
        if (z) {
            return C16355b.m98067N(i, dVar, i2);
        }
        return C16355b.m98068O(i);
    }

    /* renamed from: k */
    public static boolean m97488k(int i, int i2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            m97490m("Checking for Root access");
            C16229d dVar = new C16229d(158, false, new String[]{"id"}, hashSet);
            C16355b M = C16355b.m98066M(i, i2);
            M.mo79032w(dVar);
            m97479b(M, dVar);
            for (String str : hashSet) {
                m97490m(str);
                if (str.toLowerCase().contains("uid=0")) {
                    m97490m("Access Given");
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m97489l() {
        return m97483f("su", true).size() > 0;
    }

    /* renamed from: m */
    public static void m97490m(String str) {
        m97492o((String) null, str, C16231f.DEBUG, (Exception) null);
    }

    /* renamed from: n */
    public static void m97491n(String str, String str2) {
        m97492o(str, str2, C16231f.DEBUG, (Exception) null);
    }

    /* renamed from: o */
    public static void m97492o(String str, String str2, C16231f fVar, Exception exc) {
        if (str2 != null && !str2.equals("") && f66520a) {
            if (str == null) {
                str = "RootShell v1.6";
            }
            int i = C16230e.f66529a[fVar.ordinal()];
            if (i == 2) {
                Log.e(str, str2, exc);
            } else if (i == 4) {
                Log.w(str, str2);
            }
        }
    }

    /* renamed from: p */
    public static void m97493p(String str, C16231f fVar, Exception exc) {
        m97492o((String) null, str, fVar, exc);
    }
}
