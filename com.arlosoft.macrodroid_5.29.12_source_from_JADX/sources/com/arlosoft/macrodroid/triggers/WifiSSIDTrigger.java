package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.WifiCellInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.InitiateWifScanReceiver;
import com.arlosoft.macrodroid.triggers.receivers.WifiScanCompleteReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.util.ArrayList;
import java.util.List;
import p037m.C2009f;
import p112j2.C7439d0;
import p119k3.C7525k2;
import p148q0.C8151a;
import p319lc.C15626c;

public class WifiSSIDTrigger extends Trigger {
    public static final Parcelable.Creator<WifiSSIDTrigger> CREATOR = new C5802d();

    /* renamed from: d */
    public static final String f13751d = SelectableItem.m15535j1(C17541R$string.select_wifi);
    /* access modifiers changed from: private */
    public static PendingIntent s_pendingIntent;
    private static int s_triggerCounter;
    private static C5804f s_updateRateReceiver;
    private static WifiManager.WifiLock s_wifiLock;
    private static WifiManager s_wifiManager;
    private static WifiScanCompleteReceiver s_wifiScanCompleteReceiver;
    private boolean m_InRange;
    private String m_SSID;
    private List<String> m_SSIDList;
    private final transient BroadcastReceiver m_connectReceiver;
    private transient C5803e m_localWifiScanCompleteReceiver;
    private transient C2009f m_progressDialog;
    private List<WifiCellInfo> wifiCellInfoList;

    /* renamed from: com.arlosoft.macrodroid.triggers.WifiSSIDTrigger$a */
    class C5799a implements DialogInterface.OnClickListener {
        C5799a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WifiSSIDTrigger.this.m23781M3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WifiSSIDTrigger$b */
    class C5800b extends BroadcastReceiver {
        C5800b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED") && intent.getIntExtra("wifi_state", 0) == 3) {
                WifiSSIDTrigger.this.m23781M3();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WifiSSIDTrigger$c */
    class C5801c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13754a;

        /* renamed from: c */
        final /* synthetic */ EditText f13755c;

