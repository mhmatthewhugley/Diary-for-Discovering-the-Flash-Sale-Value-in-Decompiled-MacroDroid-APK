package dev.skomlach.biometric.compat.engine.internal.face.facelock;

import android.os.RemoteException;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0002H&¨\u0006\n"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/facelock/IFaceLockCallback;", "", "Lja/u;", "unlock", "cancel", "reportFailedAttempt", "exposeFallback", "", "millis", "pokeWakelock", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: IFaceLockCallback.kt */
public interface IFaceLockCallback {
    void cancel() throws RemoteException;

    void exposeFallback() throws RemoteException;

    void pokeWakelock() throws RemoteException;

    void pokeWakelock(int i) throws RemoteException;

    void reportFailedAttempt() throws RemoteException;

    void unlock() throws RemoteException;
}
