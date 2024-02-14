package com.tencent.soter.core.biometric;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import com.tencent.soter.core.biometric.FaceManager;
import com.tencent.soter.core.model.SLogger;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

final class FaceidManagerProxy {
    public static final String FACEMANAGER_FACTORY_CLASS_NAME = "com.tencent.soter.core.biometric.SoterFaceManagerFactory";
    private static final String TAG = "Soter.FaceidManagerProxy";

    public static abstract class AuthenticationCallback {
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

    FaceidManagerProxy() {
    }

    public static void authenticate(Context context, CryptoObject cryptoObject, int i, Object obj, AuthenticationCallback authenticationCallback, Handler handler) {
        try {
            FaceManager faceManager = getFaceManager(context);
            if (faceManager != null) {
                faceManager.authenticate(wrapCryptoObject(cryptoObject), (CancellationSignal) obj, i, wrapCallback(authenticationCallback), handler);
                return;
            }
            SLogger.m81940e(TAG, "soter: facemanager is null in authenticate! Should never happen", new Object[0]);
        } catch (Exception unused) {
            SLogger.m81940e(TAG, "soter: triggered SecurityException in authenticate! Make sure you declared USE_FACEID in AndroidManifest.xml", new Object[0]);
        }
    }

    public static String getBiometricName(Context context) {
        try {
            FaceManager faceManager = getFaceManager(context);
            if (faceManager != null) {
                return faceManager.getBiometricName(context);
            }
            SLogger.m81940e(TAG, "soter: faceid manager is null! no biometric name returned.", new Object[0]);
            return null;
        } catch (Exception unused) {
            SLogger.m81940e(TAG, "soter: triggered SecurityException in getBiometricName! Make sure you declared USE_FACEID in AndroidManifest.xml", new Object[0]);
            return null;
        }
    }

    private static FaceManager getFaceManager(Context context) {
        try {
            return (FaceManager) Class.forName(FACEMANAGER_FACTORY_CLASS_NAME).getDeclaredMethod("getFaceManager", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            SLogger.m81940e(TAG, "soter: FaceManager init failed, maybe not support." + e.toString(), new Object[0]);
            e.printStackTrace();
            return null;
        }
    }

    public static boolean hasEnrolledFaceids(Context context) {
        try {
            FaceManager faceManager = getFaceManager(context);
            if (faceManager != null) {
                return faceManager.hasEnrolledFaces();
            }
            SLogger.m81940e(TAG, "soter: facemanager is null in hasEnrolledBiometric! Should never happen", new Object[0]);
            return false;
        } catch (Exception unused) {
            SLogger.m81940e(TAG, "soter: triggered SecurityException in hasEnrolledBiometric! Make sure you declared USE_FACEID in AndroidManifest.xml", new Object[0]);
            return false;
        }
    }

    public static boolean isHardwareDetected(Context context) {
        try {
            FaceManager faceManager = getFaceManager(context);
            if (faceManager != null) {
                return faceManager.isHardwareDetected();
            }
            SLogger.m81940e(TAG, "soter: facemanager is null in isHardwareDetected! Should never happen", new Object[0]);
            return false;
        } catch (Exception unused) {
            SLogger.m81940e(TAG, "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FACEID in AndroidManifest.xml", new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static CryptoObject unwrapCryptoObject(FaceManager.CryptoObject cryptoObject) {
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

    private static FaceManager.AuthenticationCallback wrapCallback(final AuthenticationCallback authenticationCallback) {
        return new FaceManager.AuthenticationCallback() {
            public void onAuthenticationError(int i, CharSequence charSequence) {
                SLogger.m81939d(FaceidManagerProxy.TAG, "hy: lowest level return onAuthenticationError", new Object[0]);
                authenticationCallback.onAuthenticationError(i, charSequence);
            }

            public void onAuthenticationFailed() {
                SLogger.m81939d(FaceidManagerProxy.TAG, "hy: lowest level return onAuthenticationFailed", new Object[0]);
                authenticationCallback.onAuthenticationFailed();
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                SLogger.m81939d(FaceidManagerProxy.TAG, "hy: lowest level return onAuthenticationHelp", new Object[0]);
                authenticationCallback.onAuthenticationHelp(i, charSequence);
            }

            public void onAuthenticationSucceeded(FaceManager.AuthenticationResult authenticationResult) {
                SLogger.m81939d(FaceidManagerProxy.TAG, "hy: lowest level return onAuthenticationSucceeded", new Object[0]);
                authenticationCallback.onAuthenticationSucceeded(new AuthenticationResult(FaceidManagerProxy.unwrapCryptoObject(authenticationResult.getCryptoObject())));
            }
        };
    }

    private static FaceManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new FaceManager.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new FaceManager.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new FaceManager.CryptoObject(cryptoObject.getMac());
        }
        return null;
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
