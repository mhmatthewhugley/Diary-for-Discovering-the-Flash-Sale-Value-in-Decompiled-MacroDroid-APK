package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.Calendar;
import p123l1.C7634o;
import p148q0.C8151a;

public class DayOfMonthConstraint extends Constraint {
    public static final Parcelable.Creator<DayOfMonthConstraint> CREATOR = new C4134a();
    private String[] m_dayNames;
    private boolean[] m_daysOfMonth;

    /* renamed from: com.arlosoft.macrodroid.constraint.DayOfMonthConstraint$a */
    class C4134a implements Parcelable.Creator<DayOfMonthConstraint> {
        C4134a() {
        }

        /* renamed from: a */
        public DayOfMonthConstraint createFromParcel(Parcel parcel) {
            return new DayOfMonthConstraint(parcel, (C4134a) null);
        }

        /* renamed from: b */
        public DayOfMonthConstraint[] newArray(int i) {
            return new DayOfMonthConstraint[i];
        }
    }

    /* synthetic */ DayOfMonthConstraint(Parcel parcel, C4134a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m16388D1() {
        this.m_dayNames = new String[31];
        int i = 0;
        while (i < 31) {
            int i2 = i + 1;
            this.m_dayNames[i] = String.valueOf(i2);
            i = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public /* synthetic */ void m16391i3(DialogInterface dialogInterface, int i, boolean z) {
        this.m_daysOfMonth[i] = z;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= 31) {
                break;
            } else if (this.m_daysOfMonth[i2]) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        ((AlertDialog) dialogInterface).getButton(-1).setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void m16392j3(DialogInterface dialogInterface, int i) {
        mo24677v2();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_daysOfMonth;
            if (i >= zArr.length) {
                break;
            }
            if (zArr[i]) {
                sb.append(i + 1);
                sb.append(", ");
            }
            i++;
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            sb = new StringBuilder(sb.substring(0, sb.length() - 2));
        }
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int i = Calendar.getInstance().get(5);
        if (i >= 1 && i <= 31) {
            return this.m_daysOfMonth[i - 1];
        }
        C8151a.m33873n(new RuntimeException("DayOfWeekConstraint: Invalid day value: " + i));
        return true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7634o.m31800u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AlertDialog create = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.constraint_day_of_month).setMultiChoiceItems((CharSequence[]) this.m_dayNames, this.m_daysOfMonth, (DialogInterface.OnMultiChoiceClickListener) new C4239d0(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4233c0(this)).create();
        create.show();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 31) {
                break;
            } else if (this.m_daysOfMonth[i]) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        create.getButton(-1).setEnabled(z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBooleanArray(this.m_daysOfMonth);
    }

    public DayOfMonthConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public DayOfMonthConstraint() {
        this.m_daysOfMonth = new boolean[31];
        m16388D1();
    }

    private DayOfMonthConstraint(Parcel parcel) {
        super(parcel);
        this.m_daysOfMonth = new boolean[31];
        m16388D1();
        parcel.readBooleanArray(this.m_daysOfMonth);
    }
}
