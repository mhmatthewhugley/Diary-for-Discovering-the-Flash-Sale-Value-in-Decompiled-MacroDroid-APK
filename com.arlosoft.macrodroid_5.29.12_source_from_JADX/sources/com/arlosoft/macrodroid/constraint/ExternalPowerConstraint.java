package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7642s;

public class ExternalPowerConstraint extends Constraint {
    private static final int CONNECTED_OPTION_WIRED_FAST = 0;
    private static final int CONNECTED_OPTION_WIRED_SLOW = 1;
    private static final int CONNECTED_OPTION_WIRELESS = 2;
    public static final Parcelable.Creator<ExternalPowerConstraint> CREATOR = new C4138a();
    private boolean m_externalPower;
    private boolean[] m_powerConnectedOptions;

    /* renamed from: com.arlosoft.macrodroid.constraint.ExternalPowerConstraint$a */
    class C4138a implements Parcelable.Creator<ExternalPowerConstraint> {
        C4138a() {
        }

        /* renamed from: a */
        public ExternalPowerConstraint createFromParcel(Parcel parcel) {
            return new ExternalPowerConstraint(parcel, (C4138a) null);
        }

        /* renamed from: b */
        public ExternalPowerConstraint[] newArray(int i) {
            return new ExternalPowerConstraint[i];
        }
    }

    /* synthetic */ ExternalPowerConstraint(Parcel parcel, C4138a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private String[] m16438k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.wired), SelectableItem.m15535j1(C17541R$string.wired_slow), SelectableItem.m15535j1(C17541R$string.wireless)};
    }

    /* renamed from: l3 */
    private String[] m16439l3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_external_power_connected), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_external_power_disconnected)};
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m16440m3(DialogInterface dialogInterface, int i, boolean z) {
        this.m_powerConnectedOptions[i] = z;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.m_powerConnectedOptions;
            if (i2 >= zArr.length) {
                break;
            } else if (zArr[i2]) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        ((AlertDialog) dialogInterface).getButton(-1).setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m16441n3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m16442o3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_externalPower ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_externalPower ? m16439l3()[0] : m16439l3()[1];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = "";
        if (!this.m_externalPower) {
            return str;
        }
        boolean[] zArr = this.m_powerConnectedOptions;
        if (zArr[0] && zArr[1] && zArr[2]) {
            return SelectableItem.m15535j1(C17541R$string.any);
        }
        if (zArr[0]) {
            str = str + m16438k3()[0];
            boolean[] zArr2 = this.m_powerConnectedOptions;
            if (zArr2[2] || zArr2[1]) {
                str = str + " + ";
            }
        }
        if (this.m_powerConnectedOptions[1]) {
            str = str + m16438k3()[1];
            if (this.m_powerConnectedOptions[2]) {
                str = str + " + ";
            }
        }
        if (!this.m_powerConnectedOptions[2]) {
            return str;
        }
        return str + m16438k3()[2];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int intExtra = mo27827K0().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
        boolean z = intExtra == 1 || intExtra == 2 || intExtra == 4;
        if (!this.m_externalPower) {
            return !z;
        }
        boolean[] zArr = this.m_powerConnectedOptions;
        if (zArr[0] && intExtra == 1) {
            return true;
        }
        if (zArr[1] && intExtra == 2) {
            return true;
        }
        if (!zArr[2] || intExtra != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7642s.m31842u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16439l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public void mo28145j3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setMultiChoiceItems((CharSequence[]) m16438k3(), this.m_powerConnectedOptions, (DialogInterface.OnMultiChoiceClickListener) new C4267i0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4262h0(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4257g0(this));
        AlertDialog create = builder.create();
        create.show();
        boolean z = false;
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_powerConnectedOptions;
            if (i >= zArr.length) {
                break;
            } else if (zArr[i]) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        create.getButton(-1).setEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (!this.m_externalPower) {
            super.mo24677v2();
        } else {
            mo28145j3();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_externalPower ? 1 : 0);
        parcel.writeBooleanArray(this.m_powerConnectedOptions);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_externalPower = i == 0;
    }

    public ExternalPowerConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ExternalPowerConstraint() {
        this.m_powerConnectedOptions = new boolean[]{true, true, true};
        this.m_externalPower = true;
    }

    private ExternalPowerConstraint(Parcel parcel) {
        super(parcel);
        this.m_powerConnectedOptions = new boolean[]{true, true, true};
        this.m_externalPower = parcel.readInt() != 0;
        parcel.readBooleanArray(this.m_powerConnectedOptions);
    }
}
