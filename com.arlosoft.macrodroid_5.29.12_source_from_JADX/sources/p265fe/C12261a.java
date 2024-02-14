package p265fe;

import java.util.LinkedList;
import java.util.List;
import p245de.C12018d;
import p273ge.C12363a;
import p301je.C13375a;
import p400td.C16622a;

/* renamed from: fe.a */
/* compiled from: PrintSettings */
public class C12261a {

    /* renamed from: a */
    private boolean f58895a;

    /* renamed from: b */
    private List<Integer> f58896b = new LinkedList();

    /* renamed from: a */
    public boolean mo68587a(int i) {
        return this.f58896b.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public boolean mo68588b() {
        return this.f58895a;
    }

    /* renamed from: c */
    public String mo68589c(List<C16622a> list, C13375a aVar) {
        C12018d dVar = new C12018d();
        String str = C12363a.m83121b(aVar.getMock()) + "." + aVar.getMethod().getName();
        String str2 = str + dVar.mo67470c(list, this);
        if (!mo68588b() && (list.isEmpty() || str2.length() <= 45)) {
            return str2;
        }
        return str + dVar.mo67469b(list, this);
    }
}
