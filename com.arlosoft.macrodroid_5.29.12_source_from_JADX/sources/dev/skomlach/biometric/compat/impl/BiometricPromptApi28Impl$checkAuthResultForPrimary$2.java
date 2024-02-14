package dev.skomlach.biometric.compat.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/BiometricPromptApi28Impl$checkAuthResultForPrimary$2", "Ldev/skomlach/biometric/compat/impl/AuthCallback;", "Lja/u;", "startAuth", "stopAuth", "cancelAuth", "onUiOpened", "onUiClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ignoreFirstOpen", "Ljava/util/concurrent/atomic/AtomicBoolean;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptApi28Impl.kt */
public final class BiometricPromptApi28Impl$checkAuthResultForPrimary$2 implements AuthCallback {
    private final AtomicBoolean ignoreFirstOpen = new AtomicBoolean(true);
    final /* synthetic */ BiometricPromptApi28Impl this$0;

    BiometricPromptApi28Impl$checkAuthResultForPrimary$2(BiometricPromptApi28Impl biometricPromptApi28Impl) {
        this.this$0 = biometricPromptApi28Impl;
    }

    public void cancelAuth() {
        this.this$0.cancelAuth();
    }

    public void onUiClosed() {
        this.this$0.onUiClosed();
    }

    public void onUiOpened() {
        this.this$0.onUiOpened();
    }

    public void startAuth() {
        if (!this.ignoreFirstOpen.getAndSet(false)) {
            this.this$0.startAuth();
        }
    }

    public void stopAuth() {
        this.this$0.stopAuth();
    }
}
