package p285i8;

import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.Locale;
import p276h8.C12406a;
import p305k8.C13418c;
import p315l8.C15601a;

/* renamed from: i8.a */
/* compiled from: Lumberjack */
public final class C12447a {
    @NonNull

    /* renamed from: a */
    private static final Class<?>[] f59234a;
    @NonNull

    /* renamed from: b */
    private static volatile String f59235b = "Lumberjack";

    /* renamed from: c */
    private static volatile boolean f59236c = false;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r0
            r2 = 1
            r1[r2] = r0
            f59234a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285i8.C12447a.<clinit>():void");
    }

    /* renamed from: a */
    public static void m83384a(@NonNull String str, @Nullable Object... objArr) {
        m83392i(0, str, objArr);
    }

    @NonNull
    /* renamed from: b */
    private static String m83385b(@NonNull Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.getComponentType().isPrimitive()) {
            return (String) C15601a.m94819b(Arrays.class, "toString", new Class[]{cls}, new Object[]{obj});
        }
        return (String) C15601a.m94819b(Arrays.class, "deepToString", new Class[]{Object[].class}, new Object[]{obj});
    }

    @NonNull
    /* renamed from: c */
    private static String m83386c(@NonNull Bundle bundle) {
        return C13418c.m85854a(bundle);
    }

    @NonNull
    /* renamed from: d */
    private static String m83387d(@NonNull Cursor cursor) {
        return DatabaseUtils.dumpCursorToString(cursor);
    }

    @NonNull
    /* renamed from: e */
    private static String m83388e(@NonNull Throwable th) {
        return String.format(Locale.US, "%n%s", new Object[]{Log.getStackTraceString(th)});
    }

    @NonNull
    /* renamed from: f */
    private static String m83389f(@NonNull Intent intent) {
        return String.format(Locale.US, "%s with extras %s", new Object[]{intent, C13418c.m85854a(intent.getExtras())});
    }

    @NonNull
    /* renamed from: g */
    public static String m83390g(@NonNull String str, @Nullable Object... objArr) {
        C12406a.m83260d(str, NotificationCompat.CATEGORY_MESSAGE);
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = m83391h(objArr[i]);
            }
        }
        return String.format(Locale.US, str, objArr);
    }

    @Nullable
    /* renamed from: h */
    private static Object m83391h(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Throwable) {
            return m83388e((Throwable) obj);
        }
        if (obj instanceof Intent) {
            return m83389f((Intent) obj);
        }
        if (obj instanceof Bundle) {
            return m83386c((Bundle) obj);
        }
        if (obj instanceof Cursor) {
            return m83387d((Cursor) obj);
        }
        return obj.getClass().isArray() ? m83385b(obj) : obj;
    }

    /* renamed from: i */
    private static void m83392i(int i, String str, @Nullable Object[] objArr) {
        String g = m83390g(str, objArr);
        if (f59236c) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String className = stackTrace[2].getClassName();
            String methodName = stackTrace[2].getMethodName();
            g = String.format(Locale.US, "%-30s%s.%s(): %s", new Object[]{Thread.currentThread().getName(), className, methodName, g});
        }
        if (i != 0) {
            switch (i) {
                case 2:
                case 3:
                    return;
                case 4:
                    Log.i(f59235b, g);
                    return;
                case 5:
                    Log.w(f59235b, g);
                    return;
                case 6:
                    Log.e(f59235b, g);
                    return;
                case 7:
                    Log.wtf(f59235b, g);
                    return;
                default:
                    throw new AssertionError();
            }
        } else {
            C15601a.m94819b(Log.class, "i", f59234a, new Object[]{f59235b, g});
        }
    }
}
