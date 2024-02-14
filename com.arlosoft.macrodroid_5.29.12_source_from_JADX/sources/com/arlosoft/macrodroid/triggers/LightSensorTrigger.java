package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.ArrayList;
import java.util.Iterator;
import p119k3.C7549r0;
import p148q0.C8151a;
import p319lc.C15626c;

public class LightSensorTrigger extends Trigger {
    private static final String BG_UPDATE_INTENT = "LightSensorBGUpdate";
    public static final Parcelable.Creator<LightSensorTrigger> CREATOR = new C5679c();
    private static final int LIGHT_LEVEL_NOT_SET = -1;
    private static final long MIN_MS_BETWEEN_SCANS = 500;
    private static final int OPTION_DECREASES_TO = 0;
    private static final int OPTION_INCREASES_TO = 1;
    private static C5681e s_bgCheckReceiver;
    /* access modifiers changed from: private */
    public static long s_lastCheckTimestamp;
    private static final C5680d s_lightLevelListener = new C5680d(false);
    /* access modifiers changed from: private */
    public static final C5680d s_lightLevelListenerBg = new C5680d(true);
    /* access modifiers changed from: private */
    public static float s_oldLightLevel;
    private static PendingIntent s_pendingIntentBgScan;
    private static boolean s_screenOn;
    private static final ScreenOnOffReceiver s_screenOnOffTriggerReceiver = new ScreenOnOffReceiver();
    private static boolean s_sensorLive = false;
    /* access modifiers changed from: private */
    public static final SensorManager s_sensorManager = ((SensorManager) MacroDroidApplication.m14845u().getSystemService("sensor"));
    private static int s_triggerCounter = 0;
    private static C5681e s_updateRateReceiver;
    private int m_lightLevel;
    private float m_lightLevelFloat;
    private int m_option;

