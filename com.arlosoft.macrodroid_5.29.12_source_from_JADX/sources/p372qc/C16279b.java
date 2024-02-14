package p372qc;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;
import kotlin.text.C15159j;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15917e;
import okhttp3.C15919e0;
import okhttp3.C15975r;
import okhttp3.C15986u;
import okhttp3.C15989v;
import okhttp3.C15995x;
import okhttp3.C16002z;
import org.apache.http.auth.AUTH;
import org.apache.http.cookie.C16050SM;
import p226cd.C11179b;
import p226cd.C11184c;
import p226cd.C11186d;
import p226cd.C11188e;
import p226cd.C11199o;
import p226cd.C11212y;
import p424wa.C16788e;
import p426wc.C16796b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Ü\u0001\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010&\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010'\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010(\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0\f\"\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0012\u00102\u001a\u000200*\u00020/2\u0006\u00101\u001a\u000200\u001a \u00106\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000104\u001a\n\u00107\u001a\u00020\u0018*\u00020$\u001a\u0010\u0010;\u001a\u00020:*\b\u0012\u0004\u0012\u00020908\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020908*\u00020:\u001a\u0012\u0010=\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010@\u001a\u00020?*\u00020>\u001a\u0015\u0010C\u001a\u00020\u0018*\u00020A2\u0006\u0010B\u001a\u00020\u0018H\u0004\u001a\u0015\u0010E\u001a\u00020\u0018*\u00020D2\u0006\u0010B\u001a\u00020\u0018H\u0004\u001a\u0015\u0010F\u001a\u00020\u0000*\u00020\u00182\u0006\u0010B\u001a\u00020\u0000H\u0004\u001a\u0012\u0010I\u001a\u00020\u0004*\u00020G2\u0006\u0010H\u001a\u00020\u0018\u001a\n\u0010J\u001a\u00020\u0018*\u00020/\u001a\u001a\u0010M\u001a\u00020\b*\u00020K2\u0006\u00103\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u001a\u0010O\u001a\u00020\b*\u00020K2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u0012\u0010R\u001a\u00020\b*\u00020P2\u0006\u0010Q\u001a\u00020/\u001a\u0012\u0010T\u001a\u00020\u0018*\u00020S2\u0006\u0010C\u001a\u00020A\u001a\u0014\u0010U\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010W\u001a\u00020\u0000*\u00020V\u001a\u0012\u0010Y\u001a\u00020\u0000*\u00020\u00062\u0006\u0010X\u001a\u00020\u0000\u001a\u0014\u0010Z\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010X\u001a\u00020\u0018\u001a\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010[*\b\u0012\u0004\u0012\u00028\u000008\u001a/\u0010^\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010[2\u0012\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b^\u0010_\u001a.\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010`\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010I*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010`\u001a\n\u0010c\u001a\u00020\u0004*\u00020b\u001a\n\u0010d\u001a\u00020\u0004*\u00020P\u001a'\u0010g\u001a\u00020\u0004\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000e2\u0006\u0010f\u001a\u00028\u0000H\u0000¢\u0006\u0004\bg\u0010h\u001a \u0010m\u001a\u00020l*\u00060ij\u0002`j2\u0010\u0010k\u001a\f\u0012\b\u0012\u00060ij\u0002`j08¨\u0006n"}, mo71668d2 = {"", "arrayLength", "offset", "count", "Lja/u;", "i", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "J", "", "other", "Ljava/util/Comparator;", "comparator", "B", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "r", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/v;", "includeDefaultPort", "M", "value", "", "u", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "l", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "w", "y", "S", "delimiters", "n", "", "delimiter", "m", "v", "f", "D", "format", "", "args", "q", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lcd/d;", "Ljava/nio/charset/Charset;", "default", "F", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "h", "E", "", "Lwc/b;", "Lokhttp3/u;", "L", "K", "g", "Lokhttp3/r;", "Lokhttp3/r$c;", "e", "", "mask", "b", "", "c", "d", "Lcd/c;", "medium", "V", "G", "Lcd/y;", "timeUnit", "I", "timeout", "p", "Ljava/net/Socket;", "source", "C", "Lcd/b;", "H", "A", "Lokhttp3/d0;", "s", "defaultValue", "Q", "R", "T", "O", "elements", "t", "([Ljava/lang/Object;)Ljava/util/List;", "", "P", "Ljava/io/Closeable;", "j", "k", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "U", "okhttp"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: qc.b */
/* compiled from: Util.kt */
public final class C16279b {

    /* renamed from: a */
    public static final byte[] f66622a;

    /* renamed from: b */
    public static final C15986u f66623b = C15986u.f65791c.mo76260g(new String[0]);

    /* renamed from: c */
    public static final C15919e0 f66624c;

    /* renamed from: d */
    public static final C15907c0 f66625d;

    /* renamed from: e */
    private static final C11199o f66626e;

    /* renamed from: f */
    public static final TimeZone f66627f;

    /* renamed from: g */
    private static final C15159j f66628g = new C15159j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h */
    public static final boolean f66629h = false;

    /* renamed from: i */
    public static final String f66630i;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lokhttp3/e;", "it", "Lokhttp3/r;", "a", "(Lokhttp3/e;)Lokhttp3/r;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: qc.b$a */
    /* compiled from: Util.kt */
    static final class C16280a implements C15975r.C15978c {

        /* renamed from: a */
        final /* synthetic */ C15975r f66631a;

        C16280a(C15975r rVar) {
            this.f66631a = rVar;
        }

        /* renamed from: a */
        public final C15975r mo76227a(C15917e eVar) {
            C13706o.m87929f(eVar, "it");
            return this.f66631a;
        }
    }

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo71668d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Runnable;", "newThread"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: qc.b$b */
    /* compiled from: Util.kt */
    static final class C16281b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f66632a;

        /* renamed from: c */
        final /* synthetic */ boolean f66633c;

        C16281b(String str, boolean z) {
            this.f66632a = str;
            this.f66633c = z;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f66632a);
            thread.setDaemon(this.f66633c);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f66622a = bArr;
        f66624c = C15919e0.C15921b.m96028i(C15919e0.Companion, bArr, (C15995x) null, 1, (Object) null);
        f66625d = C15907c0.C15908a.m95951j(C15907c0.f65424a, bArr, (C15995x) null, 0, 0, 7, (Object) null);
        C11199o.C11200a aVar = C11199o.f54123d;
        C11188e.C11189a aVar2 = C11188e.f54104d;
        f66626e = aVar.mo62541d(aVar2.mo62511a("efbbbf"), aVar2.mo62511a("feff"), aVar2.mo62511a("fffe"), aVar2.mo62511a("0000ffff"), aVar2.mo62511a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C13706o.m87926c(timeZone);
        f66627f = timeZone;
        Class<C16002z> cls = C16002z.class;
        String name = C16002z.class.getName();
        C13706o.m87928e(name, "OkHttpClient::class.java.name");
        f66630i = C15177w.m93699r0(C15177w.m93698q0(name, "okhttp3."), "Client");
    }

    /* renamed from: A */
    public static final int m97625A(String str, int i) {
        C13706o.m87929f(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* renamed from: B */
    public static final String[] m97626B(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C13706o.m87929f(strArr, "$this$intersect");
        C13706o.m87929f(strArr2, "other");
        C13706o.m87929f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    /* renamed from: C */
    public static final boolean m97627C(Socket socket, C11186d dVar) {
        int soTimeout;
        C13706o.m87929f(socket, "$this$isHealthy");
        C13706o.m87929f(dVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !dVar.mo62469x1();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* renamed from: D */
    public static final boolean m97628D(String str) {
        C13706o.m87929f(str, "name");
        if (C15176v.m93641v(str, AUTH.WWW_AUTH_RESP, true) || C15176v.m93641v(str, C16050SM.COOKIE, true) || C15176v.m93641v(str, AUTH.PROXY_AUTH_RESP, true) || C15176v.m93641v(str, C16050SM.SET_COOKIE, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static final int m97629E(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: F */
    public static final Charset m97630F(C11186d dVar, Charset charset) throws IOException {
        C13706o.m87929f(dVar, "$this$readBomAsCharset");
        C13706o.m87929f(charset, "default");
        int U1 = dVar.mo62418U1(f66626e);
        if (U1 == -1) {
            return charset;
        }
        if (U1 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            C13706o.m87928e(charset2, "UTF_8");
            return charset2;
        } else if (U1 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            C13706o.m87928e(charset3, "UTF_16BE");
            return charset3;
        } else if (U1 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            C13706o.m87928e(charset4, "UTF_16LE");
            return charset4;
        } else if (U1 == 3) {
            return C15147d.f64348a.mo74447a();
        } else {
            if (U1 == 4) {
                return C15147d.f64348a.mo74448b();
            }
            throw new AssertionError();
        }
    }

    /* renamed from: G */
    public static final int m97631G(C11186d dVar) throws IOException {
        C13706o.m87929f(dVar, "$this$readMedium");
        return m97648b(dVar.readByte(), 255) | (m97648b(dVar.readByte(), 255) << 16) | (m97648b(dVar.readByte(), 255) << 8);
    }

    /* renamed from: H */
    public static final int m97632H(C11179b bVar, byte b) {
        C13706o.m87929f(bVar, "$this$skipAll");
        int i = 0;
        while (!bVar.mo62469x1() && bVar.mo62435h(0) == b) {
            i++;
            bVar.readByte();
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.mo62393q().mo62520a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.mo62393q().mo62523d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r5 != androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        return r12;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m97633I(p226cd.C11212y r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "$this$skipAll"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            long r0 = java.lang.System.nanoTime()
            cd.z r2 = r11.mo62393q()
            boolean r2 = r2.mo62524e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            cd.z r2 = r11.mo62393q()
            long r5 = r2.mo62522c()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            cd.z r2 = r11.mo62393q()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo62523d(r12)
            cd.b r12 = new cd.b     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo62392m0(r12, r7)     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.mo62424b()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            cd.z r11 = r11.mo62393q()
            r11.mo62520a()
            goto L_0x0081
        L_0x005b:
            cd.z r11 = r11.mo62393q()
            long r0 = r0 + r5
            r11.mo62523d(r0)
            goto L_0x0081
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0071
            cd.z r11 = r11.mo62393q()
            r11.mo62520a()
            goto L_0x0079
        L_0x0071:
            cd.z r11 = r11.mo62393q()
            long r0 = r0 + r5
            r11.mo62523d(r0)
        L_0x0079:
            throw r12
        L_0x007a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x0081:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p372qc.C16279b.m97633I(cd.y, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: J */
    public static final ThreadFactory m97634J(String str, boolean z) {
        C13706o.m87929f(str, "name");
        return new C16281b(str, z);
    }

    /* renamed from: K */
    public static final List<C16796b> m97635K(C15986u uVar) {
        C13706o.m87929f(uVar, "$this$toHeaderList");
        C16788e k = C16792h.m99549k(0, uVar.size());
        ArrayList arrayList = new ArrayList(C13616u.m87774u(k, 10));
        Iterator it = k.iterator();
        while (it.hasNext()) {
            int nextInt = ((C13603n0) it).nextInt();
            arrayList.add(new C16796b(uVar.mo76242d(nextInt), uVar.mo76246i(nextInt)));
        }
        return arrayList;
    }

    /* renamed from: L */
    public static final C15986u m97636L(List<C16796b> list) {
        C13706o.m87929f(list, "$this$toHeaders");
        C15986u.C15987a aVar = new C15986u.C15987a();
        for (C16796b next : list) {
            aVar.mo76254d(next.mo79793a().mo62489H(), next.mo79794b().mo62489H());
        }
        return aVar.mo76256f();
    }

    /* renamed from: M */
    public static final String m97637M(C15989v vVar, boolean z) {
        String str;
        C13706o.m87929f(vVar, "$this$toHostHeader");
        if (C15177w.m93663N(vVar.mo76269i(), ":", false, 2, (Object) null)) {
            str = '[' + vVar.mo76269i() + ']';
        } else {
            str = vVar.mo76269i();
        }
        if (!z && vVar.mo76274n() == C15989v.f65795l.mo76302c(vVar.mo76278r())) {
            return str;
        }
        return str + ':' + vVar.mo76274n();
    }

    /* renamed from: N */
    public static /* synthetic */ String m97638N(C15989v vVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m97637M(vVar, z);
    }

    /* renamed from: O */
    public static final <T> List<T> m97639O(List<? extends T> list) {
        C13706o.m87929f(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C13566b0.m87405I0(list));
        C13706o.m87928e(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: P */
    public static final <K, V> Map<K, V> m97640P(Map<K, ? extends V> map) {
        C13706o.m87929f(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return C13615t0.m87759i();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C13706o.m87928e(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    /* renamed from: Q */
    public static final long m97641Q(String str, long j) {
        C13706o.m87929f(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: R */
    public static final int m97642R(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: S */
    public static final String m97643S(String str, int i, int i2) {
        C13706o.m87929f(str, "$this$trimSubstring");
        int w = m97669w(str, i, i2);
        String substring = str.substring(w, m97671y(str, w, i2));
        C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: T */
    public static /* synthetic */ String m97644T(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m97643S(str, i, i2);
    }

    /* renamed from: U */
    public static final Throwable m97645U(Exception exc, List<? extends Exception> list) {
        C13706o.m87929f(exc, "$this$withSuppressed");
        C13706o.m87929f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception a : list) {
            C13315b.m85661a(exc, a);
        }
        return exc;
    }

    /* renamed from: V */
    public static final void m97646V(C11184c cVar, int i) throws IOException {
        C13706o.m87929f(cVar, "$this$writeMedium");
        cVar.writeByte((i >>> 16) & 255);
        cVar.writeByte((i >>> 8) & 255);
        cVar.writeByte(i & 255);
    }

    /* renamed from: a */
    public static final <E> void m97647a(List<E> list, E e) {
        C13706o.m87929f(list, "$this$addIfAbsent");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    /* renamed from: b */
    public static final int m97648b(byte b, int i) {
        return b & i;
    }

    /* renamed from: c */
    public static final int m97649c(short s, int i) {
        return s & i;
    }

    /* renamed from: d */
    public static final long m97650d(int i, long j) {
        return ((long) i) & j;
    }

    /* renamed from: e */
    public static final C15975r.C15978c m97651e(C15975r rVar) {
        C13706o.m87929f(rVar, "$this$asFactory");
        return new C16280a(rVar);
    }

    /* renamed from: f */
    public static final boolean m97652f(String str) {
        C13706o.m87929f(str, "$this$canParseAsIpAddress");
        return f66628g.mo74468c(str);
    }

    /* renamed from: g */
    public static final boolean m97653g(C15989v vVar, C15989v vVar2) {
        C13706o.m87929f(vVar, "$this$canReuseConnectionFor");
        C13706o.m87929f(vVar2, "other");
        return C13706o.m87924a(vVar.mo76269i(), vVar2.mo76269i()) && vVar.mo76274n() == vVar2.mo76274n() && C13706o.m87924a(vVar.mo76278r(), vVar2.mo76278r());
    }

    /* renamed from: h */
    public static final int m97654h(String str, long j, TimeUnit timeUnit) {
        C13706o.m87929f(str, "name");
        boolean z = true;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    /* renamed from: i */
    public static final void m97655i(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: j */
    public static final void m97656j(Closeable closeable) {
        C13706o.m87929f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public static final void m97657k(Socket socket) {
        C13706o.m87929f(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C13706o.m87924a(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public static final String[] m97658l(String[] strArr, String str) {
        C13706o.m87929f(strArr, "$this$concat");
        C13706o.m87929f(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C13706o.m87928e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C13596m.m87581F(strArr2)] = str;
        return strArr2;
    }

    /* renamed from: m */
    public static final int m97659m(String str, char c, int i, int i2) {
        C13706o.m87929f(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static final int m97660n(String str, String str2, int i, int i2) {
        C13706o.m87929f(str, "$this$delimiterOffset");
        C13706o.m87929f(str2, "delimiters");
        while (i < i2) {
            if (C15177w.m93661M(str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static /* synthetic */ int m97661o(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m97659m(str, c, i, i2);
    }

    /* renamed from: p */
    public static final boolean m97662p(C11212y yVar, int i, TimeUnit timeUnit) {
        C13706o.m87929f(yVar, "$this$discard");
        C13706o.m87929f(timeUnit, "timeUnit");
        try {
            return m97633I(yVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static final String m97663q(String str, Object... objArr) {
        C13706o.m87929f(str, "format");
        C13706o.m87929f(objArr, "args");
        C13696i0 i0Var = C13696i0.f61931a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C13706o.m87928e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: r */
    public static final boolean m97664r(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C13706o.m87929f(strArr, "$this$hasIntersection");
        C13706o.m87929f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public static final long m97665s(C15915d0 d0Var) {
        C13706o.m87929f(d0Var, "$this$headersContentLength");
        String c = d0Var.mo75976p().mo76241c("Content-Length");
        if (c != null) {
            return m97641Q(c, -1);
        }
        return -1;
    }

    @SafeVarargs
    /* renamed from: t */
    public static final <T> List<T> m97666t(T... tArr) {
        C13706o.m87929f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C13614t.m87751m(Arrays.copyOf(objArr, objArr.length)));
        C13706o.m87928e(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: u */
    public static final int m97667u(String[] strArr, String str, Comparator<String> comparator) {
        C13706o.m87929f(strArr, "$this$indexOf");
        C13706o.m87929f(str, "value");
        C13706o.m87929f(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: v */
    public static final int m97668v(String str) {
        C13706o.m87929f(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C13706o.m87931h(charAt, 31) <= 0 || C13706o.m87931h(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static final int m97669w(String str, int i, int i2) {
        C13706o.m87929f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: x */
    public static /* synthetic */ int m97670x(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m97669w(str, i, i2);
    }

    /* renamed from: y */
    public static final int m97671y(String str, int i, int i2) {
        C13706o.m87929f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    /* renamed from: z */
    public static /* synthetic */ int m97672z(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m97671y(str, i, i2);
    }
}
