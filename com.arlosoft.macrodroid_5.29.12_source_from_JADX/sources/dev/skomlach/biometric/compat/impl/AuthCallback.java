package dev.skomlach.biometric.compat.impl;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&¨\u0006\b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/AuthCallback;", "", "Lja/u;", "startAuth", "stopAuth", "cancelAuth", "onUiOpened", "onUiClosed", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: AuthCallback.kt */
public interface AuthCallback {
    void cancelAuth();

    void onUiClosed();

    void onUiOpened();

    void startAuth();

    void stopAuth();
}
