package androidx.biometric;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.BiometricPrompt;

class AuthenticatorUtils {
    private static final int BIOMETRIC_CLASS_MASK = 32767;

    private AuthenticatorUtils() {
    }

    static String convertToString(int i) {
        return i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG";
    }

    static int getBiometricAuthenticators(int i) {
        return i & BIOMETRIC_CLASS_MASK;
    }

    static int getConsolidatedAuthenticators(@NonNull BiometricPrompt.PromptInfo promptInfo, @Nullable BiometricPrompt.CryptoObject cryptoObject) {
        if (promptInfo.getAllowedAuthenticators() != 0) {
            return promptInfo.getAllowedAuthenticators();
        }
        int i = cryptoObject != null ? 15 : 255;
        return promptInfo.isDeviceCredentialAllowed() ? 32768 | i : i;
    }

    static boolean isDeviceCredentialAllowed(int i) {
        return (i & 32768) != 0;
    }

    static boolean isSomeBiometricAllowed(int i) {
        return getBiometricAuthenticators(i) != 0;
    }

    static boolean isSupportedCombination(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i != 32768) {
            if (i != 32783) {
                return i == 33023 || i == 0;
            }
            int i2 = Build.VERSION.SDK_INT;
            return i2 < 28 || i2 > 29;
        } else if (Build.VERSION.SDK_INT >= 30) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isWeakBiometricAllowed(int i) {
        return (i & 255) == 255;
    }
}
