package p292io.grpc.okhttp.internal;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: io.grpc.okhttp.internal.i */
/* compiled from: Util */
public final class C12949i {

    /* renamed from: a */
    public static final byte[] f60642a = new byte[0];

    /* renamed from: b */
    public static final String[] f60643b = new String[0];

    /* renamed from: c */
    public static final Charset f60644c = Charset.forName("UTF-8");

    /* renamed from: a */
    public static <T> List<T> m85023a(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: b */
    private static <T> List<T> m85024b(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static <T> T[] m85025c(Class<T> cls, T[] tArr, T[] tArr2) {
        List b = m85024b(tArr, tArr2);
        return b.toArray((Object[]) Array.newInstance(cls, b.size()));
    }
}
