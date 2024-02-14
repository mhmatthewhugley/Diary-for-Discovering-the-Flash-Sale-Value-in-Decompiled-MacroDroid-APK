package com.arlosoft.macrodroid.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.triggers.NotificationTrigger;

/* renamed from: com.arlosoft.macrodroid.utils.y0 */
/* compiled from: NotificationUtils */
public class C6459y0 {
    /* renamed from: a */
    public static boolean m24787a(String str, NotificationTrigger notificationTrigger) {
        for (String next : notificationTrigger.mo31367B3()) {
            if (next.equals(NotificationTrigger.f13658d) || next.equals("Any Application")) {
                return !notificationTrigger.mo31372G3();
            }
            if (next.equals(str)) {
                return !notificationTrigger.mo31372G3();
            }
        }
        return notificationTrigger.mo31372G3();
    }

    /* renamed from: b */
    public static void m24788b(Context context, String str) {
        NotificationManagerCompat.from(context).notify(0, new NotificationCompat.Builder(context).setSmallIcon((int) C17530R$drawable.ic_warning_white_24dp).setContentTitle(str).setContentText(context.getString(C17541R$string.please_reconigiure_file_path_to_accessible_location)).setContentIntent(PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse("macrodroid://www.macrodroid.com/macro/" + str)), C6368b1.f14959b | 268435456)).setPriority(2).setDefaults(-1).setChannelId("info_notification").setAutoCancel(true).build());
    }
}
