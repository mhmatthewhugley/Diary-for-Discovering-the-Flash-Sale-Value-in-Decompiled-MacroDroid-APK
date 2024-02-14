package com.tencent.soter.core.fingerprint;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import com.tencent.soter.core.SoterCore;
import com.tencent.soter.core.fingerprint.FingerprintManagerCompatApi23;
import com.tencent.soter.core.model.SLogger;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
public class FingerprintManagerCompat {
    static final FingerprintManagerCompatImpl IMPL;
    private static final String TAG = "Soter.FingerprintManagerCompat";
    private Context mContext;

    private static class Api23FingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        /* access modifiers changed from: private */
        public static boolean checkBruteForce(FingerprintManagerCompatApi23.AuthenticationCallback authenticationCallback, Context context) {
            if (SoterAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                SLogger.m81942v(FingerprintManagerCompat.TAG, "soter: using system anti brute force strategy", new Object[0]);
                return false;
            } else if (SoterAntiBruteForceStrategy.isCurrentTweenTimeAvailable(context)) {
                if (!SoterAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                    SLogger.m81942v(FingerprintManagerCompat.TAG, "soter: unfreeze former frozen status", new Object[0]);
                    SoterAntiBruteForceStrategy.unFreeze(context);
                }
                return false;
            } else if (SoterAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                SLogger.m81942v(FingerprintManagerCompat.TAG, "soter: failure time available", new Object[0]);
                return false;
            } else {
                informTooManyTrial(authenticationCallback);
                return true;
            }
        }

        /* access modifiers changed from: private */
        public static void informTooManyTrial(FingerprintManagerCompatApi23.AuthenticationCallback authenticationCallback) {
            SLogger.m81943w(FingerprintManagerCompat.TAG, "soter: too many fail fingerprint callback. inform it.", new Object[0]);
            authenticationCallback.onAuthenticationError(10308, "Too many failed times");
        }

        /* access modifiers changed from: private */
        public static CryptoObject unwrapCryptoObject(FingerprintManagerCompatApi23.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        private static FingerprintManagerCompatApi23.AuthenticationCallback wrapCallback(final Context context, final AuthenticationCallback authenticationCallback) {
            return new FingerprintManagerCompatApi23.AuthenticationCallback() {
                private boolean mMarkPermanentlyCallbacked = false;

                public void onAuthenticationError(int i, CharSequence charSequence) {
                    SLogger.m81939d(FingerprintManagerCompat.TAG, "soter: basic onAuthenticationError", new Object[0]);
                    if (!this.mMarkPermanentlyCallbacked) {
                        this.mMarkPermanentlyCallbacked = true;
                        if (i == 5) {
                            SLogger.m81941i(FingerprintManagerCompat.TAG, "soter: user cancelled fingerprint authen", new Object[0]);
                            authenticationCallback.onAuthenticationCancelled();
                        } else if (i == 7) {
                            SLogger.m81941i(FingerprintManagerCompat.TAG, "soter: system call too many trial.", new Object[0]);
                            if (!SoterAntiBruteForceStrategy.isCurrentFailTimeAvailable(context) && !SoterAntiBruteForceStrategy.isCurrentTweenTimeAvailable(context) && !SoterAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                                SoterAntiBruteForceStrategy.freeze(context);
                            }
                            this.mMarkPermanentlyCallbacked = false;
                            onAuthenticationError(10308, "Too many failed times");
                        } else {
                            authenticationCallback.onAuthenticationError(i, charSequence);
                        }
                    }
                }

                public void onAuthenticationFailed() {
                    SLogger.m81939d(FingerprintManagerCompat.TAG, "soter: basic onAuthenticationFailed", new Object[0]);
                    if (!this.mMarkPermanentlyCallbacked && !Api23FingerprintManagerCompatImpl.checkBruteForce(this, context)) {
                        if (!SoterAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                            SoterAntiBruteForceStrategy.addFailTime(context);
                            if (!SoterAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                                SLogger.m81943w(FingerprintManagerCompat.TAG, "soter: too many fail trials", new Object[0]);
                                SoterAntiBruteForceStrategy.freeze(context);
                                Api23FingerprintManagerCompatImpl.informTooManyTrial(this);
                                return;
                            }
                        }
                        authenticationCallback.onAuthenticationFailed();
                    }
                }

                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    SLogger.m81939d(FingerprintManagerCompat.TAG, "soter: basic onAuthenticationHelp", new Object[0]);
                    if (!this.mMarkPermanentlyCallbacked && !Api23FingerprintManagerCompatImpl.checkBruteForce(this, context)) {
                        authenticationCallback.onAuthenticationHelp(i, charSequence);
                    }
                }

                public void onAuthenticationSucceeded(FingerprintManagerCompatApi23.AuthenticationResultInternal authenticationResultInternal) {
                    SLogger.m81939d(FingerprintManagerCompat.TAG, "soter: basic onAuthenticationSucceeded", new Object[0]);
                    if (!this.mMarkPermanentlyCallbacked && !Api23FingerprintManagerCompatImpl.checkBruteForce(this, context)) {
                        if (!SoterAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                            SoterAntiBruteForceStrategy.unFreeze(context);
                        }
                        this.mMarkPermanentlyCallbacked = true;
                        authenticationCallback.onAuthenticationSucceeded(new AuthenticationResult(Api23FingerprintManagerCompatImpl.unwrapCryptoObject(authenticationResultInternal.getCryptoObject())));
                    }
                }
            };
        }

