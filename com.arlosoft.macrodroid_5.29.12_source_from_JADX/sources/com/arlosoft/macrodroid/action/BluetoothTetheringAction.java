package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7767j;

/* compiled from: BluetoothTetheringAction.kt */
public final class BluetoothTetheringAction extends Action {
    public static final Parcelable.Creator<BluetoothTetheringAction> CREATOR = new C2339a();

    /* renamed from: d */
    public static final C2340b f7151d = new C2340b((C13695i) null);
    private final transient BroadcastReceiver connectReceiver;
    /* access modifiers changed from: private */
    public int option;

    /* renamed from: com.arlosoft.macrodroid.action.BluetoothTetheringAction$a */
    /* compiled from: BluetoothTetheringAction.kt */
    public static final class C2339a implements Parcelable.Creator<BluetoothTetheringAction> {
        C2339a() {
        }

        /* renamed from: a */
        public BluetoothTetheringAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new BluetoothTetheringAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public BluetoothTetheringAction[] newArray(int i) {
            return new BluetoothTetheringAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.BluetoothTetheringAction$b */
    /* compiled from: BluetoothTetheringAction.kt */
    public static final class C2340b {
        private C2340b() {
        }

        public /* synthetic */ C2340b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m9878b() {
            return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable), SelectableItem.m15535j1(C17541R$string.toggle)};
        }
    }

    public BluetoothTetheringAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ BluetoothTetheringAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private final void m9864l3() {
        BluetoothAdapter m3 = m9865m3();
        if (m3 == null || m3.isEnabled()) {
            mo24782n3(this.option, true);
        } else if (this.option != 1) {
            MacroDroidApplication.f9883I.mo27303b().registerReceiver(this.connectReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            m3.enable();
        }
    }

    /* renamed from: m3 */
    private final BluetoothAdapter m9865m3() {
        BluetoothManager bluetoothManager = (BluetoothManager) mo27827K0().getSystemService("bluetooth");
        if (bluetoothManager != null) {
            return bluetoothManager.getAdapter();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = f7151d.m9878b()[this.option];
        C13706o.m87928e(str, "getOptions()[option]");
        return str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7767j.f18763j.mo37755a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            m9864l3();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public String[] mo24727c1() {
        return Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_CONNECT"} : new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return f7151d.m9878b();
    }

    /* renamed from: n3 */
    public final void mo24782n3(int i, boolean z) {
        BluetoothAdapter m3 = m9865m3();
        try {
            Constructor<?> declaredConstructor = Class.forName("android.bluetooth.BluetoothPan").getDeclaredConstructor(new Class[]{Context.class, BluetoothProfile.ServiceListener.class});
            if (declaredConstructor != null) {
                C13706o.m87928e(declaredConstructor, "bTPanCtor");
                declaredConstructor.setAccessible(true);
                declaredConstructor.newInstance(new Object[]{mo27827K0(), new C3556w0(i, z, m3)});
            }
            Thread.sleep(250);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public BluetoothTetheringAction() {
        this.connectReceiver = new BluetoothTetheringAction$connectReceiver$1(this);
    }

    private BluetoothTetheringAction(Parcel parcel) {
        super(parcel);
        this.connectReceiver = new BluetoothTetheringAction$connectReceiver$1(this);
        this.option = parcel.readInt();
    }
}
