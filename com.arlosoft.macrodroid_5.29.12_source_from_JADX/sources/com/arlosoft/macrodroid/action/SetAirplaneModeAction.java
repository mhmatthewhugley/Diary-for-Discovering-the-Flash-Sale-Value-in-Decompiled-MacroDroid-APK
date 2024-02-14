package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.permissions.PermissionRequestActivity;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6364b;
import com.arlosoft.macrodroid.utils.C6374d1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p112j2.C7439d0;
import p128m0.C7725d3;
import p148q0.C8151a;
import p150q2.C8164a;
import p297ja.C13339u;
import p370qa.C16254a;

public class SetAirplaneModeAction extends Action {
    public static final Parcelable.Creator<SetAirplaneModeAction> CREATOR = new C2620b();
    private static final String MACRODROID_DIGITAL_ASSISTANT = "com.arlosoft.macrodroid/com.arlosoft.macrodroid.voiceservice.MacroDroidVoiceService";
    private static final int MECHANISM_ADB_HACK = 2;
    private static final int MECHANISM_ASSIST = 1;
    private static final int MECHANISM_ROOT = 0;
    private static int s_actionCounter;
    private static C2621c s_airplaneModeTriggerReceiver;
    private boolean configComplete;
    private transient boolean isEditing;
    private boolean m_keepBluetoothOn;
    private boolean m_keepWifiOn;
    private int m_state;
    private int mechanismOption;

    /* renamed from: com.arlosoft.macrodroid.action.SetAirplaneModeAction$a */
    class C2619a implements C16254a<C13339u> {
        C2619a() {
        }

