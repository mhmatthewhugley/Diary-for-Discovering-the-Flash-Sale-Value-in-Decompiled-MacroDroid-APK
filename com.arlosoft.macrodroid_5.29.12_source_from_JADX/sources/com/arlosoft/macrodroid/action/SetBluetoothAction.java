package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6381g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p112j2.C7439d0;
import p128m0.C7757h3;
import p148q0.C8151a;
import p319lc.C15626c;

public class SetBluetoothAction extends Action implements C6381g.C6382a {
    public static final Parcelable.Creator<SetBluetoothAction> CREATOR = new C2628b();
    private static final int STATE_CONNECT_TO_AUDIO_DEVICE = 3;
    private static final int STATE_DISCONNECT_AUDIO_DEVICE = 4;
    private static final String TAG = "TAG";
    private transient BluetoothAdapter mAdapter;
    /* access modifiers changed from: private */
    public final transient BroadcastReceiver m_connectReceiver;
    /* access modifiers changed from: private */
    public transient boolean m_connectToDevice;
    private String m_deviceAddress;
    private String m_deviceName;
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SetBluetoothAction$a */
    class C2627a extends BroadcastReceiver {
        C2627a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
                try {
                    MacroDroidApplication.m14845u().unregisterReceiver(SetBluetoothAction.this.m_connectReceiver);
                } catch (Exception unused) {
                }
                if (SetBluetoothAction.this.m_connectToDevice) {
                    new C6381g(SetBluetoothAction.this).mo32422a(SetBluetoothAction.this.mo27827K0(), SetBluetoothAction.this.mo25594x3());
                } else {
                    SetBluetoothAction.this.m12325q3();
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetBluetoothAction$b */
    class C2628b implements Parcelable.Creator<SetBluetoothAction> {
        C2628b() {
        }

        /* renamed from: a */
        public SetBluetoothAction createFromParcel(Parcel parcel) {
            return new SetBluetoothAction(parcel, (C2627a) null);
        }

        /* renamed from: b */
        public SetBluetoothAction[] newArray(int i) {
            return new SetBluetoothAction[i];
        }
    }

    /* synthetic */ SetBluetoothAction(Parcel parcel, C2627a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m12315A3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public void m12325q3() {
        String str;
        AlertDialog.Builder builder;
        String str2;
        String str3;
        if (mo27836X()) {
            Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
            ArrayList arrayList = new ArrayList();
            ArrayList<BluetoothDevice> arrayList2 = new ArrayList<>();
            C4878b.m18880s("** CHECKING BT DEVICES **", mo27840Y0().longValue());
            for (BluetoothDevice next : bondedDevices) {
                if (next != null) {
                    C4878b.m18880s("FOUND BT Device - " + next.getName() + " (" + next.getAddress() + ")", mo27840Y0().longValue());
                    if (next.getBluetoothClass() != null) {
                        C4878b.m18880s("MAJOR CLASS = " + next.getBluetoothClass().getMajorDeviceClass(), mo27840Y0().longValue());
                        C4878b.m18880s("DEVICE CLASS = " + next.getBluetoothClass().getDeviceClass(), mo27840Y0().longValue());
                    }
                    if (next.getBluetoothClass() == null || next.getBluetoothClass().getMajorDeviceClass() != 1024) {
                        C4878b.m18880s("ADDING other device as possible option", mo27840Y0().longValue());
                        arrayList2.add(next);
                    } else {
                        arrayList.add(next);
                        C4878b.m18880s("ADDING audio device as option", mo27840Y0().longValue());
                    }
                }
            }
            String[] strArr = new String[(arrayList.size() + arrayList2.size())];
            String[] strArr2 = new String[(arrayList.size() + arrayList2.size())];
            CharSequence[] charSequenceArr = new CharSequence[(arrayList.size() + arrayList2.size())];
            Iterator it = arrayList.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                str = "?";
                if (!it.hasNext()) {
                    break;
                }
                BluetoothDevice bluetoothDevice = (BluetoothDevice) it.next();
                String name = bluetoothDevice.getName();
                if (name != null) {
                    str = name;
                }
                strArr[i] = str;
                strArr[i] = bluetoothDevice.getName();
                strArr2[i] = bluetoothDevice.getAddress();
                charSequenceArr[i] = Html.fromHtml(bluetoothDevice.getName() + "\n<small><font color='#999999'>" + bluetoothDevice.getAddress() + "</font></small>");
                if (this.m_deviceName.equals(strArr[i]) && ((str3 = this.m_deviceAddress) == null || str3.equals(strArr2[i]))) {
                    i2 = i;
                }
                i++;
            }
            for (BluetoothDevice bluetoothDevice2 : arrayList2) {
                String name2 = bluetoothDevice2.getName();
                if (name2 == null) {
                    name2 = str;
                }
                strArr[i] = name2;
                strArr[i] = bluetoothDevice2.getName();
                strArr2[i] = bluetoothDevice2.getAddress();
                charSequenceArr[i] = Html.fromHtml("* " + bluetoothDevice2.getName() + "\n<small><font color='#999999'>" + bluetoothDevice2.getAddress() + "</font></small>");
                if (this.m_deviceName.equals(strArr[i]) && ((str2 = this.m_deviceAddress) == null || str2.equals(strArr2[i]))) {
                    i2 = i;
                }
                i++;
            }
            if (arrayList.size() > 0) {
                this.m_deviceName = strArr[i2];
                this.m_deviceAddress = strArr2[i2];
            }
            Activity j0 = mo27850j0();
            if (arrayList.size() > 0) {
                builder = new AlertDialog.Builder(j0, mo24705l0());
                builder.setTitle(this.m_state == 3 ? C17541R$string.connect_to : C17541R$string.disconnect_from);
                builder.setSingleChoiceItems(charSequenceArr, i2, (DialogInterface.OnClickListener) new C3089gg(this, strArr, strArr2));
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3061fg(this));
            } else {
                builder = new AlertDialog.Builder(j0, mo24705l0());
                builder.setTitle((int) C17541R$string.action_set_bluetooth_no_devices);
                builder.setMessage((int) C17541R$string.action_set_bluetooth_none_paired);
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C3145ig.f8497a);
            }
            builder.create().show();
            if (!arrayList2.isEmpty()) {
                C15626c.makeText(mo27827K0(), C17541R$string.bluetooth_audio_device_warning, 1).show();
            }
        }
    }

