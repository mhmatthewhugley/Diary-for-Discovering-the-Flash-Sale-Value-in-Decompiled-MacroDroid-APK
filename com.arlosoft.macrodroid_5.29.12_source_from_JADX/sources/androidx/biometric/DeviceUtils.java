package androidx.biometric;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class DeviceUtils {
    private DeviceUtils() {
    }

    static boolean canAssumeStrongBiometrics(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return isModelInList(context, str, C0265R.array.assume_strong_biometrics_models);
    }

    private static boolean isModelInList(@NonNull Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : context.getResources().getStringArray(i)) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isModelInPrefixList(@NonNull Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(i)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVendorInList(@NonNull Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equalsIgnoreCase : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    static boolean shouldDelayShowingPrompt(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return isModelInList(context, str, C0265R.array.delay_showing_prompt_models);
    }

    static boolean shouldHideFingerprintDialog(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return isModelInPrefixList(context, str, C0265R.array.hide_fingerprint_instantly_prefixes);
    }

    static boolean shouldUseFingerprintForCrypto(@NonNull Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (isVendorInList(context, str, C0265R.array.crypto_fingerprint_fallback_vendors) || isModelInPrefixList(context, str2, C0265R.array.crypto_fingerprint_fallback_prefixes)) {
            return true;
        }
        return false;
    }

    static boolean shouldUseKeyguardManagerForBiometricAndCredential(@NonNull Context context, @Nullable String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return !isVendorInList(context, str, C0265R.array.keyguard_biometric_and_credential_exclude_vendors);
    }
}
