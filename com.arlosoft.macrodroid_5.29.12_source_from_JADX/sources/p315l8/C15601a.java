package p315l8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: l8.a */
/* compiled from: Reflector */
public final class C15601a {
    /* renamed from: a */
    private static <T> T m94818a(Object obj, Class<?> cls, String str, String str2, Class<?>[] clsArr, Object... objArr) {
        if (cls == null) {
            if (obj != null) {
                try {
                    cls = obj.getClass();
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(e4);
                }
            } else {
                cls = Class.forName(str);
            }
        }
        return cls.getMethod(str2, clsArr).invoke(obj, objArr);
    }

    /* renamed from: b */
    public static <T> T m94819b(@NonNull Class<?> cls, @NonNull String str, @Nullable Class<?>[] clsArr, @Nullable Object[] objArr) {
        return m94818a((Object) null, cls, (String) null, str, clsArr, objArr);
    }
}
