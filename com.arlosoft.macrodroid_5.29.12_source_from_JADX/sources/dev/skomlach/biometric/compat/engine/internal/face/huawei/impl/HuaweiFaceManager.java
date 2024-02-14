package dev.skomlach.biometric.compat.engine.internal.face.huawei.impl;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u000bH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager;", "", "", "reqId", "flag", "Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager$AuthenticatorCallback;", "authenticatorCallback", "Lja/u;", "authenticate", "i", "cancel", "", "hasEnrolledTemplates", "", "getEnrolledTemplates", "getVersion", "()I", "version", "isHardwareDetected", "()Z", "<init>", "()V", "AuthenticatorCallback", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: HuaweiFaceManager.kt */
public abstract class HuaweiFaceManager {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/huawei/impl/HuaweiFaceManager$AuthenticatorCallback;", "", "", "errorCode", "Lja/u;", "onAuthenticationError", "status", "onAuthenticationStatus", "onAuthenticationSucceeded", "onAuthenticationFailed", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: HuaweiFaceManager.kt */
    public static abstract class AuthenticatorCallback {
        public void onAuthenticationError(int i) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationStatus(int i) {
        }

        public void onAuthenticationSucceeded() {
        }
    }

    public abstract void authenticate(int i, int i2, AuthenticatorCallback authenticatorCallback);

    public abstract int cancel(int i);

    public abstract int[] getEnrolledTemplates();

    public abstract int getVersion();

    public abstract boolean hasEnrolledTemplates();

    public abstract boolean isHardwareDetected();
}
