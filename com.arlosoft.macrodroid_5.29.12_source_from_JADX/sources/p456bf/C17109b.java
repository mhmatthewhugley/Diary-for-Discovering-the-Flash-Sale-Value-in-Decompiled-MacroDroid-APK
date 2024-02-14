package p456bf;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.C15907c0;
import okhttp3.C15995x;
import p226cd.C11179b;
import retrofit2.C17246f;

/* renamed from: bf.b */
/* compiled from: GsonRequestBodyConverter */
final class C17109b<T> implements C17246f<T, C15907c0> {

    /* renamed from: c */
    private static final C15995x f68687c = C15995x.m96395e("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f68688d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Gson f68689a;

    /* renamed from: b */
    private final TypeAdapter<T> f68690b;

    C17109b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f68689a = gson;
        this.f68690b = typeAdapter;
    }

    /* renamed from: b */
    public C15907c0 mo80387a(T t) throws IOException {
        C11179b bVar = new C11179b();
        JsonWriter q = this.f68689a.mo63982q(new OutputStreamWriter(bVar.mo62454s(), f68688d));
        this.f68690b.mo40901e(q, t);
        q.close();
        return C15907c0.m95942c(f68687c, bVar.mo62415S1());
    }
}
