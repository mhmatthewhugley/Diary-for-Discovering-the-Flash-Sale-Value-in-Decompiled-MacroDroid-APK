package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zae implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f4036a;

    /* renamed from: c */
    final /* synthetic */ Intent f4037c;

    zae(Context context, Intent intent) {
        this.f4036a = context;
        this.f4037c = intent;
    }

    public final void onClick(View view) {
        try {
            this.f4036a.startActivity(this.f4037c);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
