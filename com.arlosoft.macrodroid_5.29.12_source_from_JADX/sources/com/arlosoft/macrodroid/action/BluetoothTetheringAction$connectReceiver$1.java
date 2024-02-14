package com.arlosoft.macrodroid.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import kotlin.jvm.internal.C13706o;

/* compiled from: BluetoothTetheringAction.kt */
public final class BluetoothTetheringAction$connectReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ BluetoothTetheringAction f7152a;

    BluetoothTetheringAction$connectReceiver$1(BluetoothTetheringAction bluetoothTetheringAction) {
        this.f7152a = bluetoothTetheringAction;
    }

    public void onReceive(Context context, Intent intent) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        if (C13706o.m87924a(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
            try {
                MacroDroidApplication.f9883I.mo27303b().unregisterReceiver(this);
            } catch (Exception unused) {
            }
            BluetoothTetheringAction bluetoothTetheringAction = this.f7152a;
            bluetoothTetheringAction.mo24782n3(bluetoothTetheringAction.option, false);
        }
    }
}