        private static FingerprintManagerCompatApi23.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        public void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
            FingerprintManagerCompatApi23.authenticate(context, wrapCryptoObject(cryptoObject), i, cancellationSignal, wrapCallback(context, authenticationCallback), handler);
        }

        public boolean hasEnrolledFingerprints(Context context) {
            return FingerprintManagerCompatApi23.hasEnrolledFingerprints(context);
        }

        public boolean isHardwareDetected(Context context) {
            return FingerprintManagerCompatApi23.isHardwareDetected(context);
        }
    }

    public static abstract class AuthenticationCallback {
        public void onAuthenticationCancelled() {
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }
    }

    public static final class AuthenticationResult {
        private CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    private interface FingerprintManagerCompatImpl {
        void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler);

        boolean hasEnrolledFingerprints(Context context);

        boolean isHardwareDetected(Context context);
    }

    private static class LegacyFingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        public void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        }

        public boolean hasEnrolledFingerprints(Context context) {
            return false;
        }

        public boolean isHardwareDetected(Context context) {
            return false;
        }
    }

    static {
        if (SoterCore.isNativeSupportSoter()) {
            IMPL = new Api23FingerprintManagerCompatImpl();
        } else {
            IMPL = new LegacyFingerprintManagerCompatImpl();
        }
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    public static FingerprintManagerCompat from(Context context) {
        return new FingerprintManagerCompat(context);
    }

    public void authenticate(CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        IMPL.authenticate(this.mContext, cryptoObject, i, cancellationSignal, authenticationCallback, handler);
    }

    public boolean hasEnrolledFingerprints() {
        return IMPL.hasEnrolledFingerprints(this.mContext);
    }

    public boolean isCurrentFailTimeAvailable() {
        return SoterAntiBruteForceStrategy.isCurrentFailTimeAvailable(this.mContext);
    }

    public boolean isCurrentTweenTimeAvailable(Context context) {
        return SoterAntiBruteForceStrategy.isCurrentTweenTimeAvailable(this.mContext);
    }

    public boolean isHardwareDetected() {
        return IMPL.isHardwareDetected(this.mContext);
    }

    public static class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public Cipher getCipher() {
            return this.mCipher;
        }

        public Mac getMac() {
            return this.mMac;
        }

        public Signature getSignature() {
            return this.mSignature;
        }

        public CryptoObject(Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }
    }
}
