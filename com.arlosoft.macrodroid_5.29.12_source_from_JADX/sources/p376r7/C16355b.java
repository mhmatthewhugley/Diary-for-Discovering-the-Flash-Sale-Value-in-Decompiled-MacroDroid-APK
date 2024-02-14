package p376r7;

import com.stericson.RootShell.exceptions.RootDeniedException;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.TimeoutException;
import p367q7.C16225a;

/* renamed from: r7.b */
/* compiled from: Shell */
public class C16355b {

    /* renamed from: A */
    public static C16359d f66860A = C16359d.NORMAL;

    /* renamed from: w */
    private static C16355b f66861w;

    /* renamed from: x */
    private static C16355b f66862x;

    /* renamed from: y */
    private static C16355b f66863y;

    /* renamed from: z */
    private static String[] f66864z = {null, null};

    /* renamed from: a */
    private int f66865a = PluginInstanceData.MAXIMUM_BUNDLE_SIZE_BYTES;

    /* renamed from: b */
    private C16360e f66866b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C16359d f66867c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f66868d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Process f66869e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final BufferedReader f66870f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BufferedReader f66871g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final OutputStreamWriter f66872h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List<C16351a> f66873i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f66874j;

    /* renamed from: k */
    private Boolean f66875k;

    /* renamed from: l */
    public boolean f66876l;

    /* renamed from: m */
    public boolean f66877m;

    /* renamed from: n */
    public boolean f66878n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f66879o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f66880p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f66881q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f66882r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f66883s;

    /* renamed from: t */
    private boolean f66884t;

    /* renamed from: u */
    private Runnable f66885u;

    /* renamed from: v */
    private Runnable f66886v;

    /* renamed from: r7.b$a */
    /* compiled from: Shell */
    class C16356a implements Runnable {
        C16356a() {
        }

        public void run() {
            while (true) {
                try {
                    synchronized (C16355b.this.f66873i) {
                        while (!C16355b.this.f66874j && C16355b.this.f66881q >= C16355b.this.f66873i.size()) {
                            C16355b bVar = C16355b.this;
                            bVar.f66876l = false;
                            bVar.f66873i.wait();
                        }
                    }
                    if (C16355b.this.f66881q >= C16355b.this.f66879o) {
                        while (C16355b.this.f66880p != C16355b.this.f66881q) {
                            C16225a.m97490m("Waiting for read and write to catch up before cleanup.");
                        }
                        C16355b.this.m98091x();
                    }
                    if (C16355b.this.f66881q < C16355b.this.f66873i.size()) {
                        C16355b bVar2 = C16355b.this;
                        bVar2.f66876l = true;
                        C16351a aVar = null;
                        try {
                            aVar = (C16351a) bVar2.f66873i.get(C16355b.this.f66881q);
                        } catch (Exception unused) {
                        }
                        if (aVar != null) {
                            aVar.mo79020m();
                            C16225a.m97490m("Executing: " + aVar.mo79014g() + " with context: " + C16355b.this.f66867c);
                            C16355b.this.f66872h.write(aVar.mo79014g());
                            C16355b.this.f66872h.flush();
                            C16355b.this.f66872h.write("\necho F*D^W@#FGF " + C16355b.this.f66882r + " $?\n");
                            C16355b.this.f66872h.flush();
                            C16355b.m98081m(C16355b.this);
                            C16355b.m98090v(C16355b.this);
                        }
                    } else if (C16355b.this.f66874j) {
                        C16355b bVar3 = C16355b.this;
                        bVar3.f66876l = false;
                        bVar3.f66872h.write("\nexit 0\n");
                        C16355b.this.f66872h.flush();
                        C16225a.m97490m("Closing shell");
                        int unused2 = C16355b.this.f66881q = 0;
                        C16355b bVar4 = C16355b.this;
                        bVar4.m98061C(bVar4.f66872h);
                        return;
                    }
                } catch (IOException | InterruptedException e) {
                    try {
                        C16225a.m97493p(e.getMessage(), C16225a.C16231f.ERROR, e);
                        return;
                    } finally {
                        int unused3 = C16355b.this.f66881q = 0;
                        C16355b bVar5 = C16355b.this;
                        bVar5.m98061C(bVar5.f66872h);
                    }
                }
            }
            while (true) {
            }
        }
    }

    /* renamed from: r7.b$b */
    /* compiled from: Shell */
    class C16357b extends Thread {
        C16357b() {
        }

        public void run() {
            synchronized (C16355b.this.f66873i) {
                C16355b.this.f66873i.notifyAll();
            }
        }
    }

