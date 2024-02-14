package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzch;
import com.google.android.play.core.internal.zzx;
import com.google.android.play.core.internal.zzz;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzb extends zzx {

    /* renamed from: a */
    private final zzag f51247a = new zzag("AssetPackExtractionService");

    /* renamed from: c */
    private final Context f51248c;

    /* renamed from: d */
    private final zzbh f51249d;

    /* renamed from: f */
    private final zzl f51250f;

    /* renamed from: g */
    private final zzci f51251g;
    @VisibleForTesting

    /* renamed from: o */
    final NotificationManager f51252o;

    zzb(Context context, zzbh zzbh, zzl zzl, zzci zzci) {
        this.f51248c = context;
        this.f51249d = zzbh;
        this.f51250f = zzl;
        this.f51251g = zzci;
        this.f51252o = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: A1 */
    private final synchronized void m70539A1(Bundle bundle, zzz zzz) throws RemoteException {
        Notification.Builder builder;
        this.f51247a.mo59805a("updateServiceState AIDL call", new Object[0]);
        if (zzch.m70928b(this.f51248c)) {
            if (zzch.m70927a(this.f51248c)) {
                int i = bundle.getInt("action_type");
                this.f51251g.mo59701c(zzz);
                if (i == 1) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 26) {
                        m70540t1(bundle.getString("notification_channel_name"));
                    }
                    this.f51250f.mo59783g(true);
                    zzci zzci = this.f51251g;
                    String string = bundle.getString("notification_title");
                    String string2 = bundle.getString("notification_subtext");
                    long j = bundle.getLong("notification_timeout", 600000);
                    Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                    if (i2 >= 26) {
                        builder = new Notification.Builder(this.f51248c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
                    } else {
                        builder = new Notification.Builder(this.f51248c).setPriority(-2);
                    }
                    if (parcelable instanceof PendingIntent) {
                        builder.setContentIntent((PendingIntent) parcelable);
                    }
                    Notification.Builder ongoing = builder.setSmallIcon(17301633).setOngoing(false);
                    if (string == null) {
                        string = "Downloading additional file";
                    }
                    Notification.Builder contentTitle = ongoing.setContentTitle(string);
                    if (string2 == null) {
                        string2 = "Transferring";
                    }
                    contentTitle.setSubText(string2);
                    int i3 = bundle.getInt("notification_color");
                    if (i3 != 0) {
                        builder.setColor(i3).setVisibility(-1);
                    }
                    zzci.mo59699a(builder.build());
                    this.f51248c.bindService(new Intent(this.f51248c, ExtractionForegroundService.class), this.f51251g, 1);
                    return;
                } else if (i == 2) {
                    this.f51250f.mo59783g(false);
                    this.f51251g.mo59700b();
                    return;
                } else {
                    this.f51247a.mo59806b("Unknown action type received: %d", Integer.valueOf(i));
                    zzz.mo59909g0(new Bundle());
                    return;
                }
            }
        }
        zzz.mo59909g0(new Bundle());
    }

    /* renamed from: t1 */
    private final synchronized void m70540t1(@Nullable String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        this.f51252o.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    /* renamed from: X4 */
    public final void mo59615X4(Bundle bundle, zzz zzz) throws RemoteException {
        m70539A1(bundle, zzz);
    }

    /* renamed from: p4 */
    public final void mo59616p4(Bundle bundle, zzz zzz) throws RemoteException {
        this.f51247a.mo59805a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!zzch.m70928b(this.f51248c) || !zzch.m70927a(this.f51248c)) {
            zzz.mo59909g0(new Bundle());
            return;
        }
        this.f51249d.mo59634M();
        zzz.mo59910v0(new Bundle());
    }
}
