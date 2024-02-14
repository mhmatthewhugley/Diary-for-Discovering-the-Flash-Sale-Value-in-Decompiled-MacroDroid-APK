package p282he;

import java.util.Enumeration;
import java.util.LinkedList;

/* renamed from: he.a */
/* compiled from: Iterables */
public class C12441a {
    /* renamed from: a */
    public static <T> Iterable<T> m83375a(Enumeration<T> enumeration) {
        LinkedList linkedList = new LinkedList();
        while (enumeration.hasMoreElements()) {
            linkedList.add(enumeration.nextElement());
        }
        return linkedList;
    }
}