    public static class ScreenOnOffReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            LightSensorTrigger.m22532B3(intent.getAction().equals("android.intent.action.SCREEN_ON"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LightSensorTrigger$a */
    class C5677a implements SensorEventListener {

        /* renamed from: a */
        final /* synthetic */ TextView f13635a;

        C5677a(TextView textView) {
            this.f13635a = textView;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            TextView textView = this.f13635a;
            textView.setText(sensorEvent.values[0] + "lx");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LightSensorTrigger$b */
    class C5678b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13637a;

        C5678b(Button button) {
            this.f13637a = button;
        }

        public void afterTextChanged(Editable editable) {
            this.f13637a.setEnabled(editable.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LightSensorTrigger$c */
    class C5679c implements Parcelable.Creator<LightSensorTrigger> {
        C5679c() {
        }

        /* renamed from: a */
        public LightSensorTrigger createFromParcel(Parcel parcel) {
            return new LightSensorTrigger(parcel, (C5677a) null);
        }

        /* renamed from: b */
        public LightSensorTrigger[] newArray(int i) {
            return new LightSensorTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LightSensorTrigger$d */
    public static class C5680d implements SensorEventListener {

        /* renamed from: a */
        private final boolean f13639a;

        public C5680d(boolean z) {
            this.f13639a = z;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float f = sensorEvent.values[0];
            if (LightSensorTrigger.s_oldLightLevel != f) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - LightSensorTrigger.s_lastCheckTimestamp >= LightSensorTrigger.MIN_MS_BETWEEN_SCANS) {
                    long unused = LightSensorTrigger.s_lastCheckTimestamp = currentTimeMillis;
                    LightSensorTrigger.m22549v3(f);
                    float unused2 = LightSensorTrigger.s_oldLightLevel = f;
                    if (this.f13639a) {
                        LightSensorTrigger.s_sensorManager.unregisterListener(LightSensorTrigger.s_lightLevelListenerBg);
                    }
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LightSensorTrigger$e */
    private static class C5681e extends BroadcastReceiver {
        private C5681e() {
        }

        public void onReceive(Context context, Intent intent) {
            LightSensorTrigger.s_sensorManager.registerListener(LightSensorTrigger.s_lightLevelListenerBg, LightSensorTrigger.s_sensorManager.getDefaultSensor(5), 500000);
            LightSensorTrigger.m22531A3(context);
        }

        /* synthetic */ C5681e(C5677a aVar) {
            this();
        }
    }

    /* synthetic */ LightSensorTrigger(Parcel parcel, C5677a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static void m22531A3(Context context) {
        int C0 = C5163j2.m19939C0(context) * 60;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (C0 > 0) {
            int i = C0 * 1000;
            IntentFilter intentFilter = new IntentFilter(BG_UPDATE_INTENT);
            if (s_bgCheckReceiver == null) {
                s_bgCheckReceiver = new C5681e((C5677a) null);
                MacroDroidApplication.m14845u().registerReceiver(s_bgCheckReceiver, intentFilter);
            }
            s_pendingIntentBgScan = PendingIntent.getBroadcast(context, 0, new Intent(BG_UPDATE_INTENT), 134217728 | C6368b1.f14959b);
            if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setAndAllowWhileIdle(0, System.currentTimeMillis() + ((long) i), s_pendingIntentBgScan);
            } else {
                alarmManager.set(0, System.currentTimeMillis() + ((long) i), s_pendingIntentBgScan);
            }
        } else {
            PendingIntent pendingIntent = s_pendingIntentBgScan;
            if (pendingIntent != null) {
                alarmManager.cancel(pendingIntent);
                s_pendingIntentBgScan = null;
            }
            if (s_bgCheckReceiver != null) {
                MacroDroidApplication.m14845u().unregisterReceiver(s_bgCheckReceiver);
                s_bgCheckReceiver = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static void m22532B3(boolean z) {
        s_screenOn = z;
        m22533C3();
    }

    /* renamed from: C3 */
    private static void m22533C3() {
        if (s_screenOn) {
            if (s_triggerCounter > 0) {
                if (!s_sensorLive) {
                    SensorManager sensorManager = s_sensorManager;
                    sensorManager.registerListener(s_lightLevelListener, sensorManager.getDefaultSensor(5), 3);
                    s_sensorLive = true;
                }
            } else if (s_sensorLive) {
                s_sensorManager.unregisterListener(s_lightLevelListener);
                s_sensorLive = false;
            }
        } else if (s_sensorLive) {
            s_sensorManager.unregisterListener(s_lightLevelListener);
            s_sensorLive = false;
        }
    }

    /* renamed from: t3 */
    private float m22547t3() {
        int i = this.m_lightLevel;
        return i != -1 ? (float) i : this.m_lightLevelFloat;
    }

    /* renamed from: u3 */
    private int m22548u3() {
        return this.m_option;
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static void m22549v3(float f) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof LightSensorTrigger) {
                    LightSensorTrigger lightSensorTrigger = (LightSensorTrigger) next2;
                    if (lightSensorTrigger.m22548u3() != 0 || f > lightSensorTrigger.m22547t3() || s_oldLightLevel <= lightSensorTrigger.m22547t3()) {
                        if (lightSensorTrigger.m22548u3() == 1 && f >= lightSensorTrigger.m22547t3() && s_oldLightLevel < lightSensorTrigger.m22547t3()) {
                            if (next2.mo31374R2()) {
                                next.setTriggerThatInvoked(next2);
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    } else if (next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m22550w3(CompoundButton compoundButton, boolean z) {
        this.m_option = z ? 1 : 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m22551x3(EditText editText, AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, Activity activity, View view) {
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
    /* renamed from: y3 */
    public static /* synthetic */ void m22552y3(AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, View view) {
        appCompatDialog.dismiss();
        s_sensorManager.unregisterListener(sensorEventListener);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(this.m_option == 0 ? C17541R$string.decreases_to : C17541R$string.increases_to));
        sb.append(" ");
        sb.append(m22547t3());
        sb.append("lx");
        return sb.toString();
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            m22533C3();
            if (s_pendingIntentBgScan != null) {
                ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(s_pendingIntentBgScan);
                s_pendingIntentBgScan = null;
            }
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_screenOnOffTriggerReceiver);
                if (s_updateRateReceiver != null) {
                    mo27827K0().unregisterReceiver(s_updateRateReceiver);
                }
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7549r0.m31417u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffTriggerReceiver, intentFilter);
            s_screenOn = ((PowerManager) mo27827K0().getSystemService("power")).isScreenOn();
            IntentFilter intentFilter2 = new IntentFilter("LightSensorBackgroundScanRateIntent");
            s_updateRateReceiver = new C5681e((C5677a) null);
            mo27827K0().registerReceiver(s_updateRateReceiver, intentFilter2);
            m22531A3(mo27827K0());
        }
        s_triggerCounter++;
        m22533C3();
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
            C5677a aVar = new C5677a((TextView) appCompatDialog.findViewById(C17532R$id.light_level));
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
            editText.addTextChangedListener(new C5678b(button));
            radioButton.setOnCheckedChangeListener(new C6029o4(this));
            button.setOnClickListener(new C6017n4(this, editText, appCompatDialog, aVar, j0));
            button2.setOnClickListener(new C6005m4(appCompatDialog, aVar));
            appCompatDialog.show();
            appCompatDialog.setOnCancelListener(new C5993l4(aVar));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_lightLevel);
        parcel.writeFloat(this.m_lightLevelFloat);
    }

    public LightSensorTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_lightLevel = -1;
        this.m_lightLevelFloat = -1.0f;
    }

    private LightSensorTrigger() {
    }

    private LightSensorTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_lightLevel = parcel.readInt();
        this.m_lightLevelFloat = parcel.readFloat();
    }
}
