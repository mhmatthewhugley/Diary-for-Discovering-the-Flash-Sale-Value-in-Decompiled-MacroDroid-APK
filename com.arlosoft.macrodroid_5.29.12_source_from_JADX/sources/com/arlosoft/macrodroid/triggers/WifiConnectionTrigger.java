package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.SparseBooleanArray;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.WifiConnectionTriggerReceiver;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.util.ArrayList;
import java.util.List;
import p037m.C2009f;
import p112j2.C7439d0;
import p119k3.C7520j2;
import p148q0.C8151a;
import p319lc.C15626c;

public class WifiConnectionTrigger extends Trigger {
    public static final Parcelable.Creator<WifiConnectionTrigger> CREATOR = new C5798b();

    /* renamed from: d */
    public static final String f13749d = SelectableItem.m15535j1(C17541R$string.select_wifi);
    private static int s_triggerCounter;
    private static WifiConnectionTriggerReceiver s_wifiConnectionTriggerReceiver;
    private String m_SSID;
    private List<String> m_SSIDList;
    private final transient BroadcastReceiver m_connectReceiver;
    private transient C2009f m_progressDialog;
    private int m_wifiState;

    /* renamed from: com.arlosoft.macrodroid.triggers.WifiConnectionTrigger$a */
    class C5797a extends BroadcastReceiver {
        C5797a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED") && intent.getIntExtra("wifi_state", 0) == 3) {
                WifiConnectionTrigger.this.m23746q3();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WifiConnectionTrigger$b */
    class C5798b implements Parcelable.Creator<WifiConnectionTrigger> {
        C5798b() {
        }

        /* renamed from: a */
        public WifiConnectionTrigger createFromParcel(Parcel parcel) {
            return new WifiConnectionTrigger(parcel, (C5797a) null);
        }

        /* renamed from: b */
        public WifiConnectionTrigger[] newArray(int i) {
            return new WifiConnectionTrigger[i];
        }
    }

    /* synthetic */ WifiConnectionTrigger(Parcel parcel, C5797a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public void m23749u3(List<WifiConfiguration> list) {
        if (mo27850j0() != null && !((MacroDroidBaseActivity) mo27850j0()).mo27315N1()) {
            if (this.m_progressDialog != null) {
                MacroDroidApplication.m14845u().unregisterReceiver(this.m_connectReceiver);
                this.m_progressDialog.dismiss();
                this.m_progressDialog = null;
            }
            boolean z = true;
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    if (Settings.Secure.getInt(mo27827K0().getContentResolver(), "location_mode") == 0) {
                        C15626c.makeText(mo27827K0(), C17541R$string.location_services_must_be_enabled, 1).show();
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(SelectableItem.m15535j1(C17541R$string.any_network));
            if (list != null) {
                for (WifiConfiguration wifiConfiguration : list) {
                    String str = wifiConfiguration.SSID;
                    if (!(str == null || str == null)) {
                        if (str.startsWith("\"") && str.endsWith("\"")) {
                            str = str.substring(1, str.length() - 1);
                        }
                        arrayList.add(str);
                    }
                }
            }
            String j1 = SelectableItem.m15535j1(this.m_wifiState == 2 ? C17541R$string.trigger_wifi_connection_connected : C17541R$string.trigger_wifi_connection_disconnected);
            int size = arrayList.size();
            String[] strArr = new String[size];
            arrayList.toArray(strArr);
            boolean[] zArr = new boolean[size];
            int i = 0;
            boolean z2 = false;
            while (true) {
                if (i >= size) {
                    z = z2;
                    break;
                }
                String str2 = this.m_SSID;
                if (str2 == null) {
                    for (int i2 = 0; i2 < this.m_SSIDList.size(); i2++) {
                        if (this.m_SSIDList.get(i2).equals(strArr[i])) {
                            zArr[i] = true;
                            z2 = true;
                        }
                    }
                } else if (str2.equals(strArr[i])) {
                    zArr[i] = true;
                    break;
                }
                i++;
            }
            this.m_SSID = null;
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((CharSequence) j1);
            builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) C6047pa.f14303a);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6023na(this, strArr));
            AlertDialog create = builder.create();
            create.show();
            if (!z) {
                create.getButton(-1).setEnabled(false);
            }
        }
    }

    /* renamed from: n3 */
    private void m23744n3() {
        boolean z;
        WifiManager wifiManager = (WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi");
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        MacroDroidApplication.m14845u().registerReceiver(this.m_connectReceiver, intentFilter);
        try {
            if (Build.VERSION.SDK_INT < 29) {
                z = wifiManager.setWifiEnabled(true);
            } else if (C4031k.m15910j()) {
                HelperSystemCommands.m24584g(mo27827K0(), true, "");
                z = true;
            } else {
                C15626c.makeText(mo27827K0(), C17541R$string.enable_wifi_failed, 1).show();
                return;
            }
            if (z) {
                this.m_progressDialog = new C2009f.C2014d(mo27850j0()).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.enabling_wifi).mo24098r(true, 0).mo24084c(false).mo24103w(ContextCompat.getColor(mo27850j0(), C17528R$color.trigger_primary)).mo24099s();
            } else {
                C15626c.makeText(mo27827K0(), C17541R$string.enable_wifi_failed, 1).show();
            }
        } catch (SecurityException unused) {
            C4061t1.m16023v(mo27827K0(), SelectableItem.m15535j1(C17541R$string.wifi_could_not_change), SelectableItem.m15535j1(C17541R$string.wifi_could_not_change_body), false);
        }
    }

