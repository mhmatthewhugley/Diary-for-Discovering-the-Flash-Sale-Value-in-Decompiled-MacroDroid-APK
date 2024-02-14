package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Strings {
    private Strings() {
    }

    /* renamed from: a */
    public static String m5471a(String str) {
        return Platform.m5364b(str);
    }

    /* renamed from: b */
    public static boolean m5472b(String str) {
        return Platform.m5367e(str);
    }

    /* renamed from: c */
    public static String m5473c(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = m5474d(objArr[i2]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append(valueOf, i3, indexOf);
            sb.append(objArr[i]);
            int i4 = i + 1;
            i3 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i5 = i + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static String m5474d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb2);
            logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), e);
            String name2 = e.getClass().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
