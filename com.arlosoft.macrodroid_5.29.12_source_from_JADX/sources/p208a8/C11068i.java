package p208a8;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SharedByteArrayOutputStream;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import org.apache.commons.p353io.IOUtils;
import org.apache.http.client.params.AuthPolicy;
import p421w7.C16777b;

/* renamed from: a8.i */
/* compiled from: Protocol */
class C11068i {

    /* renamed from: r */
    private static char[] f53949r = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private Socket f53950a;

    /* renamed from: b */
    private String f53951b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Properties f53952c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f53953d;

    /* renamed from: e */
    private BufferedReader f53954e;

    /* renamed from: f */
    private PrintWriter f53955f;

    /* renamed from: g */
    private TraceInputStream f53956g;

    /* renamed from: h */
    private TraceOutputStream f53957h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MailLogger f53958i;

    /* renamed from: j */
    private MailLogger f53959j;

    /* renamed from: k */
    private String f53960k = null;

    /* renamed from: l */
    private Map<String, String> f53961l = null;

    /* renamed from: m */
    private boolean f53962m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f53963n = true;

    /* renamed from: o */
    private Map<String, C11069a> f53964o = new HashMap();

    /* renamed from: p */
    private String f53965p;

    /* renamed from: q */
    private String f53966q;

    /* renamed from: a8.i$a */
    /* compiled from: Protocol */
    private abstract class C11069a {

        /* renamed from: a */
        protected C11074j f53967a;

        /* renamed from: b */
        private final String f53968b;

        /* renamed from: c */
        private final boolean f53969c;

