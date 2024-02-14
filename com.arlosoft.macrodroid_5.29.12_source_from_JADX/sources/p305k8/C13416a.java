package p305k8;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Set;
import p315l8.C15601a;

/* renamed from: k8.a */
/* compiled from: BundleComparer */
public final class C13416a {
    /* renamed from: a */
    public static boolean m85852a(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.equals(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj == null && obj2 != null) || (obj != null && obj2 == null)) {
                return false;
            }
            if (obj != null || obj2 != null) {
                if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle)) {
                    Class<?> cls = obj.getClass();
                    Class<?> cls2 = obj2.getClass();
                    if (cls.isArray() && cls2.isArray()) {
                        Class<?> componentType = cls.getComponentType();
                        if (componentType.equals(cls2.getComponentType())) {
                            if (componentType.isPrimitive()) {
                                if (((Boolean) C15601a.m94819b(Arrays.class, "equals", new Class[]{cls, cls}, new Object[]{obj, obj2})).booleanValue()) {
                                    C15601a.m94819b(Arrays.class, "toString", new Class[]{cls}, new Object[]{obj});
                                    C15601a.m94819b(Arrays.class, "toString", new Class[]{cls}, new Object[]{obj});
                                } else {
                                    C15601a.m94819b(Arrays.class, "toString", new Class[]{cls}, new Object[]{obj});
                                    C15601a.m94819b(Arrays.class, "toString", new Class[]{cls}, new Object[]{obj});
                                    return false;
                                }
                            } else {
                                Class<Object[]> cls3 = Object[].class;
                                if (((Boolean) C15601a.m94819b(Arrays.class, "deepEquals", new Class[]{cls3, cls3}, new Object[]{obj, obj2})).booleanValue()) {
                                    C15601a.m94819b(Arrays.class, "toString", new Class[]{cls3}, new Object[]{obj});
                                    C15601a.m94819b(Arrays.class, "toString", new Class[]{cls3}, new Object[]{obj});
                                } else {
                                    C15601a.m94819b(Arrays.class, "toString", new Class[]{cls3}, new Object[]{obj});
                                    C15601a.m94819b(Arrays.class, "toString", new Class[]{cls3}, new Object[]{obj});
                                }
                            }
                        }
                        return false;
                    } else if (!obj.equals(obj2) || !obj2.equals(obj)) {
                        return false;
                    }
                } else if (!m85852a((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