    /* renamed from: r3 */
    private void m12326r3() {
        BluetoothAdapter x3 = mo25594x3();
        if (!x3.isEnabled()) {
            this.m_connectToDevice = true;
            MacroDroidApplication.m14845u().registerReceiver(this.m_connectReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            x3.enable();
            return;
        }
        new C6381g(this).mo32422a(mo27827K0(), x3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0027 */
    /* renamed from: s3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12327s3() {
        /*
            r3 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ ActivityNotFoundException -> 0x0027 }
            java.lang.String r1 = "android.bluetooth.adapter.action.STATE_CHANGED"
            r0.<init>(r1)     // Catch:{ ActivityNotFoundException -> 0x0027 }
            com.arlosoft.macrodroid.app.MacroDroidApplication r1 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ ActivityNotFoundException -> 0x0027 }
            android.content.BroadcastReceiver r2 = r3.m_connectReceiver     // Catch:{ ActivityNotFoundException -> 0x0027 }
            r1.registerReceiver(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x0027 }
            r0 = 0
            r3.m_connectToDevice = r0     // Catch:{ ActivityNotFoundException -> 0x0027 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0027 }
            java.lang.String r1 = "android.bluetooth.adapter.action.REQUEST_ENABLE"
            r0.<init>(r1)     // Catch:{ ActivityNotFoundException -> 0x0027 }
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)     // Catch:{ ActivityNotFoundException -> 0x0027 }
            android.content.Context r1 = r3.mo27827K0()     // Catch:{ ActivityNotFoundException -> 0x0027 }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0027 }
            goto L_0x0050
        L_0x0027:
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x0030 }
            android.content.BroadcastReceiver r1 = r3.m_connectReceiver     // Catch:{ Exception -> 0x0030 }
            r0.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            android.app.Activity r1 = r3.mo27850j0()
            r0.<init>(r1)
            r1 = 2131954168(0x7f1309f8, float:1.9544828E38)
            r0.setTitle((int) r1)
            r1 = 2131953129(0x7f1305e9, float:1.954272E38)
            r0.setMessage((int) r1)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            com.arlosoft.macrodroid.action.hg r2 = com.arlosoft.macrodroid.action.C3117hg.f8437a
            r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r0.show()
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetBluetoothAction.m12327s3():void");
    }

    /* renamed from: t3 */
    private static BluetoothDevice m12328t3(BluetoothAdapter bluetoothAdapter, String str, String str2) {
        for (BluetoothDevice next : m12330v3(bluetoothAdapter)) {
            if (!(str == null || next.getName() == null || !str.equals(next.getName()))) {
                if (str2 == null || str2.equals(next.getAddress())) {
                    String.format("Found device with name %s and address %s.", new Object[]{next.getName(), next.getAddress()});
                    return next;
                }
            }
        }
        Log.w(TAG, String.format("Unable to find device with name %s.", new Object[]{str}));
        return null;
    }

    /* renamed from: u3 */
    private String[] m12329u3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_bluetooth_enable), SelectableItem.m15535j1(C17541R$string.action_set_bluetooth_bluetooth), SelectableItem.m15535j1(C17541R$string.action_set_bluetooth_toggle), SelectableItem.m15535j1(C17541R$string.action_set_bluetooth_connect), SelectableItem.m15535j1(C17541R$string.action_set_bluetooth_disconnect)};
    }

