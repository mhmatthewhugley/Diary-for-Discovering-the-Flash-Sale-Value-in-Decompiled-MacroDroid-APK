package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.C0057a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TrustedWebActivityCallbackRemote {
    private final C0057a mCallbackBinder;

    private TrustedWebActivityCallbackRemote(@NonNull C0057a aVar) {
        this.mCallbackBinder = aVar;
    }

    @Nullable
    static TrustedWebActivityCallbackRemote fromBinder(@Nullable IBinder iBinder) {
        C0057a asInterface = iBinder == null ? null : C0057a.C0058a.asInterface(iBinder);
        if (asInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(asInterface);
    }

    public void runExtraCallback(@NonNull String str, @NonNull Bundle bundle) throws RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
