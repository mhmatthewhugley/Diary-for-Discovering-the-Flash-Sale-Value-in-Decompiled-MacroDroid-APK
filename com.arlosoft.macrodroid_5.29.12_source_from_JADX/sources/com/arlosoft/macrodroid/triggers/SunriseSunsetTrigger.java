package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.LocationChooserActivity;
import com.arlosoft.macrodroid.triggers.receivers.SunsetSunriseReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;
import org.apache.commons.cli.HelpFormatter;
import p119k3.C7576y1;
import p148q0.C8151a;
import p207a7.C11058a;
import p221c7.C11158a;
import p319lc.C15626c;

public class SunriseSunsetTrigger extends Trigger {
    public static final Parcelable.Creator<SunriseSunsetTrigger> CREATOR = new C5752b();
    private static final int SET_LOCATION = 1;
    private static int alarmIdSunsetSunrise = 325935;
    private static C5753c s_timeChangedReceiver;
    private static int s_triggerCounter;
    private transient long lastTriggered;
    private int m_option;
    private transient PendingIntent pendingIntent;
    private int timeAdjustSeconds;

    /* renamed from: com.arlosoft.macrodroid.triggers.SunriseSunsetTrigger$a */
    class C5751a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ TableLayout f13693a;

        C5751a(TableLayout tableLayout) {
            this.f13693a = tableLayout;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f13693a.setVisibility(i == 0 ? 8 : 0);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.SunriseSunsetTrigger$b */
    class C5752b implements Parcelable.Creator<SunriseSunsetTrigger> {
        C5752b() {
        }

        /* renamed from: a */
        public SunriseSunsetTrigger createFromParcel(Parcel parcel) {
            return new SunriseSunsetTrigger(parcel, (C5751a) null);
        }

        /* renamed from: b */
        public SunriseSunsetTrigger[] newArray(int i) {
            return new SunriseSunsetTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.SunriseSunsetTrigger$c */
    private static class C5753c extends BroadcastReceiver {
        private C5753c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (C4061t1.m15965K0(context)) {
                for (Macro next : C4934n.m18998M().mo29710z()) {
                    Iterator<Trigger> it = next.getTriggerList().iterator();
                    while (it.hasNext()) {
                        Trigger next2 = it.next();
                        if ((next2 instanceof SunriseSunsetTrigger) && next2.f13696a) {
                            C4878b.m18880s("Sunrise/Sunset Trigger: Time zone change detected (" + TimeZone.getDefault().getID() + ") - Rescheduling", next.getGUID());
                            next2.mo31543T2();
                            next2.mo31544V2();
                        }
                    }
                }
            }
        }

        /* synthetic */ C5753c(C5751a aVar) {
            this();
        }
    }

    /* synthetic */ SunriseSunsetTrigger(Parcel parcel, C5751a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private String[] m23272l3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_sunrise_sunset_option_sunrise), SelectableItem.m15535j1(C17541R$string.trigger_sunrise_sunset_option_sunset)};
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m23273m3(Activity activity, DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent(activity, LocationChooserActivity.class);
            intent.putExtra("title", SelectableItem.m15535j1(C17541R$string.sunrise_sunset_location));
            activity.startActivityForResult(intent, 1);
        } catch (NoClassDefFoundError unused) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), mo27827K0().getString(C17541R$string.toast_broken_map_activity), 0).show();
        }
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m23274n3(AppCompatDialog appCompatDialog, Spinner spinner, NumberPicker numberPicker, NumberPicker numberPicker2, View view) {
        appCompatDialog.dismiss();
        if (spinner.getSelectedItemPosition() == 0) {
            this.timeAdjustSeconds = 0;
        } else if (spinner.getSelectedItemPosition() == 1) {
            this.timeAdjustSeconds = -((numberPicker.getValue() * 60) + (numberPicker2.getValue() * 3600));
        } else {
            this.timeAdjustSeconds = (numberPicker.getValue() * 60) + (numberPicker2.getValue() * 3600);
        }
        if (C5163j2.m20145e2(mo27827K0()).length() == 0) {
            m23276p3(mo27850j0());
        } else {
            super.mo24689O1();
        }
    }

    /* renamed from: p3 */
    private void m23276p3(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_weather_set_location);
        builder.setMessage((int) C17541R$string.trigger_sunrise_sunset_location_set_message).setCancelable(true).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6141t7(this, activity));
        builder.show();
    }

    /* renamed from: s3 */
    private void m23277s3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_sunrise_time_adjust);
        appCompatDialog.setTitle((CharSequence) mo27827K0().getString(C17541R$string.select_option));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.entry_option);
        NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.minute_picker);
        TableLayout tableLayout = (TableLayout) appCompatDialog.findViewById(C17532R$id.time_selection_table);
        int i = 0;
        numberPicker.setMinimum(0);
        numberPicker.setMaximum(59);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.hour_picker);
        numberPicker2.setMinimum(0);
        numberPicker2.setMaximum(23);
        numberPicker2.setValue(Math.abs(this.timeAdjustSeconds) / 3600);
        numberPicker.setValue((Math.abs(this.timeAdjustSeconds) / 60) % 60);
        tableLayout.setVisibility(this.timeAdjustSeconds == 0 ? 8 : 0);
        int i2 = this.timeAdjustSeconds;
        if (i2 < 0) {
            i = 1;
        } else if (i2 > 0) {
            i = 2;
        }
        spinner.setSelection(i);
        spinner.setOnItemSelectedListener(new C5751a(tableLayout));
        button.setOnClickListener(new C6165v7(this, appCompatDialog, spinner, numberPicker, numberPicker2));
        button2.setOnClickListener(new C6153u7(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m23272l3()[this.m_option];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        int i = this.timeAdjustSeconds;
        String str2 = "";
        if (i == 0) {
            return str2;
        }
        int abs = Math.abs(i) / 3600;
        int abs2 = (Math.abs(this.timeAdjustSeconds) / 60) % 60;
        StringBuilder sb = new StringBuilder();
        if (abs > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(abs);
            sb2.append(SelectableItem.m15535j1(C17541R$string.hour_one_char));
            sb2.append(abs2 > 0 ? " " : str2);
            str = sb2.toString();
        } else {
            str = str2;
        }
        sb.append(str);
        if (abs2 > 0) {
            str2 = abs2 + SelectableItem.m15535j1(C17541R$string.minute_one_char);
        }
        sb.append(str2);
        String sb3 = sb.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.timeAdjustSeconds < 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : "+");
        sb4.append(sb3);
        return sb4.toString();
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0 && s_timeChangedReceiver != null) {
            try {
                mo27827K0().unregisterReceiver(s_timeChangedReceiver);
                s_timeChangedReceiver = null;
            } catch (IllegalArgumentException e) {
                C8151a.m33873n(e);
            }
        }
        try {
            ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.pendingIntent);
            this.pendingIntent = null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7576y1.m31545u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        String str;
        String O0 = mo24672O0();
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        if (TextUtils.isEmpty(O0)) {
            str = "";
        } else {
            str = " (" + O0 + ")";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        mo31520q3(mo27827K0());
        if (s_triggerCounter == 0) {
            s_timeChangedReceiver = new C5753c((C5751a) null);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            try {
                mo27827K0().registerReceiver(s_timeChangedReceiver, intentFilter);
            } catch (IllegalArgumentException e) {
                C8151a.m33873n(e);
            }
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23272l3();
    }

    /* renamed from: j3 */
    public long mo31518j3() {
        return this.lastTriggered;
    }

    /* renamed from: k3 */
    public int mo31519k3() {
        return this.m_option;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == 1 && i2 == -1) {
            double doubleExtra = intent.getDoubleExtra("Latitude", 0.0d);
            double doubleExtra2 = intent.getDoubleExtra("Longitude", 0.0d);
            Context K0 = mo27827K0();
            C5163j2.m20067T5(K0, doubleExtra + "," + doubleExtra2);
            super.mo24689O1();
        }
    }

    /* renamed from: q3 */
    public void mo31520q3(Context context) {
        long j;
        int i;
        String e2 = C5163j2.m20145e2(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntent2 = this.pendingIntent;
        if (pendingIntent2 != null) {
            alarmManager.cancel(pendingIntent2);
            this.pendingIntent = null;
        }
        if (TextUtils.isEmpty(e2)) {
            C4878b.m18869h("Failed to schedule sunrise/sunset - no location set", mo27840Y0().longValue());
            return;
        }
        String[] split = e2.split(",");
        C11058a aVar = new C11058a(new C11158a(Double.valueOf(split[0]).doubleValue(), Double.valueOf(split[1]).doubleValue()), TimeZone.getDefault());
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        Calendar instance3 = Calendar.getInstance();
        instance2.add(5, 1);
        instance3.add(5, 2);
        long currentTimeMillis = System.currentTimeMillis();
        Calendar b = aVar.mo62044b(instance);
        long j2 = currentTimeMillis + 90000;
        if (j2 > b.getTimeInMillis() + ((long) (this.timeAdjustSeconds * 1000))) {
            b = aVar.mo62044b(instance2);
            if (j2 > b.getTimeInMillis() + ((long) (this.timeAdjustSeconds * 1000))) {
                b = aVar.mo62044b(instance3);
            }
        }
        Calendar a = aVar.mo62043a(instance);
        if (j2 > a.getTimeInMillis() + ((long) (this.timeAdjustSeconds * 1000))) {
            a = aVar.mo62043a(instance2);
            if (j2 > a.getTimeInMillis() + ((long) (this.timeAdjustSeconds * 1000))) {
                a = aVar.mo62043a(instance3);
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        C4878b.m18880s("Next SUNRISE / SUNSET: " + simpleDateFormat.format(a.getTime()) + " / " + simpleDateFormat.format(b.getTime()), mo27840Y0().longValue());
        Intent intent = new Intent(mo27827K0(), SunsetSunriseReceiver.class);
        intent.putExtra("trigger_guid", mo27847f1());
        if (this.m_option == 0) {
            intent.putExtra("is_sunrise", true);
            j = a.getTimeInMillis();
            i = this.timeAdjustSeconds;
        } else {
            intent.putExtra("is_sunrise", false);
            j = b.getTimeInMillis();
            i = this.timeAdjustSeconds;
        }
        long j3 = j + ((long) (i * 1000));
        if (mo27837X0() != null) {
            C4878b.m18880s("Scheduling trigger wakeup for: " + simpleDateFormat.format(Long.valueOf(j3)) + " (" + ((j3 - Calendar.getInstance().getTimeInMillis()) / 1000) + "s) Macro = " + mo27837X0().getName(), mo27840Y0().longValue());
        }
        Context K0 = mo27827K0();
        int i2 = alarmIdSunsetSunrise;
        alarmIdSunsetSunrise = i2 + 1;
        PendingIntent broadcast = PendingIntent.getBroadcast(K0, i2, intent, 134217728 | C6368b1.f14959b);
        this.pendingIntent = broadcast;
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(0, j3, broadcast);
        } else {
            alarmManager.setExact(0, j3, broadcast);
        }
    }

    /* renamed from: r3 */
    public void mo31521r3(long j) {
        this.lastTriggered = j;
    }

    /* renamed from: v2 */
    public void mo24677v2() {
        m23277s3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.timeAdjustSeconds);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public SunriseSunsetTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SunriseSunsetTrigger() {
        this.m_option = 0;
    }

    private SunriseSunsetTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.timeAdjustSeconds = parcel.readInt();
    }
}
