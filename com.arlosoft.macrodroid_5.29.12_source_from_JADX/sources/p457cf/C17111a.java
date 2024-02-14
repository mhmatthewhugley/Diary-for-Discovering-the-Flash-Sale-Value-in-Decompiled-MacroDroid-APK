package p457cf;

import java.io.IOException;
import okhttp3.C15907c0;
import okhttp3.C15995x;
import retrofit2.C17246f;

/* renamed from: cf.a */
/* compiled from: ScalarRequestBodyConverter */
final class C17111a<T> implements C17246f<T, C15907c0> {

    /* renamed from: a */
    static final C17111a<Object> f68693a = new C17111a<>();

    /* renamed from: b */
    private static final C15995x f68694b = C15995x.m96396g("text/plain; charset=UTF-8");

    private C17111a() {
    }

    /* renamed from: b */
    public C15907c0 mo80387a(T t) throws IOException {
        return C15907c0.m95943d(f68694b, String.valueOf(t));
    }
}
