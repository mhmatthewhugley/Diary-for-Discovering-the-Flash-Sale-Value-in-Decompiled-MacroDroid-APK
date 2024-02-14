package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.C1738R;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzfj {
    /* renamed from: a */
    public static String m65653a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C1738R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @Nullable
    /* renamed from: b */
    public static final String m65654b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
