package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.activities.DayOfMonthConfigureActivity;
import com.arlosoft.macrodroid.triggers.activities.DayOfWeekConfigureActivity;
import com.arlosoft.macrodroid.triggers.receivers.DayTriggerReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.utils.C6424s;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;
import p119k3.C7566w;

public class DayTrigger extends Trigger {
    public static final Parcelable.Creator<DayTrigger> CREATOR = new C5633a();
    private static final String EXTRA_ALARM_ID = "alarmId";
    private static final int ID_SET_DAY_OF_MONTH = 2;
    private static final int ID_SET_DAY_OF_WEEK = 1;
    private static int s_uniqueId = 20000;
    private String m_alarmId;
    private transient int m_alarmTrackerId;
    private int m_dayOfMonth;
    private int m_dayOfWeek;
    private int m_hour;
    private int m_minute;
    private int m_monthOfYear;
    private int m_option;
    private transient PendingIntent m_pendingIntent;
    private final transient C5634b m_timeChangedReceiver;
    private boolean m_useAlarm;

    /* renamed from: com.arlosoft.macrodroid.triggers.DayTrigger$a */
    class C5633a implements Parcelable.Creator<DayTrigger> {
        C5633a() {
        }

        /* renamed from: a */
        public DayTrigger createFromParcel(Parcel parcel) {
            return new DayTrigger(parcel, (C5633a) null);
        }

