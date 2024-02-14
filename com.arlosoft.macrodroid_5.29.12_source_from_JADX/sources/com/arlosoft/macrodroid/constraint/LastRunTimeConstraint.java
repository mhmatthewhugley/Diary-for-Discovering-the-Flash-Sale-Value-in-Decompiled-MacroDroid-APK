package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p099h1.C7363c;
import p123l1.C7603d0;

public class LastRunTimeConstraint extends Constraint implements C7363c {
    public static final Parcelable.Creator<LastRunTimeConstraint> CREATOR = new C4155a();
    private boolean checkThisMacro;
    private boolean m_invoked;
    private List<Long> m_macroIds;
    private transient List<Macro> m_macroList;
    private List<String> m_macroNames;
    private transient int m_parentType;
    private transient int m_selectedCount;
    private int m_timePeriodSeconds;

    /* renamed from: com.arlosoft.macrodroid.constraint.LastRunTimeConstraint$a */
    class C4155a implements Parcelable.Creator<LastRunTimeConstraint> {
        C4155a() {
        }

        /* renamed from: a */
        public LastRunTimeConstraint createFromParcel(Parcel parcel) {
            return new LastRunTimeConstraint(parcel, (C4155a) null);
        }

        /* renamed from: b */
        public LastRunTimeConstraint[] newArray(int i) {
            return new LastRunTimeConstraint[i];
        }
    }

