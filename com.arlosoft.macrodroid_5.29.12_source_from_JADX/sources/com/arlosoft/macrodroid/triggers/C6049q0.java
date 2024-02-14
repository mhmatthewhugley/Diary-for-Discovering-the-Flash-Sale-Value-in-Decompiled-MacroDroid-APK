package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.beacons.BeaconWithName;
import p019c1.C2259a;
import p081e1.C7264a;

/* renamed from: com.arlosoft.macrodroid.triggers.q0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6049q0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f14305a;

    /* renamed from: c */
    public final /* synthetic */ BluetoothBeaconTrigger f14306c;

    /* renamed from: d */
    public final /* synthetic */ C2259a f14307d;

    /* renamed from: f */
    public final /* synthetic */ BeaconWithName f14308f;

    /* renamed from: g */
    public final /* synthetic */ EditText f14309g;

    /* renamed from: o */
    public final /* synthetic */ C7264a f14310o;

    /* renamed from: p */
    public final /* synthetic */ AppCompatDialog f14311p;

    public /* synthetic */ C6049q0(EditText editText, BluetoothBeaconTrigger bluetoothBeaconTrigger, C2259a aVar, BeaconWithName beaconWithName, EditText editText2, C7264a aVar2, AppCompatDialog appCompatDialog) {
        this.f14305a = editText;
        this.f14306c = bluetoothBeaconTrigger;
        this.f14307d = aVar;
        this.f14308f = beaconWithName;
        this.f14309g = editText2;
        this.f14310o = aVar2;
        this.f14311p = appCompatDialog;
    }

    public final void onClick(View view) {
        BluetoothBeaconTrigger.m21684K3(this.f14305a, this.f14306c, this.f14307d, this.f14308f, this.f14309g, this.f14310o, this.f14311p, view);
    }
}
