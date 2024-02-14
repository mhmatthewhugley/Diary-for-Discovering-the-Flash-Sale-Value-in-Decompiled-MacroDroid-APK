package p438y7;

import java.io.IOException;
import java.io.InputStream;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.MessagingException;
import p430x7.C16850a;

/* renamed from: y7.d */
/* compiled from: IMAPInputStream */
public class C16954d extends InputStream {

    /* renamed from: A */
    private boolean f68273A;

    /* renamed from: B */
    private C16850a f68274B;

    /* renamed from: a */
    private C16955e f68275a;

    /* renamed from: c */
    private String f68276c;

    /* renamed from: d */
    private int f68277d = 0;

    /* renamed from: f */
    private int f68278f;

    /* renamed from: g */
    private int f68279g;

    /* renamed from: o */
    private byte[] f68280o;

    /* renamed from: p */
    private int f68281p;

    /* renamed from: s */
    private int f68282s;

    /* renamed from: z */
    private boolean f68283z;

    public C16954d(C16955e eVar, String str, int i, boolean z) {
        this.f68275a = eVar;
        this.f68276c = str;
        this.f68279g = i;
        this.f68273A = z;
        this.f68278f = eVar.mo80165s();
    }

    /* renamed from: b */
    private void m100113b() {
        if (!this.f68273A) {
            try {
                Folder folder = this.f68275a.getFolder();
                if (folder != null && folder.getMode() != 1) {
                    C16955e eVar = this.f68275a;
                    Flags.Flag flag = Flags.Flag.SEEN;
                    if (!eVar.isSet(flag)) {
                        this.f68275a.setFlag(flag, true);
                    }
                }
            } catch (MessagingException unused) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r4 == null) goto L_0x006b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m100114c() throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.f68283z
            if (r0 != 0) goto L_0x00e5
            int r0 = r9.f68279g
            r1 = -1
            if (r0 == r1) goto L_0x000f
            int r2 = r9.f68277d
            if (r2 < r0) goto L_0x000f
            goto L_0x00e5
        L_0x000f:
            x7.a r0 = r9.f68274B
            if (r0 != 0) goto L_0x001e
            x7.a r0 = new x7.a
            int r2 = r9.f68278f
            int r2 = r2 + 64
            r0.<init>(r2)
            r9.f68274B = r0
        L_0x001e:
            y7.e r0 = r9.f68275a
            java.lang.Object r0 = r0.mo80166t()
            monitor-enter(r0)
            y7.e r2 = r9.f68275a     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            z7.g r3 = r2.mo80168v()     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            y7.e r2 = r9.f68275a     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            boolean r2 = r2.isExpunged()     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            if (r2 != 0) goto L_0x00bc
            y7.e r2 = r9.f68275a     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            int r4 = r2.mo80169w()     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            int r2 = r9.f68278f     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            int r5 = r9.f68279g     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            if (r5 == r1) goto L_0x0047
            int r1 = r9.f68277d     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            int r6 = r1 + r2
            if (r6 <= r5) goto L_0x0047
            int r2 = r5 - r1
        L_0x0047:
            boolean r1 = r9.f68273A     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            if (r1 == 0) goto L_0x0057
            java.lang.String r5 = r9.f68276c     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            int r6 = r9.f68277d     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            x7.a r8 = r9.f68274B     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            r7 = r2
            z7.a r1 = r3.mo80297N(r4, r5, r6, r7, r8)     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            goto L_0x0062
        L_0x0057:
            java.lang.String r5 = r9.f68276c     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            int r6 = r9.f68277d     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            x7.a r8 = r9.f68274B     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            r7 = r2
            z7.a r1 = r3.mo80323s(r4, r5, r6, r7, r8)     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
        L_0x0062:
            r3 = 0
            if (r1 == 0) goto L_0x006b
            x7.a r4 = r1.mo80272a()     // Catch:{ all -> 0x00c4 }
            if (r4 != 0) goto L_0x0073
        L_0x006b:
            r9.m100115e()     // Catch:{ all -> 0x00c4 }
            x7.a r4 = new x7.a     // Catch:{ all -> 0x00c4 }
            r4.<init>(r3)     // Catch:{ all -> 0x00c4 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            int r0 = r9.f68277d
            if (r0 != 0) goto L_0x007b
            r9.m100113b()
        L_0x007b:
            byte[] r0 = r4.mo79985a()
            r9.f68280o = r0
            int r0 = r4.mo79987c()
            r9.f68282s = r0
            int r0 = r4.mo79986b()
            if (r1 == 0) goto L_0x0092
            int r1 = r1.mo80274c()
            goto L_0x0094
        L_0x0092:
            int r1 = r9.f68277d
        L_0x0094:
            r4 = 1
            if (r1 >= 0) goto L_0x00a4
            int r1 = r9.f68277d
            if (r1 != 0) goto L_0x00a1
            if (r0 == r2) goto L_0x009e
            r3 = 1
        L_0x009e:
            r9.f68283z = r3
            goto L_0x00ad
        L_0x00a1:
            r9.f68283z = r4
            goto L_0x00b1
        L_0x00a4:
            int r5 = r9.f68277d
            if (r1 != r5) goto L_0x00af
            if (r0 >= r2) goto L_0x00ab
            r3 = 1
        L_0x00ab:
            r9.f68283z = r3
        L_0x00ad:
            r3 = r0
            goto L_0x00b1
        L_0x00af:
            r9.f68283z = r4
        L_0x00b1:
            int r0 = r9.f68282s
            int r0 = r0 + r3
            r9.f68281p = r0
            int r0 = r9.f68277d
            int r0 = r0 + r3
            r9.f68277d = r0
            return
        L_0x00bc:
            com.sun.mail.util.MessageRemovedIOException r1 = new com.sun.mail.util.MessageRemovedIOException     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            java.lang.String r2 = "No content for expunged message"
            r1.<init>(r2)     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
            throw r1     // Catch:{ ProtocolException -> 0x00d5, FolderClosedException -> 0x00c6 }
        L_0x00c4:
            r1 = move-exception
            goto L_0x00e3
        L_0x00c6:
            r1 = move-exception
            com.sun.mail.util.FolderClosedIOException r2 = new com.sun.mail.util.FolderClosedIOException     // Catch:{ all -> 0x00c4 }
            javax.mail.Folder r3 = r1.getFolder()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00c4 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00c4 }
            throw r2     // Catch:{ all -> 0x00c4 }
        L_0x00d5:
            r1 = move-exception
            r9.m100115e()     // Catch:{ all -> 0x00c4 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00c4 }
            r2.<init>(r1)     // Catch:{ all -> 0x00c4 }
            throw r2     // Catch:{ all -> 0x00c4 }
        L_0x00e3:
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            throw r1
        L_0x00e5:
            int r0 = r9.f68277d
            if (r0 != 0) goto L_0x00ec
            r9.m100113b()
        L_0x00ec:
            r0 = 0
            r9.f68274B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16954d.m100114c():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m100115e() throws com.sun.mail.util.MessageRemovedIOException, com.sun.mail.util.FolderClosedIOException {
        /*
            r4 = this;
            y7.e r0 = r4.f68275a
            java.lang.Object r0 = r0.mo80166t()
            monitor-enter(r0)
            y7.e r1 = r4.f68275a     // Catch:{ ConnectionException -> 0x0032, FolderClosedException -> 0x0023, ProtocolException -> 0x0013 }
            z7.g r1 = r1.mo80168v()     // Catch:{ ConnectionException -> 0x0032, FolderClosedException -> 0x0023, ProtocolException -> 0x0013 }
            r1.mo80295L()     // Catch:{ ConnectionException -> 0x0032, FolderClosedException -> 0x0023, ProtocolException -> 0x0013 }
            goto L_0x0013
        L_0x0011:
            r1 = move-exception
            goto L_0x0043
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            y7.e r0 = r4.f68275a
            boolean r0 = r0.isExpunged()
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            com.sun.mail.util.MessageRemovedIOException r0 = new com.sun.mail.util.MessageRemovedIOException
            r0.<init>()
            throw r0
        L_0x0023:
            r1 = move-exception
            com.sun.mail.util.FolderClosedIOException r2 = new com.sun.mail.util.FolderClosedIOException     // Catch:{ all -> 0x0011 }
            javax.mail.Folder r3 = r1.getFolder()     // Catch:{ all -> 0x0011 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0011 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0011 }
            throw r2     // Catch:{ all -> 0x0011 }
        L_0x0032:
            r1 = move-exception
            com.sun.mail.util.FolderClosedIOException r2 = new com.sun.mail.util.FolderClosedIOException     // Catch:{ all -> 0x0011 }
            y7.e r3 = r4.f68275a     // Catch:{ all -> 0x0011 }
            javax.mail.Folder r3 = r3.getFolder()     // Catch:{ all -> 0x0011 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0011 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0011 }
            throw r2     // Catch:{ all -> 0x0011 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16954d.m100115e():void");
    }

    public synchronized int available() throws IOException {
        return this.f68281p - this.f68282s;
    }

    public synchronized int read() throws IOException {
        if (this.f68282s >= this.f68281p) {
            m100114c();
            if (this.f68282s >= this.f68281p) {
                return -1;
            }
        }
        byte[] bArr = this.f68280o;
        int i = this.f68282s;
        this.f68282s = i + 1;
        return bArr[i] & 255;
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f68281p - this.f68282s;
        if (i3 <= 0) {
            m100114c();
            i3 = this.f68281p - this.f68282s;
            if (i3 <= 0) {
                return -1;
            }
        }
        if (i3 < i2) {
            i2 = i3;
        }
        System.arraycopy(this.f68280o, this.f68282s, bArr, i, i2);
        this.f68282s += i2;
        return i2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
