package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Pair;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6407n0;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p037m.C2009f;
import p112j2.C7439d0;
import p128m0.C7742f4;
import p148q0.C8151a;
import p150q2.C8164a;
import p319lc.C15626c;

public class SetWifiAction extends Action {
    private static final int AP_STATE_DISABLED = 1;
    private static final int AP_STATE_DISABLING = 0;
    private static final int AP_STATE_ENABLED = 3;
    private static final int AP_STATE_ENABLING = 2;
    private static final int AP_STATE_FAILED = 4;
    public static final Parcelable.Creator<SetWifiAction> CREATOR = new C2674b();
    private static final String SELECT_SSID = SelectableItem.m15535j1(C17541R$string.select_wifi);
    private static final int STATE_CONNECT_TO_NETWORK = 3;
    private static final int STATE_FORGET_NETWORK = 4;
    private String m_SSID;
    /* access modifiers changed from: private */
    public transient boolean m_connectAfterWifiIOn;
    /* access modifiers changed from: private */
    public final transient BroadcastReceiver m_connectReceiver;
    private int m_networkId;
    private transient C2009f m_progressDialog;
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SetWifiAction$a */
    class C2673a extends BroadcastReceiver {
        C2673a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED") && intent.getIntExtra("wifi_state", 0) == 3) {
                if (!SetWifiAction.this.m_connectAfterWifiIOn) {
                    SetWifiAction.this.m12861x3();
                } else {
                    boolean unused = SetWifiAction.this.m_connectAfterWifiIOn = false;
                    SetWifiAction.this.m12857t3();
                }
                if (SetWifiAction.this.m_connectReceiver != null) {
                    MacroDroidApplication.m14845u().unregisterReceiver(SetWifiAction.this.m_connectReceiver);
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetWifiAction$b */
    class C2674b implements Parcelable.Creator<SetWifiAction> {
        C2674b() {
        }

        /* renamed from: a */
        public SetWifiAction createFromParcel(Parcel parcel) {
            return new SetWifiAction(parcel, (C2673a) null);
        }

        /* renamed from: b */
        public SetWifiAction[] newArray(int i) {
            return new SetWifiAction[i];
        }
    }

    /* synthetic */ SetWifiAction(Parcel parcel, C2673a aVar) {
        this(parcel);
    }

    /* renamed from: A3 */
    private void m12839A3(TriggerContextInfo triggerContextInfo, boolean z) {
        boolean z2;
        try {
            WifiManager wifiManager = (WifiManager) MacroDroidApplication.m14845u().getApplicationContext().getSystemService("wifi");
            int i = this.m_state;
            boolean z3 = true;
            if (i != 0) {
                if (i == 1) {
                    try {
                        z2 = wifiManager.setWifiEnabled(false);
                    } catch (Exception e) {
                        C4878b.m18869h("Disabling wifi failed" + e.toString(), mo27840Y0().longValue());
                    }
                } else if (i == 2) {
                    z2 = wifiManager.setWifiEnabled(wifiManager.getWifiState() != 3);
                } else if (i != 3) {
                    if (i == 4) {
                        wifiManager.removeNetwork(this.m_networkId);
                        wifiManager.saveConfiguration();
                    }
                } else if (wifiManager.getWifiState() == 3) {
                    m12857t3();
                } else {
                    this.m_connectAfterWifiIOn = true;
                    m12859v3();
                }
                z2 = true;
            } else {
                z2 = wifiManager.setWifiEnabled(true);
            }
            if (!z2) {
                if (Settings.Global.getInt(mo27827K0().getContentResolver(), "airplane_mode_on", 0) != 0) {
                    C4878b.m18869h("Failed to set wifi state - Cannot set when in airplane mode", mo27840Y0().longValue());
                } else if (z) {
                    new Handler().postDelayed(new C3204kj(this, triggerContextInfo), 1000);
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 29) {
                        C4878b.m18869h("Failed to set wifi on Android Q, due to new Android restrictions. https://developer.android.com/about/versions/10/privacy/changes", mo27840Y0().longValue());
                    } else if (i2 >= 27) {
                        if (Settings.System.getInt(mo27827K0().getContentResolver(), "airplane_mode_on", 0) == 0) {
                            z3 = false;
                        }
                        if (z3) {
                            C4878b.m18869h("Failed to set wifi state - Cannot set when in airplane mode", mo27840Y0().longValue());
                        } else if (m12841C3()) {
                            C4878b.m18869h("Failed to set wifi state - Cannot set when hotspot is enabled", mo27840Y0().longValue());
                        } else {
                            C4878b.m18869h("Failed to set wifi state", mo27840Y0().longValue());
                        }
                    } else {
                        C4878b.m18869h("Failed to set wifi state", mo27840Y0().longValue());
                    }
                }
            }
        } catch (SecurityException e2) {
            C4878b.m18869h("Chould not change wifi state: " + e2, mo27840Y0().longValue());
            C4061t1.m16023v(mo27827K0(), SelectableItem.m15535j1(C17541R$string.wifi_could_not_change), e2.toString(), false);
        } catch (RuntimeException e3) {
            C4878b.m18869h("Failed to set wifi: " + e3.toString(), mo27840Y0().longValue());
        }
    }

