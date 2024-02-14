package p089f4;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.p353io.FilenameUtils;
import org.apache.commons.p353io.IOUtils;

/* renamed from: f4.a */
/* compiled from: DiskLruCache */
public final class C7293a implements Closeable {

    /* renamed from: A */
    private final LinkedHashMap<String, C7297d> f17832A = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f17833B;

    /* renamed from: C */
    private long f17834C = 0;

    /* renamed from: D */
    final ThreadPoolExecutor f17835D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C7295b((C7294a) null));

    /* renamed from: E */
    private final Callable<Void> f17836E = new C7294a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f17837a;

    /* renamed from: c */
    private final File f17838c;

    /* renamed from: d */
    private final File f17839d;

    /* renamed from: f */
    private final File f17840f;

    /* renamed from: g */
    private final int f17841g;

    /* renamed from: o */
    private long f17842o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final int f17843p;

    /* renamed from: s */
    private long f17844s = 0;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Writer f17845z;

    /* renamed from: f4.a$a */
    /* compiled from: DiskLruCache */
    class C7294a implements Callable<Void> {
        C7294a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                f4.a r0 = p089f4.C7293a.this
                monitor-enter(r0)
                f4.a r1 = p089f4.C7293a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f17845z     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                f4.a r1 = p089f4.C7293a.this     // Catch:{ all -> 0x0028 }
                r1.m30125E()     // Catch:{ all -> 0x0028 }
                f4.a r1 = p089f4.C7293a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m30138w()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                f4.a r1 = p089f4.C7293a.this     // Catch:{ all -> 0x0028 }
                r1.m30123B()     // Catch:{ all -> 0x0028 }
                f4.a r1 = p089f4.C7293a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f17833B = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p089f4.C7293a.C7294a.call():java.lang.Void");
        }
    }

    /* renamed from: f4.a$b */
    /* compiled from: DiskLruCache */
    private static final class C7295b implements ThreadFactory {
        private C7295b() {
        }

        /* synthetic */ C7295b(C7294a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: f4.a$c */
    /* compiled from: DiskLruCache */
    public final class C7296c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C7297d f17847a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f17848b;

        /* renamed from: c */
        private boolean f17849c;

        /* synthetic */ C7296c(C7293a aVar, C7297d dVar, C7294a aVar2) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo37216a() throws IOException {
            C7293a.this.m30135o(this, false);
        }

        /* renamed from: b */
        public void mo37217b() {
            if (!this.f17849c) {
                try {
                    mo37216a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo37218e() throws IOException {
            C7293a.this.m30135o(this, true);
            this.f17849c = true;
        }

        /* renamed from: f */
        public File mo37219f(int i) throws IOException {
            File k;
            synchronized (C7293a.this) {
                if (this.f17847a.f17856f == this) {
                    if (!this.f17847a.f17855e) {
                        this.f17848b[i] = true;
                    }
                    k = this.f17847a.mo37221k(i);
                    if (!C7293a.this.f17837a.exists()) {
                        C7293a.this.f17837a.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        private C7296c(C7297d dVar) {
            this.f17847a = dVar;
            this.f17848b = dVar.f17855e ? null : new boolean[C7293a.this.f17843p];
        }
    }

    /* renamed from: f4.a$d */
    /* compiled from: DiskLruCache */
    private final class C7297d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f17851a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f17852b;

        /* renamed from: c */
        File[] f17853c;

        /* renamed from: d */
        File[] f17854d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f17855e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C7296c f17856f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f17857g;

        /* synthetic */ C7297d(C7293a aVar, String str, C7294a aVar2) {
            this(str);
        }

        /* renamed from: m */
        private IOException m30162m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m30163n(String[] strArr) throws IOException {
            if (strArr.length == C7293a.this.f17843p) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f17852b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m30162m(strArr);
                    }
                }
                return;
            }
            throw m30162m(strArr);
        }

        /* renamed from: j */
        public File mo37220j(int i) {
            return this.f17853c[i];
        }

        /* renamed from: k */
        public File mo37221k(int i) {
            return this.f17854d[i];
        }

        /* renamed from: l */
        public String mo37222l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f17852b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private C7297d(String str) {
            this.f17851a = str;
            this.f17852b = new long[C7293a.this.f17843p];
            this.f17853c = new File[C7293a.this.f17843p];
            this.f17854d = new File[C7293a.this.f17843p];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i = 0; i < C7293a.this.f17843p; i++) {
                sb.append(i);
                this.f17853c[i] = new File(C7293a.this.f17837a, sb.toString());
                sb.append(".tmp");
                this.f17854d[i] = new File(C7293a.this.f17837a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: f4.a$e */
    /* compiled from: DiskLruCache */
    public final class C7298e {

        /* renamed from: a */
        private final String f17859a;

        /* renamed from: b */
        private final long f17860b;

        /* renamed from: c */
        private final long[] f17861c;

        /* renamed from: d */
        private final File[] f17862d;

        /* synthetic */ C7298e(C7293a aVar, String str, long j, File[] fileArr, long[] jArr, C7294a aVar2) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo37223a(int i) {
            return this.f17862d[i];
        }

        private C7298e(String str, long j, File[] fileArr, long[] jArr) {
            this.f17859a = str;
            this.f17860b = j;
            this.f17862d = fileArr;
            this.f17861c = jArr;
        }
    }

    private C7293a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f17837a = file2;
        this.f17841g = i;
        this.f17838c = new File(file2, "journal");
        this.f17839d = new File(file2, "journal.tmp");
        this.f17840f = new File(file2, "journal.bkp");
        this.f17843p = i2;
        this.f17842o = j;
    }

    /* renamed from: A */
    private void m30122A(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f17832A.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C7297d dVar = this.f17832A.get(str2);
            if (dVar == null) {
                dVar = new C7297d(this, str2, (C7294a) null);
                this.f17832A.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f17855e = true;
                C7296c unused2 = dVar.f17856f = null;
                dVar.m30163n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C7296c unused3 = dVar.f17856f = new C7296c(this, dVar, (C7294a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: B */
    public synchronized void m30123B() throws IOException {
        Writer writer = this.f17845z;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17839d), C7301c.f17870a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write("1");
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(Integer.toString(this.f17841g));
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(Integer.toString(this.f17843p));
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            for (C7297d next : this.f17832A.values()) {
                if (next.f17856f != null) {
                    bufferedWriter.write("DIRTY " + next.f17851a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f17851a + next.mo37222l() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f17838c.exists()) {
                m30124D(this.f17838c, this.f17840f, true);
            }
            m30124D(this.f17839d, this.f17838c, false);
            this.f17840f.delete();
            this.f17845z = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17838c, true), C7301c.f17870a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: D */
    private static void m30124D(File file, File file2, boolean z) throws IOException {
        if (z) {
            m30136r(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m30125E() throws IOException {
        while (this.f17844s > this.f17842o) {
            mo37208C((String) this.f17832A.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: m */
    private void m30134m() {
        if (this.f17845z == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m30135o(p089f4.C7293a.C7296c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            f4.a$d r0 = r10.f17847a     // Catch:{ all -> 0x010e }
            f4.a$c r1 = r0.f17856f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f17855e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f17843p     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f17848b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo37221k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo37216a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo37216a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f17843p     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo37221k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo37220j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f17852b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f17852b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f17844s     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f17844s = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m30136r(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f17833B     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f17833B = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            p089f4.C7293a.C7296c unused = r0.f17856f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f17855e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f17855e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f17851a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo37222l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f17834C     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f17834C = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f17857g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, f4.a$d> r10 = r9.f17832A     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f17851a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f17851a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f17845z     // Catch:{ all -> 0x010e }
            r10.flush()     // Catch:{ all -> 0x010e }
            long r10 = r9.f17844s     // Catch:{ all -> 0x010e }
            long r0 = r9.f17842o     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m30138w()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f17835D     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f17836E     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p089f4.C7293a.m30135o(f4.a$c, boolean):void");
    }

    /* renamed from: r */
    private static void m30136r(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p089f4.C7293a.C7296c m30137u(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m30134m()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, f4.a$d> r0 = r5.f17832A     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            f4.a$d r0 = (p089f4.C7293a.C7297d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f17857g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            f4.a$d r0 = new f4.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, f4.a$d> r7 = r5.f17832A     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            f4.a$c r7 = r0.f17856f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            f4.a$c r7 = new f4.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            p089f4.C7293a.C7296c unused = r0.f17856f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f17845z     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f17845z     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f17845z     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f17845z     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f17845z     // Catch:{ all -> 0x005d }
            r6.flush()     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p089f4.C7293a.m30137u(java.lang.String, long):f4.a$c");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public boolean m30138w() {
        int i = this.f17833B;
        return i >= 2000 && i >= this.f17832A.size();
    }

    /* renamed from: x */
    public static C7293a m30139x(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m30124D(file2, file3, false);
                }
            }
            C7293a aVar = new C7293a(file, i, i2, j);
            if (aVar.f17838c.exists()) {
                try {
                    aVar.m30141z();
                    aVar.m30140y();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo37210p();
                }
            }
            file.mkdirs();
            C7293a aVar2 = new C7293a(file, i, i2, j);
            aVar2.m30123B();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: y */
    private void m30140y() throws IOException {
        m30136r(this.f17839d);
        Iterator<C7297d> it = this.f17832A.values().iterator();
        while (it.hasNext()) {
            C7297d next = it.next();
            int i = 0;
            if (next.f17856f == null) {
                while (i < this.f17843p) {
                    this.f17844s += next.f17852b[i];
                    i++;
                }
            } else {
                C7296c unused = next.f17856f = null;
                while (i < this.f17843p) {
                    m30136r(next.mo37220j(i));
                    m30136r(next.mo37221k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f17833B = r0 - r9.f17832A.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo37225e() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m30123B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f17845z = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f17838c, true), p089f4.C7301c.f17870a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30141z() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            f4.b r1 = new f4.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f17838c
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p089f4.C7301c.f17870a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo37226f()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo37226f()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo37226f()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo37226f()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo37226f()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f17841g     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f17843p     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo37226f()     // Catch:{ EOFException -> 0x005f }
            r9.m30122A(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, f4.a$d> r2 = r9.f17832A     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f17833B = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo37225e()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m30123B()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f17838c     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p089f4.C7301c.f17870a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f17845z = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p089f4.C7301c.m30172a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p089f4.C7301c.m30172a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p089f4.C7293a.m30141z():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo37208C(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m30134m()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, f4.a$d> r0 = r7.f17832A     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            f4.a$d r0 = (p089f4.C7293a.C7297d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            f4.a$c r2 = r0.f17856f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f17843p     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo37220j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f17844s     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f17852b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f17844s = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f17852b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f17833B     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f17833B = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f17845z     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f17845z     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f17845z     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f17845z     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, f4.a$d> r0 = r7.f17832A     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m30138w()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f17835D     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f17836E     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p089f4.C7293a.mo37208C(java.lang.String):boolean");
    }

    public synchronized void close() throws IOException {
        if (this.f17845z != null) {
            Iterator it = new ArrayList(this.f17832A.values()).iterator();
            while (it.hasNext()) {
                C7297d dVar = (C7297d) it.next();
                if (dVar.f17856f != null) {
                    dVar.f17856f.mo37216a();
                }
            }
            m30125E();
            this.f17845z.close();
            this.f17845z = null;
        }
    }

    /* renamed from: p */
    public void mo37210p() throws IOException {
        close();
        C7301c.m30173b(this.f17837a);
    }

    /* renamed from: s */
    public C7296c mo37211s(String str) throws IOException {
        return m30137u(str, -1);
    }

    /* renamed from: v */
    public synchronized C7298e mo37212v(String str) throws IOException {
        m30134m();
        C7297d dVar = this.f17832A.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f17855e) {
            return null;
        }
        for (File exists : dVar.f17853c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f17833B++;
        this.f17845z.append("READ");
        this.f17845z.append(' ');
        this.f17845z.append(str);
        this.f17845z.append(10);
        if (m30138w()) {
            this.f17835D.submit(this.f17836E);
        }
        return new C7298e(this, str, dVar.f17857g, dVar.f17853c, dVar.f17852b, (C7294a) null);
    }
}
