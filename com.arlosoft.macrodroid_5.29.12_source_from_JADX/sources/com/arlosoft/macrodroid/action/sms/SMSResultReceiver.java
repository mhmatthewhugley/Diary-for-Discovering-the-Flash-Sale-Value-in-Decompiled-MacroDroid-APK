package com.arlosoft.macrodroid.action.sms;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.utils.C6368b1;

public class SMSResultReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static int f9231a = 950000;

    /* renamed from: b */
    private static final Uri f9232b = Uri.parse("content://sms/sent");

    public void onReceive(Context context, Intent intent) {
        int resultCode = getResultCode();
        String stringExtra = intent.getStringExtra("destination");
        boolean booleanExtra = intent.getBooleanExtra("AddToMessageLogExtra", false);
        String stringExtra2 = intent.getStringExtra("message");
        int intExtra = intent.getIntExtra("attempt_number", 1);
        int intExtra2 = intent.getIntExtra("SimId", 0);
        if (resultCode != -1) {
            int resultCode2 = getResultCode();
            String str = resultCode2 != 1 ? resultCode2 != 2 ? resultCode2 != 3 ? resultCode2 != 4 ? "Unknown" : "No service" : "Null PDU" : "Radio off" : "Generic failure";
            C4878b.m18868g("Send SMS Failed, result = " + str + " [" + stringExtra + ":" + stringExtra2 + "]");
            if (intExtra < 5) {
                Intent intent2 = new Intent(context, SMSRetryReceiver.class);
                intent2.putExtra("attempt_number", intExtra);
                intent2.putExtra("message", stringExtra2);
                intent2.putExtra("destination", stringExtra);
                intent2.putExtra("AddToMessageLogExtra", booleanExtra);
                intent2.putExtra("SimId", intExtra2);
                int i = f9231a;
                f9231a = i + 1;
                PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent2, 134217728 | C6368b1.f14960c);
                ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).setAlarmClock(new AlarmManager.AlarmClockInfo(System.currentTimeMillis() + WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, broadcast), broadcast);
                C4878b.m18873l("Scheduling retry SMS (Retry " + intExtra + ") in around " + 30 + "s");
                return;
            }
            C4878b.m18882u("Giving up on SMS sending after " + intExtra + " attempts");
            C4061t1.m16023v(context, "SMS sending failed", "Message to: " + stringExtra + " failed", false);
            return;
        }
        C4878b.m18873l("SMS Sent to: " + stringExtra);
    }
}
