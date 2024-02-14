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
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.activities.TimerTriggerConfigureActivity;
import com.arlosoft.macrodroid.triggers.receivers.AlarmReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.UUID;
import org.apache.commons.cli.HelpFormatter;
import p119k3.C7476a2;
import p148q0.C8151a;
import p455ag.C17105a;

public class TimerTrigger extends Trigger {
    public static final Parcelable.Creator<TimerTrigger> CREATOR = new C5755a();
    private static final String EXTRA_COUNT = "count";
    private static final int SET_TIME = 8765;
    private static C5756b s_timeChangedReceiver = null;
    private static int s_triggerCounter = 0;
    private static int s_uniqueId = 657443637;
    private String m_alarmId;
    private boolean[] m_daysOfWeek;
    private int m_hour;
    private int m_minute;
    private transient PendingIntent m_pendingIntent;
    private int m_second;
    private boolean m_useAlarm;

    /* renamed from: com.arlosoft.macrodroid.triggers.TimerTrigger$a */
    class C5755a implements Parcelable.Creator<TimerTrigger> {
        C5755a() {
        }

        /* renamed from: a */
        public TimerTrigger createFromParcel(Parcel parcel) {
            return new TimerTrigger(parcel, (C5755a) null);
        }

        /* renamed from: b */
        public TimerTrigger[] newArray(int i) {
            return new TimerTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.TimerTrigger$b */
    private static class C5756b extends BroadcastReceiver {
        private C5756b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (C4061t1.m15965K0(context)) {
                for (Macro next : C4934n.m18998M().mo29710z()) {
                    Iterator<Trigger> it = next.getTriggerList().iterator();
                    while (it.hasNext()) {
                        Trigger next2 = it.next();
                        if ((next2 instanceof TimerTrigger) && next2.f13696a) {
                            C4878b.m18880s("Day/Time Trigger: Time zone change detected (" + TimeZone.getDefault().getID() + ") - Rescheduling", next.getGUID());
                            next2.mo31543T2();
                            next2.mo31544V2();
                        }
                    }
                }
            }
        }

        /* synthetic */ C5756b(C5755a aVar) {
            this();
        }
    }

    /* synthetic */ TimerTrigger(Parcel parcel, C5755a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private void m23325h3(Context context, long j, String str, int i) {
        Context context2 = context;
        long j2 = j;
        String str2 = str;
        int i2 = i;
        AlarmManager alarmManager = (AlarmManager) context2.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (this.m_pendingIntent != null) {
            C17105a.m100579a(this.m_classType, "Cancelling existing alarm: %s", this.m_alarmId);
            try {
                alarmManager.cancel(this.m_pendingIntent);
            } catch (Exception unused) {
            }
        }
        Intent intent = new Intent(context2, AlarmReceiver.class);
        intent.putExtra("alarmId", str2);
        intent.putExtra(EXTRA_COUNT, i2);
        intent.putExtra("trigger_time", j2);
        StringBuilder sb = new StringBuilder();
        sb.append("Scheduling alarm (");
        sb.append(str2);
        sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append(i2);
        sb.append(") for: ");
        sb.append((j2 - Calendar.getInstance().getTimeInMillis()) / 1000);
        sb.append("s");
        if (mo27837X0() != null) {
            long timeInMillis = (j2 - Calendar.getInstance().getTimeInMillis()) / 1000;
            C4878b.m18880s("Day/Time Trigger - Schedule alarm (" + str2 + ") for: " + (timeInMillis / 3600) + "h " + ((timeInMillis / 60) % 60) + "m " + (timeInMillis % 60) + "s (totalSeconds = " + timeInMillis + ", epochtime = " + timeInMillis + ")", mo27840Y0().longValue());
        }
        Context K0 = mo27827K0();
        int i3 = s_uniqueId;
        s_uniqueId = i3 + 1;
        PendingIntent broadcast = PendingIntent.getBroadcast(K0, i3, intent, 134217728 | C6368b1.f14959b);
        this.m_pendingIntent = broadcast;
        if (this.m_useAlarm) {
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, this.m_pendingIntent), this.m_pendingIntent);
            return;
        }
        long j3 = j;
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(0, j3, broadcast);
        } else {
            alarmManager.setExact(0, j3, broadcast);
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        boolean z;
        int i = 6;
        String[] strArr = {SelectableItem.m15535j1(C17541R$string.monday3), SelectableItem.m15535j1(C17541R$string.tuesday3), SelectableItem.m15535j1(C17541R$string.wednesday3), SelectableItem.m15535j1(C17541R$string.thursday3), SelectableItem.m15535j1(C17541R$string.friday3), SelectableItem.m15535j1(C17541R$string.saturday3), SelectableItem.m15535j1(C17541R$string.sunday3)};
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", new Object[]{Integer.valueOf(this.m_hour)}));
        sb.append(":");
        sb.append(String.format("%02d", new Object[]{Integer.valueOf(this.m_minute)}));
        int i2 = this.m_second;
        if (i2 != 0) {
            str = String.format(":%02d", new Object[]{Integer.valueOf(i2)});
        } else {
            str = "";
        }
        sb.append(str);
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
            i = i5;
        }
        if (i4 == -1) {
            return "";
        }
        if (!z || i - i4 <= 1) {
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
            sb2.append(strArr[i4]);
            sb2.append(" - ");
            sb2.append(strArr[i]);
        }
        return sb2.toString();
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
        this.f13696a = false;
        AlarmManager alarmManager = (AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (this.m_pendingIntent != null) {
            C17105a.m100579a(this.m_classType, "Cancelling alarm: %s", this.m_alarmId);
            alarmManager.cancel(this.m_pendingIntent);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7476a2.m31072u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        String O0 = mo24672O0();
        if (!TextUtils.isEmpty(O0)) {
            return O0;
        }
        return mo25559a1();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_timeChangedReceiver = new C5756b((C5755a) null);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            try {
                mo27827K0().registerReceiver(s_timeChangedReceiver, intentFilter);
            } catch (IllegalArgumentException e) {
                C8151a.m33873n(e);
            }
        }
        s_triggerCounter++;
        this.f13696a = true;
        this.m_alarmId = UUID.randomUUID().toString();
        mo31536i3(true);
    }

