package okhttp3;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, mo71668d2 = {"Lokhttp3/e;", "", "Lokhttp3/b0;", "m", "Lokhttp3/d0;", "execute", "Lokhttp3/f;", "responseCallback", "Lja/u;", "u1", "cancel", "", "I", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.e */
/* compiled from: Call.kt */
public interface C15917e extends Cloneable {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo71668d2 = {"Lokhttp3/e$a;", "", "Lokhttp3/b0;", "request", "Lokhttp3/e;", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.e$a */
    /* compiled from: Call.kt */
    public interface C15918a {
        /* renamed from: a */
        C15917e mo76008a(C15904b0 b0Var);
    }

    /* renamed from: I */
    boolean mo76003I();

    void cancel();

    C15915d0 execute() throws IOException;

    /* renamed from: m */
    C15904b0 mo76006m();

    /* renamed from: u1 */
    void mo76007u1(C15923f fVar);
}
