package dev.skomlach.biometric.compat;

import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.utils.TruncatedTextFix;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"dev/skomlach/biometric/compat/BiometricPromptCompat$Builder$build$1", "Ldev/skomlach/biometric/compat/utils/TruncatedTextFix$OnTruncateChecked;", "Lja/u;", "onDone", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompat.kt */
public final class BiometricPromptCompat$Builder$build$1 implements TruncatedTextFix.OnTruncateChecked {
    final /* synthetic */ BiometricPromptCompat.Builder this$0;

    BiometricPromptCompat$Builder$build$1(BiometricPromptCompat.Builder builder) {
        this.this$0 = builder;
    }

    public void onDone() {
        this.this$0.isTruncateChecked = true;
    }
}
