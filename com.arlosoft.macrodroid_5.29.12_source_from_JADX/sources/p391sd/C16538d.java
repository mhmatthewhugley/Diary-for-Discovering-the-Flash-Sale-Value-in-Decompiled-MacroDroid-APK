package p391sd;

import p351od.C15852c;
import p373qd.C16303m;

/* renamed from: sd.d */
/* compiled from: NodeTraversor */
public class C16538d {
    /* renamed from: a */
    public static void m98664a(C16539e eVar, C16303m mVar) {
        C15852c.m95479h(eVar);
        C15852c.m95479h(mVar);
        C16303m mVar2 = mVar;
        int i = 0;
        while (mVar2 != null) {
            C16303m H = mVar2.mo78897H();
            int k = H != null ? H.mo78825k() : 0;
            C16303m x = mVar2.mo78915x();
            eVar.mo78886a(mVar2, i);
            if (H != null && !mVar2.mo78913u()) {
                if (k == H.mo78825k()) {
                    mVar2 = H.mo78909h(mVar2.mo78904T());
                } else if (x == null) {
                    i--;
                    mVar2 = H;
                } else {
                    mVar2 = x;
                }
            }
            if (mVar2.mo78825k() > 0) {
                mVar2 = mVar2.mo78909h(0);
                i++;
            } else {
                while (mVar2.mo78915x() == null && i > 0) {
                    eVar.mo78887b(mVar2, i);
                    mVar2 = mVar2.mo78897H();
                    i--;
                }
                eVar.mo78887b(mVar2, i);
                if (mVar2 != mVar) {
                    mVar2 = mVar2.mo78915x();
                } else {
                    return;
                }
            }
        }
    }
}
