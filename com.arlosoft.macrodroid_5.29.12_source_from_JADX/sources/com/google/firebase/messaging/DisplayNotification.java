package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.CommonNotificationBuilder;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class DisplayNotification {

    /* renamed from: a */
    private final ExecutorService f54961a;

    /* renamed from: b */
    private final Context f54962b;

    /* renamed from: c */
    private final NotificationParams f54963c;

    public DisplayNotification(Context context, NotificationParams notificationParams, ExecutorService executorService) {
        this.f54961a = executorService;
        this.f54962b = context;
        this.f54963c = notificationParams;
    }

    /* renamed from: b */
    private boolean m76809b() {
        if (((KeyguardManager) this.f54962b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.m4901f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f54962b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                if (next.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m76810c(CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) {
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.f54962b.getSystemService("notification")).notify(displayNotificationInfo.f54958b, displayNotificationInfo.f54959c, displayNotificationInfo.f54957a.build());
    }

    @Nullable
    /* renamed from: d */
    private ImageDownload m76811d() {
        ImageDownload f = ImageDownload.m76915f(this.f54963c.mo63386p("gcm.n.image"));
        if (f != null) {
            f.mo63366i(this.f54961a);
        }
        return f;
    }

    /* renamed from: e */
    private void m76812e(NotificationCompat.Builder builder, @Nullable ImageDownload imageDownload) {
        if (imageDownload != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.m66663b(imageDownload.mo63365g(), 5, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                imageDownload.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                imageDownload.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo63325a() {
        if (this.f54963c.mo63372a("gcm.n.noui")) {
            return true;
        }
        if (m76809b()) {
            return false;
        }
        ImageDownload d = m76811d();
        CommonNotificationBuilder.DisplayNotificationInfo e = CommonNotificationBuilder.m76795e(this.f54962b, this.f54963c);
        m76812e(e.f54957a, d);
        m76810c(e);
        return true;
    }
}
