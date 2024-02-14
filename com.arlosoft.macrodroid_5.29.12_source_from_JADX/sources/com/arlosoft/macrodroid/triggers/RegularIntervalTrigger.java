package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.activities.RegularIntervalTriggerConfigureActivity;
import com.arlosoft.macrodroid.triggers.receivers.IntervalAlarmReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.Date;
import p119k3.C7535n1;
import p148q0.C8151a;

public class RegularIntervalTrigger extends Trigger {
    public static final Parcelable.Creator<RegularIntervalTrigger> CREATOR = new C5727a();
    private static final int SET_INTERVAL = 1024;
    private static int s_alarmCounter;
    private transient int m_alarmId;
    private boolean m_ignoreReferenceStartTime;
    private int m_minutes;
    private transient PendingIntent m_pendingIntent;
    private int m_seconds;
    private int m_startHour;
    private int m_startMinute;
    private boolean m_useAlarm;

    /* renamed from: com.arlosoft.macrodroid.triggers.RegularIntervalTrigger$a */
    class C5727a implements Parcelable.Creator<RegularIntervalTrigger> {
        C5727a() {
        }

        /* renamed from: a */
        public RegularIntervalTrigger createFromParcel(Parcel parcel) {
            return new RegularIntervalTrigger(parcel, (C5727a) null);
        }

        /* renamed from: b */
        public RegularIntervalTrigger[] newArray(int i) {
            return new RegularIntervalTrigger[i];
        }
    }

    /* synthetic */ RegularIntervalTrigger(Parcel parcel, C5727a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private long m23032g3() {
        long j = (long) (this.m_seconds * 1000);
        if (this.m_ignoreReferenceStartTime) {
            return j;
        }
        Date date = new Date();
        long hours = (((long) (((this.m_startHour * 60) * 60) + (this.m_startMinute * 60))) - ((long) ((((date.getHours() * 60) * 60) + (date.getMinutes() * 60)) + date.getSeconds()))) % 86400;
        if (hours <= 0) {
            hours += 86400;
        }
        if (this.m_seconds == 0) {
            C8151a.m33873n(new RuntimeException("RegularIntervalTrigger (enableTrigger) has a zero seconds value!"));
        }
        int i = this.m_seconds;
        if (hours <= ((long) i)) {
            return hours * 1000;
        }
        return Math.abs(((long) i) - ((86400 - hours) % ((long) i))) * 1000;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return this.m_seconds != 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_seconds;
        return SelectableItem.m15535j1(C17541R$string.trigger_regular_interval_text) + " " + String.format("%02d", new Object[]{Integer.valueOf(i / 3600)}) + ":" + String.format("%02d", new Object[]{Integer.valueOf((i / 60) % 60)}) + ":" + String.format("%02d", new Object[]{Integer.valueOf(i % 60)});
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        ((AlarmManager) mo27827K0().getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.m_pendingIntent);
        StringBuilder sb = new StringBuilder();
        sb.append("Cancelled ");
        sb.append(this.m_useAlarm ? "alarm clock" : "regular interval");
        sb.append(" for id: ");
        sb.append(this.m_alarmId);
        C4878b.m18880s(sb.toString(), mo27840Y0().longValue());
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7535n1.m31356u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24672O0();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        int i = this.m_minutes;
        if (i != 0) {
            this.m_seconds = i * 60;
        }
        if (this.m_seconds == 0) {
            C8151a.m33873n(new RuntimeException("RegularIntervalTrigger seconds value is zero"));
            return;
        }
        long g3 = m23032g3();
        int i2 = s_alarmCounter;
        s_alarmCounter = i2 + 1;
        this.m_alarmId = i2;
        Intent intent = new Intent(mo27827K0(), IntervalAlarmReceiver.class);
        intent.putExtra("alarmId", this.m_alarmId);
        this.m_pendingIntent = PendingIntent.getBroadcast(mo27827K0(), this.m_alarmId, intent, 134217728 | C6368b1.f14959b);
        mo31436j3(mo27827K0(), g3);
    }

    /* renamed from: h3 */
    public int mo31434h3() {
        return this.m_seconds;
    }

    /* renamed from: i3 */
    public int mo31435i3() {
        return this.m_alarmId;
    }

    /* renamed from: j3 */
    public void mo31436j3(Context context, long j) {
        if (this.f13696a && this.m_pendingIntent != null) {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            long g3 = m23032g3();
            int i = Build.VERSION.SDK_INT;
            if (this.m_useAlarm) {
                alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(System.currentTimeMillis() + g3, this.m_pendingIntent), this.m_pendingIntent);
                if (mo27837X0() != null && !mo27837X0().isExcludedFromLog()) {
                    C4878b.m18880s("Wake up (" + this.m_alarmId + ") scheduled for: " + (j / 1000) + "s", mo27840Y0().longValue());
                    return;
                }
                return;
            }
            if (i >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + g3, this.m_pendingIntent);
            } else {
                alarmManager.setExact(0, System.currentTimeMillis() + g3, this.m_pendingIntent);
            }
            if (mo27837X0() != null && !mo27837X0().isExcludedFromLog()) {
                C4878b.m18880s("Wake up (" + this.m_alarmId + ") scheduled for: " + (j / 1000) + "s", mo27840Y0().longValue());
            }
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == 1024 && i2 == -1) {
            int intExtra = intent.getIntExtra("Seconds", 0);
            this.m_seconds = intExtra;
            this.m_minutes = 0;
            if (intExtra == 0) {
                C8151a.m33873n(new RuntimeException("RegularIntervalTrigger (handleActivityResult) has a zero minutes value!"));
            }
            int intExtra2 = intent.getIntExtra("StartMinute", this.m_startMinute);
            this.m_startHour = intExtra2;
            this.m_startMinute = intent.getIntExtra("StartHour", intExtra2);
            this.m_ignoreReferenceStartTime = intent.getBooleanExtra("IgnoreStartTime", false);
            this.m_useAlarm = intent.getBooleanExtra("UseAlarm", this.m_useAlarm);
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, RegularIntervalTriggerConfigureActivity.class);
        int i = this.m_minutes;
        if (i != 0) {
            this.m_seconds = i * 60;
        }
        intent.putExtra("Seconds", this.m_seconds);
        intent.putExtra("StartMinute", this.m_startMinute);
        intent.putExtra("StartHour", this.m_startHour);
        intent.putExtra("IgnoreStartTime", this.m_ignoreReferenceStartTime);
        intent.putExtra("UseAlarm", this.m_useAlarm);
        j0.startActivityForResult(intent, 1024);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_minutes);
        parcel.writeInt(this.m_startMinute);
        parcel.writeInt(this.m_startHour);
        parcel.writeInt(this.m_seconds);
        parcel.writeInt(this.m_ignoreReferenceStartTime ^ true ? 1 : 0);
        parcel.writeInt(this.m_useAlarm ? 1 : 0);
    }

    public RegularIntervalTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public RegularIntervalTrigger() {
        this.m_useAlarm = true;
        this.m_startHour = 0;
        this.m_startMinute = 0;
        this.m_ignoreReferenceStartTime = false;
    }

    private RegularIntervalTrigger(Parcel parcel) {
        super(parcel);
        this.m_minutes = parcel.readInt();
        this.m_startMinute = parcel.readInt();
        this.m_startHour = parcel.readInt();
        this.m_seconds = parcel.readInt();
        boolean z = true;
        this.m_ignoreReferenceStartTime = parcel.readInt() == 0;
        this.m_useAlarm = parcel.readInt() == 0 ? false : z;
    }
}
