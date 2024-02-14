package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7606e0;
import p319lc.C15626c;

public class LightLevelConstraint extends Constraint {
    public static final Parcelable.Creator<LightLevelConstraint> CREATOR = new C4158c();
    private static final int LIGHT_LEVEL_NOT_SET = -1;
    private static final int OPTION_GREATER_THAN = 1;
    private static final int OPTION_LESS_THAN = 0;
    private static int s_constraintCounter;
    /* access modifiers changed from: private */
    public static float s_lightLevel;
    private static final C4159d s_lightLevelListener = new C4159d((C4156a) null);
    private static final Object s_lock = new Object();
    private static boolean s_screenOn;
    private static final SensorManager s_sensorManager = ((SensorManager) MacroDroidApplication.m14845u().getSystemService("sensor"));
    private transient boolean m_enabled;
    private int m_lightLevel;
    private float m_lightLevelFloat;
    private int m_option;

    public static class ScreenOnOffReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            LightLevelConstraint.m16656r3(intent.getAction().equals("android.intent.action.SCREEN_ON"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.LightLevelConstraint$a */
    class C4156a implements SensorEventListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10724a;

        C4156a(TextView textView) {
            this.f10724a = textView;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            TextView textView = this.f10724a;
            textView.setText(sensorEvent.values[0] + "lx");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.LightLevelConstraint$b */
    class C4157b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10726a;

        C4157b(Button button) {
            this.f10726a = button;
        }

        public void afterTextChanged(Editable editable) {
            this.f10726a.setEnabled(editable.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.LightLevelConstraint$c */
    class C4158c implements Parcelable.Creator<LightLevelConstraint> {
        C4158c() {
        }

        /* renamed from: a */
        public LightLevelConstraint createFromParcel(Parcel parcel) {
            return new LightLevelConstraint(parcel, (C4156a) null);
        }

        /* renamed from: b */
        public LightLevelConstraint[] newArray(int i) {
            return new LightLevelConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.LightLevelConstraint$d */
    private static class C4159d implements SensorEventListener {
        private C4159d() {
        }

        /* synthetic */ C4159d(C4156a aVar) {
            this();
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float unused = LightLevelConstraint.s_lightLevel = sensorEvent.values[0];
        }
    }

    /* synthetic */ LightLevelConstraint(Parcel parcel, C4156a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private float m16651m3() {
        int i = this.m_lightLevel;
        return i != -1 ? (float) i : this.m_lightLevelFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m16652n3(CompoundButton compoundButton, boolean z) {
        this.m_option = z ? 1 : 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m16653o3(EditText editText, AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, Activity activity, View view) {
        try {
            this.m_lightLevelFloat = Float.valueOf(editText.getText().toString()).floatValue();
            appCompatDialog.dismiss();
            mo24689O1();
            s_sensorManager.unregisterListener(sensorEventListener);
        } catch (NumberFormatException unused) {
            C15626c.makeText(activity.getApplicationContext(), C17541R$string.invalid_value, 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static /* synthetic */ void m16654p3(AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, View view) {
        appCompatDialog.dismiss();
        s_sensorManager.unregisterListener(sensorEventListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static void m16656r3(boolean z) {
        synchronized (s_lock) {
            s_screenOn = z;
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(this.m_option == 0 ? C17541R$string.less_than : C17541R$string.greater_than));
        sb.append(" ");
        sb.append(m16651m3());
        sb.append("lx");
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        float m3 = m16651m3();
        int i = this.m_option;
        if (i != 0) {
            if (i == 1 && s_lightLevel > m3) {
                return true;
            }
            return false;
        } else if (s_lightLevel < m3) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7606e0.m31665u();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|(2:9|10)|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* renamed from: T2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28052T2() {
        /*
            r3 = this;
            java.lang.Object r0 = s_lock
            monitor-enter(r0)
            boolean r1 = r3.m_enabled     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0009:
            r1 = 0
            r3.m_enabled = r1     // Catch:{ all -> 0x001d }
            int r1 = s_constraintCounter     // Catch:{ all -> 0x001d }
            int r1 = r1 + -1
            s_constraintCounter = r1     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x001b
            android.hardware.SensorManager r1 = s_sensorManager     // Catch:{ Exception -> 0x001b }
            com.arlosoft.macrodroid.constraint.LightLevelConstraint$d r2 = s_lightLevelListener     // Catch:{ Exception -> 0x001b }
            r1.unregisterListener(r2)     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.LightLevelConstraint.mo28052T2():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
        synchronized (s_lock) {
            if (!this.m_enabled) {
                this.m_enabled = true;
                if (s_constraintCounter == 0) {
                    SensorManager sensorManager = s_sensorManager;
                    sensorManager.registerListener(s_lightLevelListener, sensorManager.getDefaultSensor(5), 3);
                }
                s_constraintCounter++;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.select_option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27836X()) {
            int i = this.m_lightLevel;
            if (i != -1) {
                this.m_lightLevelFloat = (float) i;
                this.m_lightLevel = -1;
            }
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_light_sensor);
            appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.trigger_light_sensor));
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.lux_value);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.dialog_light_sensor_increases_rb);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            radioButton.setText(C17541R$string.greater_than);
            ((RadioButton) appCompatDialog.findViewById(C17532R$id.dialog_light_sensor_decreases_rb)).setText(C17541R$string.less_than);
            C4156a aVar = new C4156a((TextView) appCompatDialog.findViewById(C17532R$id.light_level));
            boolean z = false;
            radioButton.setChecked(this.m_option == 1);
            SensorManager sensorManager = s_sensorManager;
            sensorManager.registerListener(aVar, sensorManager.getDefaultSensor(5), 3);
            float f = this.m_lightLevelFloat;
            if (f != -1.0f) {
                editText.setText(String.valueOf(f));
                editText.setSelection(editText.length());
            }
            if (editText.length() > 0) {
                z = true;
            }
            button.setEnabled(z);
            editText.addTextChangedListener(new C4157b(button));
            radioButton.setOnCheckedChangeListener(new C4283l1(this));
            button.setOnClickListener(new C4278k1(this, editText, appCompatDialog, aVar, j0));
            button2.setOnClickListener(new C4273j1(appCompatDialog, aVar));
            appCompatDialog.show();
            appCompatDialog.setOnCancelListener(new C4268i1(aVar));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_lightLevel);
        parcel.writeFloat(this.m_lightLevelFloat);
    }

    public LightLevelConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_lightLevel = -1;
        this.m_lightLevelFloat = -1.0f;
    }

    private LightLevelConstraint() {
    }

    private LightLevelConstraint(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_lightLevel = parcel.readInt();
        this.m_lightLevelFloat = parcel.readFloat();
    }
}
