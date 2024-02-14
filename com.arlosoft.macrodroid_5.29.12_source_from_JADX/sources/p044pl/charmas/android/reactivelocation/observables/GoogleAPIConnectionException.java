package p044pl.charmas.android.reactivelocation.observables;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: pl.charmas.android.reactivelocation.observables.GoogleAPIConnectionException */
public class GoogleAPIConnectionException extends RuntimeException {
    private final ConnectionResult connectionResult;

    GoogleAPIConnectionException(String str, ConnectionResult connectionResult2) {
        super(str);
        this.connectionResult = connectionResult2;
    }
}
