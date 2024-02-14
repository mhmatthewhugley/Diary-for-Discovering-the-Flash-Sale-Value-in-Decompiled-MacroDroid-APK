package dev.skomlach.biometric.compat.impl.dialogs;

import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import com.android.p023dx.rop.code.RegisterSpec;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog$onCreateView$2", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lja/u;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompatDialog.kt */
public final class BiometricPromptCompatDialog$onCreateView$2 implements View.OnAttachStateChangeListener {
    final /* synthetic */ BiometricPromptCompatDialog this$0;

    BiometricPromptCompatDialog$onCreateView$2(BiometricPromptCompatDialog biometricPromptCompatDialog) {
        this.this$0 = biometricPromptCompatDialog;
    }

    public void onViewAttachedToWindow(View view) {
        C13706o.m87929f(view, RegisterSpec.PREFIX);
        try {
            Context context = view.getContext();
            if (context != null) {
                context.registerReceiver(this.this$0.wallpaperChangedReceiver, new IntentFilter("android.intent.action.WALLPAPER_CHANGED"));
            }
            BiometricPromptCompatDialog biometricPromptCompatDialog = this.this$0;
            Context context2 = view.getContext();
            if (context2 != null) {
                biometricPromptCompatDialog.updateMonetColorsInternal(context2);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, "setupMonet");
        }
    }

    public void onViewDetachedFromWindow(View view) {
        C13706o.m87929f(view, RegisterSpec.PREFIX);
        try {
            view.getContext().unregisterReceiver(this.this$0.wallpaperChangedReceiver);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, "setupMonet");
        }
    }
}
