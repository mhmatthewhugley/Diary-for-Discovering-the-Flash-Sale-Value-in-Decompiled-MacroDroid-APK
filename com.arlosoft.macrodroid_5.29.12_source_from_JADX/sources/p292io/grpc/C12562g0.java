package p292io.grpc;

import com.google.common.p206io.BaseEncoding;
import java.nio.charset.Charset;
import p292io.grpc.C12960q0;

/* renamed from: io.grpc.g0 */
/* compiled from: InternalMetadata */
public final class C12562g0 {

    /* renamed from: a */
    public static final Charset f59499a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final BaseEncoding f59500b = C12960q0.f60667e;

    /* renamed from: io.grpc.g0$a */
    /* compiled from: InternalMetadata */
    public interface C12563a<T> extends C12960q0.C12970j<T> {
    }

    /* renamed from: a */
    public static int m83775a(C12960q0 q0Var) {
        return q0Var.mo69765g();
    }

    /* renamed from: b */
    public static <T> C12960q0.C12967g<T> m83776b(String str, C12563a<T> aVar) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return C12960q0.C12967g.m85094g(str, z, aVar);
    }

    /* renamed from: c */
    public static C12960q0 m83777c(byte[]... bArr) {
        return new C12960q0(bArr);
    }

    /* renamed from: d */
    public static byte[][] m83778d(C12960q0 q0Var) {
        return q0Var.mo69769p();
    }
}
