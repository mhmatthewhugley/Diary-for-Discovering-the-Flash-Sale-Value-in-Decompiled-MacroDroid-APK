package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class zza extends zzc {

    /* renamed from: d */
    public final int f3740d;
    @Nullable

    /* renamed from: e */
    public final Bundle f3741e;

    /* renamed from: f */
    final /* synthetic */ BaseGmsClient f3742f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    protected zza(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.f3742f = baseGmsClient;
        this.f3740d = i;
        this.f3741e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo21782a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f3740d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo21785g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.f3742f
            r3.m4358n0(r0, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.mo21784f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.f3742f
            r3.m4358n0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f3741e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f3740d
            r3.<init>(r0, r1)
            r2.mo21784f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zza.mo21782a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo21783b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo21784f(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo21785g();
}
