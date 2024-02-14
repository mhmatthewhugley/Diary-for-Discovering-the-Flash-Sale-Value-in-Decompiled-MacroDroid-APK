package p438y7;

import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.ReadableMime;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.ParameterList;
import p447z7.C17049a;
import p447z7.C17050b;
import p447z7.C17055g;

/* renamed from: y7.b */
/* compiled from: IMAPBodyPart */
public class C16940b extends MimeBodyPart implements ReadableMime {

    /* renamed from: g */
    private static final boolean f68210g = PropUtil.getBooleanSystemProperty("mail.mime.decodefilename", false);

    /* renamed from: a */
    private C16955e f68211a;

    /* renamed from: b */
    private C17050b f68212b;

    /* renamed from: c */
    private String f68213c;

    /* renamed from: d */
    private String f68214d;

    /* renamed from: e */
    private String f68215e;

    /* renamed from: f */
    private boolean f68216f = false;

    protected C16940b(C17050b bVar, String str, C16955e eVar) {
        this.f68212b = bVar;
        this.f68213c = str;
        this.f68211a = eVar;
        this.f68214d = new ContentType(bVar.f68441a, bVar.f68442c, bVar.f68435A).toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|31|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0084 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.InputStream m100063a() throws javax.mail.MessagingException {
        /*
            r5 = this;
            y7.e r0 = r5.f68211a
            boolean r0 = r0.mo80156C()
            if (r0 != 0) goto L_0x000b
            r5.m100064b()
        L_0x000b:
            y7.e r0 = r5.f68211a
            java.lang.Object r0 = r0.mo80166t()
            monitor-enter(r0)
            y7.e r1 = r5.f68211a     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            z7.g r1 = r1.mo80168v()     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            y7.e r2 = r5.f68211a     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            r2.mo80163q()     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            boolean r2 = r1.mo80289F()     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            if (r2 == 0) goto L_0x005a
            y7.e r2 = r5.f68211a     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            int r2 = r2.mo80169w()     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            r3.<init>()     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            java.lang.String r4 = r5.f68213c     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            r3.append(r4)     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            java.lang.String r4 = ".MIME"
            r3.append(r4)     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            java.lang.String r3 = r3.toString()     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            z7.a r1 = r1.mo80296M(r2, r3)     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            if (r1 == 0) goto L_0x0052
            java.io.ByteArrayInputStream r1 = r1.mo80273b()     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            if (r1 == 0) goto L_0x004a
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return r1
        L_0x004a:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            java.lang.String r2 = "Failed to fetch headers"
            r1.<init>(r2)     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            throw r1     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
        L_0x0052:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            java.lang.String r2 = "Failed to fetch headers"
            r1.<init>(r2)     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            throw r1     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
        L_0x005a:
            com.sun.mail.util.SharedByteArrayOutputStream r1 = new com.sun.mail.util.SharedByteArrayOutputStream     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            r2 = 0
            r1.<init>(r2)     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            com.sun.mail.util.LineOutputStream r2 = new com.sun.mail.util.LineOutputStream     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            r2.<init>(r1)     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            java.util.Enumeration r3 = super.getAllHeaderLines()     // Catch:{ IOException -> 0x007c, all -> 0x0080 }
        L_0x0069:
            boolean r4 = r3.hasMoreElements()     // Catch:{ IOException -> 0x007c, all -> 0x0080 }
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r3.nextElement()     // Catch:{ IOException -> 0x007c, all -> 0x0080 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x007c, all -> 0x0080 }
            r2.writeln(r4)     // Catch:{ IOException -> 0x007c, all -> 0x0080 }
            goto L_0x0069
        L_0x0079:
            r2.writeln()     // Catch:{ IOException -> 0x007c, all -> 0x0080 }
        L_0x007c:
            r2.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0085
        L_0x0080:
            r1 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            throw r1     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
        L_0x0085:
            java.io.InputStream r1 = r1.toStream()     // Catch:{ ConnectionException -> 0x0098, ProtocolException -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return r1
        L_0x008b:
            r1 = move-exception
            goto L_0x00a9
        L_0x008d:
            r1 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x008b }
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x008b }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x008b }
            throw r2     // Catch:{ all -> 0x008b }
        L_0x0098:
            r1 = move-exception
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x008b }
            y7.e r3 = r5.f68211a     // Catch:{ all -> 0x008b }
            javax.mail.Folder r3 = r3.getFolder()     // Catch:{ all -> 0x008b }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x008b }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x008b }
            throw r2     // Catch:{ all -> 0x008b }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16940b.m100063a():java.io.InputStream");
    }

    /* renamed from: b */
    private synchronized void m100064b() throws MessagingException {
        if (!this.f68216f) {
            if (this.headers == null) {
                this.headers = new InternetHeaders();
            }
            synchronized (this.f68211a.mo80166t()) {
                try {
                    C17055g v = this.f68211a.mo80168v();
                    this.f68211a.mo80163q();
                    if (v.mo80289F()) {
                        int w = this.f68211a.mo80169w();
                        C17049a M = v.mo80296M(w, this.f68213c + ".MIME");
                        if (M != null) {
                            ByteArrayInputStream b = M.mo80273b();
                            if (b != null) {
                                this.headers.load(b);
                            } else {
                                throw new MessagingException("Failed to fetch headers");
                            }
                        } else {
                            throw new MessagingException("Failed to fetch headers");
                        }
                    } else {
                        this.headers.addHeader("Content-Type", this.f68214d);
                        this.headers.addHeader("Content-Transfer-Encoding", this.f68212b.f68443d);
                        String str = this.f68212b.f68448s;
                        if (str != null) {
                            this.headers.addHeader("Content-Description", str);
                        }
                        String str2 = this.f68212b.f68447p;
                        if (str2 != null) {
                            this.headers.addHeader("Content-ID", str2);
                        }
                        String str3 = this.f68212b.f68449z;
                        if (str3 != null) {
                            this.headers.addHeader("Content-MD5", str3);
                        }
                    }
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this.f68211a.getFolder(), e.getMessage());
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            }
            this.f68216f = true;
        }
    }

    public void addHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void addHeaderLine(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        m100064b();
        return super.getAllHeaderLines();
    }

    public Enumeration<Header> getAllHeaders() throws MessagingException {
        m100064b();
        return super.getAllHeaders();
    }

    public String getContentID() throws MessagingException {
        return this.f68212b.f68447p;
    }

    public String getContentMD5() throws MessagingException {
        return this.f68212b.f68449z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r0 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        r7.f68211a.mo80164r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return new java.io.ByteArrayInputStream(new byte[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream getContentStream() throws javax.mail.MessagingException {
        /*
            r7 = this;
            y7.e r0 = r7.f68211a
            boolean r0 = r0.mo80167u()
            y7.e r1 = r7.f68211a
            java.lang.Object r1 = r1.mo80166t()
            monitor-enter(r1)
            y7.e r2 = r7.f68211a     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            z7.g r2 = r2.mo80168v()     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            y7.e r3 = r7.f68211a     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            r3.mo80163q()     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            boolean r3 = r2.mo80289F()     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            if (r3 == 0) goto L_0x003d
            y7.e r3 = r7.f68211a     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            int r3 = r3.mo80165s()     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            r4 = -1
            if (r3 == r4) goto L_0x003d
            y7.d r2 = new y7.d     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            y7.e r3 = r7.f68211a     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            java.lang.String r5 = r7.f68213c     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            boolean r6 = r3.mo80155A()     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            if (r6 == 0) goto L_0x0034
            goto L_0x0038
        L_0x0034:
            z7.b r4 = r7.f68212b     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            int r4 = r4.f68445g     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
        L_0x0038:
            r2.<init>(r3, r5, r4, r0)     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r2
        L_0x003d:
            y7.e r3 = r7.f68211a     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            int r3 = r3.mo80169w()     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r7.f68213c     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            z7.a r0 = r2.mo80296M(r3, r0)     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            goto L_0x0052
        L_0x004c:
            java.lang.String r0 = r7.f68213c     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            z7.a r0 = r2.mo80322r(r3, r0)     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
        L_0x0052:
            if (r0 == 0) goto L_0x0059
            java.io.ByteArrayInputStream r0 = r0.mo80273b()     // Catch:{ ConnectionException -> 0x0078, ProtocolException -> 0x006d }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x006a
            y7.e r0 = r7.f68211a
            r0.mo80164r()
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
        L_0x006a:
            return r0
        L_0x006b:
            r0 = move-exception
            goto L_0x0089
        L_0x006d:
            r0 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x006b }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x006b }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x006b }
            throw r2     // Catch:{ all -> 0x006b }
        L_0x0078:
            r0 = move-exception
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x006b }
            y7.e r3 = r7.f68211a     // Catch:{ all -> 0x006b }
            javax.mail.Folder r3 = r3.getFolder()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x006b }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x006b }
            throw r2     // Catch:{ all -> 0x006b }
        L_0x0089:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16940b.getContentStream():java.io.InputStream");
    }

    public String getContentType() throws MessagingException {
        return this.f68214d;
    }

    public synchronized DataHandler getDataHandler() throws MessagingException {
        if (this.f61342dh == null) {
            if (this.f68212b.mo80276a()) {
                this.f61342dh = new DataHandler((DataSource) new C16957f(this, this.f68212b.f68438D, this.f68213c, this.f68211a));
            } else if (this.f68212b.mo80277b() && this.f68211a.mo80156C() && this.f68212b.f68439E != null) {
                C16955e eVar = this.f68211a;
                C17050b bVar = this.f68212b;
                this.f61342dh = new DataHandler(new C16958g(eVar, bVar.f68438D[0], bVar.f68439E, this.f68213c), this.f68214d);
            }
        }
        return super.getDataHandler();
    }

    public String getDescription() throws MessagingException {
        String str = this.f68215e;
        if (str != null) {
            return str;
        }
        String str2 = this.f68212b.f68448s;
        if (str2 == null) {
            return null;
        }
        try {
            this.f68215e = MimeUtility.decodeText(str2);
        } catch (UnsupportedEncodingException unused) {
            this.f68215e = this.f68212b.f68448s;
        }
        return this.f68215e;
    }

    public String getDisposition() throws MessagingException {
        return this.f68212b.f68446o;
    }

    public String getEncoding() throws MessagingException {
        return this.f68212b.f68443d;
    }

    public String getFileName() throws MessagingException {
        ParameterList parameterList;
        ParameterList parameterList2 = this.f68212b.f68436B;
        String str = parameterList2 != null ? parameterList2.get("filename") : null;
        if ((str == null || str.isEmpty()) && (parameterList = this.f68212b.f68435A) != null) {
            str = parameterList.get("name");
        }
        if (!f68210g || str == null) {
            return str;
        }
        try {
            return MimeUtility.decodeText(str);
        } catch (UnsupportedEncodingException e) {
            throw new MessagingException("Can't decode filename", e);
        }
    }

    public String[] getHeader(String str) throws MessagingException {
        m100064b();
        return super.getHeader(str);
    }

    public int getLineCount() throws MessagingException {
        return this.f68212b.f68444f;
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        m100064b();
        return super.getMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        m100064b();
        return super.getMatchingHeaders(strArr);
    }

    public InputStream getMimeStream() throws MessagingException {
        return new SequenceInputStream(m100063a(), getContentStream());
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        m100064b();
        return super.getNonMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        m100064b();
        return super.getNonMatchingHeaders(strArr);
    }

    public int getSize() throws MessagingException {
        return this.f68212b.f68445g;
    }

    public void removeHeader(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void setContent(Object obj, String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void setContentMD5(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void setDataHandler(DataHandler dataHandler) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void setDescription(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void setDisposition(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void setFileName(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    public void setHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    /* access modifiers changed from: protected */
    public void updateHeaders() {
    }

    public void setContent(Multipart multipart) throws MessagingException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }
}
