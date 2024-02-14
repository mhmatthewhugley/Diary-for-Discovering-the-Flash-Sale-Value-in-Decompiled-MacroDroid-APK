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
import com.arlosoft.macrodroid.triggers.receivers.BatteryLevelTriggerReceiver;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import p119k3.C7506h;
import p148q0.C8151a;

public class BatteryLevelTrigger extends Trigger {
    public static final Parcelable.Creator<BatteryLevelTrigger> CREATOR = new C5604b();
    private static final int DEFAULT_BATTERY_LEVEL = 50;
    private static BatteryLevelTriggerReceiver s_batteryLevelTriggerReceiver;
    private static int s_triggerCounter;
    /* access modifiers changed from: private */
    public int m_batteryLevel;
    private boolean m_decreasesTo;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.triggers.BatteryLevelTrigger$a */
    class C5603a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f13582a;

        C5603a(TextView textView) {
            this.f13582a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = BatteryLevelTrigger.this.m_batteryLevel = i;
            TextView textView = this.f13582a;
            textView.setText(BatteryLevelTrigger.this.m_batteryLevel + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.BatteryLevelTrigger$b */
    class C5604b implements Parcelable.Creator<BatteryLevelTrigger> {
        C5604b() {
        }

        /* renamed from: a */
        public BatteryLevelTrigger createFromParcel(Parcel parcel) {
            return new BatteryLevelTrigger(parcel, (C5603a) null);
        }

        /* renamed from: b */
        public BatteryLevelTrigger[] newArray(int i) {
            return new BatteryLevelTrigger[i];
        }
    }

    /* synthetic */ BatteryLevelTrigger(Parcel parcel, C5603a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private void m21617l3() {
        if (mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.battery_trigger_dialog);
            appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.trigger_battery_level_title));
            SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_seek_bar);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_percent_label);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_increases_rb);
            seekBar.setProgress(this.m_batteryLevel);
            textView.setText(this.m_batteryLevel + TaskerPlugin.VARIABLE_PREFIX);
            radioButton.setChecked(this.m_decreasesTo ^ true);
            seekBar.setOnSeekBarChangeListener(new C5603a(textView));
            radioButton.setOnCheckedChangeListener(new C5917f0(this));
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C5905e0(this, appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5893d0(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: p3 */
    private String[] m21618p3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_battery_level_increase_decrease), SelectableItem.m15535j1(C17541R$string.trigger_battery_level_any_change)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m21619q3(CompoundButton compoundButton, boolean z) {
        this.m_decreasesTo = !z;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m21620r3(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_option != 0) {
            return mo25559a1();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.trigger_battery_level_battery));
        sb.append(" ");
        sb.append(this.m_decreasesTo ? "<=" : ">=");
        sb.append(" ");
        sb.append(this.m_batteryLevel);
        sb.append(TaskerPlugin.VARIABLE_PREFIX);
        return sb.toString();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_option == 1) {
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
                MacroDroidApplication.m14845u().unregisterReceiver(s_batteryLevelTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_batteryLevelTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7506h.m31216u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_batteryLevelTriggerReceiver = new BatteryLevelTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            intentFilter.setPriority(0);
            MacroDroidApplication.m14845u().registerReceiver(s_batteryLevelTriggerReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21618p3();
    }

    /* renamed from: m3 */
    public int mo30944m3() {
        return this.m_batteryLevel;
    }

    /* renamed from: n3 */
    public boolean mo30945n3() {
        return this.m_decreasesTo;
    }

    /* renamed from: o3 */
    public int mo30946o3() {
        return this.m_option;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_option == 0) {
            m21617l3();
        } else {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_decreasesTo ? 1 : 0);
        parcel.writeInt(this.m_batteryLevel);
        parcel.writeInt(this.m_option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public BatteryLevelTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public BatteryLevelTrigger() {
        this.m_decreasesTo = true;
        this.m_batteryLevel = 50;
        this.m_option = 0;
    }

    private BatteryLevelTrigger(Parcel parcel) {
        super(parcel);
        this.m_decreasesTo = parcel.readInt() != 0;
        this.m_batteryLevel = parcel.readInt();
        this.m_option = parcel.readInt();
    }
}
