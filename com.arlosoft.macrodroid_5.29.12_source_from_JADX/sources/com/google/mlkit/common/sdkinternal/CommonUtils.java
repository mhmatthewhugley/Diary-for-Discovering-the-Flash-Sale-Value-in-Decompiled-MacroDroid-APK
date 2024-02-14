package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class CommonUtils {

    /* renamed from: a */
    private static final GmsLogger f56293a = new GmsLogger("CommonUtils", "");

    private CommonUtils() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static String m79028a(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            f56293a.mo21704d("CommonUtils", "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static String m79029b(@NonNull Locale locale) {
        if (PlatformVersion.m4901f()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
