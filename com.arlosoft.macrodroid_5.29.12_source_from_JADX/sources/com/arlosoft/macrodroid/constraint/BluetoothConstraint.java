package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p112j2.C7439d0;
import p123l1.C7611g;
import p148q0.C8151a;

public class BluetoothConstraint extends Constraint {
    public static final Parcelable.Creator<BluetoothConstraint> CREATOR = new C4119c();
    private static final int ENABLE_BT_REQUEST = 1010;
    /* access modifiers changed from: private */
    public static final Set<C4121e> s_connectedDevices = new HashSet();
    /* access modifiers changed from: private */
    public static final Object s_connectedDevicesLock = new Object();
    private static int s_constraintCounter;
    private static BroadcastReceiver s_receiver;
    private boolean m_anyDevice;
    private transient BluetoothAdapter m_btAdapter;
    private int m_btState;
    /* access modifiers changed from: private */
    public final transient BroadcastReceiver m_connectReceiver;
    private transient boolean m_constraintCheckingEnabled;
    private String m_deviceAddress;
    private String m_deviceName;

    /* renamed from: com.arlosoft.macrodroid.constraint.BluetoothConstraint$a */
    class C4117a implements BluetoothProfile.ServiceListener {

        /* renamed from: a */
        final /* synthetic */ BluetoothAdapter f10700a;

