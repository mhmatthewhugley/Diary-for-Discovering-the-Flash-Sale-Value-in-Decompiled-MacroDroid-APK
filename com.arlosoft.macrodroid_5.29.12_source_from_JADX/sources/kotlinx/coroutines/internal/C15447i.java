package kotlinx.coroutines.internal;

import kotlin.Metadata;
import p297ja.C13329n;
import p297ja.C13332o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, mo71668d2 = {"", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.i */
/* compiled from: FastServiceLoader.kt */
public final class C15447i {

    /* renamed from: a */
    private static final boolean f64662a;

    static {
        Object obj;
        try {
            C13329n.C13330a aVar = C13329n.f61327a;
            obj = C13329n.m85676a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            obj = C13329n.m85676a(C13332o.m85684a(th));
        }
        f64662a = C13329n.m85681f(obj);
    }

    /* renamed from: a */
    public static final boolean m94402a() {
        return f64662a;
    }
}
