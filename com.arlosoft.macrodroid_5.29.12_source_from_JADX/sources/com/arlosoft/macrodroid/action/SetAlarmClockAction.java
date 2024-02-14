package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import p057a2.C2216e;
import p057a2.C2219h;
import p128m0.C7733e3;
import p319lc.C15626c;

public class SetAlarmClockAction extends Action implements C2219h, C2216e {
    public static final Parcelable.Creator<SetAlarmClockAction> CREATOR = new C2624c();
    private static final int OPTION_CLEAR_ALARM = 1;
    private static final int OPTION_DISMISS_ACTIVE_ALARM = 2;
    private static final int OPTION_SET_ALARM = 0;
    private static List<String> s_dayOptions;
    private int m_dayOption;
    private final boolean[] m_daysOfWeek;
    private int m_delayInHours;
    private int m_delayInMinutes;
    private int m_hour;
    private String m_label;
    private int m_minute;
    private boolean m_oneOff;
    private int m_option;
    private boolean m_relative;
    private MacroDroidVariable m_variable;
    private DictionaryKeys varDictionaryKeys;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient MacroDroidVariable workingVariable;

    /* renamed from: com.arlosoft.macrodroid.action.SetAlarmClockAction$a */
    class C2622a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7498a;

        /* renamed from: c */
        final /* synthetic */ EditText f7499c;

