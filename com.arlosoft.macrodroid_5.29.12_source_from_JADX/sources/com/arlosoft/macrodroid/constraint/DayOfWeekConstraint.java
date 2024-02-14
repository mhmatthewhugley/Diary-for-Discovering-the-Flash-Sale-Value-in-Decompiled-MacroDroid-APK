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
import java.text.DateFormatSymbols;
import java.util.Calendar;
import p123l1.C7636p;
import p148q0.C8151a;

public class DayOfWeekConstraint extends Constraint {
    public static final Parcelable.Creator<DayOfWeekConstraint> CREATOR = new C4135a();
    private boolean[] m_daysOfWeek;

    /* renamed from: com.arlosoft.macrodroid.constraint.DayOfWeekConstraint$a */
    class C4135a implements Parcelable.Creator<DayOfWeekConstraint> {
        C4135a() {
        }

        /* renamed from: a */
        public DayOfWeekConstraint createFromParcel(Parcel parcel) {
            return new DayOfWeekConstraint(parcel, (C4135a) null);
        }

        /* renamed from: b */
        public DayOfWeekConstraint[] newArray(int i) {
            return new DayOfWeekConstraint[i];
        }
    }

    /* synthetic */ DayOfWeekConstraint(Parcel parcel, C4135a aVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private static String[] m16403i3() {
        return new String[]{m16404j3()[2], m16404j3()[3], m16404j3()[4], m16404j3()[5], m16404j3()[6], m16404j3()[7], m16404j3()[1]};
    }

    /* renamed from: j3 */
    private static String[] m16404j3() {
        return new DateFormatSymbols().getWeekdays();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m16405k3(DialogInterface dialogInterface, int i, boolean z) {
        boolean z2 = true;
        this.m_daysOfWeek[(i + 1) % 7] = z;
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                z2 = false;
                break;
            } else if (this.m_daysOfWeek[i2]) {
                break;
            } else {
                i2++;
            }
        }
        ((AlertDialog) dialogInterface).getButton(-1).setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m16406l3(DialogInterface dialogInterface, int i) {
        mo24677v2();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (true) {
            boolean[] zArr = this.m_daysOfWeek;
            if (i >= zArr.length + 1) {
                break;
            }
            if (zArr[i % 7]) {
                sb.append(m16403i3()[i - 1].substring(0, 3));
                sb.append(",");
            }
            i++;
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            sb = new StringBuilder(sb.substring(0, sb.length() - 1));
        }
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int i = Calendar.getInstance().get(7);
        if (i >= 1 && i <= 7) {
            return this.m_daysOfWeek[i - 1];
        }
        C8151a.m33873n(new RuntimeException("DayOfWeekConstraint: Invalid day value: " + i));
        return true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7636p.m31810u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: m3 */
    public void mo28132m3(boolean[] zArr) {
        this.m_daysOfWeek = zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        boolean[] zArr = new boolean[7];
        boolean z = false;
        int i = 0;
        while (i < 7) {
            int i2 = i + 1;
            zArr[i] = this.m_daysOfWeek[i2 % 7];
            i = i2;
        }
        AlertDialog create = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.constraint_day_of_week_select_days).setMultiChoiceItems((CharSequence[]) m16403i3(), zArr, (DialogInterface.OnMultiChoiceClickListener) new C4251f0(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4245e0(this)).create();
        create.show();
        int i3 = 0;
        while (true) {
            if (i3 >= 7) {
                break;
            } else if (this.m_daysOfWeek[i3]) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        create.getButton(-1).setEnabled(z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBooleanArray(this.m_daysOfWeek);
    }

    public DayOfWeekConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public DayOfWeekConstraint() {
        this.m_daysOfWeek = new boolean[7];
    }

    private DayOfWeekConstraint(Parcel parcel) {
        super(parcel);
        boolean[] zArr = new boolean[7];
        this.m_daysOfWeek = zArr;
        parcel.readBooleanArray(zArr);
    }
}
