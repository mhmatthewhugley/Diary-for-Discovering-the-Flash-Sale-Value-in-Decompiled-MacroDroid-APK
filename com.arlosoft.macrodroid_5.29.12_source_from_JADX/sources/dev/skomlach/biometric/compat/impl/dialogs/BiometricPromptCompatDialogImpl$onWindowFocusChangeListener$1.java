package dev.skomlach.biometric.compat.impl.dialogs;

import dev.skomlach.biometric.compat.utils.WindowFocusChangedListener;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialogImpl$onWindowFocusChangeListener$1", "Ldev/skomlach/biometric/compat/utils/WindowFocusChangedListener;", "Lja/u;", "onStartWatching", "", "hasFocus", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompatDialogImpl.kt */
public final class BiometricPromptCompatDialogImpl$onWindowFocusChangeListener$1 implements WindowFocusChangedListener {
    final /* synthetic */ BiometricPromptCompatDialogImpl this$0;

    BiometricPromptCompatDialogImpl$onWindowFocusChangeListener$1(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl) {
        this.this$0 = biometricPromptCompatDialogImpl;
    }

    public void hasFocus(boolean z) {
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68220e("BiometricPromptGenericImpl.onWindowFocusChanged - fallback dialog " + z);
        if (z) {
            this.this$0.startAuth();
        } else if (!this.this$0.isMultiWindowHack()) {
            biometricLoggerImpl.mo68220e("BiometricPromptGenericImpl.onWindowFocusChanged - cancelAuth");
            this.this$0.cancelAuth();
        } else if (!this.this$0.isInScreen || !this.this$0.isInScreenUIHackNeeded()) {
            biometricLoggerImpl.mo68220e("BiometricPromptGenericImpl.onWindowFocusChanged - do not cancelAuth - regular device in multiwindow");
        } else {
            biometricLoggerImpl.mo68220e("BiometricPromptGenericImpl.onWindowFocusChanged - do not cancelAuth - inScreenDevice and app on top");
        }
    }

    public void onStartWatching() {
        BiometricLoggerImpl.INSTANCE.mo68220e("BiometricPromptGenericImpl.onStartWatching");
    }
}
