package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.CheckCalendarReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p092g1.C7326a;
import p092g1.C7327b;
import p119k3.C7533n;
import p135n1.C7967d;
import p319lc.C15626c;

public class CalendarTrigger extends Trigger {
    public static final Parcelable.Creator<CalendarTrigger> CREATOR = new C5613b();
    private static PendingIntent s_pendingIntent;
    private static int s_triggerCounter;
    private boolean enableRegex;
    private int m_advanceTimeSeconds;
    private int m_availability;
    /* access modifiers changed from: private */
    public String m_calendarId;
    /* access modifiers changed from: private */
    public String m_calendarName;
    private boolean m_checkInAdvance;
    private String m_detailText;
    private boolean m_eventStart;
    private boolean m_ignoreAllDay;
    private boolean m_negativeAdvanceCheck;
    private String m_titleText;

    /* renamed from: com.arlosoft.macrodroid.triggers.CalendarTrigger$a */
    class C5612a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ List f13587a;

        C5612a(List list) {
            this.f13587a = list;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String unused = CalendarTrigger.this.m_calendarId = ((C7327b) this.f13587a.get(i)).f17928a;
            CalendarTrigger calendarTrigger = CalendarTrigger.this;
            String unused2 = calendarTrigger.m_calendarName = ((C7327b) this.f13587a.get(i)).f17930d + " (" + ((C7327b) this.f13587a.get(i)).f17929c + ")";
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.CalendarTrigger$b */
    class C5613b implements Parcelable.Creator<CalendarTrigger> {
        C5613b() {
        }

        /* renamed from: a */
        public CalendarTrigger createFromParcel(Parcel parcel) {
            return new CalendarTrigger(parcel, (C5612a) null);
        }

        /* renamed from: b */
        public CalendarTrigger[] newArray(int i) {
            return new CalendarTrigger[i];
        }
    }

    /* synthetic */ CalendarTrigger(Parcel parcel, C5612a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m21757B3(CompoundButton compoundButton, boolean z) {
        this.m_eventStart = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static /* synthetic */ void m21758C3(View view, CompoundButton compoundButton, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m21759D3(AppCompatDialog appCompatDialog, CheckBox checkBox, EditText editText, EditText editText2, Spinner spinner, CheckBox checkBox2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, View view) {
        appCompatDialog.cancel();
        this.m_ignoreAllDay = checkBox.isChecked();
        this.m_titleText = editText.getText().toString();
        this.m_detailText = editText2.getText().toString();
        this.m_availability = spinner.getSelectedItemPosition();
        this.m_checkInAdvance = checkBox2.isChecked();
        this.m_advanceTimeSeconds = (numberPicker.getValue() * 60) + (numberPicker2.getValue() * 3600) + (numberPicker3.getValue() * 86400);
        this.m_negativeAdvanceCheck = checkBox3.isChecked();
        this.enableRegex = checkBox4.isChecked();
        C5163j2.m20165g6(mo27827K0(), checkBox5.isChecked());
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static /* synthetic */ void m21761F3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m21762G3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), false, false, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public static /* synthetic */ void m21763H3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m21764I3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), false, false, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* renamed from: J3 */
    public static void m21765J3(Context context) {
        Calendar instance = Calendar.getInstance();
        instance.add(12, 5 - (instance.get(12) % 5));
        instance.set(13, 1);
        C4878b.m18864c("Scheduling calendar check at " + instance.get(11) + ":" + instance.get(12) + ":" + instance.get(13));
        if (s_pendingIntent != null) {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (C5163j2.m20241q2(context)) {
                alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(instance.getTimeInMillis(), s_pendingIntent), s_pendingIntent);
            } else if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, instance.getTimeInMillis(), s_pendingIntent);
            } else {
                alarmManager.setExact(0, instance.getTimeInMillis(), s_pendingIntent);
            }
        }
    }

