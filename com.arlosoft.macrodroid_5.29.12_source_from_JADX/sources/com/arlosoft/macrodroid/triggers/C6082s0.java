package com.arlosoft.macrodroid.triggers;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.beacons.BeaconWithName;
import p019c1.C2259a;
import p081e1.C7264a;

/* renamed from: com.arlosoft.macrodroid.triggers.s0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6082s0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2259a f14400a;

    /* renamed from: c */
    public final /* synthetic */ BeaconWithName f14401c;

    /* renamed from: d */
    public final /* synthetic */ C7264a f14402d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14403f;

    public /* synthetic */ C6082s0(C2259a aVar, BeaconWithName beaconWithName, C7264a aVar2, AppCompatDialog appCompatDialog) {
        this.f14400a = aVar;
        this.f14401c = beaconWithName;
        this.f14402d = aVar2;
        this.f14403f = appCompatDialog;
    }

    public final void onClick(View view) {
        BluetoothBeaconTrigger.m21686M3(this.f14400a, this.f14401c, this.f14402d, this.f14403f, view);
    }
}
