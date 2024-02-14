package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
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
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import p123l1.C7605e;

public class BatteryLevelConstraint extends Constraint {
    public static final Parcelable.Creator<BatteryLevelConstraint> CREATOR = new C4112b();
    private static final int DEFAULT_BATTERY_LEVEL = 50;
    /* access modifiers changed from: private */
    public static int s_batteryLevel;
    /* access modifiers changed from: private */
    public int m_batteryLevel;
    private transient C4113c m_batteryLevelReceiver;
    private transient boolean m_constraintCheckingEnabled;
    private boolean m_equals;
    private boolean m_greaterThan;

    /* renamed from: com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$a */
    class C4111a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10695a;

        C4111a(TextView textView) {
            this.f10695a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = BatteryLevelConstraint.this.m_batteryLevel = i;
            TextView textView = this.f10695a;
            textView.setText(BatteryLevelConstraint.this.m_batteryLevel + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$b */
    class C4112b implements Parcelable.Creator<BatteryLevelConstraint> {
        C4112b() {
        }

        /* renamed from: a */
        public BatteryLevelConstraint createFromParcel(Parcel parcel) {
            return new BatteryLevelConstraint(parcel, (C4111a) null);
        }

        /* renamed from: b */
        public BatteryLevelConstraint[] newArray(int i) {
            return new BatteryLevelConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$c */
    private class C4113c extends BroadcastReceiver {
        private C4113c() {
        }

        public void onReceive(Context context, Intent intent) {
            int unused = BatteryLevelConstraint.s_batteryLevel = (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100);
        }

        /* synthetic */ C4113c(BatteryLevelConstraint batteryLevelConstraint, C4111a aVar) {
            this();
        }
    }

    /* synthetic */ BatteryLevelConstraint(Parcel parcel, C4111a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m16186l3(RadioButton radioButton, RadioButton radioButton2, AppCompatDialog appCompatDialog, View view) {
        this.m_greaterThan = radioButton.isChecked();
        this.m_equals = radioButton2.isChecked();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo27827K0().getString(C17541R$string.constraint_battery_level_battery_label));
        sb.append(" ");
        sb.append(this.m_equals ? "=" : this.m_greaterThan ? ">" : "<");
        sb.append(" ");
        sb.append(this.m_batteryLevel);
        sb.append(TaskerPlugin.VARIABLE_PREFIX);
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        C4878b.m18879r("Battery level constraint, current level = " + s_batteryLevel);
        int i = s_batteryLevel;
        if (i == 0) {
            Intent registerReceiver = mo27827K0().getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            double intExtra2 = (double) registerReceiver.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0.0d) {
                i = (int) ((((double) intExtra) / intExtra2) * 100.0d);
            }
        }
        if (this.m_equals) {
            if (i == this.m_batteryLevel) {
                return true;
            }
            return false;
        } else if (this.m_greaterThan) {
            if (i > this.m_batteryLevel) {
                return true;
            }
            return false;
        } else if (i < this.m_batteryLevel) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7605e.m31660u();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        return;
     */
    /* renamed from: T2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo28052T2() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m_constraintCheckingEnabled     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 0
            r2.m_constraintCheckingEnabled = r0     // Catch:{ all -> 0x0021 }
            com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$c r0 = r2.m_batteryLevelReceiver     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x0018 }
            com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$c r1 = r2.m_batteryLevelReceiver     // Catch:{ Exception -> 0x0018 }
            r0.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0018 }
            goto L_0x001c
        L_0x0018:
            r0 = move-exception
            p148q0.C8151a.m33873n(r0)     // Catch:{ all -> 0x0021 }
        L_0x001c:
            r0 = 0
            r2.m_batteryLevelReceiver = r0     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r2)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.BatteryLevelConstraint.mo28052T2():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return;
     */
    /* renamed from: V2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo28053V2() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m_constraintCheckingEnabled     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            r0 = 1
            r3.m_constraintCheckingEnabled = r0     // Catch:{ all -> 0x002d }
            com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$c r0 = r3.m_batteryLevelReceiver     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x002b
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)     // Catch:{ all -> 0x002d }
            com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$c r1 = new com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$c     // Catch:{ all -> 0x002d }
            r2 = 0
            r1.<init>(r3, r2)     // Catch:{ all -> 0x002d }
            r3.m_batteryLevelReceiver = r1     // Catch:{ all -> 0x002d }
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.setPriority(r1)     // Catch:{ all -> 0x002d }
            com.arlosoft.macrodroid.app.MacroDroidApplication r1 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ all -> 0x002d }
            com.arlosoft.macrodroid.constraint.BatteryLevelConstraint$c r2 = r3.m_batteryLevelReceiver     // Catch:{ all -> 0x002d }
            r1.registerReceiver(r2, r0)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.BatteryLevelConstraint.mo28053V2():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.battery_constraint_dialog);
        appCompatDialog.setTitle((int) C17541R$string.constraint_battery_level);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.batteryLevelSeekBar);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.batteryPercentLabel);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.greaterThanRadioButton);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.lessThanRadioButton);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.equalsRadioButton);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        seekBar.setProgress(this.m_batteryLevel);
        textView.setText(this.m_batteryLevel + TaskerPlugin.VARIABLE_PREFIX);
        if (this.m_equals) {
            radioButton3.setChecked(true);
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
        } else {
            radioButton.setChecked(this.m_greaterThan);
            radioButton2.setChecked(!this.m_greaterThan);
            radioButton3.setChecked(false);
        }
        seekBar.setOnSeekBarChangeListener(new C4111a(textView));
        button.setOnClickListener(new C4244e(this, radioButton, radioButton3, appCompatDialog));
        button2.setOnClickListener(new C4238d(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_greaterThan ? 1 : 0);
        parcel.writeInt(this.m_equals ? 1 : 0);
        parcel.writeInt(this.m_batteryLevel);
    }

    public BatteryLevelConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private BatteryLevelConstraint() {
        this.m_greaterThan = false;
        this.m_batteryLevel = 50;
    }

    private BatteryLevelConstraint(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_greaterThan = parcel.readInt() != 0;
        this.m_equals = parcel.readInt() == 0 ? false : z;
        this.m_batteryLevel = parcel.readInt();
    }
}
