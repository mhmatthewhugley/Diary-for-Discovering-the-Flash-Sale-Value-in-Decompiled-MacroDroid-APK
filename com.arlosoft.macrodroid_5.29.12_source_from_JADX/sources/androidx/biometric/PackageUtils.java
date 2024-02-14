package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

class PackageUtils {

    @RequiresApi(23)
    private static class Api23Impl {
        private Api23Impl() {
        }

        static boolean hasSystemFeatureFingerprint(@NonNull PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    @RequiresApi(29)
    private static class Api29Impl {
        private Api29Impl() {
        }

        static boolean hasSystemFeatureFace(@NonNull PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.face");
        }

        static boolean hasSystemFeatureIris(@NonNull PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
        }
    }

    private PackageUtils() {
    }

    static boolean hasSystemFeatureFace(@Nullable Context context) {
        return Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && Api29Impl.hasSystemFeatureFace(context.getPackageManager());
    }

    static boolean hasSystemFeatureFingerprint(@Nullable Context context) {
        return Build.VERSION.SDK_INT >= 23 && context != null && context.getPackageManager() != null && Api23Impl.hasSystemFeatureFingerprint(context.getPackageManager());
    }

    static boolean hasSystemFeatureIris(@Nullable Context context) {
        return Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && Api29Impl.hasSystemFeatureIris(context.getPackageManager());
    }
}
