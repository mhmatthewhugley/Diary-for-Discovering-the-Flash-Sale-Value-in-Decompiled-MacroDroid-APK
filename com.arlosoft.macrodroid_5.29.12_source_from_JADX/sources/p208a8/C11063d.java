package p208a8;

import com.sun.mail.util.MailLogger;
import com.sun.mail.util.ReadableMime;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Enumeration;
import java.util.logging.Level;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.SharedInputStream;

/* renamed from: a8.d */
/* compiled from: POP3Message */
public class C11063d extends MimeMessage implements ReadableMime {

    /* renamed from: a */
    private C11062c f53920a;

    /* renamed from: b */
    private int f53921b = -1;

    /* renamed from: c */
    private int f53922c = -1;

    /* renamed from: d */
    String f53923d = "UNKNOWN";

    /* renamed from: e */
    private SoftReference<InputStream> f53924e = new SoftReference<>((Object) null);

    public C11063d(Folder folder, int i) throws MessagingException {
        super(folder, i);
        this.f53920a = (C11062c) folder;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private InputStream m74553a(boolean z) throws MessagingException {
        InputStream inputStream;
        try {
            synchronized (this) {
                inputStream = this.f53924e.get();
                if (inputStream == null) {
                    C11076l g = this.f53920a.mo62075g();
                    if (g != null) {
                        if (this.f53920a.f53910C.isLoggable(Level.FINE)) {
                            MailLogger mailLogger = this.f53920a.f53910C;
                            mailLogger.fine("caching message #" + this.msgnum + " in temp file");
                        }
                        C11060a b = g.mo62140b();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(b);
                        try {
                            this.f53920a.mo62076h().mo62115P(this.msgnum, bufferedOutputStream);
                            bufferedOutputStream.close();
                            inputStream = b.mo62046b();
                        } catch (Throwable th) {
                            bufferedOutputStream.close();
                            throw th;
                        }
                    } else {
                        C11068i h = this.f53920a.mo62076h();
                        int i = this.msgnum;
                        int i2 = this.f53922c;
                        inputStream = h.mo62114O(i, i2 > 0 ? i2 + this.f53921b : 0);
                    }
                    if (inputStream != null) {
                        if (this.headers != null) {
                            if (!((C11067h) this.f53920a.getStore()).f53933I) {
                                while (true) {
                                    int i3 = 0;
                                    while (true) {
                                        int read = inputStream.read();
                                        if (read < 0) {
                                            break;
                                        } else if (read == 10) {
                                            break;
                                        } else if (read != 13) {
                                            i3++;
                                        } else if (inputStream.available() > 0) {
                                            inputStream.mark(1);
                                            if (inputStream.read() != 10) {
                                                inputStream.reset();
                                            }
                                        }
                                    }
                                    if (inputStream.available() != 0) {
                                        if (i3 == 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                this.f53921b = (int) ((SharedInputStream) inputStream).getPosition();
                                this.f53922c = inputStream.available();
                                this.f53924e = new SoftReference<>(inputStream);
                            }
                        }
                        this.headers = new InternetHeaders(inputStream);
                        this.f53921b = (int) ((SharedInputStream) inputStream).getPosition();
                        this.f53922c = inputStream.available();
                        this.f53924e = new SoftReference<>(inputStream);
                    } else {
                        this.expunged = true;
                        throw new MessageRemovedException("can't retrieve message #" + this.msgnum + " in POP3Message.getContentStream");
                    }
                }
            }
            return ((SharedInputStream) inputStream).newStream(z ? (long) this.f53921b : 0, -1);
        } catch (EOFException e) {
            this.f53920a.close(false);
            throw new FolderClosedException(this.f53920a, e.toString());
        } catch (IOException e2) {
            throw new MessagingException("error fetching POP3 content", e2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = getContentStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0056, code lost:
        throw new javax.mail.MessagingException("error loading POP3 headers", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0058, code lost:
        r3.f53920a.close(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0068, code lost:
        throw new javax.mail.FolderClosedException(r3.f53920a, r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m74554c() throws javax.mail.MessagingException {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ EOFException -> 0x0057, IOException -> 0x004e }
            javax.mail.internet.InternetHeaders r1 = r3.headers     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0008
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            return
        L_0x0008:
            a8.c r1 = r3.f53920a     // Catch:{ all -> 0x004b }
            javax.mail.Store r1 = r1.getStore()     // Catch:{ all -> 0x004b }
            a8.h r1 = (p208a8.C11067h) r1     // Catch:{ all -> 0x004b }
            boolean r1 = r1.f53932H     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x003a
            a8.c r1 = r3.f53920a     // Catch:{ all -> 0x004b }
            a8.i r1 = r1.mo62076h()     // Catch:{ all -> 0x004b }
            int r2 = r3.msgnum     // Catch:{ all -> 0x004b }
            java.io.InputStream r1 = r1.mo62122b0(r2, r0)     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0023
            goto L_0x003a
        L_0x0023:
            int r2 = r1.available()     // Catch:{ all -> 0x0035 }
            r3.f53921b = r2     // Catch:{ all -> 0x0035 }
            javax.mail.internet.InternetHeaders r2 = new javax.mail.internet.InternetHeaders     // Catch:{ all -> 0x0035 }
            r2.<init>(r1)     // Catch:{ all -> 0x0035 }
            r3.headers = r2     // Catch:{ all -> 0x0035 }
            r1.close()     // Catch:{ all -> 0x004b }
            r1 = 0
            goto L_0x003b
        L_0x0035:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x004b }
            throw r2     // Catch:{ all -> 0x004b }
        L_0x003a:
            r1 = 1
        L_0x003b:
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004a
            java.io.InputStream r1 = r3.getContentStream()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ EOFException -> 0x0057, IOException -> 0x004e }
            goto L_0x004a
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ EOFException -> 0x0057, IOException -> 0x004e }
        L_0x004a:
            return
        L_0x004b:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            throw r1     // Catch:{ EOFException -> 0x0057, IOException -> 0x004e }
        L_0x004e:
            r0 = move-exception
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "error loading POP3 headers"
            r1.<init>(r2, r0)
            throw r1
        L_0x0057:
            r1 = move-exception
            a8.c r2 = r3.f53920a
            r2.close(r0)
            javax.mail.FolderClosedException r0 = new javax.mail.FolderClosedException
            a8.c r2 = r3.f53920a
            java.lang.String r1 = r1.toString()
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11063d.m74554c():void");
    }

    public void addHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    public void addHeaderLine(String str) throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo62080b(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.content = r0     // Catch:{ all -> 0x002c }
            java.lang.ref.SoftReference<java.io.InputStream> r1 = r2.f53924e     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002c }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ IOException -> 0x0011 }
        L_0x0011:
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x002c }
            r1.<init>(r0)     // Catch:{ all -> 0x002c }
            r2.f53924e = r1     // Catch:{ all -> 0x002c }
        L_0x0018:
            java.io.InputStream r1 = r2.contentStream     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r2.contentStream = r0     // Catch:{ all -> 0x002c }
        L_0x0021:
            r1 = -1
            r2.f53922c = r1     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x002a
            r2.headers = r0     // Catch:{ all -> 0x002c }
            r2.f53921b = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r2)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11063d.mo62080b(boolean):void");
    }

    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        if (this.headers == null) {
            m74554c();
        }
        return this.headers.getAllHeaderLines();
    }

    public Enumeration<Header> getAllHeaders() throws MessagingException {
        if (this.headers == null) {
            m74554c();
        }
        return this.headers.getAllHeaders();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.InputStream getContentStream() throws javax.mail.MessagingException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.io.InputStream r0 = r6.contentStream     // Catch:{ all -> 0x0035 }
            r1 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0011
            javax.mail.internet.SharedInputStream r0 = (javax.mail.internet.SharedInputStream) r0     // Catch:{ all -> 0x0035 }
            java.io.InputStream r0 = r0.newStream(r3, r1)     // Catch:{ all -> 0x0035 }
            monitor-exit(r6)
            return r0
        L_0x0011:
            r0 = 1
            java.io.InputStream r0 = r6.m74553a(r0)     // Catch:{ all -> 0x0035 }
            a8.c r5 = r6.f53920a     // Catch:{ all -> 0x0035 }
            a8.l r5 = r5.mo62075g()     // Catch:{ all -> 0x0035 }
            if (r5 != 0) goto L_0x002a
            a8.c r5 = r6.f53920a     // Catch:{ all -> 0x0035 }
            javax.mail.Store r5 = r5.getStore()     // Catch:{ all -> 0x0035 }
            a8.h r5 = (p208a8.C11067h) r5     // Catch:{ all -> 0x0035 }
            boolean r5 = r5.f53938N     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0033
        L_0x002a:
            r5 = r0
            javax.mail.internet.SharedInputStream r5 = (javax.mail.internet.SharedInputStream) r5     // Catch:{ all -> 0x0035 }
            java.io.InputStream r1 = r5.newStream(r3, r1)     // Catch:{ all -> 0x0035 }
            r6.contentStream = r1     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r6)
            return r0
        L_0x0035:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11063d.getContentStream():java.io.InputStream");
    }

