package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.C4068u1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.StopWatchTriggerReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2216e;
import p057a2.C2218g;
import p057a2.C2220i;
import p119k3.C7573x1;
import p183w2.C10330a;

public class StopwatchTrigger extends Trigger implements C4068u1, C2220i, C2218g, C2216e {
    public static final Parcelable.Creator<StopwatchTrigger> CREATOR = new C5750c();
    private static int s_alarmCounter = 543850;
    private boolean dontUseAlarm;
    private transient Handler handler;
    private transient int m_alarmId;
    private transient PendingIntent m_pendingIntent;
    private int m_seconds;
    private String m_stopwatchName;
    private String m_variableName;
    private DictionaryKeys varDictionaryKeys;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient String workingVariableName;

    /* renamed from: com.arlosoft.macrodroid.triggers.StopwatchTrigger$a */
    class C5748a implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ Button f13684a;

        /* renamed from: b */
        final /* synthetic */ NumberPicker f13685b;

        /* renamed from: c */
        final /* synthetic */ NumberPicker f13686c;

        /* renamed from: d */
        final /* synthetic */ NumberPicker f13687d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f13688e;

        C5748a(Button button, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, ViewGroup viewGroup) {
            this.f13684a = button;
            this.f13685b = numberPicker;
            this.f13686c = numberPicker2;
            this.f13687d = numberPicker3;
            this.f13688e = viewGroup;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            this.f13684a.setEnabled((this.f13685b.getValue() == 0 && this.f13686c.getValue() == 0 && this.f13687d.getValue() == 0) ? false : true);
            this.f13688e.setVisibility(0);
            String unused = StopwatchTrigger.this.workingVariableName = null;
            DictionaryKeys unused2 = StopwatchTrigger.this.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            this.f13684a.setEnabled(true);
            this.f13688e.setVisibility(8);
            String unused = StopwatchTrigger.this.workingVariableName = macroDroidVariable.getName();
            DictionaryKeys unused2 = StopwatchTrigger.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.StopwatchTrigger$b */
    class C5749b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13690a;

        /* renamed from: c */
        final /* synthetic */ EditText f13691c;

        C5749b(Button button, EditText editText) {
            this.f13690a = button;
            this.f13691c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13690a.setEnabled(this.f13691c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.StopwatchTrigger$c */
    class C5750c implements Parcelable.Creator<StopwatchTrigger> {
        C5750c() {
        }

        /* renamed from: a */
        public StopwatchTrigger createFromParcel(Parcel parcel) {
            return new StopwatchTrigger(parcel, (C5748a) null);
        }

        /* renamed from: b */
        public StopwatchTrigger[] newArray(int i) {
            return new StopwatchTrigger[i];
        }
    }

    /* synthetic */ StopwatchTrigger(Parcel parcel, C5748a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static /* synthetic */ void m23222A3(Button button, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        if (button != null) {
            button.setEnabled((numberPicker.getValue() == 0 && numberPicker2.getValue() == 0 && numberPicker3.getValue() == 0) ? false : true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m23223B3(String str, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        this.m_variableName = this.workingVariableName;
        this.varDictionaryKeys = this.workingDictionaryKeys;
        this.m_stopwatchName = str;
        this.m_seconds = numberPicker.getValue() + (numberPicker2.getValue() * 60) + (numberPicker3.getValue() * 3600);
        this.dontUseAlarm = !checkBox.isChecked();
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m23225D3(Intent intent, PowerManager.WakeLock wakeLock) {
        try {
            mo27827K0().sendBroadcast(intent);
        } finally {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        }
    }

    /* renamed from: F3 */
    private void m23226F3() {
        MacroDroidBaseActivity macroDroidBaseActivity = (MacroDroidBaseActivity) mo27850j0();
        if (!macroDroidBaseActivity.mo27315N1()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(macroDroidBaseActivity, C17542R$style.Theme_App_Dialog_Variables);
            builder.setTitle((int) C17541R$string.error);
            builder.setMessage((int) C17541R$string.action_stop_watch_already_exists);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C6008m7.f14195a);
            builder.show();
        }
    }

    /* renamed from: H3 */
    private void m23227H3(long j, Intent intent) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo27827K0().getSystemService("power")).newWakeLock(1, "macrodroid:waitForTime");
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(500 + j);
        this.handler.postDelayed(new C6089s7(this, intent, newWakeLock), j);
    }

    /* renamed from: r3 */
    private void m23238r3(MacroDroidVariable macroDroidVariable) {
        if (macroDroidVariable.getName().equals(this.m_variableName)) {
            mo31506E3();
        }
    }

    /* renamed from: t3 */
    private void m23239t3(@NonNull List<String> list) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_new_stopwatch);
        appCompatDialog.setTitle((int) C17541R$string.action_stop_watch_create_new);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(2131363335);
        editText.addTextChangedListener(new C5749b(button, editText));
        button.setOnClickListener(new C6044p7(this, editText, list, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C6020n7(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: u3 */
    private void m23240u3() {
        List<String> e = C10330a.m40553e(mo27827K0());
        String[] strArr = new String[(e.size() + 1)];
        int i = 0;
        strArr[0] = "<" + SelectableItem.m15535j1(C17541R$string.action_stop_watch_create_new) + ">";
        for (int i2 = 1; i2 < e.size() + 1; i2++) {
            strArr[i2] = e.get(i2 - 1);
            String str = this.m_stopwatchName;
            if (str != null && str.equals(strArr[i2])) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) null);
        builder.setTitle((CharSequence) mo24772h1());
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5996l7(this, e));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m23241w3(EditText editText, List list, AppCompatDialog appCompatDialog, View view) {
        String obj = editText.getText().toString();
        if (list.contains(obj)) {
            m23226F3();
            return;
        }
        list.add(obj);
        C10330a.m40557i(mo27827K0(), list);
        appCompatDialog.dismiss();
        mo31507G3(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m23243y3(List list, DialogInterface dialogInterface, int i) {
        ListView listView = ((AlertDialog) dialogInterface).getListView();
        int checkedItemPosition = listView.getCheckedItemPosition();
        if (checkedItemPosition == 0) {
            m23239t3(list);
        } else {
            mo31507G3((String) listView.getAdapter().getItem(checkedItemPosition));
        }
    }

    /* renamed from: E3 */
    public void mo31506E3() {
        int i;
        mo31508q3();
        if (C10330a.m40554f(mo27827K0(), this.m_stopwatchName)) {
            long d = C10330a.m40552d(mo27827K0(), this.m_stopwatchName);
            String str = this.m_variableName;
            if (str != null) {
                MacroDroidVariable q = mo27861q(str);
                if (q == null) {
                    C4878b.m18869h("Can't schedule stopwatch trigger: " + this.m_variableName + " does not exist", mo27840Y0().longValue());
                    return;
                }
                Long C = q.mo27732C(this.varDictionaryKeys);
                if (C != null) {
                    i = C.intValue();
                } else {
                    C4878b.m18869h("Can't schedule stopwatch trigger: " + this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys) + " does not exist", mo27840Y0().longValue());
                    return;
                }
            } else {
                i = this.m_seconds;
            }
            long j = ((long) i) * 1000;
            if (d < j) {
                long j2 = j - d;
                Intent intent = new Intent(mo27827K0(), StopWatchTriggerReceiver.class);
                intent.putExtra("alarmId", this.m_alarmId);
                long j3 = j2 / 1000;
                if (j3 <= 5) {
                    m23227H3(j2, intent);
                    return;
                }
                this.m_pendingIntent = PendingIntent.getBroadcast(mo27827K0(), this.m_alarmId, intent, 134217728 | C6368b1.f14959b);
                AlarmManager alarmManager = (AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM);
                if (!this.dontUseAlarm) {
                    alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(System.currentTimeMillis() + j2, this.m_pendingIntent), this.m_pendingIntent);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + j2, this.m_pendingIntent);
                } else {
                    alarmManager.setExact(0, System.currentTimeMillis() + j2, this.m_pendingIntent);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Scheduling alarm (");
                sb.append(this.m_alarmId);
                sb.append(") for: ");
                sb.append(j3);
                sb.append("s");
                if (mo27837X0() != null) {
                    C4878b.m18880s("[" + mo27837X0().getName() + " - " + this.m_stopwatchName + "] - StopWatch alarm (" + this.m_alarmId + ") scheduled for " + j3 + "s", mo27840Y0().longValue());
                }
            }
        }
    }

    /* renamed from: G */
    public String mo24430G() {
        return this.m_stopwatchName;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G3 */
    public void mo31507G3(String str) {
        String str2;
        NumberPicker numberPicker;
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_stopwatch_constraint);
        appCompatDialog.setTitle((int) C17541R$string.trigger_at);
        this.workingVariableName = this.m_variableName;
        this.workingDictionaryKeys = this.varDictionaryKeys;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.second_picker);
        NumberPicker numberPicker3 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.minute_picker);
        NumberPicker numberPicker4 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.hour_picker);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(2131363838);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.time_layout);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.force_alarm_checkbox);
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.constraint_options)).setVisibility(8);
        numberPicker2.setMaximum(59);
        numberPicker2.setMinimum(0);
        numberPicker3.setMaximum(59);
        numberPicker3.setMinimum(0);
        numberPicker4.setMinimum(0);
        checkBox.setVisibility(0);
        checkBox.setChecked(!this.dontUseAlarm);
        ((TextView) appCompatDialog.findViewById(C17532R$id.force_alarm_description)).setVisibility(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectableItem.m15535j1(C17541R$string.use_slider_value));
        Activity j0 = mo27850j0();
        Macro X0 = mo27837X0();
        if (this.workingVariableName != null) {
            str2 = this.workingVariableName + C6520o0.m24912e0(this.workingDictionaryKeys);
        } else {
            str2 = null;
        }
        Button button3 = button2;
        CheckBox checkBox2 = checkBox;
        ViewGroup viewGroup2 = viewGroup;
        NumberPicker numberPicker5 = numberPicker4;
        C6520o0.m24879I(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, arrayList, str2, " (" + SelectableItem.m15535j1(C17541R$string.seconds_one_char) + ")", false, new C5748a(button, numberPicker3, numberPicker4, numberPicker2, viewGroup));
        if (this.workingVariableName == null) {
            viewGroup2.setVisibility(0);
        } else {
            viewGroup2.setVisibility(8);
        }
        numberPicker2.setValue(this.m_seconds % 60);
        int i = this.m_seconds;
        if (i > 59) {
            numberPicker3.setValue((i / 60) % 60);
        }
        int i2 = this.m_seconds;
        if (i2 > 3599) {
            numberPicker = numberPicker5;
            numberPicker.setValue(i2 / 3600);
        } else {
            numberPicker = numberPicker5;
        }
        C6068r7 r7Var = new C6068r7(button, numberPicker3, numberPicker, numberPicker2);
        numberPicker2.setListener(r7Var);
        numberPicker3.setListener(r7Var);
        numberPicker.setListener(r7Var);
        button.setEnabled((this.m_seconds == 0 && this.m_variableName == null) ? false : true);
        button.setOnClickListener(new C6056q7(this, str, numberPicker2, numberPicker3, numberPicker, checkBox2, appCompatDialog));
        button3.setOnClickListener(new C6032o7(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return C10330a.m40553e(mo27827K0()).contains(this.m_stopwatchName);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        if (this.m_variableName == null) {
            int i = this.m_seconds;
            if (i >= 3600) {
                str = (this.m_seconds / 3600) + SelectableItem.m15535j1(C17541R$string.hour_one_char) + " " + ((this.m_seconds / 60) % 60) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + (this.m_seconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
            } else if (i >= 60) {
                str = ((this.m_seconds / 60) % 60) + SelectableItem.m15535j1(C17541R$string.minute_one_char) + " " + (this.m_seconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
            } else {
                str = (this.m_seconds % 60) + SelectableItem.m15535j1(C17541R$string.second_one_char);
            }
        } else {
            str = this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys);
        }
        return this.m_stopwatchName + ": " + str;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        mo31508q3();
        String str = this.m_variableName;
        if (str != null && mo27861q(str) != null) {
            C4064u.m16048t().mo27975J(this);
            this.m_macro.removeLocalVariableUpdatedListener(this);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7573x1.m31528u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24672O0();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        int i = s_alarmCounter;
        s_alarmCounter = i + 1;
        this.m_alarmId = i;
        mo31506E3();
        String str = this.m_variableName;
        if (str != null && mo27861q(str) != null) {
            C4064u.m16048t().mo27982e(this);
            this.m_macro.addLocalVariableUpdatedListener(this);
        }
    }

    /* renamed from: V */
    public void mo25810V() {
        List<String> e = C10330a.m40553e(mo27827K0());
        if (!e.contains(this.m_stopwatchName)) {
            e.add(this.m_stopwatchName);
            C10330a.m40557i(mo27827K0(), e);
        }
    }

    @Nullable
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.m_variableName = str;
    }

    /* renamed from: k */
    public void mo24427k(@Nullable DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.m_variableName;
    }

    /* renamed from: q3 */
    public void mo31508q3() {
        this.handler.removeCallbacksAndMessages((Object) null);
        if (this.m_pendingIntent != null) {
            ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.m_pendingIntent);
            this.m_pendingIntent = null;
            if (mo27837X0() != null) {
                C4878b.m18880s("[" + mo27837X0().getName() + " - " + this.m_stopwatchName + "] - Cancelling alarm (" + this.m_alarmId + ")", mo27840Y0().longValue());
            }
        }
    }

    /* renamed from: s3 */
    public void mo31509s3() {
        this.m_pendingIntent = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m23240u3();
    }

    /* renamed from: v */
    public void mo27212v(@NonNull MacroDroidVariable macroDroidVariable, @NonNull VariableValue variableValue, @NonNull VariableValue variableValue2, long j) {
        m23238r3(macroDroidVariable);
    }

    /* renamed from: v3 */
    public int mo31510v3() {
        return this.m_alarmId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_seconds);
        parcel.writeString(this.m_stopwatchName);
        parcel.writeString(this.m_variableName);
        parcel.writeInt(this.dontUseAlarm ? 1 : 0);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    /* renamed from: x */
    public void mo24431x(String str) {
        this.m_stopwatchName = str;
    }

    public StopwatchTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public StopwatchTrigger() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    private StopwatchTrigger(Parcel parcel) {
        super(parcel);
        this.handler = new Handler(Looper.getMainLooper());
        this.m_seconds = parcel.readInt();
        this.m_stopwatchName = parcel.readString();
        this.m_variableName = parcel.readString();
        this.dontUseAlarm = parcel.readInt() != 0;
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