    /* renamed from: B3 */
    private void m12840B3(boolean z) {
        if (z) {
            C4061t1.m15947B0(new String[]{"svc wifi enable"});
        } else {
            C4061t1.m15947B0(new String[]{"svc wifi disable"});
        }
    }

    /* renamed from: C3 */
    private boolean m12841C3() {
        try {
            WifiManager wifiManager = (WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi");
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("getWifiApState", new Class[0]);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(wifiManager, (Object[]) null)).intValue();
            if (intValue > 10) {
                intValue -= 10;
            }
            if (intValue == 1 || intValue == 4) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C4878b.m18869h("Error getting wifi AP State: " + e.getMessage(), mo27840Y0().longValue());
            C8151a.m33873n(new RuntimeException("Error getting wifi AP State: " + e.getMessage()));
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m12842D3(String[] strArr, Integer[] numArr, DialogInterface dialogInterface, int i) {
        ListView listView = ((AlertDialog) dialogInterface).getListView();
        if (strArr.length > 0 && numArr.length > 0) {
            this.m_SSID = strArr[listView.getCheckedItemPosition()];
            this.m_networkId = numArr[listView.getCheckedItemPosition()].intValue();
        }
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m12844F3(TriggerContextInfo triggerContextInfo) {
        m12839A3(triggerContextInfo, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m12845G3(DialogInterface dialogInterface, int i) {
        m12859v3();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public void m12857t3() {
        WifiManager wifiManager = (WifiManager) MacroDroidApplication.m14845u().getApplicationContext().getSystemService("wifi");
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration next : configuredNetworks) {
                String str = next.SSID;
                if (str != null) {
                    if (str.startsWith("\"") && str.endsWith("\"")) {
                        str = str.substring(1, str.length() - 1);
                    }
                    if (str.equals(this.m_SSID)) {
                        wifiManager.enableNetwork(next.networkId, true);
                    }
                }
            }
        }
    }

    /* renamed from: u3 */
    private void m12858u3(List<WifiConfiguration> list) {
        if (mo27836X()) {
            C2009f fVar = this.m_progressDialog;
            if (fVar != null) {
                try {
                    fVar.dismiss();
                } catch (Exception unused) {
                }
                this.m_progressDialog = null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            if (list != null) {
                int i2 = 0;
                for (WifiConfiguration next : list) {
                    String str = next.SSID;
                    if (str != null) {
                        if (str.startsWith("\"") && str.endsWith("\"")) {
                            str = str.substring(1, str.length() - 1);
                        }
                        arrayList2.add(Integer.valueOf(next.networkId));
                        arrayList.add(str);
                        if (this.m_SSID.equals(str)) {
                            i = i2;
                        }
                        i2++;
                    }
                }
            }
            String str2 = m12860w3()[this.m_state];
            String[] strArr = new String[arrayList.size()];
            Integer[] numArr = new Integer[arrayList.size()];
            arrayList.toArray(strArr);
            arrayList2.toArray(numArr);
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((CharSequence) str2);
            builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) null);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3120hj(this, strArr, numArr));
            builder.create().show();
        }
    }

    /* renamed from: v3 */
    private void m12859v3() {
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
            if (!this.m_connectAfterWifiIOn && z && mo27836X()) {
                this.m_progressDialog = new C2009f.C2014d(mo27850j0()).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.enabling_wifi).mo24098r(true, 0).mo24084c(false).mo24103w(ContextCompat.getColor(mo27850j0(), C17528R$color.actions_primary)).mo24099s();
            }
        } catch (SecurityException unused) {
            C4061t1.m16023v(mo27827K0(), SelectableItem.m15535j1(C17541R$string.wifi_could_not_change), SelectableItem.m15535j1(C17541R$string.wifi_could_not_change_body), false);
        }
    }

