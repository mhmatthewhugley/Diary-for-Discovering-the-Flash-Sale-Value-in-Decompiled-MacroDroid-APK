package dev.skomlach.biometric.compat.impl;

import android.content.DialogInterface;

/* renamed from: dev.skomlach.biometric.compat.impl.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12044a0 implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ SensorBlockedFallbackFragment f58259a;

    public /* synthetic */ C12044a0(SensorBlockedFallbackFragment sensorBlockedFallbackFragment) {
        this.f58259a = sensorBlockedFallbackFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        SensorBlockedFallbackFragment.m101333onAttach$lambda3(this.f58259a, dialogInterface);
    }
}
