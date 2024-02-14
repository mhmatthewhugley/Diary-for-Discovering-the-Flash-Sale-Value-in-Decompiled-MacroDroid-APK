package p177v1;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.utils.C6368b1;
import kotlin.jvm.internal.C13706o;

/* renamed from: v1.a */
/* compiled from: HelperCommonFunctionality.kt */
public final class C10316a {

    /* renamed from: a */
    public static final C10316a f23482a = new C10316a();

    private C10316a() {
    }

    /* renamed from: a */
    public static final void m40521a(Context context, String str, String str2) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "actionName");
        C13706o.m87929f(str2, "requiredVersion");
        PendingIntent activity = PendingIntent.getActivity(context, 29873, new Intent("android.intent.action.VIEW", Uri.parse("https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/")), C6368b1.f14959b | 268435456);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        NotificationCompat.Builder when = builder.setContentTitle(str).setWhen(System.currentTimeMillis());
        when.setContentText(context.getString(C17541R$string.helper_apk_required) + str2 + "+)").setContentIntent(activity).setSmallIcon((int) C17530R$drawable.ic_warning_white_24dp).setAutoCancel(true).setColor(ContextCompat.getColor(context, 2131100777)).setChannelId("vital_functionality");
        Notification build = builder.build();
        C13706o.m87928e(build, "builder.build()");
        Object systemService = context.getSystemService("notification");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(29873, build);
    }
}