    /* renamed from: w3 */
    private String[] m12860w3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_wifi_enable), SelectableItem.m15535j1(C17541R$string.action_set_wifi_disable), SelectableItem.m15535j1(C17541R$string.action_set_wifi_toggle), SelectableItem.m15535j1(C17541R$string.connect_to_network), SelectableItem.m15535j1(C17541R$string.forget_network)};
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public void m12861x3() {
        if (Build.VERSION.SDK_INT < 29) {
            m12858u3(((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).getConfiguredNetworks());
        } else if (C4031k.m15910j()) {
            HelperSystemCommands.m24579b(mo27827K0(), new C3176jj(this));
        } else {
            C7439d0.m30903l0(mo27850j0(), false, false, SelectableItem.m15535j1(C17541R$string.helper_apk_required));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m12843E3(List<WifiConfiguration> list) {
        if (list.size() > 0) {
            m12858u3(list);
        } else {
            C15626c.makeText(mo27827K0(), C17541R$string.please_ensure_run_helper_file_and_granted_location_permission, 1).show();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0099, code lost:
        if (r8.getWifiState() != 3) goto L_0x009b;
     */
    /* renamed from: z3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12863z3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r8) {
        /*
            r7 = this;
            com.arlosoft.macrodroid.app.MacroDroidApplication r8 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            android.content.Context r8 = r8.getApplicationContext()
            java.lang.String r0 = "wifi"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.net.wifi.WifiManager r8 = (android.net.wifi.WifiManager) r8
            com.arlosoft.macrodroid.macro.Macro r0 = r7.mo27837X0()
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = r0.getName()
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = r0.getName()
            goto L_0x0023
        L_0x0021:
            java.lang.String r0 = ""
        L_0x0023:
            android.content.Context r1 = r7.mo27827K0()
            java.lang.String r2 = "power"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            r2 = 1
            java.lang.String r3 = "macrodroid:setWifiAction"
            android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r2, r3)
            r3 = 0
            r1.setReferenceCounted(r3)
            r4 = 5000(0x1388, double:2.4703E-320)
            r1.acquire(r4)
            int r1 = r7.m_state
            java.lang.String r4 = "Cannot set wifi, Helper File is not installed. Please see: https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/"
            if (r1 == 0) goto L_0x009b
            if (r1 == r2) goto L_0x0059
            r5 = 2
            r6 = 3
            if (r1 == r5) goto L_0x0095
            if (r1 == r6) goto L_0x005b
            r2 = 4
            if (r1 == r2) goto L_0x0051
            goto L_0x0059
        L_0x0051:
            int r1 = r7.m_networkId
            r8.removeNetwork(r1)
            r8.saveConfiguration()
        L_0x0059:
            r2 = 0
            goto L_0x009b
        L_0x005b:
            java.lang.String r8 = com.arlosoft.macrodroid.common.C4031k.m15905e()
            if (r8 == 0) goto L_0x0089
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Sending request to Helper File to connect to SSID: "
            r8.append(r1)
            java.lang.String r1 = r7.m_SSID
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.Long r1 = r7.mo27840Y0()
            long r1 = r1.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r8, r1)
            android.content.Context r8 = r7.mo27827K0()
            java.lang.String r1 = r7.m_SSID
            com.arlosoft.macrodroid.utils.HelperSystemCommands.m24583f(r8, r1, r0)
            goto L_0x0094
        L_0x0089:
            java.lang.Long r8 = r7.mo27840Y0()
            long r0 = r8.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r4, r0)
        L_0x0094:
            return
        L_0x0095:
            int r8 = r8.getWifiState()
            if (r8 == r6) goto L_0x0059
        L_0x009b:
            boolean r8 = p150q2.C8164a.m33886a()
            if (r8 == 0) goto L_0x00a5
            r7.m12840B3(r2)
            goto L_0x00e6
        L_0x00a5:
            java.lang.String r8 = com.arlosoft.macrodroid.common.C4031k.m15905e()
            if (r8 == 0) goto L_0x00db
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Sending request to Helper File to "
            r8.append(r1)
            if (r2 == 0) goto L_0x00ba
            java.lang.String r1 = "enable"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r1 = "disable"
        L_0x00bc:
            r8.append(r1)
            java.lang.String r1 = " wifi"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.Long r1 = r7.mo27840Y0()
            long r3 = r1.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r8, r3)
            android.content.Context r8 = r7.mo27827K0()
            com.arlosoft.macrodroid.utils.HelperSystemCommands.m24584g(r8, r2, r0)
            goto L_0x00e6
        L_0x00db:
            java.lang.Long r8 = r7.mo27840Y0()
            long r0 = r8.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r4, r0)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetWifiAction.m12863z3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_state;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12860w3()[this.m_state];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_state;
        if (i == 3 || i == 4) {
            return this.m_SSID;
        }
        return "";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7742f4.m32301u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        int i = this.m_state;
        if (i != 3 && i != 4) {
            return mo24738G0();
        }
        return mo24738G0() + " (" + this.m_SSID + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            m12839A3(triggerContextInfo, true);
        } else {
            m12863z3(triggerContextInfo);
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return Build.VERSION.SDK_INT >= 29 ? new String[0] : new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        if (Build.VERSION.SDK_INT < 23) {
            return m12860w3();
        }
        return (String[]) Arrays.copyOfRange(m12860w3(), 0, m12860w3().length - 1);
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return false;
    }

    /* renamed from: p2 */
    public Pair<Integer, String> mo24959p2() {
        if (Build.VERSION.SDK_INT < 29 || C8164a.m33886a()) {
            return null;
        }
        return new Pair<>(2, "1.2");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_state;
        if (i == 3 || i == 4) {
            WifiManager wifiManager = (WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi");
            if (Build.VERSION.SDK_INT >= 27 && !C6407n0.m24663a(mo27827K0())) {
                C15626c.m94876a(mo27827K0(), SelectableItem.m15535j1(C17541R$string.location_service_must_be_enabled), 1).show();
                C4878b.m18869h("Set Wifi action could not get current SSIDs, location services must be enabled on Android 8.1+", mo27840Y0().longValue());
            } else if (wifiManager.isWifiEnabled()) {
                m12861x3();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
                builder.setTitle((int) C17541R$string.wifi_currently_disabled);
                builder.setMessage((int) C17541R$string.wifi_connection_must_enable).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3092gj(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) C3148ij.f8500a);
                builder.create().show();
            }
        } else {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
        parcel.writeString(this.m_SSID);
        parcel.writeInt(this.m_networkId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_state = i;
    }

    public SetWifiAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetWifiAction() {
        this.m_connectReceiver = new C2673a();
        this.m_state = 0;
        this.m_SSID = SELECT_SSID;
    }

    private SetWifiAction(Parcel parcel) {
        super(parcel);
        this.m_connectReceiver = new C2673a();
        this.m_state = parcel.readInt();
        this.m_SSID = parcel.readString();
        this.m_networkId = parcel.readInt();
    }
}
