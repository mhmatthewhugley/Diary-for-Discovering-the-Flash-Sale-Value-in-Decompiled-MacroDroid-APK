package retrofit2;

import java.util.Objects;

public class HttpException extends RuntimeException {

    /* renamed from: a */
    private final transient C17300s<?> f68789a;
    private final int code;
    private final String message;

    public HttpException(C17300s<?> sVar) {
        super(m100815b(sVar));
        this.code = sVar.mo80593b();
        this.message = sVar.mo80596f();
        this.f68789a = sVar;
    }

    /* renamed from: b */
    private static String m100815b(C17300s<?> sVar) {
        Objects.requireNonNull(sVar, "response == null");
        return "HTTP " + sVar.mo80593b() + " " + sVar.mo80596f();
    }

    /* renamed from: a */
    public int mo80527a() {
        return this.code;
    }

    /* renamed from: c */
    public C17300s<?> mo80528c() {
        return this.f68789a;
    }
}
