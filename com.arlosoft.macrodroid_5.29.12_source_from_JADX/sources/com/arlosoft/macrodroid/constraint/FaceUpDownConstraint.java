package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7644t;
import p148q0.C8151a;

public class FaceUpDownConstraint extends Constraint {
    public static final Parcelable.Creator<FaceUpDownConstraint> CREATOR = new C4141c();
    private static final int OPTION_FACE_DOWN = 1;
    private static final int OPTION_FACE_UP = 0;
    private static final int OPTION_SIDEWAYS_LEFT = 4;
    private static final int OPTION_SIDEWAYS_RIGHT = 5;
    private static final int OPTION_VERTICAL_UPRIGHT = 2;
    private static final int OPTION_VERTICAL_UPSIDE_DOWN = 3;

    /* renamed from: f */
    public static String f10716f = "device_facing_constraint_screen_off";
    /* access modifiers changed from: private */
    public static float[] s_accelerometer = new float[3];
    private static int s_constraintCounter = 0;
    private static final Object s_lock = new Object();
    /* access modifiers changed from: private */
    public static float[] s_magnetic = new float[3];
    private static final String[] s_options = {MacroDroidApplication.m14845u().getString(C17541R$string.constraint_face_up_down_option_face_up), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_face_up_down_option_face_down), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_facing_vertical_upright), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_facing_vertical_upside_down), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_facing_vertical_sideways_left), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_facing_vertical_sideways_right)};
    private static boolean s_screenOn;
    private static ScreenOnOffReceiver s_screenOnOffReceiver = new ScreenOnOffReceiver();
    private static final SensorEventListener s_sensorListener = new C4139a();
    private static boolean s_sensorLive = false;
    private static final SensorManager s_sensorManager = ((SensorManager) MacroDroidApplication.m14845u().getSystemService("sensor"));
    private transient boolean m_enabled;
    private int m_option;
    private boolean[] m_selectedOptions;

    public static class ScreenOnOffReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            FaceUpDownConstraint.m16454A3(intent.getAction().equals("android.intent.action.SCREEN_ON"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.FaceUpDownConstraint$a */
    class C4139a implements SensorEventListener {
        C4139a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                System.arraycopy(sensorEvent.values, 0, FaceUpDownConstraint.s_accelerometer, 0, 3);
            } else if (type == 2) {
                System.arraycopy(sensorEvent.values, 0, FaceUpDownConstraint.s_magnetic, 0, 3);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.FaceUpDownConstraint$b */
    class C4140b implements SensorEventListener {

        /* renamed from: a */
        final /* synthetic */ ImageView[] f10717a;

        C4140b(ImageView[] imageViewArr) {
            this.f10717a = imageViewArr;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            FaceUpDownConstraint.this.m16475z3(sensorEvent, this.f10717a, C17530R$drawable.green_tick, C17530R$drawable.red_cross);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.FaceUpDownConstraint$c */
    class C4141c implements Parcelable.Creator<FaceUpDownConstraint> {
        C4141c() {
        }

        /* renamed from: a */
        public FaceUpDownConstraint createFromParcel(Parcel parcel) {
            return new FaceUpDownConstraint(parcel, (C4139a) null);
        }

        /* renamed from: b */
        public FaceUpDownConstraint[] newArray(int i) {
            return new FaceUpDownConstraint[i];
        }
    }

    /* synthetic */ FaceUpDownConstraint(Parcel parcel, C4139a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static void m16454A3(boolean z) {
        synchronized (s_lock) {
            s_screenOn = z;
            m16455B3();
        }
    }

    /* renamed from: B3 */
    public static void m16455B3() {
        synchronized (s_lock) {
            if (!s_screenOn) {
                if (!SelectableItem.m15534i1(MacroDroidApplication.m14845u(), f10716f)) {
                    if (s_sensorLive) {
                        s_sensorManager.unregisterListener(s_sensorListener);
                        s_sensorLive = false;
                    }
                }
            }
            if (s_constraintCounter > 0) {
                if (!s_sensorLive) {
                    SensorManager sensorManager = s_sensorManager;
                    SensorEventListener sensorEventListener = s_sensorListener;
                    sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(1), 3);
                    sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(4), 3);
                    sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(2), 3);
                    s_sensorLive = true;
                }
            } else if (s_sensorLive) {
                s_sensorManager.unregisterListener(s_sensorListener);
                s_sensorLive = false;
            }
        }
    }

    /* renamed from: o3 */
    private boolean[] m16464o3() {
        int i = this.m_option;
        if (i == -1) {
            return this.m_selectedOptions;
        }
        boolean[] zArr = new boolean[s_options.length];
        zArr[i] = true;
        return zArr;
    }

    /* renamed from: p3 */
    private boolean m16465p3(int i) {
        return i > 150;
    }

    /* renamed from: q3 */
    private boolean m16466q3(int i) {
        return i < 30;
    }

    /* renamed from: r3 */
    private boolean m16467r3(float[] fArr) {
        return ((double) fArr[2]) < -0.8d && ((double) fArr[2]) > -2.2d && ((double) fArr[1]) > -0.5d && ((double) fArr[1]) < 0.5d;
    }

    /* renamed from: s3 */
    private boolean m16468s3(float[] fArr) {
        return ((double) fArr[2]) > 0.8d && ((double) fArr[2]) < 2.2d && ((double) fArr[1]) > -0.5d && ((double) fArr[1]) < 0.5d;
    }

    /* renamed from: t3 */
    private boolean m16469t3(float[] fArr) {
        return ((double) fArr[1]) < -1.0d;
    }

    /* renamed from: u3 */
    private boolean m16470u3(float[] fArr) {
        return ((double) fArr[1]) > 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static /* synthetic */ void m16471v3(CheckBox[] checkBoxArr, Button button, CompoundButton compoundButton, boolean z) {
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= checkBoxArr.length) {
                break;
            } else if (checkBoxArr[i].isChecked()) {
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        button.setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m16472w3(CheckBox[] checkBoxArr, AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, CheckBox checkBox, View view) {
        this.m_option = -1;
        for (int i = 0; i < checkBoxArr.length; i++) {
            this.m_selectedOptions[i] = checkBoxArr[i].isChecked();
        }
        appCompatDialog.dismiss();
        mo24689O1();
        s_sensorManager.unregisterListener(sensorEventListener);
        SelectableItem.m15520I2(mo27827K0(), f10716f, checkBox.isChecked());
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static /* synthetic */ void m16473x3(AppCompatDialog appCompatDialog, SensorEventListener sensorEventListener, View view) {
        appCompatDialog.dismiss();
        s_sensorManager.unregisterListener(sensorEventListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public void m16475z3(@NonNull SensorEvent sensorEvent, @NonNull ImageView[] imageViewArr, @DrawableRes int i, @DrawableRes int i2) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            System.arraycopy(sensorEvent.values, 0, s_accelerometer, 0, 3);
        } else if (type == 2) {
            System.arraycopy(sensorEvent.values, 0, s_magnetic, 0, 3);
        }
        float[] fArr = new float[9];
        SensorManager.getRotationMatrix(fArr, new float[9], s_accelerometer, s_magnetic);
        float[] fArr2 = new float[3];
        SensorManager.getOrientation(fArr, fArr2);
        int round = (int) Math.round(Math.toDegrees(Math.acos((double) fArr[8])));
        imageViewArr[0].setImageResource(m16466q3(round) ? i : i2);
        imageViewArr[1].setImageResource(m16465p3(round) ? i : i2);
        imageViewArr[2].setImageResource(m16469t3(fArr2) ? i : i2);
        imageViewArr[3].setImageResource(m16470u3(fArr2) ? i : i2);
        imageViewArr[4].setImageResource(m16467r3(fArr2) ? i : i2);
        ImageView imageView = imageViewArr[5];
        if (!m16468s3(fArr2)) {
            i = i2;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        this.m_selectedOptions = m16464o3();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            boolean[] zArr = this.m_selectedOptions;
            if (i >= zArr.length) {
                break;
            }
            if (zArr[i]) {
                sb.append(s_options[i]);
                sb.append(", ");
            }
            i++;
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        this.m_selectedOptions = m16464o3();
        float[] fArr = new float[9];
        if (!SensorManager.getRotationMatrix(fArr, new float[9], s_accelerometer, s_magnetic)) {
            return true;
        }
        float[] fArr2 = new float[3];
        SensorManager.getOrientation(fArr, fArr2);
        int round = (int) Math.round(Math.toDegrees(Math.acos((double) fArr[8])));
        if (this.m_selectedOptions[0] && m16466q3(round)) {
            return true;
        }
        if (this.m_selectedOptions[1] && m16465p3(round)) {
            return true;
        }
        if (this.m_selectedOptions[2] && m16469t3(fArr2)) {
            return true;
        }
        if (this.m_selectedOptions[3] && m16470u3(fArr2)) {
            return true;
        }
        if (this.m_selectedOptions[4] && m16467r3(fArr2)) {
            return true;
        }
        if (!this.m_selectedOptions[5] || !m16468s3(fArr2)) {
            return false;
        }
        return true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7644t.m31852u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo28052T2() {
        synchronized (s_lock) {
            if (this.m_enabled) {
                this.m_enabled = false;
                s_constraintCounter--;
                m16455B3();
                if (s_constraintCounter == 0) {
                    try {
                        MacroDroidApplication.m14845u().unregisterReceiver(s_screenOnOffReceiver);
                    } catch (Exception e) {
                        C8151a.m33873n(e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
        synchronized (s_lock) {
            if (!this.m_enabled) {
                this.m_enabled = true;
                if (s_constraintCounter == 0) {
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffReceiver, intentFilter);
                    s_screenOn = ((PowerManager) mo27827K0().getSystemService("power")).isScreenOn();
                }
                s_constraintCounter++;
                m16455B3();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        boolean z;
        this.m_selectedOptions = m16464o3();
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_device_facing);
        appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.constraint_face_up_down));
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.screen_off_checkbox);
        checkBox.setChecked(SelectableItem.m15534i1(mo27827K0(), f10716f));
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        CheckBox[] checkBoxArr = {(CheckBox) appCompatDialog.findViewById(C17532R$id.face_up_checkbox), (CheckBox) appCompatDialog.findViewById(C17532R$id.face_down_checkbox), (CheckBox) appCompatDialog.findViewById(C17532R$id.vertical_upright_checkbox), (CheckBox) appCompatDialog.findViewById(C17532R$id.vertical_upside_down_checkbox), (CheckBox) appCompatDialog.findViewById(C17532R$id.sideways_left_checkbox), (CheckBox) appCompatDialog.findViewById(C17532R$id.sideways_right_checkbox)};
        ImageView[] imageViewArr = {(ImageView) appCompatDialog.findViewById(C17532R$id.indicator_face_up), (ImageView) appCompatDialog.findViewById(C17532R$id.indicator_face_down), (ImageView) appCompatDialog.findViewById(C17532R$id.indicator_upright), (ImageView) appCompatDialog.findViewById(C17532R$id.indicator_upside_down), (ImageView) appCompatDialog.findViewById(C17532R$id.indicator_sideways_left), (ImageView) appCompatDialog.findViewById(C17532R$id.indicator_sideways_right)};
        for (int i = 0; i < 6; i++) {
            checkBoxArr[i].setChecked(this.m_selectedOptions[i]);
            checkBoxArr[i].setOnCheckedChangeListener(new C4287m0(checkBoxArr, button));
        }
        C4282l0 l0Var = r0;
        C4140b bVar = new C4140b(imageViewArr);
        C4282l0 l0Var2 = new C4282l0(this, checkBoxArr, appCompatDialog, bVar, checkBox);
        button.setOnClickListener(l0Var);
        SensorManager sensorManager = s_sensorManager;
        C4140b bVar2 = bVar;
        sensorManager.registerListener(bVar2, sensorManager.getDefaultSensor(1), 3);
        sensorManager.registerListener(bVar2, sensorManager.getDefaultSensor(4), 3);
        sensorManager.registerListener(bVar2, sensorManager.getDefaultSensor(2), 3);
        button2.setOnClickListener(new C4277k0(appCompatDialog, bVar2));
        int i2 = 0;
        while (true) {
            if (i2 >= 6) {
                z = false;
                break;
            } else if (checkBoxArr[i2].isChecked()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        button.setEnabled(z);
        appCompatDialog.show();
        appCompatDialog.setOnCancelListener(new C4272j0(bVar2));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeBooleanArray(this.m_selectedOptions);
    }

    public FaceUpDownConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private FaceUpDownConstraint() {
        this.m_option = -1;
        this.m_selectedOptions = new boolean[s_options.length];
    }

    private FaceUpDownConstraint(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        boolean[] zArr = new boolean[s_options.length];
        this.m_selectedOptions = zArr;
        parcel.readBooleanArray(zArr);
    }
}
