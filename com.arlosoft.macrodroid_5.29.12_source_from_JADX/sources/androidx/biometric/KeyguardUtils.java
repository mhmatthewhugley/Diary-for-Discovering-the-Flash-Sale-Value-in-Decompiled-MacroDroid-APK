package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

class KeyguardUtils {

    @RequiresApi(16)
    private static class Api16Impl {
        private Api16Impl() {
        }

        static boolean isKeyguardSecure(@NonNull KeyguardManager keyguardManager) {
            return keyguardManager.isKeyguardSecure();
        }
    }

    @RequiresApi(23)
    private static class Api23Impl {
        private Api23Impl() {
        }

        @Nullable
        static KeyguardManager getKeyguardManager(@NonNull Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        static boolean isDeviceSecure(@NonNull KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    private KeyguardUtils() {
    }

    @Nullable
    static KeyguardManager getKeyguardManager(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getKeyguardManager(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    static boolean isDeviceSecuredWithCredential(@NonNull Context context) {
        KeyguardManager keyguardManager = getKeyguardManager(context);
        if (keyguardManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.isDeviceSecure(keyguardManager);
        }
        return Api16Impl.isKeyguardSecure(keyguardManager);
    }
}
