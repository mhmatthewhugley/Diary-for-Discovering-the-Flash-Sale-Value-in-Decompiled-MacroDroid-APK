package p156r2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.arlosoft.macrodroid.C17530R$drawable;
import java.net.URLEncoder;
import kotlin.jvm.internal.C13706o;

/* renamed from: r2.a */
/* compiled from: StorageAccessFrameworkHelper.kt */
public final class C8194a {

    /* renamed from: a */
    public static final C8194a f19866a = new C8194a();

    private C8194a() {
    }

    /* renamed from: a */
    public static final void m34000a(Context context, String str, String str2) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "userMessage");
        C13706o.m87929f(str2, "macroName");
        try {
            PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse("macrodroid://www.macrodroid.com/macro/" + URLEncoder.encode(str2, "UTF-8"))), 268435456);
            NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(context).setSmallIcon((int) C17530R$drawable.material_ic_error_24px_svg).setContentTitle(str2).setContentText(str).setAutoCancel(true).setContentIntent(activity).setChannelId("vital_functionality").setContentIntent(activity);
            C13706o.m87928e(contentIntent, "Builder(context)\n       …tentIntent(pendingIntent)");
            NotificationManagerCompat from = NotificationManagerCompat.from(context);
            C13706o.m87928e(from, "from(context)");
            from.notify(0, contentIntent.build());
        } catch (Exception unused) {
        }
    }
}
