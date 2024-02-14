package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final String TAG = "StartupLogger";

    private StartupLogger() {
    }

    /* renamed from: e */
    public static void m593e(@NonNull String str, @Nullable Throwable th) {
        Log.e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m594i(@NonNull String str) {
        Log.i(TAG, str);
    }

    /* renamed from: w */
    public static void m595w(@NonNull String str) {
        Log.w(TAG, str);
    }
}
