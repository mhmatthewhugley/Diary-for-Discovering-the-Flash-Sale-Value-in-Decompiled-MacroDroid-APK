package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface LifecycleFragment {
    @KeepForSdk
    @Nullable
    /* renamed from: N */
    Activity mo21371N();

    @KeepForSdk
    void startActivityForResult(@NonNull Intent intent, int i);

    @KeepForSdk
    /* renamed from: t */
    void mo21373t(@NonNull String str, @NonNull LifecycleCallback lifecycleCallback);

    @KeepForSdk
    @Nullable
    /* renamed from: u */
    <T extends LifecycleCallback> T mo21374u(@NonNull String str, @NonNull Class<T> cls);
}
