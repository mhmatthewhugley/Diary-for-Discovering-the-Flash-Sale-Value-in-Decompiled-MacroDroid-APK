package dev.skomlach.biometric.compat.utils.activityView;

import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.utils.activityView.IconStateHelper;
import dev.skomlach.common.misc.C12114c;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"dev/skomlach/biometric/compat/utils/activityView/IconStateHelper$errorType$1$2", "Ljava/lang/Runnable;", "Lja/u;", "run", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: IconStateHelper.kt */
public final class IconStateHelper$errorType$1$2 implements Runnable {
    final /* synthetic */ BiometricType $type;

    IconStateHelper$errorType$1$2(BiometricType biometricType) {
        this.$type = biometricType;
    }

    public void run() {
        C12114c.f58379a.mo68307i(this);
        for (IconStateHelper.IconStateListener reset : IconStateHelper.listeners) {
            reset.reset(this.$type);
        }
    }
}
