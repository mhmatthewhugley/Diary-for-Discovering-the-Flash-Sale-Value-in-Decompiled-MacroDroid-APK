package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2218g;
import p123l1.C7654x0;
import p183w2.C10330a;
import p319lc.C15626c;

public class StopWatchConstraint extends Constraint implements C2218g {
    public static final Parcelable.Creator<StopWatchConstraint> CREATOR = new C4190b();
    private boolean m_greaterThan;
    private String m_stopwatchName;
    private int m_timePeriodSeconds;
    private String m_variableName;

    /* renamed from: com.arlosoft.macrodroid.constraint.StopWatchConstraint$a */
    class C4189a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f10754a;

        /* renamed from: c */
        final /* synthetic */ Spinner f10755c;

        /* renamed from: d */
        final /* synthetic */ Button f10756d;

        /* renamed from: f */
        final /* synthetic */ NumberPicker f10757f;

        /* renamed from: g */
        final /* synthetic */ NumberPicker f10758g;

        /* renamed from: o */
        final /* synthetic */ NumberPicker f10759o;

        C4189a(ViewGroup viewGroup, Spinner spinner, Button button, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
            this.f10754a = viewGroup;
            this.f10755c = spinner;
            this.f10756d = button;
            this.f10757f = numberPicker;
            this.f10758g = numberPicker2;
            this.f10759o = numberPicker3;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            boolean z = false;
            this.f10754a.setVisibility(this.f10755c.getSelectedItemPosition() == 0 ? 0 : 8);
            Button button = this.f10756d;
            if (!(i <= 0 && this.f10757f.getValue() == 0 && this.f10758g.getValue() == 0 && this.f10759o.getValue() == 0)) {
                z = true;
            }
            button.setEnabled(z);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.StopWatchConstraint$b */
    class C4190b implements Parcelable.Creator<StopWatchConstraint> {
        C4190b() {
        }

        /* renamed from: a */
        public StopWatchConstraint createFromParcel(Parcel parcel) {
            return new StopWatchConstraint(parcel, (C4189a) null);
        }

        /* renamed from: b */
        public StopWatchConstraint[] newArray(int i) {
            return new StopWatchConstraint[i];
        }
    }

    /* synthetic */ StopWatchConstraint(Parcel parcel, C4189a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static /* synthetic */ void m17023j3(Button button, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        if (button != null) {
            button.setEnabled((numberPicker.getValue() == 0 && numberPicker2.getValue() == 0 && numberPicker3.getValue() == 0) ? false : true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m17024k3(Spinner spinner, List list, RadioButton radioButton, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, AppCompatDialog appCompatDialog, View view) {
        if (spinner.getSelectedItemPosition() == 0) {
            this.m_variableName = null;
        } else {
            this.m_variableName = ((MacroDroidVariable) list.get(spinner.getSelectedItemPosition() - 1)).getName();
        }
        this.m_greaterThan = radioButton.isChecked();
        this.m_timePeriodSeconds = numberPicker.getValue() + (numberPicker2.getValue() * 60) + (numberPicker3.getValue() * 3600);
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        String[] g1 = mo24676g1();
        for (int i = 0; i < g1.length; i++) {
            String str = this.m_stopwatchName;
            if (str != null && str.equals(g1[i])) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: G */
    public String mo24430G() {
        return this.m_stopwatchName;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return C10330a.m40553e(mo27827K0()).contains(this.m_stopwatchName);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.m_variableName;
        if (str == null) {
            int i = this.m_timePeriodSeconds;
            if (i >= 3600) {
                str = (this.m_timePeriodSeconds / 3600) + SelectableItem.m15535j1(C17541R$string.hour_one_char) + " " + ((this.m_timePeriodSeconds / 60) % 60) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
            } else if (i >= 60) {
                str = ((this.m_timePeriodSeconds / 60) % 60) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
            } else {
                str = (this.m_timePeriodSeconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.m_stopwatchName);
        sb.append(this.m_greaterThan ? " > " : " < ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        long j;
        long A;
        long d = C10330a.m40552d(mo27827K0(), this.m_stopwatchName);
        String str = this.m_variableName;
        if (str == null) {
            j = (long) (this.m_timePeriodSeconds * 1000);
        } else {
            MacroDroidVariable q = mo27861q(str);
            if (q == null || !(q.mo27743S() == 3 || q.mo27743S() == 1)) {
                C4878b.m18869h("Stop watch constraint failed, numerical variable not found: " + this.m_variableName, mo27840Y0().longValue());
                return true;
            }
            if (q.mo27750Z()) {
                A = (long) q.mo27766l();
            } else if (q.mo27753b0()) {
                A = q.mo27731A();
            } else {
                j = 0;
            }
            j = A * 1000;
        }
        if ((d > j) == this.m_greaterThan) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7654x0.m31899u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24672O0();
    }

    /* renamed from: V */
    public void mo25810V() {
        List<String> e = C10330a.m40553e(mo27827K0());
        if (!e.contains(this.m_stopwatchName)) {
            e.add(this.m_stopwatchName);
            C10330a.m40557i(mo27827K0(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        List<String> e = C10330a.m40553e(mo27827K0());
        if (e.size() == 0) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_stopwatches_defined, 0).show();
            return new String[0];
        }
        if (this.m_stopwatchName == null && e.size() > 0) {
            this.m_stopwatchName = e.get(0);
        }
        return (String[]) e.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m3 */
    public void mo28307m3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_stopwatch_constraint);
        appCompatDialog.setTitle((CharSequence) this.m_stopwatchName);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.second_picker);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.minute_picker);
        NumberPicker numberPicker3 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.hour_picker);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.greater_than);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(2131363838);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.time_layout);
        numberPicker.setMinimum(0);
        numberPicker.setMaximum(59);
        numberPicker2.setMinimum(0);
        numberPicker2.setMaximum(59);
        numberPicker3.setMinimum(0);
        radioButton.setChecked(this.m_greaterThan);
        ((RadioButton) appCompatDialog.findViewById(C17532R$id.less_than)).setChecked(!this.m_greaterThan);
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectableItem.m15535j1(C17541R$string.fixed_duration));
        ArrayList<MacroDroidVariable> s0 = mo27865s0();
        s0.addAll(mo27857o0());
        int i = 0;
        int i2 = 1;
        for (MacroDroidVariable next : s0) {
            String str = this.m_variableName;
            if (str != null && str.equals(next.getName())) {
                i = i2;
            }
            arrayList.add(SelectableItem.m15535j1(C17541R$string.variable_short_name) + ": " + next.getName() + " (" + SelectableItem.m15535j1(C17541R$string.seconds_one_char) + ")");
            i2++;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(mo27850j0(), C17535R$layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(i, false);
        ArrayList<MacroDroidVariable> arrayList2 = s0;
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        Button button3 = button2;
        C4189a aVar = r0;
        RadioButton radioButton2 = radioButton;
        ViewGroup viewGroup2 = viewGroup;
        Spinner spinner2 = spinner;
        C4189a aVar2 = new C4189a(viewGroup, spinner, button, numberPicker2, numberPicker3, numberPicker);
        spinner2.setOnItemSelectedListener(aVar);
        if (spinner2.getSelectedItemPosition() == 0) {
            viewGroup2.setVisibility(0);
        } else {
            viewGroup2.setVisibility(8);
        }
        numberPicker.setValue(this.m_timePeriodSeconds % 60);
        int i3 = this.m_timePeriodSeconds;
        if (i3 > 59) {
            numberPicker2.setValue((i3 / 60) % 60);
        }
        int i4 = this.m_timePeriodSeconds;
        if (i4 > 3599) {
            numberPicker3.setValue(i4 / 3600);
        }
        C4242d3 d3Var = new C4242d3(button, numberPicker2, numberPicker3, numberPicker);
        numberPicker.setListener(d3Var);
        numberPicker2.setListener(d3Var);
        numberPicker3.setListener(d3Var);
        button.setEnabled(this.m_timePeriodSeconds != 0);
        button.setOnClickListener(new C4236c3(this, spinner2, arrayList2, radioButton2, numberPicker, numberPicker2, numberPicker3, appCompatDialog2));
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button3.setOnClickListener(new C4230b3(appCompatDialog3));
        appCompatDialog3.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String[] g1 = mo24676g1();
        if (g1 != null && g1.length > 0) {
            mo27848g0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        mo28307m3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_stopwatchName);
        parcel.writeInt(this.m_timePeriodSeconds);
        parcel.writeInt(this.m_greaterThan ? 1 : 0);
        parcel.writeString(this.m_variableName);
    }

    /* renamed from: x */
    public void mo24431x(String str) {
        this.m_stopwatchName = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_stopwatchName = mo24676g1()[i];
    }

    public StopWatchConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private StopWatchConstraint() {
        this.m_greaterThan = true;
    }

    private StopWatchConstraint(Parcel parcel) {
        super(parcel);
        this.m_stopwatchName = parcel.readString();
        this.m_timePeriodSeconds = parcel.readInt();
        this.m_greaterThan = parcel.readInt() != 0;
        this.m_variableName = parcel.readString();
    }
}
