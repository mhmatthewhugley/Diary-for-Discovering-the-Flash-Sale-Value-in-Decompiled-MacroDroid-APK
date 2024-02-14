package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SwitchCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.activities.UpdateBrightnessActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6371c1;
import com.arlosoft.macrodroid.utils.C6405m1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2219h;
import p128m0.C7764i3;
import p319lc.C15626c;

public class SetBrightnessAction extends Action implements C2219h {
    private static final int AUTO_BRIGHTNESS = 999;
    public static final Parcelable.Creator<SetBrightnessAction> CREATOR = new C2631c();
    private static final String SCREEN_BRIGHTNESS_MODE = "screen_brightness_mode";
    private static final int SCREEN_BRIGHTNESS_MODE_AUTOMATIC = 1;
    private static final int SCREEN_BRIGHTNESS_MODE_MANUAL = 0;
    private int forceValue;
    private boolean forceValueEnabled;
    private int m_brightness;
    private int m_brightnessPercent;
    private transient int m_brightnessToRestore;
    private boolean m_forcePieMode;
    private transient int m_minimumBrightness;
    private MacroDroidVariable m_variable;
    private DictionaryKeys varDictionaryKeys;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient MacroDroidVariable workingVariable;

    /* renamed from: com.arlosoft.macrodroid.action.SetBrightnessAction$a */
    class C2629a implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7504a;

