package p360p9;

import java.util.List;
import java.util.logging.Logger;
import p292io.grpc.C12562g0;
import p292io.grpc.C12960q0;
import p292io.grpc.internal.C12716i2;
import p369q9.C16240d;

/* renamed from: p9.q */
/* compiled from: Utils */
class C16146q {

    /* renamed from: a */
    private static final Logger f66276a = Logger.getLogger(C16146q.class.getName());

    private C16146q() {
    }

    /* renamed from: a */
    public static C12960q0 m96964a(List<C16240d> list) {
        return C12562g0.m83777c(m96965b(list));
    }

    /* renamed from: b */
    private static byte[][] m96965b(List<C16240d> list) {
        byte[][] bArr = new byte[(list.size() * 2)][];
        int i = 0;
        for (C16240d next : list) {
            int i2 = i + 1;
            bArr[i] = next.f66561a.mo62488G();
            i = i2 + 1;
            bArr[i2] = next.f66562b.mo62488G();
        }
        return C12716i2.m84266e(bArr);
    }

    /* renamed from: c */
    public static C12960q0 m96966c(List<C16240d> list) {
        return C12562g0.m83777c(m96965b(list));
    }
}
