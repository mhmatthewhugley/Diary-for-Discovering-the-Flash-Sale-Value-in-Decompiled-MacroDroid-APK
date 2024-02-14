package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7790l3;

public class SetGPSAction extends Action {
    public static final Parcelable.Creator<SetGPSAction> CREATOR = new C2635a();
    private static final int OPTION_GPS_OFF = 1;
    private static final int OPTION_GPS_ON = 0;
    private static final int OPTION_GPS_TOGGLE = 2;
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SetGPSAction$a */
    class C2635a implements Parcelable.Creator<SetGPSAction> {
        C2635a() {
        }

        /* renamed from: a */
        public SetGPSAction createFromParcel(Parcel parcel) {
            return new SetGPSAction(parcel, (C2635a) null);
        }

        /* renamed from: b */
        public SetGPSAction[] newArray(int i) {
            return new SetGPSAction[i];
        }
    }

    /* synthetic */ SetGPSAction(Parcel parcel, C2635a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private String[] m12403k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_gps_on), SelectableItem.m15535j1(C17541R$string.action_set_gps_off), SelectableItem.m15535j1(C17541R$string.action_set_gps_toggle)};
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m12404l3(DialogInterface dialogInterface, int i) {
        super.mo24714u1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_state;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12403k3()[this.m_state];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7790l3.m32529u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i;
        int i2 = 3;
        if (!C5163j2.m20127c0(mo27827K0())) {
            boolean z = this.m_state == 0;
            try {
                i = Settings.Secure.getInt(mo27827K0().getContentResolver(), "location_mode");
                try {
                    if (!(this.m_state != 2 || i == 3 || i == 1)) {
                        z = true;
                    }
                } catch (Settings.SettingNotFoundException unused) {
                }
            } catch (Settings.SettingNotFoundException unused2) {
                i = 0;
            }
            if (Build.VERSION.SDK_INT < 23) {
                String string = Settings.Secure.getString(mo27827K0().getContentResolver(), "location_providers_allowed");
                String str = "network";
                if (z) {
                    String[] strArr = new String[2];
                    strArr[0] = "settings put secure location_mode " + i;
                    StringBuilder sb = new StringBuilder();
                    sb.append("settings put secure location_providers_allowed gps");
                    sb.append(string.contains(str) ? ",network" : "");
                    strArr[1] = sb.toString();
                    C4061t1.m15947B0(strArr);
                    return;
                }
                String[] strArr2 = new String[2];
                strArr2[0] = "settings put secure location_mode " + i;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("settings put secure location_providers_allowed ");
                if (!string.contains(str)) {
                    str = "off";
                }
                sb2.append(str);
                strArr2[1] = sb2.toString();
                C4061t1.m15947B0(strArr2);
            } else if (z) {
                C4061t1.m15947B0(new String[]{"settings put secure location_providers_allowed +gps"});
            } else {
                C4061t1.m15947B0(new String[]{"settings put secure location_providers_allowed -gps"});
            }
        } else {
            int i3 = this.m_state;
            if (i3 == 0) {
                i2 = 1;
            } else if (i3 == 1) {
                i2 = 2;
            } else if (i3 != 2) {
                i2 = 0;
            }
            Intent intent = new Intent("com.arlosoft.macrodroid.SYSTEM_COMMAND");
            intent.putExtra("Command", i2);
            mo27827K0().sendBroadcast(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12403k3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.gps_action_deprecated);
        builder.setMessage((int) C17541R$string.gps_action_use_set_location_mode);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3371qg(this));
        builder.create().show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_state = i;
    }

    public SetGPSAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetGPSAction() {
        this.m_state = 0;
    }

    private SetGPSAction(Parcel parcel) {
        super(parcel);
        this.m_state = parcel.readInt();
    }
}