    /* renamed from: v3 */
    private static Set<BluetoothDevice> m12330v3(BluetoothAdapter bluetoothAdapter) {
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        return bondedDevices == null ? new HashSet() : bondedDevices;
    }

    /* renamed from: w3 */
    private Method m12331w3() {
        try {
            return BluetoothA2dp.class.getDeclaredMethod("connect", new Class[]{BluetoothDevice.class});
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: y3 */
    private Method m12332y3() {
        try {
            return BluetoothA2dp.class.getDeclaredMethod("disconnect", new Class[]{BluetoothDevice.class});
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m12333z3(String[] strArr, String[] strArr2, DialogInterface dialogInterface, int i) {
        this.m_deviceName = strArr[i];
        this.m_deviceAddress = strArr2[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_state;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_state >= m12329u3().length) {
            return SelectableItem.m15535j1(C17541R$string.action_set_bluetooth_invalid);
        }
        return m12329u3()[this.m_state];
    }

    /* renamed from: K */
    public void mo25593K(BluetoothA2dp bluetoothA2dp) {
        BluetoothAdapter x3 = mo25594x3();
        int i = this.m_state;
        if (i == 3) {
            Method w3 = m12331w3();
            BluetoothDevice t3 = m12328t3(x3, this.m_deviceName, this.m_deviceAddress);
            if (w3 == null || t3 == null) {
                C4878b.m18868g("Could not connect to audio device. Bluetooth device was null");
                return;
            }
            try {
                w3.setAccessible(true);
                w3.invoke(bluetoothA2dp, new Object[]{t3});
            } catch (InvocationTargetException e) {
                C4878b.m18871j("Unable to invoke connect(BluetoothDevice) method on proxy. %s", e.toString());
            } catch (IllegalAccessException e2) {
                C4878b.m18871j("Illegal Access! %s", e2.toString());
            }
        } else if (i == 4) {
            Method y3 = m12332y3();
            BluetoothDevice t32 = m12328t3(x3, this.m_deviceName, this.m_deviceAddress);
            if (y3 == null || t32 == null) {
                C4878b.m18868g("Could not connect to audio device. Bluetooth device was null");
                return;
            }
            try {
                y3.setAccessible(true);
                y3.invoke(bluetoothA2dp, new Object[]{t32});
            } catch (InvocationTargetException e3) {
                C4878b.m18871j("Unable to invoke connect(BluetoothDevice) method on proxy. %s", e3.toString());
            } catch (IllegalAccessException e4) {
                C4878b.m18871j("Illegal Access! %s", e4.toString());
            }
        }
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return this.m_state < m12329u3().length;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_state;
        if (i == 3 || i == 4) {
            return this.m_deviceName;
        }
        return "";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7757h3.m32373u();
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

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        BluetoothAdapter x3 = mo25594x3();
        if (x3 != null) {
            try {
                int i = this.m_state;
                if (i == 0) {
                    this.mAdapter.enable();
                } else if (i == 1) {
                    this.mAdapter.disable();
                } else if (i != 2) {
                    if (i == 3) {
                        m12326r3();
                    } else if (i == 4) {
                        if (this.mAdapter.isEnabled()) {
                            new C6381g(this).mo32422a(mo27827K0(), x3);
                        }
                    }
                } else if (!this.mAdapter.isEnabled()) {
                    this.mAdapter.enable();
                } else {
                    this.mAdapter.disable();
                }
            } catch (NullPointerException unused) {
                C8151a.m33873n(new RuntimeException("Null pointer in SetBluetooth action - invoke action"));
            } catch (SecurityException e) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C4878b.m18868g("Could not perform bluetooth action: " + e.toString());
                    C7439d0.m30909o0(mo27827K0(), "android.permission.BLUETOOTH_CONNECT", mo25559a1(), true, false);
                }
            }
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_CONNECT"} : new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12329u3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_state;
        if (i != 3 && i != 4) {
            mo24689O1();
        } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            m12325q3();
        } else {
            m12327s3();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
        parcel.writeString(this.m_deviceName);
        parcel.writeString(this.m_deviceAddress);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_state = i;
    }

    /* renamed from: x3 */
    public BluetoothAdapter mo25594x3() {
        if (this.mAdapter == null) {
            this.mAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        return this.mAdapter;
    }

    public SetBluetoothAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetBluetoothAction() {
        this.m_connectReceiver = new C2627a();
        this.m_state = 0;
        this.m_deviceName = "";
        this.m_connectToDevice = false;
    }

    private SetBluetoothAction(Parcel parcel) {
        super(parcel);
        this.m_connectReceiver = new C2627a();
        this.m_state = parcel.readInt();
        this.m_deviceName = parcel.readString();
        this.m_deviceAddress = parcel.readString();
    }
}
