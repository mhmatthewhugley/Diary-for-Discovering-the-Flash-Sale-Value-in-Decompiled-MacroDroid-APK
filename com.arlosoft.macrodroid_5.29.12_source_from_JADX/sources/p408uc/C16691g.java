package p408uc;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15904b0;
import okhttp3.C15915d0;
import okhttp3.C15917e;
import okhttp3.C15960j;
import okhttp3.C15993w;
import okhttp3.internal.connection.C15938c;
import okhttp3.internal.connection.C15942e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0011\u001a\u00020\u0015\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0011\u001a\u00020\u00158\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006)"}, mo71668d2 = {"Luc/g;", "Lokhttp3/w$a;", "", "index", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/b0;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "c", "(ILokhttp3/internal/connection/c;Lokhttp3/b0;III)Luc/g;", "Lokhttp3/j;", "b", "k", "Lokhttp3/e;", "call", "m", "Lokhttp3/d0;", "a", "Lokhttp3/internal/connection/e;", "Lokhttp3/internal/connection/e;", "e", "()Lokhttp3/internal/connection/e;", "Lokhttp3/internal/connection/c;", "g", "()Lokhttp3/internal/connection/c;", "Lokhttp3/b0;", "i", "()Lokhttp3/b0;", "I", "f", "()I", "h", "j", "", "Lokhttp3/w;", "interceptors", "<init>", "(Lokhttp3/internal/connection/e;Ljava/util/List;ILokhttp3/internal/connection/c;Lokhttp3/b0;III)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: uc.g */
/* compiled from: RealInterceptorChain.kt */
public final class C16691g implements C15993w.C15994a {

    /* renamed from: a */
    private int f67581a;

    /* renamed from: b */
    private final C15942e f67582b;

    /* renamed from: c */
    private final List<C15993w> f67583c;

    /* renamed from: d */
    private final int f67584d;

    /* renamed from: e */
    private final C15938c f67585e;

    /* renamed from: f */
    private final C15904b0 f67586f;

    /* renamed from: g */
    private final int f67587g;

    /* renamed from: h */
    private final int f67588h;

    /* renamed from: i */
    private final int f67589i;

    public C16691g(C15942e eVar, List<? extends C15993w> list, int i, C15938c cVar, C15904b0 b0Var, int i2, int i3, int i4) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(list, "interceptors");
        C13706o.m87929f(b0Var, "request");
        this.f67582b = eVar;
        this.f67583c = list;
        this.f67584d = i;
        this.f67585e = cVar;
        this.f67586f = b0Var;
        this.f67587g = i2;
        this.f67588h = i3;
        this.f67589i = i4;
    }

    /* renamed from: d */
    public static /* synthetic */ C16691g m99159d(C16691g gVar, int i, C15938c cVar, C15904b0 b0Var, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = gVar.f67584d;
        }
        if ((i5 & 2) != 0) {
            cVar = gVar.f67585e;
        }
        C15938c cVar2 = cVar;
        if ((i5 & 4) != 0) {
            b0Var = gVar.f67586f;
        }
        C15904b0 b0Var2 = b0Var;
        if ((i5 & 8) != 0) {
            i2 = gVar.f67587g;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = gVar.f67588h;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = gVar.f67589i;
        }
        return gVar.mo79594c(i, cVar2, b0Var2, i6, i7, i4);
    }

    /* renamed from: a */
    public C15915d0 mo76309a(C15904b0 b0Var) throws IOException {
        C13706o.m87929f(b0Var, "request");
        boolean z = false;
        if (this.f67584d < this.f67583c.size()) {
            this.f67581a++;
            C15938c cVar = this.f67585e;
            if (cVar != null) {
                if (cVar.mo76078j().mo76092g(b0Var.mo75920j())) {
                    if (!(this.f67581a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f67583c.get(this.f67584d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f67583c.get(this.f67584d - 1) + " must retain the same host and port").toString());
                }
            }
            C16691g d = m99159d(this, this.f67584d + 1, (C15938c) null, b0Var, 0, 0, 0, 58, (Object) null);
            C15993w wVar = this.f67583c.get(this.f67584d);
            C15915d0 intercept = wVar.intercept(d);
            if (intercept != null) {
                if (this.f67585e != null) {
                    if (!(this.f67584d + 1 >= this.f67583c.size() || d.f67581a == 1)) {
                        throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.mo75966b() != null) {
                    z = true;
                }
                if (z) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public C15960j mo76310b() {
        C15938c cVar = this.f67585e;
        if (cVar != null) {
            return cVar.mo76076h();
        }
        return null;
    }

    /* renamed from: c */
    public final C16691g mo79594c(int i, C15938c cVar, C15904b0 b0Var, int i2, int i3, int i4) {
        C13706o.m87929f(b0Var, "request");
        return new C16691g(this.f67582b, this.f67583c, i, cVar, b0Var, i2, i3, i4);
    }

    public C15917e call() {
        return this.f67582b;
    }

    /* renamed from: e */
    public final C15942e mo79595e() {
        return this.f67582b;
    }

    /* renamed from: f */
    public final int mo79596f() {
        return this.f67587g;
    }

    /* renamed from: g */
    public final C15938c mo79597g() {
        return this.f67585e;
    }

    /* renamed from: h */
    public final int mo79598h() {
        return this.f67588h;
    }

    /* renamed from: i */
    public final C15904b0 mo79599i() {
        return this.f67586f;
    }

    /* renamed from: j */
    public final int mo79600j() {
        return this.f67589i;
    }

    /* renamed from: k */
    public int mo79601k() {
        return this.f67588h;
    }

    /* renamed from: m */
    public C15904b0 mo76312m() {
        return this.f67586f;
    }
}
