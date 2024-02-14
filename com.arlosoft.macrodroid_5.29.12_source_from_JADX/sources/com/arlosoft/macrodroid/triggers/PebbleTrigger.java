package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4040n;
import com.arlosoft.macrodroid.common.C4072w0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.getpebble.android.kit.PebbleKit;
import com.getpebble.android.kit.util.PebbleDictionary;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import p119k3.C7508h1;

public class PebbleTrigger extends Trigger {
    public static final Parcelable.Creator<PebbleTrigger> CREATOR = new C5718e();
    private static final int OPTION_BUTTON_PRESS = 0;
    private static final int OPTION_CONNECTED = 1;
    private static final int OPTION_DISCONNECTED = 2;
    private static final int PEBBLE_COMMAND_DISPLAY_INFO = 20;
    private static final int PEBBLE_TRIGGER_INFO_MESSAGE_KEY = 2001;
    private static final String[] s_buttonIdOptions = {MacroDroidApplication.m14845u().getString(C17541R$string.trigger_pebble_button_press_top), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_pebble_button_press_middle), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_pebble_button_press_bottom)};
    private static final PebbleKit.PebbleDataReceiver s_buttonPressReceiver = new C5716c(C4040n.f10591a);
    private static final BroadcastReceiver s_connectReceiver = new C5714a();
    private static final BroadcastReceiver s_disconnectReceiver = new C5715b();
    private static final String[] s_options = {SelectableItem.m15535j1(C17541R$string.trigger_pebble_button_pressed), SelectableItem.m15535j1(C17541R$string.trigger_pebble_connected), SelectableItem.m15535j1(C17541R$string.trigger_pebble_disconnected), SelectableItem.m15535j1(C17541R$string.trigger_pebble_battery)};
    private static final String[] s_pressTypeOptions = {MacroDroidApplication.m14845u().getString(C17541R$string.trigger_pebble_button_press_single), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_pebble_button_press_long), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_pebble_button_press_double)};
    private static int s_triggerCounter;
    /* access modifiers changed from: private */
    public int m_batteryLevel;
    private int m_buttonId;
    private boolean m_decreasesTo;
    private int m_option;
    private int m_pressType;

    /* renamed from: com.arlosoft.macrodroid.triggers.PebbleTrigger$a */
    class C5714a extends BroadcastReceiver {
        C5714a() {
        }

        public void onReceive(Context context, Intent intent) {
            PebbleTrigger.m22931z3(true);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.PebbleTrigger$b */
    class C5715b extends BroadcastReceiver {
        C5715b() {
        }

        public void onReceive(Context context, Intent intent) {
            PebbleTrigger.m22931z3(false);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.PebbleTrigger$c */
    class C5716c extends PebbleKit.PebbleDataReceiver {
        C5716c(UUID uuid) {
            super(uuid);
        }

        /* renamed from: a */
        public void mo31400a(Context context, int i, PebbleDictionary pebbleDictionary) {
            PebbleKit.m26087h(MacroDroidApplication.m14845u(), i);
            if (pebbleDictionary.mo34299n(1)) {
                int intValue = pebbleDictionary.mo34300p(1).intValue();
                int i2 = intValue % 100;
                int i3 = intValue / 100;
                ArrayList arrayList = new ArrayList();
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Trigger next2 = it.next();
                        if ((next2 instanceof PebbleTrigger) && next2.mo31374R2()) {
                            PebbleTrigger pebbleTrigger = (PebbleTrigger) next2;
                            if (i2 != -1 && pebbleTrigger.mo31397x3() == 0 && pebbleTrigger.m22929v3() == i2 && pebbleTrigger.m22930y3() == i3) {
                                next.setTriggerThatInvoked(next2);
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    }
                }
                boolean z = false;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Macro macro = (Macro) it2.next();
                    macro.invokeActions(macro.getTriggerContextInfo());
                    PebbleDictionary pebbleDictionary2 = new PebbleDictionary();
                    pebbleDictionary2.mo34298m(999, (byte) 20);
                    pebbleDictionary2.mo34293i(2001, "[" + macro.getName() + "]");
                    PebbleKit.m26088i(MacroDroidApplication.m14845u(), C4040n.f10591a, pebbleDictionary2);
                    z = true;
                }
                if (!z) {
                    try {
                        PebbleDictionary pebbleDictionary3 = new PebbleDictionary();
                        pebbleDictionary3.mo34298m(999, (byte) 20);
                        pebbleDictionary3.mo34293i(2001, "[" + MacroDroidApplication.m14845u().getString(C17541R$string.trigger_pebble_no_macro_run) + "]");
                        PebbleKit.m26088i(MacroDroidApplication.m14845u(), C4040n.f10591a, pebbleDictionary3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.PebbleTrigger$d */
    class C5717d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f13666a;

        C5717d(TextView textView) {
            this.f13666a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = PebbleTrigger.this.m_batteryLevel = i;
            TextView textView = this.f13666a;
            textView.setText(PebbleTrigger.this.m_batteryLevel + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.PebbleTrigger$e */
    class C5718e implements Parcelable.Creator<PebbleTrigger> {
        C5718e() {
        }

        /* renamed from: a */
        public PebbleTrigger createFromParcel(Parcel parcel) {
            return new PebbleTrigger(parcel, (C5714a) null);
        }

        /* renamed from: b */
        public PebbleTrigger[] newArray(int i) {
            return new PebbleTrigger[i];
        }
    }

    /* synthetic */ PebbleTrigger(Parcel parcel, C5714a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m22904A3() {
        super.mo24714u1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m22905B3(CompoundButton compoundButton, boolean z) {
        this.m_decreasesTo = !z;
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m22906C3(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m22908E3(DialogInterface dialogInterface, int i) {
        this.m_pressType = i + 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m22909F3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m22910G3(DialogInterface dialogInterface, int i) {
        this.m_buttonId = i + 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m22911H3(DialogInterface dialogInterface, int i) {
        m22913J3();
    }

    /* renamed from: I3 */
    private void m22912I3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.battery_trigger_dialog);
        appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.trigger_battery_level_title));
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_seek_bar);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_percent_label);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.battery_trigger_dialog_increases_rb);
        seekBar.setProgress(this.m_batteryLevel);
        seekBar.incrementProgressBy(10);
        textView.setText(this.m_batteryLevel + TaskerPlugin.VARIABLE_PREFIX);
        radioButton.setChecked(this.m_decreasesTo ^ true);
        seekBar.setOnSeekBarChangeListener(new C5717d(textView));
        radioButton.setOnCheckedChangeListener(new C5959i6(this));
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C5947h6(this, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5935g6(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: J3 */
    private void m22913J3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_pebble_button_press_select_press);
        builder.setSingleChoiceItems((CharSequence[]) s_pressTypeOptions, this.m_pressType - 1, (DialogInterface.OnClickListener) new C5887c6(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5899d6(this));
        builder.create().show();
    }

    /* renamed from: K3 */
    private void m22914K3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_pebble_button_press_select_id);
        builder.setSingleChoiceItems((CharSequence[]) s_buttonIdOptions, this.m_buttonId - 1, (DialogInterface.OnClickListener) new C5911e6(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5923f6(this));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public int m22929v3() {
        return this.m_buttonId;
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public int m22930y3() {
        return this.m_pressType;
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static void m22931z3(boolean z) {
        Trigger next;
        ArrayList arrayList = new ArrayList();
        for (Macro next2 : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next2.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                if ((next instanceof PebbleTrigger) && next.mo31374R2()) {
                    PebbleTrigger pebbleTrigger = (PebbleTrigger) next;
                    if ((pebbleTrigger.mo31397x3() == 1 && z) || (pebbleTrigger.mo31397x3() == 2 && !z)) {
                        next2.setTriggerThatInvoked(next);
                    }
                }
            }
            next2.setTriggerThatInvoked(next);
            if (next2.canInvoke(next2.getTriggerContextInfo())) {
                arrayList.add(next2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return s_options[this.m_option];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_option;
        if (i == 0) {
            return s_buttonIdOptions[this.m_buttonId - 1] + " : " + s_pressTypeOptions[this.m_pressType - 1];
        } else if (i != 3) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.m_decreasesTo ? "<" : ">=");
            sb.append(" ");
            sb.append(this.m_batteryLevel);
            sb.append(TaskerPlugin.VARIABLE_PREFIX);
            return sb.toString();
        }
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            MacroDroidApplication.m14845u().unregisterReceiver(s_buttonPressReceiver);
            MacroDroidApplication.m14845u().unregisterReceiver(s_connectReceiver);
            MacroDroidApplication.m14845u().unregisterReceiver(s_disconnectReceiver);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7508h1.m31226u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            PebbleKit.m26086g(mo27827K0(), s_buttonPressReceiver);
            PebbleKit.m26084e(mo27827K0(), s_connectReceiver);
            PebbleKit.m26085f(mo27827K0(), s_disconnectReceiver);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return s_options;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (C5163j2.m20091X1(mo27827K0())) {
            super.mo24714u1();
        } else {
            C4072w0.m16080d(mo27850j0(), new C5971j6(this));
        }
    }

    /* renamed from: u3 */
    public int mo31395u3() {
        return this.m_batteryLevel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_option;
        if (i == 0) {
            m22914K3();
        } else if (i == 3) {
            m22912I3();
        } else {
            mo24689O1();
        }
    }

    /* renamed from: w3 */
    public boolean mo31396w3() {
        return this.m_decreasesTo;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_buttonId);
        parcel.writeInt(this.m_pressType);
        parcel.writeInt(this.m_buttonId);
        parcel.writeInt(this.m_decreasesTo ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    /* renamed from: x3 */
    public int mo31397x3() {
        return this.m_option;
    }

    public PebbleTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private PebbleTrigger() {
        this.m_buttonId = 1;
        this.m_pressType = 1;
        this.m_batteryLevel = 50;
        this.m_decreasesTo = true;
    }

    private PebbleTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_buttonId = parcel.readInt();
        this.m_pressType = parcel.readInt();
        this.m_buttonId = parcel.readInt();
        this.m_decreasesTo = parcel.readInt() == 0;
    }
}
