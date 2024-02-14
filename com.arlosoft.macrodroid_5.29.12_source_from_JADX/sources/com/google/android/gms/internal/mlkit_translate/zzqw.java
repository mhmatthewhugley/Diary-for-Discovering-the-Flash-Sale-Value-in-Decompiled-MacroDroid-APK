package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzqw extends zzoy {
    public zzqw(Context context) {
        super(new zzps(context, new SharedPrefManager(context), new zzpm(context, zzpl.m62154d("shared-remote-config").mo52405c()), "shared-remote-config"));
    }

    /* renamed from: b */
    public final void mo52468b(zzox zzox) {
        mo52393a(zzle.REMOTE_CONFIG_ACTIVATE, zzox);
    }

    /* renamed from: c */
    public final void mo52469c(zzox zzox) {
        mo52393a(zzle.REMOTE_CONFIG_FETCH, zzox);
    }

    /* renamed from: d */
    public final void mo52470d(zzox zzox) {
        mo52393a(zzle.REMOTE_CONFIG_FRC_FETCH, zzox);
    }
}
