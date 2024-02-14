package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p123l1.C7612g0;
import p297ja.C13339u;
import p370qa.C16265l;
import p414v9.C16735i;

public class LogicConstraint extends Constraint {
    public static final Parcelable.Creator<LogicConstraint> CREATOR = new C4161a();
    private static final int OPTION_LOGIC_AND = 0;
    private static final int OPTION_LOGIC_NOT = 3;
    private static final int OPTION_LOGIC_OR = 1;
    private static final int OPTION_LOGIC_XOR = 2;
    private List<Constraint> m_childConstraints;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.constraint.LogicConstraint$a */
    class C4161a implements Parcelable.Creator<LogicConstraint> {
        C4161a() {
        }

        /* renamed from: a */
        public LogicConstraint createFromParcel(Parcel parcel) {
            return new LogicConstraint(parcel, (C4161a) null);
        }

        /* renamed from: b */
        public LogicConstraint[] newArray(int i) {
            return new LogicConstraint[i];
        }
    }

    /* synthetic */ LogicConstraint(Parcel parcel, C4161a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m16683D1() {
        this.m_childConstraints = new ArrayList();
    }

    /* renamed from: i3 */
    private void m16686i3(Constraint constraint) {
        if (constraint.mo27826J0() != null) {
            for (Constraint i3 : constraint.mo27826J0()) {
                m16686i3(i3);
            }
        }
        constraint.mo28052T2();
    }

    /* renamed from: j3 */
    private String[] m16687j3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_logic_and), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_logic_or), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_logic_xor), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_logic_not)};
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m16688k3(AppCompatDialog appCompatDialog, CheckBox checkBox, View view) {
        appCompatDialog.dismiss();
        if (checkBox.isChecked()) {
            C5163j2.m20316z5(mo27827K0(), false);
        }
        super.mo24714u1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m16689l3(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.dismiss();
        mo27864r1();
    }

    /* renamed from: n3 */
    private void m16690n3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_logic_constraint_explanation);
        appCompatDialog.setTitle((int) C17541R$string.constraint_logic);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!mo27850j0().getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Macro macro = new Macro();
        LogicConstraint logicConstraint = new LogicConstraint(mo27850j0(), macro);
        logicConstraint.mo28222m3(1);
        TimeOfDayConstraint timeOfDayConstraint = new TimeOfDayConstraint(mo27850j0(), macro);
        timeOfDayConstraint.mo28335r3(18, 0);
        timeOfDayConstraint.mo28334q3(0, 0);
        logicConstraint.mo27834R(timeOfDayConstraint);
        DayOfWeekConstraint dayOfWeekConstraint = new DayOfWeekConstraint(mo27850j0(), macro);
        dayOfWeekConstraint.mo28132m3(new boolean[]{false, true, true, true, true, true, false});
        logicConstraint.mo27834R(dayOfWeekConstraint);
        new SelectableItemsViewHolder(mo27850j0(), macro, LayoutInflater.from(mo27850j0()).inflate(C17535R$layout.macro_edit_entry, (FrameLayout) appCompatDialog.findViewById(C17532R$id.exampleContainer), true), (C16265l<? super SelectableItem, C13339u>) null, (C16265l<? super SelectableItem, C13339u>) null, (C16265l<? super SelectableItem, C13339u>) null, C16735i.m99342F(Boolean.FALSE), (C16265l<? super SelectableItem, C13339u>) null).mo29016B(logicConstraint, new ArrayList(), 0, false, false, false, false, false, false, false, true, false);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C4308q1(this, appCompatDialog, (CheckBox) appCompatDialog.findViewById(C17532R$id.dontShowAgainCheckbox)));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C4303p1(this, appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        StringBuilder sb = new StringBuilder();
        sb.append(m16687j3()[this.m_option]);
        sb.append(" (");
        for (int i = 0; i < this.m_childConstraints.size(); i++) {
            sb.append(this.m_childConstraints.get(i).mo24738G0());
            if (i < this.m_childConstraints.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: G2 */
    public void mo24687G2(Macro macro) {
        super.mo24687G2(macro);
        List<Constraint> list = this.m_childConstraints;
        if (list != null) {
            for (Constraint G2 : list) {
                G2.mo24687G2(this.m_macro);
            }
        }
    }

    /* renamed from: J0 */
    public List<Constraint> mo27826J0() {
        return this.m_childConstraints;
    }

    /* renamed from: M0 */
    public String mo27831M0() {
        return m16687j3()[this.m_option];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (this.m_childConstraints.size() == 0) {
            return true;
        }
        int i = this.m_option;
        if (i == 0) {
            for (Constraint next : this.m_childConstraints) {
                if (next.mo27822G1() && !next.mo28111R2(triggerContextInfo)) {
                    return false;
                }
            }
            return true;
        } else if (i == 1) {
            int i2 = 0;
            for (Constraint next2 : this.m_childConstraints) {
                if (next2.mo27822G1()) {
                    i2++;
                    if (next2.mo28111R2(triggerContextInfo)) {
                        return true;
                    }
                }
            }
            if (i2 <= 0) {
                return true;
            }
            return false;
        } else if (i == 2) {
            int i3 = 0;
            for (Constraint next3 : this.m_childConstraints) {
                if (next3.mo27822G1() && next3.mo28111R2(triggerContextInfo)) {
                    i3++;
                }
            }
            if (i3 == 1) {
                return true;
            }
            return false;
        } else {
            if (i == 3) {
                for (Constraint next4 : this.m_childConstraints) {
                    if (next4.mo27822G1() && next4.mo28111R2(triggerContextInfo)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: R */
    public void mo27834R(Constraint constraint) {
        this.m_childConstraints.add(constraint);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7612g0.m31699u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo28052T2() {
        for (Constraint T2 : this.m_childConstraints) {
            T2.mo28052T2();
        }
    }

    @CallSuper
    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        for (Constraint U : this.m_childConstraints) {
            U.mo25131U();
        }
    }

    /* renamed from: V */
    public void mo25810V() {
        for (Constraint V : this.m_childConstraints) {
            V.mo25810V();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
        for (Constraint next : this.m_childConstraints) {
            if (next.mo27822G1()) {
                next.mo28053V2();
            }
        }
    }

    /* renamed from: d2 */
    public void mo27843d2(Constraint constraint) {
        m16686i3(constraint);
        this.m_childConstraints.remove(constraint);
    }

    /* renamed from: e1 */
    public String[] mo24700e1() {
        ArrayList arrayList = new ArrayList();
        for (Constraint e1 : this.m_childConstraints) {
            String[] e12 = e1.mo24700e1();
            if (e12.length > 0) {
                Collections.addAll(arrayList, e12);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16687j3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.constraint_logic);
    }

    /* renamed from: i0 */
    public void mo27849i0(Constraint constraint) {
        this.m_childConstraints.remove(constraint);
    }

    /* renamed from: m3 */
    public void mo28222m3(int i) {
        this.m_option = i;
    }

    /* renamed from: u1 */
    public void mo24714u1() {
        if (C5163j2.m20021N1(mo27827K0())) {
            m16690n3();
        } else {
            super.mo24714u1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeList(this.m_childConstraints);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public LogicConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private LogicConstraint() {
        m16683D1();
    }

    private LogicConstraint(Parcel parcel) {
        super(parcel);
        m16683D1();
        this.m_option = parcel.readInt();
        this.m_childConstraints = parcel.readArrayList(Constraint.class.getClassLoader());
    }
}
