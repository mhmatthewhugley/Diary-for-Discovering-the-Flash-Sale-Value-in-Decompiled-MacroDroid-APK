package p373qd;

import java.io.IOException;
import p351od.C15852c;
import p364pd.C16171b;
import p373qd.C16288f;

/* renamed from: qd.g */
/* compiled from: DocumentType */
public class C16292g extends C16302l {
    public C16292g(String str, String str2, String str3) {
        C15852c.m95479h(str);
        C15852c.m95479h(str2);
        C15852c.m95479h(str3);
        mo78853d("name", str);
        mo78853d("publicId", str2);
        mo78853d("systemId", str3);
        m97767b0();
    }

    /* renamed from: Z */
    private boolean m97766Z(String str) {
        return !C16171b.m97075f(mo78823c(str));
    }

    /* renamed from: b0 */
    private void m97767b0() {
        if (m97766Z("publicId")) {
            mo78853d("pubSysKey", "PUBLIC");
        } else if (m97766Z("systemId")) {
            mo78853d("pubSysKey", "SYSTEM");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo78813C(Appendable appendable, int i, C16288f.C16289a aVar) throws IOException {
        if (this.f66697c > 0 && aVar.mo78850l()) {
            appendable.append(10);
        }
        if (aVar.mo78851n() != C16288f.C16289a.C16290a.html || m97766Z("publicId") || m97766Z("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (m97766Z("name")) {
            appendable.append(" ").append(mo78823c("name"));
        }
        if (m97766Z("pubSysKey")) {
            appendable.append(" ").append(mo78823c("pubSysKey"));
        }
        if (m97766Z("publicId")) {
            appendable.append(" \"").append(mo78823c("publicId")).append('\"');
        }
        if (m97766Z("systemId")) {
            appendable.append(" \"").append(mo78823c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo78814D(Appendable appendable, int i, C16288f.C16289a aVar) {
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ String mo78821a(String str) {
        return super.mo78821a(str);
    }

    /* renamed from: a0 */
    public void mo78852a0(String str) {
        if (str != null) {
            mo78853d("pubSysKey", str);
        }
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ String mo78823c(String str) {
        return super.mo78823c(str);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C16303m mo78853d(String str, String str2) {
        return super.mo78853d(str, str2);
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

    /* renamed from: y */
    public String mo78819y() {
        return "#doctype";
    }
}
