package com.arlosoft.macrodroid.action.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.action.PauseAction;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.ArrayList;
import java.util.List;
import p149q1.C8157f;
import p149q1.C8162k;
import p257f0.C12206l;
import p257f0.C12207m;
import p319lc.C15626c;

public class PauseActionActivity extends MacroDroidDialogBaseActivity implements NumberPicker.C3991b {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public RadioGroup f7826A;

    /* renamed from: B */
    private RadioButton f7827B;

    /* renamed from: C */
    private RadioButton f7828C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public MacroDroidVariable f7829D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public DictionaryKeys f7830E;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Button f7831f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public NumberPicker f7832g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public NumberPicker f7833o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public NumberPicker f7834p;

    /* renamed from: s */
    private Spinner f7835s;

    /* renamed from: z */
    private CheckBox f7836z;

    /* renamed from: com.arlosoft.macrodroid.action.activities.PauseActionActivity$a */
    class C2826a implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7837a;

        C2826a(ViewGroup viewGroup) {
            this.f7837a = viewGroup;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            boolean z = false;
            this.f7837a.setVisibility(0);
            PauseActionActivity.this.f7826A.setVisibility(8);
            MacroDroidVariable unused = PauseActionActivity.this.f7829D = null;
            DictionaryKeys unused2 = PauseActionActivity.this.f7830E = null;
            Button S1 = PauseActionActivity.this.f7831f;
            if (!(PauseActionActivity.this.f7832g.getValue() == 0 && PauseActionActivity.this.f7833o.getValue() == 0 && PauseActionActivity.this.f7834p.getValue() == 0)) {
                z = true;
            }
            S1.setEnabled(z);
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            this.f7837a.setVisibility(8);
            PauseActionActivity.this.f7826A.setVisibility(0);
            MacroDroidVariable unused = PauseActionActivity.this.f7829D = macroDroidVariable;
            DictionaryKeys unused2 = PauseActionActivity.this.f7830E = list != null ? new DictionaryKeys(list) : null;
            PauseActionActivity.this.f7831f.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m13966T1(View view) {
        int value = this.f7833o.getValue() + (this.f7832g.getValue() * 60);
        Intent intent = new Intent();
        intent.putExtra("UnitForVars", this.f7827B.isChecked() ^ true ? 1 : 0);
        intent.putExtra("Seconds", value);
        intent.putExtra("MilliSeconds", this.f7834p.getValue());
        intent.putExtra("Alarm", this.f7836z.isChecked());
        intent.putExtra(C8162k.ITEM_TYPE, this.f7829D);
        intent.putExtra("DictionaryKeys", this.f7830E);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m13967U1(View view) {
        finish();
    }

    /* renamed from: N0 */
    public void mo26174N0() {
        boolean z = false;
        if (this.f7834p.getValue() < 0) {
            this.f7834p.setValue(0);
        }
        Button button = this.f7831f;
        if (!(this.f7832g.getValue() == 0 && this.f7833o.getValue() == 0 && this.f7834p.getValue() == 0)) {
            z = true;
        }
        button.setEnabled(z);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.pause_action_view);
        setTitle(C17541R$string.action_pause_delay_period);
        int i = 0;
        int intExtra = getIntent().getIntExtra("UnitForVars", 0);
        int intExtra2 = getIntent().getIntExtra("Seconds", 0);
        int intExtra3 = getIntent().getIntExtra("MilliSeconds", 0);
        int i2 = intExtra2 / 60;
        int i3 = intExtra2 % 60;
        boolean booleanExtra = getIntent().getBooleanExtra("Alarm", false);
        PauseAction pauseAction = (PauseAction) getIntent().getParcelableExtra("selectable_item");
        Macro Q = C4934n.m18998M().mo29682Q(getIntent().getLongExtra("MacroGuid", 0));
        if (Q == null && (Q = (Macro) getIntent().getParcelableExtra(C8157f.ITEM_TYPE)) == null) {
            C4878b.m18868g("Could not launch wait before next config screen macro is null");
            C15626c.makeText(this, C17541R$string.error, 0).show();
            finish();
            return;
        }
        pauseAction.mo24687G2(Q);
        this.f7832g = (NumberPicker) findViewById(C17532R$id.pause_action_minute_picker);
        this.f7833o = (NumberPicker) findViewById(C17532R$id.pause_action_second_picker);
        this.f7834p = (NumberPicker) findViewById(C17532R$id.pause_action_ms_picker);
        this.f7835s = (Spinner) findViewById(C17532R$id.pause_action_spinner);
        this.f7836z = (CheckBox) findViewById(C17532R$id.force_alarm_checkbox);
        this.f7826A = (RadioGroup) findViewById(C17532R$id.variableUnitsContainer);
        this.f7827B = (RadioButton) findViewById(C17532R$id.secondsRadioButton);
        this.f7828C = (RadioButton) findViewById(C17532R$id.minutesRadioButton);
        ViewGroup viewGroup = (ViewGroup) findViewById(C17532R$id.pause_action_value_layout);
        this.f7829D = (MacroDroidVariable) getIntent().getParcelableExtra(C8162k.ITEM_TYPE);
        this.f7830E = (DictionaryKeys) getIntent().getParcelableExtra("DictionaryKeys");
        this.f7832g.setValue(i2);
        this.f7832g.setMaximum(9999);
        this.f7832g.setMinimum(0);
        this.f7832g.setListener(this);
        this.f7833o.setValue(i3);
        this.f7833o.setListener(this);
        this.f7833o.setMaximum(999);
        this.f7833o.setMinimum(0);
        this.f7834p.setValue(intExtra3);
        this.f7834p.setMaximum(999);
        this.f7834p.setMinimum(0);
        this.f7834p.setIncrementStep(10);
        this.f7834p.setListener(this);
        boolean z = true;
        this.f7827B.setChecked(intExtra != 1);
        this.f7828C.setChecked(intExtra == 1);
        this.f7836z.setChecked(booleanExtra);
        Button button = (Button) findViewById(C17532R$id.okButton);
        this.f7831f = button;
        if (this.f7832g.getValue() == 0 && this.f7833o.getValue() == 0 && this.f7834p.getValue() == 0) {
            z = false;
        }
        button.setEnabled(z);
        this.f7831f.setOnClickListener(new C12206l(this));
        this.f7826A.setVisibility(this.f7829D != null ? 0 : 8);
        if (this.f7829D != null) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(C17541R$string.define_value));
        Spinner spinner = this.f7835s;
        if (this.f7829D != null) {
            str = this.f7829D.getName() + C6520o0.m24912e0(this.f7830E);
        } else {
            str = null;
        }
        C6520o0.m24879I(this, C17542R$style.Theme_App_Dialog_Action, pauseAction, spinner, Q, arrayList, str, "", false, new C2826a(viewGroup));
        ((Button) findViewById(C17532R$id.cancelButton)).setOnClickListener(new C12207m(this));
    }
}
