package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class LifecycleActivity {

    /* renamed from: a */
    private final Object f3199a;

    public LifecycleActivity(@NonNull Activity activity) {
        Preconditions.m4489l(activity, "Activity must not be null");
        this.f3199a = activity;
    }

    @NonNull
    /* renamed from: a */
    public final Activity mo21358a() {
        return (Activity) this.f3199a;
    }

    @NonNull
    /* renamed from: b */
    public final FragmentActivity mo21359b() {
        return (FragmentActivity) this.f3199a;
    }

    /* renamed from: c */
    public final boolean mo21360c() {
        return this.f3199a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo21361d() {
        return this.f3199a instanceof FragmentActivity;
    }
}
