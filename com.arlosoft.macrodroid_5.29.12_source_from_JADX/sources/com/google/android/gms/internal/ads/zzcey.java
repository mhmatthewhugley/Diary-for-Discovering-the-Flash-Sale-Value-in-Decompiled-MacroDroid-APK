package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcey implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final String f28329a;

    /* renamed from: b */
    final /* synthetic */ zzcez f28330b;

    public zzcey(zzcez zzcez, String str) {
        this.f28330b = zzcez;
        this.f28329a = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f28330b) {
            for (zzcex zzcex : this.f28330b.f28332b) {
                zzcex.f28327a.mo43451b(zzcex.f28328b, sharedPreferences, this.f28329a, str);
            }
        }
    }
}
