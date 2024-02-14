package com.arlosoft.macrodroid.triggers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TimePicker;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.utils.C6424s;

public class DayOfMonthConfigureActivity extends MacroDroidDialogBaseActivity {
    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ void m23824M1(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m23825N1(TimePicker timePicker, Spinner spinner, Spinner spinner2, CheckBox checkBox, View view) {
        int intValue = timePicker.getCurrentHour().intValue();
        int intValue2 = timePicker.getCurrentMinute().intValue();
        Intent intent = new Intent();
        intent.putExtra("DayOfMonth", spinner.getSelectedItemPosition() + 1);
        intent.putExtra("Hour", intValue);
        intent.putExtra("Minute", intValue2);
        intent.putExtra("MonthOfYear", spinner2.getSelectedItemPosition());
        intent.putExtra("UseAlarm", checkBox.isChecked());
        setResult(-1, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.dialog_day_of_week_trigger);
        setTitle(C17541R$string.trigger_day_of_month);
        getWindow().setLayout(-1, -2);
        int i = getIntent().getExtras().getInt("Hour", 0);
        int i2 = getIntent().getExtras().getInt("Minute", 0);
        int i3 = getIntent().getExtras().getInt("DayOfMonth", 0);
        int i4 = getIntent().getExtras().getInt("MonthOfYear", 0);
        boolean z = getIntent().getExtras().getBoolean("UseAlarm");
        Spinner spinner = (Spinner) findViewById(C17532R$id.dialog_day_of_week_dialog_spinner_day);
        Spinner spinner2 = (Spinner) findViewById(C17532R$id.month_of_year_spinner);
        spinner2.setVisibility(0);
        TimePicker timePicker = (TimePicker) findViewById(C17532R$id.dialog_day_of_week_dialog_time_picker);
        CheckBox checkBox = (CheckBox) findViewById(C17532R$id.force_alarm_checkbox);
        timePicker.setIs24HourView(Boolean.TRUE);
        timePicker.setCurrentHour(Integer.valueOf(i));
        timePicker.setCurrentMinute(Integer.valueOf(i2));
        checkBox.setChecked(z);
        String[] strArr = new String[31];
        for (int i5 = 1; i5 <= 31; i5++) {
            strArr[i5 - 1] = String.valueOf(i5);
        }
        spinner.setAdapter(new ArrayAdapter(this, C17535R$layout.simple_spinner_dropdown_item, strArr));
        if (i3 > 0) {
            spinner.setSelection(i3 - 1);
        }
        String[] strArr2 = new String[13];
        strArr2[0] = getString(C17541R$string.every_month);
        System.arraycopy(C6424s.m24735b(), 0, strArr2, 1, 12);
        spinner2.setAdapter(new ArrayAdapter(this, C17535R$layout.simple_spinner_dropdown_item, strArr2));
        spinner2.setSelection(i4);
        ((Button) findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5829a(this));
        ((Button) findViewById(C17532R$id.okButton)).setOnClickListener(new C5831b(this, timePicker, spinner, spinner2, checkBox));
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
