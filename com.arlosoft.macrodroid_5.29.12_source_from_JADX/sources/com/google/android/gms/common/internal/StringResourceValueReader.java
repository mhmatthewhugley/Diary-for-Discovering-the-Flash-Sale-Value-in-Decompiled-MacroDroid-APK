package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.C1738R;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class StringResourceValueReader {

    /* renamed from: a */
    private final Resources f3679a;

    /* renamed from: b */
    private final String f3680b;

    public StringResourceValueReader(@NonNull Context context) {
        Preconditions.m4488k(context);
        Resources resources = context.getResources();
        this.f3679a = resources;
        this.f3680b = resources.getResourcePackageName(C1738R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public String mo21730a(@NonNull String str) {
        int identifier = this.f3679a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f3680b);
        if (identifier == 0) {
            return null;
        }
        return this.f3679a.getString(identifier);
    }
}
