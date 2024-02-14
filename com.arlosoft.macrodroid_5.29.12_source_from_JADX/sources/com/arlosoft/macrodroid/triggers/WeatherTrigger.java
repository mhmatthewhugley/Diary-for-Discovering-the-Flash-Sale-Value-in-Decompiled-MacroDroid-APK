package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.C4366a;
import com.arlosoft.macrodroid.data.WeatherContextInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.LocationChooserActivity;
import com.arlosoft.macrodroid.triggers.receivers.RequestWeatherReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.util.ArrayList;
import java.util.HashSet;
import p119k3.C7505g2;
import p148q0.C8151a;
import p319lc.C15626c;

public class WeatherTrigger extends Trigger {
    private static final int ANY_WEATHER_UPDATE = 4;
    private static final int CONDITIONS = 3;
    public static final Parcelable.Creator<WeatherTrigger> CREATOR = new C5775d();
    private static final int HUMIDITY = 2;
    private static final int SET_LOCATION = 33;
    private static final int TEMPERATURE = 0;
    private static final int WEATHER_CONDITION_CLEAR = 0;
    private static final int WEATHER_CONDITION_CLOUDY = 1;
    private static final int WEATHER_CONDITION_RAIN = 2;
    private static final int WEATHER_CONDITION_SNOW = 4;
    private static final int WEATHER_CONDITION_THUNDER = 3;
    private static final int WIND_DIRECTION = 5;
    private static final int WIND_SPEED = 1;
    /* access modifiers changed from: private */
    public static PendingIntent s_pendingIntent;
    private static int s_triggerCounter;
    private static C5776e s_updateRateReceiver;
    private boolean m_humidityAbove;
    private int m_humidityValue;
    private int m_option;
    private boolean m_tempBelow;
    private boolean m_tempCelcius;
    private int m_temperature;
    private int m_weatherCondition;
    private boolean m_windSpeedAbove;
    private int m_windSpeedValue;
    private int m_windSpeedValueMph;

    /* renamed from: com.arlosoft.macrodroid.triggers.WeatherTrigger$a */
    class C5772a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13731a;

        C5772a(Button button) {
            this.f13731a = button;
        }

