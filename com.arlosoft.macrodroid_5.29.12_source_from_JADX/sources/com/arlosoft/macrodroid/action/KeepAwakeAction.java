package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.receivers.KeepAwakeActionFinishedHandler;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6368b1;
import p128m0.C7831r1;

public class KeepAwakeAction extends Action {
    public static final Parcelable.Creator<KeepAwakeAction> CREATOR = new C2508b();
    private static final int SCREEN_DIM = 1;
    private static final int SCREEN_OFF = 2;
    private static final int SCREEN_ON = 0;
    private static int s_idCounter;
    private static PowerManager.WakeLock s_wakelock;
    private boolean m_enabled;
    private boolean m_permanent;
    private int m_screenOption;
    private int m_secondsToStayAwakeFor;

    /* renamed from: com.arlosoft.macrodroid.action.KeepAwakeAction$a */
    class C2507a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ NumberPicker f7324a;

        /* renamed from: c */
        final /* synthetic */ NumberPicker f7325c;

        /* renamed from: d */
        final /* synthetic */ NumberPicker f7326d;

        /* renamed from: f */
        final /* synthetic */ Button f7327f;

        /* renamed from: g */
        final /* synthetic */ Spinner f7328g;

        C2507a(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Button button, Spinner spinner) {
            this.f7324a = numberPicker;
            this.f7325c = numberPicker2;
            this.f7326d = numberPicker3;
            this.f7327f = button;
            this.f7328g = spinner;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            boolean z = false;
            this.f7324a.setEnabled(i == 1);
            this.f7325c.setEnabled(i == 1);
            this.f7326d.setEnabled(i == 1);
            Button button = this.f7327f;
            if (button != null) {
                if (!(this.f7328g.getSelectedItemPosition() != 0 && this.f7325c.getValue() == 0 && this.f7324a.getValue() == 0 && this.f7326d.getValue() == 0)) {
                    z = true;
                }
                button.setEnabled(z);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.KeepAwakeAction$b */
    class C2508b implements Parcelable.Creator<KeepAwakeAction> {
        C2508b() {
        }

        /* renamed from: a */
        public KeepAwakeAction createFromParcel(Parcel parcel) {
            return new KeepAwakeAction(parcel, (C2507a) null);
        }

        /* renamed from: b */
        public KeepAwakeAction[] newArray(int i) {
            return new KeepAwakeAction[i];
        }
    }

    /* synthetic */ KeepAwakeAction(Parcel parcel, C2507a aVar) {
        this(parcel);
    }

    /* renamed from: n3 */
    private void m11130n3() {
        Button button;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.keep_awake_options);
        appCompatDialog.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_keep_awake_keep_awake));
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.keep_awake_options_screen_setting);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.keep_awake_options_time_setting);
        int i = this.m_secondsToStayAwakeFor;
        NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.keep_awake_options_hour_picker);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.keep_awake_options_minute_picker);
        NumberPicker numberPicker3 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.keep_awake_options_second_picker);
        numberPicker.setMinimum(0);
        numberPicker2.setMinimum(0);
        numberPicker3.setMinimum(0);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        C3276n7 n7Var = r2;
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        NumberPicker numberPicker4 = numberPicker3;
        NumberPicker numberPicker5 = numberPicker2;
        Button button4 = button2;
        NumberPicker numberPicker6 = numberPicker;
        C3276n7 n7Var2 = new C3276n7(button2, spinner2, numberPicker2, numberPicker, numberPicker4);
        numberPicker6.setValue(i / 3600);
        numberPicker6.setListener(n7Var);
        numberPicker5.setValue((i / 60) % 60);
        numberPicker5.setListener(n7Var);
        NumberPicker numberPicker7 = numberPicker4;
        numberPicker7.setValue(i % 60);
        numberPicker7.setListener(n7Var);
        numberPicker6.setEnabled(false);
        numberPicker5.setEnabled(false);
        numberPicker7.setEnabled(false);
        ArrayAdapter arrayAdapter = new ArrayAdapter(j0, 17367048, m11132p3());
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(this.m_screenOption);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(j0, 17367048, m11133q3());
        arrayAdapter2.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter2);
        boolean z = true;
        spinner2.setSelection(this.m_permanent ^ true ? 1 : 0);
        if (!this.m_permanent && numberPicker7.getValue() == 0 && numberPicker5.getValue() == 0 && numberPicker6.getValue() == 0) {
            button = button4;
            z = false;
        } else {
            button = button4;
        }
        button.setEnabled(z);
        NumberPicker numberPicker8 = numberPicker5;
        Spinner spinner3 = spinner2;
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button.setOnClickListener(new C3248m7(this, numberPicker7, numberPicker8, numberPicker6, spinner, spinner3, appCompatDialog3));
        button3.setOnClickListener(new C3220l7(appCompatDialog3));
        spinner2.setOnItemSelectedListener(new C2507a(numberPicker6, numberPicker8, numberPicker7, button, spinner3));
        appCompatDialog3.show();
    }

    /* renamed from: o3 */
    private String[] m11131o3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_keep_awake_enable), MacroDroidApplication.m14845u().getString(C17541R$string.action_keep_awake_disable)};
    }

    /* renamed from: p3 */
    private String[] m11132p3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_keep_awake_screen_on), MacroDroidApplication.m14845u().getString(C17541R$string.action_keep_awake_screen_dim), MacroDroidApplication.m14845u().getString(C17541R$string.action_keep_awake_screen_off)};
    }

    /* renamed from: q3 */
    private String[] m11133q3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_keep_awake_until_disabled), MacroDroidApplication.m14845u().getString(C17541R$string.action_keep_awake_fixed_time)};
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static /* synthetic */ void m11134r3(Button button, Spinner spinner, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        if (button != null) {
            button.setEnabled((spinner.getSelectedItemPosition() != 0 && numberPicker.getValue() == 0 && numberPicker2.getValue() == 0 && numberPicker3.getValue() == 0) ? false : true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m11135s3(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Spinner spinner, Spinner spinner2, AppCompatDialog appCompatDialog, View view) {
        this.m_secondsToStayAwakeFor = numberPicker.getValue() + (numberPicker2.getValue() * 60) + (numberPicker3.getValue() * 60 * 60);
        this.m_screenOption = spinner.getSelectedItemPosition();
        this.m_permanent = spinner2.getSelectedItemPosition() == 0;
        mo24689O1();
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m11137u3(DialogInterface dialogInterface, int i) {
        m11130n3();
    }

    /* renamed from: v3 */
    private void m11138v3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0());
        builder.setTitle((int) C17541R$string.action_keep_awake).setMessage((int) C17541R$string.action_keep_awake_not_work_on_all_devices_warning).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3192k7(this));
        builder.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_enabled) {
            return mo25559a1();
        }
        return m11131o3()[1];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (!this.m_enabled) {
            return "";
        }
        String str = m11132p3()[this.m_screenOption] + " - ";
        if (this.m_permanent) {
            return str + SelectableItem.m15535j1(C17541R$string.action_keep_awake_until_disabled);
        }
        int i = this.m_secondsToStayAwakeFor;
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        if (i2 > 0) {
            return str + String.format("%01d", new Object[]{Integer.valueOf(i2)}) + SelectableItem.m15535j1(C17541R$string.hour_one_char) + " " + String.format("%02d", new Object[]{Integer.valueOf(i3)}) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + String.format("%02d", new Object[]{Integer.valueOf(i4)}) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        } else if (i3 > 0) {
            return str + String.format("%02d", new Object[]{Integer.valueOf(i3)}) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + String.format("%02d", new Object[]{Integer.valueOf(i4)}) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        } else {
            return str + String.format("%02d", new Object[]{Integer.valueOf(i4)}) + SelectableItem.m15535j1(C17541R$string.second_one_char);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7831r1.m32737u();
    }

    /* renamed from: a3 */
    public synchronized void mo24675a3(TriggerContextInfo triggerContextInfo) {
        PowerManager.WakeLock wakeLock = s_wakelock;
        if (wakeLock != null && wakeLock.isHeld()) {
            s_wakelock.release();
        }
        if (this.m_enabled) {
            PowerManager powerManager = (PowerManager) mo27827K0().getSystemService("power");
            int i = this.m_screenOption;
            int i2 = 1;
            if (i == 0) {
                i2 = 10;
            } else if (i == 1) {
                i2 = 6;
            } else if (i != 2) {
                i2 = 0;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435456 | i2, "macrodroid:keepawakeaction");
            s_wakelock = newWakeLock;
            newWakeLock.acquire();
            if (!this.m_permanent) {
                int i3 = s_idCounter;
                s_idCounter = i3 + 1;
                KeepAwakeActionFinishedHandler.m14299a(i3, s_wakelock);
                Intent intent = new Intent(mo27827K0(), KeepAwakeActionFinishedHandler.class);
                intent.putExtra("WakeLockId", i3);
                ((AlarmManager) MacroDroidApplication.m14845u().getSystemService(NotificationCompat.CATEGORY_ALARM)).set(0, System.currentTimeMillis() + ((long) (this.m_secondsToStayAwakeFor * 1000)), PendingIntent.getBroadcast(mo27827K0(), 0, intent, 1073741824 | C6368b1.f14959b));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11131o3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (!this.m_enabled) {
            mo24689O1();
        } else {
            m11138v3();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_secondsToStayAwakeFor);
        parcel.writeInt(this.m_screenOption);
        parcel.writeInt(this.m_enabled ^ true ? 1 : 0);
        parcel.writeInt(this.m_permanent ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_enabled = i == 0;
    }

    public KeepAwakeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private KeepAwakeAction() {
        this.m_enabled = true;
        this.m_permanent = true;
    }

    private KeepAwakeAction(Parcel parcel) {
        super(parcel);
        this.m_secondsToStayAwakeFor = parcel.readInt();
        this.m_screenOption = parcel.readInt();
        boolean z = true;
        this.m_enabled = parcel.readInt() == 0;
        this.m_permanent = parcel.readInt() != 0 ? false : z;
    }
}
