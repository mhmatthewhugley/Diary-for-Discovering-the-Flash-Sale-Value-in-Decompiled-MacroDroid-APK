package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.BatteryTemperatureTriggerReceiver;
import p119k3.C7515j;
import p148q0.C8151a;

public class BatteryTemperatureTrigger extends Trigger {
    public static final Parcelable.Creator<BatteryTemperatureTrigger> CREATOR = new C5607b();
    private static final int DEFAULT_TEMPERATURE = 30;
    private static BatteryTemperatureTriggerReceiver s_batteryTempTriggerReceiver;
    private static int s_triggerCounter;
    private boolean decreasesTo;
    private int option;
    /* access modifiers changed from: private */
    public int temperature;

    /* renamed from: com.arlosoft.macrodroid.triggers.BatteryTemperatureTrigger$a */
    class C5606a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f13584a;

        C5606a(TextView textView) {
            this.f13584a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = BatteryTemperatureTrigger.this.temperature = i;
            TextView textView = this.f13584a;
            textView.setText(BatteryTemperatureTrigger.this.temperature + "°C");
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.BatteryTemperatureTrigger$b */
    class C5607b implements Parcelable.Creator<BatteryTemperatureTrigger> {
        C5607b() {
        }

        /* renamed from: a */
        public BatteryTemperatureTrigger createFromParcel(Parcel parcel) {
            return new BatteryTemperatureTrigger(parcel, (C5606a) null);
        }

        /* renamed from: b */
        public BatteryTemperatureTrigger[] newArray(int i) {
            return new BatteryTemperatureTrigger[i];
        }
    }

    /* synthetic */ BatteryTemperatureTrigger(Parcel parcel, C5606a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private void m21654l3() {
        if (mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.battery_trigger_dialog);
            appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.trigger_battery_temp));
            SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_seek_bar);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_percent_label);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_increases_rb);
            seekBar.setProgress(this.temperature);
            textView.setText(this.temperature + "°C");
            radioButton.setChecked(this.decreasesTo ^ true);
            seekBar.setOnSeekBarChangeListener(new C5606a(textView));
            radioButton.setOnCheckedChangeListener(new C5953i0(this));
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C5941h0(this, appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5929g0(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: o3 */
    private String[] m21655o3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_battery_level_increase_decrease), SelectableItem.m15535j1(C17541R$string.trigger_battery_level_any_change)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m21656q3(CompoundButton compoundButton, boolean z) {
        this.decreasesTo = !z;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m21657r3(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.option != 0) {
            return mo25559a1();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.trigger_battery_temp));
        sb.append(" ");
        sb.append(this.decreasesTo ? "<=" : ">=");
        sb.append(" ");
        sb.append(this.temperature);
        sb.append("°C");
        return sb.toString();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.option == 1) {
            return SelectableItem.m15535j1(C17541R$string.trigger_variable_any_change);
        }
        return null;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_batteryTempTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_batteryTempTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7515j.m31261u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        if (this.option != 1) {
            return mo24738G0();
        }
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_batteryTempTriggerReceiver = new BatteryTemperatureTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            intentFilter.setPriority(0);
            MacroDroidApplication.m14845u().registerReceiver(s_batteryTempTriggerReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21655o3();
    }

    /* renamed from: m3 */
    public boolean mo30959m3() {
        return this.decreasesTo;
    }

    /* renamed from: n3 */
    public int mo30960n3() {
        return this.option;
    }

    /* renamed from: p3 */
    public int mo30961p3() {
        return this.temperature;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.option == 0) {
            m21654l3();
        } else {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.decreasesTo ? 1 : 0);
        parcel.writeInt(this.temperature);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public BatteryTemperatureTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public BatteryTemperatureTrigger() {
        this.decreasesTo = true;
        this.temperature = 30;
        this.option = 0;
    }

    private BatteryTemperatureTrigger(Parcel parcel) {
        super(parcel);
        this.decreasesTo = parcel.readInt() != 0;
        this.temperature = parcel.readInt();
        this.option = parcel.readInt();
    }
}
