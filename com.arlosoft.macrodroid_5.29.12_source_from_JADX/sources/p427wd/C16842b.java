package p427wd;

import java.io.Serializable;
import p409ud.C16698a;
import p409ud.C16699b;

/* renamed from: wd.b */
/* compiled from: GlobalConfiguration */
public class C16842b implements C16699b, Serializable {

    /* renamed from: a */
    private static final ThreadLocal<C16699b> f68012a = new ThreadLocal<>();
    private static final long serialVersionUID = -2860353062105505938L;

    public C16842b() {
        ThreadLocal<C16699b> threadLocal = f68012a;
        if (threadLocal.get() == null) {
            threadLocal.set(m99825b());
        }
    }

    /* renamed from: b */
    private C16699b m99825b() {
        C16698a aVar = new C16698a();
        C16699b a = new C16841a().mo79957a();
        return a != null ? a : aVar;
    }

    /* renamed from: a */
    public boolean mo79606a() {
        return f68012a.get().mo79606a();
    }
}
