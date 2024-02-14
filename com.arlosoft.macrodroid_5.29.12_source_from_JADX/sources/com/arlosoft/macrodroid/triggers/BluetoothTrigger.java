package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.BluetoothTriggerReceiver;
import java.util.Set;
import p119k3.C7526l;
import p148q0.C8151a;

public class BluetoothTrigger extends Trigger {
    public static final Parcelable.Creator<BluetoothTrigger> CREATOR = new C5610a();
    private static final int ENABLE_BT_REQUEST = 1010;
    private static final String SELECT_DEVICE = MacroDroidApplication.m14845u().getString(C17541R$string.select_device);
    private static BluetoothTriggerReceiver s_bluetoothReceiver;
    private static int s_triggerCounter;
    private boolean m_anyDevice;
    private int m_btState;
    private String m_deviceAddress;
    private String m_deviceName;

    /* renamed from: com.arlosoft.macrodroid.triggers.BluetoothTrigger$a */
    class C5610a implements Parcelable.Creator<BluetoothTrigger> {
        C5610a() {
        }

        /* renamed from: a */
        public BluetoothTrigger createFromParcel(Parcel parcel) {
            return new BluetoothTrigger(parcel, (C5610a) null);
        }

        /* renamed from: b */
        public BluetoothTrigger[] newArray(int i) {
            return new BluetoothTrigger[i];
        }
    }

    /* synthetic */ BluetoothTrigger(Parcel parcel, C5610a aVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private void m21727i3() {
        String[] strArr;
        String[] strArr2;
        CharSequence[] charSequenceArr;
        String str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        int i = 0;
        int i2 = 1;
        if (!defaultAdapter.isEnabled()) {
            C8151a.m33873n(new RuntimeException("Bluetooth not enabled for device selection dialog"));
            strArr2 = new String[]{"Any Device"};
            strArr = new String[]{null};
            charSequenceArr = new CharSequence[]{C4061t1.f10622b};
        } else {
            Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
            strArr2 = new String[(bondedDevices.size() + 1)];
            String[] strArr3 = new String[(bondedDevices.size() + 1)];
            CharSequence[] charSequenceArr2 = new CharSequence[(bondedDevices.size() + 1)];
            strArr2[0] = "Any Device";
            strArr3[0] = null;
            charSequenceArr2[0] = C4061t1.f10622b;
            for (BluetoothDevice next : bondedDevices) {
                strArr2[i2] = next.getName();
                strArr3[i2] = next.getAddress();
                charSequenceArr2[i2] = Html.fromHtml(next.getName() + "\n<small><font color='#999999'>" + next.getAddress() + "</font></small>");
                if (this.m_deviceName.equals(next.getName()) && ((str = this.m_deviceAddress) == null || str.equals(next.getAddress()))) {
                    i = i2;
                }
                i2++;
            }
            strArr = strArr3;
            charSequenceArr = charSequenceArr2;
        }
        String j1 = SelectableItem.m15535j1(this.m_btState == 2 ? C17541R$string.trigger_bluetooth_device_connected : C17541R$string.trigger_bluetooth_device_disconnected);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) j1);
        builder.setSingleChoiceItems(charSequenceArr, i, (DialogInterface.OnClickListener) new C6194y0(this, strArr2, strArr));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6182x0(this));
        builder.create().show();
    }

    /* renamed from: l3 */
    private String[] m21728l3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_bluetooth_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_bluetooth_disabled), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_bluetooth_device_connected), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_bluetooth_device_disconnected)};
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m21729o3(String[] strArr, String[] strArr2, DialogInterface dialogInterface, int i) {
        this.m_anyDevice = i == 0;
        this.m_deviceName = strArr[i];
        this.m_deviceAddress = strArr2[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m21730p3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_btState;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        int i = this.m_btState;
        if (i == 0) {
            return m21728l3()[0];
        }
        if (i == 1) {
            return m21728l3()[1];
        }
        if (i == 2) {
            return m21728l3()[2];
        }
        if (i == 3) {
            return m21728l3()[3];
        }
        C8151a.m33873n(new RuntimeException("Invalid Bluetooth State"));
        return "Error";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r3.m_btState;
     */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24824M1() {
        /*
            r3 = this;
            java.lang.String r0 = r3.m_deviceName
            r1 = 1
            if (r0 == 0) goto L_0x0014
            int r2 = r3.m_btState
            if (r2 == 0) goto L_0x0015
            if (r2 == r1) goto L_0x0015
            java.lang.String r2 = SELECT_DEVICE
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.BluetoothTrigger.mo24824M1():boolean");
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_btState;
        if (i == 0 || i == 1) {
            return "";
        }
        if (i != 2 && i != 3) {
            C8151a.m33873n(new RuntimeException("Invalid bluetooth option"));
            return "";
        } else if (this.m_deviceName.equals("Any Device")) {
            return C4061t1.f10622b;
        } else {
            return this.m_deviceName;
        }
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_bluetoothReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_bluetoothReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7526l.m31309u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        String str;
        String O0 = mo24672O0();
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        if (TextUtils.isEmpty(O0)) {
            str = "";
        } else {
            str = " (" + O0 + ")";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_bluetoothReceiver = new BluetoothTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_bluetoothReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            MacroDroidApplication.m14845u().registerReceiver(s_bluetoothReceiver, new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED"));
            MacroDroidApplication.m14845u().registerReceiver(s_bluetoothReceiver, new IntentFilter("android.bluetooth.device.action.ACL_DISCONNECTED"));
        }
        s_triggerCounter++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, "test device name");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_CONNECT"} : new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21728l3();
    }

    /* renamed from: j3 */
    public String mo30973j3() {
        return this.m_deviceAddress;
    }

    /* renamed from: k3 */
    public String mo30974k3() {
        return this.m_deviceName;
    }

    /* renamed from: m3 */
    public int mo30975m3() {
        return this.m_btState;
    }

    /* renamed from: n3 */
    public boolean mo30976n3() {
        return this.m_anyDevice;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == 1010 && i2 == -1) {
            m21727i3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_btState;
        if (i == 0 || i == 1) {
            mo24689O1();
        } else if (i != 2 && i != 3) {
        } else {
            if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                m21727i3();
                return;
            }
            mo27850j0().startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1010);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_btState);
        parcel.writeString(this.m_deviceName);
        parcel.writeString(this.m_deviceAddress);
        parcel.writeInt(this.m_anyDevice ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_btState = i;
    }

    public BluetoothTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private BluetoothTrigger() {
        this.m_btState = 0;
        this.m_deviceName = "Any Device";
    }

    private BluetoothTrigger(Parcel parcel) {
        super(parcel);
        this.m_btState = parcel.readInt();
        this.m_deviceName = parcel.readString();
        this.m_deviceAddress = parcel.readString();
        this.m_anyDevice = parcel.readInt() != 0;
    }
}
