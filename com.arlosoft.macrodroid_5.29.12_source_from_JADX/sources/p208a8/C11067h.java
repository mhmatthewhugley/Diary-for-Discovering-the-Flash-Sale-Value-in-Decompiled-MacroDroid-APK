package p208a8;

import com.sun.mail.util.MailConnectException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SocketConnectException;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.mail.AuthenticationFailedException;
import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.URLName;

/* renamed from: a8.h */
/* compiled from: POP3Store */
public class C11067h extends Store {

    /* renamed from: A */
    private boolean f53925A;

    /* renamed from: B */
    private boolean f53926B;

    /* renamed from: C */
    private boolean f53927C;

    /* renamed from: D */
    private Map<String, String> f53928D;

    /* renamed from: E */
    private MailLogger f53929E;

    /* renamed from: F */
    volatile Constructor<?> f53930F;

    /* renamed from: G */
    volatile boolean f53931G;

    /* renamed from: H */
    volatile boolean f53932H;

    /* renamed from: I */
    volatile boolean f53933I;

    /* renamed from: J */
    volatile boolean f53934J;

    /* renamed from: K */
    volatile boolean f53935K;

    /* renamed from: L */
    volatile boolean f53936L;

    /* renamed from: M */
    volatile File f53937M;

    /* renamed from: N */
    volatile boolean f53938N;

    /* renamed from: O */
    volatile boolean f53939O;

    /* renamed from: a */
    private String f53940a;

    /* renamed from: c */
    private int f53941c;

    /* renamed from: d */
    private boolean f53942d;

    /* renamed from: f */
    private C11068i f53943f;

    /* renamed from: g */
    private C11062c f53944g;

    /* renamed from: o */
    private String f53945o;

    /* renamed from: p */
    private int f53946p;

    /* renamed from: s */
    private String f53947s;

    /* renamed from: z */
    private String f53948z;

    /* renamed from: b */
    private boolean m74556b(C11068i iVar, String str, String str2) throws MessagingException {
        boolean z;
        String property = this.session.getProperty("mail." + this.f53940a + ".auth.mechanisms");
        if (property == null) {
            property = iVar.mo62130u();
            z = true;
        } else {
            z = false;
        }
        String property2 = this.session.getProperty("mail." + this.f53940a + ".sasl.authorizationid");
        String str3 = property2 == null ? str : property2;
        if (this.f53929E.isLoggable(Level.FINE)) {
            this.f53929E.fine("Attempt to authenticate using mechanisms: " + property);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            Locale locale = Locale.ENGLISH;
            String upperCase = nextToken.toUpperCase(locale);
            if (!iVar.mo62121Y(upperCase)) {
                this.f53929E.log(Level.FINE, "no authenticator for mechanism {0}", (Object) upperCase);
            } else if (!iVar.mo62120X(upperCase)) {
                this.f53929E.log(Level.FINE, "mechanism {0} not supported by server", (Object) upperCase);
            } else {
                if (z) {
                    String str4 = "mail." + this.f53940a + ".auth." + upperCase.toLowerCase(locale) + ".disable";
                    if (PropUtil.getBooleanProperty(this.session.getProperties(), str4, !iVar.mo62132z(upperCase))) {
                        if (this.f53929E.isLoggable(Level.FINE)) {
                            this.f53929E.fine("mechanism " + upperCase + " disabled by property: " + str4);
                        }
                    }
                }
                this.f53929E.log(Level.FINE, "Using mechanism {0}", (Object) upperCase);
                String k = iVar.mo62125k(upperCase, this.f53945o, str3, str, str2);
                if (k == null) {
                    return true;
                }
                throw new AuthenticationFailedException(k);
            }
        }
        throw new AuthenticationFailedException("No authentication mechanisms supported by both server and client");
    }

