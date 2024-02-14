package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;

class AuthenticationCallbackProvider {
    @Nullable
    private BiometricPrompt.AuthenticationCallback mBiometricCallback;
    @Nullable
    private FingerprintManagerCompat.AuthenticationCallback mFingerprintCallback;
    @NonNull
    final Listener mListener;

    @RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
        }

        @NonNull
        static BiometricPrompt.AuthenticationCallback createCallback(@NonNull final Listener listener) {
            return new BiometricPrompt.AuthenticationCallback() {
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    Listener.this.onError(i, charSequence);
                }

                public void onAuthenticationFailed() {
                    Listener.this.onFailure();
                }

                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                }

                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                    BiometricPrompt.CryptoObject unwrapFromBiometricPrompt = authenticationResult != null ? CryptoObjectUtils.unwrapFromBiometricPrompt(Api28Impl.getCryptoObject(authenticationResult)) : null;
                    int i = Build.VERSION.SDK_INT;
                    int i2 = -1;
                    if (i >= 30) {
                        if (authenticationResult != null) {
                            i2 = Api30Impl.getAuthenticationType(authenticationResult);
                        }
                    } else if (i != 29) {
                        i2 = 2;
                    }
                    Listener.this.onSuccess(new BiometricPrompt.AuthenticationResult(unwrapFromBiometricPrompt, i2));
                }
            };
        }

        @Nullable
        static BiometricPrompt.CryptoObject getCryptoObject(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }

    @RequiresApi(30)
    private static class Api30Impl {
        private Api30Impl() {
        }

        static int getAuthenticationType(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    static class Listener {
        Listener() {
        }

        /* access modifiers changed from: package-private */
        public void onError(int i, @Nullable CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void onFailure() {
        }

        /* access modifiers changed from: package-private */
        public void onHelp(@Nullable CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void onSuccess(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        }
    }

    AuthenticationCallbackProvider(@NonNull Listener listener) {
        this.mListener = listener;
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(28)
    @NonNull
    public BiometricPrompt.AuthenticationCallback getBiometricCallback() {
        if (this.mBiometricCallback == null) {
            this.mBiometricCallback = Api28Impl.createCallback(this.mListener);
        }
        return this.mBiometricCallback;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public FingerprintManagerCompat.AuthenticationCallback getFingerprintCallback() {
        if (this.mFingerprintCallback == null) {
            this.mFingerprintCallback = new FingerprintManagerCompat.AuthenticationCallback() {
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onError(i, charSequence);
                }

                public void onAuthenticationFailed() {
                    AuthenticationCallbackProvider.this.mListener.onFailure();
                }

                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onHelp(charSequence);
                }

                public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                    AuthenticationCallbackProvider.this.mListener.onSuccess(new BiometricPrompt.AuthenticationResult(authenticationResult != null ? CryptoObjectUtils.unwrapFromFingerprintManager(authenticationResult.getCryptoObject()) : null, 2));
                }
            };
        }
        return this.mFingerprintCallback;
    }
}
