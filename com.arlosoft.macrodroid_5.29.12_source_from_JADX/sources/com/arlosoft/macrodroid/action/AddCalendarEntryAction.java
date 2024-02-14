package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6451w;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2216e;
import p057a2.C2220i;
import p057a2.C2224m;
import p092g1.C7326a;
import p092g1.C7327b;
import p128m0.C7711c;
import p148q0.C8151a;
import p319lc.C15626c;

public class AddCalendarEntryAction extends Action implements C2224m, C2220i, C2216e {
    public static final Parcelable.Creator<AddCalendarEntryAction> CREATOR = new C2329d();
    private boolean m_allDayEvent;
    private int m_availability;
    /* access modifiers changed from: private */
    public String m_calendarId;
    private String m_detail;
    private String m_durationValue;
    private int m_fixedDays;
    private int m_fixedHour;
    private int m_fixedMinute;
    private int m_fixedMonths;
    private boolean m_fixedTime;
    private int m_relativeDays;
    private int m_relativeHours;
    private int m_relativeMinutes;
    private String m_relativeTimeVariableName;
    private int m_timeUnitForVariable;
    private String m_title;
    private boolean m_useVariableTimeInFuture;
    private DictionaryKeys varDictionaryKeys;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient String workingVariableName;

    /* renamed from: com.arlosoft.macrodroid.action.AddCalendarEntryAction$a */
    class C2326a implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ViewFlipper f7132a;