        /* renamed from: a */
        public C13339u invoke() {
            SetAirplaneModeAction.this.mo24689O1();
            return null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetAirplaneModeAction$b */
    class C2620b implements Parcelable.Creator<SetAirplaneModeAction> {
        C2620b() {
        }

        /* renamed from: a */
        public SetAirplaneModeAction createFromParcel(Parcel parcel) {
            return new SetAirplaneModeAction(parcel, (C2619a) null);
        }

        /* renamed from: b */
        public SetAirplaneModeAction[] newArray(int i) {
            return new SetAirplaneModeAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetAirplaneModeAction$c */
    private static class C2621c extends BroadcastReceiver {
        private C2621c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!intent.getBooleanExtra("state", false)) {
                try {
                    C4061t1.m15949C0(new String[]{"settings put global airplane_mode_radios cell,wimax,bluetooth,nfc,wifi"}, false);
                } catch (Exception unused) {
                }
            }
        }

        /* synthetic */ C2621c(C2619a aVar) {
            this();
        }
    }

    /* synthetic */ SetAirplaneModeAction(Parcel parcel, C2619a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m12199A3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m12200B3(DialogInterface dialogInterface, int i, boolean z) {
        if (i == 0) {
            this.m_keepWifiOn = z;
        } else if (i == 1) {
            this.m_keepBluetoothOn = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m12201C3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m12202D3(boolean z) {
        boolean z2;
        try {
            String string = Settings.Secure.getString(mo27827K0().getContentResolver(), "assistant");
            boolean putString = Settings.Secure.putString(mo27827K0().getContentResolver(), "assistant", MACRODROID_DIGITAL_ASSISTANT);
            boolean putString2 = Settings.Secure.putString(mo27827K0().getContentResolver(), "voice_interaction_service", MACRODROID_DIGITAL_ASSISTANT);
            Thread.sleep(1000);
            Intent intent = new Intent("com.arlosoft.macrodropid.action.ASSISTANT");
            intent.putExtra("ACTION", "android.settings.VOICE_CONTROL_AIRPLANE_MODE");
            intent.putExtra("airplane_mode_enabled", z);
            mo27827K0().sendBroadcast(intent);
            Thread.sleep(1000);
            boolean putString3 = Settings.Secure.putString(mo27827K0().getContentResolver(), "assistant", string);
            z2 = Settings.Secure.putString(mo27827K0().getContentResolver(), "voice_interaction_service", string);
        } catch (Exception unused) {
            z2 = false;
        }
        if (!z2) {
            C4878b.m18869h("Could not set airplane mode, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS", mo27840Y0().longValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m12203E3() {
        try {
            C4061t1.m15951D0(new String[]{"svc wifi enable"});
        } catch (Exception e) {
            C4878b.m18869h("WifiManager refused to set wifi on: " + e.toString(), mo27840Y0().longValue());
            C8151a.m33873n(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m12204F3(BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter != null) {
            try {
                bluetoothAdapter.enable();
            } catch (SecurityException unused) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C7439d0.m30909o0(mo27827K0(), "android.permission.BLUETOOTH_CONNECT", mo25559a1(), true, false);
                }
            }
        }
    }

    /* renamed from: s3 */
    private void m12214s3() {
        this.mechanismOption = 1;
    }

    /* renamed from: u3 */
    private void m12215u3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_airplane_mode_options);
        builder.setMultiChoiceItems((CharSequence[]) new String[]{SelectableItem.m15535j1(C17541R$string.action_set_airplane_mode_keep_wifi_on), SelectableItem.m15535j1(C17541R$string.action_set_airplane_mode_keep_bluetooth_on)}, new boolean[]{this.m_keepWifiOn, this.m_keepBluetoothOn}, (DialogInterface.OnMultiChoiceClickListener) new C3342pf(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3312of(this));
        builder.create().show();
    }

    /* renamed from: v3 */
    private String[] m12216v3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.root_only), SelectableItem.m15535j1(C17541R$string.trigger_airplane_mode_use_macrodroid_as_default_assist_app), SelectableItem.m15535j1(C17541R$string.adb_hack)};
    }

    /* renamed from: w3 */
    private String[] m12217w3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_airplane_mode_on), SelectableItem.m15535j1(C17541R$string.action_set_airplane_mode_off), SelectableItem.m15535j1(C17541R$string.action_set_airplane_mode_toggle)};
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m12218x3(DialogInterface dialogInterface, int i) {
        this.m_state = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m12219y3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m12220z3(DialogInterface dialogInterface, int i) {
        int i2;
        if (this.mechanismOption == 0 && ((i2 = this.m_state) == 0 || i2 == 2)) {
            m12215u3();
            return;
        }
        this.isEditing = false;
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.mechanismOption;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12217w3()[this.m_state];
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        if (this.mechanismOption != 1 || C4031k.m15908h(mo27827K0())) {
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        int i = this.mechanismOption;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                if (!C4031k.m15908h(mo27827K0())) {
                    return SelectableItem.m15535j1(C17541R$string.requires_assist_and_voice_input);
                }
                return null;
            } else if (i != 2) {
                return null;
            } else {
                if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.WRITE_SECURE_SETTINGS") != 0) {
                    z = false;
                }
                if (z) {
                    return null;
                }
                return SelectableItem.m15535j1(C17541R$string.rooted_or_adb_hack_required) + " " + "android.permission.WRITE_SECURE_SETTINGS";
            }
        } else if (!C8164a.m33886a()) {
            return SelectableItem.m15535j1(C17541R$string.rooted_device_required);
        } else {
            return null;
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = "";
        if (this.m_state == 1) {
            return str;
        }
        if (!this.m_keepWifiOn) {
            return this.m_keepBluetoothOn ? SelectableItem.m15535j1(C17541R$string.action_set_airplane_mode_keep_bluetooth_on) : str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.action_set_airplane_mode_keep_wifi_on));
        if (this.m_keepBluetoothOn) {
            str = ", " + SelectableItem.m15535j1(C17541R$string.action_set_airplane_mode_keep_bluetooth_on);
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        super.mo24689O1();
        this.configComplete = true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7725d3.m32213u();
    }

    /* renamed from: U2 */
    public void mo24692U2() {
        int i = s_actionCounter - 1;
        s_actionCounter = i;
        if (i == 0) {
            MacroDroidApplication.m14845u().unregisterReceiver(s_airplaneModeTriggerReceiver);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo24694V2() {
        if (s_actionCounter == 0) {
            s_airplaneModeTriggerReceiver = new C2621c((C2619a) null);
            MacroDroidApplication.m14845u().registerReceiver(s_airplaneModeTriggerReceiver, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        }
        s_actionCounter++;
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        this.isEditing = true;
        super.mo25540W1();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        boolean z = Settings.System.getInt(mo27827K0().getContentResolver(), "airplane_mode_on", 0) != 0;
        BluetoothAdapter adapter = ((BluetoothManager) mo27827K0().getSystemService("bluetooth")).getAdapter();
        boolean z2 = adapter != null && adapter.isEnabled();
        int i = this.m_state;
        boolean z3 = i != 0 ? (i == 1 || i != 2) ? false : !z : true;
        int i2 = this.mechanismOption;
        if (i2 == 1) {
            Intent intent = new Intent("com.arlosoft.macrodropid.action.ASSISTANT");
            intent.putExtra("ACTION", "android.settings.VOICE_CONTROL_AIRPLANE_MODE");
            intent.putExtra("airplane_mode_enabled", z3);
            mo27827K0().sendBroadcast(intent);
        } else if (i2 == 2) {
            new Thread(new C3450sf(this, z3)).start();
        } else {
            boolean z4 = ((WifiManager) mo27827K0().getApplicationContext().getSystemService("wifi")).getWifiState() == 3;
            int a = C6374d1.m24616a("android.net.IConnectivityManager", "setAirplaneMode");
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("service call connectivity ");
            sb.append(a);
            sb.append(" i32 ");
            String str = "1";
            sb.append(z3 ? str : "0");
            strArr[0] = sb.toString();
            C4061t1.m15951D0(strArr);
            String[] strArr2 = new String[2];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("settings put global airplane_mode_on ");
            if (!z3) {
                str = "0";
            }
            sb2.append(str);
            strArr2[0] = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("su -c am broadcast -a android.intent.action.AIRPLANE_MODE --ez state ");
            sb3.append(z3 ? "true" : "false");
            strArr2[1] = sb3.toString();
            C4061t1.m15951D0(strArr2);
            if (this.m_keepWifiOn && z4) {
                new Handler(mo27827K0().getMainLooper()).postDelayed(new C3370qf(this), 1000);
            }
            if (this.m_keepBluetoothOn && z2) {
                new Handler(mo27827K0().getMainLooper()).postDelayed(new C3399rf(this, adapter), 1000);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12216v3();
    }

    /* renamed from: i2 */
    public boolean mo25569i2() {
        return !this.isEditing && this.configComplete && this.mechanismOption == 1;
    }

    /* renamed from: k0 */
    public List<String> mo25570k0() {
        if (!this.configComplete || this.mechanismOption != 2) {
            return new ArrayList();
        }
        return Collections.singletonList("android.permission.WRITE_SECURE_SETTINGS");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public AlertDialog mo25571t3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m12217w3(), this.m_state, (DialogInterface.OnClickListener) new C3256mf(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3284nf(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3228lf(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3200kf(this));
        return create;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (Build.VERSION.SDK_INT >= 24) {
            super.mo24714u1();
            return;
        }
        this.mechanismOption = 0;
        mo25571t3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        mo25571t3();
    }

    /* renamed from: w1 */
    public void mo24706w1() {
        this.isEditing = false;
        super.mo24706w1();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
        parcel.writeInt(this.m_keepWifiOn ? 1 : 0);
        parcel.writeInt(this.m_keepBluetoothOn ? 1 : 0);
        parcel.writeInt(this.mechanismOption);
        parcel.writeInt(this.configComplete ? 1 : 0);
    }

    /* renamed from: x1 */
    public void mo25283x1() {
        if (this.mechanismOption == 2) {
            C6364b.m24611b(mo27850j0(), mo25570k0(), new C2619a());
        } else if (Build.VERSION.SDK_INT >= 24) {
            PermissionRequestActivity.m19280Y1(mo27850j0());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.mechanismOption = i;
    }

    public SetAirplaneModeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        m12214s3();
    }

    public SetAirplaneModeAction() {
        this.isEditing = false;
        this.m_state = 0;
        this.m_keepWifiOn = false;
        m12214s3();
    }

    private SetAirplaneModeAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.isEditing = false;
        this.m_state = parcel.readInt();
        this.m_keepWifiOn = parcel.readInt() != 0;
        this.m_keepBluetoothOn = parcel.readInt() != 0;
        this.mechanismOption = parcel.readInt();
        this.configComplete = parcel.readInt() != 0 ? true : z;
    }
}
