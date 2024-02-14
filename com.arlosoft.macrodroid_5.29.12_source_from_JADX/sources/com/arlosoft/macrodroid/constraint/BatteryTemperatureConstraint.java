package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;

public class BatteryTemperatureConstraint extends Constraint {
    public static final Parcelable.Creator<BatteryTemperatureConstraint> CREATOR = new C4116b();
    private static final int DEFAULT_TEMPERATURE = 30;
    private boolean equals;
    private boolean greaterThan;
    /* access modifiers changed from: private */
    public int temperature;

    /* renamed from: com.arlosoft.macrodroid.constraint.BatteryTemperatureConstraint$a */
    class C4115a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10698a;

        C4115a(TextView textView) {
            this.f10698a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = BatteryTemperatureConstraint.this.temperature = i;
            TextView textView = this.f10698a;
            textView.setText(BatteryTemperatureConstraint.this.temperature + "°C");
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.BatteryTemperatureConstraint$b */
    class C4116b implements Parcelable.Creator<BatteryTemperatureConstraint> {
        C4116b() {
        }

        /* renamed from: a */
        public BatteryTemperatureConstraint createFromParcel(Parcel parcel) {
            return new BatteryTemperatureConstraint(parcel, (C4115a) null);
        }

        /* renamed from: b */
        public BatteryTemperatureConstraint[] newArray(int i) {
            return new BatteryTemperatureConstraint[i];
        }
    }

    /* synthetic */ BatteryTemperatureConstraint(Parcel parcel, C4115a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m16209k3(RadioButton radioButton, RadioButton radioButton2, AppCompatDialog appCompatDialog, View view) {
        this.greaterThan = radioButton.isChecked();
        this.equals = radioButton2.isChecked();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo27827K0().getString(C17541R$string.constraint_battery_temp));
        sb.append(" ");
        sb.append(this.equals ? "=" : this.greaterThan ? ">" : "<");
        sb.append(" ");
        sb.append(this.temperature);
        sb.append("°C");
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int intExtra = mo27827K0().getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("temperature", 0) / 10;
        if (this.equals) {
            if (intExtra == this.temperature) {
                return true;
            }
            return false;
        } else if (this.greaterThan) {
            if (intExtra > this.temperature) {
                return true;
            }
            return false;
        } else if (intExtra < this.temperature) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C4261h.m17265u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.battery_constraint_dialog);
        appCompatDialog.setTitle((int) C17541R$string.constraint_battery_temp);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.batteryLevelSeekBar);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.batteryPercentLabel);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.greaterThanRadioButton);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.lessThanRadioButton);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.equalsRadioButton);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        seekBar.setProgress(this.temperature);
        textView.setText(this.temperature + "°C");
        if (this.equals) {
            radioButton3.setChecked(true);
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
        } else {
            radioButton.setChecked(this.greaterThan);
            radioButton2.setChecked(!this.greaterThan);
            radioButton3.setChecked(false);
        }
        seekBar.setOnSeekBarChangeListener(new C4115a(textView));
        button.setOnClickListener(new C4256g(this, radioButton, radioButton3, appCompatDialog));
        button2.setOnClickListener(new C4250f(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.greaterThan ? 1 : 0);
        parcel.writeInt(this.equals ? 1 : 0);
        parcel.writeInt(this.temperature);
    }

    public BatteryTemperatureConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private BatteryTemperatureConstraint() {
        this.greaterThan = false;
        this.temperature = 30;
    }

    private BatteryTemperatureConstraint(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.greaterThan = parcel.readInt() != 0;
        this.equals = parcel.readInt() == 0 ? false : z;
        this.temperature = parcel.readInt();
    }
}
