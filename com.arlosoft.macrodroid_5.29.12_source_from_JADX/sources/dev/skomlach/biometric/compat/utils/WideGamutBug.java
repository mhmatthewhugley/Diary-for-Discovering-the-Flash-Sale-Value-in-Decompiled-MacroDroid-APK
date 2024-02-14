package dev.skomlach.biometric.compat.utils;

import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/WideGamutBug;", "", "()V", "error", "", "unsupportedColorMode", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: WideGamutBug.kt */
public final class WideGamutBug {
    public static final WideGamutBug INSTANCE = new WideGamutBug();
    private static final String error = "WARNING!!!\nDo not use android:colorMode=\"wideColorGamut\"  for Activity - it leads to unexpected bugs on OnePlus devices:\nhttps://www.reddit.com/r/redditsync/comments/9ta7df/updated_my_oneplus_6_recently_opening_images/\nOn OnePlus 6T stop working Fingerprint Sensor O_o";

    private WideGamutBug() {
    }

    public final boolean unsupportedColorMode(FragmentActivity fragmentActivity) {
        C13706o.m87929f(fragmentActivity, "activity");
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || (fragmentActivity.getWindow().getColorMode() != 1 && (i < 27 || !fragmentActivity.getWindow().isWideColorGamut()))) {
            return false;
        }
        BiometricLoggerImpl.INSTANCE.mo68220e(error);
        return true;
    }
}