    /* renamed from: g3 */
    public String mo31535g3() {
        return this.m_alarmId;
    }

    /* renamed from: i3 */
    public void mo31536i3(boolean z) {
        long j = Long.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.m_daysOfWeek;
            if (i < zArr.length) {
                if (zArr[i]) {
                    i2++;
                    Calendar instance = Calendar.getInstance();
                    instance.add(13, 1);
                    Calendar instance2 = Calendar.getInstance();
                    int i3 = (instance.get(7) - 2) % 7;
                    int i4 = instance.get(11);
                    int i5 = instance.get(12);
                    instance.get(13);
                    instance2.add(11, this.m_hour - i4);
                    instance2.add(12, this.m_minute - i5);
                    instance2.set(13, 0);
                    instance2.set(14, 0);
                    instance2.add(13, this.m_second);
                    if (i3 != i) {
                        instance2.add(6, (i - i3) % 7);
                    }
                    if (!z) {
                        instance.add(10, 1);
                    }
                    if (instance2.before(instance)) {
                        instance2.add(7, 7);
                    }
                    long timeInMillis = instance2.getTimeInMillis();
                    if (timeInMillis < j) {
                        j = timeInMillis;
                    }
                }
                i++;
            } else {
                m23325h3(mo27827K0(), j, this.m_alarmId, i2);
                return;
            }
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == SET_TIME && i2 == -1) {
            this.m_hour = intent.getIntExtra("Hour", 0);
            this.m_minute = intent.getIntExtra("Minute", 0);
            this.m_second = intent.getIntExtra("Second", 0);
            this.m_daysOfWeek = intent.getBooleanArrayExtra("DaysOfWeek");
            this.m_useAlarm = intent.getBooleanExtra("UseAlarm", false);
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, TimerTriggerConfigureActivity.class);
        intent.putExtra("DaysOfWeek", this.m_daysOfWeek);
        intent.putExtra("Hour", this.m_hour);
        intent.putExtra("Minute", this.m_minute);
        intent.putExtra("Second", this.m_second);
        intent.putExtra("UseAlarm", this.m_useAlarm);
        j0.startActivityForResult(intent, SET_TIME);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_hour);
        parcel.writeInt(this.m_minute);
        parcel.writeInt(this.m_second);
        parcel.writeBooleanArray(this.m_daysOfWeek);
        parcel.writeInt(this.m_useAlarm ? 1 : 0);
    }

    public TimerTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public TimerTrigger() {
        this.m_daysOfWeek = new boolean[7];
        this.m_useAlarm = true;
    }

    private TimerTrigger(Parcel parcel) {
        super(parcel);
        this.m_daysOfWeek = new boolean[7];
        boolean z = true;
        this.m_useAlarm = true;
        this.m_hour = parcel.readInt();
        this.m_minute = parcel.readInt();
        this.m_second = parcel.readInt();
        parcel.readBooleanArray(this.m_daysOfWeek);
        this.m_useAlarm = parcel.readInt() == 0 ? false : z;
    }
}
