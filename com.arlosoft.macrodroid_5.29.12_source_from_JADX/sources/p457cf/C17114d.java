package p457cf;

import java.io.IOException;
import okhttp3.C15919e0;
import retrofit2.C17246f;

/* renamed from: cf.d */
/* compiled from: ScalarResponseBodyConverters */
final class C17114d implements C17246f<C15919e0, Character> {

    /* renamed from: a */
    static final C17114d f68697a = new C17114d();

    C17114d() {
    }

    /* renamed from: b */
    public Character mo80387a(C15919e0 e0Var) throws IOException {
        String string = e0Var.string();
        if (string.length() == 1) {
            return Character.valueOf(string.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + string.length());
    }
}