    public String[] getHeader(String str) throws MessagingException {
        if (this.headers == null) {
            m74554c();
        }
        return this.headers.getHeader(str);
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        if (this.headers == null) {
            m74554c();
        }
        return this.headers.getMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        if (this.headers == null) {
            m74554c();
        }
        return this.headers.getMatchingHeaders(strArr);
    }

    public InputStream getMimeStream() throws MessagingException {
        return m74553a(false);
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        if (this.headers == null) {
            m74554c();
        }
        return this.headers.getNonMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        if (this.headers == null) {
            m74554c();
        }
        return this.headers.getNonMatchingHeaders(strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000a, code lost:
        if (r3.headers != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000c, code lost:
        m74554c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x000f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0012, code lost:
        if (r3.f53922c >= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0014, code lost:
        r3.f53922c = r3.f53920a.mo62076h().mo62110E(r3.msgnum) - r3.f53921b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = r3.f53922c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getSize() throws javax.mail.MessagingException {
        /*
            r3 = this;
            monitor-enter(r3)     // Catch:{ EOFException -> 0x0038, IOException -> 0x002f }
            int r0 = r3.f53922c     // Catch:{ all -> 0x002c }
            if (r0 <= 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            return r0
        L_0x0007:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            javax.mail.internet.InternetHeaders r0 = r3.headers     // Catch:{ EOFException -> 0x0038, IOException -> 0x002f }
            if (r0 != 0) goto L_0x000f
            r3.m74554c()     // Catch:{ EOFException -> 0x0038, IOException -> 0x002f }
        L_0x000f:
            monitor-enter(r3)     // Catch:{ EOFException -> 0x0038, IOException -> 0x002f }
            int r0 = r3.f53922c     // Catch:{ all -> 0x0029 }
            if (r0 >= 0) goto L_0x0025
            a8.c r0 = r3.f53920a     // Catch:{ all -> 0x0029 }
            a8.i r0 = r0.mo62076h()     // Catch:{ all -> 0x0029 }
            int r1 = r3.msgnum     // Catch:{ all -> 0x0029 }
            int r0 = r0.mo62110E(r1)     // Catch:{ all -> 0x0029 }
            int r1 = r3.f53921b     // Catch:{ all -> 0x0029 }
            int r0 = r0 - r1
            r3.f53922c = r0     // Catch:{ all -> 0x0029 }
        L_0x0025:
            int r0 = r3.f53922c     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ EOFException -> 0x0038, IOException -> 0x002f }
        L_0x002c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r0     // Catch:{ EOFException -> 0x0038, IOException -> 0x002f }
        L_0x002f:
            r0 = move-exception
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.String r2 = "error getting size"
            r1.<init>(r2, r0)
            throw r1
        L_0x0038:
            r0 = move-exception
            a8.c r1 = r3.f53920a
            r2 = 0
            r1.close(r2)
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException
            a8.c r2 = r3.f53920a
            java.lang.String r0 = r0.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11063d.getSize():int");
    }

    public void removeHeader(String str) throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    public void saveChanges() throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    public synchronized void setFlags(Flags flags, boolean z) throws MessagingException {
        super.setFlags(flags, z);
        if (!this.flags.equals((Flags) this.flags.clone())) {
            this.f53920a.notifyMessageChangedListeners(1, this);
        }
    }

    public void setHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:26|(2:28|29)|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0096 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void writeTo(java.io.OutputStream r6, java.lang.String[] r7) throws java.io.IOException, javax.mail.MessagingException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.SoftReference<java.io.InputStream> r0 = r5.f53924e     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x009c }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x006f
            if (r7 != 0) goto L_0x006f
            a8.c r1 = r5.f53920a     // Catch:{ all -> 0x009c }
            javax.mail.Store r1 = r1.getStore()     // Catch:{ all -> 0x009c }
            a8.h r1 = (p208a8.C11067h) r1     // Catch:{ all -> 0x009c }
            boolean r1 = r1.f53935K     // Catch:{ all -> 0x009c }
            if (r1 != 0) goto L_0x006f
            a8.c r7 = r5.f53920a     // Catch:{ all -> 0x009c }
            com.sun.mail.util.MailLogger r7 = r7.f53910C     // Catch:{ all -> 0x009c }
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch:{ all -> 0x009c }
            boolean r7 = r7.isLoggable(r0)     // Catch:{ all -> 0x009c }
            if (r7 == 0) goto L_0x003f
            a8.c r7 = r5.f53920a     // Catch:{ all -> 0x009c }
            com.sun.mail.util.MailLogger r7 = r7.f53910C     // Catch:{ all -> 0x009c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "streaming msg "
            r0.append(r1)     // Catch:{ all -> 0x009c }
            int r1 = r5.msgnum     // Catch:{ all -> 0x009c }
            r0.append(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x009c }
            r7.fine(r0)     // Catch:{ all -> 0x009c }
        L_0x003f:
            a8.c r7 = r5.f53920a     // Catch:{ all -> 0x009c }
            a8.i r7 = r7.mo62076h()     // Catch:{ all -> 0x009c }
            int r0 = r5.msgnum     // Catch:{ all -> 0x009c }
            boolean r6 = r7.mo62115P(r0, r6)     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x004e
            goto L_0x009a
        L_0x004e:
            r6 = 1
            r5.expunged = r6     // Catch:{ all -> 0x009c }
            javax.mail.MessageRemovedException r6 = new javax.mail.MessageRemovedException     // Catch:{ all -> 0x009c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r7.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "can't retrieve message #"
            r7.append(r0)     // Catch:{ all -> 0x009c }
            int r0 = r5.msgnum     // Catch:{ all -> 0x009c }
            r7.append(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = " in POP3Message.writeTo"
            r7.append(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x009c }
            r6.<init>(r7)     // Catch:{ all -> 0x009c }
            throw r6     // Catch:{ all -> 0x009c }
        L_0x006f:
            if (r0 == 0) goto L_0x0097
            if (r7 != 0) goto L_0x0097
            javax.mail.internet.SharedInputStream r0 = (javax.mail.internet.SharedInputStream) r0     // Catch:{ all -> 0x009c }
            r1 = 0
            r3 = -1
            java.io.InputStream r7 = r0.newStream(r1, r3)     // Catch:{ all -> 0x009c }
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0090 }
        L_0x0081:
            int r1 = r7.read(r0)     // Catch:{ all -> 0x0090 }
            if (r1 <= 0) goto L_0x008c
            r2 = 0
            r6.write(r0, r2, r1)     // Catch:{ all -> 0x0090 }
            goto L_0x0081
        L_0x008c:
            r7.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x009a
        L_0x0090:
            r6 = move-exception
            if (r7 == 0) goto L_0x0096
            r7.close()     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            throw r6     // Catch:{ all -> 0x009c }
        L_0x0097:
            super.writeTo(r6, r7)     // Catch:{ all -> 0x009c }
        L_0x009a:
            monitor-exit(r5)
            return
        L_0x009c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11063d.writeTo(java.io.OutputStream, java.lang.String[]):void");
    }

    public String getHeader(String str, String str2) throws MessagingException {
        if (this.headers == null) {
            m74554c();
        }
        return this.headers.getHeader(str, str2);
    }
}
