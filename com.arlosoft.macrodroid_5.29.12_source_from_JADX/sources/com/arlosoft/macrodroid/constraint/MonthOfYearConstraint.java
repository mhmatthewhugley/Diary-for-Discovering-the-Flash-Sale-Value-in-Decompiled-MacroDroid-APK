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
import com.arlosoft.macrodroid.utils.C6424s;
import java.util.Calendar;
import p123l1.C7625k0;
import p148q0.C8151a;

public class MonthOfYearConstraint extends Constraint {
    public static final Parcelable.Creator<MonthOfYearConstraint> CREATOR = new C4171a();
    private boolean[] m_months;

    /* renamed from: com.arlosoft.macrodroid.constraint.MonthOfYearConstraint$a */
    class C4171a implements Parcelable.Creator<MonthOfYearConstraint> {
        C4171a() {
        }

        /* renamed from: a */
        public MonthOfYearConstraint createFromParcel(Parcel parcel) {
            return new MonthOfYearConstraint(parcel, (C4171a) null);
        }

        /* renamed from: b */
        public MonthOfYearConstraint[] newArray(int i) {
            return new MonthOfYearConstraint[i];
        }
    }

    /* synthetic */ MonthOfYearConstraint(Parcel parcel, C4171a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public /* synthetic */ void m16827i3(DialogInterface dialogInterface, int i, boolean z) {
        this.m_months[i] = z;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= 12) {
                break;
            } else if (this.m_months[i2]) {
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
    public /* synthetic */ void m16828j3(DialogInterface dialogInterface, int i) {
        mo24677v2();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        String[] b = C6424s.m24735b();
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_months;
            if (i >= zArr.length) {
                break;
            }
            if (zArr[i]) {
                sb.append(b[i]);
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
        int i = Calendar.getInstance().get(2);
        if (i >= 0 && i < 12) {
            return this.m_months[i];
        }
        C8151a.m33873n(new RuntimeException("DayOfWeekConstraint: Invalid month value: " + i));
        return true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7625k0.m31759u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AlertDialog create = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.constraint_month_of_year).setMultiChoiceItems((CharSequence[]) C6424s.m24735b(), this.m_months, (DialogInterface.OnMultiChoiceClickListener) new C4259g2(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4253f2(this)).create();
        create.show();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 12) {
                break;
            } else if (this.m_months[i]) {
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
        parcel.writeBooleanArray(this.m_months);
    }

    public MonthOfYearConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public MonthOfYearConstraint() {
        this.m_months = new boolean[12];
    }

    private MonthOfYearConstraint(Parcel parcel) {
        super(parcel);
        boolean[] zArr = new boolean[12];
        this.m_months = zArr;
        parcel.readBooleanArray(zArr);
    }
}
