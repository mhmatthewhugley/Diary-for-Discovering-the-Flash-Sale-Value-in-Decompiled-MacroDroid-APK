package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.location.LocationManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7609f0;

public class LocationModeConstraint extends Constraint {
    public static final Parcelable.Creator<LocationModeConstraint> CREATOR = new C4160a();
    private boolean hasNewConfig;
    private boolean[] m_options;

    /* renamed from: com.arlosoft.macrodroid.constraint.LocationModeConstraint$a */
    class C4160a implements Parcelable.Creator<LocationModeConstraint> {
        C4160a() {
        }

        /* renamed from: a */
        public LocationModeConstraint createFromParcel(Parcel parcel) {
            return new LocationModeConstraint(parcel, (C4160a) null);
        }

        /* renamed from: b */
        public LocationModeConstraint[] newArray(int i) {
            return new LocationModeConstraint[i];
        }
    }

    /* synthetic */ LocationModeConstraint(Parcel parcel, C4160a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private String[] m16669l3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_location_mode_off), SelectableItem.m15535j1(C17541R$string.action_set_location_mode_device_only), SelectableItem.m15535j1(C17541R$string.action_set_location_mode_battery_saving), SelectableItem.m15535j1(C17541R$string.action_set_location_mode_high_accuracy)};
    }

    /* renamed from: m3 */
    private String[] m16670m3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_location_mode_off), SelectableItem.m15535j1(C17541R$string.action_set_location_mode_on)};
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m16671n3(DialogInterface dialogInterface, int i, boolean z) {
        this.m_options[i] = z;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            } else if (this.m_options[i2]) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        ((AlertDialog) dialogInterface).getButton(-1).setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m16672o3(DialogInterface dialogInterface, int i) {
        this.hasNewConfig = true;
        mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m16673p3(DialogInterface dialogInterface, int i) {
        boolean[] zArr = this.m_options;
        zArr[0] = false;
        zArr[1] = false;
        this.m_options[((AlertDialog) dialogInterface).getListView().getCheckedItemPosition()] = true;
        this.hasNewConfig = true;
        mo24677v2();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String[] g1 = mo24676g1();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.m_options;
            if (i < zArr.length && i < g1.length) {
                if (zArr[i]) {
                    sb.append(i2 == 0 ? "" : ", ");
                    sb.append(g1[i]);
                    i2++;
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        try {
            int i = Settings.Secure.getInt(mo27827K0().getContentResolver(), "location_mode");
            if (Build.VERSION.SDK_INT < 29) {
                return this.m_options[i];
            }
            if (!((LocationManager) mo27827K0().getSystemService("location")).isLocationEnabled()) {
                return this.m_options[0];
            }
            if (this.hasNewConfig) {
                return this.m_options[1];
            }
            boolean[] zArr = this.m_options;
            if (zArr[1] || zArr[2]) {
                return true;
            }
            if (zArr[3]) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            C4878b.m18869h("Cannot query LOCATION_MODE", mo27840Y0().longValue());
            return true;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7609f0.m31681u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        if (Build.VERSION.SDK_INT >= 29) {
            return m16670m3();
        }
        return m16669l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return mo28217k3();
        }
        return mo28216j3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public AlertDialog mo28216j3() {
        AlertDialog create = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.select_option).setMultiChoiceItems((CharSequence[]) mo24676g1(), this.m_options, (DialogInterface.OnMultiChoiceClickListener) new C4298o1(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4293n1(this)).create();
        create.show();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            } else if (this.m_options[i]) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        create.getButton(-1).setEnabled(z);
        return create;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k3 */
    public AlertDialog mo28217k3() {
        AlertDialog create = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.select_option).setSingleChoiceItems((CharSequence[]) mo24676g1(), this.m_options[0] ^ true ? 1 : 0, (DialogInterface.OnClickListener) null).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4288m1(this)).create();
        create.show();
        return create;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBooleanArray(this.m_options);
        parcel.writeInt(this.hasNewConfig ? 1 : 0);
    }

    public LocationModeConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private LocationModeConstraint() {
        boolean[] zArr = new boolean[4];
        this.m_options = zArr;
        if (Build.VERSION.SDK_INT >= 29) {
            zArr[0] = true;
        }
    }

    private LocationModeConstraint(Parcel parcel) {
        super(parcel);
        boolean[] zArr = new boolean[4];
        this.m_options = zArr;
        parcel.readBooleanArray(zArr);
        this.hasNewConfig = parcel.readInt() != 0;
    }
}
