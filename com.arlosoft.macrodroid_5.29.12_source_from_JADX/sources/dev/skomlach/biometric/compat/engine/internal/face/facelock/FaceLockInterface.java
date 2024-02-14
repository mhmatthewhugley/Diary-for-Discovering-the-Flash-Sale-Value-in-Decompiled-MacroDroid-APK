package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/FaceLockInterface;", "", "", "code", "", "msg", "Lja/u;", "onError", "onAuthorized", "onConnected", "onDisconnected", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FaceLockInterface.kt */
public interface FaceLockInterface {
    void onAuthorized();

    void onConnected();

    void onDisconnected();

    void onError(int i, String str);
}
