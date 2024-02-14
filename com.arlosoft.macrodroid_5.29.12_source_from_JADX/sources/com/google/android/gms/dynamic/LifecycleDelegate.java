package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface LifecycleDelegate {
    @KeepForSdk
    /* renamed from: N */
    void mo22037N();

    @KeepForSdk
    /* renamed from: S */
    void mo22038S(@Nullable Bundle bundle);

    @KeepForSdk
    /* renamed from: U */
    void mo22039U(@NonNull Bundle bundle);

    @KeepForSdk
    void onDestroy();

    @KeepForSdk
    void onLowMemory();

    @KeepForSdk
    void onPause();

    @KeepForSdk
    void onResume();

    @KeepForSdk
    void onStart();

    @KeepForSdk
    /* renamed from: s0 */
    void mo22045s0();

    @KeepForSdk
    /* renamed from: t0 */
    void mo22046t0(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2);

    @NonNull
    @KeepForSdk
    /* renamed from: u0 */
    View mo22047u0(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);
}
