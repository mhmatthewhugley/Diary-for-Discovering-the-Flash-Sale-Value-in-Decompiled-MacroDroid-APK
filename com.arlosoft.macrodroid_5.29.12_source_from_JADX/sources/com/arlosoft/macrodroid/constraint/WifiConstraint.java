package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6407n0;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p037m.C2009f;
import p112j2.C7439d0;
import p123l1.C7617h1;
import p148q0.C8151a;
import p319lc.C15626c;

public class WifiConstraint extends Constraint {
    public static final Parcelable.Creator<WifiConstraint> CREATOR = new C4216c();
    private String m_SSID;
    private ArrayList<String> m_SSIDList;
    private final transient BroadcastReceiver m_connectReceiver;
    private transient C4217d m_localWifiScanCompleteReceiver;
    private transient C2009f m_progressDialog;
    private transient int m_selectedCount;
    private int m_wifiState;

    /* renamed from: com.arlosoft.macrodroid.constraint.WifiConstraint$a */
    class C4214a extends BroadcastReceiver {
        C4214a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED") && intent.getIntExtra("wifi_state", 0) == 3) {
                WifiConstraint.this.m17211t3();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.WifiConstraint$b */
    class C4215b implements DialogInterface.OnClickListener {
        C4215b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WifiConstraint.this.m17197A3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.WifiConstraint$c */
    class C4216c implements Parcelable.Creator<WifiConstraint> {
        C4216c() {
        }

        /* renamed from: a */
        public WifiConstraint createFromParcel(Parcel parcel) {
            return new WifiConstraint(parcel, (C4214a) null);
        }

        /* renamed from: b */
        public WifiConstraint[] newArray(int i) {
            return new WifiConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.WifiConstraint$d */
    private class C4217d extends BroadcastReceiver {
        private C4217d() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                List<ScanResult> scanResults = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getScanResults();
                if (scanResults != null) {
                    for (int i = 0; i < scanResults.size(); i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("RESULT ");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(((ScanResult) scanResults.get(i)).SSID);
                    }
                } else {
                    scanResults = new ArrayList<>();
                }
                if (WifiConstraint.this.mo27836X()) {
                    ArrayList arrayList = new ArrayList();
                    for (ScanResult scanResult : scanResults) {
                        if (!TextUtils.isEmpty(scanResult.SSID) && !arrayList.contains(scanResult.SSID)) {
                            arrayList.add(scanResult.SSID);
                        }
                    }
                    WifiConstraint.this.m17207p3(arrayList);
                }
            } catch (SecurityException unused) {
                C7439d0.m30909o0(context, "android.permission.ACCESS_COARSE_LOCATION", (String) null, true, false);
            }
        }

        /* synthetic */ C4217d(WifiConstraint wifiConstraint, C4214a aVar) {
            this();
        }
    }

