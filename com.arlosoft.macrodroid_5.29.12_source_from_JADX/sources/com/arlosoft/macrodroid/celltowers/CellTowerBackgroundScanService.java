package com.arlosoft.macrodroid.celltowers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CellTowerBackgroundScanService extends Service {

    /* renamed from: a */
    private static long f10113a;

    /* renamed from: c */
    private static PendingIntent f10114c;

    /* renamed from: d */
    private static String f10115d;

    /* renamed from: a */
    public static long m15183a(int i) {
        return System.currentTimeMillis() + ((long) (i * 60 * 1000));
    }

    /* renamed from: b */
    public static void m15184b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntent = f10114c;
        if (pendingIntent != null) {
            alarmManager.cancel(pendingIntent);
        }
        context.stopService(new Intent(context, CellTowerBackgroundScanService.class));
        NotificationManagerCompat.from(context).cancel(8835);
    }

    /* renamed from: c */
    public static String m15185c() {
        return f10115d;
    }

    /* renamed from: d */
    public static void m15186d(Context context, String str) {
        if (System.currentTimeMillis() < f10113a - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intent intent = new Intent(context, CellTowerBGScanReceiver.class);
            intent.putExtra("cellTowerGroupName", str);
            f10114c = PendingIntent.getBroadcast(context, 8836, intent, 134217728 | C6368b1.f14959b);
            if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, f10114c);
            } else {
                alarmManager.setExact(0, System.currentTimeMillis() + WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, f10114c);
            }
        } else {
            m15184b(context);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C4878b.m18873l("Cell background Scan service created");
    }

    public void onDestroy() {
        C4878b.m18873l("Cell background scan service destroyed");
        f10115d = null;
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return 3;
        }
        String stringExtra = intent.getStringExtra("cellTowerGroupName");
        f10115d = stringExtra;
        f10113a = intent.getLongExtra("endTime", 0);
        String format = new SimpleDateFormat("HH:mm").format(new Date(f10113a));
        Intent intent2 = new Intent(this, CellTowerStopScanningReceiver.class);
        int i3 = C6368b1.f14959b;
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent2, i3 | 268435456);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon((int) C17530R$drawable.ic_radio_tower_white_24dp);
        builder.setContentTitle(getString(C17541R$string.scanning_cell_towers));
        builder.setContentText(stringExtra + ": " + getString(C17541R$string.scanning_ends_at) + " " + format);
        builder.setVisibility(1);
        builder.addAction(0, getString(C17541R$string.stop_scanning), broadcast);
        builder.setOngoing(true);
        builder.setWhen(0);
        builder.setPriority(2);
        builder.setChannelId("info_notification");
        Intent intent3 = new Intent(this, CellTowerGroupActivity.class);
        intent3.putExtra("CellTowerGroupName", stringExtra);
        builder.setContentIntent(PendingIntent.getActivity(this, 0, intent3, i3 | 268435456));
        NotificationManagerCompat.from(this).notify(8835, builder.build());
        m15186d(this, stringExtra);
        return 3;
    }
}
