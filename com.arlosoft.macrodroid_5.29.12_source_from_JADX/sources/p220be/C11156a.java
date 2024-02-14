package p220be;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p227ce.C11216a;
import p227ce.C11218c;
import p400td.C16622a;

/* renamed from: be.a */
/* compiled from: ArgumentsProcessor */
public class C11156a {
    /* renamed from: a */
    public static List<C16622a> m74907a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj == null || !obj.getClass().isArray()) {
                arrayList.add(new C11218c(obj));
            } else {
                arrayList.add(new C11216a(obj));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Object[] m74908b(C11157b bVar, Object[] objArr) {
        int length = bVar.mo62341a().length;
        if (objArr != null && objArr.length > length) {
            objArr = Arrays.copyOf(objArr, length);
        }
        return m74909c(bVar.mo62343c(), objArr);
    }

    /* renamed from: c */
    private static Object[] m74909c(boolean z, Object[] objArr) {
        if (!z || m74910d(objArr) || (objArr[objArr.length - 1] != null && !objArr[objArr.length - 1].getClass().isArray())) {
            return objArr == null ? new Object[0] : objArr;
        }
        int length = objArr.length - 1;
        Object[] e = objArr[length] == null ? new Object[]{null} : C11216a.m75268e(objArr[length]);
        int length2 = e.length;
        Object[] objArr2 = new Object[(length + length2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        System.arraycopy(e, 0, objArr2, length, length2);
        return objArr2;
    }

    /* renamed from: d */
    private static <T> boolean m74910d(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }
}
