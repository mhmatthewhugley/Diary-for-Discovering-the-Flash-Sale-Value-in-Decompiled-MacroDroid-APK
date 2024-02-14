package com.arlosoft.macrodroid.triggers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.ikovac.timepickerwithseconds.TimePicker;

public class TimerTriggerConfigureActivity extends MacroDroidDialogBaseActivity {
    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static /* synthetic */ void m23909N1(CheckBox[] checkBoxArr, Button button, CompoundButton compoundButton, boolean z) {
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
    /* renamed from: O1 */
    public /* synthetic */ void m23910O1(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m23911P1(TimePicker timePicker, CheckBox[] checkBoxArr, CheckBox checkBox, View view) {
        int intValue = timePicker.getCurrentHour().intValue();
        int intValue2 = timePicker.getCurrentMinute().intValue();
        int intValue3 = timePicker.getCurrentSeconds().intValue();
        boolean[] zArr = new boolean[7];
        for (int i = 0; i < checkBoxArr.length; i++) {
            zArr[i] = checkBoxArr[i].isChecked();
        }
        Intent intent = new Intent();
        intent.putExtra("DaysOfWeek", zArr);
        intent.putExtra("Hour", intValue);
        intent.putExtra("Minute", intValue2);
        intent.putExtra("Second", intValue3);
        intent.putExtra("UseAlarm", checkBox.isChecked());
        setResult(-1, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.timer_trigger_configure);
        setTitle(C17541R$string.trigger_timer);
        getWindow().setLayout(-1, -2);
        int i = getIntent().getExtras().getInt("Hour", 0);
        int i2 = getIntent().getExtras().getInt("Minute", 0);
        int i3 = getIntent().getExtras().getInt("Second", 0);
        boolean[] booleanArray = getIntent().getExtras().getBooleanArray("DaysOfWeek");
        boolean z = getIntent().getExtras().getBoolean("UseAlarm");
        TimePicker timePicker = (TimePicker) findViewById(2131364018);
        timePicker.setIs24HourView(Boolean.TRUE);
        timePicker.setCurrentHour(Integer.valueOf(i));
        timePicker.setCurrentMinute(Integer.valueOf(i2));
        timePicker.setCurrentSecond(Integer.valueOf(i3));
        int[] iArr = {C17532R$id.checkBoxMonday, C17532R$id.checkBoxTuesday, C17532R$id.checkBoxWednesday, C17532R$id.checkBoxThursday, C17532R$id.checkBoxFriday, C17532R$id.checkBoxSaturday, C17532R$id.checkBoxSunday};
        CheckBox[] checkBoxArr = new CheckBox[7];
        Button button = (Button) findViewById(C17532R$id.okButton);
        Button button2 = (Button) findViewById(C17532R$id.cancelButton);
        CheckBox checkBox = (CheckBox) findViewById(C17532R$id.force_alarm_checkbox);
        TextView textView = (TextView) findViewById(C17532R$id.force_alarm_description);
        checkBox.setChecked(z);
        for (int i4 = 0; i4 < 7; i4++) {
            checkBoxArr[i4] = (CheckBox) findViewById(iArr[i4]);
            if (booleanArray[i4]) {
                checkBoxArr[i4].setChecked(true);
                button.setEnabled(true);
            }
            checkBoxArr[i4].setOnCheckedChangeListener(new C5830a0(checkBoxArr, button));
        }
        button2.setOnClickListener(new C5866y(this));
        button.setOnClickListener(new C5867z(this, timePicker, checkBoxArr, checkBox));
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