        C2622a(Button button, EditText editText) {
            this.f7498a = button;
            this.f7499c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7498a.setEnabled(this.f7499c.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetAlarmClockAction$b */
    class C2623b implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7501a;

        C2623b(ViewGroup viewGroup) {
            this.f7501a = viewGroup;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            this.f7501a.setVisibility(0);
            MacroDroidVariable unused = SetAlarmClockAction.this.workingVariable = null;
            DictionaryKeys unused2 = SetAlarmClockAction.this.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            this.f7501a.setVisibility(8);
            MacroDroidVariable unused = SetAlarmClockAction.this.workingVariable = macroDroidVariable;
            DictionaryKeys unused2 = SetAlarmClockAction.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetAlarmClockAction$c */
    class C2624c implements Parcelable.Creator<SetAlarmClockAction> {
        C2624c() {
        }

        /* renamed from: a */
        public SetAlarmClockAction createFromParcel(Parcel parcel) {
            return new SetAlarmClockAction(parcel, (C2622a) null);
        }

        /* renamed from: b */
        public SetAlarmClockAction[] newArray(int i) {
            return new SetAlarmClockAction[i];
        }
    }

    /* synthetic */ SetAlarmClockAction(Parcel parcel, C2622a aVar) {
        this(parcel);
    }

    /* renamed from: A3 */
    private String[] m12244A3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_alarm_clock_set_alarm), SelectableItem.m15535j1(C17541R$string.action_alarm_clock_disable_alarm), SelectableItem.m15535j1(C17541R$string.action_alarm_clock_dismiss_active_alarm)};
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static /* synthetic */ void m12245B3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m12246C3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m12247D3(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_label = editText.getText().toString();
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m12250G3(Button button, RadioButton radioButton, CheckBox[] checkBoxArr, CompoundButton compoundButton, boolean z) {
        button.setEnabled(m12257N3(radioButton.isChecked(), checkBoxArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m12251H3(ViewFlipper viewFlipper, Button button, CheckBox[] checkBoxArr, CompoundButton compoundButton, boolean z) {
        viewFlipper.setDisplayedChild(z ^ true ? 1 : 0);
        button.setEnabled(m12257N3(!z, checkBoxArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public static /* synthetic */ void m12253J3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public /* synthetic */ void m12254K3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void m12255L3(RadioButton radioButton, CheckBox[] checkBoxArr, TimePicker timePicker, TimePicker timePicker2, EditText editText, RadioButton radioButton2, NumberPicker numberPicker, NumberPicker numberPicker2, Spinner spinner, AppCompatDialog appCompatDialog, View view) {
        this.m_oneOff = radioButton.isChecked();
        for (int i = 0; i < checkBoxArr.length; i++) {
            this.m_daysOfWeek[i] = checkBoxArr[i].isChecked();
        }
        if (this.m_oneOff) {
            this.m_hour = timePicker.getCurrentHour().intValue();
            this.m_minute = timePicker.getCurrentMinute().intValue();
        } else {
            this.m_hour = timePicker2.getCurrentHour().intValue();
            this.m_minute = timePicker2.getCurrentMinute().intValue();
        }
        this.m_label = editText.getText().toString();
        this.m_relative = radioButton2.isChecked();
        this.m_delayInMinutes = numberPicker.getValue();
        this.m_delayInHours = numberPicker2.getValue();
        this.m_variable = this.workingVariable;
        this.varDictionaryKeys = this.workingDictionaryKeys;
        this.m_dayOption = spinner.getSelectedItemPosition();
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void m12256M3(Activity activity, DialogInterface dialogInterface, int i) {
        C5163j2.m19983H5(activity, true);
        super.mo24689O1();
    }

    /* renamed from: N3 */
    private boolean m12257N3(boolean z, CheckBox[] checkBoxArr) {
        if (!z) {
            return true;
        }
        for (CheckBox isChecked : checkBoxArr) {
            if (isChecked.isChecked()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x3 */
    private void m12272x3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_disable_alarm);
        appCompatDialog.setTitle((int) C17541R$string.action_alarm_clock_disable_alarm);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_dismiss_alarm_label);
        editText.setText(this.m_label);
        ((Button) appCompatDialog.findViewById(C17532R$id.magic_text_button)).setOnClickListener(new C3653zf(this, j0, new C3544vf(editText)));
        editText.addTextChangedListener(new C2622a(button, editText));
        button.setEnabled(this.m_label.length() > 0);
        button.setOnClickListener(new C2919ag(this, editText, appCompatDialog));
        button2.setOnClickListener(new C3572wf(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: y3 */
    private void m12273y3() {
        String str;
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_set_alarm);
            appCompatDialog.setTitle((int) C17541R$string.action_alarm_clock_set_alarm);
            this.workingVariable = this.m_variable;
            this.workingDictionaryKeys = this.varDictionaryKeys;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_one_off);
            RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_repeated);
            ViewFlipper viewFlipper = (ViewFlipper) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_view_flipper);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_label);
            RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_relative);
            RadioButton radioButton4 = (RadioButton) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_fixed);
            ViewFlipper viewFlipper2 = (ViewFlipper) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_view_flipper_one_off);
            NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_minute_picker);
            NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_hour_picker);
            Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_variable_spinner);
            ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_relative_value_layout);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_variable_spinner_day);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.magic_text_button);
            editText.setText(this.m_label);
            radioButton.setChecked(this.m_oneOff);
            radioButton2.setChecked(!this.m_oneOff);
            viewFlipper.setDisplayedChild(this.m_oneOff ^ true ? 1 : 0);
            numberPicker.setMinimum(0);
            numberPicker2.setMinimum(0);
            numberPicker.setValue(this.m_delayInMinutes);
            numberPicker2.setValue(this.m_delayInHours);
            NumberPicker numberPicker3 = numberPicker2;
            int[] iArr = {C17532R$id.checkBoxMonday, C17532R$id.checkBoxTuesday, C17532R$id.checkBoxWednesday, C17532R$id.checkBoxThursday, C17532R$id.checkBoxFriday, C17532R$id.checkBoxSaturday, C17532R$id.checkBoxSunday};
            EditText editText2 = editText;
            CheckBox[] checkBoxArr = new CheckBox[7];
            NumberPicker numberPicker4 = numberPicker;
            int i = 0;
            for (int i2 = 7; i < i2; i2 = 7) {
                checkBoxArr[i] = (CheckBox) appCompatDialog.findViewById(iArr[i]);
                checkBoxArr[i].setChecked(this.m_daysOfWeek[i]);
                checkBoxArr[i].setOnCheckedChangeListener(new C3004dg(this, button, radioButton2, checkBoxArr));
                i++;
                iArr = iArr;
            }
            radioButton.setOnCheckedChangeListener(new C3032eg(this, viewFlipper, button, checkBoxArr));
            radioButton3.setChecked(this.m_relative);
            radioButton4.setChecked(!this.m_relative);
            viewFlipper2.setDisplayedChild(this.m_relative ^ true ? 1 : 0);
            radioButton3.setOnCheckedChangeListener(new C2975cg(viewFlipper2));
            TimePicker timePicker = (TimePicker) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_timePicker);
            Boolean bool = Boolean.TRUE;
            timePicker.setIs24HourView(bool);
            TimePicker timePicker2 = (TimePicker) appCompatDialog.findViewById(C17532R$id.dialog_set_alarm_one_off_timePicker);
            timePicker2.setIs24HourView(bool);
            timePicker.setCurrentHour(Integer.valueOf(this.m_hour));
            timePicker.setCurrentMinute(Integer.valueOf(this.m_minute));
            timePicker2.setCurrentHour(Integer.valueOf(this.m_hour));
            timePicker2.setCurrentMinute(Integer.valueOf(this.m_minute));
            ArrayList arrayList = new ArrayList();
            arrayList.add(SelectableItem.m15535j1(C17541R$string.define_value));
            String str2 = " (" + SelectableItem.m15535j1(C17541R$string.minutes) + ")";
            Activity j02 = mo27850j0();
            Macro X0 = mo27837X0();
            if (this.m_variable != null) {
                str = this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys);
            } else {
                str = null;
            }
            C2623b bVar = new C2623b(viewGroup);
            ViewGroup viewGroup2 = viewGroup;
            Macro macro = X0;
            TimePicker timePicker3 = timePicker2;
            RadioButton radioButton5 = radioButton3;
            CheckBox[] checkBoxArr2 = checkBoxArr;
            EditText editText3 = editText2;
            RadioButton radioButton6 = radioButton2;
            C6520o0.m24879I(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner, macro, arrayList, str, str2, false, bVar);
            if (this.workingVariable == null) {
                viewGroup2.setVisibility(0);
            } else {
                viewGroup2.setVisibility(8);
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(j0, C17535R$layout.simple_spinner_item, m12274z3());
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            Spinner spinner3 = spinner2;
            spinner3.setAdapter(arrayAdapter);
            spinner3.setSelection(this.m_dayOption);
            EditText editText4 = editText3;
            button3.setOnClickListener(new C3626yf(this, j0, new C3517uf(editText4)));
            CheckBox[] checkBoxArr3 = checkBoxArr2;
            button.setEnabled(m12257N3(radioButton6.isChecked(), checkBoxArr3));
            C2947bg bgVar = r0;
            C2947bg bgVar2 = new C2947bg(this, radioButton, checkBoxArr3, timePicker3, timePicker, editText4, radioButton5, numberPicker4, numberPicker3, spinner3, appCompatDialog);
            button.setOnClickListener(bgVar);
            button2.setOnClickListener(new C3599xf(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: z3 */
    private static List<String> m12274z3() {
        if (s_dayOptions == null) {
            ArrayList arrayList = new ArrayList();
            s_dayOptions = arrayList;
            arrayList.add(SelectableItem.m15535j1(C17541R$string.today) + "/" + SelectableItem.m15535j1(C17541R$string.tomorrow));
            s_dayOptions.addAll(Arrays.asList(DateFormatSymbols.getInstance().getWeekdays()));
            s_dayOptions.remove("");
        }
        return s_dayOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12244A3()[this.m_option];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        boolean z;
        int i = this.m_option;
        String str = "";
        if (i == 2) {
            return str;
        }
        if (i == 1) {
            return this.m_label;
        }
        if (!this.m_oneOff) {
            int i2 = 6;
            String[] strArr = {SelectableItem.m15535j1(C17541R$string.monday3), SelectableItem.m15535j1(C17541R$string.tuesday3), SelectableItem.m15535j1(C17541R$string.wednesday3), SelectableItem.m15535j1(C17541R$string.thursday3), SelectableItem.m15535j1(C17541R$string.friday3), SelectableItem.m15535j1(C17541R$string.saturday3), SelectableItem.m15535j1(C17541R$string.sunday3)};
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.m_label)) {
                str = "[" + this.m_label + "] ";
            }
            sb.append(str);
            sb.append(SelectableItem.m15535j1(C17541R$string.repeated));
            sb.append(" - ");
            sb.append(String.format("%02d", new Object[]{Integer.valueOf(this.m_hour)}));
            sb.append(":");
            sb.append(String.format("%02d", new Object[]{Integer.valueOf(this.m_minute)}));
            sb.append(" ");
            StringBuilder sb2 = new StringBuilder(sb.toString());
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                if (i3 >= 7) {
                    z = true;
                    break;
                }
                if (i4 == -1 && this.m_daysOfWeek[i3]) {
                    i4 = i3;
                }
                if (i4 != -1 && i5 == -1 && !this.m_daysOfWeek[i3]) {
                    i5 = i3 - 1;
                }
                if (i4 >= 0 && i5 >= 0 && this.m_daysOfWeek[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (i5 != -1) {
                i2 = i5;
            }
            if (!z || i2 - i4 <= 1) {
                int i6 = 0;
                while (true) {
                    boolean[] zArr = this.m_daysOfWeek;
                    if (i6 >= zArr.length) {
                        break;
                    }
                    if (zArr[i6]) {
                        sb2.append(strArr[i6]);
                        sb2.append(", ");
                    }
                    i6++;
                }
                sb2 = new StringBuilder(sb2.substring(0, sb2.length() - 2));
            } else {
                sb2.append(" ");
                sb2.append(strArr[i4]);
                sb2.append(" - ");
                sb2.append(strArr[i2]);
            }
            return sb2.toString();
        } else if (!this.m_relative) {
            return "[" + this.m_label + "] " + SelectableItem.m15535j1(C17541R$string.one_off) + " (" + SelectableItem.m15535j1(C17541R$string.fixed) + ") - " + String.format("%02d", new Object[]{Integer.valueOf(this.m_hour)}) + ":" + String.format("%02d", new Object[]{Integer.valueOf(this.m_minute)}) + " " + m12274z3().get(this.m_dayOption);
        } else if (this.m_variable == null) {
            return "[" + this.m_label + "] " + SelectableItem.m15535j1(C17541R$string.one_off) + " (" + SelectableItem.m15535j1(C17541R$string.relative) + ") - " + this.m_delayInHours + ":" + String.format("%02d", new Object[]{Integer.valueOf(this.m_delayInMinutes)});
        } else {
            return "[" + this.m_label + "] " + SelectableItem.m15535j1(C17541R$string.one_off) + " (" + SelectableItem.m15535j1(C17541R$string.relative) + ") - " + this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        Activity j0 = mo27850j0();
        if (!mo27836X() || C5163j2.m19949D2(j0)) {
            super.mo24689O1();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((int) C17541R$string.action_alarm_clock);
        builder.setMessage((int) C17541R$string.action_alarm_clock_first_run);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3490tf(this, j0));
        try {
            builder.show();
        } catch (Exception unused) {
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7733e3.m32256u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        if (TextUtils.isEmpty(this.m_label)) {
            str = "";
        } else {
            str = " (" + this.m_label + ")";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_label, triggerContextInfo, mo27837X0());
        int i = this.m_option;
        if (i == 0) {
            Intent intent = new Intent("android.intent.action.SET_ALARM");
            intent.putExtra("android.intent.extra.alarm.MESSAGE", t0);
            intent.putExtra("android.intent.extra.alarm.SKIP_UI", true);
            int i2 = 0;
            if (this.m_oneOff) {
                if (this.m_relative) {
                    Calendar instance = Calendar.getInstance();
                    MacroDroidVariable macroDroidVariable = this.m_variable;
                    if (macroDroidVariable != null) {
                        MacroDroidVariable q = mo27861q(macroDroidVariable.getName());
                        if (q != null) {
                            Long C = q.mo27732C(this.varDictionaryKeys);
                            if (C != null) {
                                int intValue = C.intValue();
                                if (intValue > 0) {
                                    i2 = intValue / 1440;
                                    instance.add(12, intValue);
                                }
                            } else {
                                C4878b.m18869h("Not setting alarm clock, variable not found: " + this.m_variable.getName() + C6520o0.m24912e0(this.varDictionaryKeys), mo27840Y0().longValue());
                                return;
                            }
                        } else {
                            C4878b.m18869h("Not setting alarm clock, variable not found: " + this.m_variable.getName(), mo27840Y0().longValue());
                            return;
                        }
                    } else {
                        int i3 = this.m_delayInHours;
                        int i4 = this.m_delayInMinutes;
                        instance.add(12, (i3 * 60) + i4);
                        i2 = ((i3 * 60) + i4) / 1440;
                    }
                    int i5 = instance.get(11);
                    int i6 = instance.get(12);
                    if (i2 > 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(((instance.get(7) - 1) % 7) + 1));
                        intent.putExtra("android.intent.extra.alarm.DAYS", arrayList);
                    }
                    intent.putExtra("android.intent.extra.alarm.HOUR", i5);
                    intent.putExtra("android.intent.extra.alarm.MINUTES", i6);
                } else {
                    intent.putExtra("android.intent.extra.alarm.HOUR", this.m_hour);
                    intent.putExtra("android.intent.extra.alarm.MINUTES", this.m_minute);
                    if (this.m_dayOption > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(this.m_dayOption));
                        intent.putExtra("android.intent.extra.alarm.DAYS", arrayList2);
                    }
                }
                intent.addFlags(268435456);
                try {
                    mo27827K0().startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    C4878b.m18869h("Sorry your device cannot handle the intent to set an alarm (No suitable clock app found)", mo27840Y0().longValue());
                }
            } else {
                intent.putExtra("android.intent.extra.alarm.HOUR", this.m_hour);
                intent.putExtra("android.intent.extra.alarm.MINUTES", this.m_minute);
                ArrayList arrayList3 = new ArrayList();
                while (true) {
                    boolean[] zArr = this.m_daysOfWeek;
                    if (i2 < zArr.length) {
                        if (zArr[i2]) {
                            arrayList3.add(Integer.valueOf(((i2 + 1) % 7) + 1));
                        }
                        i2++;
                    } else {
                        intent.putExtra("android.intent.extra.alarm.DAYS", arrayList3);
                        intent.addFlags(268435456);
                        try {
                            mo27827K0().startActivity(intent);
                            return;
                        } catch (ActivityNotFoundException unused2) {
                            C4878b.m18869h("Set alarm failed, your system has no app that can handle the AlarmClock.ACTION_SET_ALARM intent", mo27840Y0().longValue());
                            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.error, 1).show();
                            return;
                        }
                    }
                }
            }
        } else if (i == 1) {
            Intent intent2 = new Intent("android.intent.action.DISMISS_ALARM");
            intent2.putExtra("android.intent.extra.alarm.SEARCH_MODE", "android.label");
            intent2.putExtra("android.intent.extra.alarm.MESSAGE", t0);
            intent2.addFlags(268435456);
            intent2.putExtra("android.intent.extra.alarm.SKIP_UI", true);
            try {
                mo27827K0().startActivity(intent2);
            } catch (ActivityNotFoundException unused3) {
                C4878b.m18869h("Clear alarm failed, your system has no app that can handle the AlarmClock.ACTION_DISMISS_ALARM intent", mo27840Y0().longValue());
                C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.clear_alarm_failed_error, 1).show();
            }
        } else if (i == 2) {
            try {
                Intent intent3 = new Intent("android.intent.action.DISMISS_ALARM");
                intent3.addFlags(268435456);
                mo27827K0().startActivity(intent3);
            } catch (ActivityNotFoundException unused4) {
                C4878b.m18869h("Dismiss alarm failed, your system has no app that can handle the AlarmClock.ACTION_DISMISS_ALARM intent", mo27840Y0().longValue());
                C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.clear_alarm_failed_error, 1).show();
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        if (Build.VERSION.SDK_INT >= 23) {
            return m12244A3();
        }
        return null;
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: k */
    public void mo24427k(@Nullable DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " " + mo24672O0();
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.m_variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String[] g1 = mo24676g1();
        if (g1 == null || g1.length <= 0) {
            this.m_option = 0;
            mo24677v2();
            return;
        }
        mo27848g0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_option;
        if (i == 0) {
            m12273y3();
        } else if (i == 1) {
            m12272x3();
        } else if (i == 2) {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_minute);
        parcel.writeInt(this.m_hour);
        parcel.writeString(this.m_label);
        parcel.writeInt(this.m_oneOff ? 1 : 0);
        parcel.writeBooleanArray(this.m_daysOfWeek);
        parcel.writeInt(this.m_relative ? 1 : 0);
        parcel.writeInt(this.m_delayInHours);
        parcel.writeInt(this.m_delayInMinutes);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeInt(this.m_dayOption);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public SetAlarmClockAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetAlarmClockAction() {
        this.m_daysOfWeek = new boolean[7];
        this.m_hour = 8;
        this.m_minute = 15;
        this.m_relative = true;
        this.m_oneOff = true;
        this.m_label = "";
    }

    private SetAlarmClockAction(Parcel parcel) {
        super(parcel);
        boolean[] zArr = new boolean[7];
        this.m_daysOfWeek = zArr;
        this.m_option = parcel.readInt();
        this.m_minute = parcel.readInt();
        this.m_hour = parcel.readInt();
        this.m_label = parcel.readString();
        boolean z = true;
        this.m_oneOff = parcel.readInt() != 0;
        parcel.readBooleanArray(zArr);
        this.m_relative = parcel.readInt() == 0 ? false : z;
        this.m_delayInHours = parcel.readInt();
        this.m_delayInMinutes = parcel.readInt();
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_dayOption = parcel.readInt();
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