        /* renamed from: b */
        public DayTrigger[] newArray(int i) {
            return new DayTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.DayTrigger$b */
    private class C5634b extends BroadcastReceiver {
        private C5634b() {
        }

        public void onReceive(Context context, Intent intent) {
            DayTrigger dayTrigger = DayTrigger.this;
            if (dayTrigger.f13696a && C4061t1.m15965K0(dayTrigger.mo27827K0())) {
                C4878b.m18879r("Day of Week/Month Trigger: Time zone change detected (" + TimeZone.getDefault().getID() + ") - Rescheduling");
                DayTrigger.this.mo31543T2();
                DayTrigger.this.mo31544V2();
            }
        }

        /* synthetic */ C5634b(DayTrigger dayTrigger, C5633a aVar) {
            this();
        }
    }

    /* synthetic */ DayTrigger(Parcel parcel, C5633a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m22050g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_day_of_week), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_day_of_month)};
    }

    /* renamed from: i3 */
    private void m22051i3(Context context, long j, String str) {
        try {
            if (this.m_pendingIntent != null) {
                ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.m_pendingIntent);
                this.m_pendingIntent = null;
            }
        } catch (Exception unused) {
        }
        C4878b.m18880s(mo27837X0().getName() + " - Scheduling next wakeup for " + ((j - System.currentTimeMillis()) / 1000) + "s", mo27840Y0().longValue());
        Intent intent = new Intent(context, DayTriggerReceiver.class);
        intent.putExtra(EXTRA_ALARM_ID, str);
        this.m_pendingIntent = PendingIntent.getBroadcast(mo27827K0(), this.m_alarmTrackerId, intent, 134217728 | C6368b1.f14959b);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = Build.VERSION.SDK_INT;
        if (this.m_useAlarm) {
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, this.m_pendingIntent), this.m_pendingIntent);
        } else if (i >= 23) {
            alarmManager.setExactAndAllowWhileIdle(0, j, this.m_pendingIntent);
        } else {
            alarmManager.setExact(0, j, this.m_pendingIntent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_option == 0) {
            return SelectableItem.m15535j1(C17541R$string.trigger_day_of_week);
        }
        return SelectableItem.m15535j1(C17541R$string.trigger_day_of_month);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_option == 0) {
            return C6424s.m24734a(this.m_dayOfWeek) + " " + String.format("%02d", new Object[]{Integer.valueOf(this.m_hour)}) + ":" + String.format("%02d", new Object[]{Integer.valueOf(this.m_minute)});
        }
        String j1 = this.m_monthOfYear == 0 ? SelectableItem.m15535j1(C17541R$string.every_month) : C6424s.m24735b()[this.m_monthOfYear - 1];
        return this.m_dayOfMonth + " " + j1 + " (" + String.format("%02d", new Object[]{Integer.valueOf(this.m_hour)}) + ":" + String.format("%02d", new Object[]{Integer.valueOf(this.m_minute)}) + ")";
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        mo27827K0().unregisterReceiver(this.m_timeChangedReceiver);
        ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.m_pendingIntent);
        this.m_pendingIntent = null;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7566w.m31497u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24672O0();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        this.m_alarmId = UUID.randomUUID().toString();
        int i = s_uniqueId;
        s_uniqueId = i + 1;
        this.m_alarmTrackerId = i;
        mo27827K0().registerReceiver(this.m_timeChangedReceiver, new IntentFilter("android.intent.action.TIME_SET"));
        mo31076j3(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22050g3();
    }

    /* renamed from: h3 */
    public String mo31075h3() {
        return this.m_alarmId;
    }

    /* renamed from: j3 */
    public void mo31076j3(boolean z) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(12);
        int i3 = instance.get(13);
        int i4 = this.m_option;
        if (i4 == 0) {
            int i5 = (instance.get(7) - 2) % 7;
            instance2.add(11, this.m_hour - i);
            instance2.add(12, this.m_minute - i2);
            instance2.set(13, 0);
            int i6 = this.m_dayOfWeek;
            if (i5 != i6) {
                instance2.add(6, (i6 - i5) % 7);
            }
            if (!z) {
                instance.add(10, 1);
            }
            if (instance2.before(instance)) {
                instance2.add(7, 7);
            }
        } else if (i4 == 1) {
            int i7 = instance.get(5);
            int i8 = instance.get(2) + 1;
            instance2.set(11, this.m_hour);
            instance2.set(12, this.m_minute);
            instance2.set(13, 0);
            instance2.set(5, this.m_dayOfMonth);
            int i9 = this.m_monthOfYear;
            if (i9 == 0) {
                instance2.set(2, instance.get(2));
                int i10 = this.m_dayOfMonth;
                if (i7 > i10 || ((i7 == i10 && i > this.m_hour) || ((i7 == i10 && i == this.m_hour && i2 >= this.m_minute) || (i7 == i10 && i == this.m_hour && i2 == this.m_minute && i3 > 0)))) {
                    instance2.add(2, 1);
                }
            } else {
                instance2.set(2, i9 - 1);
                instance2.set(1, instance.get(1));
                int i11 = this.m_monthOfYear;
                if (i8 > i11 || ((i8 == i11 && i7 > this.m_dayOfMonth) || ((i8 == i11 && i7 == this.m_dayOfMonth && i > this.m_hour) || ((i8 == i11 && i7 == this.m_dayOfMonth && i == this.m_hour && i2 >= this.m_minute) || (i8 == i11 && i7 == this.m_dayOfMonth && i == this.m_hour && i2 == this.m_minute && i3 > 0))))) {
                    instance2.add(1, 1);
                }
            }
        }
        m22051i3(mo27827K0(), instance2.getTimeInMillis(), this.m_alarmId);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == 1 && i2 == -1) {
            this.m_hour = intent.getIntExtra("Hour", 0);
            this.m_minute = intent.getIntExtra("Minute", 0);
            this.m_dayOfWeek = intent.getIntExtra("DayOfWeek", 0);
            this.m_useAlarm = intent.getBooleanExtra("UseAlarm", this.m_useAlarm);
            mo24689O1();
        }
        if (i == 2 && i2 == -1) {
            this.m_hour = intent.getIntExtra("Hour", 0);
            this.m_minute = intent.getIntExtra("Minute", 0);
            this.m_dayOfMonth = intent.getIntExtra("DayOfMonth", 0);
            this.m_monthOfYear = intent.getIntExtra("MonthOfYear", 0);
            this.m_useAlarm = intent.getBooleanExtra("UseAlarm", this.m_useAlarm);
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Activity j0 = mo27850j0();
        if (this.m_option == 0) {
            Intent intent = new Intent(j0, DayOfWeekConfigureActivity.class);
            intent.putExtra("DayOfWeek", this.m_dayOfWeek);
            intent.putExtra("Hour", this.m_hour);
            intent.putExtra("Minute", this.m_minute);
            intent.putExtra("UseAlarm", this.m_useAlarm);
            j0.startActivityForResult(intent, 1);
            return;
        }
        Intent intent2 = new Intent(j0, DayOfMonthConfigureActivity.class);
        intent2.putExtra("DayOfMonth", this.m_dayOfMonth);
        intent2.putExtra("MonthOfYear", this.m_monthOfYear);
        intent2.putExtra("Hour", this.m_hour);
        intent2.putExtra("Minute", this.m_minute);
        intent2.putExtra("UseAlarm", this.m_useAlarm);
        j0.startActivityForResult(intent2, 2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_hour);
        parcel.writeInt(this.m_minute);
        parcel.writeInt(this.m_dayOfWeek);
        parcel.writeInt(this.m_dayOfMonth);
        parcel.writeInt(this.m_monthOfYear);
        parcel.writeInt(this.m_useAlarm ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public DayTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DayTrigger() {
        this.m_timeChangedReceiver = new C5634b(this, (C5633a) null);
        this.m_useAlarm = true;
    }

    private DayTrigger(Parcel parcel) {
        super(parcel);
        this.m_timeChangedReceiver = new C5634b(this, (C5633a) null);
        boolean z = true;
        this.m_useAlarm = true;
        this.m_option = parcel.readInt();
        this.m_hour = parcel.readInt();
        this.m_minute = parcel.readInt();
        this.m_dayOfWeek = parcel.readInt();
        this.m_dayOfMonth = parcel.readInt();
        this.m_monthOfYear = parcel.readInt();
        this.m_useAlarm = parcel.readInt() == 0 ? false : z;
    }
}
