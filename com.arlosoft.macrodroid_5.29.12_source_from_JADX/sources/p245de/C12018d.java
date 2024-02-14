package p245de;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p227ce.C11217b;
import p265fe.C12261a;
import p400td.C16622a;

/* renamed from: de.d */
/* compiled from: MatchersPrinter */
public class C12018d {
    /* renamed from: a */
    private Iterator<C12016b> m82466a(List<C16622a> list, C12261a aVar) {
        LinkedList linkedList = new LinkedList();
        int i = 0;
        for (C16622a next : list) {
            if (!(next instanceof C11217b) || !aVar.mo68587a(i)) {
                linkedList.add(new C12016b(C12017c.m82465a(next)));
            } else {
                linkedList.add(new C12016b(((C11217b) next).mo62571a()));
            }
            i++;
        }
        return linkedList.iterator();
    }

    /* renamed from: b */
    public String mo67469b(List<C16622a> list, C12261a aVar) {
        return C12019e.m82473e("(\n    ", ",\n    ", "\n);", m82466a(list, aVar));
    }

    /* renamed from: c */
    public String mo67470c(List<C16622a> list, C12261a aVar) {
        return C12019e.m82473e("(", ", ", ");", m82466a(list, aVar));
    }
}
