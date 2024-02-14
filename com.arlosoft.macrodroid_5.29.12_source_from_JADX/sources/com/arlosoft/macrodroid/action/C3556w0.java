package com.arlosoft.macrodroid.action;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.action.w0 */
/* compiled from: BluetoothTetheringAction.kt */
public final class C3556w0 implements BluetoothProfile.ServiceListener {

    /* renamed from: d */
    public static final C3557a f9454d = new C3557a((C13695i) null);

    /* renamed from: a */
    private final int f9455a;

    /* renamed from: b */
    private final boolean f9456b;

    /* renamed from: c */
    private final BluetoothAdapter f9457c;

    /* renamed from: com.arlosoft.macrodroid.action.w0$a */
    /* compiled from: BluetoothTetheringAction.kt */
    public static final class C3557a {
        private C3557a() {
        }

        public /* synthetic */ C3557a(C13695i iVar) {
            this();
        }
    }

    public C3556w0(int i, boolean z, BluetoothAdapter bluetoothAdapter) {
        this.f9455a = i;
        this.f9456b = z;
        this.f9457c = bluetoothAdapter;
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        boolean z;
        BluetoothAdapter bluetoothAdapter;
        C13706o.m87929f(bluetoothProfile, "proxy");
        try {
            int i2 = this.f9455a;
            if (i2 != 0) {
                if (i2 != 1) {
                    Object invoke = bluetoothProfile.getClass().getMethod("isTetheringOn", new Class[0]).invoke(bluetoothProfile, new Object[0]);
                    C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) invoke).booleanValue()) {
                    }
                }
                z = false;
                Class<?> cls = bluetoothProfile.getClass();
                Class cls2 = Boolean.TYPE;
                C13706o.m87928e(cls2, "TYPE");
                cls.getMethod("setBluetoothTethering", new Class[]{cls2}).invoke(bluetoothProfile, new Object[]{Boolean.valueOf(z)});
                if (!this.f9456b && !z && (bluetoothAdapter = this.f9457c) != null) {
                    bluetoothAdapter.disable();
                    return;
                }
                return;
            }
            z = true;
            Class<?> cls3 = bluetoothProfile.getClass();
            Class cls22 = Boolean.TYPE;
            C13706o.m87928e(cls22, "TYPE");
            cls3.getMethod("setBluetoothTethering", new Class[]{cls22}).invoke(bluetoothProfile, new Object[]{Boolean.valueOf(z)});
            if (!this.f9456b) {
            }
        } catch (Exception e) {
            C4878b.m18868g("Bluetooth tethering action failed: " + e);
        }
    }

    public void onServiceDisconnected(int i) {
    }
}
