package dev.skomlach.biometric.compat.impl.dialogs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog$wallpaperChangedReceiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lja/u;", "onReceive", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompatDialog.kt */
public final class BiometricPromptCompatDialog$wallpaperChangedReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ BiometricPromptCompatDialog this$0;

    BiometricPromptCompatDialog$wallpaperChangedReceiver$1(BiometricPromptCompatDialog biometricPromptCompatDialog) {
        this.this$0 = biometricPromptCompatDialog;
    }

    public void onReceive(Context context, Intent intent) {
        BiometricPromptCompatDialog biometricPromptCompatDialog = this.this$0;
        if (context != null) {
            biometricPromptCompatDialog.updateMonetColorsInternal(context);
        }
    }
}