        public void afterTextChanged(Editable editable) {
            this.f13731a.setEnabled(editable.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WeatherTrigger$b */
    class C5773b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13733a;

        C5773b(Button button) {
            this.f13733a = button;
        }

        public void afterTextChanged(Editable editable) {
            this.f13733a.setEnabled(editable.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WeatherTrigger$c */
    class C5774c implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f13735a;

        C5774c(TextView textView) {
            this.f13735a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView textView = this.f13735a;
            textView.setText(i + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WeatherTrigger$d */
    class C5775d implements Parcelable.Creator<WeatherTrigger> {
        C5775d() {
        }

        /* renamed from: a */
        public WeatherTrigger createFromParcel(Parcel parcel) {
            return new WeatherTrigger(parcel, (C5772a) null);
        }

        /* renamed from: b */
        public WeatherTrigger[] newArray(int i) {
            return new WeatherTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.WeatherTrigger$e */
    private class C5776e extends BroadcastReceiver {
        private C5776e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (WeatherTrigger.s_pendingIntent != null) {
                PendingIntent unused = WeatherTrigger.s_pendingIntent = PendingIntent.getBroadcast(WeatherTrigger.this.mo27827K0(), 0, new Intent(WeatherTrigger.this.mo27827K0(), RequestWeatherReceiver.class), 134217728 | C6368b1.f14959b);
                ((AlarmManager) WeatherTrigger.this.mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).setRepeating(0, System.currentTimeMillis(), (long) (C5163j2.m20305y2(WeatherTrigger.this.mo27827K0()) * 60 * 1000), WeatherTrigger.s_pendingIntent);
            }
        }

        /* synthetic */ C5776e(WeatherTrigger weatherTrigger, C5772a aVar) {
            this();
        }
    }

    /* synthetic */ WeatherTrigger(Parcel parcel, C5772a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m23568A3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, AppCompatDialog appCompatDialog, View view) {
        if (radioButton.isChecked()) {
            this.m_weatherCondition = 0;
        } else if (radioButton2.isChecked()) {
            this.m_weatherCondition = 1;
        } else if (radioButton3.isChecked()) {
            this.m_weatherCondition = 2;
        } else if (radioButton4.isChecked()) {
            this.m_weatherCondition = 3;
        } else if (radioButton5.isChecked()) {
            this.m_weatherCondition = 4;
        }
        mo24689O1();
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m23570C3(RadioButton radioButton, EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_windSpeedAbove = radioButton.isChecked();
        try {
            int intValue = Integer.valueOf(editText.getText().toString()).intValue();
            this.m_windSpeedValueMph = intValue;
            this.m_windSpeedValue = (int) (((double) intValue) / 2.23694d);
        } catch (NumberFormatException unused) {
            this.m_windSpeedValueMph = 0;
            this.m_windSpeedValue = 0;
        }
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m23572E3(Activity activity, DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent(activity, LocationChooserActivity.class);
            intent.putExtra("title", SelectableItem.m15535j1(C17541R$string.weather_location));
            activity.startActivityForResult(intent, 33);
        } catch (NoClassDefFoundError unused) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), mo27827K0().getString(C17541R$string.toast_broken_map_activity), 0).show();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: F3 */
    private int m23573F3(int i) {
        if (i >= 200 && i <= 232) {
            return 3;
        }
        if (i >= 300 && i <= 531) {
            return 2;
        }
        if (i >= 600 && i <= 622) {
            return 4;
        }
        if (i < 800 || i > 801) {
            return (i < 802 || i > 804) ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: G3 */
    private void m23574G3(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_weather_set_location);
        builder.setMessage((int) C17541R$string.trigger_weather_location_info).setCancelable(true).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6214z8(this, activity));
        builder.show();
    }

    /* renamed from: I3 */
    private boolean m23575I3(C4366a aVar, C4366a aVar2) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        if (aVar != null) {
            for (C4366a.C4368b b : aVar.f11114a) {
                hashSet.add(Integer.valueOf(m23573F3(b.mo28622b())));
            }
        }
        for (C4366a.C4368b b2 : aVar2.f11114a) {
            hashSet2.add(Integer.valueOf(m23573F3(b2.mo28622b())));
        }
        return !hashSet.contains(Integer.valueOf(this.m_weatherCondition)) && hashSet2.contains(Integer.valueOf(this.m_weatherCondition));
    }

    /* renamed from: r3 */
    private void m23587r3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.weather_humidity_dialog);
        appCompatDialog.setTitle((int) C17541R$string.trigger_weather_humidity);
        SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.weather_dialog_value);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_dialog_above_radio_button);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.weather_dialog_percentage_value);
        seekBar.setProgress(this.m_humidityValue);
        textView.setText(this.m_humidityValue + TaskerPlugin.VARIABLE_PREFIX);
        ((RadioButton) appCompatDialog.findViewById(C17532R$id.weather_dialog_below_radio_button)).setChecked(this.m_humidityAbove ^ true);
        radioButton.setChecked(this.m_humidityAbove);
        seekBar.setOnSeekBarChangeListener(new C5774c(textView));
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C5938g9(this, radioButton, seekBar, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5902d9(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: s3 */
    private void m23588s3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.weather_temperature_dialog);
        appCompatDialog.setTitle((int) C17541R$string.trigger_weather_temperature);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.weather_dialog_text_value);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.weather_dialog_temperature_unit);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_dialog_below_radio_button);
        editText.setText("" + this.m_temperature);
        editText.setSelection(editText.getText().length());
        spinner.setSelection(this.m_tempCelcius ^ true ? 1 : 0);
        radioButton.setChecked(this.m_tempBelow);
        ((RadioButton) appCompatDialog.findViewById(C17532R$id.weather_dialog_above_radio_button)).setChecked(!this.m_tempBelow);
        editText.addTextChangedListener(new C5772a(button));
        button.setOnClickListener(new C5950h9(this, radioButton, spinner, editText, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5878b9(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: t3 */
    private void m23589t3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.weather_conditions_dialog);
        appCompatDialog.setTitle((int) C17541R$string.trigger_weather_conditions);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_conditions_dialog_clear);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_conditions_dialog_cloudy);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_conditions_dialog_rain);
        RadioButton radioButton4 = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_conditions_dialog_thunder);
        RadioButton radioButton5 = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_conditions_dialog_snow);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        boolean z = false;
        radioButton.setChecked(this.m_weatherCondition == 0);
        radioButton2.setChecked(this.m_weatherCondition == 1);
        radioButton3.setChecked(this.m_weatherCondition == 2);
        radioButton4.setChecked(this.m_weatherCondition == 3);
        if (this.m_weatherCondition == 4) {
            z = true;
        }
        radioButton5.setChecked(z);
        button.setOnClickListener(new C5926f9(this, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, appCompatDialog));
        button2.setOnClickListener(new C5815a9(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: u3 */
    private void m23590u3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.weather_wind_speed_dialog);
        appCompatDialog.setTitle((int) C17541R$string.trigger_weather_wind_speed);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.weather_dialog_text_value);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_dialog_below_radio_button);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.weather_dialog_above_radio_button);
        int i = this.m_windSpeedValueMph;
        if (i == 0) {
            editText.setText(String.valueOf((int) (((double) this.m_windSpeedValue) * 2.23694d)));
        } else {
            editText.setText(String.valueOf(i));
        }
        editText.setSelection(editText.getText().length());
        radioButton.setChecked(!this.m_windSpeedAbove);
        radioButton2.setChecked(this.m_windSpeedAbove);
        editText.addTextChangedListener(new C5773b(button));
        button.setOnClickListener(new C5914e9(this, radioButton2, editText, appCompatDialog));
        button2.setOnClickListener(new C5890c9(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: v3 */
    private String[] m23591v3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_weather_temperature), SelectableItem.m15535j1(C17541R$string.trigger_weather_wind_direction), SelectableItem.m15535j1(C17541R$string.trigger_weather_wind_speed), SelectableItem.m15535j1(C17541R$string.trigger_weather_humidity), SelectableItem.m15535j1(C17541R$string.trigger_weather_conditions), SelectableItem.m15535j1(C17541R$string.trigger_weather_any)};
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m23592w3(RadioButton radioButton, SeekBar seekBar, AppCompatDialog appCompatDialog, View view) {
        this.m_humidityAbove = radioButton.isChecked();
        this.m_humidityValue = seekBar.getProgress();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m23594y3(RadioButton radioButton, Spinner spinner, EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_tempBelow = radioButton.isChecked();
        this.m_tempCelcius = spinner.getSelectedItemPosition() == 0;
        try {
            this.m_temperature = Integer.valueOf(editText.getText().toString()).intValue();
        } catch (NumberFormatException unused) {
            this.m_temperature = 0;
        }
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = this.m_option;
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 1;
        }
        return 5;
    }

    /* renamed from: H3 */
    public boolean mo31610H3(C4366a aVar, C4366a aVar2) {
        int i = this.m_option;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 5 && aVar != null && aVar2.f11122i == aVar.f11122i) {
                            return false;
                        }
                        return true;
                    }
                } else if (this.m_humidityAbove) {
                    int i2 = aVar2.f11121h;
                    int i3 = this.m_humidityValue;
                    if (i2 >= i3 && (aVar == null || aVar.f11121h < i3)) {
                        return true;
                    }
                } else {
                    int i4 = aVar2.f11121h;
                    int i5 = this.m_humidityValue;
                    if (i4 <= i5) {
                        if (aVar == null || aVar.f11121h > i5) {
                            return true;
                        }
                        return false;
                    }
                }
                return m23575I3(aVar, aVar2);
            }
            double d = (double) this.m_windSpeedValue;
            int i6 = this.m_windSpeedValueMph;
            if (i6 > 0) {
                d = ((double) i6) / 2.23694d;
            }
            if (this.m_windSpeedAbove) {
                if (aVar2.f11116c.mo28631a() < d) {
                    return false;
                }
                if (aVar == null || aVar.f11116c.mo28631a() < d) {
                    return true;
                }
                return false;
            } else if (aVar2.f11116c.mo28631a() > d) {
                return false;
            } else {
                if (aVar == null || aVar.f11116c.mo28631a() > d) {
                    return true;
                }
                return false;
            }
        } else if (this.m_tempBelow) {
            if (aVar2.f11115b.mo28627b(this.m_tempCelcius) > ((double) this.m_temperature)) {
                return false;
            }
            if (aVar == null || aVar.f11115b.mo28627b(this.m_tempCelcius) > ((double) this.m_temperature)) {
                return true;
            }
            return false;
        } else if (aVar2.f11115b.mo28627b(this.m_tempCelcius) < ((double) this.m_temperature)) {
            return false;
        } else {
            if (aVar == null || aVar.f11115b.mo28627b(this.m_tempCelcius) < ((double) this.m_temperature)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int D0 = mo24671D0();
        int i = this.m_option;
        String str = " < ";
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(m23591v3()[D0]);
            if (!this.m_tempBelow) {
                str = " > ";
            }
            sb.append(str);
            sb.append(this.m_temperature);
            sb.append(176);
            sb.append(this.m_tempCelcius ? "C" : "F");
            return sb.toString();
        } else if (i == 1) {
            int i2 = this.m_windSpeedValueMph;
            if (i2 <= 0) {
                i2 = (int) (((double) this.m_windSpeedValue) * 2.23694d);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m23591v3()[D0]);
            if (this.m_windSpeedAbove) {
                str = " > ";
            }
            sb2.append(str);
            sb2.append(i2);
            sb2.append(" ");
            sb2.append(SelectableItem.m15535j1(C17541R$string.trigger_weather_miles_per_hour));
            return sb2.toString();
        } else if (i == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m23591v3()[D0]);
            if (this.m_humidityAbove) {
                str = " > ";
            }
            sb3.append(str);
            sb3.append(this.m_humidityValue);
            sb3.append(TaskerPlugin.VARIABLE_PREFIX);
            return sb3.toString();
        } else if (i != 3) {
            return m23591v3()[D0];
        } else {
            int i3 = this.m_weatherCondition;
            if (i3 == 0) {
                return m23591v3()[D0] + ": " + SelectableItem.m15535j1(C17541R$string.trigger_weather_clear);
            } else if (i3 == 1) {
                return m23591v3()[D0] + ": " + SelectableItem.m15535j1(C17541R$string.trigger_weather_cloudy);
            } else if (i3 == 2) {
                return m23591v3()[D0] + ": " + SelectableItem.m15535j1(C17541R$string.trigger_weather_rain);
            } else if (i3 == 3) {
                return m23591v3()[D0] + ": " + SelectableItem.m15535j1(C17541R$string.trigger_weather_thunder);
            } else if (i3 != 4) {
                return m23591v3()[D0];
            } else {
                return m23591v3()[D0] + ": " + SelectableItem.m15535j1(C17541R$string.trigger_weather_snow);
            }
        }
    }

    /* renamed from: O1 */
    public void mo24689O1() {
        if (C5163j2.m20297x2(mo27827K0()).length() == 0) {
            m23574G3(mo27850j0());
        } else {
            super.mo24689O1();
        }
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(s_pendingIntent);
            if (s_updateRateReceiver != null) {
                try {
                    s_pendingIntent = null;
                    mo27827K0().unregisterReceiver(s_updateRateReceiver);
                } catch (Exception e) {
                    C8151a.m33873n(e);
                }
                s_pendingIntent = null;
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7505g2.m31210u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_pendingIntent = PendingIntent.getBroadcast(mo27827K0(), 0, new Intent(mo27827K0(), RequestWeatherReceiver.class), 134217728 | C6368b1.f14959b);
            ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).setRepeating(0, System.currentTimeMillis(), (long) (C5163j2.m20305y2(mo27827K0()) * 60 * 1000), s_pendingIntent);
            IntentFilter intentFilter = new IntentFilter("WeatberUpdateRateIntent");
            s_updateRateReceiver = new C5776e(this, (C5772a) null);
            mo27827K0().registerReceiver(s_updateRateReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, new WeatherContextInfo(1.1d, 2.1d, 3.1d, 4, 120, new ArrayList()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23591v3();
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == 33 && i2 == -1) {
            double doubleExtra = intent.getDoubleExtra("Latitude", 0.0d);
            double doubleExtra2 = intent.getDoubleExtra("Longitude", 0.0d);
            C5163j2.m20205l6(activity, "lat=" + doubleExtra + "&lon=" + doubleExtra2);
            super.mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_option;
        if (i == 0) {
            m23588s3();
        } else if (i == 1) {
            m23590u3();
        } else if (i == 2) {
            m23587r3();
        } else if (i == 3) {
            m23589t3();
        } else if (i == 4) {
            super.mo24677v2();
        } else if (i == 5) {
            super.mo24677v2();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_tempBelow ^ true ? 1 : 0);
        parcel.writeInt(this.m_temperature);
        parcel.writeInt(this.m_tempCelcius ^ true ? 1 : 0);
        parcel.writeInt(this.m_windSpeedAbove ^ true ? 1 : 0);
        parcel.writeInt(this.m_windSpeedValue);
        parcel.writeInt(this.m_humidityAbove ^ true ? 1 : 0);
        parcel.writeInt(this.m_humidityValue);
        parcel.writeInt(this.m_weatherCondition);
        parcel.writeInt(this.m_windSpeedValueMph);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        if (i == 1) {
            this.m_option = 5;
        } else if (i == 2) {
            this.m_option = 1;
        } else if (i == 3) {
            this.m_option = 2;
        } else if (i == 4) {
            this.m_option = 3;
        } else if (i != 5) {
            this.m_option = 0;
        } else {
            this.m_option = 4;
        }
    }

    public WeatherTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private WeatherTrigger() {
        this.m_option = 0;
        this.m_tempBelow = true;
        this.m_temperature = 0;
        this.m_tempCelcius = true;
        this.m_windSpeedAbove = true;
        this.m_humidityAbove = true;
        this.m_humidityValue = 50;
    }

    private WeatherTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        boolean z = true;
        this.m_tempBelow = parcel.readInt() == 0;
        this.m_temperature = parcel.readInt();
        this.m_tempCelcius = parcel.readInt() == 0;
        this.m_windSpeedAbove = parcel.readInt() == 0;
        this.m_windSpeedValue = parcel.readInt();
        this.m_humidityAbove = parcel.readInt() != 0 ? false : z;
        this.m_humidityValue = parcel.readInt();
        this.m_weatherCondition = parcel.readInt();
        this.m_windSpeedValueMph = parcel.readInt();
    }
}
