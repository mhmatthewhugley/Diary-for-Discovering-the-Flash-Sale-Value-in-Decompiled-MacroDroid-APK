package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6371c1;
import com.arlosoft.macrodroid.utils.C6405m1;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import p123l1.C7615h;

public class BrightnessConstraint extends Constraint {
    public static final Parcelable.Creator<BrightnessConstraint> CREATOR = new C4123b();
    private static final int DEFAULT_BRIGHTNESS_LEVEL = 50;
    /* access modifiers changed from: private */
    public int m_brightness;
    private boolean m_equals;
    private boolean m_forcePieMode;
    private boolean m_greaterThan;
    private boolean m_isAutoBrightness;
    private transient int m_minBrightness;

    /* renamed from: com.arlosoft.macrodroid.constraint.BrightnessConstraint$a */
    class C4122a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10707a;

        C4122a(TextView textView) {
            this.f10707a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = BrightnessConstraint.this.m_brightness = i;
            TextView textView = this.f10707a;
            textView.setText(BrightnessConstraint.this.m_brightness + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.BrightnessConstraint$b */
    class C4123b implements Parcelable.Creator<BrightnessConstraint> {
        C4123b() {
        }

        /* renamed from: a */
        public BrightnessConstraint createFromParcel(Parcel parcel) {
            return new BrightnessConstraint(parcel, (C4122a) null);
        }

        /* renamed from: b */
        public BrightnessConstraint[] newArray(int i) {
            return new BrightnessConstraint[i];
        }
    }

    /* synthetic */ BrightnessConstraint(Parcel parcel, C4122a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m16242D1() {
        this.m_minBrightness = C6405m1.m24661a(mo27827K0());
        this.m_greaterThan = false;
        this.m_brightness = 50;
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static /* synthetic */ void m16248l3(ViewGroup viewGroup, CompoundButton compoundButton, boolean z) {
        viewGroup.setVisibility(z ? 8 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m16249m3(RadioButton radioButton, RadioButton radioButton2, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog, View view) {
        this.m_greaterThan = radioButton.isChecked();
        this.m_equals = radioButton2.isChecked();
        this.m_isAutoBrightness = checkBox.isChecked();
        this.m_forcePieMode = checkBox2.isChecked();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_isAutoBrightness) {
            return SelectableItem.m15535j1(C17541R$string.auto_brightness);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo27827K0().getString(C17541R$string.action_set_brightness));
        sb.append(" ");
        sb.append(this.m_equals ? "=" : this.m_greaterThan ? ">" : "<");
        sb.append(" ");
        sb.append(this.m_brightness);
        sb.append(TaskerPlugin.VARIABLE_PREFIX);
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int i;
        try {
            if (!this.m_isAutoBrightness) {
                int i2 = Settings.System.getInt(mo27827K0().getContentResolver(), "screen_brightness");
                if (Build.VERSION.SDK_INT < 28 || !this.m_forcePieMode) {
                    int i3 = this.m_minBrightness;
                    i = Math.round((((float) (i2 - i3)) / ((float) (255 - i3))) * 100.0f);
                } else {
                    i = C6371c1.m24615b(i2, true);
                }
                if (this.m_equals) {
                    if (i == this.m_brightness) {
                        return true;
                    }
                    return false;
                } else if (this.m_greaterThan) {
                    if (i > this.m_brightness) {
                        return true;
                    }
                    return false;
                } else if (i < this.m_brightness) {
                    return true;
                } else {
                    return false;
                }
            } else if (Settings.System.getInt(mo27827K0().getContentResolver(), "screen_brightness_mode") == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Settings.SettingNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7615h.m31712u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.battery_constraint_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_set_brightness);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.batteryLevelSeekBar);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.batteryPercentLabel);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.greaterThanRadioButton);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.lessThanRadioButton);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.equalsRadioButton);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.auto_brightness_checkbox);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.value_container);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.use_android_pie_checkbox);
        TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.use_android_pie_text);
        int i = Build.VERSION.SDK_INT;
        textView2.setVisibility(i >= 28 ? 0 : 8);
        checkBox2.setVisibility(i >= 28 ? 0 : 8);
        checkBox2.setChecked(this.m_forcePieMode);
        checkBox.setVisibility(0);
        checkBox.setChecked(this.m_isAutoBrightness);
        viewGroup.setVisibility(this.m_isAutoBrightness ? 8 : 0);
        checkBox.setOnCheckedChangeListener(new C4281l(viewGroup));
        seekBar.setProgress(this.m_brightness);
        textView.setText(this.m_brightness + TaskerPlugin.VARIABLE_PREFIX);
        if (this.m_equals) {
            radioButton3.setChecked(true);
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
        } else {
            radioButton.setChecked(this.m_greaterThan);
            radioButton2.setChecked(true ^ this.m_greaterThan);
            radioButton3.setChecked(false);
        }
        seekBar.setOnSeekBarChangeListener(new C4122a(textView));
        button.setOnClickListener(new C4276k(this, radioButton, radioButton3, checkBox, checkBox2, appCompatDialog));
        button2.setOnClickListener(new C4271j(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_greaterThan ? 1 : 0);
        parcel.writeInt(this.m_equals ? 1 : 0);
        parcel.writeInt(this.m_brightness);
        parcel.writeInt(this.m_isAutoBrightness ? 1 : 0);
        parcel.writeInt(this.m_forcePieMode ? 1 : 0);
    }

    public BrightnessConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private BrightnessConstraint() {
        m16242D1();
    }

    private BrightnessConstraint(Parcel parcel) {
        super(parcel);
        m16242D1();
        boolean z = true;
        this.m_greaterThan = parcel.readInt() != 0;
        this.m_equals = parcel.readInt() != 0;
        this.m_brightness = parcel.readInt();
        this.m_isAutoBrightness = parcel.readInt() != 0;
        this.m_forcePieMode = parcel.readInt() == 0 ? false : z;
    }
}