        C4117a(BluetoothAdapter bluetoothAdapter) {
            this.f10700a = bluetoothAdapter;
        }

        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            synchronized (BluetoothConstraint.s_connectedDevicesLock) {
                try {
                    List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
                    if (!(connectedDevices == null || connectedDevices.size() == 0)) {
                        for (BluetoothDevice next : connectedDevices) {
                            BluetoothConstraint.s_connectedDevices.add(new C4121e(next.getName(), next.getAddress()));
                        }
                    }
                } catch (SecurityException e) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        C4878b.m18868g("Could not detect bluetooth devices: " + e.toString());
                        C7439d0.m30909o0(BluetoothConstraint.this.mo27827K0(), "android.permission.BLUETOOTH_CONNECT", BluetoothConstraint.this.mo25559a1(), true, false);
                    }
                }
            }
            this.f10700a.closeProfileProxy(i, bluetoothProfile);
        }

        public void onServiceDisconnected(int i) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.BluetoothConstraint$b */
    class C4118b extends BroadcastReceiver {
        C4118b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
                BluetoothConstraint.this.m16222l3();
                try {
                    MacroDroidApplication.m14845u().unregisterReceiver(BluetoothConstraint.this.m_connectReceiver);
                } catch (Exception e) {
                    C8151a.m33873n(e);
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.BluetoothConstraint$c */
    class C4119c implements Parcelable.Creator<BluetoothConstraint> {
        C4119c() {
        }

        /* renamed from: a */
        public BluetoothConstraint createFromParcel(Parcel parcel) {
            return new BluetoothConstraint(parcel, (C4117a) null);
        }

        /* renamed from: b */
        public BluetoothConstraint[] newArray(int i) {
            return new BluetoothConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.BluetoothConstraint$d */
    private class C4120d extends BroadcastReceiver {
        private C4120d() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            synchronized (BluetoothConstraint.s_connectedDevicesLock) {
                char c = 65535;
                if (action.hashCode() == -1530327060) {
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        c = 0;
                    }
                }
                if (c != 0) {
                    C4121e eVar = new C4121e(bluetoothDevice.getName(), bluetoothDevice.getAddress());
                    if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
                        BluetoothConstraint.s_connectedDevices.add(eVar);
                    } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                        BluetoothConstraint.s_connectedDevices.remove(eVar);
                    }
                } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 10) {
                    BluetoothConstraint.s_connectedDevices.clear();
                }
            }
        }

        /* synthetic */ C4120d(BluetoothConstraint bluetoothConstraint, C4117a aVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.BluetoothConstraint$e */
    private class C4121e {

        /* renamed from: a */
        public String f10704a;

        /* renamed from: b */
        public String f10705b;

        public C4121e(String str, String str2) {
            this.f10704a = str;
            this.f10705b = str2;
        }

        /* renamed from: a */
        private boolean m16241a(String str, String str2) {
            return str == null ? str2 == null : str.equals(str2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4121e)) {
                return false;
            }
            C4121e eVar = (C4121e) obj;
            if (!m16241a(eVar.f10704a, this.f10704a) || !m16241a(eVar.f10705b, this.f10705b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f10704a;
            int i = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
            String str2 = this.f10705b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }
    }

    /* synthetic */ BluetoothConstraint(Parcel parcel, C4117a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public void m16222l3() {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        if (mo27836X()) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            String str3 = "Any Device";
            int i = 0;
            if (!defaultAdapter.isEnabled()) {
                C8151a.m33873n(new RuntimeException("BluetoothConstraint: Bluetooth not enabled for device selection dialog"));
                strArr3 = new String[1];
                strArr2 = new String[1];
                int i2 = this.m_btState;
                if (i2 != 2) {
                    str3 = "All Devices";
                }
                strArr3[0] = str3;
                strArr2[0] = i2 == 2 ? C4061t1.f10622b : C4061t1.f10623c;
                strArr = new String[]{null};
            } else {
                try {
                    Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
                    String[] strArr4 = new String[(bondedDevices.size() + 1)];
                    String[] strArr5 = new String[(bondedDevices.size() + 1)];
                    String[] strArr6 = new String[(bondedDevices.size() + 1)];
                    int i3 = this.m_btState;
                    if (i3 != 2) {
                        str3 = "All Devices";
                    }
                    strArr4[0] = str3;
                    strArr5[0] = null;
                    strArr6[0] = i3 == 2 ? C4061t1.f10622b : C4061t1.f10623c;
                    int i4 = 0;
                    int i5 = 1;
                    for (BluetoothDevice next : bondedDevices) {
                        strArr4[i5] = next.getName();
                        strArr5[i5] = next.getAddress();
                        strArr6[i5] = next.getName() + "\n(" + next.getAddress() + ")";
                        if (this.m_deviceName.equals(strArr4[i5]) && ((str2 = this.m_deviceAddress) == null || str2.equals(strArr5[i5]))) {
                            i4 = i5;
                        }
                        i5++;
                    }
                    strArr3 = strArr4;
                    i = i4;
                    strArr = strArr5;
                    strArr2 = strArr6;
                } catch (SecurityException e) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        C4878b.m18868g("Could not detect bluetooth devices: " + e.toString());
                        C7439d0.m30909o0(mo27827K0(), "android.permission.BLUETOOTH_CONNECT", mo25559a1(), true, false);
                        return;
                    }
                    return;
                }
            }
            if (this.m_btState == 2) {
                str = mo27827K0().getString(C17541R$string.constraint_bluetooth_option_connected);
            } else {
                str = mo27827K0().getString(C17541R$string.constraint_bluetooth_option_not_connected);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((CharSequence) str);
            builder.setSingleChoiceItems((CharSequence[]) strArr2, i, (DialogInterface.OnClickListener) null);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4266i(this, strArr3, strArr));
            try {
                builder.create().show();
            } catch (WindowManager.BadTokenException unused) {
            }
        }
    }

    /* renamed from: m3 */
    private void m16223m3() {
        MacroDroidApplication.m14845u().registerReceiver(this.m_connectReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        mo27850j0().startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1010);
    }

    /* renamed from: n3 */
    private String[] m16224n3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_bluetooth_option_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_bluetooth_option_disabled), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_bluetooth_option_connected), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_bluetooth_option_not_connected)};
    }

    /* renamed from: o3 */
    private void m16225o3() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        C4117a aVar = new C4117a(defaultAdapter);
        if (defaultAdapter != null) {
            defaultAdapter.getProfileProxy(mo27827K0(), aVar, 2);
            defaultAdapter.getProfileProxy(mo27827K0(), aVar, 7);
            defaultAdapter.getProfileProxy(mo27827K0(), aVar, 8);
            defaultAdapter.getProfileProxy(mo27827K0(), aVar, 3);
            try {
                defaultAdapter.getProfileProxy(mo27827K0(), aVar, 1);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m16226p3(String[] strArr, String[] strArr2, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        this.m_anyDevice = checkedItemPosition == 0;
        this.m_deviceName = strArr[checkedItemPosition];
        this.m_deviceAddress = strArr2[checkedItemPosition];
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
            return m16224n3()[0];
        }
        if (i == 1) {
            return m16224n3()[1];
        }
        if (i == 2) {
            return m16224n3()[2];
        }
        if (i == 3) {
            return m16224n3()[3];
        }
        C8151a.m33873n(new RuntimeException("BluetoothConstraint Invalid Bluetooth State"));
        return "Error";
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_btState;
        if (!(i == 0 || i == 1)) {
            if (i == 2 || i == 3) {
                String str = this.m_deviceName;
                if (str != null) {
                    if (str.equals("All Devices")) {
                        return C4061t1.f10623c;
                    }
                    if (this.m_deviceName.equals("Any Device")) {
                        return C4061t1.f10622b;
                    }
                    return this.m_deviceName;
                }
            } else {
                C8151a.m33873n(new RuntimeException("BluetoothConstraint: Invalid bluetooth option"));
                return "";
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ca, code lost:
        if (r8.m_btState != 3) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cc, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00cd, code lost:
        return false;
     */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo r9) {
        /*
            r8 = this;
            boolean r9 = r8.m_constraintCheckingEnabled
            if (r9 != 0) goto L_0x0011
            java.lang.String r9 = "Attempting to check BT state when constraint is disabled"
            java.lang.Long r0 = r8.mo27840Y0()
            long r0 = r0.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r9, r0)
        L_0x0011:
            android.bluetooth.BluetoothAdapter r9 = r8.m_btAdapter
            if (r9 != 0) goto L_0x0027
            android.content.Context r9 = r8.mo27827K0()
            java.lang.String r0 = "bluetooth"
            java.lang.Object r9 = r9.getSystemService(r0)
            android.bluetooth.BluetoothManager r9 = (android.bluetooth.BluetoothManager) r9
            android.bluetooth.BluetoothAdapter r9 = r9.getAdapter()
            r8.m_btAdapter = r9
        L_0x0027:
            android.bluetooth.BluetoothAdapter r9 = r8.m_btAdapter
            r0 = 1
            if (r9 != 0) goto L_0x003a
            java.lang.String r9 = "BT Adapter is null - failing bluetooth constraint check"
            java.lang.Long r1 = r8.mo27840Y0()
            long r1 = r1.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r9, r1)
            return r0
        L_0x003a:
            boolean r9 = r9.isEnabled()
            r1 = 3
            r2 = 0
            if (r9 != 0) goto L_0x004b
            int r9 = r8.m_btState
            if (r9 == r0) goto L_0x004a
            if (r9 != r1) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            return r2
        L_0x004a:
            return r0
        L_0x004b:
            int r9 = r8.m_btState
            if (r9 != r0) goto L_0x0050
            return r2
        L_0x0050:
            if (r9 != 0) goto L_0x0053
            return r0
        L_0x0053:
            java.util.Set<com.arlosoft.macrodroid.constraint.BluetoothConstraint$e> r9 = s_connectedDevices
            int r3 = r9.size()
            r4 = 2
            if (r3 != 0) goto L_0x0064
            int r3 = r8.m_btState
            if (r3 != r1) goto L_0x0061
            return r0
        L_0x0061:
            if (r3 != r4) goto L_0x0064
            return r2
        L_0x0064:
            java.lang.Object r3 = s_connectedDevicesLock
            monitor-enter(r3)
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00ce }
        L_0x006b:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x00c7
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x00ce }
            com.arlosoft.macrodroid.constraint.BluetoothConstraint$e r5 = (com.arlosoft.macrodroid.constraint.BluetoothConstraint.C4121e) r5     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x006b
            java.lang.String r6 = r8.m_deviceName     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x006b
            java.lang.String r7 = r5.f10704a     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x00b1
            boolean r6 = r8.m_anyDevice     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x00b1
            java.lang.String r6 = r8.m_deviceName     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = com.arlosoft.macrodroid.common.C4061t1.f10622b     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x00b1
            java.lang.String r6 = r8.m_deviceName     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = "Any Device"
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x00b1
            java.lang.String r6 = r8.m_deviceName     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = com.arlosoft.macrodroid.common.C4061t1.f10623c     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x00b1
            java.lang.String r6 = r8.m_deviceName     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = "All Devices"
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x006b
        L_0x00b1:
            java.lang.String r6 = r8.m_deviceAddress     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x00bd
            java.lang.String r5 = r5.f10705b     // Catch:{ all -> 0x00ce }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x006b
        L_0x00bd:
            int r5 = r8.m_btState     // Catch:{ all -> 0x00ce }
            if (r5 != r1) goto L_0x00c3
            monitor-exit(r3)     // Catch:{ all -> 0x00ce }
            return r2
        L_0x00c3:
            if (r5 != r4) goto L_0x006b
            monitor-exit(r3)     // Catch:{ all -> 0x00ce }
            return r0
        L_0x00c7:
            monitor-exit(r3)     // Catch:{ all -> 0x00ce }
            int r9 = r8.m_btState
            if (r9 != r1) goto L_0x00cd
            return r0
        L_0x00cd:
            return r2
        L_0x00ce:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ce }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.BluetoothConstraint.mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7611g.m31693u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo28052T2() {
        if (this.m_constraintCheckingEnabled) {
            this.m_constraintCheckingEnabled = false;
            int i = s_constraintCounter - 1;
            s_constraintCounter = i;
            if (i == 0) {
                try {
                    MacroDroidApplication.m14845u().unregisterReceiver(s_receiver);
                } catch (Exception e) {
                    C8151a.m33873n(e);
                }
                s_receiver = null;
            }
        }
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

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
        if (!this.m_constraintCheckingEnabled) {
            this.m_constraintCheckingEnabled = true;
            if (s_constraintCounter == 0) {
                s_receiver = new C4120d(this, (C4117a) null);
                IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED");
                intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                intentFilter.setPriority(1000);
                MacroDroidApplication.m14845u().registerReceiver(s_receiver, intentFilter);
                m16225o3();
            }
            s_constraintCounter++;
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_CONNECT"} : new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16224n3();
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
                m16222l3();
            } else {
                m16223m3();
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_btState);
        parcel.writeString(this.m_deviceName);
        parcel.writeInt(this.m_anyDevice ? 1 : 0);
        parcel.writeInt(this.m_constraintCheckingEnabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_btState = i;
    }

    public BluetoothConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public BluetoothConstraint() {
        this.m_connectReceiver = new C4118b();
        this.m_btState = 0;
        this.m_deviceName = "Any Device";
    }

    private BluetoothConstraint(Parcel parcel) {
        super(parcel);
        this.m_connectReceiver = new C4118b();
        this.m_btState = parcel.readInt();
        this.m_deviceName = parcel.readString();
        boolean z = true;
        this.m_anyDevice = parcel.readInt() != 0;
        this.m_constraintCheckingEnabled = parcel.readInt() == 0 ? false : z;
    }
}