        C2629a(ViewGroup viewGroup) {
            this.f7504a = viewGroup;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            this.f7504a.setVisibility(0);
            MacroDroidVariable unused = SetBrightnessAction.this.workingVariable = null;
            DictionaryKeys unused2 = SetBrightnessAction.this.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            this.f7504a.setVisibility(8);
            MacroDroidVariable unused = SetBrightnessAction.this.workingVariable = macroDroidVariable;
            DictionaryKeys unused2 = SetBrightnessAction.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetBrightnessAction$b */
    class C2630b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ Activity f7506a;

        /* renamed from: b */
        final /* synthetic */ TextView f7507b;

        C2630b(Activity activity, TextView textView) {
            this.f7506a = activity;
            this.f7507b = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int q3 = SetBrightnessAction.this.m12359t3(i);
            if (q3 == 0) {
                q3 = 1;
            }
            float f = ((float) q3) / 255.0f;
            try {
                WindowManager.LayoutParams attributes = this.f7506a.getWindow().getAttributes();
                attributes.screenBrightness = f;
                this.f7506a.getWindow().setAttributes(attributes);
            } catch (NullPointerException unused) {
            }
            TextView textView = this.f7507b;
            textView.setText(i + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetBrightnessAction$c */
    class C2631c implements Parcelable.Creator<SetBrightnessAction> {
        C2631c() {
        }

        /* renamed from: a */
        public SetBrightnessAction createFromParcel(Parcel parcel) {
            return new SetBrightnessAction(parcel, (C2629a) null);
        }

        /* renamed from: b */
        public SetBrightnessAction[] newArray(int i) {
            return new SetBrightnessAction[i];
        }
    }

    /* synthetic */ SetBrightnessAction(Parcel parcel, C2629a aVar) {
        this(parcel);
    }

    /* renamed from: r3 */
    private int m12357r3(int i) {
        int i2 = this.m_minimumBrightness;
        return Math.round((((float) (i - i2)) / ((float) (255 - i2))) * 100.0f);
    }

    /* renamed from: s3 */
    private void m12358s3() {
        int i = this.m_brightness;
        if (i > 0) {
            this.m_brightnessPercent = m12357r3(i);
            this.m_brightness = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public int m12359t3(int i) {
        if (i > 100) {
            i = 100;
        } else if (i < 0) {
            i = 0;
        }
        int i2 = this.m_minimumBrightness;
        return ((int) (((float) i) * (((float) (255 - i2)) / 100.0f))) + i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static /* synthetic */ void m12360u3(TextView textView, CompoundButton compoundButton, boolean z) {
        textView.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static /* synthetic */ void m12361v3(Spinner spinner, SeekBar seekBar, CompoundButton compoundButton, boolean z) {
        spinner.setEnabled(!z);
        seekBar.setEnabled(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ boolean m12362w3(Spinner spinner, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || spinner.getAdapter().getCount() > 1) {
            return false;
        }
        C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_integer_variables_defined, 0).show();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m12363x3(SwitchCompat switchCompat, SeekBar seekBar, Activity activity, CheckBox checkBox, CheckBox checkBox2, TextView textView, AppCompatDialog appCompatDialog, View view) {
        if (switchCompat.isChecked()) {
            this.m_brightnessPercent = 999;
        } else {
            this.m_brightnessPercent = seekBar.getProgress();
        }
        this.m_variable = this.workingVariable;
        this.varDictionaryKeys = this.workingDictionaryKeys;
        if (mo27836X()) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.screenBrightness = (float) this.m_brightnessToRestore;
            activity.getWindow().setAttributes(attributes);
        }
        this.m_forcePieMode = checkBox.isChecked();
        this.forceValueEnabled = checkBox2.isChecked();
        if (!textView.getText().toString().isEmpty()) {
            try {
                this.forceValue = Integer.valueOf(textView.getText().toString()).intValue();
            } catch (Exception unused) {
                this.forceValue = 0;
            }
        } else {
            this.forceValue = 0;
        }
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        m12358s3();
        if (this.forceValueEnabled) {
            return String.valueOf(this.forceValue);
        }
        if (this.m_brightnessPercent == 999) {
            return SelectableItem.m15535j1(C17541R$string.action_set_brightness_auto);
        }
        if (this.m_variable != null) {
            return this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys);
        }
        return this.m_brightnessPercent + TaskerPlugin.VARIABLE_PREFIX;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7764i3.m32414u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i;
        m12358s3();
        if (this.forceValueEnabled) {
            i = this.forceValue;
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 28 || !this.m_forcePieMode) {
                i = m12359t3(this.m_brightnessPercent);
            } else {
                int b = C6371c1.m24615b(this.m_brightnessPercent, false);
                i = (i2 < 31 || b != 0) ? b : 1;
            }
        }
        if (this.m_brightnessPercent == 999) {
            Settings.System.putInt(mo27827K0().getContentResolver(), SCREEN_BRIGHTNESS_MODE, 1);
        } else {
            Settings.System.putInt(mo27827K0().getContentResolver(), SCREEN_BRIGHTNESS_MODE, 0);
            MacroDroidVariable macroDroidVariable = this.m_variable;
            if (macroDroidVariable != null) {
                MacroDroidVariable q = mo27861q(macroDroidVariable.getName());
                if (q == null) {
                    C4878b.m18869h("Variable does not exist: " + q.getName(), mo27840Y0().longValue());
                    return;
                }
                Long C = q.mo27732C(this.varDictionaryKeys);
                if (C == null) {
                    C4878b.m18869h("Variable does not exist: " + q.getName() + C6520o0.m24912e0(this.varDictionaryKeys), mo27840Y0().longValue());
                    return;
                } else if (this.forceValueEnabled) {
                    i = C.intValue();
                } else {
                    int intValue = C.intValue();
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    if (intValue > 100) {
                        intValue = 100;
                    }
                    if (Build.VERSION.SDK_INT < 28 || !this.m_forcePieMode) {
                        i = m12359t3(intValue);
                    } else {
                        i = C6371c1.m24615b(intValue, false);
                    }
                }
            }
            try {
                Settings.System.putInt(mo27827K0().getContentResolver(), "screen_brightness", i);
            } catch (Exception e) {
                C4878b.m18869h("Failed to set brightness: " + e.toString(), mo27840Y0().longValue());
            }
        }
        Intent intent = new Intent();
        intent.setClass(mo27827K0(), UpdateBrightnessActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("Brightness", i);
        mo27827K0().startActivity(intent);
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.m_variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String str;
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.brightness_dialog);
            appCompatDialog.setTitle((int) C17541R$string.action_set_brightness);
            this.workingVariable = this.m_variable;
            this.workingDictionaryKeys = this.varDictionaryKeys;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.brightness_dialog_seek_bar);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.variablesSpinner);
            ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.brightness_bar_layout);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.brightness_percent_text);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.use_android_pie_checkbox);
            TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.use_android_pie_text);
            CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.force_value_checkbox);
            TextView textView3 = (TextView) appCompatDialog.findViewById(C17532R$id.force_value_value);
            TextView textView4 = (TextView) appCompatDialog.findViewById(C17532R$id.force_value_description);
            int i = Build.VERSION.SDK_INT;
            SwitchCompat switchCompat = (SwitchCompat) appCompatDialog.findViewById(C17532R$id.brightness_dialog_auto_switch);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            textView2.setVisibility(i >= 28 ? 0 : 8);
            checkBox.setVisibility(i >= 28 ? 0 : 8);
            checkBox.setChecked(this.m_forcePieMode);
            checkBox2.setChecked(this.forceValueEnabled);
            textView3.setText(String.valueOf(this.forceValue));
            if (i >= 28) {
                checkBox2.setVisibility(0);
                textView4.setVisibility(0);
                if (this.forceValueEnabled) {
                    textView3.setVisibility(0);
                }
            }
            checkBox2.setOnCheckedChangeListener(new C3285ng(textView3));
            int i2 = this.m_brightnessPercent;
            int i3 = i2 == 999 ? 50 : i2;
            textView.setText(i3 + TaskerPlugin.VARIABLE_PREFIX);
            try {
                this.m_brightnessToRestore = Settings.System.getInt(j0.getContentResolver(), "screen_brightness");
            } catch (Settings.SettingNotFoundException unused) {
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(SelectableItem.m15535j1(C17541R$string.use_slider_value));
            Activity j02 = mo27850j0();
            Macro X0 = mo27837X0();
            if (this.m_variable != null) {
                str = this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys);
            } else {
                str = null;
            }
            TextView textView5 = textView3;
            CheckBox checkBox3 = checkBox2;
            Macro macro = X0;
            CheckBox checkBox4 = checkBox;
            TextView textView6 = textView;
            ViewGroup viewGroup2 = viewGroup;
            int i4 = i3;
            SwitchCompat switchCompat2 = switchCompat;
            Button button3 = button;
            Spinner spinner2 = spinner;
            C6520o0.m24879I(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner, macro, arrayList, str, "", false, new C2629a(viewGroup));
            if (this.workingVariable == null) {
                viewGroup2.setVisibility(0);
            } else {
                viewGroup2.setVisibility(8);
            }
            SwitchCompat switchCompat3 = switchCompat2;
            switchCompat3.setOnCheckedChangeListener(new C3257mg(spinner2, seekBar));
            switchCompat3.setChecked(this.m_brightnessPercent == 999);
            spinner2.setEnabled(!switchCompat3.isChecked());
            seekBar.setEnabled(!switchCompat3.isChecked());
            spinner2.setOnTouchListener(new C3229lg(this, spinner2));
            seekBar.setProgress(Math.round((float) i4));
            seekBar.setOnSeekBarChangeListener(new C2630b(j0, textView6));
            button3.setOnClickListener(new C3201kg(this, switchCompat3, seekBar, j0, checkBox4, checkBox3, textView5, appCompatDialog));
            button2.setOnClickListener(new C3173jg(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: u2 */
    public boolean mo25103u2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_brightness);
        parcel.writeInt(this.m_brightnessPercent);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeInt(this.m_forcePieMode ? 1 : 0);
        parcel.writeInt(this.forceValueEnabled ? 1 : 0);
        parcel.writeInt(this.forceValue);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    public SetBrightnessAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetBrightnessAction() {
        this.m_brightnessToRestore = 0;
        this.m_minimumBrightness = 0;
        int i = this.m_brightness;
        if (i == 0) {
            this.m_brightnessPercent = 50;
        } else {
            this.m_brightnessPercent = m12357r3(i);
            this.m_brightness = 0;
        }
        this.m_minimumBrightness = C6405m1.m24661a(mo27827K0());
    }

    private SetBrightnessAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.m_brightnessToRestore = 0;
        this.m_minimumBrightness = 0;
        this.m_brightness = parcel.readInt();
        this.m_brightnessPercent = parcel.readInt();
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_forcePieMode = parcel.readInt() != 0;
        this.forceValueEnabled = parcel.readInt() != 0 ? true : z;
        this.forceValue = parcel.readInt();
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
