package p456bf;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.C15919e0;
import retrofit2.C17246f;

/* renamed from: bf.c */
/* compiled from: GsonResponseBodyConverter */
final class C17110c<T> implements C17246f<C15919e0, T> {

    /* renamed from: a */
    private final Gson f68691a;

    /* renamed from: b */
    private final TypeAdapter<T> f68692b;

    C17110c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f68691a = gson;
        this.f68692b = typeAdapter;
    }

    /* renamed from: b */
    public T mo80387a(C15919e0 e0Var) throws IOException {
        JsonReader p = this.f68691a.mo63981p(e0Var.charStream());
        try {
            T c = this.f68692b.mo40900c(p);
            if (p.peek() == JsonToken.END_DOCUMENT) {
                return c;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            e0Var.close();
        }
    }
}
