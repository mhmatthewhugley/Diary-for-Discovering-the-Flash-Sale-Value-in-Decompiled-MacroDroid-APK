package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TimePicker;
import androidx.appcompat.view.ContextThemeWrapper;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.widget.C6638f;
import java.util.Calendar;
import p123l1.C7594a1;

public class TimeOfDayConstraint extends Constraint {
    public static final Parcelable.Creator<TimeOfDayConstraint> CREATOR = new C4202a();
    private int m_endHour;
    private int m_endMinute;
    private int m_startHour;
    private int m_startMinute;

    /* renamed from: com.arlosoft.macrodroid.constraint.TimeOfDayConstraint$a */
    class C4202a implements Parcelable.Creator<TimeOfDayConstraint> {
        C4202a() {
        }

        /* renamed from: a */
        public TimeOfDayConstraint createFromParcel(Parcel parcel) {
            return new TimeOfDayConstraint(parcel, (C4202a) null);
        }

        /* renamed from: b */
        public TimeOfDayConstraint[] newArray(int i) {
            return new TimeOfDayConstraint[i];
        }
    }

    /* synthetic */ TimeOfDayConstraint(Parcel parcel, C4202a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m17099l3(C6638f fVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        TimePicker e = fVar.mo32907e();
        e.clearFocus();
        this.m_endMinute = e.getCurrentMinute().intValue();
        this.m_endHour = e.getCurrentHour().intValue();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m17101n3(C6638f fVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        TimePicker e = fVar.mo32907e();
        e.clearFocus();
        this.m_startMinute = e.getCurrentMinute().intValue();
        this.m_startHour = e.getCurrentHour().intValue();
        m17102o3();
    }

    /* renamed from: o3 */
    private void m17102o3() {
        C6638f fVar = new C6638f(new ContextThemeWrapper((Context) mo27850j0(), mo24705l0()), (C6638f.C6639a) null, this.m_endHour, this.m_endMinute, true);
        fVar.setTitle((int) C17541R$string.end_time);
        fVar.setButton(-2, (CharSequence) SelectableItem.m15535j1(17039360), (DialogInterface.OnClickListener) C4285l3.f10906a);
        fVar.setButton(-1, (CharSequence) SelectableItem.m15535j1(17039370), (DialogInterface.OnClickListener) new C4275j3(this, fVar));
        fVar.show();
    }

    /* renamed from: p3 */
    private void m17103p3() {
        C6638f fVar = new C6638f(new ContextThemeWrapper((Context) mo27850j0(), mo24705l0()), (C6638f.C6639a) null, this.m_startHour, this.m_startMinute, true);
        fVar.setTitle((int) C17541R$string.start_time);
        fVar.setButton(-2, (CharSequence) SelectableItem.m15535j1(17039360), (DialogInterface.OnClickListener) C4290m3.f10912a);
        fVar.setButton(-1, (CharSequence) SelectableItem.m15535j1(17039370), (DialogInterface.OnClickListener) new C4280k3(this, fVar));
        fVar.show();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return String.format("%02d", new Object[]{Integer.valueOf(this.m_startHour)}) + ":" + String.format("%02d", new Object[]{Integer.valueOf(this.m_startMinute)}) + " - " + String.format("%02d", new Object[]{Integer.valueOf(this.m_endHour)}) + ":" + String.format("%02d", new Object[]{Integer.valueOf(this.m_endMinute)});
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        Calendar instance = Calendar.getInstance();
        int i = (instance.get(11) * 60) + instance.get(12);
        int i2 = (this.m_startHour * 60) + this.m_startMinute;
        int i3 = (this.m_endHour * 60) + this.m_endMinute;
        if (i >= i2) {
            return i3 < i2 || i <= i3;
        }
        if (i3 <= i2 && i <= i3) {
            return true;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7594a1.m31607u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24672O0();
    }

    /* renamed from: q3 */
    public void mo28334q3(int i, int i2) {
        this.m_endHour = i;
        this.m_endMinute = i2;
    }

    /* renamed from: r3 */
    public void mo28335r3(int i, int i2) {
        this.m_startHour = i;
        this.m_startMinute = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m17103p3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_startHour);
        parcel.writeInt(this.m_startMinute);
        parcel.writeInt(this.m_endHour);
        parcel.writeInt(this.m_endMinute);
    }

    public TimeOfDayConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public TimeOfDayConstraint() {
        this.m_startHour = 0;
        this.m_startMinute = 0;
        this.m_endHour = 0;
        this.m_endMinute = 0;
    }

    private TimeOfDayConstraint(Parcel parcel) {
        super(parcel);
        this.m_startHour = 0;
        this.m_startMinute = 0;
        this.m_endHour = 0;
        this.m_endMinute = 0;
        this.m_startHour = parcel.readInt();
        this.m_startMinute = parcel.readInt();
        this.m_endHour = parcel.readInt();
        this.m_endMinute = parcel.readInt();
    }
}
