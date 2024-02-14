package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15904b0;
import okhttp3.C15915d0;
import okhttp3.C15993w;
import p408uc.C16691g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo71668d2 = {"Lokhttp3/internal/connection/a;", "Lokhttp3/w;", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.a */
/* compiled from: ConnectInterceptor.kt */
public final class C15936a implements C15993w {

    /* renamed from: a */
    public static final C15936a f65634a = new C15936a();

    private C15936a() {
    }

    public C15915d0 intercept(C15993w.C15994a aVar) throws IOException {
        C13706o.m87929f(aVar, "chain");
        C16691g gVar = (C16691g) aVar;
        return C16691g.m99159d(gVar, 0, gVar.mo79595e().mo76108t(gVar), (C15904b0) null, 0, 0, 0, 61, (Object) null).mo76309a(gVar.mo79599i());
    }
}
