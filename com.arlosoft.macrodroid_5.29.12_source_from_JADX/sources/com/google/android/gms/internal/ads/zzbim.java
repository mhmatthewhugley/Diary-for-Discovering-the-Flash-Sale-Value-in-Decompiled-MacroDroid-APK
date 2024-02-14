package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbim {

    /* renamed from: a */
    private final Context f26786a;

    public zzbim(Context context) {
        Preconditions.m4489l(context, "Context can not be null");
        this.f26786a = context;
    }

    /* renamed from: a */
    public final boolean mo42642a(Intent intent) {
        Preconditions.m4489l(intent, "Intent can not be null");
        if (!this.f26786a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo42643b() {
        return mo42642a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: c */
    public final boolean mo42644c() {
        return ((Boolean) zzcb.m2626a(this.f26786a, zzbil.f26785a)).booleanValue() && Wrappers.m4929a(this.f26786a).mo21958a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