    /* synthetic */ LastRunTimeConstraint(Parcel parcel, C4155a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private void m16623l3() {
        boolean z = true;
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        this.m_macroList = B;
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            if (mo27837X0().getGUID() == it.next().getGUID()) {
                it.remove();
            }
        }
        int size = this.m_macroList.size() + 1;
        String[] strArr = new String[size];
        strArr[0] = mo27827K0().getString(C17541R$string.constraint_last_run_time_this_macro);
        this.m_selectedCount = 0;
        boolean[] zArr = new boolean[size];
        if (this.checkThisMacro) {
            zArr[0] = true;
            this.m_selectedCount = 0 + 1;
        }
        for (int i = 1; i < size; i++) {
            int i2 = i - 1;
            strArr[i] = this.m_macroList.get(i2).getName();
            if (this.m_macroList.get(i2).getIsFavourite()) {
                strArr[i] = "⭐ " + strArr[i];
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.m_macroIds.size()) {
                    break;
                } else if (this.m_macroIds.get(i3).equals(Long.valueOf(this.m_macroList.get(i2).getGUID()))) {
                    zArr[i] = true;
                    this.m_selectedCount++;
                    break;
                } else {
                    i3++;
                }
            }
        }
        String string = mo27827K0().getString(C17541R$string.constraint_last_run_time_select_macros);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) string);
        builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) new C4246e1(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4240d1(this));
        AlertDialog create = builder.create();
        create.show();
        Button button = create.getButton(-1);
        if (this.m_selectedCount <= 0) {
            z = false;
        }
        button.setEnabled(z);
    }

    /* renamed from: m3 */
    private void m16624m3() {
        if (mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.last_invoked_constraint);
            appCompatDialog.setTitle(this.m_invoked ? C17541R$string.constraint_last_run_time_invoked_within : C17541R$string.constraint_last_run_time_not_invoked_for);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.last_invoked_constraint_second_picker);
            NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.last_invoked_constraint_minute_picker);
            NumberPicker numberPicker3 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.last_invoked_constraint_hour_picker);
            numberPicker.setMaximum(59);
            boolean z = false;
            numberPicker.setMinimum(0);
            numberPicker2.setMaximum(59);
            numberPicker2.setMinimum(0);
            numberPicker3.setMinimum(0);
            numberPicker.setValue(this.m_timePeriodSeconds % 60);
            int i = this.m_timePeriodSeconds;
            if (i > 59) {
                numberPicker2.setValue((i / 60) % 60);
            }
            int i2 = this.m_timePeriodSeconds;
            if (i2 > 3599) {
                numberPicker3.setValue(i2 / 3600);
            }
            C4263h1 h1Var = new C4263h1(button, numberPicker2, numberPicker3, numberPicker);
            numberPicker.setListener(h1Var);
            numberPicker2.setListener(h1Var);
            numberPicker3.setListener(h1Var);
            if (this.m_timePeriodSeconds != 0) {
                z = true;
            }
            button.setEnabled(z);
            button.setOnClickListener(new C4258g1(this, numberPicker, numberPicker2, numberPicker3, appCompatDialog));
            button2.setOnClickListener(new C4252f1(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: n3 */
    private String[] m16625n3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_last_run_time_option_invoked), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_last_run_time_option_not_invoked)};
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m16626o3(DialogInterface dialogInterface, int i, boolean z) {
        boolean z2 = true;
        if (z) {
            this.m_selectedCount++;
        } else {
            this.m_selectedCount--;
        }
        Button button = ((AlertDialog) dialogInterface).getButton(-1);
        if (this.m_selectedCount <= 0) {
            z2 = false;
        }
        button.setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m16627p3(DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getListView().getCheckedItemPositions();
        SparseBooleanArray checkedItemPositions = alertDialog.getListView().getCheckedItemPositions();
        this.m_macroNames.clear();
        this.m_macroIds.clear();
        this.checkThisMacro = false;
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                if (checkedItemPositions.keyAt(i2) == 0) {
                    this.checkThisMacro = true;
                } else {
                    this.m_macroNames.add(this.m_macroList.get(checkedItemPositions.keyAt(i2) - 1).getName());
                    this.m_macroIds.add(Long.valueOf(this.m_macroList.get(checkedItemPositions.keyAt(i2) - 1).getGUID()));
                }
            }
        }
        m16624m3();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static /* synthetic */ void m16628q3(Button button, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        if (button != null) {
            button.setEnabled((numberPicker.getValue() == 0 && numberPicker2.getValue() == 0 && numberPicker3.getValue() == 0) ? false : true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m16629r3(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, AppCompatDialog appCompatDialog, View view) {
        this.m_timePeriodSeconds = numberPicker.getValue() + (numberPicker2.getValue() * 60) + (numberPicker3.getValue() * 3600);
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* renamed from: D */
    public List<String> mo28198D() {
        return this.m_macroNames;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_invoked ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return mo27827K0().getString(this.m_invoked ? C17541R$string.constraint_last_run_time_macros_invoked : C17541R$string.constraint_last_run_time_macros_not_invoked);
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        boolean z;
        if (this.checkThisMacro) {
            return true;
        }
        List<Macro> z2 = C4934n.m18998M().mo29710z();
        for (Long longValue : this.m_macroIds) {
            long longValue2 = longValue.longValue();
            Iterator<Macro> it = z2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getGUID() == longValue2) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    z = false;
                    continue;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        String j1 = SelectableItem.m15535j1(this.m_invoked ? C17541R$string.constraint_last_run_time_invoked_within : C17541R$string.constraint_last_run_time_not_invoked_for);
        if (this.checkThisMacro) {
            if (this.m_macroIds.size() == 0) {
                str = SelectableItem.m15535j1(C17541R$string.constraint_last_run_time_this_macro) + ": ";
            } else if (this.m_macroIds.size() == 1) {
                str = SelectableItem.m15535j1(C17541R$string.constraint_last_run_time_this_macro) + " + \"" + this.m_macroNames.get(0) + "\": ";
            } else {
                str = SelectableItem.m15535j1(C17541R$string.constraint_last_run_time_this_macro) + " + " + this.m_macroNames.size() + " " + mo27827K0().getString(C17541R$string.macros) + ": ";
            }
        } else if (this.m_macroIds.size() == 1) {
            str = "\"" + this.m_macroNames.get(0) + "\": ";
        } else if (this.m_macroIds.size() > 1) {
            str = this.m_macroNames.size() + " " + mo27827K0().getString(C17541R$string.macros) + ": ";
        } else {
            str = "";
        }
        int i = this.m_timePeriodSeconds;
        if (i >= 3600) {
            return str + j1 + " " + (this.m_timePeriodSeconds / 3600) + SelectableItem.m15535j1(C17541R$string.hour_one_char) + " " + ((this.m_timePeriodSeconds / 60) % 60) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        } else if (i >= 60) {
            return str + j1 + " " + ((this.m_timePeriodSeconds / 60) % 60) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        } else {
            return str + j1 + " " + (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        }
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        long j;
        long time = new Date().getTime();
        long j2 = 1000;
        if (this.m_macroIds.size() == 0) {
            long o = mo27837X0() != null ? this.m_parentType == 1 ? C4373a.m17336h().mo28646o(mo27837X0().getGUID()) : C4373a.m17336h().mo28641j(mo27837X0().getGUID()) : 0;
            if (o <= 0) {
                return !this.m_invoked;
            }
            long j3 = (time - o) / 1000;
            boolean z = this.m_invoked;
            if (z || j3 >= ((long) this.m_timePeriodSeconds)) {
                return !z || j3 < ((long) this.m_timePeriodSeconds);
            }
            return false;
        }
        for (Macro next : C4934n.m18998M().mo29710z()) {
            if (this.checkThisMacro && !this.m_macroIds.contains(Long.valueOf(mo27837X0().getGUID()))) {
                this.m_macroIds.add(Long.valueOf(mo27837X0().getGUID()));
            }
            Iterator<Long> it = this.m_macroIds.iterator();
            while (true) {
                if (it.hasNext()) {
                    long longValue = it.next().longValue();
                    if (longValue == next.getGUID()) {
                        if (mo27837X0() == null || longValue != mo27837X0().getGUID()) {
                            j = C4373a.m17336h().mo28641j(longValue);
                        } else {
                            j = this.m_parentType == 1 ? C4373a.m17336h().mo28646o(longValue) : C4373a.m17336h().mo28641j(longValue);
                        }
                        if (j <= 0) {
                            return !this.m_invoked;
                        }
                        long j4 = (time - j) / j2;
                        boolean z2 = this.m_invoked;
                        if (!z2 && j4 < ((long) this.m_timePeriodSeconds)) {
                            return false;
                        }
                        if (z2 && j4 >= ((long) this.m_timePeriodSeconds)) {
                            return false;
                        }
                    }
                    j2 = 1000;
                }
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7603d0.m31650u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
        this.m_parentType = mo28118c3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16625n3();
    }

    /* renamed from: l */
    public void mo28199l(List<String> list) {
        this.m_macroNames = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m16623l3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_invoked ? 1 : 0);
        parcel.writeInt(this.m_timePeriodSeconds);
        parcel.writeList(this.m_macroIds);
        parcel.writeStringList(this.m_macroNames);
        parcel.writeInt(this.checkThisMacro ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_invoked = i == 0;
    }

    public LastRunTimeConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private LastRunTimeConstraint() {
        this.m_timePeriodSeconds = 0;
        this.m_invoked = true;
        this.m_macroIds = new ArrayList();
        this.m_macroNames = new ArrayList();
    }

    private LastRunTimeConstraint(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_invoked = parcel.readInt() != 0;
        this.m_timePeriodSeconds = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.m_macroIds = arrayList;
        parcel.readList(arrayList, (ClassLoader) null);
        ArrayList arrayList2 = new ArrayList();
        this.m_macroNames = arrayList2;
        parcel.readStringList(arrayList2);
        this.checkThisMacro = parcel.readInt() == 0 ? false : z;
    }
}