    /* synthetic */ WifiConstraint(Parcel parcel, C4214a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public void m17197A3() {
        if (this.m_progressDialog != null) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(this.m_connectReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            if (mo27836X()) {
                try {
                    this.m_progressDialog.dismiss();
                } catch (Exception unused) {
                }
            }
            this.m_progressDialog = null;
        }
        if (mo27836X()) {
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    if (Settings.Secure.getInt(mo27827K0().getContentResolver(), "location_mode") == 0) {
                        C15626c.makeText(mo27827K0(), C17541R$string.location_services_must_be_enabled, 1).show();
                        return;
                    }
                } catch (Exception unused2) {
                }
            }
            this.m_localWifiScanCompleteReceiver = new C4217d(this, (C4214a) null);
            MacroDroidApplication.m14845u().registerReceiver(this.m_localWifiScanCompleteReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            ((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).startScan();
            this.m_progressDialog = new C2009f.C2014d(mo27850j0()).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.trigger_wifi_SSID_scanning).mo24098r(true, 0).mo24084c(false).mo24103w(ContextCompat.getColor(mo27850j0(), C17528R$color.constraints_accent)).mo24099s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public void m17207p3(List<String> list) {
        String str;
        if (mo27836X()) {
            String str2 = this.m_SSID;
            if (str2 != null && !this.m_SSIDList.contains(str2)) {
                this.m_SSIDList.add(this.m_SSID);
            }
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 27 && !C6407n0.m24663a(mo27827K0())) {
                C15626c.m94876a(mo27827K0(), SelectableItem.m15535j1(C17541R$string.location_service_must_be_enabled), 1).show();
            }
            this.m_SSID = null;
            C2009f fVar = this.m_progressDialog;
            if (fVar != null && fVar.isShowing()) {
                try {
                    this.m_progressDialog.dismiss();
                    this.m_progressDialog = null;
                    MacroDroidApplication.m14845u().unregisterReceiver(this.m_connectReceiver);
                } catch (IllegalArgumentException unused) {
                }
            }
            this.m_selectedCount = 0;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (String next : list) {
                    if (next != null) {
                        if (next.startsWith("\"") && next.endsWith("\"")) {
                            next = next.substring(1, next.length() - 1);
                        }
                        arrayList.add(next);
                    }
                }
            }
            Collections.sort(arrayList, C4225a4.f10790a);
            arrayList.add(0, mo27827K0().getString(C17541R$string.any_network));
            boolean[] zArr = new boolean[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                if (this.m_SSIDList.contains(arrayList.get(i))) {
                    zArr[i] = true;
                    this.m_selectedCount++;
                }
            }
            if (this.m_wifiState == 2) {
                str = mo27827K0().getString(C17541R$string.constraint_wifi_connected_to);
            } else {
                str = mo27827K0().getString(C17541R$string.constraint_wifi_not_connected_to);
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((CharSequence) str);
            builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) new C4350y3(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4340w3(this, strArr));
            AlertDialog create = builder.create();
            create.show();
            Button button = create.getButton(-1);
            if (this.m_selectedCount <= 0) {
                z = false;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: q3 */
    private void m17208q3() {
        WifiManager wifiManager = (WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi");
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        MacroDroidApplication.m14845u().registerReceiver(this.m_connectReceiver, intentFilter);
        try {
            if (Build.VERSION.SDK_INT < 29) {
                wifiManager.setWifiEnabled(true);
            } else if (C4031k.m15910j()) {
                HelperSystemCommands.m24584g(mo27827K0(), true, "");
            } else {
                C15626c.makeText(mo27827K0(), C17541R$string.enable_wifi_failed, 1).show();
                return;
            }
        } catch (SecurityException unused) {
            C4061t1.m16023v(mo27827K0(), mo27827K0().getString(C17541R$string.constraint_wifi_could_not_change_title), mo27827K0().getString(C17541R$string.constraint_wifi_could_not_change_detail), false);
        }
        this.m_progressDialog = new C2009f.C2014d(mo27850j0()).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.enabling_wifi).mo24098r(true, 0).mo24084c(false).mo24103w(mo28116a3()).mo24099s();
    }

    /* renamed from: r3 */
    private String m17209r3(boolean z) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        sb.append(" (");
        sb.append(C6413o0.m24694c(str, z ? 150 : 15));
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: s3 */
    private String[] m17210s3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_disabled), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_connected_to), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_not_connected_to)};
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public void m17211t3() {
        if (Build.VERSION.SDK_INT < 29) {
            ArrayList arrayList = new ArrayList();
            for (WifiConfiguration wifiConfiguration : ((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).getConfiguredNetworks()) {
                arrayList.add(wifiConfiguration.SSID);
            }
            m17207p3(arrayList);
        } else if (C4031k.m15910j()) {
            HelperSystemCommands.m24579b(mo27827K0(), new C4355z3(this));
        } else {
            C7439d0.m30907n0(mo27850j0(), mo25559a1(), new C4215b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m17213v3(DialogInterface dialogInterface, int i, boolean z) {
        boolean z2 = true;
        if (z) {
            this.m_selectedCount++;
        } else {
            this.m_selectedCount--;
        }
        Button button = ((AlertDialog) dialogInterface).getButton(-1);
        if (this.m_selectedCount <= 0) {
            z2 = false;
        }
        button.setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m17214w3(String[] strArr, DialogInterface dialogInterface, int i) {
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
    /* renamed from: x3 */
    public /* synthetic */ void m17215x3(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WifiConfiguration) it.next()).SSID);
        }
        m17207p3(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m17216y3(DialogInterface dialogInterface, int i) {
        m17208q3();
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
            return mo27827K0().getString(C17541R$string.constraint_wifi_enabled);
        }
        if (i == 1) {
            return mo27827K0().getString(C17541R$string.constraint_wifi_disabled);
        }
        if (i == 2) {
            return mo27827K0().getString(C17541R$string.constraint_wifi_connected);
        }
        if (i == 3) {
            return mo27827K0().getString(C17541R$string.constraint_wifi_not_connected);
        }
        C8151a.m33873n(new RuntimeException("WifiConstraint: Invalid Wifi State"));
        return "Error";
    }

    /* renamed from: H0 */
    public String mo27823H0() {
        int i = this.m_wifiState;
        if (i != 2 && i != 3) {
            return mo24738G0();
        }
        return mo24738G0() + ": " + mo24672O0();
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

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (r3.equals("<unknown ssid>") == false) goto L_0x008a;
     */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo r13) {
        /*
            r12 = this;
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 27
            r1 = 0
            r2 = 1
            if (r13 < r0) goto L_0x002d
            android.content.Context r3 = r12.mo27827K0()
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r4)
            if (r3 == 0) goto L_0x002d
            java.lang.Long r13 = r12.mo27840Y0()
            long r5 = r13.longValue()
            java.lang.String r13 = "Could not get Wifi SSID, location access/permission is required on Android 8.1+"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r13, r5)
            android.content.Context r13 = r12.mo27827K0()
            java.lang.String r0 = r12.mo24738G0()
            p112j2.C7439d0.m30909o0(r13, r4, r0, r2, r1)
            return r1
        L_0x002d:
            android.content.Context r3 = r12.mo27827K0()
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r4 = "wifi"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3
            int r4 = r3.getWifiState()
            r5 = 3
            if (r4 != r5) goto L_0x0046
            r4 = 1
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            android.net.wifi.WifiInfo r3 = r3.getConnectionInfo()
            r6 = 0
            if (r3 == 0) goto L_0x0053
            android.net.wifi.SupplicantState r7 = r3.getSupplicantState()
            goto L_0x0054
        L_0x0053:
            r7 = r6
        L_0x0054:
            java.lang.String r8 = "0x"
            if (r3 == 0) goto L_0x008b
            java.lang.String r3 = r3.getSSID()
            if (r3 == 0) goto L_0x008a
            java.lang.String r9 = "\""
            boolean r10 = r3.startsWith(r9)
            if (r10 == 0) goto L_0x0075
            boolean r9 = r3.endsWith(r9)
            if (r9 == 0) goto L_0x0075
            int r9 = r3.length()
            int r9 = r9 - r2
            java.lang.String r3 = r3.substring(r2, r9)
        L_0x0075:
            boolean r9 = r3.equals(r8)
            if (r9 != 0) goto L_0x008b
            int r9 = r3.length()
            if (r9 == 0) goto L_0x008b
            java.lang.String r9 = "<unknown ssid>"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r6 = r3
        L_0x008b:
            java.util.ArrayList<java.lang.String> r3 = r12.m_SSIDList
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x009a
            java.util.ArrayList<java.lang.String> r3 = r12.m_SSIDList
            java.lang.String r9 = r12.m_SSID
            r3.add(r9)
        L_0x009a:
            int r3 = r12.m_wifiState
            if (r3 == 0) goto L_0x0149
            if (r3 == r2) goto L_0x0146
            r4 = 2
            java.lang.String r9 = "Wifi Constraint could not get current SSID, location services must be enabled on Android 8.1+"
            r10 = 2131952445(0x7f13033d, float:1.9541333E38)
            java.lang.String r11 = "Any Network"
            if (r3 == r4) goto L_0x00ff
            if (r3 == r5) goto L_0x00b7
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r0 = "WifiConstraint: Invalid Wifi State"
            r13.<init>(r0)
            p148q0.C8151a.m33873n(r13)
            return r2
        L_0x00b7:
            java.util.ArrayList<java.lang.String> r3 = r12.m_SSIDList
            boolean r3 = r3.contains(r11)
            if (r3 != 0) goto L_0x00f9
            java.util.ArrayList<java.lang.String> r3 = r12.m_SSIDList
            java.lang.String r4 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r10)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00cc
            goto L_0x00f9
        L_0x00cc:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x00e1
            boolean r1 = r6.equals(r8)
            if (r1 == 0) goto L_0x00d9
            goto L_0x00e1
        L_0x00d9:
            java.util.ArrayList<java.lang.String> r13 = r12.m_SSIDList
            boolean r13 = r13.contains(r6)
            r13 = r13 ^ r2
            return r13
        L_0x00e1:
            if (r13 < r0) goto L_0x00f8
            android.content.Context r13 = r12.mo27827K0()
            boolean r13 = com.arlosoft.macrodroid.utils.C6407n0.m24663a(r13)
            if (r13 != 0) goto L_0x00f8
            java.lang.Long r13 = r12.mo27840Y0()
            long r0 = r13.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r9, r0)
        L_0x00f8:
            return r2
        L_0x00f9:
            android.net.wifi.SupplicantState r13 = android.net.wifi.SupplicantState.COMPLETED
            if (r7 == r13) goto L_0x00fe
            r1 = 1
        L_0x00fe:
            return r1
        L_0x00ff:
            java.util.ArrayList<java.lang.String> r3 = r12.m_SSIDList
            boolean r3 = r3.contains(r11)
            if (r3 != 0) goto L_0x0140
            java.util.ArrayList<java.lang.String> r3 = r12.m_SSIDList
            java.lang.String r4 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r10)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0114
            goto L_0x0140
        L_0x0114:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x0128
            boolean r2 = r6.equals(r8)
            if (r2 == 0) goto L_0x0121
            goto L_0x0128
        L_0x0121:
            java.util.ArrayList<java.lang.String> r13 = r12.m_SSIDList
            boolean r13 = r13.contains(r6)
            return r13
        L_0x0128:
            if (r13 < r0) goto L_0x013f
            android.content.Context r13 = r12.mo27827K0()
            boolean r13 = com.arlosoft.macrodroid.utils.C6407n0.m24663a(r13)
            if (r13 != 0) goto L_0x013f
            java.lang.Long r13 = r12.mo27840Y0()
            long r2 = r13.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r9, r2)
        L_0x013f:
            return r1
        L_0x0140:
            android.net.wifi.SupplicantState r13 = android.net.wifi.SupplicantState.COMPLETED
            if (r7 != r13) goto L_0x0145
            r1 = 1
        L_0x0145:
            return r1
        L_0x0146:
            r13 = r4 ^ 1
            return r13
        L_0x0149:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.WifiConstraint.mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7617h1.m31722u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return m17209r3(false);
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m17210s3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return m17209r3(true);
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return Build.VERSION.SDK_INT > 26;
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
                m17211t3();
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((int) C17541R$string.constraint_wifi_currently_disabled);
            builder.setMessage((int) C17541R$string.constraint_wifi_must_be_enabled).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4335v3(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) C4345x3.f11076a);
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

    public WifiConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public WifiConstraint() {
        this.m_connectReceiver = new C4214a();
        this.m_wifiState = 0;
        this.m_SSIDList = new ArrayList<>();
    }

    private WifiConstraint(Parcel parcel) {
        super(parcel);
        this.m_connectReceiver = new C4214a();
        this.m_SSID = parcel.readString();
        this.m_wifiState = parcel.readInt();
        ArrayList<String> arrayList = new ArrayList<>();
        this.m_SSIDList = arrayList;
        parcel.readStringList(arrayList);
    }
}
