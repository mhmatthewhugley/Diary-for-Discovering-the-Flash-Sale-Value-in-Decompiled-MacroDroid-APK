package p044pl.charmas.android.reactivelocation.observables;

/* renamed from: pl.charmas.android.reactivelocation.observables.GoogleAPIConnectionSuspendedException */
public class GoogleAPIConnectionSuspendedException extends RuntimeException {
    private final int cause;

    GoogleAPIConnectionSuspendedException(int i) {
        this.cause = i;
    }
}
