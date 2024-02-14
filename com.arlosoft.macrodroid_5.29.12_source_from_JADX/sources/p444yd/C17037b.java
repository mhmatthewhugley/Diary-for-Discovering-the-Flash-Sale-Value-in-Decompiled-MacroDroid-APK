package p444yd;

import java.util.Arrays;

/* renamed from: yd.b */
/* compiled from: SuspendMethod */
public class C17037b {
    /* renamed from: a */
    public static Class<?>[] m100341a(Class<?>[] clsArr) {
        int length = clsArr.length;
        if (length <= 0) {
            return clsArr;
        }
        int i = length - 1;
        return clsArr[i].getName().equals("kotlin.coroutines.experimental.Continuation") ? (Class[]) Arrays.copyOf(clsArr, i) : clsArr;
    }
}
