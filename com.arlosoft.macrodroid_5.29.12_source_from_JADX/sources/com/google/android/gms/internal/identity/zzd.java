package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public final class zzd extends zzf {

    /* renamed from: a */
    private final int f41072a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public Activity f41073c;

    public zzd(int i, Activity activity) {
        this.f41072a = i;
        this.f41073c = activity;
    }

    /* renamed from: G7 */
    public final void mo50497G7(int i, Bundle bundle) {
        PendingIntent createPendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.f41073c;
            if (activity != null && (createPendingResult = activity.createPendingResult(this.f41072a, intent, BasicMeasure.EXACTLY)) != null) {
                try {
                    createPendingResult.send(1);
                } catch (PendingIntent.CanceledException e) {
                    Log.w("AddressClientImpl", "Exception settng pending result", e);
                }
            }
        } else {
            ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
            if (connectionResult.mo21136o2()) {
                try {
                    connectionResult.mo21138q2((Activity) Preconditions.m4488k(this.f41073c), this.f41072a);
                } catch (IntentSender.SendIntentException e2) {
                    Log.w("AddressClientImpl", "Exception starting pending intent", e2);
                }
            } else {
                try {
                    PendingIntent createPendingResult2 = ((Activity) Preconditions.m4488k(this.f41073c)).createPendingResult(this.f41072a, new Intent(), BasicMeasure.EXACTLY);
                    if (createPendingResult2 != null) {
                        createPendingResult2.send(1);
                    }
                } catch (PendingIntent.CanceledException e3) {
                    Log.w("AddressClientImpl", "Exception setting pending result", e3);
                }
            }
        }
    }
}
