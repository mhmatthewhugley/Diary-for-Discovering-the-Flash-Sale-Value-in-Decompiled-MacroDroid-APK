package com.arlosoft.macrodroid.triggers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.TimePicker;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.common.NumberPicker;
import p148q0.C8151a;

public class RegularIntervalTriggerConfigureActivity extends MacroDroidDialogBaseActivity implements NumberPicker.C3991b {

    /* renamed from: A */
    private CheckBox f13805A;

    /* renamed from: B */
    private View f13806B;

    /* renamed from: f */
    private Button f13807f;

    /* renamed from: g */
    private Button f13808g;

    /* renamed from: o */
    private NumberPicker f13809o;

    /* renamed from: p */
    private NumberPicker f13810p;

    /* renamed from: s */
    private NumberPicker f13811s;

    /* renamed from: z */
    private TimePicker f13812z;

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m23891N1(CheckBox checkBox, View view) {
        int value = this.f13811s.getValue() + (this.f13810p.getValue() * 60) + (this.f13809o.getValue() * 60 * 60);
        if (value == 0) {
            C8151a.m33873n(new RuntimeException("The RegularIntervalTrigger was set to 0 minutes!"));
        }
        Intent intent = new Intent();
        intent.putExtra("Seconds", value);
        intent.putExtra("StartMinute", this.f13812z.getCurrentHour().intValue());
        intent.putExtra("StartHour", this.f13812z.getCurrentMinute().intValue());
        intent.putExtra("IgnoreStartTime", !this.f13805A.isChecked());
        intent.putExtra("UseAlarm", checkBox.isChecked());
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m23892O1(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m23893P1(CompoundButton compoundButton, boolean z) {
        int i = 0;
        this.f13812z.setVisibility(z ? 0 : 8);
        View view = this.f13806B;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: N0 */
    public void mo26174N0() {
        this.f13807f.setEnabled((this.f13810p.getValue() == 0 && this.f13809o.getValue() == 0 && this.f13811s.getValue() == 0) ? false : true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.regular_interval_setting);
        setTitle(C17541R$string.trigger_regular_interval);
        getWindow().setLayout(-1, -2);
        int intExtra = getIntent().getIntExtra("Seconds", 0);
        int intExtra2 = getIntent().getIntExtra("StartHour", 0);
        int intExtra3 = getIntent().getIntExtra("StartMinute", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("IgnoreStartTime", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("UseAlarm", false);
        CheckBox checkBox = (CheckBox) findViewById(C17532R$id.force_alarm_checkbox);
        TextView textView = (TextView) findViewById(C17532R$id.force_alarm_description);
        this.f13806B = findViewById(C17532R$id.regular_interval_setting_padding);
        this.f13805A = (CheckBox) findViewById(C17532R$id.regular_interval_setting_reference_start_time_checkbox);
        this.f13809o = (NumberPicker) findViewById(C17532R$id.regular_interval_setting_hour_picker);
        this.f13810p = (NumberPicker) findViewById(C17532R$id.regular_interval_setting_minute_picker);
        NumberPicker numberPicker = (NumberPicker) findViewById(C17532R$id.regular_interval_setting_second_picker);
        this.f13811s = numberPicker;
        numberPicker.setValue(intExtra % 60);
        this.f13811s.setMinimum(0);
        this.f13811s.setMaximum(59);
        this.f13811s.setListener(this);
        this.f13810p.setValue((intExtra / 60) % 60);
        this.f13810p.setMinimum(0);
        this.f13810p.setMaximum(59);
        this.f13810p.setListener(this);
        this.f13809o.setValue(intExtra / 3600);
        this.f13809o.setListener(this);
        this.f13809o.setMinimum(0);
        this.f13809o.setMaximum(999);
        TimePicker timePicker = (TimePicker) findViewById(C17532R$id.regular_interval_setting_time_picker);
        this.f13812z = timePicker;
        timePicker.setIs24HourView(Boolean.TRUE);
        this.f13812z.setCurrentHour(Integer.valueOf(intExtra2));
        this.f13812z.setCurrentMinute(Integer.valueOf(intExtra3));
        Button button = (Button) findViewById(C17532R$id.okButton);
        this.f13807f = button;
        button.setEnabled((this.f13811s.getValue() == 0 && this.f13810p.getValue() == 0 && this.f13809o.getValue() == 0) ? false : true);
        this.f13807f.setOnClickListener(new C5854s(this, checkBox));
        Button button2 = (Button) findViewById(C17532R$id.cancelButton);
        this.f13808g = button2;
        button2.setOnClickListener(new C5853r(this));
        checkBox.setChecked(booleanExtra2);
        if (booleanExtra) {
            this.f13812z.setVisibility(8);
            this.f13806B.setVisibility(0);
        } else {
            this.f13812z.setVisibility(0);
            this.f13806B.setVisibility(8);
        }
        this.f13805A.setChecked(!booleanExtra);
        this.f13805A.setOnCheckedChangeListener(new C5861t(this));
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = Math.max(attributes.width, (getResources().getDisplayMetrics().widthPixels * 90) / 100);
        getWindow().setAttributes(attributes);
    }
}
