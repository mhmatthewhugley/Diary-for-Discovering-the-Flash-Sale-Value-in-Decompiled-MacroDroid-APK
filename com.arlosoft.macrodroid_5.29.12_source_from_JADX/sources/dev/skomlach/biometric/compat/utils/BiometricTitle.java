package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import androidx.biometric.C0265R;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.biometric.compat.utils.notification.BiometricNotificationManager;
import dev.skomlach.common.misc.C12120d;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/BiometricTitle;", "", "()V", "getFromSystemSubtitle", "", "context", "Landroid/content/Context;", "alias", "getFromSystemTitle", "getRelevantTitle", "types", "", "Ldev/skomlach/biometric/compat/BiometricType;", "getSystemTitle", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricTitle.kt */
public final class BiometricTitle {
    public static final BiometricTitle INSTANCE = new BiometricTitle();

    private BiometricTitle() {
    }

    private final String getFromSystemSubtitle(Context context, String str) {
        Field field;
        boolean isAccessible;
        try {
            Field[] declaredFields = Class.forName("com.android.internal.R$string").getDeclaredFields();
            C13706o.m87928e(declaredFields, "fields");
            int length = declaredFields.length;
            for (int i = 0; i < length; i++) {
                field = declaredFields[i];
                String name = field.getName();
                if (name.equals(str + "_dialog_default_subtitle")) {
                    boolean z = true;
                    BiometricLoggerImpl.INSTANCE.mo68217d("BiometricTitle", field.getName());
                    isAccessible = field.isAccessible();
                    if (!isAccessible) {
                        field.setAccessible(true);
                    }
                    Object obj = field.get((Object) null);
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Int");
                    String string = context.getString(((Integer) obj).intValue());
                    C13706o.m87928e(string, "context.getString(field[null] as Int)");
                    if (string.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        if (!isAccessible) {
                            field.setAccessible(false);
                        }
                        return string;
                    }
                    throw new RuntimeException("String is empty");
                }
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
        return null;
    }

    private final String getFromSystemTitle(Context context, String str) {
        Field field;
        boolean isAccessible;
        try {
            Field[] declaredFields = Class.forName("com.android.internal.R$string").getDeclaredFields();
            C13706o.m87928e(declaredFields, "fields");
            int length = declaredFields.length;
            for (int i = 0; i < length; i++) {
                field = declaredFields[i];
                String name = field.getName();
                if (name.equals(str + "_dialog_default_title")) {
                    boolean z = true;
                    BiometricLoggerImpl.INSTANCE.mo68217d("BiometricTitle", field.getName());
                    isAccessible = field.isAccessible();
                    if (!isAccessible) {
                        field.setAccessible(true);
                    }
                    Object obj = field.get((Object) null);
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Int");
                    String string = context.getString(((Integer) obj).intValue());
                    C13706o.m87928e(string, "context.getString(field[null] as Int)");
                    if (string.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        if (!isAccessible) {
                            field.setAccessible(false);
                        }
                        return string;
                    }
                    throw new RuntimeException("String is empty");
                }
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
        return null;
    }

    private final String getSystemTitle(Context context, String str) {
        String fromSystemTitle = getFromSystemTitle(context, str);
        return fromSystemTitle == null ? getFromSystemSubtitle(context, str) : fromSystemTitle;
    }

    public final String getRelevantTitle(Context context, Set<? extends BiometricType> set) {
        String systemTitle;
        C13706o.m87929f(context, "context");
        C13706o.m87929f(set, "types");
        Set J0 = C13566b0.m87406J0(set);
        J0.remove(BiometricType.BIOMETRIC_ANY);
        boolean z = true;
        if (J0.size() != 1 || !J0.contains(BiometricType.BIOMETRIC_FACE)) {
            if (J0.size() == 1 && J0.contains(BiometricType.BIOMETRIC_IRIS)) {
                String systemTitle2 = getSystemTitle(context, "iris");
                if (systemTitle2 != null) {
                    return systemTitle2;
                }
            } else if (J0.size() == 1 && J0.contains(BiometricType.BIOMETRIC_FINGERPRINT)) {
                String systemTitle3 = getSystemTitle(context, "fingerprint");
                if (systemTitle3 != null) {
                    return systemTitle3;
                }
                String string = context.getString(C0265R.string.fingerprint_prompt_message);
                C13706o.m87928e(string, "context\n                …ngerprint_prompt_message)");
                return string;
            } else if (J0.size() == 1 && J0.contains(BiometricType.BIOMETRIC_VOICE) && (systemTitle = getSystemTitle(context, "voice")) != null) {
                return systemTitle;
            }
            try {
                if (C12120d.f58384a.mo68316c()) {
                    BiometricManager biometricManager = (BiometricManager) context.getSystemService(BiometricManager.class);
                    if (biometricManager == null) {
                        biometricManager = (BiometricManager) context.getSystemService(BiometricNotificationManager.CHANNEL_ID);
                    }
                    CharSequence charSequence = null;
                    BiometricManager.Strings strings = biometricManager != null ? biometricManager.getStrings(255) : null;
                    if (strings != null) {
                        charSequence = strings.getPromptMessage();
                    }
                    if (charSequence != null) {
                        if (charSequence.length() != 0) {
                            z = false;
                        }
                    }
                    if (!z) {
                        return charSequence.toString();
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
            String systemTitle4 = getSystemTitle(context, BiometricNotificationManager.CHANNEL_ID);
            if (systemTitle4 != null) {
                return systemTitle4;
            }
            String string2 = context.getString(C0265R.string.biometric_prompt_message);
            C13706o.m87928e(string2, "context\n            .get…biometric_prompt_message)");
            return string2;
        }
        String systemTitle5 = getSystemTitle(context, "face");
        if (systemTitle5 != null) {
            return systemTitle5;
        }
        String string3 = context.getString(C0265R.string.face_prompt_message);
        C13706o.m87928e(string3, "context\n                …ring.face_prompt_message)");
        return string3;
    }
}