    /* renamed from: q3 */
    private void m21776q3() {
        Pair<String, List<C7327b>> d = C7327b.m30262d(mo27827K0());
        String str = (String) d.first;
        List list = (List) d.second;
        if (list.size() == 0) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), mo27827K0().getString(C17541R$string.action_add_calendar_event_no_calendars), 1).show();
            return;
        }
        if (this.m_calendarId == null) {
            this.m_calendarId = str;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                i = 0;
                break;
            } else if (((C7327b) list.get(i)).f17928a.equals(this.m_calendarId)) {
                break;
            } else {
                i++;
            }
        }
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.calendar_configure);
        appCompatDialog.setTitle((CharSequence) mo27827K0().getString(C17541R$string.constraint_calendar_select_option));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.calendar_configure_title);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.calendar_configure_detail);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.calendar_configure_spinner);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.calendar_configure_in_event);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.calendar_configure_not_in_event);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.enable_regex);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.ignore_all_day);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.calendar_configure_detail_magic_text);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.calendar_configure_title_magic_text);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.use_alarm);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        View findViewById = appCompatDialog.findViewById(C17532R$id.calendar_advance_time_layout);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.calendar_advance_minute_picker);
        CheckBox checkBox4 = (CheckBox) appCompatDialog.findViewById(C17532R$id.check_in_advance);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.calendar_advance_hour_picker);
        View view = findViewById;
        NumberPicker numberPicker3 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.calendar_advance_day_picker);
        CheckBox checkBox5 = (CheckBox) appCompatDialog.findViewById(C17532R$id.check_negative);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.calendar_configure_availability_spinner);
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        spinner2.setSelection(this.m_availability);
        radioButton.setText(C17541R$string.trigger_calendar_event_start);
        radioButton2.setText(C17541R$string.trigger_calendar_event_end);
        checkBox2.setChecked(this.m_ignoreAllDay);
        checkBox3.setChecked(C5163j2.m20241q2(mo27827K0()));
        checkBox.setChecked(this.enableRegex);
        CheckBox checkBox6 = checkBox;
        if (list.size() > 1) {
            spinner.setVisibility(0);
            spinner.setAdapter(new C7326a(j0, list));
            spinner.setSelection(i);
        } else {
            spinner.setVisibility(8);
        }
        radioButton.setChecked(this.m_eventStart);
        radioButton2.setChecked(!this.m_eventStart);
        radioButton.setOnCheckedChangeListener(new C5906e1(this));
        spinner.setOnItemSelectedListener(new C5612a(list));
        String str2 = this.m_titleText;
        if (str2 != null) {
            editText.setText(str2);
            editText.setSelection(editText.length());
        }
        String str3 = this.m_detailText;
        if (str3 != null) {
            editText2.setText(str3);
            editText2.setSelection(editText2.length());
        }
        numberPicker.setMinimum(0);
        numberPicker.setValue((this.m_advanceTimeSeconds / 60) % 60);
        numberPicker2.setMinimum(0);
        numberPicker2.setValue((this.m_advanceTimeSeconds / 3600) % 24);
        NumberPicker numberPicker4 = numberPicker3;
        numberPicker4.setMinimum(0);
        numberPicker4.setValue(this.m_advanceTimeSeconds / 86400);
        CheckBox checkBox7 = checkBox4;
        checkBox7.setOnCheckedChangeListener(new C5894d1(view));
        checkBox7.setChecked(this.m_checkInAdvance);
        CheckBox checkBox8 = checkBox5;
        checkBox8.setChecked(this.m_negativeAdvanceCheck);
        C5882c1 c1Var = r0;
        Spinner spinner3 = spinner2;
        Button button5 = button;
        Button button6 = button2;
        CheckBox checkBox9 = checkBox3;
        NumberPicker numberPicker5 = numberPicker;
        EditText editText3 = editText2;
        NumberPicker numberPicker6 = numberPicker2;
        Activity activity = j0;
        EditText editText4 = editText;
        Button button7 = button5;
        CheckBox checkBox10 = checkBox8;
        C5882c1 c1Var2 = new C5882c1(this, appCompatDialog2, checkBox2, editText, editText2, spinner3, checkBox4, numberPicker5, numberPicker6, numberPicker4, checkBox10, checkBox6, checkBox9);
        button4.setOnClickListener(c1Var);
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button3.setOnClickListener(new C6206z0(appCompatDialog3));
        Activity activity2 = activity;
        button6.setOnClickListener(new C5870b1(this, activity2, new C5918f1(editText4)));
        button7.setOnClickListener(new C5807a1(this, activity2, new C5930g1(editText3)));
        appCompatDialog3.show();
    }

    /* renamed from: A3 */
    public boolean mo30985A3() {
        return this.enableRegex;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(this.m_eventStart ? C17541R$string.trigger_calendar_event_start : C17541R$string.trigger_calendar_event_end);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        String str2;
        if (TextUtils.isEmpty(this.m_calendarId)) {
            return "[" + SelectableItem.m15535j1(C17541R$string.select_calendar) + "]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(mo27827K0().getResources().getStringArray(C17525R$array.availability_options)[this.m_availability]);
        sb.append(")");
        sb.append(" ");
        sb.append(this.m_titleText);
        if (this.m_checkInAdvance) {
            int i = this.m_advanceTimeSeconds;
            int i2 = (i / 60) % 60;
            int i3 = (i / 3600) % 24;
            int i4 = i / 86400;
            if (!(i2 == 0 && i3 == 0 && i4 == 0)) {
                if (this.m_negativeAdvanceCheck) {
                    sb.append(" [-");
                } else {
                    sb.append(" [+");
                }
                String str3 = "";
                if (i4 > 0) {
                    str = i4 + SelectableItem.m15535j1(C17541R$string.days_captial).toLowerCase().substring(0, 1).toLowerCase(Locale.getDefault());
                } else {
                    str = str3;
                }
                sb.append(str);
                if (i3 > 0) {
                    str2 = i3 + SelectableItem.m15535j1(C17541R$string.hours_capital).toLowerCase().substring(0, 1).toLowerCase(Locale.getDefault());
                } else {
                    str2 = str3;
                }
                sb.append(str2);
                if (i2 > 0) {
                    str3 = i2 + SelectableItem.m15535j1(C17541R$string.minutes).substring(0, 1).toLowerCase(Locale.getDefault());
                }
                sb.append(str3);
                sb.append("]");
            }
        }
        return sb.toString();
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(s_pendingIntent);
                s_pendingIntent = null;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7533n.m31346u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        String str = !TextUtils.isEmpty(this.m_titleText) ? this.m_titleText : this.m_detailText;
        if (TextUtils.isEmpty(str)) {
            return mo24738G0();
        }
        return mo24738G0() + " (" + C6413o0.m24693b(str, 20) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_pendingIntent = PendingIntent.getBroadcast(mo27827K0(), 0, new Intent(mo27827K0(), CheckCalendarReceiver.class), 134217728 | C6368b1.f14959b);
            m21765J3(mo27827K0());
        }
        s_triggerCounter++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo(this, "test title", "test detail", "test location", "25/12/2000", "12/25/2000", "04:44", "26/12/2000", "12/26/2000", "05:55");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_CALENDAR"};
    }

    /* renamed from: d0 */
    public void mo25118d0() {
        Pair<String, List<C7327b>> d = C7327b.m30262d(mo27827K0());
        String str = (String) d.first;
        for (C7327b bVar : (List) d.second) {
            if ((bVar.f17930d + " (" + bVar.f17929c + ")").equals(this.m_calendarName)) {
                this.m_calendarId = bVar.f17928a;
                return;
            }
        }
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        String str = !TextUtils.isEmpty(this.m_titleText) ? this.m_titleText : this.m_detailText;
        if (TextUtils.isEmpty(str)) {
            return mo24738G0();
        }
        return mo24738G0() + " (" + C6413o0.m24693b(str, 150) + ")";
    }

    /* renamed from: r3 */
    public int mo30986r3() {
        return this.m_availability;
    }

    /* renamed from: s3 */
    public String mo30987s3() {
        return this.m_calendarId;
    }

    /* renamed from: t3 */
    public String mo30988t3() {
        return this.m_calendarName;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m21776q3();
    }

    /* renamed from: u3 */
    public boolean mo30989u3() {
        return this.m_checkInAdvance;
    }

    /* renamed from: v3 */
    public String mo30990v3() {
        return this.m_detailText;
    }

    /* renamed from: w3 */
    public boolean mo30991w3() {
        return this.m_eventStart;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_calendarId);
        parcel.writeString(this.m_calendarName);
        parcel.writeInt(this.m_eventStart ? 1 : 0);
        parcel.writeString(this.m_titleText);
        parcel.writeString(this.m_detailText);
        parcel.writeInt(this.m_availability);
        parcel.writeInt(this.m_checkInAdvance ? 1 : 0);
        parcel.writeInt(this.m_advanceTimeSeconds);
        parcel.writeInt(this.m_negativeAdvanceCheck ? 1 : 0);
        parcel.writeInt(this.m_ignoreAllDay ? 1 : 0);
        parcel.writeInt(this.enableRegex ? 1 : 0);
    }

    /* renamed from: x3 */
    public boolean mo30992x3() {
        return this.m_ignoreAllDay;
    }

    /* renamed from: y3 */
    public int mo30993y3() {
        if (this.m_negativeAdvanceCheck) {
            return -this.m_advanceTimeSeconds;
        }
        return this.m_advanceTimeSeconds;
    }

    /* renamed from: z3 */
    public String mo30994z3() {
        return this.m_titleText;
    }

    public CalendarTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private CalendarTrigger() {
        this.m_eventStart = true;
    }

    private CalendarTrigger(Parcel parcel) {
        super(parcel);
        this.m_calendarId = parcel.readString();
        this.m_calendarName = parcel.readString();
        boolean z = true;
        this.m_eventStart = parcel.readInt() != 0;
        this.m_titleText = parcel.readString();
        this.m_detailText = parcel.readString();
        this.m_availability = parcel.readInt();
        this.m_checkInAdvance = parcel.readInt() != 0;
        this.m_advanceTimeSeconds = parcel.readInt();
        this.m_negativeAdvanceCheck = parcel.readInt() != 0;
        this.m_ignoreAllDay = parcel.readInt() != 0;
        this.enableRegex = parcel.readInt() == 0 ? false : z;
    }
}
