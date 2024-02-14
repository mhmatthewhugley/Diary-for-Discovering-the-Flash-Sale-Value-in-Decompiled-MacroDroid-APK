package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzep extends BroadcastReceiver {
    @VisibleForTesting

    /* renamed from: d */
    static final String f46708d = zzep.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzkt f46709a;

    /* renamed from: b */
    private boolean f46710b;

    /* renamed from: c */
    private boolean f46711c;

    zzep(zzkt zzkt) {
        Preconditions.m4488k(zzkt);
        this.f46709a = zzkt;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo55113b() {
        this.f46709a.mo55526d();
        this.f46709a.mo55185B().mo55073e();
        if (!this.f46710b) {
            this.f46709a.mo55202c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f46711c = this.f46709a.mo55521Y().mo55111k();
            this.f46709a.mo55221z().mo55102t().mo55092b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f46711c));
            this.f46710b = true;
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo55114c() {
        this.f46709a.mo55526d();
        this.f46709a.mo55185B().mo55073e();
        this.f46709a.mo55185B().mo55073e();
        if (this.f46710b) {
            this.f46709a.mo55221z().mo55102t().mo55091a("Unregistering connectivity change receiver");
            this.f46710b = false;
            this.f46711c = false;
            try {
                this.f46709a.mo55202c().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f46709a.mo55221z().mo55098p().mo55092b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        this.f46709a.mo55526d();
        String action = intent.getAction();
        this.f46709a.mo55221z().mo55102t().mo55092b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean k = this.f46709a.mo55521Y().mo55111k();
            if (this.f46711c != k) {
                this.f46711c = k;
                this.f46709a.mo55185B().mo55181x(new zzeo(this, k));
                return;
            }
            return;
        }
        this.f46709a.mo55221z().mo55103u().mo55092b("NetworkBroadcastReceiver received unknown action", action);
    }
}
