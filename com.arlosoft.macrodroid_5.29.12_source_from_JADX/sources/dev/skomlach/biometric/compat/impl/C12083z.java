package dev.skomlach.biometric.compat.impl;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: dev.skomlach.biometric.compat.impl.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12083z implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f58326a;

    public /* synthetic */ C12083z(Context context) {
        this.f58326a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SensorBlockedFallbackFragment.m101332onAttach$lambda2(this.f58326a, dialogInterface, i);
    }
}
