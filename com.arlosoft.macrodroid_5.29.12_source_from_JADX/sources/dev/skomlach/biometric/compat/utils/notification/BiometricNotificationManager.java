package dev.skomlach.biometric.compat.utils.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12114c;
import dev.skomlach.common.misc.C12120d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p021c9.C1431a;
import p261f9.C12250b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/notification/BiometricNotificationManager;", "", "Lja/u;", "initNotificationsPreferences", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "builder", "showNotification", "dismissAll", "Ldev/skomlach/biometric/compat/BiometricType;", "type", "dismiss", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "", "CHANNEL_ID", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/lang/Runnable;", "notificationReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/core/app/NotificationManagerCompat;", "notificationCompat", "Landroidx/core/app/NotificationManagerCompat;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricNotificationManager.kt */
public final class BiometricNotificationManager {
    public static final String CHANNEL_ID = "biometric";
    public static final BiometricNotificationManager INSTANCE;
    private static final Context appContext;
    private static final NotificationManagerCompat notificationCompat;
    private static final AtomicReference<Runnable> notificationReference = new AtomicReference<>((Object) null);

    static {
        BiometricNotificationManager biometricNotificationManager = new BiometricNotificationManager();
        INSTANCE = biometricNotificationManager;
        Context g = C12104a.f58372a.mo68283g();
        appContext = g;
        NotificationManagerCompat from = NotificationManagerCompat.from(g);
        C13706o.m87928e(from, "from(appContext)");
        notificationCompat = from;
        biometricNotificationManager.initNotificationsPreferences();
    }

    private BiometricNotificationManager() {
    }

    private final void initNotificationsPreferences() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                NotificationManagerCompat notificationManagerCompat = notificationCompat;
                NotificationChannel notificationChannel = notificationManagerCompat.getNotificationChannel(CHANNEL_ID);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel(CHANNEL_ID, "Biometric", 2);
                }
                notificationChannel.setShowBadge(false);
                notificationManagerCompat.createNotificationChannel(notificationChannel);
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showNotification$lambda-0  reason: not valid java name */
    public static final void m101367showNotification$lambda0(BiometricPromptCompat.Builder builder) {
        C13706o.m87929f(builder, "$builder");
        try {
            Intent intent = new Intent();
            for (BiometricType next : builder.getAllAvailableTypes()) {
                Context context = appContext;
                Notification build = new NotificationCompat.Builder(context, CHANNEL_ID).setOnlyAlertOnce(true).setAutoCancel(true).setLocalOnly(true).setContentTitle(builder.getTitle()).setContentText(builder.getDescription()).setDeleteIntent(PendingIntent.getBroadcast(context, 2, intent, C12120d.f58384a.mo68316c() ? 33554432 : 134217728)).setSmallIcon(next.getIconId()).build();
                C13706o.m87928e(build, "Builder(appContext, CHAN…Icon(type.iconId).build()");
                C12250b bVar = C12250b.f58845a;
                if (bVar.mo68577f()) {
                    if (bVar.mo68576e(CHANNEL_ID)) {
                        notificationCompat.notify(next.hashCode(), build);
                        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricNotificationManager", "Notification posted");
                    }
                }
                BiometricLoggerImpl.INSTANCE.mo68217d("BiometricNotificationManager", "Notifications not allowed");
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public final void dismiss(BiometricType biometricType) {
        try {
            NotificationManagerCompat notificationManagerCompat = notificationCompat;
            if (biometricType != null) {
                notificationManagerCompat.cancel(biometricType.hashCode());
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public final void dismissAll() {
        AtomicReference<Runnable> atomicReference = notificationReference;
        Runnable runnable = atomicReference.get();
        if (runnable != null) {
            C12114c.f58379a.mo68307i(runnable);
            atomicReference.set((Object) null);
        }
        try {
            for (BiometricType hashCode : BiometricType.values()) {
                notificationCompat.cancel(hashCode.hashCode());
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    public final void showNotification(BiometricPromptCompat.Builder builder) {
        C13706o.m87929f(builder, "builder");
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricNotificationManager", "showNotification");
        dismissAll();
        C1431a aVar = new C1431a(builder);
        C12114c cVar = C12114c.f58379a;
        cVar.mo68305g(aVar);
        if (builder.getMultiWindowSupport().mo68457j()) {
            notificationReference.set(aVar);
            cVar.mo68306h(aVar, (long) appContext.getResources().getInteger(17694722));
        }
    }
}
