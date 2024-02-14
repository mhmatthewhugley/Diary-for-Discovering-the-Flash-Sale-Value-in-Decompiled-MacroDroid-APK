package okhttp3.internal.publicsuffix;

import androidx.webkit.ProxyConfig;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import org.apache.http.cookie.ClientCookie;
import p370qa.C16265l;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u001a"}, mo71668d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "f", "domainLabels", "b", "Lja/u;", "e", "d", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "<init>", "()V", "h", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PublicSuffixDatabase.kt */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    private static final byte[] f65727e = {(byte) 42};

    /* renamed from: f */
    private static final List<String> f65728f = C13612s.m87736e(ProxyConfig.MATCH_ALL_SCHEMES);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final PublicSuffixDatabase f65729g = new PublicSuffixDatabase();

    /* renamed from: h */
    public static final C15959a f65730h = new C15959a((C13695i) null);

    /* renamed from: a */
    private final AtomicBoolean f65731a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f65732b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f65733c;

    /* renamed from: d */
    private byte[] f65734d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo71668d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    /* compiled from: PublicSuffixDatabase.kt */
    public static final class C15959a {
        private C15959a() {
        }

        public /* synthetic */ C15959a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m96206b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int b;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = C16279b.m97648b(bArr4[i9][i10], 255);
                    }
                    b = i3 - C16279b.m97648b(bArr3[i6 + i11], 255);
                    if (b == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            z2 = true;
                            i10 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (b >= 0) {
                    if (b <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C13706o.m87928e(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase mo76163c() {
            return PublicSuffixDatabase.f65729g;
        }
    }

    /* renamed from: b */
    private final List<String> m96200b(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> list2;
        List<String> list3;
        if (this.f65731a.get() || !this.f65731a.compareAndSet(false, true)) {
            try {
                this.f65732b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m96202e();
        }
        if (this.f65733c != null) {
            int size = list.size();
            byte[][] bArr = new byte[size][];
            for (int i = 0; i < size; i++) {
                String str4 = list.get(i);
                Charset charset = StandardCharsets.UTF_8;
                C13706o.m87928e(charset, "UTF_8");
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str4.getBytes(charset);
                C13706o.m87928e(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                str = null;
                if (i2 >= size) {
                    str2 = null;
                    break;
                }
                C15959a aVar = f65730h;
                byte[] bArr2 = this.f65733c;
                if (bArr2 == null) {
                    C13706o.m87945v("publicSuffixListBytes");
                }
                str2 = aVar.m96206b(bArr2, bArr, i2);
                if (str2 != null) {
                    break;
                }
                i2++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    bArr3[i3] = f65727e;
                    C15959a aVar2 = f65730h;
                    byte[] bArr4 = this.f65733c;
                    if (bArr4 == null) {
                        C13706o.m87945v("publicSuffixListBytes");
                    }
                    String a = aVar2.m96206b(bArr4, bArr3, i3);
                    if (a != null) {
                        str3 = a;
                        break;
                    }
                    i3++;
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    C15959a aVar3 = f65730h;
                    byte[] bArr5 = this.f65734d;
                    if (bArr5 == null) {
                        C13706o.m87945v("publicSuffixExceptionListBytes");
                    }
                    String a2 = aVar3.m96206b(bArr5, bArr, i5);
                    if (a2 != null) {
                        str = a2;
                        break;
                    }
                    i5++;
                }
            }
            if (str != null) {
                return C15177w.m93704w0('!' + str, new char[]{FilenameUtils.EXTENSION_SEPARATOR}, false, 0, 6, (Object) null);
            } else if (str2 == null && str3 == null) {
                return f65728f;
            } else {
                if (str2 == null || (list2 = C15177w.m93704w0(str2, new char[]{FilenameUtils.EXTENSION_SEPARATOR}, false, 0, 6, (Object) null)) == null) {
                    list2 = C13614t.m87748j();
                }
                if (str3 == null || (list3 = C15177w.m93704w0(str3, new char[]{FilenameUtils.EXTENSION_SEPARATOR}, false, 0, 6, (Object) null)) == null) {
                    list3 = C13614t.m87748j();
                }
                return list2.size() > list3.size() ? list2 : list3;
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        kotlin.p312io.C13667b.m87853a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        throw r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m96201d() throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x004b
            cd.i r1 = new cd.i
            cd.y r0 = p226cd.C11196l.m75168g(r0)
            r1.<init>(r0)
            cd.d r0 = p226cd.C11196l.m75163b(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0044 }
            long r2 = (long) r2     // Catch:{ all -> 0x0044 }
            byte[] r2 = r0.mo62404H0(r2)     // Catch:{ all -> 0x0044 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0044 }
            long r3 = (long) r3     // Catch:{ all -> 0x0044 }
            byte[] r3 = r0.mo62404H0(r3)     // Catch:{ all -> 0x0044 }
            ja.u r4 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0044 }
            kotlin.p312io.C13667b.m87853a(r0, r1)
            monitor-enter(r5)
            kotlin.jvm.internal.C13706o.m87926c(r2)     // Catch:{ all -> 0x0041 }
            r5.f65733c = r2     // Catch:{ all -> 0x0041 }
            kotlin.jvm.internal.C13706o.m87926c(r3)     // Catch:{ all -> 0x0041 }
            r5.f65734d = r3     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f65732b
            r0.countDown()
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            kotlin.p312io.C13667b.m87853a(r0, r1)
            throw r2
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m96201d():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m96202e() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m96201d()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            xc.h$a r2 = p435xc.C16926h.f68190c     // Catch:{ all -> 0x000e }
            xc.h r2 = r2.mo80117g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.mo80113j(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m96202e():void");
    }

    /* renamed from: f */
    private final List<String> m96203f(String str) {
        List<String> w0 = C15177w.m93704w0(str, new char[]{FilenameUtils.EXTENSION_SEPARATOR}, false, 0, 6, (Object) null);
        return C13706o.m87924a((String) C13566b0.m87434i0(w0), "") ? C13566b0.m87417R(w0, 1) : w0;
    }

    /* renamed from: c */
    public final String mo76162c(String str) {
        int i;
        int i2;
        C13706o.m87929f(str, ClientCookie.DOMAIN_ATTR);
        String unicode = IDN.toUnicode(str);
        C13706o.m87928e(unicode, "unicodeDomain");
        List<String> f = m96203f(unicode);
        List<String> b = m96200b(f);
        if (f.size() == b.size() && b.get(0).charAt(0) != '!') {
            return null;
        }
        if (b.get(0).charAt(0) == '!') {
            i2 = f.size();
            i = b.size();
        } else {
            i2 = f.size();
            i = b.size() + 1;
        }
        return C15132p.m93492u(C15132p.m93484m(C13566b0.m87412N(m96203f(str)), i2 - i), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);
    }
}
