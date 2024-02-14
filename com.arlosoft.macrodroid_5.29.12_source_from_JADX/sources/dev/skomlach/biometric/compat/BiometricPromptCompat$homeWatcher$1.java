package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.impl.dialogs.HomeWatcher;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"dev/skomlach/biometric/compat/BiometricPromptCompat$homeWatcher$1", "Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher$OnHomePressedListener;", "Lja/u;", "onHomePressed", "onRecentAppPressed", "onPowerPressed", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompat.kt */
public final class BiometricPromptCompat$homeWatcher$1 implements HomeWatcher.OnHomePressedListener {
    final /* synthetic */ BiometricPromptCompat this$0;

    BiometricPromptCompat$homeWatcher$1(BiometricPromptCompat biometricPromptCompat) {
        this.this$0 = biometricPromptCompat;
    }

    public void onHomePressed() {
        this.this$0.cancelAuthentication();
    }

    public void onPowerPressed() {
        this.this$0.cancelAuthentication();
    }

    public void onRecentAppPressed() {
        this.this$0.cancelAuthentication();
    }
}
