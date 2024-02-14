package androidx.biometric;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

class CancellationSignalProvider {
    private static final String TAG = "CancelSignalProvider";
    @Nullable
    private CancellationSignal mBiometricCancellationSignal;
    @Nullable
    private androidx.core.p007os.CancellationSignal mFingerprintCancellationSignal;
    private final Injector mInjector;

    @RequiresApi(16)
    private static class Api16Impl {
        private Api16Impl() {
        }

        static void cancel(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal create() {
            return new CancellationSignal();
        }
    }

    @VisibleForTesting
    interface Injector {
        @RequiresApi(16)
        @NonNull
        CancellationSignal getBiometricCancellationSignal();

        @NonNull
        androidx.core.p007os.CancellationSignal getFingerprintCancellationSignal();
    }

    CancellationSignalProvider() {
        this.mInjector = new Injector() {
            @RequiresApi(16)
            @NonNull
            public CancellationSignal getBiometricCancellationSignal() {
                return Api16Impl.create();
            }

            @NonNull
            public androidx.core.p007os.CancellationSignal getFingerprintCancellationSignal() {
                return new androidx.core.p007os.CancellationSignal();
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void cancel() {
        CancellationSignal cancellationSignal = this.mBiometricCancellationSignal;
        if (cancellationSignal != null) {
            try {
                Api16Impl.cancel(cancellationSignal);
            } catch (NullPointerException e) {
                Log.e(TAG, "Got NPE while canceling biometric authentication.", e);
            }
            this.mBiometricCancellationSignal = null;
        }
        androidx.core.p007os.CancellationSignal cancellationSignal2 = this.mFingerprintCancellationSignal;
        if (cancellationSignal2 != null) {
            try {
                cancellationSignal2.cancel();
            } catch (NullPointerException e2) {
                Log.e(TAG, "Got NPE while canceling fingerprint authentication.", e2);
            }
            this.mFingerprintCancellationSignal = null;
        }
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(16)
    @NonNull
    public CancellationSignal getBiometricCancellationSignal() {
        if (this.mBiometricCancellationSignal == null) {
            this.mBiometricCancellationSignal = this.mInjector.getBiometricCancellationSignal();
        }
        return this.mBiometricCancellationSignal;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public androidx.core.p007os.CancellationSignal getFingerprintCancellationSignal() {
        if (this.mFingerprintCancellationSignal == null) {
            this.mFingerprintCancellationSignal = this.mInjector.getFingerprintCancellationSignal();
        }
        return this.mFingerprintCancellationSignal;
    }

    @VisibleForTesting
    CancellationSignalProvider(Injector injector) {
        this.mInjector = injector;
    }
}
