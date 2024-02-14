package p373qd;

import java.io.IOException;
import org.jsoup.UncheckedIOException;
import p373qd.C16288f;

/* renamed from: qd.c */
/* compiled from: CDataNode */
public class C16285c extends C16308p {
    public C16285c(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo78813C(Appendable appendable, int i, C16288f.C16289a aVar) throws IOException {
        appendable.append("<![CDATA[").append(mo78923a0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo78814D(Appendable appendable, int i, C16288f.C16289a aVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* renamed from: d0 */
    public C16285c mo78818n() {
        return (C16285c) super.mo78818n();
    }

    /* renamed from: y */
    public String mo78819y() {
        return "#cdata";
    }
}