    /* renamed from: r7.b$c */
    /* compiled from: Shell */
    class C16358c implements Runnable {
        C16358c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            p376r7.C16355b.m98074f(r9.f66889a).waitFor();
            p376r7.C16355b.m98074f(r9.f66889a).destroy();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
            if (p376r7.C16355b.m98083o(r9.f66889a) < p376r7.C16355b.m98069a(r9.f66889a).size()) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
            if (r1 == null) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
            r1 = (p376r7.C16351a) p376r7.C16355b.m98069a(r9.f66889a).get(p376r7.C16355b.m98083o(r9.f66889a));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
            if (r1.f66844c < r1.f66845d) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
            r1.mo79023p("All output not processed!");
            r1.mo79023p("Did you forget the super.commandOutput call or are you waiting on the command object?");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
            r1.mo79023p("Unexpected Termination.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
            p376r7.C16355b.m98085q(r9.f66889a);
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
            p376r7.C16355b.m98084p(r9.f66889a, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x011d, code lost:
            r9.f66889a.mo79030K(r1);
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0123, code lost:
            if (r1 == null) goto L_0x0163;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0129, code lost:
            if (r1.f66844c <= r1.f66845d) goto L_0x0163;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
            if (r4 != 0) goto L_0x014f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
            r4 = r4 + 1;
            p367q7.C16225a.m97490m("Waiting for output to be processed. " + r1.f66845d + " Of " + r1.f66844c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            wait(2000);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0155, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x015a, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            p367q7.C16225a.m97490m(r5.getMessage());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0115 */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x011d A[EDGE_INSN: B:84:0x011d->B:51:0x011d ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0002 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                r0 = 0
            L_0x0001:
                r1 = r0
            L_0x0002:
                r2 = 1
                r3 = 0
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                boolean r4 = r4.f66874j     // Catch:{ IOException -> 0x017c }
                if (r4 == 0) goto L_0x002a
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                java.io.BufferedReader r4 = r4.f66870f     // Catch:{ IOException -> 0x017c }
                boolean r4 = r4.ready()     // Catch:{ IOException -> 0x017c }
                if (r4 != 0) goto L_0x002a
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                int r4 = r4.f66880p     // Catch:{ IOException -> 0x017c }
                r7.b r5 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                java.util.List r5 = r5.f66873i     // Catch:{ IOException -> 0x017c }
                int r5 = r5.size()     // Catch:{ IOException -> 0x017c }
                if (r4 >= r5) goto L_0x0057
            L_0x002a:
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                r4.f66877m = r3     // Catch:{ IOException -> 0x017c }
                java.io.BufferedReader r4 = r4.f66870f     // Catch:{ IOException -> 0x017c }
                java.lang.String r4 = r4.readLine()     // Catch:{ IOException -> 0x017c }
                r7.b r5 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                r5.f66877m = r2     // Catch:{ IOException -> 0x017c }
                if (r4 != 0) goto L_0x003d
                goto L_0x0057
            L_0x003d:
                if (r1 != 0) goto L_0x00c5
                int r5 = r5.f66880p     // Catch:{ IOException -> 0x017c }
                r7.b r6 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                java.util.List r6 = r6.f66873i     // Catch:{ IOException -> 0x017c }
                int r6 = r6.size()     // Catch:{ IOException -> 0x017c }
                if (r5 < r6) goto L_0x00b3
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                boolean r4 = r4.f66874j     // Catch:{ IOException -> 0x017c }
                if (r4 == 0) goto L_0x0002
            L_0x0057:
                r7.b r4 = p376r7.C16355b.this     // Catch:{ Exception -> 0x0069 }
                java.lang.Process r4 = r4.f66869e     // Catch:{ Exception -> 0x0069 }
                r4.waitFor()     // Catch:{ Exception -> 0x0069 }
                r7.b r4 = p376r7.C16355b.this     // Catch:{ Exception -> 0x0069 }
                java.lang.Process r4 = r4.f66869e     // Catch:{ Exception -> 0x0069 }
                r4.destroy()     // Catch:{ Exception -> 0x0069 }
            L_0x0069:
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                int r4 = r4.f66880p     // Catch:{ IOException -> 0x017c }
                r7.b r5 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                java.util.List r5 = r5.f66873i     // Catch:{ IOException -> 0x017c }
                int r5 = r5.size()     // Catch:{ IOException -> 0x017c }
                if (r4 >= r5) goto L_0x00ac
                if (r1 != 0) goto L_0x008f
                r7.b r1 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                java.util.List r1 = r1.f66873i     // Catch:{ IOException -> 0x017c }
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                int r4 = r4.f66880p     // Catch:{ IOException -> 0x017c }
                java.lang.Object r1 = r1.get(r4)     // Catch:{ IOException -> 0x017c }
                r7.a r1 = (p376r7.C16351a) r1     // Catch:{ IOException -> 0x017c }
            L_0x008f:
                int r4 = r1.f66844c     // Catch:{ IOException -> 0x017c }
                int r5 = r1.f66845d     // Catch:{ IOException -> 0x017c }
                if (r4 >= r5) goto L_0x00a0
                java.lang.String r4 = "All output not processed!"
                r1.mo79023p(r4)     // Catch:{ IOException -> 0x017c }
                java.lang.String r4 = "Did you forget the super.commandOutput call or are you waiting on the command object?"
                r1.mo79023p(r4)     // Catch:{ IOException -> 0x017c }
                goto L_0x00a5
            L_0x00a0:
                java.lang.String r4 = "Unexpected Termination."
                r1.mo79023p(r4)     // Catch:{ IOException -> 0x017c }
            L_0x00a5:
                r7.b r1 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                p376r7.C16355b.m98085q(r1)     // Catch:{ IOException -> 0x017c }
                r1 = r0
                goto L_0x0069
            L_0x00ac:
                r7.b r0 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                int unused = r0.f66880p = r3     // Catch:{ IOException -> 0x017c }
                goto L_0x0186
            L_0x00b3:
                r7.b r1 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                java.util.List r1 = r1.f66873i     // Catch:{ IOException -> 0x017c }
                r7.b r5 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                int r5 = r5.f66880p     // Catch:{ IOException -> 0x017c }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ IOException -> 0x017c }
                r7.a r1 = (p376r7.C16351a) r1     // Catch:{ IOException -> 0x017c }
            L_0x00c5:
                java.lang.String r5 = "F*D^W@#FGF"
                int r5 = r4.indexOf(r5)     // Catch:{ IOException -> 0x017c }
                r6 = -1
                if (r5 != r6) goto L_0x00d4
                int r7 = r1.f66855n     // Catch:{ IOException -> 0x017c }
                r1.mo79018k(r7, r4)     // Catch:{ IOException -> 0x017c }
                goto L_0x00f3
            L_0x00d4:
                if (r5 <= 0) goto L_0x00f3
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017c }
                r7.<init>()     // Catch:{ IOException -> 0x017c }
                java.lang.String r8 = "Found token, line: "
                r7.append(r8)     // Catch:{ IOException -> 0x017c }
                r7.append(r4)     // Catch:{ IOException -> 0x017c }
                java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x017c }
                p367q7.C16225a.m97490m(r7)     // Catch:{ IOException -> 0x017c }
                int r7 = r1.f66855n     // Catch:{ IOException -> 0x017c }
                java.lang.String r8 = r4.substring(r3, r5)     // Catch:{ IOException -> 0x017c }
                r1.mo79018k(r7, r8)     // Catch:{ IOException -> 0x017c }
            L_0x00f3:
                if (r5 < 0) goto L_0x0002
                java.lang.String r4 = r4.substring(r5)     // Catch:{ IOException -> 0x017c }
                java.lang.String r5 = " "
                java.lang.String[] r4 = r4.split(r5)     // Catch:{ IOException -> 0x017c }
                int r5 = r4.length     // Catch:{ IOException -> 0x017c }
                r7 = 2
                if (r5 < r7) goto L_0x0002
                r5 = r4[r2]     // Catch:{ IOException -> 0x017c }
                if (r5 == 0) goto L_0x0002
                r5 = r4[r2]     // Catch:{ NumberFormatException -> 0x010e }
                int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x010e }
                goto L_0x010f
            L_0x010e:
                r5 = 0
            L_0x010f:
                r4 = r4[r7]     // Catch:{ NumberFormatException -> 0x0115 }
                int r6 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0115 }
            L_0x0115:
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                int r4 = r4.f66883s     // Catch:{ IOException -> 0x017c }
                if (r5 != r4) goto L_0x0002
                r7.b r4 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                r4.mo79030K(r1)     // Catch:{ IOException -> 0x017c }
                r4 = 0
            L_0x0123:
                if (r1 == 0) goto L_0x0163
                int r5 = r1.f66844c     // Catch:{ IOException -> 0x017c }
                int r7 = r1.f66845d     // Catch:{ IOException -> 0x017c }
                if (r5 <= r7) goto L_0x0163
                if (r4 != 0) goto L_0x014f
                int r4 = r4 + 1
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017c }
                r5.<init>()     // Catch:{ IOException -> 0x017c }
                java.lang.String r7 = "Waiting for output to be processed. "
                r5.append(r7)     // Catch:{ IOException -> 0x017c }
                int r7 = r1.f66845d     // Catch:{ IOException -> 0x017c }
                r5.append(r7)     // Catch:{ IOException -> 0x017c }
                java.lang.String r7 = " Of "
                r5.append(r7)     // Catch:{ IOException -> 0x017c }
                int r7 = r1.f66844c     // Catch:{ IOException -> 0x017c }
                r5.append(r7)     // Catch:{ IOException -> 0x017c }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x017c }
                p367q7.C16225a.m97490m(r5)     // Catch:{ IOException -> 0x017c }
            L_0x014f:
                monitor-enter(r9)     // Catch:{ Exception -> 0x015a }
                r7 = 2000(0x7d0, double:9.88E-321)
                r9.wait(r7)     // Catch:{ all -> 0x0157 }
                monitor-exit(r9)     // Catch:{ all -> 0x0157 }
                goto L_0x0123
            L_0x0157:
                r5 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x0157 }
                throw r5     // Catch:{ Exception -> 0x015a }
            L_0x015a:
                r5 = move-exception
                java.lang.String r5 = r5.getMessage()     // Catch:{ IOException -> 0x017c }
                p367q7.C16225a.m97490m(r5)     // Catch:{ IOException -> 0x017c }
                goto L_0x0123
            L_0x0163:
                java.lang.String r4 = "Read all output"
                p367q7.C16225a.m97490m(r4)     // Catch:{ IOException -> 0x017c }
                r1.mo79019l(r6)     // Catch:{ IOException -> 0x017c }
                r1.mo79012b()     // Catch:{ IOException -> 0x017c }
                r7.b r1 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                p376r7.C16355b.m98085q(r1)     // Catch:{ IOException -> 0x017c }
                r7.b r1 = p376r7.C16355b.this     // Catch:{ IOException -> 0x017c }
                p376r7.C16355b.m98073e(r1)     // Catch:{ IOException -> 0x017c }
                goto L_0x0001
            L_0x017a:
                r0 = move-exception
                goto L_0x01ad
            L_0x017c:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x017a }
                q7.a$f r4 = p367q7.C16225a.C16231f.ERROR     // Catch:{ all -> 0x017a }
                p367q7.C16225a.m97493p(r1, r4, r0)     // Catch:{ all -> 0x017a }
            L_0x0186:
                r7.b r0 = p376r7.C16355b.this
                java.io.OutputStreamWriter r1 = r0.f66872h
                r0.m98061C(r1)
                r7.b r0 = p376r7.C16355b.this
                java.io.BufferedReader r1 = r0.f66871g
                r0.m98060B(r1)
                r7.b r0 = p376r7.C16355b.this
                java.io.BufferedReader r1 = r0.f66870f
                r0.m98060B(r1)
                java.lang.String r0 = "Shell destroyed"
                p367q7.C16225a.m97490m(r0)
                r7.b r0 = p376r7.C16355b.this
                r0.f66878n = r2
                r0.f66877m = r3
                return
            L_0x01ad:
                r7.b r1 = p376r7.C16355b.this
                java.io.OutputStreamWriter r4 = r1.f66872h
                r1.m98061C(r4)
                r7.b r1 = p376r7.C16355b.this
                java.io.BufferedReader r4 = r1.f66871g
                r1.m98060B(r4)
                r7.b r1 = p376r7.C16355b.this
                java.io.BufferedReader r4 = r1.f66870f
                r1.m98060B(r4)
                java.lang.String r1 = "Shell destroyed"
                p367q7.C16225a.m97490m(r1)
                r7.b r1 = p376r7.C16355b.this
                r1.f66878n = r2
                r1.f66877m = r3
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p376r7.C16355b.C16358c.run():void");
        }
    }

    /* renamed from: r7.b$d */
    /* compiled from: Shell */
    public enum C16359d {
        NORMAL("normal"),
        SHELL("u:r:shell:s0"),
        SYSTEM_SERVER("u:r:system_server:s0"),
        SYSTEM_APP("u:r:system_app:s0"),
        PLATFORM_APP("u:r:platform_app:s0"),
        UNTRUSTED_APP("u:r:untrusted_app:s0"),
        RECOVERY("u:r:recovery:s0"),
        SUPERSU("u:r:supersu:s0");
        
        private String value;

        private C16359d(String str) {
            this.value = str;
        }

        /* renamed from: b */
        public String mo79037b() {
            return this.value;
        }
    }

    /* renamed from: r7.b$e */
    /* compiled from: Shell */
    public enum C16360e {
        NORMAL,
        ROOT,
        CUSTOM
    }

    /* renamed from: r7.b$f */
    /* compiled from: Shell */
    protected static class C16361f extends Thread {

        /* renamed from: a */
        public int f66903a;

        /* renamed from: c */
        public C16355b f66904c;

        /* synthetic */ C16361f(C16355b bVar, C16356a aVar) {
            this(bVar);
        }

        /* renamed from: a */
        private void m98102a() {
            Field field;
            try {
                Class<?> cls = this.f66904c.f66869e.getClass();
                try {
                    field = cls.getDeclaredField("pid");
                } catch (NoSuchFieldException unused) {
                    field = cls.getDeclaredField("id");
                }
                field.setAccessible(true);
                int intValue = ((Integer) field.get(this.f66904c.f66869e)).intValue();
                OutputStreamWriter t = this.f66904c.f66872h;
                t.write("(echo -17 > /proc/" + intValue + "/oom_adj) &> /dev/null\n");
                this.f66904c.f66872h.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
                this.f66904c.f66872h.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                this.f66904c.f66872h.write("echo Started\n");
                this.f66904c.f66872h.flush();
                while (true) {
                    String readLine = this.f66904c.f66870f.readLine();
                    if (readLine == null) {
                        throw new EOFException();
                    } else if (!"".equals(readLine)) {
                        if ("Started".equals(readLine)) {
                            this.f66903a = 1;
                            m98102a();
                            return;
                        }
                        String unused = this.f66904c.f66868d = "unknown error occurred.";
                    }
                }
            } catch (IOException e) {
                this.f66903a = -42;
                if (e.getMessage() != null) {
                    String unused2 = this.f66904c.f66868d = e.getMessage();
                } else {
                    String unused3 = this.f66904c.f66868d = "RootAccess denied?.";
                }
            }
        }

        private C16361f(C16355b bVar) {
            this.f66903a = -911;
            this.f66904c = bVar;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|32|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x019a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x01b6 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x01b6=Splitter:B:32:0x01b6, B:27:0x019a=Splitter:B:27:0x019a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C16355b(java.lang.String r6, p376r7.C16355b.C16360e r7, p376r7.C16355b.C16359d r8, int r9) throws java.io.IOException, java.util.concurrent.TimeoutException, com.stericson.RootShell.exceptions.RootDeniedException {
        /*
            r5 = this;
            r5.<init>()
            r0 = 25000(0x61a8, float:3.5032E-41)
            r5.f66865a = r0
            r0 = 0
            r5.f66866b = r0
            r7.b$d r1 = p376r7.C16355b.C16359d.NORMAL
            r5.f66867c = r1
            java.lang.String r2 = ""
            r5.f66868d = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.f66873i = r2
            r2 = 0
            r5.f66874j = r2
            r5.f66875k = r0
            r5.f66876l = r2
            r5.f66877m = r2
            r5.f66878n = r2
            r3 = 5000(0x1388, float:7.006E-42)
            r5.f66879o = r3
            r5.f66880p = r2
            r5.f66881q = r2
            r5.f66882r = r2
            r5.f66883s = r2
            r5.f66884t = r2
            r7.b$a r3 = new r7.b$a
            r3.<init>()
            r5.f66885u = r3
            r7.b$c r3 = new r7.b$c
            r3.<init>()
            r5.f66886v = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Starting shell: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            p367q7.C16225a.m97490m(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Context: "
            r3.append(r4)
            java.lang.String r4 = r8.mo79037b()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            p367q7.C16225a.m97490m(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Timeout: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            p367q7.C16225a.m97490m(r3)
            r5.f66866b = r7
            if (r9 <= 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            int r9 = r5.f66865a
        L_0x0087:
            r5.f66865a = r9
            r5.f66867c = r8
            if (r8 != r1) goto L_0x0099
            java.lang.Runtime r7 = java.lang.Runtime.getRuntime()
            java.lang.Process r6 = r7.exec(r6)
            r5.f66869e = r6
            goto L_0x012a
        L_0x0099:
            java.lang.String r7 = r5.m98064H(r2)
            r8 = 1
            java.lang.String r8 = r5.m98064H(r8)
            boolean r9 = r5.mo79028I()
            if (r9 == 0) goto L_0x00db
            if (r7 == 0) goto L_0x00db
            if (r8 == 0) goto L_0x00db
            java.lang.String r9 = "SUPERSU"
            boolean r9 = r7.endsWith(r9)
            if (r9 == 0) goto L_0x00db
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            int r9 = r9.intValue()
            r1 = 190(0xbe, float:2.66E-43)
            if (r9 < r1) goto L_0x00db
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " --context "
            r7.append(r6)
            r7.b$d r6 = r5.f66867c
            java.lang.String r6 = r6.mo79037b()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            goto L_0x0120
        L_0x00db:
            java.lang.String r9 = "Su binary --context switch not supported!"
            p367q7.C16225a.m97490m(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "Su binary display version: "
            r9.append(r1)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            p367q7.C16225a.m97490m(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Su binary internal version: "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            p367q7.C16225a.m97490m(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "SELinuxEnforcing: "
            r7.append(r8)
            boolean r8 = r5.mo79028I()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            p367q7.C16225a.m97490m(r7)
        L_0x0120:
            java.lang.Runtime r7 = java.lang.Runtime.getRuntime()
            java.lang.Process r6 = r7.exec(r6)
            r5.f66869e = r6
        L_0x012a:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.lang.Process r8 = r5.f66869e
            java.io.InputStream r8 = r8.getInputStream()
            java.lang.String r9 = "UTF-8"
            r7.<init>(r8, r9)
            r6.<init>(r7)
            r5.f66870f = r6
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.lang.Process r8 = r5.f66869e
            java.io.InputStream r8 = r8.getErrorStream()
            r7.<init>(r8, r9)
            r6.<init>(r7)
            r5.f66871g = r6
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter
            java.lang.Process r7 = r5.f66869e
            java.io.OutputStream r7 = r7.getOutputStream()
            r6.<init>(r7, r9)
            r5.f66872h = r6
            r7.b$f r6 = new r7.b$f
            r6.<init>(r5, r0)
            r6.start()
            int r7 = r5.f66865a     // Catch:{ InterruptedException -> 0x01cd }
            long r7 = (long) r7     // Catch:{ InterruptedException -> 0x01cd }
            r6.join(r7)     // Catch:{ InterruptedException -> 0x01cd }
            int r7 = r6.f66903a     // Catch:{ InterruptedException -> 0x01cd }
            r8 = -911(0xfffffffffffffc71, float:NaN)
            if (r7 == r8) goto L_0x01b1
            r8 = -42
            if (r7 == r8) goto L_0x0195
            java.lang.Thread r7 = new java.lang.Thread     // Catch:{ InterruptedException -> 0x01cd }
            java.lang.Runnable r8 = r5.f66885u     // Catch:{ InterruptedException -> 0x01cd }
            java.lang.String r9 = "Shell Input"
            r7.<init>(r8, r9)     // Catch:{ InterruptedException -> 0x01cd }
            r8 = 5
            r7.setPriority(r8)     // Catch:{ InterruptedException -> 0x01cd }
            r7.start()     // Catch:{ InterruptedException -> 0x01cd }
            java.lang.Thread r7 = new java.lang.Thread     // Catch:{ InterruptedException -> 0x01cd }
            java.lang.Runnable r9 = r5.f66886v     // Catch:{ InterruptedException -> 0x01cd }
            java.lang.String r0 = "Shell Output"
            r7.<init>(r9, r0)     // Catch:{ InterruptedException -> 0x01cd }
            r7.setPriority(r8)     // Catch:{ InterruptedException -> 0x01cd }
            r7.start()     // Catch:{ InterruptedException -> 0x01cd }
            return
        L_0x0195:
            java.lang.Process r7 = r5.f66869e     // Catch:{ Exception -> 0x019a }
            r7.destroy()     // Catch:{ Exception -> 0x019a }
        L_0x019a:
            java.io.BufferedReader r7 = r5.f66870f     // Catch:{ InterruptedException -> 0x01cd }
            r5.m98060B(r7)     // Catch:{ InterruptedException -> 0x01cd }
            java.io.BufferedReader r7 = r5.f66871g     // Catch:{ InterruptedException -> 0x01cd }
            r5.m98060B(r7)     // Catch:{ InterruptedException -> 0x01cd }
            java.io.OutputStreamWriter r7 = r5.f66872h     // Catch:{ InterruptedException -> 0x01cd }
            r5.m98061C(r7)     // Catch:{ InterruptedException -> 0x01cd }
            com.stericson.RootShell.exceptions.RootDeniedException r7 = new com.stericson.RootShell.exceptions.RootDeniedException     // Catch:{ InterruptedException -> 0x01cd }
            java.lang.String r8 = "Root Access Denied"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x01cd }
            throw r7     // Catch:{ InterruptedException -> 0x01cd }
        L_0x01b1:
            java.lang.Process r7 = r5.f66869e     // Catch:{ Exception -> 0x01b6 }
            r7.destroy()     // Catch:{ Exception -> 0x01b6 }
        L_0x01b6:
            java.io.BufferedReader r7 = r5.f66870f     // Catch:{ InterruptedException -> 0x01cd }
            r5.m98060B(r7)     // Catch:{ InterruptedException -> 0x01cd }
            java.io.BufferedReader r7 = r5.f66871g     // Catch:{ InterruptedException -> 0x01cd }
            r5.m98060B(r7)     // Catch:{ InterruptedException -> 0x01cd }
            java.io.OutputStreamWriter r7 = r5.f66872h     // Catch:{ InterruptedException -> 0x01cd }
            r5.m98061C(r7)     // Catch:{ InterruptedException -> 0x01cd }
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x01cd }
            java.lang.String r8 = r5.f66868d     // Catch:{ InterruptedException -> 0x01cd }
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x01cd }
            throw r7     // Catch:{ InterruptedException -> 0x01cd }
        L_0x01cd:
            r6.interrupt()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p376r7.C16355b.<init>(java.lang.String, r7.b$e, r7.b$d, int):void");
    }

    /* renamed from: A */
    public static void m98059A() throws IOException {
        C16225a.m97490m("Request to close custom shell!");
        C16355b bVar = f66863y;
        if (bVar != null) {
            bVar.mo79033y();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m98060B(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m98061C(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: D */
    public static void m98062D() throws IOException {
        C16225a.m97490m("Request to close root shell!");
        C16355b bVar = f66861w;
        if (bVar != null) {
            bVar.mo79033y();
        }
    }

    /* renamed from: E */
    public static void m98063E() throws IOException {
        C16225a.m97490m("Request to close normal shell!");
        C16355b bVar = f66862x;
        if (bVar != null) {
            bVar.mo79033y();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:16|17|(1:19)|20|21|22|23|(3:24|(2:27|(2:29|(1:55)(2:56|53))(3:31|32|(1:54)(2:57|53)))(0)|35)|34|35|36) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c A[Catch:{ IOException -> 0x006f, InterruptedException -> 0x0069 }] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String m98064H(boolean r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x0005
            r0 = 0
            goto L_0x0006
        L_0x0005:
            r0 = 1
        L_0x0006:
            java.lang.String[] r1 = f66864z     // Catch:{ all -> 0x007b }
            r1 = r1[r0]     // Catch:{ all -> 0x007b }
            if (r1 != 0) goto L_0x0075
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x006f, InterruptedException -> 0x0069 }
            if (r8 == 0) goto L_0x0016
            java.lang.String r3 = "su -V"
            goto L_0x0018
        L_0x0016:
            java.lang.String r3 = "su -v"
        L_0x0018:
            java.lang.Process r2 = r2.exec(r3, r1)     // Catch:{ IOException -> 0x006f, InterruptedException -> 0x0069 }
            r2.waitFor()     // Catch:{ IOException -> 0x006f, InterruptedException -> 0x0069 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x007b }
            r3.<init>()     // Catch:{ all -> 0x007b }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x007b }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x007b }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ all -> 0x007b }
            r5.<init>(r6)     // Catch:{ all -> 0x007b }
            r4.<init>(r5)     // Catch:{ all -> 0x007b }
        L_0x0032:
            java.lang.String r5 = r4.readLine()     // Catch:{ IOException -> 0x003c }
            if (r5 == 0) goto L_0x003c
            r3.add(r5)     // Catch:{ IOException -> 0x003c }
            goto L_0x0032
        L_0x003c:
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r2.destroy()     // Catch:{ all -> 0x007b }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x007b }
        L_0x0046:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x007b }
            if (r8 != 0) goto L_0x005d
            java.lang.String r4 = "."
            boolean r4 = r3.contains(r4)     // Catch:{ all -> 0x007b }
            if (r4 == 0) goto L_0x0046
            goto L_0x0063
        L_0x005d:
            int r4 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0046 }
            if (r4 <= 0) goto L_0x0046
        L_0x0063:
            r1 = r3
        L_0x0064:
            java.lang.String[] r8 = f66864z     // Catch:{ all -> 0x007b }
            r8[r0] = r1     // Catch:{ all -> 0x007b }
            goto L_0x0075
        L_0x0069:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x007b }
            monitor-exit(r7)
            return r1
        L_0x006f:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x007b }
            monitor-exit(r7)
            return r1
        L_0x0075:
            java.lang.String[] r8 = f66864z     // Catch:{ all -> 0x007b }
            r8 = r8[r0]     // Catch:{ all -> 0x007b }
            monitor-exit(r7)
            return r8
        L_0x007b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p376r7.C16355b.m98064H(boolean):java.lang.String");
    }

    /* renamed from: L */
    public static C16355b m98065L() throws IOException, TimeoutException, RootDeniedException {
        return m98066M(0, 3);
    }

    /* renamed from: M */
    public static C16355b m98066M(int i, int i2) throws IOException, TimeoutException, RootDeniedException {
        return m98067N(i, f66860A, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r1 = r3;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p376r7.C16355b m98067N(int r4, p376r7.C16355b.C16359d r5, int r6) throws java.io.IOException, java.util.concurrent.TimeoutException, com.stericson.RootShell.exceptions.RootDeniedException {
        /*
            r7.b r0 = f66861w
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "Starting Root Shell!"
            p367q7.C16225a.m97490m(r0)
            java.lang.String r0 = "su"
            r1 = 0
        L_0x000c:
            r7.b r2 = f66861w
            if (r2 != 0) goto L_0x00a0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            r2.<init>()     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            java.lang.String r3 = "Trying to open Root Shell, attempt #"
            r2.append(r3)     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            r2.append(r1)     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            p367q7.C16225a.m97490m(r2)     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            r7.b r2 = new r7.b     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            r7.b$e r3 = p376r7.C16355b.C16360e.ROOT     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            r2.<init>(r0, r3, r5, r4)     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            f66861w = r2     // Catch:{ IOException -> 0x0046, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            goto L_0x000c
        L_0x002e:
            r2 = move-exception
            int r3 = r1 + 1
            if (r1 >= r6) goto L_0x0034
            goto L_0x004b
        L_0x0034:
            java.lang.String r4 = "TimeoutException, could not start shell"
            p367q7.C16225a.m97490m(r4)
            throw r2
        L_0x003a:
            r2 = move-exception
            int r3 = r1 + 1
            if (r1 >= r6) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            java.lang.String r4 = "RootDeniedException, could not start shell"
            p367q7.C16225a.m97490m(r4)
            throw r2
        L_0x0046:
            r2 = move-exception
            int r3 = r1 + 1
            if (r1 >= r6) goto L_0x004d
        L_0x004b:
            r1 = r3
            goto L_0x000c
        L_0x004d:
            java.lang.String r4 = "IOException, could not start shell"
            p367q7.C16225a.m97490m(r4)
            throw r2
        L_0x0053:
            r7.b$d r4 = r0.f66867c
            if (r4 == r5) goto L_0x009b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            r4.<init>()     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            java.lang.String r0 = "Context is different than open shell, switching context... "
            r4.append(r0)     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            r7.b r0 = f66861w     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            r7.b$d r0 = r0.f66867c     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            r4.append(r0)     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            java.lang.String r0 = " VS "
            r4.append(r0)     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            r4.append(r5)     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            p367q7.C16225a.m97490m(r4)     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            r7.b r4 = f66861w     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            r4.mo79031P(r5)     // Catch:{ IOException -> 0x0091, RootDeniedException -> 0x0087, TimeoutException -> 0x007d }
            goto L_0x00a0
        L_0x007d:
            r4 = move-exception
            if (r6 <= 0) goto L_0x0081
            goto L_0x00a0
        L_0x0081:
            java.lang.String r5 = "TimeoutException, could not switch context!"
            p367q7.C16225a.m97490m(r5)
            throw r4
        L_0x0087:
            r4 = move-exception
            if (r6 <= 0) goto L_0x008b
            goto L_0x00a0
        L_0x008b:
            java.lang.String r5 = "RootDeniedException, could not switch context!"
            p367q7.C16225a.m97490m(r5)
            throw r4
        L_0x0091:
            r4 = move-exception
            if (r6 <= 0) goto L_0x0095
            goto L_0x00a0
        L_0x0095:
            java.lang.String r5 = "IOException, could not switch context!"
            p367q7.C16225a.m97490m(r5)
            throw r4
        L_0x009b:
            java.lang.String r4 = "Using Existing Root Shell!"
            p367q7.C16225a.m97490m(r4)
        L_0x00a0:
            r7.b r4 = f66861w
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p376r7.C16355b.m98067N(int, r7.b$d, int):r7.b");
    }

    /* renamed from: O */
    public static C16355b m98068O(int i) throws IOException, TimeoutException {
        try {
            if (f66862x == null) {
                C16225a.m97490m("Starting Shell!");
                f66862x = new C16355b("/system/bin/sh", C16360e.NORMAL, C16359d.NORMAL, i);
            } else {
                C16225a.m97490m("Using Existing Shell!");
            }
            return f66862x;
        } catch (RootDeniedException unused) {
            throw new IOException();
        }
    }

    /* renamed from: e */
    static /* synthetic */ int m98073e(C16355b bVar) {
        int i = bVar.f66883s;
        bVar.f66883s = i + 1;
        return i;
    }

    /* renamed from: m */
    static /* synthetic */ int m98081m(C16355b bVar) {
        int i = bVar.f66881q;
        bVar.f66881q = i + 1;
        return i;
    }

    /* renamed from: q */
    static /* synthetic */ int m98085q(C16355b bVar) {
        int i = bVar.f66880p;
        bVar.f66880p = i + 1;
        return i;
    }

    /* renamed from: v */
    static /* synthetic */ int m98090v(C16355b bVar) {
        int i = bVar.f66882r;
        bVar.f66882r = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m98091x() {
        this.f66884t = true;
        int i = this.f66879o;
        int abs = Math.abs(i - (i / 4));
        C16225a.m97490m("Cleaning up: " + abs);
        for (int i2 = 0; i2 < abs; i2++) {
            this.f66873i.remove(0);
        }
        this.f66880p = this.f66873i.size() - 1;
        this.f66881q = this.f66873i.size() - 1;
        this.f66884t = false;
    }

    /* renamed from: z */
    public static void m98092z() throws IOException {
        C16225a.m97490m("Request to close all shells!");
        m98063E();
        m98062D();
        m98059A();
    }

    /* renamed from: F */
    public int mo79026F(C16351a aVar) {
        return this.f66873i.indexOf(aVar);
    }

    /* renamed from: G */
    public String mo79027G(C16351a aVar) {
        return "Command is in position " + mo79026F(aVar) + " currently executing command at position " + this.f66881q + " and the number of commands is " + this.f66873i.size();
    }

    /* renamed from: I */
    public synchronized boolean mo79028I() {
        FileInputStream fileInputStream;
        if (this.f66875k == null) {
            boolean z = null;
            if (new File("/sys/fs/selinux/enforce").exists()) {
                try {
                    fileInputStream = new FileInputStream("/sys/fs/selinux/enforce");
                    z = Boolean.valueOf(fileInputStream.read() == 49);
                    fileInputStream.close();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
            if (z == null) {
                z = true;
            }
            if (z == null) {
                z = Boolean.FALSE;
            }
            this.f66875k = z;
        }
        return this.f66875k.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo79029J() {
        new C16357b().start();
    }

    /* renamed from: K */
    public void mo79030K(C16351a aVar) {
        while (this.f66871g.ready() && aVar != null) {
            try {
                String readLine = this.f66871g.readLine();
                if (readLine != null) {
                    aVar.mo79018k(aVar.f66855n, readLine);
                } else {
                    return;
                }
            } catch (Exception e) {
                C16225a.m97493p(e.getMessage(), C16225a.C16231f.ERROR, e);
                return;
            }
        }
    }

    /* renamed from: P */
    public C16355b mo79031P(C16359d dVar) throws IOException, TimeoutException, RootDeniedException {
        if (this.f66866b == C16360e.ROOT) {
            try {
                m98062D();
            } catch (Exception unused) {
                C16225a.m97490m("Problem closing shell while trying to switch context...");
            }
            return m98067N(this.f66865a, dVar, 3);
        }
        C16225a.m97490m("Can only switch context on a root shell!");
        return this;
    }

    /* renamed from: w */
    public C16351a mo79032w(C16351a aVar) throws IOException {
        if (this.f66874j) {
            throw new IllegalStateException("Unable to add commands to a closed shell");
        } else if (!aVar.f66848g) {
            do {
            } while (this.f66884t);
            this.f66873i.add(aVar);
            mo79029J();
            return aVar;
        } else {
            throw new IllegalStateException("This command has already been executed. (Don't re-use command instances.)");
        }
    }

    /* renamed from: y */
    public void mo79033y() throws IOException {
        C16225a.m97490m("Request to close shell!");
        int i = 0;
        while (this.f66876l) {
            C16225a.m97490m("Waiting on shell to finish executing before closing...");
            i++;
            if (i > 10000) {
                break;
            }
        }
        synchronized (this.f66873i) {
            this.f66874j = true;
            mo79029J();
        }
        C16225a.m97490m("Shell Closed!");
        if (this == f66861w) {
            f66861w = null;
        } else if (this == f66862x) {
            f66862x = null;
        } else if (this == f66863y) {
            f66863y = null;
        }
    }
}