    /* renamed from: c */
    private static IOException m74557c(C11068i iVar, IOException iOException) {
        try {
            iVar.mo62113K();
        } catch (Throwable th) {
            if (m74558h(th)) {
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

    private void checkConnected() throws MessagingException {
        if (!super.isConnected()) {
            throw new MessagingException("Not connected");
        }
    }

    /* renamed from: h */
    private static boolean m74558h(Throwable th) {
        return (th instanceof Exception) || (th instanceof LinkageError);
    }

    public synchronized void close() throws MessagingException {
        mo62098e(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo62098e(boolean z) throws MessagingException {
        try {
            C11068i iVar = this.f53943f;
            if (iVar != null) {
                if (z) {
                    iVar.mo62127q();
                } else {
                    iVar.mo62113K();
                }
            }
            this.f53943f = null;
        } catch (IOException unused) {
            this.f53943f = null;
        } catch (Throwable th) {
            this.f53943f = null;
            super.close();
            throw th;
        }
        super.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo62099f(C11062c cVar) {
        if (this.f53944g == cVar) {
            this.f53943f = null;
            this.f53944g = null;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.f53943f != null) {
                mo62098e(!this.f53939O);
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bf, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p208a8.C11068i mo62101g(p208a8.C11062c r9) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            a8.i r0 = r8.f53943f     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x000d
            a8.c r1 = r8.f53944g     // Catch:{ all -> 0x00f4 }
            if (r1 != 0) goto L_0x000d
            r8.f53944g = r9     // Catch:{ all -> 0x00f4 }
            monitor-exit(r8)
            return r0
        L_0x000d:
            a8.i r7 = new a8.i     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = r8.f53945o     // Catch:{ all -> 0x00f4 }
            int r2 = r8.f53946p     // Catch:{ all -> 0x00f4 }
            com.sun.mail.util.MailLogger r3 = r8.f53929E     // Catch:{ all -> 0x00f4 }
            javax.mail.Session r0 = r8.session     // Catch:{ all -> 0x00f4 }
            java.util.Properties r4 = r0.getProperties()     // Catch:{ all -> 0x00f4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r0.<init>()     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = "mail."
            r0.append(r5)     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = r8.f53940a     // Catch:{ all -> 0x00f4 }
            r0.append(r5)     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x00f4 }
            boolean r6 = r8.f53942d     // Catch:{ all -> 0x00f4 }
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f4 }
            boolean r0 = r8.f53925A     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x003c
            boolean r0 = r8.f53926B     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x006e
        L_0x003c:
            java.lang.String r0 = "STLS"
            boolean r0 = r7.mo62131x(r0)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x006a
            boolean r0 = r7.mo62119W()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0052
            java.io.InputStream r0 = r7.mo62126o()     // Catch:{ all -> 0x00f4 }
            r7.mo62117R(r0)     // Catch:{ all -> 0x00f4 }
            goto L_0x006e
        L_0x0052:
            boolean r0 = r8.f53926B     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x0057
            goto L_0x006e
        L_0x0057:
            com.sun.mail.util.MailLogger r9 = r8.f53929E     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "STLS required but failed"
            r9.fine(r0)     // Catch:{ all -> 0x00f4 }
            java.io.EOFException r9 = new java.io.EOFException     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "STLS required but failed"
            r9.<init>(r0)     // Catch:{ all -> 0x00f4 }
            java.io.IOException r9 = m74557c(r7, r9)     // Catch:{ all -> 0x00f4 }
            throw r9     // Catch:{ all -> 0x00f4 }
        L_0x006a:
            boolean r0 = r8.f53926B     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00e1
        L_0x006e:
            java.util.Map r0 = r7.mo62129t()     // Catch:{ all -> 0x00f4 }
            r8.f53928D = r0     // Catch:{ all -> 0x00f4 }
            boolean r0 = r7.mo62108B()     // Catch:{ all -> 0x00f4 }
            r8.f53927C = r0     // Catch:{ all -> 0x00f4 }
            boolean r0 = r8.f53932H     // Catch:{ all -> 0x00f4 }
            r1 = 1
            if (r0 != 0) goto L_0x0094
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f53928D     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0094
            java.lang.String r2 = "TOP"
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x0094
            r8.f53932H = r1     // Catch:{ all -> 0x00f4 }
            com.sun.mail.util.MailLogger r0 = r8.f53929E     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = "server doesn't support TOP, disabling it"
            r0.fine(r2)     // Catch:{ all -> 0x00f4 }
        L_0x0094:
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f53928D     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00a2
            java.lang.String r2 = "UIDL"
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            r8.f53934J = r1     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r8.f53947s     // Catch:{ EOFException -> 0x00db, Exception -> 0x00cc }
            java.lang.String r1 = r8.f53948z     // Catch:{ EOFException -> 0x00db, Exception -> 0x00cc }
            boolean r0 = r8.m74556b(r7, r0, r1)     // Catch:{ EOFException -> 0x00db, Exception -> 0x00cc }
            if (r0 == 0) goto L_0x00c0
            a8.i r0 = r8.f53943f     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00b8
            if (r9 == 0) goto L_0x00b8
            r8.f53943f = r7     // Catch:{ all -> 0x00f4 }
            r8.f53944g = r9     // Catch:{ all -> 0x00f4 }
        L_0x00b8:
            a8.c r0 = r8.f53944g     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00be
            r8.f53944g = r9     // Catch:{ all -> 0x00f4 }
        L_0x00be:
            monitor-exit(r8)
            return r7
        L_0x00c0:
            java.io.EOFException r9 = new java.io.EOFException     // Catch:{ EOFException -> 0x00db, Exception -> 0x00cc }
            java.lang.String r0 = "login failed"
            r9.<init>(r0)     // Catch:{ EOFException -> 0x00db, Exception -> 0x00cc }
            java.io.IOException r9 = m74557c(r7, r9)     // Catch:{ EOFException -> 0x00db, Exception -> 0x00cc }
            throw r9     // Catch:{ EOFException -> 0x00db, Exception -> 0x00cc }
        L_0x00cc:
            r9 = move-exception
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f4 }
            r0.<init>(r9)     // Catch:{ all -> 0x00f4 }
            java.io.IOException r9 = m74557c(r7, r0)     // Catch:{ all -> 0x00f4 }
            throw r9     // Catch:{ all -> 0x00f4 }
        L_0x00db:
            r9 = move-exception
            java.io.IOException r9 = m74557c(r7, r9)     // Catch:{ all -> 0x00f4 }
            throw r9     // Catch:{ all -> 0x00f4 }
        L_0x00e1:
            com.sun.mail.util.MailLogger r9 = r8.f53929E     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "STLS required but not supported"
            r9.fine(r0)     // Catch:{ all -> 0x00f4 }
            java.io.EOFException r9 = new java.io.EOFException     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "STLS required but not supported"
            r9.<init>(r0)     // Catch:{ all -> 0x00f4 }
            java.io.IOException r9 = m74557c(r7, r9)     // Catch:{ all -> 0x00f4 }
            throw r9     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11067h.mo62101g(a8.c):a8.i");
    }

    public Folder getDefaultFolder() throws MessagingException {
        checkConnected();
        return new C11061b(this);
    }

    public Folder getFolder(String str) throws MessagingException {
        checkConnected();
        return new C11062c(this, str);
    }

    /* access modifiers changed from: package-private */
    public synchronized Session getSession() {
        return this.session;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        super.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isConnected() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = super.isConnected()     // Catch:{ all -> 0x002c }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            monitor-exit(r3)
            return r1
        L_0x000a:
            a8.i r0 = r3.f53943f     // Catch:{ IOException -> 0x0027 }
            if (r0 != 0) goto L_0x0016
            r0 = 0
            a8.i r0 = r3.mo62101g(r0)     // Catch:{ IOException -> 0x0027 }
            r3.f53943f = r0     // Catch:{ IOException -> 0x0027 }
            goto L_0x001c
        L_0x0016:
            boolean r0 = r0.mo62112J()     // Catch:{ IOException -> 0x0027 }
            if (r0 == 0) goto L_0x001f
        L_0x001c:
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x001f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0027 }
            java.lang.String r2 = "NOOP failed"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0027 }
            throw r0     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            super.close()     // Catch:{ MessagingException -> 0x002a }
        L_0x002a:
            monitor-exit(r3)
            return r1
        L_0x002c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11067h.isConnected():boolean");
    }

    /* access modifiers changed from: protected */
    public synchronized boolean protocolConnect(String str, int i, String str2, String str3) throws MessagingException {
        if (str == null || str3 == null || str2 == null) {
            return false;
        }
        if (i == -1) {
            try {
                Properties properties = this.session.getProperties();
                i = PropUtil.getIntProperty(properties, "mail." + this.f53940a + ".port", -1);
            } catch (EOFException e) {
                throw new AuthenticationFailedException(e.getMessage());
            } catch (SocketConnectException e2) {
                throw new MailConnectException(e2);
            } catch (IOException e3) {
                throw new MessagingException("Connect failed", e3);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i == -1) {
            i = this.f53941c;
        }
        this.f53945o = str;
        this.f53946p = i;
        this.f53947s = str2;
        this.f53948z = str3;
        this.f53943f = mo62101g((C11062c) null);
        return true;
    }

    public Folder getFolder(URLName uRLName) throws MessagingException {
        checkConnected();
        return new C11062c(this, uRLName.getFile());
    }
}
