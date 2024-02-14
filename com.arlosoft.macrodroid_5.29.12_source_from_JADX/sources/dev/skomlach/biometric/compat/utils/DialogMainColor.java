package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import dev.skomlach.biometric.compat.C12021R;
import dev.skomlach.biometric.compat.utils.monet.Extension_ColorKt;
import dev.skomlach.biometric.compat.utils.monet.SystemColorScheme;
import dev.skomlach.biometric.compat.utils.monet.colors.Srgb;
import dev.skomlach.common.misc.C12120d;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/DialogMainColor;", "", "()V", "getColor", "", "context", "Landroid/content/Context;", "isNightMode", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: DialogMainColor.kt */
public final class DialogMainColor {
    public static final DialogMainColor INSTANCE = new DialogMainColor();

    private DialogMainColor() {
    }

    @ColorInt
    public final int getColor(Context context, boolean z) {
        C13706o.m87929f(context, "context");
        if (C12120d.f58384a.mo68316c()) {
            SystemColorScheme systemColorScheme = new SystemColorScheme();
            if (z) {
                Srgb srgb = systemColorScheme.getNeutral1().get(Integer.valueOf(TypedValues.Custom.TYPE_INT));
                if (srgb != null) {
                    return Extension_ColorKt.toArgb(srgb);
                }
            } else {
                Srgb srgb2 = systemColorScheme.getNeutral1().get(50);
                if (srgb2 != null) {
                    return Extension_ColorKt.toArgb(srgb2);
                }
            }
        }
        if (z) {
            return ContextCompat.getColor(context, C12021R.C12022color.black);
        }
        return ContextCompat.getColor(context, C12021R.C12022color.material_grey_50);
    }
}
