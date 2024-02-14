package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.lang.reflect.Method;
import p123l1.C7620i1;
import p148q0.C8151a;

public class WifiHotSpotConstraint extends Constraint {
    private static final int COMPARISON_EQUALS = 0;
    private static final int COMPARISON_GREATER_THAN = 2;
    private static final int COMPARISON_LESS_THAN = 1;
    public static final Parcelable.Creator<WifiHotSpotConstraint> CREATOR = new C4219b();
    private boolean m_checkConnections;
    private int m_comparisonValue;
    /* access modifiers changed from: private */
    public int m_connectedCount;
    private boolean m_enabled;

    /* renamed from: com.arlosoft.macrodroid.constraint.WifiHotSpotConstraint$a */
    class C4218a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10782a;

        C4218a(TextView textView) {
            this.f10782a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = WifiHotSpotConstraint.this.m_connectedCount = i;
            TextView textView = this.f10782a;
            textView.setText("" + i);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.WifiHotSpotConstraint$b */
    class C4219b implements Parcelable.Creator<WifiHotSpotConstraint> {
        C4219b() {
        }

        /* renamed from: a */
        public WifiHotSpotConstraint createFromParcel(Parcel parcel) {
            return new WifiHotSpotConstraint(parcel, (C4218a) null);
        }

        /* renamed from: b */
        public WifiHotSpotConstraint[] newArray(int i) {
            return new WifiHotSpotConstraint[i];
        }
    }

    /* synthetic */ WifiHotSpotConstraint(Parcel parcel, C4218a aVar) {
        this(parcel);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x005e */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m17239m3(boolean r7) {
        /*
            r6 = this;
            android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
            r0.<init>()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.permitNetwork()
            android.os.StrictMode$ThreadPolicy r0 = r0.build()
            android.os.StrictMode.setThreadPolicy(r0)
            r0 = 0
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x005e, all -> 0x0059 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x005e, all -> 0x0059 }
            java.lang.String r4 = "/proc/net/arp"
            r3.<init>(r4)     // Catch:{ Exception -> 0x005e, all -> 0x0059 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x005e, all -> 0x0059 }
            r1 = 0
        L_0x001f:
            java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            java.lang.String r4 = " +"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            if (r3 == 0) goto L_0x001f
            int r4 = r3.length     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            r5 = 4
            if (r4 <= r5) goto L_0x001f
            r4 = 3
            r4 = r3[r4]     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            java.lang.String r5 = "..:..:..:..:..:.."
            boolean r4 = r4.matches(r5)     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            if (r4 == 0) goto L_0x001f
            if (r7 == 0) goto L_0x004c
            r3 = r3[r0]     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            r4 = 200(0xc8, float:2.8E-43)
            boolean r3 = r3.isReachable(r4)     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            if (r3 == 0) goto L_0x001f
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x001f
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0062
        L_0x0053:
            r7 = move-exception
            r1 = r2
            goto L_0x005a
        L_0x0056:
            r0 = r1
            r1 = r2
            goto L_0x005e
        L_0x0059:
            r7 = move-exception
        L_0x005a:
            r1.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            throw r7
        L_0x005e:
            r1.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            r1 = r0
        L_0x0062:
            android.os.StrictMode$ThreadPolicy$Builder r7 = new android.os.StrictMode$ThreadPolicy$Builder
            r7.<init>()
            android.os.StrictMode$ThreadPolicy$Builder r7 = r7.detectNetwork()
            android.os.StrictMode$ThreadPolicy r7 = r7.build()
            android.os.StrictMode.setThreadPolicy(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.WifiHotSpotConstraint.m17239m3(boolean):int");
    }

    /* renamed from: n3 */
    private void m17240n3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.hotspot_devices_constraint_dialog);
        appCompatDialog.setTitle((int) C17541R$string.constraint_wifi_hotspot_devices_connected);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.hotspot_devices_constraint_dialog_seek_bar);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.hotspot_devices_constraint_dialog_value);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.hotspot_devices_constraint_dialog_equals);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.hotspot_devices_constraint_dialog_greater_than);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.hotspot_devices_constraint_dialog_less_than);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        seekBar.setProgress(this.m_connectedCount);
        textView.setText("" + this.m_connectedCount);
        int i = this.m_comparisonValue;
        if (i == 0) {
            radioButton.setChecked(true);
        } else if (i == 1) {
            radioButton3.setChecked(true);
        } else if (i == 2) {
            radioButton2.setChecked(true);
        }
        seekBar.setOnSeekBarChangeListener(new C4218a(textView));
        radioButton.setOnCheckedChangeListener(new C4255f4(this));
        radioButton2.setOnCheckedChangeListener(new C4249e4(this));
        radioButton3.setOnCheckedChangeListener(new C4243d4(this));
        button.setOnClickListener(new C4237c4(this, appCompatDialog));
        button2.setOnClickListener(new C4231b4(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: o3 */
    private String[] m17241o3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_hotspot_on), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_hotspot_count), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_hotspot_off)};
    }

    /* renamed from: p3 */
    private String[] m17242p3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_hotspot_on), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_wifi_hotspot_off)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m17243q3(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.m_comparisonValue = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m17244r3(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.m_comparisonValue = 2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m17245s3(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.m_comparisonValue = 1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m17246t3(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.m_enabled ^ true ? 1 : 0;
        }
        if (!this.m_enabled) {
            return 2;
        }
        if (this.m_checkConnections) {
            return 1;
        }
        return 0;
    }

    /* renamed from: H0 */
    public String mo27823H0() {
        return mo24672O0();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (!this.m_enabled) {
            return m17241o3()[2];
        }
        if (!this.m_checkConnections || Build.VERSION.SDK_INT >= 29) {
            return m17241o3()[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.constraint_wifi_hotspot_devices_connected));
        sb.append(" ");
        int i = this.m_comparisonValue;
        sb.append(i == 0 ? "=" : i == 1 ? "<" : ">");
        sb.append(" ");
        sb.append(this.m_connectedCount);
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        WifiManager wifiManager = (WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi");
        try {
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("getWifiApState", new Class[0]);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(wifiManager, (Object[]) null)).intValue();
            if (intValue > 10) {
                intValue -= 10;
            }
            if (!(intValue == 0 || intValue == 1)) {
                if (intValue == 2 || intValue == 3) {
                    if (this.m_checkConnections) {
                        if (Build.VERSION.SDK_INT < 29) {
                            int m3 = m17239m3(true);
                            int i = this.m_comparisonValue;
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        return true;
                                    }
                                    if (m3 > this.m_connectedCount) {
                                        return true;
                                    }
                                    return false;
                                } else if (m3 < this.m_connectedCount) {
                                    return true;
                                } else {
                                    return false;
                                }
                            } else if (m3 == this.m_connectedCount) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                    return this.m_enabled;
                } else if (intValue != 4) {
                    return true;
                }
            }
            return !this.m_enabled;
        } catch (Exception e) {
            C4878b.m18869h("Error getting wifi AP State: " + e.getMessage(), mo27840Y0().longValue());
            C8151a.m33873n(new RuntimeException("Error getting wifi AP State: " + e.getMessage()));
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7620i1.m31737u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        if (Build.VERSION.SDK_INT < 29) {
            return m17241o3();
        }
        return m17242p3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.constraint_wifi_hotspot_select_state);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_checkConnections) {
            m17240n3();
        } else {
            super.mo24677v2();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_enabled ? 1 : 0);
        parcel.writeInt(this.m_connectedCount);
        parcel.writeInt(this.m_comparisonValue);
        parcel.writeInt(this.m_checkConnections ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        if (i == 0) {
            this.m_enabled = true;
            this.m_checkConnections = false;
        } else if (i != 1) {
            if (i == 2) {
                this.m_enabled = false;
                this.m_checkConnections = false;
            }
        } else if (Build.VERSION.SDK_INT < 29) {
            this.m_enabled = true;
            this.m_checkConnections = true;
        } else {
            this.m_enabled = false;
            this.m_checkConnections = false;
        }
    }

    public WifiHotSpotConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private WifiHotSpotConstraint() {
        this.m_enabled = true;
        this.m_connectedCount = 0;
        this.m_comparisonValue = 0;
        this.m_checkConnections = false;
    }

    private WifiHotSpotConstraint(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_enabled = parcel.readInt() != 0;
        this.m_connectedCount = parcel.readInt();
        this.m_comparisonValue = parcel.readInt();
        this.m_checkConnections = parcel.readInt() == 0 ? false : z;
    }
}