    /* renamed from: o3 */
    private String[] m23745o3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_wifi_enabled), SelectableItem.m15535j1(C17541R$string.trigger_wifi_disabled), SelectableItem.m15535j1(C17541R$string.trigger_wifi_connection_connected), SelectableItem.m15535j1(C17541R$string.trigger_wifi_connection_disconnected)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public void m23746q3() {
        if (Build.VERSION.SDK_INT < 29) {
            m23749u3(((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).getConfiguredNetworks());
        } else if (C4031k.m15910j()) {
            HelperSystemCommands.m24579b(mo27827K0(), new C6059qa(this));
        } else {
            C7439d0.m30903l0(mo27850j0(), false, false, SelectableItem.m15535j1(C17541R$string.helper_apk_required));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static /* synthetic */ void m23747s3(DialogInterface dialogInterface, int i, boolean z) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        SparseBooleanArray checkedItemPositions = alertDialog.getListView().getCheckedItemPositions();
        boolean z2 = false;
        int i2 = 0;
        for (int i3 = 0; i3 < checkedItemPositions.size(); i3++) {
            if (checkedItemPositions.valueAt(i3)) {
                i2++;
            }
        }
        Button button = alertDialog.getButton(-1);
        if (i2 > 0) {
            z2 = true;
        }
        button.setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m23748t3(String[] strArr, DialogInterface dialogInterface, int i) {
        SparseBooleanArray checkedItemPositions = ((AlertDialog) dialogInterface).getListView().getCheckedItemPositions();
        this.m_SSIDList.clear();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                this.m_SSIDList.add(strArr[checkedItemPositions.keyAt(i2)]);
            }
        }
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m23750v3(DialogInterface dialogInterface, int i) {
        m23744n3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_wifiState;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        int i = this.m_wifiState;
        if (i == 0) {
            return SelectableItem.m15535j1(C17541R$string.trigger_wifi_enabled);
        }
        if (i == 1) {
            return SelectableItem.m15535j1(C17541R$string.trigger_wifi_disabled);
        }
        if (i == 2) {
            return SelectableItem.m15535j1(C17541R$string.trigger_wifi_connection_connected);
        }
        if (i == 3) {
            return SelectableItem.m15535j1(C17541R$string.trigger_wifi_connection_disconnected);
        }
        C8151a.m33873n(new RuntimeException("Invalid Wifi State"));
        return "Error";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r3.m_SSID;
     */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24824M1() {
        /*
            r3 = this;
            int r0 = r3.m_wifiState
            r1 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r1) goto L_0x0015
            java.lang.String r0 = r3.m_SSID
            if (r0 == 0) goto L_0x0015
            java.lang.String r2 = f13749d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.WifiConnectionTrigger.mo24824M1():boolean");
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_wifiState;
        if (i == 0 || i == 1) {
            return "";
        }
        if (i == 2 || i == 3) {
            String str = this.m_SSID;
            if (str != null) {
                return str;
            }
            if (this.m_SSIDList.size() == 1) {
                return this.m_SSIDList.get(0);
            }
            return this.m_SSIDList.toString();
        }
        C8151a.m33873n(new RuntimeException("WifiConnectionTrigger: Invalid Wifi State"));
        return "";
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_wifiConnectionTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_wifiConnectionTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7520j2.m31280u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        int i = this.m_wifiState;
        if (i == 0 || i == 1) {
            return mo24738G0();
        }
        String str = this.m_SSID;
        if (str == null) {
            if (this.m_SSIDList.size() > 1) {
                str = this.m_SSIDList.size() + SelectableItem.m15535j1(C17541R$string.ssids);
            } else {
                str = this.m_SSIDList.size() == 1 ? this.m_SSIDList.get(0) : "";
            }
        }
        return mo24738G0() + " (" + C6413o0.m24694c(str, 15) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_wifiConnectionTriggerReceiver = new WifiConnectionTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.supplicant.CONNECTION_CHANGE");
            MacroDroidApplication.m14845u().registerReceiver(s_wifiConnectionTriggerReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return Build.VERSION.SDK_INT >= 27 ? new String[]{"android.permission.ACCESS_COARSE_LOCATION"} : new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23745o3();
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return Build.VERSION.SDK_INT > 26 && this.m_wifiState > 1;
    }

    /* renamed from: p3 */
    public List<String> mo31666p3() {
        if (this.m_SSID != null) {
            ArrayList arrayList = new ArrayList();
            this.m_SSIDList = arrayList;
            arrayList.add(this.m_SSID);
            this.m_SSID = null;
        }
        return this.m_SSIDList;
    }

    /* renamed from: r3 */
    public int mo31667r3() {
        return this.m_wifiState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_wifiState;
        if (i == 0 || i == 1) {
            mo24689O1();
        } else if (i != 2 && i != 3) {
        } else {
            if (((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).isWifiEnabled()) {
                m23746q3();
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((int) C17541R$string.wifi_currently_disabled);
            builder.setMessage((int) C17541R$string.wifi_connection_must_enable).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6011ma(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) C6035oa.f14270a);
            builder.create().show();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_SSID);
        parcel.writeInt(this.m_wifiState);
        parcel.writeStringList(this.m_SSIDList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_wifiState = i;
    }

    public WifiConnectionTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public WifiConnectionTrigger() {
        this.m_connectReceiver = new C5797a();
        this.m_wifiState = 0;
        this.m_SSID = null;
        this.m_SSIDList = new ArrayList();
    }

    private WifiConnectionTrigger(Parcel parcel) {
        super(parcel);
        this.m_connectReceiver = new C5797a();
        this.m_SSIDList = new ArrayList();
        this.m_SSID = parcel.readString();
        this.m_wifiState = parcel.readInt();
        parcel.readStringList(this.m_SSIDList);
    }
}
