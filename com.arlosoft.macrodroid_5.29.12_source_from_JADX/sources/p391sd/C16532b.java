package p391sd;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.p353io.IOUtils;
import p364pd.C16171b;
import p373qd.C16293h;

/* renamed from: sd.b */
/* compiled from: Elements */
public class C16532b extends ArrayList<C16293h> {
    public C16532b() {
    }

    /* renamed from: c */
    public C16532b clone() {
        C16532b bVar = new C16532b(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            bVar.add(((C16293h) it.next()).mo78818n());
        }
        return bVar;
    }

    /* renamed from: d */
    public String mo79331d() {
        StringBuilder b = C16171b.m97071b();
        Iterator it = iterator();
        while (it.hasNext()) {
            C16293h hVar = (C16293h) it.next();
            if (b.length() != 0) {
                b.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            b.append(hVar.mo78830A());
        }
        return C16171b.m97079j(b);
    }

    /* renamed from: f */
    public String mo79332f() {
        StringBuilder b = C16171b.m97071b();
        Iterator it = iterator();
        while (it.hasNext()) {
            C16293h hVar = (C16293h) it.next();
            if (b.length() != 0) {
                b.append(" ");
            }
            b.append(hVar.mo78860I0());
        }
        return C16171b.m97079j(b);
    }

    public String toString() {
        return mo79331d();
    }

    public C16532b(int i) {
        super(i);
    }
}
