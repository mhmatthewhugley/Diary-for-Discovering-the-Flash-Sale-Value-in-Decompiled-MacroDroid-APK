package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zac extends zau {

    /* renamed from: a */
    private final Context f3972a;

    /* renamed from: b */
    final /* synthetic */ GoogleApiAvailability f3973b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zac(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f3973b = googleApiAvailability;
        this.f3972a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = this.f3973b.mo21156i(this.f3972a);
        if (this.f3973b.mo21158m(i2)) {
            this.f3973b.mo21164u(this.f3972a, i2);
        }
    }
}
