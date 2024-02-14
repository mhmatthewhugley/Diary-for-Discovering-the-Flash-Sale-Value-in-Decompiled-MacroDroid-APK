package p295j8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* renamed from: j8.b */
/* compiled from: AppBuildInfo */
public final class C13302b {
    @NonNull
    /* renamed from: a */
    static PackageInfo m85634a(@NonNull Context context, int i) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