        C11069a(C11068i iVar, String str) {
            this(str, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo62133a(String str, String str2, String str3, String str4) throws IOException {
            String str5 = "succeeded";
            String str6 = "authentication failed";
            try {
                String d = mo62136d(str, str2, str3, str4);
                if (C11068i.this.f53963n && C11068i.this.mo62109C()) {
                    MailLogger a = C11068i.this.f53958i;
                    a.fine("AUTH " + this.f53968b + " command trace suppressed");
                    C11068i.this.m74573Z();
                }
                mo62138f("AUTH " + this.f53968b, d);
                if (this.f53967a.f53977b) {
                    mo62134b(str, str2, str3, str4);
                }
                if (C11068i.this.f53963n && C11068i.this.mo62109C()) {
                    MailLogger a2 = C11068i.this.f53958i;
                    StringBuilder sb = new StringBuilder();
                    sb.append("AUTH ");
                    sb.append(this.f53968b);
                    sb.append(" ");
                    if (!this.f53967a.f53976a) {
                        str5 = "failed";
                    }
                    sb.append(str5);
                    a2.fine(sb.toString());
                }
                C11068i.this.m74569N();
                if (this.f53967a.f53976a) {
                    return true;
                }
                C11068i.this.mo62127q();
                String str7 = this.f53967a.f53978c;
                if (str7 != null) {
                    str6 = str7;
                }
                throw new EOFException(str6);
            } catch (IOException e) {
                MailLogger a3 = C11068i.this.f53958i;
                Level level = Level.FINE;
                a3.log(level, "AUTH " + this.f53968b + " failed", (Throwable) e);
                if (C11068i.this.f53963n && C11068i.this.mo62109C()) {
                    MailLogger a4 = C11068i.this.f53958i;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AUTH ");
                    sb2.append(this.f53968b);
                    sb2.append(" ");
                    if (!this.f53967a.f53976a) {
                        str5 = "failed";
                    }
                    sb2.append(str5);
                    a4.fine(sb2.toString());
                }
                C11068i.this.m74569N();
                if (this.f53967a.f53976a) {
                    return true;
                }
                C11068i.this.mo62127q();
                String str8 = this.f53967a.f53978c;
                if (str8 != null) {
                    str6 = str8;
                }
                throw new EOFException(str6);
            } catch (Throwable th) {
                if (C11068i.this.f53963n && C11068i.this.mo62109C()) {
                    MailLogger a5 = C11068i.this.f53958i;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("AUTH ");
                    sb3.append(this.f53968b);
                    sb3.append(" ");
                    if (!this.f53967a.f53976a) {
                        str5 = "failed";
                    }
                    sb3.append(str5);
                    a5.fine(sb3.toString());
                }
                C11068i.this.m74569N();
                if (!this.f53967a.f53976a) {
                    C11068i.this.mo62127q();
                    String str9 = this.f53967a.f53978c;
                    if (str9 != null) {
                        str6 = str9;
                    }
                    throw new EOFException(str6);
                }
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo62134b(String str, String str2, String str3, String str4) throws IOException;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo62135c() {
            return this.f53969c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo62136d(String str, String str2, String str3, String str4) throws IOException {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo62137e() {
            return this.f53968b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo62138f(String str, String str2) throws IOException {
            if (C11068i.this.f53958i.isLoggable(Level.FINE)) {
                MailLogger a = C11068i.this.f53958i;
                a.fine(str + " using one line authentication format");
            }
            if (str2 != null) {
                C11068i iVar = C11068i.this;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                if (str2.length() == 0) {
                    str2 = "=";
                }
                sb.append(str2);
                this.f53967a = iVar.m74570S(sb.toString());
                return;
            }
            this.f53967a = C11068i.this.m74570S(str);
        }

        C11069a(String str, boolean z) {
            this.f53968b = str.toUpperCase(Locale.ENGLISH);
            this.f53969c = z;
        }
    }

    /* renamed from: a8.i$b */
    /* compiled from: Protocol */
    private class C11070b extends C11069a {
        C11070b() {
            super(C11068i.this, "LOGIN");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo62133a(String str, String str2, String str3, String str4) throws IOException {
            String F = C11068i.this.mo62111F(str3, str4);
            if (F == null) {
                return true;
            }
            throw new EOFException(F);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo62134b(String str, String str2, String str3, String str4) throws IOException {
            throw new EOFException("LOGIN asked for more");
        }
    }

    /* renamed from: a8.i$c */
    /* compiled from: Protocol */
    private class C11071c extends C11069a {

        /* renamed from: e */
        private C16777b f53972e;

        C11071c() {
            super(C11068i.this, AuthPolicy.NTLM);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo62134b(String str, String str2, String str3, String str4) throws IOException {
            this.f53967a = C11068i.this.m74570S(this.f53972e.mo79761g(this.f53967a.f53978c.substring(4).trim()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo62136d(String str, String str2, String str3, String str4) throws IOException {
            Properties g = C11068i.this.f53952c;
            this.f53972e = new C16777b(g.getProperty(C11068i.this.f53953d + ".auth.ntlm.domain"), C11068i.this.m74592w(), str3, str4, C11068i.this.f53958i);
            Properties g2 = C11068i.this.f53952c;
            int intProperty = PropUtil.getIntProperty(g2, C11068i.this.f53953d + ".auth.ntlm.flags", 0);
            Properties g3 = C11068i.this.f53952c;
            return this.f53972e.mo79760f(intProperty, PropUtil.getBooleanProperty(g3, C11068i.this.f53953d + ".auth.ntlm.v2", true));
        }
    }

    /* renamed from: a8.i$d */
    /* compiled from: Protocol */
    private class C11072d extends C11069a {
        C11072d() {
            super("XOAUTH2", false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo62134b(String str, String str2, String str3, String str4) throws IOException {
            String str5 = this.f53967a.f53978c;
            String str6 = str5 != null ? new String(BASE64DecoderStream.decode(str5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8) : "";
            throw new EOFException("OAUTH2 authentication failed: " + str6);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo62136d(String str, String str2, String str3, String str4) throws IOException {
            return ASCIIUtility.toString(BASE64EncoderStream.encode(("user=" + str3 + "\u0001auth=Bearer " + str4 + "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo62138f(String str, String str2) throws IOException {
            C11068i iVar = C11068i.this;
            Properties g = iVar.f53952c;
            if (Boolean.valueOf(iVar.m74590s(g, C11068i.this.f53953d + ".auth.xoauth2.two.line.authentication.format")).booleanValue()) {
                if (C11068i.this.f53958i.isLoggable(Level.FINE)) {
                    MailLogger a = C11068i.this.f53958i;
                    a.fine(str + " using two line authentication format");
                }
                C11068i iVar2 = C11068i.this;
                if (str2.length() == 0) {
                    str2 = "=";
                }
                this.f53967a = iVar2.m74578c0(str, str2);
                return;
            }
            super.mo62138f(str, str2);
        }
    }

    /* renamed from: a8.i$e */
    /* compiled from: Protocol */
    private class C11073e extends C11069a {
        C11073e() {
            super(C11068i.this, "PLAIN");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo62134b(String str, String str2, String str3, String str4) throws IOException {
            throw new EOFException("PLAIN asked for more");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo62136d(String str, String str2, String str3, String str4) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
            if (str2 != null) {
                bASE64EncoderStream.write(str2.getBytes(StandardCharsets.UTF_8));
            }
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str3.getBytes(StandardCharsets.UTF_8));
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str4.getBytes(StandardCharsets.UTF_8));
            bASE64EncoderStream.flush();
            return ASCIIUtility.toString(byteArrayOutputStream.toByteArray());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011d A[LOOP:0: B:30:0x011b->B:31:0x011d, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11068i(java.lang.String r10, int r11, com.sun.mail.util.MailLogger r12, java.util.Properties r13, java.lang.String r14, boolean r15) throws java.io.IOException {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f53960k = r0
            r9.f53961l = r0
            r1 = 1
            r9.f53963n = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r9.f53964o = r2
            r9.f53951b = r10
            r9.f53952c = r13
            r9.f53953d = r14
            r9.f53958i = r12
            java.lang.String r2 = "protocol"
            com.sun.mail.util.MailLogger r2 = r12.getSubLogger(r2, r0)
            r9.f53959j = r2
            java.lang.String r2 = "mail.debug.auth"
            r3 = 0
            boolean r2 = com.sun.mail.util.PropUtil.getBooleanProperty(r13, r2, r3)
            r2 = r2 ^ r1
            r9.f53963n = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            java.lang.String r4 = ".apop.enable"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            boolean r2 = r9.m74590s(r13, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            java.lang.String r5 = ".disablecapa"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r4 = r9.m74590s(r13, r4)
            r5 = -1
            if (r11 != r5) goto L_0x005b
            r11 = 110(0x6e, float:1.54E-43)
        L_0x005b:
            java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x0150 }
            boolean r7 = r12.isLoggable(r6)     // Catch:{ IOException -> 0x0150 }
            if (r7 == 0) goto L_0x0087
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0150 }
            r7.<init>()     // Catch:{ IOException -> 0x0150 }
            java.lang.String r8 = "connecting to host \""
            r7.append(r8)     // Catch:{ IOException -> 0x0150 }
            r7.append(r10)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r8 = "\", port "
            r7.append(r8)     // Catch:{ IOException -> 0x0150 }
            r7.append(r11)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r8 = ", isSSL "
            r7.append(r8)     // Catch:{ IOException -> 0x0150 }
            r7.append(r15)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0150 }
            r12.fine(r7)     // Catch:{ IOException -> 0x0150 }
        L_0x0087:
            java.net.Socket r10 = com.sun.mail.util.SocketFetcher.getSocket(r10, r11, r13, r14, r15)     // Catch:{ IOException -> 0x0150 }
            r9.f53950a = r10     // Catch:{ IOException -> 0x0150 }
            r9.m74593y()     // Catch:{ IOException -> 0x0150 }
            a8.j r10 = r9.m74570S(r0)     // Catch:{ IOException -> 0x0150 }
            boolean r11 = r10.f53976a
            if (r11 == 0) goto L_0x0142
            if (r2 == 0) goto L_0x00c0
            java.lang.String r11 = r10.f53978c
            if (r11 == 0) goto L_0x00c0
            r15 = 60
            int r11 = r11.indexOf(r15)
            java.lang.String r15 = r10.f53978c
            r0 = 62
            int r15 = r15.indexOf(r0, r11)
            if (r11 == r5) goto L_0x00b9
            if (r15 == r5) goto L_0x00b9
            java.lang.String r10 = r10.f53978c
            int r15 = r15 + r1
            java.lang.String r10 = r10.substring(r11, r15)
            r9.f53960k = r10
        L_0x00b9:
            java.lang.String r10 = r9.f53960k
            java.lang.String r11 = "APOP challenge: {0}"
            r12.log((java.util.logging.Level) r6, (java.lang.String) r11, (java.lang.Object) r10)
        L_0x00c0:
            if (r4 != 0) goto L_0x00c9
            java.io.InputStream r10 = r9.mo62126o()
            r9.mo62117R(r10)
        L_0x00c9:
            java.lang.String r10 = "PIPELINING"
            boolean r10 = r9.mo62131x(r10)
            if (r10 != 0) goto L_0x00eb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            java.lang.String r11 = ".pipelining"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            boolean r10 = com.sun.mail.util.PropUtil.getBooleanProperty(r13, r10, r3)
            if (r10 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r10 = 0
            goto L_0x00ec
        L_0x00eb:
            r10 = 1
        L_0x00ec:
            r9.f53962m = r10
            if (r10 == 0) goto L_0x00f5
            java.lang.String r10 = "PIPELINING enabled"
            r12.config(r10)
        L_0x00f5:
            r10 = 4
            a8.i$a[] r11 = new p208a8.C11068i.C11069a[r10]
            a8.i$b r12 = new a8.i$b
            r12.<init>()
            r11[r3] = r12
            a8.i$e r12 = new a8.i$e
            r12.<init>()
            r11[r1] = r12
            r12 = 2
            a8.i$c r13 = new a8.i$c
            r13.<init>()
            r11[r12] = r13
            r12 = 3
            a8.i$d r13 = new a8.i$d
            r13.<init>()
            r11[r12] = r13
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L_0x011b:
            if (r3 >= r10) goto L_0x013b
            java.util.Map<java.lang.String, a8.i$a> r13 = r9.f53964o
            r14 = r11[r3]
            java.lang.String r14 = r14.mo62137e()
            r15 = r11[r3]
            r13.put(r14, r15)
            r13 = r11[r3]
            java.lang.String r13 = r13.mo62137e()
            r12.append(r13)
            r13 = 32
            r12.append(r13)
            int r3 = r3 + 1
            goto L_0x011b
        L_0x013b:
            java.lang.String r10 = r12.toString()
            r9.f53965p = r10
            return
        L_0x0142:
            java.net.Socket r10 = r9.f53950a
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Connect failed"
            r11.<init>(r12)
            java.io.IOException r10 = m74589p(r10, r11)
            throw r10
        L_0x0150:
            r10 = move-exception
            java.net.Socket r11 = r9.f53950a
            java.io.IOException r10 = m74589p(r11, r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11068i.<init>(java.lang.String, int, com.sun.mail.util.MailLogger, java.util.Properties, java.lang.String, boolean):void");
    }

    /* renamed from: A */
    private static boolean m74562A(Throwable th) {
        return (th instanceof Exception) || (th instanceof LinkageError);
    }

    /* renamed from: D */
    private void m74563D(String str) throws IOException {
        if (this.f53950a == null) {
            throw new IOException("Folder is closed");
        } else if (str != null) {
            this.f53955f.print(str + IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f53955f.flush();
        }
    }

    /* renamed from: G */
    private C11074j m74564G(String str, int i) throws IOException {
        m74566I(str);
        m74563D(str);
        C11074j M = m74568M();
        if (!M.f53976a) {
            m74565H();
            return M;
        }
        M.f53979d = m74567L(i);
        m74565H();
        return M;
    }

    /* renamed from: H */
    private void m74565H() {
    }

    /* renamed from: I */
    private void m74566I(String str) {
    }

    /* renamed from: L */
    private InputStream m74567L(int i) throws IOException {
        int read;
        SharedByteArrayOutputStream sharedByteArrayOutputStream = new SharedByteArrayOutputStream(i);
        int i2 = 10;
        while (true) {
            try {
                read = this.f53954e.read();
                if (read < 0) {
                    break;
                }
                if (i2 == 10 && read == 46) {
                    i2 = this.f53954e.read();
                    if (i2 == 13) {
                        read = this.f53954e.read();
                        break;
                    }
                } else {
                    i2 = read;
                }
                sharedByteArrayOutputStream.write(i2);
            } catch (InterruptedIOException e) {
                try {
                    this.f53950a.close();
                } catch (IOException unused) {
                }
                throw e;
            }
        }
        if (read >= 0) {
            return sharedByteArrayOutputStream.toStream();
        }
        throw new EOFException("EOF on socket");
    }

    /* renamed from: M */
    private C11074j m74568M() throws IOException {
        try {
            String readLine = this.f53954e.readLine();
            if (readLine != null) {
                C11074j jVar = new C11074j();
                if (readLine.startsWith("+OK")) {
                    jVar.f53976a = true;
                } else if (readLine.startsWith("+ ")) {
                    jVar.f53976a = true;
                    jVar.f53977b = true;
                } else if (readLine.startsWith("-ERR")) {
                    jVar.f53976a = false;
                } else {
                    throw new IOException("Unexpected response: " + readLine);
                }
                int indexOf = readLine.indexOf(32);
                if (indexOf >= 0) {
                    jVar.f53978c = readLine.substring(indexOf + 1);
                }
                return jVar;
            }
            this.f53959j.finest("<EOF>");
            throw new EOFException("EOF on socket");
        } catch (InterruptedIOException e) {
            try {
                this.f53950a.close();
            } catch (IOException unused) {
            }
            throw new EOFException(e.getMessage());
        } catch (SocketException e2) {
            try {
                this.f53950a.close();
            } catch (IOException unused2) {
            }
            throw new EOFException(e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m74569N() {
        if (this.f53959j.isLoggable(Level.FINEST)) {
            this.f53956g.setTrace(true);
            this.f53957h.setTrace(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public C11074j m74570S(String str) throws IOException {
        m74572U(str);
        m74563D(str);
        C11074j M = m74568M();
        m74571T();
        return M;
    }

    /* renamed from: T */
    private void m74571T() {
    }

    /* renamed from: U */
    private void m74572U(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m74573Z() {
        if (this.f53959j.isLoggable(Level.FINEST)) {
            this.f53956g.setTrace(false);
            this.f53957h.setTrace(false);
        }
    }

    /* renamed from: a0 */
    private static String m74575a0(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f53949r;
            cArr[i] = cArr2[b2 >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public C11074j m74578c0(String str, String str2) throws IOException {
        String str3 = str + " " + str2;
        m74588n(str3);
        m74570S(str);
        m74586l(str3);
        C11074j S = m74570S(str2);
        m74587m();
        return S;
    }

    /* renamed from: l */
    private void m74586l(String str) {
    }

    /* renamed from: m */
    private void m74587m() {
    }

    /* renamed from: n */
    private void m74588n(String str) {
    }

    /* renamed from: p */
    private static IOException m74589p(Socket socket, IOException iOException) {
        try {
            socket.close();
        } catch (Throwable th) {
            if (m74562A(th)) {
                iOException.addSuppressed(th);
            } else {
                th.addSuppressed(iOException);
                if (th instanceof Error) {
                    throw ((Error) th);
                } else if (th instanceof RuntimeException) {
                    throw th;
                } else {
                    throw new RuntimeException("unexpected exception", th);
                }
            }
        }
        return iOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final synchronized boolean m74590s(Properties properties, String str) {
        boolean booleanProperty;
        booleanProperty = PropUtil.getBooleanProperty(properties, str, false);
        if (this.f53958i.isLoggable(Level.CONFIG)) {
            MailLogger mailLogger = this.f53958i;
            mailLogger.config(str + ": " + booleanProperty);
        }
        return booleanProperty;
    }

    /* renamed from: v */
    private String m74591v(String str) {
        try {
            return m74575a0(MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5).digest((this.f53960k + str).getBytes("iso-8859-1")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String m74592w() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.f53966q     // Catch:{ UnknownHostException -> 0x0036 }
            if (r0 == 0) goto L_0x000b
            int r0 = r0.length()     // Catch:{ UnknownHostException -> 0x0036 }
            if (r0 != 0) goto L_0x0036
        L_0x000b:
            java.net.InetAddress r0 = java.net.InetAddress.getLocalHost()     // Catch:{ UnknownHostException -> 0x0036 }
            java.lang.String r1 = r0.getCanonicalHostName()     // Catch:{ UnknownHostException -> 0x0036 }
            r3.f53966q = r1     // Catch:{ UnknownHostException -> 0x0036 }
            if (r1 != 0) goto L_0x0036
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0036 }
            r1.<init>()     // Catch:{ UnknownHostException -> 0x0036 }
            java.lang.String r2 = "["
            r1.append(r2)     // Catch:{ UnknownHostException -> 0x0036 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0036 }
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x0036 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x0036 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnknownHostException -> 0x0036 }
            r3.f53966q = r0     // Catch:{ UnknownHostException -> 0x0036 }
            goto L_0x0036
        L_0x0034:
            r0 = move-exception
            goto L_0x0078
        L_0x0036:
            java.lang.String r0 = r3.f53966q     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0040
            int r0 = r0.length()     // Catch:{ all -> 0x0034 }
            if (r0 > 0) goto L_0x0074
        L_0x0040:
            java.net.Socket r0 = r3.f53950a     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.isBound()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0074
            java.net.Socket r0 = r3.f53950a     // Catch:{ all -> 0x0034 }
            java.net.InetAddress r0 = r0.getLocalAddress()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r0.getCanonicalHostName()     // Catch:{ all -> 0x0034 }
            r3.f53966q = r1     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0074
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "["
            r1.append(r2)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ all -> 0x0034 }
            r1.append(r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0034 }
            r3.f53966q = r0     // Catch:{ all -> 0x0034 }
        L_0x0074:
            java.lang.String r0 = r3.f53966q     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)
            return r0
        L_0x0078:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11068i.m74592w():java.lang.String");
    }

    /* renamed from: y */
    private void m74593y() throws IOException {
        boolean booleanProperty = PropUtil.getBooleanProperty(this.f53952c, "mail.debug.quote", false);
        TraceInputStream traceInputStream = new TraceInputStream(this.f53950a.getInputStream(), this.f53959j);
        this.f53956g = traceInputStream;
        traceInputStream.setQuote(booleanProperty);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.f53950a.getOutputStream(), this.f53959j);
        this.f53957h = traceOutputStream;
        traceOutputStream.setQuote(booleanProperty);
        this.f53954e = new BufferedReader(new InputStreamReader(this.f53956g, "iso-8859-1"));
        this.f53955f = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.f53957h, "iso-8859-1")));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public synchronized boolean mo62108B() {
        return this.f53950a instanceof SSLSocket;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo62109C() {
        return this.f53959j.isLoggable(Level.FINEST);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public synchronized int mo62110E(int i) throws IOException {
        int i2;
        C11074j S = m74570S("LIST " + i);
        i2 = -1;
        if (S.f53976a && S.f53978c != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(S.f53978c);
                stringTokenizer.nextToken();
                i2 = Integer.parseInt(stringTokenizer.nextToken());
            } catch (RuntimeException unused) {
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x00c4=Splitter:B:42:0x00c4, B:63:0x0105=Splitter:B:63:0x0105} */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo62111F(java.lang.String r5, java.lang.String r6) throws java.io.IOException {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f53962m     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x000d
            java.net.Socket r0 = r4.f53950a     // Catch:{ all -> 0x0114 }
            boolean r0 = r0 instanceof javax.net.ssl.SSLSocket     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            boolean r1 = r4.f53963n     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x0022
            boolean r1 = r4.mo62109C()     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x0022
            com.sun.mail.util.MailLogger r1 = r4.f53958i     // Catch:{ all -> 0x010f }
            java.lang.String r2 = "authentication command trace suppressed"
            r1.fine(r2)     // Catch:{ all -> 0x010f }
            r4.m74573Z()     // Catch:{ all -> 0x010f }
        L_0x0022:
            java.lang.String r1 = r4.f53960k     // Catch:{ all -> 0x010f }
            r2 = 0
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = r4.m74591v(r6)     // Catch:{ all -> 0x010f }
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            java.lang.String r3 = r4.f53960k     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x0052
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r6.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "APOP "
            r6.append(r0)     // Catch:{ all -> 0x010f }
            r6.append(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r5 = " "
            r6.append(r5)     // Catch:{ all -> 0x010f }
            r6.append(r1)     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x010f }
            a8.j r5 = r4.m74570S(r5)     // Catch:{ all -> 0x010f }
            goto L_0x00de
        L_0x0052:
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r0.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r1 = "USER "
            r0.append(r1)     // Catch:{ all -> 0x010f }
            r0.append(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x010f }
            r4.m74588n(r5)     // Catch:{ all -> 0x010f }
            r4.m74563D(r5)     // Catch:{ all -> 0x010f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r5.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "PASS "
            r5.append(r0)     // Catch:{ all -> 0x010f }
            r5.append(r6)     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x010f }
            r4.m74586l(r5)     // Catch:{ all -> 0x010f }
            r4.m74563D(r5)     // Catch:{ all -> 0x010f }
            a8.j r5 = r4.m74568M()     // Catch:{ all -> 0x010f }
            boolean r6 = r5.f53976a     // Catch:{ all -> 0x010f }
            if (r6 != 0) goto L_0x009c
            java.lang.String r5 = r5.f53978c     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            java.lang.String r5 = "USER command failed"
        L_0x0091:
            r4.m74568M()     // Catch:{ all -> 0x010f }
            r4.m74587m()     // Catch:{ all -> 0x010f }
            r4.m74569N()     // Catch:{ all -> 0x0114 }
            monitor-exit(r4)
            return r5
        L_0x009c:
            a8.j r5 = r4.m74568M()     // Catch:{ all -> 0x010f }
            r4.m74587m()     // Catch:{ all -> 0x010f }
            goto L_0x00de
        L_0x00a4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r0.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r1 = "USER "
            r0.append(r1)     // Catch:{ all -> 0x010f }
            r0.append(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x010f }
            a8.j r5 = r4.m74570S(r5)     // Catch:{ all -> 0x010f }
            boolean r0 = r5.f53976a     // Catch:{ all -> 0x010f }
            if (r0 != 0) goto L_0x00c9
            java.lang.String r5 = r5.f53978c     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r5 = "USER command failed"
        L_0x00c4:
            r4.m74569N()     // Catch:{ all -> 0x0114 }
            monitor-exit(r4)
            return r5
        L_0x00c9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r5.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "PASS "
            r5.append(r0)     // Catch:{ all -> 0x010f }
            r5.append(r6)     // Catch:{ all -> 0x010f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x010f }
            a8.j r5 = r4.m74570S(r5)     // Catch:{ all -> 0x010f }
        L_0x00de:
            boolean r6 = r4.f53963n     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x00fa
            boolean r6 = r4.mo62109C()     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x00fa
            com.sun.mail.util.MailLogger r6 = r4.f53958i     // Catch:{ all -> 0x010f }
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch:{ all -> 0x010f }
            java.lang.String r1 = "authentication command {0}"
            boolean r3 = r5.f53976a     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x00f5
            java.lang.String r3 = "succeeded"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r3 = "failed"
        L_0x00f7:
            r6.log((java.util.logging.Level) r0, (java.lang.String) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x010f }
        L_0x00fa:
            boolean r6 = r5.f53976a     // Catch:{ all -> 0x010f }
            if (r6 != 0) goto L_0x010a
            java.lang.String r5 = r5.f53978c     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            java.lang.String r5 = "login failed"
        L_0x0105:
            r4.m74569N()     // Catch:{ all -> 0x0114 }
            monitor-exit(r4)
            return r5
        L_0x010a:
            r4.m74569N()     // Catch:{ all -> 0x0114 }
            monitor-exit(r4)
            return r2
        L_0x010f:
            r5 = move-exception
            r4.m74569N()     // Catch:{ all -> 0x0114 }
            throw r5     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11068i.mo62111F(java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public synchronized boolean mo62112J() throws IOException {
        return m74570S("NOOP").f53976a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public synchronized boolean mo62113K() throws IOException {
        boolean z;
        try {
            z = m74570S("QUIT").f53976a;
            mo62127q();
        } catch (Throwable th) {
            mo62127q();
            throw th;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:(3:40|41|(3:43|44|(3:46|(1:(1:49)(3:50|(1:52)|53))|54)))|55|56) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|(3:16|17|(1:27)(5:20|21|(1:23)|24|25))|28|29|(1:31)|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0088 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010c */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0012 A[Catch:{ all -> 0x000a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[Catch:{ all -> 0x000a }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d A[Catch:{ all -> 0x000a }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0088=Splitter:B:28:0x0088, B:55:0x010c=Splitter:B:55:0x010c} */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.InputStream mo62114O(int r6, int r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r7 != 0) goto L_0x000d
            boolean r1 = r5.f53962m     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x000d
            r1 = 1
            goto L_0x000e
        L_0x000a:
            r6 = move-exception
            goto L_0x0145
        L_0x000d:
            r1 = 0
        L_0x000e:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            java.lang.String r3 = "LIST "
            r1.append(r3)     // Catch:{ all -> 0x000a }
            r1.append(r6)     // Catch:{ all -> 0x000a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x000a }
            r5.m74588n(r1)     // Catch:{ all -> 0x000a }
            r5.m74563D(r1)     // Catch:{ all -> 0x000a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            java.lang.String r3 = "RETR "
            r1.append(r3)     // Catch:{ all -> 0x000a }
            r1.append(r6)     // Catch:{ all -> 0x000a }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x000a }
            r5.m74586l(r6)     // Catch:{ all -> 0x000a }
            r5.m74563D(r6)     // Catch:{ all -> 0x000a }
            a8.j r6 = r5.m74568M()     // Catch:{ all -> 0x000a }
            boolean r1 = r6.f53976a     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r6.f53978c     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0088
            java.util.StringTokenizer r1 = new java.util.StringTokenizer     // Catch:{ RuntimeException -> 0x0088 }
            java.lang.String r6 = r6.f53978c     // Catch:{ RuntimeException -> 0x0088 }
            r1.<init>(r6)     // Catch:{ RuntimeException -> 0x0088 }
            r1.nextToken()     // Catch:{ RuntimeException -> 0x0088 }
            java.lang.String r6 = r1.nextToken()     // Catch:{ RuntimeException -> 0x0088 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x0088 }
            if (r6 > r2) goto L_0x0087
            if (r6 >= 0) goto L_0x0063
            goto L_0x0087
        L_0x0063:
            com.sun.mail.util.MailLogger r7 = r5.f53958i     // Catch:{ RuntimeException -> 0x0085 }
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch:{ RuntimeException -> 0x0085 }
            boolean r7 = r7.isLoggable(r0)     // Catch:{ RuntimeException -> 0x0085 }
            if (r7 == 0) goto L_0x0083
            com.sun.mail.util.MailLogger r7 = r5.f53958i     // Catch:{ RuntimeException -> 0x0085 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0085 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0085 }
            java.lang.String r1 = "pipeline message size "
            r0.append(r1)     // Catch:{ RuntimeException -> 0x0085 }
            r0.append(r6)     // Catch:{ RuntimeException -> 0x0085 }
            java.lang.String r0 = r0.toString()     // Catch:{ RuntimeException -> 0x0085 }
            r7.fine(r0)     // Catch:{ RuntimeException -> 0x0085 }
        L_0x0083:
            int r6 = r6 + 128
        L_0x0085:
            r7 = r6
            goto L_0x0088
        L_0x0087:
            r7 = 0
        L_0x0088:
            a8.j r6 = r5.m74568M()     // Catch:{ all -> 0x000a }
            boolean r0 = r6.f53976a     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x0098
            int r0 = r7 + 128
            java.io.InputStream r0 = r5.m74567L(r0)     // Catch:{ all -> 0x000a }
            r6.f53979d = r0     // Catch:{ all -> 0x000a }
        L_0x0098:
            r5.m74587m()     // Catch:{ all -> 0x000a }
            goto L_0x0115
        L_0x009d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            java.lang.String r3 = "RETR "
            r1.append(r3)     // Catch:{ all -> 0x000a }
            r1.append(r6)     // Catch:{ all -> 0x000a }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x000a }
            r5.m74566I(r6)     // Catch:{ all -> 0x000a }
            r5.m74563D(r6)     // Catch:{ all -> 0x000a }
            a8.j r6 = r5.m74568M()     // Catch:{ all -> 0x000a }
            boolean r1 = r6.f53976a     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x00c2
            r5.m74565H()     // Catch:{ all -> 0x000a }
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x00c2:
            if (r7 > 0) goto L_0x010c
            java.lang.String r1 = r6.f53978c     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x010c
            java.util.StringTokenizer r1 = new java.util.StringTokenizer     // Catch:{ RuntimeException -> 0x010c }
            java.lang.String r3 = r6.f53978c     // Catch:{ RuntimeException -> 0x010c }
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x010c }
            java.lang.String r3 = r1.nextToken()     // Catch:{ RuntimeException -> 0x010c }
            java.lang.String r1 = r1.nextToken()     // Catch:{ RuntimeException -> 0x010c }
            java.lang.String r4 = "octets"
            boolean r1 = r1.equals(r4)     // Catch:{ RuntimeException -> 0x010c }
            if (r1 == 0) goto L_0x010c
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x010c }
            if (r7 > r2) goto L_0x010b
            if (r7 >= 0) goto L_0x00e8
            goto L_0x010b
        L_0x00e8:
            com.sun.mail.util.MailLogger r0 = r5.f53958i     // Catch:{ RuntimeException -> 0x010c }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ RuntimeException -> 0x010c }
            boolean r0 = r0.isLoggable(r1)     // Catch:{ RuntimeException -> 0x010c }
            if (r0 == 0) goto L_0x0108
            com.sun.mail.util.MailLogger r0 = r5.f53958i     // Catch:{ RuntimeException -> 0x010c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x010c }
            r1.<init>()     // Catch:{ RuntimeException -> 0x010c }
            java.lang.String r2 = "guessing message size: "
            r1.append(r2)     // Catch:{ RuntimeException -> 0x010c }
            r1.append(r7)     // Catch:{ RuntimeException -> 0x010c }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x010c }
            r0.fine(r1)     // Catch:{ RuntimeException -> 0x010c }
        L_0x0108:
            int r7 = r7 + 128
            goto L_0x010c
        L_0x010b:
            r7 = 0
        L_0x010c:
            java.io.InputStream r0 = r5.m74567L(r7)     // Catch:{ all -> 0x000a }
            r6.f53979d = r0     // Catch:{ all -> 0x000a }
            r5.m74565H()     // Catch:{ all -> 0x000a }
        L_0x0115:
            boolean r0 = r6.f53976a     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x0141
            if (r7 <= 0) goto L_0x0141
            com.sun.mail.util.MailLogger r7 = r5.f53958i     // Catch:{ all -> 0x000a }
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch:{ all -> 0x000a }
            boolean r7 = r7.isLoggable(r0)     // Catch:{ all -> 0x000a }
            if (r7 == 0) goto L_0x0141
            com.sun.mail.util.MailLogger r7 = r5.f53958i     // Catch:{ all -> 0x000a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x000a }
            r0.<init>()     // Catch:{ all -> 0x000a }
            java.lang.String r1 = "got message size "
            r0.append(r1)     // Catch:{ all -> 0x000a }
            java.io.InputStream r1 = r6.f53979d     // Catch:{ all -> 0x000a }
            int r1 = r1.available()     // Catch:{ all -> 0x000a }
            r0.append(r1)     // Catch:{ all -> 0x000a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x000a }
            r7.fine(r0)     // Catch:{ all -> 0x000a }
        L_0x0141:
            java.io.InputStream r6 = r6.f53979d     // Catch:{ all -> 0x000a }
            monitor-exit(r5)
            return r6
        L_0x0145:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11068i.mo62114O(int, int):java.io.InputStream");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x008e */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo62115P(int r6, java.io.OutputStream r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "RETR "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r6)     // Catch:{ all -> 0x008f }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x008f }
            r5.m74566I(r6)     // Catch:{ all -> 0x008f }
            r5.m74563D(r6)     // Catch:{ all -> 0x008f }
            a8.j r6 = r5.m74568M()     // Catch:{ all -> 0x008f }
            boolean r6 = r6.f53976a     // Catch:{ all -> 0x008f }
            if (r6 != 0) goto L_0x0026
            r5.m74565H()     // Catch:{ all -> 0x008f }
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x0026:
            r6 = 0
            r0 = 10
            r1 = 10
        L_0x002b:
            java.io.BufferedReader r2 = r5.f53954e     // Catch:{ InterruptedIOException -> 0x0088 }
            int r2 = r2.read()     // Catch:{ InterruptedIOException -> 0x0088 }
            if (r2 < 0) goto L_0x0067
            if (r1 != r0) goto L_0x004a
            r1 = 46
            if (r2 != r1) goto L_0x004a
            java.io.BufferedReader r1 = r5.f53954e     // Catch:{ InterruptedIOException -> 0x0088 }
            int r1 = r1.read()     // Catch:{ InterruptedIOException -> 0x0088 }
            r2 = 13
            if (r1 != r2) goto L_0x004b
            java.io.BufferedReader r7 = r5.f53954e     // Catch:{ InterruptedIOException -> 0x0088 }
            int r2 = r7.read()     // Catch:{ InterruptedIOException -> 0x0088 }
            goto L_0x0067
        L_0x004a:
            r1 = r2
        L_0x004b:
            if (r6 != 0) goto L_0x002b
            r7.write(r1)     // Catch:{ IOException -> 0x005c, RuntimeException -> 0x0051 }
            goto L_0x002b
        L_0x0051:
            r6 = move-exception
            com.sun.mail.util.MailLogger r2 = r5.f53958i     // Catch:{ InterruptedIOException -> 0x0088 }
            java.util.logging.Level r3 = java.util.logging.Level.FINE     // Catch:{ InterruptedIOException -> 0x0088 }
            java.lang.String r4 = "exception while streaming"
            r2.log((java.util.logging.Level) r3, (java.lang.String) r4, (java.lang.Throwable) r6)     // Catch:{ InterruptedIOException -> 0x0088 }
            goto L_0x002b
        L_0x005c:
            r6 = move-exception
            com.sun.mail.util.MailLogger r2 = r5.f53958i     // Catch:{ InterruptedIOException -> 0x0088 }
            java.util.logging.Level r3 = java.util.logging.Level.FINE     // Catch:{ InterruptedIOException -> 0x0088 }
            java.lang.String r4 = "exception while streaming"
            r2.log((java.util.logging.Level) r3, (java.lang.String) r4, (java.lang.Throwable) r6)     // Catch:{ InterruptedIOException -> 0x0088 }
            goto L_0x002b
        L_0x0067:
            if (r2 < 0) goto L_0x0080
            if (r6 == 0) goto L_0x007a
            boolean r7 = r6 instanceof java.io.IOException     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x0077
            boolean r7 = r6 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x0074
            goto L_0x007a
        L_0x0074:
            java.lang.RuntimeException r6 = (java.lang.RuntimeException) r6     // Catch:{ all -> 0x008f }
            throw r6     // Catch:{ all -> 0x008f }
        L_0x0077:
            java.io.IOException r6 = (java.io.IOException) r6     // Catch:{ all -> 0x008f }
            throw r6     // Catch:{ all -> 0x008f }
        L_0x007a:
            r5.m74565H()     // Catch:{ all -> 0x008f }
            r6 = 1
            monitor-exit(r5)
            return r6
        L_0x0080:
            java.io.EOFException r6 = new java.io.EOFException     // Catch:{ all -> 0x008f }
            java.lang.String r7 = "EOF on socket"
            r6.<init>(r7)     // Catch:{ all -> 0x008f }
            throw r6     // Catch:{ all -> 0x008f }
        L_0x0088:
            r6 = move-exception
            java.net.Socket r7 = r5.f53950a     // Catch:{ IOException -> 0x008e }
            r7.close()     // Catch:{ IOException -> 0x008e }
        L_0x008e:
            throw r6     // Catch:{ all -> 0x008f }
        L_0x008f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11068i.mo62115P(int, java.io.OutputStream):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public synchronized boolean mo62116Q() throws IOException {
        return m74570S("RSET").f53976a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|(3:15|(2:17|34)(2:18|33)|19)|20|21) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0047 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:12:0x001e->B:19:0x0033, LOOP_START, SYNTHETIC, Splitter:B:12:0x001e] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo62117R(java.io.InputStream r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 != 0) goto L_0x0008
            r5.f53961l = r0     // Catch:{ all -> 0x004a }
            monitor-exit(r5)
            return
        L_0x0008:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x004a }
            r2 = 10
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            r5.f53961l = r1     // Catch:{ all -> 0x004a }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x001e }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x001e }
            java.lang.String r3 = "us-ascii"
            r2.<init>(r6, r3)     // Catch:{ UnsupportedEncodingException -> 0x001e }
            r1.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x001e }
            r0 = r1
        L_0x001e:
            java.lang.String r1 = r0.readLine()     // Catch:{ IOException -> 0x003f, all -> 0x0043 }
            if (r1 == 0) goto L_0x003f
            r2 = 32
            int r2 = r1.indexOf(r2)     // Catch:{ IOException -> 0x003f, all -> 0x0043 }
            if (r2 <= 0) goto L_0x0032
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)     // Catch:{ IOException -> 0x003f, all -> 0x0043 }
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.f53961l     // Catch:{ IOException -> 0x003f, all -> 0x0043 }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x003f, all -> 0x0043 }
            java.lang.String r2 = r2.toUpperCase(r4)     // Catch:{ IOException -> 0x003f, all -> 0x0043 }
            r3.put(r2, r1)     // Catch:{ IOException -> 0x003f, all -> 0x0043 }
            goto L_0x001e
        L_0x003f:
            r6.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0048
        L_0x0043:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r5)
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11068i.mo62117R(java.io.InputStream):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public synchronized C11075k mo62118V() throws IOException {
        C11075k kVar;
        C11074j S = m74570S("STAT");
        kVar = new C11075k();
        if (!S.f53976a) {
            throw new IOException("STAT command failed: " + S.f53978c);
        } else if (S.f53978c != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(S.f53978c);
                kVar.f53980a = Integer.parseInt(stringTokenizer.nextToken());
                kVar.f53981b = Integer.parseInt(stringTokenizer.nextToken());
            } catch (RuntimeException unused) {
            }
        }
        return kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public synchronized boolean mo62119W() throws IOException {
        if (this.f53950a instanceof SSLSocket) {
            return true;
        }
        C11074j S = m74570S("STLS");
        if (S.f53976a) {
            try {
                this.f53950a = SocketFetcher.startTLS(this.f53950a, this.f53951b, this.f53952c, this.f53953d);
                m74593y();
            } catch (IOException e) {
                this.f53950a.close();
                this.f53950a = null;
                this.f53954e = null;
                this.f53955f = null;
                IOException iOException = new IOException("Could not convert socket to TLS");
                iOException.initCause(e);
                throw iOException;
            } catch (Throwable th) {
                this.f53950a = null;
                this.f53954e = null;
                this.f53955f = null;
                throw th;
            }
        }
        return S.f53976a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public synchronized boolean mo62120X(String str) {
        if (str.equals("LOGIN")) {
            return true;
        }
        Map<String, String> map = this.f53961l;
        if (map == null) {
            return false;
        }
        String str2 = map.get("SASL");
        if (str2 == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo62121Y(String str) {
        return this.f53964o.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public synchronized InputStream mo62122b0(int i, int i2) throws IOException {
        return m74564G("TOP " + i + " " + i2, 0).f53979d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public synchronized boolean mo62123d0(String[] strArr) throws IOException {
        C11074j G = m74564G("UIDL", strArr.length * 15);
        if (!G.f53976a) {
            return false;
        }
        LineInputStream lineInputStream = new LineInputStream(G.f53979d);
        while (true) {
            String readLine = lineInputStream.readLine();
            if (readLine != null) {
                int indexOf = readLine.indexOf(32);
                if (indexOf >= 1) {
                    if (indexOf < readLine.length()) {
                        int parseInt = Integer.parseInt(readLine.substring(0, indexOf));
                        if (parseInt > 0 && parseInt <= strArr.length) {
                            strArr[parseInt - 1] = readLine.substring(indexOf + 1);
                        }
                    }
                }
            } else {
                try {
                    break;
                } catch (IOException unused) {
                }
            }
        }
        G.f53979d.close();
        return true;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.f53950a != null) {
                mo62113K();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized String mo62125k(String str, String str2, String str3, String str4, String str5) {
        C11069a aVar = this.f53964o.get(str.toUpperCase(Locale.ENGLISH));
        if (aVar == null) {
            return "No such authentication mechanism: " + str;
        }
        try {
            if (!aVar.mo62133a(str2, str3, str4, str5)) {
                return "login failed";
            }
            return null;
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized InputStream mo62126o() throws IOException {
        C11074j G = m74564G("CAPA", 128);
        if (!G.f53976a) {
            return null;
        }
        return G.f53979d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo62127q() {
        try {
            Socket socket = this.f53950a;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f53950a = null;
            this.f53954e = null;
            this.f53955f = null;
            throw th;
        }
        this.f53950a = null;
        this.f53954e = null;
        this.f53955f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized boolean mo62128r(int i) throws IOException {
        return m74570S("DELE " + i).f53976a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Map<String, String> mo62129t() {
        return this.f53961l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo62130u() {
        return this.f53965p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public synchronized boolean mo62131x(String str) {
        Map<String, String> map;
        map = this.f53961l;
        return map != null && map.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo62132z(String str) {
        C11069a aVar = this.f53964o.get(str.toUpperCase(Locale.ENGLISH));
        return aVar != null && aVar.mo62135c();
    }
}
