package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7641r0;

public class PriorityModeConstraint extends Constraint {
    public static final Parcelable.Creator<PriorityModeConstraint> CREATOR = new C4180a();
    private boolean m_inMode;
    private int m_selectedIndex;

    /* renamed from: com.arlosoft.macrodroid.constraint.PriorityModeConstraint$a */
    class C4180a implements Parcelable.Creator<PriorityModeConstraint> {
        C4180a() {
        }

        /* renamed from: a */
        public PriorityModeConstraint createFromParcel(Parcel parcel) {
            return new PriorityModeConstraint(parcel, (C4180a) null);
        }

        /* renamed from: b */
        public PriorityModeConstraint[] newArray(int i) {
            return new PriorityModeConstraint[i];
        }
    }

    /* synthetic */ PriorityModeConstraint(Parcel parcel, C4180a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private String[] m16939k3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_priority_mode_is_in_mode), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_priority_mode_not_in_mode)};
    }

    /* renamed from: l3 */
    private String[] m16940l3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_set_priority_mode_all), MacroDroidApplication.m14845u().getString(C17541R$string.action_set_priority_mode_priority), MacroDroidApplication.m14845u().getString(C17541R$string.action_set_priority_mode_none)};
    }

    /* renamed from: m3 */
    private String[] m16941m3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_all), SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_priority), SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_none), SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_alarm_only)};
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m16942n3(DialogInterface dialogInterface, int i) {
        this.m_selectedIndex = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m16943o3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m16944p3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m16945q3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_inMode ^ true ? 1 : 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m16939k3()[!this.m_inMode] + ": " + m16941m3()[this.m_selectedIndex];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (Build.VERSION.SDK_INT >= 23) {
            int currentInterruptionFilter = ((NotificationManager) mo27827K0().getSystemService("notification")).getCurrentInterruptionFilter();
            int i = this.m_selectedIndex;
            if (i == 0) {
                if ((currentInterruptionFilter == 1) == this.m_inMode) {
                    return true;
                }
                return false;
            } else if (i == 1) {
                if ((currentInterruptionFilter == 2) == this.m_inMode) {
                    return true;
                }
                return false;
            } else if (i == 2) {
                if ((currentInterruptionFilter == 3) == this.m_inMode) {
                    return true;
                }
                return false;
            } else if (i != 3) {
                return true;
            } else {
                if ((currentInterruptionFilter == 4) == this.m_inMode) {
                    return true;
                }
                return false;
            }
        } else {
            int i2 = Settings.Global.getInt(mo27827K0().getContentResolver(), "zen_mode", 0);
            if (this.m_inMode) {
                if (i2 == this.m_selectedIndex) {
                    return true;
                }
                return false;
            } else if (i2 != this.m_selectedIndex) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7641r0.m31836u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24672O0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16939k3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        String[] strArr;
        if (mo27836X()) {
            if (Build.VERSION.SDK_INT >= 23) {
                strArr = m16941m3();
            } else {
                strArr = m16940l3();
            }
            if (this.m_selectedIndex >= strArr.length) {
                this.m_selectedIndex = 0;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((CharSequence) m16939k3()[!this.m_inMode]);
            builder.setSingleChoiceItems((CharSequence[]) strArr, this.m_selectedIndex, (DialogInterface.OnClickListener) new C4339w2(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4344x2(this));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4349y2(this));
            AlertDialog create = builder.create();
            create.show();
            create.setOnCancelListener(new C4334v2(this));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_selectedIndex);
        parcel.writeInt(this.m_inMode ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_inMode = i == 0;
    }

    public PriorityModeConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private PriorityModeConstraint() {
        this.m_selectedIndex = 0;
        this.m_inMode = true;
    }

    private PriorityModeConstraint(Parcel parcel) {
        super(parcel);
        this.m_selectedIndex = parcel.readInt();
        this.m_inMode = parcel.readInt() != 0;
    }
}
