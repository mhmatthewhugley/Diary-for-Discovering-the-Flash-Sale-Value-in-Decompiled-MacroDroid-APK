package p373qd;

import java.io.IOException;
import p364pd.C16171b;
import p373qd.C16288f;

/* renamed from: qd.p */
/* compiled from: TextNode */
public class C16308p extends C16302l {
    public C16308p(String str) {
        this.f66694f = str;
    }

    /* renamed from: c0 */
    static boolean m97913c0(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo78813C(Appendable appendable, int i, C16288f.C16289a aVar) throws IOException {
        boolean z;
        boolean z2;
        boolean l = aVar.mo78850l();
        C16303m mVar = this.f66696a;
        C16293h hVar = mVar instanceof C16293h ? (C16293h) mVar : null;
        boolean z3 = true;
        boolean z4 = l && !C16293h.m97778B0(mVar);
        if (z4) {
            boolean z5 = (this.f66697c == 0 && hVar != null && hVar.mo78858G0().mo79207d()) || (this.f66696a instanceof C16288f);
            boolean z6 = mo78915x() == null && hVar != null && hVar.mo78858G0().mo79207d();
            C16303m x = mo78915x();
            if ((!(x instanceof C16293h) || !((C16293h) x).mo78856F0(aVar)) && (!(x instanceof C16308p) || !((C16308p) x).mo78924b0())) {
                z3 = false;
            }
            if (!z3 || !mo78924b0()) {
                if ((this.f66697c == 0 && hVar != null && hVar.mo78858G0().mo79204b() && !mo78924b0()) || (aVar.mo78848h() && mo78905U().size() > 0 && !mo78924b0())) {
                    mo78914v(appendable, i, aVar);
                }
                z2 = z5;
                z = z6;
            } else {
                return;
            }
        } else {
            z2 = false;
            z = false;
        }
        C16296i.m97832e(appendable, mo78893V(), aVar, false, z4, z2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo78814D(Appendable appendable, int i, C16288f.C16289a aVar) {
    }

    /* renamed from: Z */
    public C16308p mo78818n() {
        return (C16308p) super.clone();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ String mo78821a(String str) {
        return super.mo78821a(str);
    }

    /* renamed from: a0 */
    public String mo78923a0() {
        return mo78893V();
    }

    /* renamed from: b0 */
    public boolean mo78924b0() {
        return C16171b.m97075f(mo78893V());
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ String mo78823c(String str) {
        return super.mo78823c(str);
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ String mo78824f() {
        return super.mo78824f();
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ int mo78825k() {
        return super.mo78825k();
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ C16303m mo78826q() {
        return super.mo78826q();
    }

    public String toString() {
        return mo78830A();
    }

    /* renamed from: y */
    public String mo78819y() {
        return "#text";
    }
}
