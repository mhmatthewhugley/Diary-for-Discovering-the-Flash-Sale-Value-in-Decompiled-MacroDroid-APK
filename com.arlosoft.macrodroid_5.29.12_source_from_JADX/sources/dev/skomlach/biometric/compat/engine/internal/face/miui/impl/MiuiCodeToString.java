package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.content.Context;
import android.content.res.Resources;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiCodeToString;", "", "()V", "context", "Landroid/content/Context;", "stringArrayFields", "", "Ljava/lang/reflect/Field;", "[Ljava/lang/reflect/Field;", "stringFields", "getAcquiredString", "", "acquireInfo", "", "vendorCode", "getErrorString", "errMsg", "getString", "s", "getStringArray", "(Ljava/lang/String;)[Ljava/lang/String;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: MiuiCodeToString.kt */
public final class MiuiCodeToString {
    public static final MiuiCodeToString INSTANCE = new MiuiCodeToString();
    private static final Context context = C12104a.f58372a.mo68283g();
    private static Field[] stringArrayFields;
    private static Field[] stringFields;

    static {
        try {
            stringFields = Class.forName("com.android.internal.R$string").getDeclaredFields();
            stringArrayFields = Class.forName("com.android.internal.R$array").getDeclaredFields();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private MiuiCodeToString() {
    }

    private final String getString(String str) {
        Field field;
        boolean isAccessible;
        Field[] fieldArr = stringFields;
        if (fieldArr != null) {
            try {
                int length = fieldArr.length;
                for (int i = 0; i < length; i++) {
                    field = fieldArr[i];
                    if (C13706o.m87924a(str, field.getName())) {
                        isAccessible = field.isAccessible();
                        if (!isAccessible) {
                            field.setAccessible(true);
                        }
                        Resources resources = context.getResources();
                        Object obj = field.get((Object) null);
                        C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Int");
                        String string = resources.getString(((Integer) obj).intValue());
                        if (!isAccessible) {
                            field.setAccessible(false);
                        }
                        return string;
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
        return null;
    }

    private final String[] getStringArray(String str) {
        Field field;
        boolean isAccessible;
        Field[] fieldArr = stringArrayFields;
        if (fieldArr != null) {
            try {
                int length = fieldArr.length;
                for (int i = 0; i < length; i++) {
                    field = fieldArr[i];
                    if (C13706o.m87924a(str, field.getName())) {
                        isAccessible = field.isAccessible();
                        if (!isAccessible) {
                            field.setAccessible(true);
                        }
                        Resources resources = context.getResources();
                        Object obj = field.get((Object) null);
                        C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Int");
                        String[] stringArray = resources.getStringArray(((Integer) obj).intValue());
                        if (!isAccessible) {
                            field.setAccessible(false);
                        }
                        return stringArray;
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
        return null;
    }

    public final String getAcquiredString(int i, int i2) {
        switch (i) {
            case 0:
                return null;
            case 1:
                return getString("face_acquired_insufficient");
            case 2:
                return getString("face_acquired_too_bright");
            case 3:
                return getString("face_acquired_too_dark");
            case 4:
                return getString("face_acquired_too_close");
            case 5:
                return getString("face_acquired_too_far");
            case 6:
                return getString("face_acquired_too_high");
            case 7:
                return getString("face_acquired_too_low");
            case 8:
                return getString("face_acquired_too_right");
            case 9:
                return getString("face_acquired_too_left");
            case 10:
                return getString("face_acquired_poor_gaze");
            case 11:
                return getString("face_acquired_not_detected");
            case 12:
                return getString("face_acquired_too_much_motion");
            case 13:
                return getString("face_acquired_recalibrate");
            case 14:
                return getString("face_acquired_too_different");
            case 15:
                return getString("face_acquired_too_similar");
            case 16:
                return getString("face_acquired_pan_too_extreme");
            case 17:
                return getString("face_acquired_tilt_too_extreme");
            case 18:
                return getString("face_acquired_roll_too_extreme");
            case 19:
                return getString("face_acquired_obscured");
            case 20:
                return null;
            case 21:
                return getString("face_acquired_sensor_dirty");
            case 22:
                String[] stringArray = getStringArray("face_acquired_vendor");
                if (stringArray != null && i2 < stringArray.length) {
                    return stringArray[i2];
                }
        }
        BiometricLoggerImpl.INSTANCE.mo68217d("Invalid acquired message: " + i + ", " + i2);
        return null;
    }

    public final String getErrorString(int i, int i2) {
        switch (i) {
            case 1:
                return getString("face_error_hw_not_available");
            case 2:
                return getString("face_error_unable_to_process");
            case 3:
                return getString("face_error_timeout");
            case 4:
                return getString("face_error_no_space");
            case 5:
                return getString("face_error_canceled");
            case 7:
                return getString("face_error_lockout");
            case 8:
                String[] stringArray = getStringArray("face_error_vendor");
                if (stringArray != null && i2 < stringArray.length) {
                    return stringArray[i2];
                }
            case 9:
                return getString("face_error_lockout_permanent");
            case 10:
                return getString("face_error_user_canceled");
            case 11:
                return getString("face_error_not_enrolled");
            case 12:
                return getString("face_error_hw_not_present");
        }
        BiometricLoggerImpl.INSTANCE.mo68217d("Invalid error message: " + i + ", " + i2);
        return null;
    }
}
