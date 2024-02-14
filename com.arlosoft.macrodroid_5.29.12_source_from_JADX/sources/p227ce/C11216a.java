package p227ce;

import java.lang.reflect.Array;

/* renamed from: ce.a */
/* compiled from: ArrayEquals */
public class C11216a extends C11218c {
    public C11216a(Object obj) {
        super(obj);
    }

    /* renamed from: d */
    private String m75267d(Object[] objArr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < objArr.length; i++) {
            sb.append(new C11218c(objArr[i]).toString());
            if (i != objArr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: e */
    public static Object[] m75268e(Object obj) {
        if (obj instanceof Object[]) {
            return (Object[]) obj;
        }
        Object[] objArr = new Object[Array.getLength(obj)];
        for (int i = 0; i < Array.getLength(obj); i++) {
            objArr[i] = Array.get(obj, i);
        }
        return objArr;
    }

    public String toString() {
        if (mo62572c() == null || !mo62572c().getClass().isArray()) {
            return super.toString();
        }
        return m75267d(m75268e(mo62572c()));
    }
}
