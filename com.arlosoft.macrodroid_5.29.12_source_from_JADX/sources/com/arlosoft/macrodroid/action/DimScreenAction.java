package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.dim.DimOverlayService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2216e;
import p057a2.C2219h;
import p128m0.C7769j0;
import p319lc.C15626c;

public class DimScreenAction extends Action implements C2219h, C2216e {
    public static final Parcelable.Creator<DimScreenAction> CREATOR = new C2401c();
    private boolean m_dimScreenOn;
    private int m_percent;
    private MacroDroidVariable m_variable;
    private DictionaryKeys varDictionaryKeys;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient MacroDroidVariable workingVariable;

    /* renamed from: com.arlosoft.macrodroid.action.DimScreenAction$a */
    class C2399a implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7210a;

        C2399a(ViewGroup viewGroup) {
            this.f7210a = viewGroup;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            this.f7210a.setVisibility(0);
            MacroDroidVariable unused = DimScreenAction.this.workingVariable = null;
            DictionaryKeys unused2 = DimScreenAction.this.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            this.f7210a.setVisibility(8);
            MacroDroidVariable unused = DimScreenAction.this.workingVariable = macroDroidVariable;
            DictionaryKeys unused2 = DimScreenAction.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DimScreenAction$b */
    class C2400b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7212a;

        C2400b(TextView textView) {
            this.f7212a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView textView = this.f7212a;
            textView.setText(i + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DimScreenAction$c */
    class C2401c implements Parcelable.Creator<DimScreenAction> {
        C2401c() {
        }

        /* renamed from: a */
        public DimScreenAction createFromParcel(Parcel parcel) {
            return new DimScreenAction(parcel, (C2399a) null);
        }

        /* renamed from: b */
        public DimScreenAction[] newArray(int i) {
            return new DimScreenAction[i];
        }
    }

    /* synthetic */ DimScreenAction(Parcel parcel, C2399a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ boolean m10395q3(Spinner spinner, View view, MotionEvent motionEvent) {
        if (spinner.getAdapter().getCount() > 1) {
            return false;
        }
        C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_integer_variables_defined, 0).show();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m10396r3(RadioButton radioButton, Spinner spinner, SeekBar seekBar, AppCompatDialog appCompatDialog, View view) {
        this.m_dimScreenOn = radioButton.isChecked();
        spinner.getSelectedItemPosition();
        this.m_variable = this.workingVariable;
        this.varDictionaryKeys = this.workingDictionaryKeys;
        this.m_percent = seekBar.getProgress();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static void m10398t3(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m10398t3(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (!this.m_dimScreenOn) {
            return SelectableItem.m15535j1(C17541R$string.action_dim_screen_off);
        }
        if (this.m_variable != null) {
            return this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys);
        }
        return this.m_percent + TaskerPlugin.VARIABLE_PREFIX;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7769j0.m32434u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        if (!this.m_dimScreenOn) {
            return SelectableItem.m15535j1(C17541R$string.action_dim_screen_off);
        }
        return SelectableItem.m15535j1(C17541R$string.action_dim_screen) + " (" + mo24672O0() + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        mo27827K0().stopService(new Intent(mo27827K0(), DimOverlayService.class));
        if (this.m_dimScreenOn) {
            int i = this.m_percent;
            MacroDroidVariable macroDroidVariable = this.m_variable;
            if (macroDroidVariable != null) {
                MacroDroidVariable q = mo27861q(macroDroidVariable.getName());
                if (q != null) {
                    Long C = q.mo27732C(this.varDictionaryKeys);
                    if (C != null) {
                        i = Math.max(0, Math.min(C.intValue(), 100));
                    } else {
                        C4878b.m18869h("Variable: " + this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys) + " was not found. Defaulting to 50%", mo27840Y0().longValue());
                    }
                } else {
                    C4878b.m18869h("Variable: " + this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys) + " was not found. Defaulting to 50%", mo27840Y0().longValue());
                }
            }
            Intent intent = new Intent(mo27827K0(), DimOverlayService.class);
            intent.putExtra("percentage", i);
            mo27827K0().startService(intent);
        }
    }

    @Nullable
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return true;
    }

    /* renamed from: k */
    public void mo24427k(@Nullable DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.m_variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String str;
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dim_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_dim_screen);
        this.workingVariable = this.m_variable;
        this.workingDictionaryKeys = this.varDictionaryKeys;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.dim_dialog_seek_bar);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.dim_dialog_spinner);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.dim_bar_layout);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.dim_percent_text);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.dim_dialog_on_radio_button);
        ViewGroup viewGroup2 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.dim_dialog_values_layout);
        mo27865s0();
        int i = this.m_percent;
        textView.setText(this.m_percent + TaskerPlugin.VARIABLE_PREFIX);
        radioButton.setChecked(this.m_dimScreenOn);
        ((RadioButton) appCompatDialog.findViewById(C17532R$id.dim_dialog_off_radio_button)).setChecked(this.m_dimScreenOn ^ true);
        m10398t3(viewGroup2, this.m_dimScreenOn);
        radioButton.setOnCheckedChangeListener(new C2935b4(viewGroup2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectableItem.m15535j1(C17541R$string.use_slider_value));
        Activity j0 = mo27850j0();
        Macro X0 = mo27837X0();
        if (this.m_variable != null) {
            str = this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys);
        } else {
            str = null;
        }
        int i2 = i;
        RadioButton radioButton2 = radioButton;
        TextView textView2 = textView;
        Button button3 = button2;
        ViewGroup viewGroup3 = viewGroup;
        C6520o0.m24879I(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, arrayList, str, "", false, new C2399a(viewGroup));
        if (this.workingVariable == null) {
            viewGroup3.setVisibility(0);
        } else {
            viewGroup3.setVisibility(8);
        }
        spinner.setOnTouchListener(new C2807a4(this, spinner));
        seekBar.setProgress(Math.round((float) i2));
        seekBar.setOnSeekBarChangeListener(new C2400b(textView2));
        button.setOnClickListener(new C3641z3(this, radioButton2, spinner, seekBar, appCompatDialog));
        button3.setOnClickListener(new C3614y3(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_dimScreenOn ^ true ? 1 : 0);
        parcel.writeInt(this.m_percent);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    public DimScreenAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_dimScreenOn = true;
    }

    private DimScreenAction() {
        this.m_percent = 50;
    }

    private DimScreenAction(Parcel parcel) {
        super(parcel);
        this.m_dimScreenOn = parcel.readInt() == 0;
        this.m_percent = parcel.readInt();
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
