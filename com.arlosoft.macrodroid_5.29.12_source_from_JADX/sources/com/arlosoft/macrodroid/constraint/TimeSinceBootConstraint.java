package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7597b1;

public class TimeSinceBootConstraint extends Constraint {
    public static final Parcelable.Creator<TimeSinceBootConstraint> CREATOR = new C4203a();
    private boolean m_lessThan;
    private int m_timePeriodSeconds;

    /* renamed from: com.arlosoft.macrodroid.constraint.TimeSinceBootConstraint$a */
    class C4203a implements Parcelable.Creator<TimeSinceBootConstraint> {
        C4203a() {
        }

        /* renamed from: a */
        public TimeSinceBootConstraint createFromParcel(Parcel parcel) {
            return new TimeSinceBootConstraint(parcel, (C4203a) null);
        }

        /* renamed from: b */
        public TimeSinceBootConstraint[] newArray(int i) {
            return new TimeSinceBootConstraint[i];
        }
    }

    /* synthetic */ TimeSinceBootConstraint(Parcel parcel, C4203a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static /* synthetic */ void m17116j3(Button button, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        if (button != null) {
            button.setEnabled((numberPicker.getValue() == 0 && numberPicker2.getValue() == 0 && numberPicker3.getValue() == 0) ? false : true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m17117k3(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, RadioButton radioButton, AppCompatDialog appCompatDialog, View view) {
        this.m_timePeriodSeconds = numberPicker.getValue() + (numberPicker2.getValue() * 60) + (numberPicker3.getValue() * 3600);
        this.m_lessThan = radioButton.isChecked();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i;
        Context context;
        StringBuilder sb = new StringBuilder();
        if (this.m_lessThan) {
            context = mo27827K0();
            i = C17541R$string.less_than;
        } else {
            context = mo27827K0();
            i = C17541R$string.greater_than;
        }
        sb.append(context.getString(i));
        sb.append(" ");
        String sb2 = sb.toString();
        int i2 = this.m_timePeriodSeconds;
        if (i2 >= 3600) {
            return sb2 + (this.m_timePeriodSeconds / 3600) + SelectableItem.m15535j1(C17541R$string.hour_one_char) + " " + ((this.m_timePeriodSeconds / 60) % 60) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        } else if (i2 >= 60) {
            return sb2 + ((this.m_timePeriodSeconds / 60) % 60) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        } else {
            return sb2 + (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        }
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (SystemClock.elapsedRealtime() / 1000 <= ((long) this.m_timePeriodSeconds)) {
            return this.m_lessThan;
        }
        return !this.m_lessThan;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7597b1.m31622u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + ": " + mo24672O0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.time_since_boot_constraint);
        appCompatDialog.setTitle((int) C17541R$string.constraint_time_since_boot);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.time_since_boot_constraint_second_picker);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.time_since_boot_constraint_minute_picker);
        NumberPicker numberPicker3 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.time_since_boot_constraint_hour_picker);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.time_since_boot_constraint_less_than);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.time_since_boot_constraint_greater_than);
        numberPicker.setMaximum(59);
        numberPicker2.setMaximum(59);
        boolean z = false;
        numberPicker.setMinimum(0);
        numberPicker2.setMinimum(0);
        numberPicker3.setMinimum(0);
        if (!this.m_lessThan) {
            radioButton2.setChecked(true);
        }
        numberPicker.setValue(this.m_timePeriodSeconds % 60);
        int i = this.m_timePeriodSeconds;
        if (i > 59) {
            numberPicker2.setValue((i / 60) % 60);
        }
        int i2 = this.m_timePeriodSeconds;
        if (i2 > 3599) {
            numberPicker3.setValue(i2 / 3600);
        }
        C4305p3 p3Var = new C4305p3(button, numberPicker2, numberPicker3, numberPicker);
        numberPicker.setListener(p3Var);
        numberPicker2.setListener(p3Var);
        numberPicker3.setListener(p3Var);
        if (this.m_timePeriodSeconds != 0) {
            z = true;
        }
        button.setEnabled(z);
        button.setOnClickListener(new C4300o3(this, numberPicker, numberPicker2, numberPicker3, radioButton, appCompatDialog));
        button2.setOnClickListener(new C4295n3(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_timePeriodSeconds);
        parcel.writeInt(this.m_lessThan ^ true ? 1 : 0);
    }

    public TimeSinceBootConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private TimeSinceBootConstraint() {
        this.m_timePeriodSeconds = 0;
        this.m_lessThan = true;
    }

    private TimeSinceBootConstraint(Parcel parcel) {
        super(parcel);
        this.m_timePeriodSeconds = parcel.readInt();
        this.m_lessThan = parcel.readInt() == 0;
    }
}
