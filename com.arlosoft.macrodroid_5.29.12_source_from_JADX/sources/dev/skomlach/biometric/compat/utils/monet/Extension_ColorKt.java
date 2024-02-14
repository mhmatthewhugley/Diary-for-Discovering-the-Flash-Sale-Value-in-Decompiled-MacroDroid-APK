package dev.skomlach.biometric.compat.utils.monet;

import dev.skomlach.biometric.compat.utils.monet.colors.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo71668d2 = {"toArgb", "", "Ldev/skomlach/biometric/compat/utils/monet/colors/Color;", "biometric_release"}, mo71669k = 2, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: Extension+Color.kt */
public final class Extension_ColorKt {
    public static final int toArgb(Color color) {
        C13706o.m87929f(color, "<this>");
        return color.toLinearSrgb().toSrgb().quantize8();
    }
}
