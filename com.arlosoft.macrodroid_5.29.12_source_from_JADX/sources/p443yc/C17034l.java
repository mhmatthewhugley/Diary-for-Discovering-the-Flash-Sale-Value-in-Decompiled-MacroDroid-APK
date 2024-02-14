package p443yc;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p435xc.C16926h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, mo71668d2 = {"Lyc/l;", "Lyc/f;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryClass", "paramClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: yc.l */
/* compiled from: StandardAndroidSocketAdapter.kt */
public final class C17034l extends C17020f {

    /* renamed from: j */
    public static final C17035a f68421j = new C17035a((C13695i) null);

    /* renamed from: h */
    private final Class<? super SSLSocketFactory> f68422h;

    /* renamed from: i */
    private final Class<?> f68423i;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo71668d2 = {"Lyc/l$a;", "", "", "packageName", "Lyc/k;", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: yc.l$a */
    /* compiled from: StandardAndroidSocketAdapter.kt */
    public static final class C17035a {
        private C17035a() {
        }

        public /* synthetic */ C17035a(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C17033k m100336b(C17035a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.mo80269a(str);
        }

        /* renamed from: a */
        public final C17033k mo80269a(String str) {
            C13706o.m87929f(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C13706o.m87928e(cls3, "paramsClass");
                return new C17034l(cls, cls2, cls3);
            } catch (Exception e) {
                C16926h.f68190c.mo80117g().mo80113j("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17034l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        C13706o.m87929f(cls, "sslSocketClass");
        C13706o.m87929f(cls2, "sslSocketFactoryClass");
        C13706o.m87929f(cls3, "paramClass");
        this.f68422h = cls2;
        this.f68423i = cls3;
    }
}
