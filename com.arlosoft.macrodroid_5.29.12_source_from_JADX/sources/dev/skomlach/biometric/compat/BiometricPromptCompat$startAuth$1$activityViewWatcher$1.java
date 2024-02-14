package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.utils.activityView.ActivityViewWatcher;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"dev/skomlach/biometric/compat/BiometricPromptCompat$startAuth$1$activityViewWatcher$1", "Ldev/skomlach/biometric/compat/utils/activityView/ActivityViewWatcher$ForceToCloseCallback;", "Lja/u;", "onCloseBiometric", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompat.kt */
public final class BiometricPromptCompat$startAuth$1$activityViewWatcher$1 implements ActivityViewWatcher.ForceToCloseCallback {
    final /* synthetic */ BiometricPromptCompat this$0;

    BiometricPromptCompat$startAuth$1$activityViewWatcher$1(BiometricPromptCompat biometricPromptCompat) {
        this.this$0 = biometricPromptCompat;
    }

    public void onCloseBiometric() {
        this.this$0.cancelAuthentication();
    }
}
