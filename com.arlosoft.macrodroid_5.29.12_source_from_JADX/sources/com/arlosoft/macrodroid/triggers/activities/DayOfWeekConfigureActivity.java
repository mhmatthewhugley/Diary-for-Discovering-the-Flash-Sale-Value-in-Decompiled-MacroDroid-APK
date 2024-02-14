package com.arlosoft.macrodroid.triggers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.utils.C6424s;

public class DayOfWeekConfigureActivity extends MacroDroidDialogBaseActivity {
    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ void m23828M1(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m23829N1(TimePicker timePicker, Spinner spinner, CheckBox checkBox, View view) {
        int intValue = timePicker.getCurrentHour().intValue();
        int intValue2 = timePicker.getCurrentMinute().intValue();
        Intent intent = new Intent();
        intent.putExtra("DayOfWeek", spinner.getSelectedItemPosition());
        intent.putExtra("Hour", intValue);
        intent.putExtra("Minute", intValue2);
        intent.putExtra("UseAlarm", checkBox.isChecked());
        setResult(-1, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.dialog_day_of_week_trigger);
        setTitle(C17541R$string.trigger_day_of_week);
        getWindow().setLayout(-1, -2);
        int i = getIntent().getExtras().getInt("Hour", 0);
        int i2 = getIntent().getExtras().getInt("Minute", 0);
        int i3 = getIntent().getExtras().getInt("DayOfWeek", 0);
        boolean z = getIntent().getExtras().getBoolean("UseAlarm");
        Spinner spinner = (Spinner) findViewById(C17532R$id.dialog_day_of_week_dialog_spinner_day);
        TimePicker timePicker = (TimePicker) findViewById(C17532R$id.dialog_day_of_week_dialog_time_picker);
        CheckBox checkBox = (CheckBox) findViewById(C17532R$id.force_alarm_checkbox);
        timePicker.setIs24HourView(Boolean.TRUE);
        timePicker.setCurrentHour(Integer.valueOf(i));
        timePicker.setCurrentMinute(Integer.valueOf(i2));
        checkBox.setVisibility(8);
        ((TextView) findViewById(C17532R$id.force_alarm_description)).setVisibility(8);
        checkBox.setChecked(z);
        String[] strArr = new String[7];
        for (int i4 = 0; i4 < 7; i4++) {
            strArr[i4] = C6424s.m24734a(i4);
        }
        spinner.setAdapter(new ArrayAdapter(this, C17535R$layout.simple_spinner_dropdown_item, strArr));
        spinner.setSelection(i3);
        ((Button) findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5833c(this));
        ((Button) findViewById(C17532R$id.okButton)).setOnClickListener(new C5835d(this, timePicker, spinner, checkBox));
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