        C5801c(Button button, EditText editText) {
            this.f13754a = button;
            this.f13755c = editText;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f13754a.setEnabled(this.f13755c.getText().length() > 0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WifiSSIDTrigger$d */
    class C5802d implements Parcelable.Creator<WifiSSIDTrigger> {
        C5802d() {
        }

        /* renamed from: a */
        public WifiSSIDTrigger createFromParcel(Parcel parcel) {
            return new WifiSSIDTrigger(parcel, (C5799a) null);
        }

        /* renamed from: b */
        public WifiSSIDTrigger[] newArray(int i) {
            return new WifiSSIDTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WifiSSIDTrigger$e */
    private class C5803e extends BroadcastReceiver {
        private C5803e() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                List scanResults = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getScanResults();
                if (scanResults != null) {
                    for (int i = 0; i < scanResults.size(); i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("RESULT ");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(((ScanResult) scanResults.get(i)).SSID);
                    }
                } else {
                    scanResults = new ArrayList();
                }
                if (WifiSSIDTrigger.this.mo27836X()) {
                    WifiSSIDTrigger.this.m23769B3(scanResults);
                }
            } catch (SecurityException unused) {
                C7439d0.m30909o0(context, "android.permission.ACCESS_COARSE_LOCATION", (String) null, true, false);
            }
        }

        /* synthetic */ C5803e(WifiSSIDTrigger wifiSSIDTrigger, C5799a aVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WifiSSIDTrigger$f */
    private class C5804f extends BroadcastReceiver {
        private C5804f() {
        }

        public void onReceive(Context context, Intent intent) {
            int A2 = C5163j2.m19925A2(WifiSSIDTrigger.this.mo27827K0());
            if (A2 > 0) {
                int i = A2 * 60 * 1000;
                AlarmManager alarmManager = (AlarmManager) WifiSSIDTrigger.this.mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM);
                if (WifiSSIDTrigger.s_pendingIntent != null) {
                    alarmManager.cancel(WifiSSIDTrigger.s_pendingIntent);
                } else {
                    PendingIntent unused = WifiSSIDTrigger.s_pendingIntent = PendingIntent.getBroadcast(WifiSSIDTrigger.this.mo27827K0(), 0, new Intent(WifiSSIDTrigger.this.mo27827K0(), InitiateWifScanReceiver.class), 134217728 | C6368b1.f14959b);
                }
                alarmManager.setRepeating(0, System.currentTimeMillis(), (long) i, WifiSSIDTrigger.s_pendingIntent);
            }
        }

        /* synthetic */ C5804f(WifiSSIDTrigger wifiSSIDTrigger, C5799a aVar) {
            this();
        }
    }

    /* synthetic */ WifiSSIDTrigger(Parcel parcel, C5799a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public void m23769B3(List<ScanResult> list) {
        if (Build.VERSION.SDK_INT < 29) {
            m23795t3(list, ((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).getConfiguredNetworks(), true);
        } else if (C4031k.m15910j()) {
            HelperSystemCommands.m24579b(mo27827K0(), new C6204ya(this, list));
        } else {
            m23795t3(list, new ArrayList(), true);
        }
    }

    /* renamed from: D1 */
    private void m23771D1() {
        this.m_InRange = true;
        this.m_SSIDList = new ArrayList();
        this.m_SSID = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m23772D3(ListView listView, List list, AppCompatDialog appCompatDialog, View view) {
        this.m_SSID = null;
        this.wifiCellInfoList.clear();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            try {
                if (checkedItemPositions.valueAt(i)) {
                    this.wifiCellInfoList.add((WifiCellInfo) list.get(checkedItemPositions.keyAt(i)));
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m23774F3(ListView listView, List list, View view) {
        m23780L3(listView, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m23775G3(List list, List list2) {
        m23795t3(list, list2, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m23776H3(Activity activity, DialogInterface dialogInterface, int i) {
        C5163j2.m20107Z3(activity, true);
        super.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static /* synthetic */ void m23777I3(ListView listView, EditText editText, List list, DialogInterface dialogInterface, int i) {
        ArrayAdapter arrayAdapter = (ArrayAdapter) listView.getAdapter();
        String obj = editText.getText().toString();
        arrayAdapter.add(obj);
        list.add(new WifiCellInfo(obj, (String) null, obj));
        listView.setItemChecked(arrayAdapter.getCount() - 1, true);
        listView.setSelection(arrayAdapter.getCount() - 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m23778J3(DialogInterface dialogInterface, int i) {
        m23796u3();
    }

    /* renamed from: L3 */
    private void m23780L3(ListView listView, List<WifiCellInfo> list) {
        Activity j0 = mo27850j0();
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) mo24738G0());
        EditText editText = new EditText(new ContextThemeWrapper((Context) j0, mo24705l0()));
        editText.setHint(C17541R$string.trigger_wifi_SSID_enter);
        editText.setMinimumWidth(mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.alert_dialog_input_min_width));
        int dimensionPixelOffset = mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium);
        int dimensionPixelSize = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.input_text_dialog_top_margin);
        editText.setSingleLine();
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6071ra(listView, editText, list));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        create.setView(editText, dimensionPixelOffset, dimensionPixelSize, dimensionPixelOffset, 0);
        create.show();
        Button button = create.getButton(-1);
        if (editText.getText().length() == 0) {
            button.setEnabled(false);
        }
        editText.addTextChangedListener(new C5801c(button, editText));
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public void m23781M3() {
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
            this.m_localWifiScanCompleteReceiver = new C5803e(this, (C5799a) null);
            MacroDroidApplication.m14845u().registerReceiver(this.m_localWifiScanCompleteReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            ((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).startScan();
            this.m_progressDialog = new C2009f.C2014d(mo27850j0()).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.trigger_wifi_SSID_scanning).mo24098r(true, 0).mo24084c(false).mo24103w(ContextCompat.getColor(mo27850j0(), C17528R$color.trigger_accent)).mo24099s();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:3|(2:5|6)|7|8|11|(3:13|(4:16|(4:19|(1:23)|24|73)|69|14)|70)|25|(6:28|(1:30)|31|(2:33|77)(1:76)|74|26)|75|34|(4:37|(2:39|81)(1:80)|78|35)|79|40|(3:42|(4:45|(2:47|85)(1:84)|82|43)|83)|48|(2:51|49)|86|52|(5:55|(4:58|(2:64|89)|65|56)|88|66|53)|87|67|68) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        p148q0.C8151a.m33873n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131 A[LOOP:4: B:49:0x012b->B:51:0x0131, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0165  */
    /* renamed from: t3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23795t3(java.util.List<android.net.wifi.ScanResult> r11, java.util.List<android.net.wifi.WifiConfiguration> r12, boolean r13) {
        /*
            r10 = this;
            android.app.Activity r13 = r10.mo27850j0()
            r0 = r13
            com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity r0 = (com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity) r0
            boolean r0 = r0.mo27315N1()
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            m.f r0 = r10.m_progressDialog
            r1 = 0
            if (r0 == 0) goto L_0x0018
            r0.dismiss()     // Catch:{ IllegalArgumentException -> 0x0018 }
            r10.m_progressDialog = r1     // Catch:{ IllegalArgumentException -> 0x0018 }
        L_0x0018:
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x0022 }
            com.arlosoft.macrodroid.triggers.WifiSSIDTrigger$e r2 = r10.m_localWifiScanCompleteReceiver     // Catch:{ Exception -> 0x0022 }
            r0.unregisterReceiver(r2)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r0 = move-exception
            p148q0.C8151a.m33873n(r0)
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 1
            if (r12 == 0) goto L_0x006b
            java.util.Iterator r12 = r12.iterator()
        L_0x0032:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r12.next()
            android.net.wifi.WifiConfiguration r3 = (android.net.wifi.WifiConfiguration) r3
            java.lang.String r4 = r3.SSID
            if (r4 != 0) goto L_0x0043
            goto L_0x0032
        L_0x0043:
            if (r4 == 0) goto L_0x0032
            java.lang.String r5 = "\""
            boolean r6 = r4.startsWith(r5)
            if (r6 == 0) goto L_0x005c
            boolean r5 = r4.endsWith(r5)
            if (r5 == 0) goto L_0x005c
            int r5 = r4.length()
            int r5 = r5 - r2
            java.lang.String r4 = r4.substring(r2, r5)
        L_0x005c:
            com.arlosoft.macrodroid.data.WifiCellInfo r5 = new com.arlosoft.macrodroid.data.WifiCellInfo
            java.lang.String r3 = r3.BSSID
            java.lang.String r6 = r10.m23797v3(r4, r3)
            r5.<init>(r4, r3, r6)
            r0.add(r5)
            goto L_0x0032
        L_0x006b:
            java.util.Iterator r11 = r11.iterator()
        L_0x006f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00a6
            java.lang.Object r12 = r11.next()
            android.net.wifi.ScanResult r12 = (android.net.wifi.ScanResult) r12
            com.arlosoft.macrodroid.data.WifiCellInfo r3 = new com.arlosoft.macrodroid.data.WifiCellInfo
            java.lang.String r4 = r12.SSID
            java.lang.String r5 = r12.BSSID
            java.lang.String r6 = r10.m23797v3(r4, r5)
            r3.<init>(r4, r5, r6)
            com.arlosoft.macrodroid.data.WifiCellInfo r4 = new com.arlosoft.macrodroid.data.WifiCellInfo
            java.lang.String r12 = r12.SSID
            java.lang.String r5 = r10.m23797v3(r12, r1)
            r4.<init>(r12, r1, r5)
            boolean r12 = r0.contains(r4)
            if (r12 != 0) goto L_0x009c
            r0.add(r4)
        L_0x009c:
            boolean r12 = r0.contains(r3)
            if (r12 != 0) goto L_0x006f
            r0.add(r3)
            goto L_0x006f
        L_0x00a6:
            java.util.List<java.lang.String> r11 = r10.m_SSIDList
            java.util.Iterator r11 = r11.iterator()
        L_0x00ac:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00c7
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            com.arlosoft.macrodroid.data.WifiCellInfo r3 = new com.arlosoft.macrodroid.data.WifiCellInfo
            r3.<init>(r12, r1, r12)
            boolean r12 = r0.contains(r3)
            if (r12 != 0) goto L_0x00ac
            r0.add(r3)
            goto L_0x00ac
        L_0x00c7:
            java.util.List<com.arlosoft.macrodroid.data.WifiCellInfo> r11 = r10.wifiCellInfoList
            if (r11 == 0) goto L_0x00e5
            java.util.Iterator r11 = r11.iterator()
        L_0x00cf:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00e5
            java.lang.Object r12 = r11.next()
            com.arlosoft.macrodroid.data.WifiCellInfo r12 = (com.arlosoft.macrodroid.data.WifiCellInfo) r12
            boolean r1 = r0.contains(r12)
            if (r1 != 0) goto L_0x00cf
            r0.add(r12)
            goto L_0x00cf
        L_0x00e5:
            com.arlosoft.macrodroid.triggers.za r11 = com.arlosoft.macrodroid.triggers.C6216za.f14781a
            java.util.Collections.sort(r0, r11)
            androidx.appcompat.app.AppCompatDialog r11 = new androidx.appcompat.app.AppCompatDialog
            r12 = 2132017840(0x7f1402b0, float:1.967397E38)
            r11.<init>(r13, r12)
            r12 = 2131558677(0x7f0d0115, float:1.8742677E38)
            r11.setContentView((int) r12)
            r12 = 2131955532(0x7f130f4c, float:1.9547594E38)
            r11.setTitle((int) r12)
            r12 = 2131363053(0x7f0a04ed, float:1.8345904E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ListView r12 = (android.widget.ListView) r12
            r13 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r13 = r11.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r1 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r1 = r11.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r3 = 2131362122(0x7f0a014a, float:1.8344016E38)
            android.view.View r3 = r11.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x012b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0147
            java.lang.Object r6 = r5.next()
            com.arlosoft.macrodroid.data.WifiCellInfo r6 = (com.arlosoft.macrodroid.data.WifiCellInfo) r6
            java.lang.String r7 = r6.getSsid()
            java.lang.String r6 = r6.getBssid()
            java.lang.CharSequence r6 = r10.m23798w3(r7, r6)
            r4.add(r6)
            goto L_0x012b
        L_0x0147:
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            android.content.Context r6 = r11.getContext()
            r7 = 2131558930(0x7f0d0212, float:1.874319E38)
            r5.<init>(r6, r7, r4)
            r12.setAdapter(r5)
            r4 = 2
            r12.setChoiceMode(r4)
            r10.mo31675z3()
            r4 = 0
            r5 = 0
        L_0x015f:
            int r6 = r0.size()
            if (r5 >= r6) goto L_0x01b7
            java.lang.Object r6 = r0.get(r5)
            com.arlosoft.macrodroid.data.WifiCellInfo r6 = (com.arlosoft.macrodroid.data.WifiCellInfo) r6
            r7 = 0
        L_0x016c:
            java.util.List<com.arlosoft.macrodroid.data.WifiCellInfo> r8 = r10.wifiCellInfoList
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x01b4
            java.util.List<com.arlosoft.macrodroid.data.WifiCellInfo> r8 = r10.wifiCellInfoList
            java.lang.Object r8 = r8.get(r7)
            com.arlosoft.macrodroid.data.WifiCellInfo r8 = (com.arlosoft.macrodroid.data.WifiCellInfo) r8
            java.lang.String r8 = r8.getSsid()
            java.lang.String r9 = r6.getSsid()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01b1
            java.util.List<com.arlosoft.macrodroid.data.WifiCellInfo> r8 = r10.wifiCellInfoList
            java.lang.Object r8 = r8.get(r7)
            com.arlosoft.macrodroid.data.WifiCellInfo r8 = (com.arlosoft.macrodroid.data.WifiCellInfo) r8
            java.lang.String r8 = r8.getBssid()
            if (r8 == 0) goto L_0x01ae
            java.util.List<com.arlosoft.macrodroid.data.WifiCellInfo> r8 = r10.wifiCellInfoList
            java.lang.Object r8 = r8.get(r7)
            com.arlosoft.macrodroid.data.WifiCellInfo r8 = (com.arlosoft.macrodroid.data.WifiCellInfo) r8
            java.lang.String r8 = r8.getBssid()
            java.lang.String r9 = r6.getBssid()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01b1
        L_0x01ae:
            r12.setItemChecked(r5, r2)
        L_0x01b1:
            int r7 = r7 + 1
            goto L_0x016c
        L_0x01b4:
            int r5 = r5 + 1
            goto L_0x015f
        L_0x01b7:
            com.arlosoft.macrodroid.triggers.xa r2 = new com.arlosoft.macrodroid.triggers.xa
            r2.<init>(r10, r12, r0, r11)
            r13.setOnClickListener(r2)
            com.arlosoft.macrodroid.triggers.va r13 = new com.arlosoft.macrodroid.triggers.va
            r13.<init>(r11)
            r1.setOnClickListener(r13)
            com.arlosoft.macrodroid.triggers.wa r13 = new com.arlosoft.macrodroid.triggers.wa
            r13.<init>(r10, r12, r0)
            r3.setOnClickListener(r13)
            r11.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.WifiSSIDTrigger.m23795t3(java.util.List, java.util.List, boolean):void");
    }

    /* renamed from: u3 */
    private void m23796u3() {
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
            if (!z) {
                C15626c.makeText(mo27827K0(), C17541R$string.enable_wifi_failed, 1).show();
            } else if (mo27836X()) {
                this.m_progressDialog = new C2009f.C2014d(mo27850j0()).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.enabling_wifi).mo24098r(true, 0).mo24084c(false).mo24103w(ContextCompat.getColor(mo27850j0(), C17528R$color.trigger_accent)).mo24099s();
            }
        } catch (SecurityException unused) {
            C4061t1.m16023v(mo27827K0(), SelectableItem.m15535j1(C17541R$string.wifi_could_not_change), SelectableItem.m15535j1(C17541R$string.wifi_could_not_change_body), false);
        }
    }

    /* renamed from: v3 */
    private String m23797v3(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str = "<" + SelectableItem.m15535j1(C17541R$string.no_ssid) + ">";
        }
        sb.append(str);
        if (str2 != null) {
            str3 = "\n(" + str2 + ")";
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: w3 */
    private CharSequence m23798w3(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "(" + SelectableItem.m15535j1(C17541R$string.no_ssid) + ")";
        }
        if (str2 == null) {
            return Html.fromHtml("<b>" + str + "</b>");
        }
        return Html.fromHtml("<b>" + str + "</b><br/><small>" + str2 + "</small>");
    }

    /* renamed from: x3 */
    private String[] m23799x3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_wifi_SSID_in_range), SelectableItem.m15535j1(C17541R$string.trigger_wifi_SSID_out_of_range)};
    }

    /* renamed from: A3 */
    public boolean mo31673A3() {
        return this.m_InRange;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_InRange ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m23799x3()[!this.m_InRange];
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return mo31675z3().size() > 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.m_SSID;
        if (str != null) {
            return str;
        }
        List<WifiCellInfo> z3 = mo31675z3();
        if (z3.size() == 1) {
            return z3.get(0).getSsid();
        }
        ArrayList arrayList = new ArrayList();
        for (WifiCellInfo next : z3) {
            if (!arrayList.contains(next.getSsid())) {
                arrayList.add(next.getSsid());
            }
        }
        return arrayList.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        Activity j0 = mo27850j0();
        if (j0 == null || Build.VERSION.SDK_INT < 23) {
            super.mo24689O1();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, C17542R$style.Theme_App_Dialog_Trigger);
        builder.setTitle((int) C17541R$string.trigger_wifi_SSID);
        builder.setMessage((int) C17541R$string.trigger_wifi_SSID_marshmallow_warning);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6144ta(this, j0));
        try {
            builder.show();
        } catch (Exception unused) {
        }
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            if (s_pendingIntent != null) {
                ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(s_pendingIntent);
                s_pendingIntent = null;
            }
            if (s_updateRateReceiver != null) {
                try {
                    mo27827K0().unregisterReceiver(s_updateRateReceiver);
                } catch (Exception e) {
                    C8151a.m33873n(e);
                }
            }
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_wifiScanCompleteReceiver);
            } catch (Exception e2) {
                C8151a.m33873n(e2);
            }
            s_wifiLock.release();
            s_wifiScanCompleteReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7525k2.m31304u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24694c(mo24672O0(), 15) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            WifiManager wifiManager = (WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi");
            s_wifiManager = wifiManager;
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(2, "WifiConnectionTrigger");
            s_wifiLock = createWifiLock;
            createWifiLock.acquire();
            s_wifiScanCompleteReceiver = new WifiScanCompleteReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_wifiScanCompleteReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            AlarmManager alarmManager = (AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM);
            int A2 = C5163j2.m19925A2(mo27827K0()) * 60;
            if (A2 > 0) {
                s_pendingIntent = PendingIntent.getBroadcast(mo27827K0(), 0, new Intent(mo27827K0(), InitiateWifScanReceiver.class), 134217728 | C6368b1.f14959b);
                alarmManager.setRepeating(0, System.currentTimeMillis(), (long) (A2 * 1000), s_pendingIntent);
            }
            IntentFilter intentFilter = new IntentFilter("WifiBackgroundScanRateIntent");
            s_updateRateReceiver = new C5804f(this, (C5799a) null);
            mo27827K0().registerReceiver(s_updateRateReceiver, intentFilter);
            try {
                ((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).startScan();
            } catch (SecurityException unused) {
            }
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23799x3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return Build.VERSION.SDK_INT > 26;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (!((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).isWifiEnabled()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((int) C17541R$string.wifi_currently_disabled);
            builder.setMessage((int) C17541R$string.wifi_connection_must_enable).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6092sa(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) C6156ua.f14628a);
            builder.create().show();
        } else if (Build.VERSION.SDK_INT < 30) {
            m23781M3();
        } else if (C4031k.m15910j()) {
            m23781M3();
        } else {
            C7439d0.m30907n0(mo27850j0(), mo25559a1(), new C5799a());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_SSID);
        parcel.writeInt(this.m_InRange ^ true ? 1 : 0);
        parcel.writeStringList(this.m_SSIDList);
        parcel.writeList(this.wifiCellInfoList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_InRange = i == 0;
    }

    /* renamed from: y3 */
    public List<String> mo31674y3() {
        if (this.m_SSID != null) {
            ArrayList arrayList = new ArrayList();
            this.m_SSIDList = arrayList;
            arrayList.add(this.m_SSID);
            this.m_SSID = null;
        }
        return this.m_SSIDList;
    }

    /* renamed from: z3 */
    public List<WifiCellInfo> mo31675z3() {
        if (this.wifiCellInfoList == null) {
            this.wifiCellInfoList = new ArrayList();
            for (String next : mo31674y3()) {
                this.wifiCellInfoList.add(new WifiCellInfo(next, (String) null, next));
            }
        }
        return this.wifiCellInfoList;
    }

    public WifiSSIDTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private WifiSSIDTrigger() {
        this.m_connectReceiver = new C5800b();
        m23771D1();
    }

    private WifiSSIDTrigger(Parcel parcel) {
        super(parcel);
        this.m_connectReceiver = new C5800b();
        m23771D1();
        this.m_SSIDList = new ArrayList();
        this.wifiCellInfoList = new ArrayList();
        this.m_SSID = parcel.readString();
        this.m_InRange = parcel.readInt() == 0;
        parcel.readStringList(this.m_SSIDList);
        parcel.readArrayList(WifiCellInfo.class.getClassLoader());
    }
}