        C2326a(ViewFlipper viewFlipper) {
            this.f7132a = viewFlipper;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            this.f7132a.setDisplayedChild(0);
            String unused = AddCalendarEntryAction.this.workingVariableName = null;
            DictionaryKeys unused2 = AddCalendarEntryAction.this.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            this.f7132a.setDisplayedChild(1);
            String unused = AddCalendarEntryAction.this.workingVariableName = macroDroidVariable.getName();
            DictionaryKeys unused2 = AddCalendarEntryAction.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AddCalendarEntryAction$b */
    class C2327b implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ List f7134a;

        C2327b(List list) {
            this.f7134a = list;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String unused = AddCalendarEntryAction.this.m_calendarId = ((C7327b) this.f7134a.get(i)).f17928a;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AddCalendarEntryAction$c */
    class C2328c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7136a;

        /* renamed from: c */
        final /* synthetic */ EditText f7137c;

        /* renamed from: d */
        final /* synthetic */ EditText f7138d;

        C2328c(Button button, EditText editText, EditText editText2) {
            this.f7136a = button;
            this.f7137c = editText;
            this.f7138d = editText2;
        }

        public void afterTextChanged(Editable editable) {
            this.f7136a.setEnabled(this.f7137c.getText().length() > 0 && C6451w.m24771g(AddCalendarEntryAction.this.mo27827K0(), AddCalendarEntryAction.this.mo27837X0(), this.f7138d.getText().toString(), (TriggerContextInfo) null));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AddCalendarEntryAction$d */
    class C2329d implements Parcelable.Creator<AddCalendarEntryAction> {
        C2329d() {
        }

        /* renamed from: a */
        public AddCalendarEntryAction createFromParcel(Parcel parcel) {
            return new AddCalendarEntryAction(parcel, (C2326a) null);
        }

        /* renamed from: b */
        public AddCalendarEntryAction[] newArray(int i) {
            return new AddCalendarEntryAction[i];
        }
    }

    /* synthetic */ AddCalendarEntryAction(Parcel parcel, C2326a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static /* synthetic */ void m9669B3(EditText editText, C4023j0.C4029f fVar) {
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
    public /* synthetic */ void m9670C3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static /* synthetic */ void m9671D3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m9672E3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static /* synthetic */ void m9673F3(EditText editText, C4023j0.C4029f fVar) {
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
    public /* synthetic */ void m9674G3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: w3 */
    private void m9688w3() {
        int i;
        String str;
        Spinner spinner;
        Activity activity;
        Activity j0 = mo27850j0();
        Pair<String, List<C7327b>> d = C7327b.m30262d(mo27827K0());
        this.workingVariableName = this.m_relativeTimeVariableName;
        this.workingDictionaryKeys = this.varDictionaryKeys;
        String str2 = (String) d.first;
        List list = (List) d.second;
        if (list.size() == 0) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), mo27827K0().getString(C17541R$string.action_add_calendar_event_no_calendars), 1).show();
            return;
        }
        if (this.m_calendarId == null) {
            this.m_calendarId = str2;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                i = 0;
                break;
            } else if (((C7327b) list.get(i2)).f17928a.equals(this.m_calendarId)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.calendar_configure);
        appCompatDialog.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_add_calendar_event_configure));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!j0.getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.calendar_configure_availability_spinner);
        Spinner spinner3 = (Spinner) appCompatDialog.findViewById(C17532R$id.calendar_configure_spinner);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.calendar_configure_detail_magic_text);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.calendar_configure_title_magic_text);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.calendar_configure_detail);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.calendar_configure_title);
        TextInputLayout textInputLayout = (TextInputLayout) appCompatDialog.findViewById(C17532R$id.calendar_title_textinputlayout);
        EditText editText3 = (EditText) appCompatDialog.findViewById(C17532R$id.duration_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.duration_magic_button);
        Spinner spinner4 = (Spinner) appCompatDialog.findViewById(C17532R$id.relativeTimeOption);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.plusRadioButton);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.minusRadioButton);
        Spinner spinner5 = (Spinner) appCompatDialog.findViewById(C17532R$id.timeUnitSpinner);
        ViewFlipper viewFlipper = (ViewFlipper) appCompatDialog.findViewById(C17532R$id.relativeTimeViewFlipper);
        Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.calendar_relative_time_layout);
        ViewGroup viewGroup2 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.calendar_fixed_time_layout);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.relative_radio_button);
        RadioButton radioButton4 = (RadioButton) appCompatDialog.findViewById(C17532R$id.fixed_radio_button);
        NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.days_picker);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.hours_picker);
        NumberPicker numberPicker3 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.minutes_picker);
        NumberPicker numberPicker4 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.fixed_days_picker);
        NumberPicker numberPicker5 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.fixed_months_picker);
        TimePicker timePicker = (TimePicker) appCompatDialog.findViewById(C17532R$id.fixed_time_picker);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.time_of_day_label);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.all_day_checkbox);
        LinearLayout linearLayout = (LinearLayout) appCompatDialog.findViewById(C17532R$id.duration_box_layout);
        TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.select_calendar_spinner);
        int i3 = i;
        Activity activity2 = j0;
        ((TextView) appCompatDialog.findViewById(C17532R$id.use_alarm_description)).setVisibility(8);
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.use_alarm)).setVisibility(8);
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.enable_regex)).setVisibility(8);
        ((TextView) appCompatDialog.findViewById(C17532R$id.variable_constraint_dialog_wildcards_info)).setVisibility(8);
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.ignore_all_day)).setVisibility(8);
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.check_in_advance)).setVisibility(8);
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.calendar_configure_radio_buttons)).setVisibility(8);
        ((LinearLayout) appCompatDialog.findViewById(C17532R$id.duration_layout)).setVisibility(0);
        ((TextInputLayout) appCompatDialog.findViewById(C17532R$id.duration_textinputlayout)).setHint((CharSequence) SelectableItem.m15535j1(C17541R$string.duration) + " (" + SelectableItem.m15535j1(C17541R$string.minutes) + ")");
        String str3 = this.m_durationValue;
        if (str3 != null) {
            if (str3 == null) {
                str3 = "0";
            }
            editText3.setText(str3);
        } else {
            editText3.setText("0");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectableItem.m15535j1(C17541R$string.relative_time));
        Activity j02 = mo27850j0();
        Macro X0 = mo27837X0();
        if (this.workingVariableName != null) {
            str = this.workingVariableName + C6520o0.m24912e0(this.varDictionaryKeys);
        } else {
            str = null;
        }
        Button button6 = button;
        Spinner spinner6 = spinner3;
        Button button7 = button2;
        EditText editText4 = editText;
        EditText editText5 = editText2;
        EditText editText6 = editText3;
        TextInputLayout textInputLayout2 = textInputLayout;
        Button button8 = button4;
        RadioButton radioButton5 = radioButton;
        RadioButton radioButton6 = radioButton2;
        Spinner spinner7 = spinner5;
        Button button9 = button3;
        Button button10 = button5;
        ViewGroup viewGroup3 = viewGroup;
        ViewGroup viewGroup4 = viewGroup2;
        RadioButton radioButton7 = radioButton3;
        RadioButton radioButton8 = radioButton4;
        NumberPicker numberPicker6 = numberPicker;
        NumberPicker numberPicker7 = numberPicker2;
        NumberPicker numberPicker8 = numberPicker3;
        NumberPicker numberPicker9 = numberPicker4;
        NumberPicker numberPicker10 = numberPicker5;
        TimePicker timePicker2 = timePicker;
        TextView textView3 = textView;
        CheckBox checkBox2 = checkBox;
        LinearLayout linearLayout2 = linearLayout;
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        C6520o0.m24879I(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner4, X0, arrayList, str, "", false, new C2326a(viewFlipper));
        viewFlipper.setDisplayedChild(this.workingVariableName == null ? 0 : 1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(mo27850j0(), C17535R$layout.simple_spinner_item, mo27827K0().getResources().getStringArray(C17525R$array.availability_options_set));
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter);
        spinner2.setSelection(this.m_availability);
        RadioButton radioButton9 = radioButton5;
        radioButton9.setChecked(this.m_useVariableTimeInFuture);
        radioButton6.setChecked(!this.m_useVariableTimeInFuture);
        NumberPicker numberPicker11 = numberPicker8;
        numberPicker11.setValue(this.m_relativeMinutes);
        NumberPicker numberPicker12 = numberPicker7;
        numberPicker12.setValue(this.m_relativeHours);
        NumberPicker numberPicker13 = numberPicker6;
        numberPicker13.setValue(this.m_relativeDays);
        NumberPicker numberPicker14 = numberPicker9;
        numberPicker14.setValue(this.m_fixedDays);
        NumberPicker numberPicker15 = numberPicker10;
        numberPicker15.setValue(this.m_fixedMonths);
        TimePicker timePicker3 = timePicker2;
        timePicker3.setIs24HourView(Boolean.TRUE);
        timePicker3.setCurrentHour(Integer.valueOf(this.m_fixedHour));
        timePicker3.setCurrentMinute(Integer.valueOf(this.m_fixedMinute));
        CheckBox checkBox3 = checkBox2;
        checkBox3.setChecked(this.m_allDayEvent);
        LinearLayout linearLayout3 = linearLayout2;
        linearLayout3.setVisibility(this.m_allDayEvent ? 8 : 0);
        TextView textView4 = textView3;
        checkBox3.setOnCheckedChangeListener(new C3268n(linearLayout3, timePicker3, textView4));
        timePicker3.setVisibility(this.m_allDayEvent ? 8 : 0);
        textView4.setVisibility(this.m_allDayEvent ? 8 : 0);
        RadioButton radioButton10 = radioButton7;
        radioButton10.setChecked(!this.m_fixedTime);
        radioButton8.setChecked(this.m_fixedTime);
        ViewGroup viewGroup5 = viewGroup4;
        viewGroup5.setVisibility(this.m_fixedTime ? 0 : 8);
        CheckBox checkBox4 = checkBox3;
        ViewGroup viewGroup6 = viewGroup3;
        viewGroup6.setVisibility(this.m_fixedTime ? 8 : 0);
        radioButton10.setOnCheckedChangeListener(new C3240m(viewGroup5, viewGroup6));
        Spinner spinner8 = spinner7;
        spinner8.setSelection(this.m_timeUnitForVariable);
        if (list.size() > 1) {
            spinner6.setVisibility(0);
            spinner = spinner2;
            activity = activity2;
            C7326a aVar = new C7326a(activity, list);
            aVar.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner6.setAdapter(aVar);
            spinner6.setSelection(i3);
        } else {
            spinner = spinner2;
            activity = activity2;
            spinner6.setVisibility(8);
            textView2.setVisibility(8);
        }
        spinner6.setOnItemSelectedListener(new C2327b(list));
        textInputLayout2.setHint((int) C17541R$string.title);
        String str4 = this.m_title;
        EditText editText7 = editText5;
        if (str4 != null) {
            editText7.setText(str4);
            editText7.setSelection(editText7.length());
        }
        String str5 = this.m_detail;
        EditText editText8 = editText4;
        if (str5 != null) {
            editText8.setText(str5);
            editText8.setSelection(editText8.length());
        }
        Activity activity3 = activity;
        EditText editText9 = editText6;
        Button button11 = button10;
        C2328c cVar = new C2328c(button11, editText7, editText9);
        editText7.addTextChangedListener(cVar);
        editText9.addTextChangedListener(cVar);
        C3212l lVar = r0;
        EditText editText10 = editText8;
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        EditText editText11 = editText9;
        EditText editText12 = editText7;
        Activity activity4 = activity3;
        C3212l lVar2 = new C3212l(this, editText7, editText8, editText9, numberPicker11, numberPicker12, numberPicker13, numberPicker15, numberPicker14, timePicker3, radioButton8, checkBox4, spinner, radioButton9, spinner8, spinner4, appCompatDialog3);
        Button button12 = button11;
        button12.setOnClickListener(lVar);
        button12.setEnabled(editText12.getText().length() > 0);
        AppCompatDialog appCompatDialog4 = appCompatDialog3;
        button9.setOnClickListener(new C3100h(appCompatDialog4));
        Activity activity5 = activity4;
        button7.setOnClickListener(new C3128i(this, activity5, new C3296o(editText12)));
        button6.setOnClickListener(new C3184k(this, activity5, new C3354q(editText10)));
        button8.setOnClickListener(new C3156j(this, activity5, new C3326p(editText11)));
        appCompatDialog4.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static /* synthetic */ void m9689x3(LinearLayout linearLayout, TimePicker timePicker, TextView textView, CompoundButton compoundButton, boolean z) {
        int i = 8;
        linearLayout.setVisibility(z ? 8 : 0);
        timePicker.setVisibility(z ? 8 : 0);
        if (!z) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static /* synthetic */ void m9690y3(ViewGroup viewGroup, ViewGroup viewGroup2, CompoundButton compoundButton, boolean z) {
        int i = 8;
        viewGroup.setVisibility(z ? 8 : 0);
        if (z) {
            i = 0;
        }
        viewGroup2.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m9691z3(EditText editText, EditText editText2, EditText editText3, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, NumberPicker numberPicker5, TimePicker timePicker, RadioButton radioButton, CheckBox checkBox, Spinner spinner, RadioButton radioButton2, Spinner spinner2, Spinner spinner3, AppCompatDialog appCompatDialog, View view) {
        this.m_title = editText.getText().toString();
        this.m_detail = editText2.getText().toString();
        this.m_durationValue = editText3.getText().toString();
        this.m_relativeMinutes = numberPicker.getValue();
        this.m_relativeHours = numberPicker2.getValue();
        this.m_relativeDays = numberPicker3.getValue();
        this.m_fixedMonths = numberPicker4.getValue();
        this.m_fixedDays = numberPicker5.getValue();
        this.m_fixedHour = timePicker.getCurrentHour().intValue();
        this.m_fixedMinute = timePicker.getCurrentMinute().intValue();
        this.m_fixedTime = radioButton.isChecked();
        this.m_allDayEvent = checkBox.isChecked();
        this.m_availability = spinner.getSelectedItemPosition();
        this.m_useVariableTimeInFuture = radioButton2.isChecked();
        this.m_timeUnitForVariable = spinner2.getSelectedItemPosition();
        spinner3.getSelectedItemPosition();
        this.m_relativeTimeVariableName = this.workingVariableName;
        this.varDictionaryKeys = this.workingDictionaryKeys;
        mo24689O1();
        appCompatDialog.dismiss();
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_title, this.m_detail};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_title = strArr[0];
            this.m_detail = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_title;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7711c.m32152u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a3  */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.mo27827K0()
            java.lang.String r1 = r13.m_title
            com.arlosoft.macrodroid.macro.Macro r2 = r13.mo27837X0()
            java.lang.String r5 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r0, r1, r14, r2)
            android.content.Context r0 = r13.mo27827K0()
            java.lang.String r1 = r13.m_detail
            com.arlosoft.macrodroid.macro.Macro r2 = r13.mo27837X0()
            java.lang.String r0 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r0, r1, r14, r2)
            java.lang.String r1 = "\\n"
            java.lang.String r2 = "\n"
            java.lang.String r6 = r0.replace(r1, r2)
            java.lang.String r0 = r13.m_durationValue
            r1 = 0
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = r13.m_durationValue
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0074
            android.content.Context r0 = r13.mo27827K0()     // Catch:{ IllegalArgumentException -> 0x0049 }
            com.arlosoft.macrodroid.macro.Macro r2 = r13.mo27837X0()     // Catch:{ IllegalArgumentException -> 0x0049 }
            java.lang.String r3 = r13.m_durationValue     // Catch:{ IllegalArgumentException -> 0x0049 }
            double r2 = com.arlosoft.macrodroid.utils.C6451w.m24766b(r0, r2, r3, r14)     // Catch:{ IllegalArgumentException -> 0x0049 }
            int r14 = (int) r2
            goto L_0x0075
        L_0x0049:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Calendar duration ("
            r0.append(r2)
            java.lang.String r2 = r13.m_durationValue
            r0.append(r2)
            java.lang.String r2 = ") could not be evaluated: "
            r0.append(r2)
            java.lang.String r14 = r14.toString()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.Long r0 = r13.mo27840Y0()
            long r2 = r0.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r14, r2)
        L_0x0074:
            r14 = 0
        L_0x0075:
            boolean r0 = r13.m_fixedTime
            r2 = 2
            if (r0 == 0) goto L_0x00a3
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r3 = r13.m_fixedMonths
            r0.add(r2, r3)
            r2 = 5
            int r3 = r13.m_fixedDays
            r0.add(r2, r3)
            r2 = 11
            int r3 = r13.m_fixedHour
            r0.set(r2, r3)
            r2 = 12
            int r3 = r13.m_fixedMinute
            r0.set(r2, r3)
            r2 = 13
            r0.set(r2, r1)
            long r0 = r0.getTimeInMillis()
        L_0x00a0:
            r7 = r0
            goto L_0x0187
        L_0x00a3:
            java.lang.String r0 = r13.m_relativeTimeVariableName
            r3 = 10000(0x2710, double:4.9407E-320)
            if (r0 == 0) goto L_0x0159
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r13.mo27861q(r0)
            java.lang.String r1 = " does not exist, adding calendar event for now."
            java.lang.String r7 = "Variable: "
            if (r0 == 0) goto L_0x0132
            com.arlosoft.macrodroid.variables.DictionaryKeys r8 = r13.varDictionaryKeys
            java.lang.Long r0 = r0.mo27732C(r8)
            if (r0 == 0) goto L_0x0105
            int r1 = r13.m_timeUnitForVariable
            if (r1 == 0) goto L_0x00e1
            r3 = 1
            if (r1 == r3) goto L_0x00d3
            if (r1 == r2) goto L_0x00c5
            goto L_0x00ed
        L_0x00c5:
            long r0 = r0.longValue()
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r0 = r0 * r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00ed
        L_0x00d3:
            long r0 = r0.longValue()
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 * r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00ed
        L_0x00e1:
            long r0 = r0.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x00ed:
            boolean r1 = r13.m_useVariableTimeInFuture
            if (r1 == 0) goto L_0x00fb
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.longValue()
            long r1 = r1 + r3
            goto L_0x0157
        L_0x00fb:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.longValue()
            long r1 = r1 - r3
            goto L_0x0157
        L_0x0105:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r2 = r13.m_relativeTimeVariableName
            r0.append(r2)
            com.arlosoft.macrodroid.variables.DictionaryKeys r2 = r13.varDictionaryKeys
            java.lang.String r2 = com.arlosoft.macrodroid.variables.C6520o0.m24912e0(r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Long r1 = r13.mo27840Y0()
            long r1 = r1.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            goto L_0x0155
        L_0x0132:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r2 = r13.m_relativeTimeVariableName
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Long r1 = r13.mo27840Y0()
            long r1 = r1.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
        L_0x0155:
            long r1 = r0 - r3
        L_0x0157:
            r7 = r1
            goto L_0x0187
        L_0x0159:
            int r0 = r13.m_relativeMinutes
            if (r0 != 0) goto L_0x016c
            int r0 = r13.m_relativeHours
            if (r0 != 0) goto L_0x016c
            int r0 = r13.m_relativeDays
            if (r0 != 0) goto L_0x016c
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            goto L_0x00a0
        L_0x016c:
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r13.m_relativeMinutes
            int r2 = r2 * 60
            int r3 = r13.m_relativeHours
            int r3 = r3 * 3600
            int r2 = r2 + r3
            int r3 = r13.m_relativeDays
            r4 = 86400(0x15180, float:1.21072E-40)
            int r3 = r3 * r4
            int r2 = r2 + r3
            int r2 = r2 * 1000
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L_0x00a0
        L_0x0187:
            android.content.Context r3 = r13.mo27827K0()
            java.lang.String r4 = r13.m_calendarId
            int r14 = r14 * 60
            int r14 = r14 * 1000
            long r9 = (long) r14
            boolean r11 = r13.m_allDayEvent
            int r12 = r13.m_availability
            com.arlosoft.macrodroid.common.C4037m.m15935a(r3, r4, r5, r6, r7, r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.AddCalendarEntryAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    @NonNull
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"};
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.m_relativeTimeVariableName = str;
    }

    /* renamed from: k */
    public void mo24427k(@NonNull DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + ": " + mo24690R2(this.m_title, triggerContextInfo) + " / " + mo24690R2(this.m_detail, triggerContextInfo);
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.m_relativeTimeVariableName;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m9688w3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_title);
        parcel.writeString(this.m_detail);
        parcel.writeString(this.m_calendarId);
        parcel.writeString(this.m_durationValue);
        parcel.writeInt(this.m_fixedTime ? 1 : 0);
        parcel.writeInt(this.m_relativeMinutes);
        parcel.writeInt(this.m_relativeHours);
        parcel.writeInt(this.m_relativeDays);
        parcel.writeInt(this.m_fixedMonths);
        parcel.writeInt(this.m_fixedDays);
        parcel.writeInt(this.m_fixedHour);
        parcel.writeInt(this.m_fixedMinute);
        parcel.writeInt(this.m_allDayEvent ? 1 : 0);
        parcel.writeInt(this.m_availability);
        parcel.writeString(this.m_relativeTimeVariableName);
        parcel.writeInt(this.m_timeUnitForVariable);
        parcel.writeInt(this.m_useVariableTimeInFuture ? 1 : 0);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    public AddCalendarEntryAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AddCalendarEntryAction() {
        this.m_relativeTimeVariableName = null;
        this.m_timeUnitForVariable = 0;
        this.m_useVariableTimeInFuture = true;
    }

    private AddCalendarEntryAction(Parcel parcel) {
        super(parcel);
        this.m_relativeTimeVariableName = null;
        boolean z = false;
        this.m_timeUnitForVariable = 0;
        this.m_useVariableTimeInFuture = true;
        this.m_title = parcel.readString();
        this.m_detail = parcel.readString();
        this.m_calendarId = parcel.readString();
        this.m_durationValue = parcel.readString();
        this.m_fixedTime = parcel.readInt() != 0;
        this.m_relativeMinutes = parcel.readInt();
        this.m_relativeHours = parcel.readInt();
        this.m_relativeDays = parcel.readInt();
        this.m_fixedMonths = parcel.readInt();
        this.m_fixedDays = parcel.readInt();
        this.m_fixedHour = parcel.readInt();
        this.m_fixedMinute = parcel.readInt();
        this.m_allDayEvent = parcel.readInt() != 0;
        this.m_availability = parcel.readInt();
        this.m_relativeTimeVariableName = parcel.readString();
        this.m_timeUnitForVariable = parcel.readInt();
        this.m_useVariableTimeInFuture = parcel.readInt() != 0 ? true : z;
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
