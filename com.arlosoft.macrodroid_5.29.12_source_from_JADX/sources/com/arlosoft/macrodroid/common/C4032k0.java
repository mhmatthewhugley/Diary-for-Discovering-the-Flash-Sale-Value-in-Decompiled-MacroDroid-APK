package com.arlosoft.macrodroid.common;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.ConfigureNotificationBarActivity;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.NotificationBarButtonReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.utils.C6395j0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.arlosoft.macrodroid.common.k0 */
/* compiled from: NotificationUtil */
public class C4032k0 {
    /* renamed from: a */
    public static Notification m15915a(Context context, int i, int i2, String str) {
        NotificationCompat.Builder builder;
        RemoteViews remoteViews;
        RemoteViews remoteViews2;
        int i3;
        RemoteViews remoteViews3;
        Context context2 = context;
        int i4 = i;
        if (!C5163j2.m20103Z(context)) {
            builder = new NotificationCompat.Builder(context2, str);
            builder.setSmallIcon(i4);
            builder.setVisibility(1);
            builder.setShowWhen(false);
            if (Build.VERSION.SDK_INT >= 31) {
                builder.setStyle(new NotificationCompat.DecoratedCustomViewStyle());
            }
            List<NotificationButton> b1 = C5163j2.m20120b1(context);
            int i5 = 7;
            int[] iArr = {C17532R$id.button1, C17532R$id.button2, C17532R$id.button3, C17532R$id.button4, C17532R$id.button5, C17532R$id.button6, C17532R$id.button7};
            int[] iArr2 = {C17532R$id.button_frame_1, C17532R$id.button_frame_2, C17532R$id.button_frame_3, C17532R$id.button_frame_4, C17532R$id.button_frame_5, C17532R$id.button_frame_6, C17532R$id.button_frame_7};
            boolean p = C5163j2.m20230p(context);
            if (b1.size() == 0) {
                if (p) {
                    remoteViews = new RemoteViews(context.getPackageName(), C17535R$layout.notification_bar_button_configure_state_dark);
                } else {
                    remoteViews = new RemoteViews(context.getPackageName(), C17535R$layout.notification_bar_button_configure_state);
                    if (!m15918d(context)) {
                        remoteViews.setImageViewResource(C17532R$id.notification_bar_configure_button, C17530R$drawable.ic_add_circle_black_48dp);
                        remoteViews.setTextColor(C17532R$id.current_mode, ContextCompat.getColor(context2, C17528R$color.default_text_color));
                    }
                }
                remoteViews.setOnClickPendingIntent(C17532R$id.notification_bar_configure_button, PendingIntent.getActivity(context2, 0, new Intent(context2, ConfigureNotificationBarActivity.class), C6368b1.f14959b | 268435456));
                if (!C5163j2.m20028O1(context)) {
                    remoteViews.setViewVisibility(2131363080, 8);
                } else {
                    remoteViews.setViewVisibility(2131363080, 0);
                }
                if (C5163j2.m20042Q1(context)) {
                    remoteViews.setTextViewText(C17532R$id.current_mode, C5163j2.m20083W0(context));
                } else {
                    remoteViews.setViewVisibility(C17532R$id.current_mode, 8);
                }
            } else {
                if (p) {
                    remoteViews2 = new RemoteViews(context.getPackageName(), C17535R$layout.include_notification_bar_buttons_dark);
                } else {
                    remoteViews2 = new RemoteViews(context.getPackageName(), C17535R$layout.include_notification_bar_buttons);
                    if (!m15918d(context)) {
                        remoteViews2.setTextColor(C17532R$id.current_mode, ContextCompat.getColor(context2, C17528R$color.default_text_color));
                    }
                }
                RemoteViews remoteViews4 = remoteViews2;
                for (int i6 = 0; i6 < 7; i6++) {
                    remoteViews4.setViewVisibility(iArr2[i6], 8);
                }
                if (!C5163j2.m20028O1(context)) {
                    remoteViews4.setViewVisibility(2131363080, 8);
                }
                int q = C5163j2.m20238q(context);
                int i7 = 0;
                while (i7 < b1.size() && i7 < i5) {
                    NotificationButton notificationButton = b1.get(i7);
                    Intent intent = new Intent(context2, NotificationBarButtonReceiver.class);
                    intent.setAction("" + notificationButton.mo27791a());
                    intent.putExtra("notificationButton", notificationButton.mo27791a());
                    PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, intent, 134217728 | C6368b1.f14959b);
                    if (notificationButton.mo27796e() != null) {
                        remoteViews4.setImageViewUri(iArr[i7], notificationButton.mo27796e());
                        remoteViews4.setOnClickPendingIntent(iArr[i7], broadcast);
                        remoteViews4.setViewVisibility(iArr2[i7], 0);
                        i3 = i7;
                        remoteViews3 = remoteViews4;
                    } else {
                        int i8 = iArr[i7];
                        String c = notificationButton.mo27793c();
                        PendingIntent pendingIntent = broadcast;
                        String str2 = c;
                        i3 = i7;
                        remoteViews3 = remoteViews4;
                        C6395j0.m24651c(context, remoteViews4, i8, str2, notificationButton.mo27794d(), -1, (String) null, Integer.valueOf(q));
                        remoteViews3.setOnClickPendingIntent(iArr[i3], pendingIntent);
                        remoteViews3.setViewVisibility(iArr2[i3], 0);
                    }
                    i7 = i3 + 1;
                    remoteViews4 = remoteViews3;
                    i5 = 7;
                }
                remoteViews = remoteViews4;
            }
            remoteViews.setImageViewResource(2131362906, C17530R$drawable.launcher_no_border);
            if (C5163j2.m20042Q1(context)) {
                remoteViews.setTextViewText(C17532R$id.current_mode, C5163j2.m20083W0(context));
            } else {
                remoteViews.setViewVisibility(C17532R$id.current_mode, 8);
            }
            builder.setContent(remoteViews);
            Intent intent2 = new Intent(context2, NewHomeScreenActivity.class);
            intent2.setFlags(603979776);
            builder.setContentIntent(PendingIntent.getActivity(context2, 0, intent2, C6368b1.f14959b | 268435456));
        } else {
            builder = new NotificationCompat.Builder(context2, "persistent_notification");
            builder.setSmallIcon(i4);
            builder.setLargeIcon((Bitmap) null);
        }
        builder.setPriority(i2);
        builder.setOngoing(true);
        Notification build = builder.build();
        build.when = 0;
        return build;
    }

    /* renamed from: b */
    public static Notification m15916b(Context context, int i, int i2, String str) {
        return m15917c(context, i, i2, str);
    }

    /* renamed from: c */
    private static Notification m15917c(Context context, int i, int i2, String str) {
        List list;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str);
        builder.setSmallIcon(i);
        builder.setPriority(i2);
        builder.setShowWhen(false);
        builder.setOngoing(true);
        builder.setForegroundServiceBehavior(1);
        String Q0 = C5163j2.m20041Q0(context);
        if (Q0 == null) {
            Q0 = "MacroDroid";
        }
        String P0 = C5163j2.m20034P0(context);
        if (P0 == null) {
            P0 = SelectableItem.m15535j1(C17541R$string.mode) + ": " + C5163j2.m20083W0(context);
        }
        if (C5163j2.m20007L1(context)) {
            builder.setContentTitle("MacroDroid " + SelectableItem.m15535j1(C17541R$string.mode) + ": " + C5163j2.m20083W0(context));
            if (C4373a.m17336h() != null) {
                list = C4373a.m17336h().mo28643l(20);
            } else {
                list = new ArrayList();
            }
            StringBuilder sb = new StringBuilder();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            if (list != null) {
                int i3 = 0;
                for (int i4 = 0; i4 < list.size() && i3 < 4; i4++) {
                    Macro Q = C4934n.m18998M().mo29682Q(((Long) ((Pair) list.get(i4)).first).longValue());
                    String format = simpleDateFormat.format(Long.valueOf(((Long) ((Pair) list.get(i4)).second).longValue()));
                    if (Q != null && !Q.isExcludedFromLog()) {
                        StringBuilder sb2 = new StringBuilder();
                        if (i3 != 0) {
                            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                        sb2.append(format);
                        sb2.append(" - ");
                        sb2.append(Q.getName());
                        String sb3 = sb2.toString();
                        sb.append(sb3);
                        if (i3 == 0) {
                            builder.setContentText(sb3);
                        }
                        i3++;
                    }
                }
            }
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(sb.toString()));
        } else {
            builder.setContentTitle(Q0);
            builder.setContentText(P0);
        }
        builder.setVisibility(1);
        Intent intent = new Intent(context, NewHomeScreenActivity.class);
        intent.setFlags(603979776);
        builder.setContentIntent(PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456));
        return builder.build();
    }

    /* renamed from: d */
    private static boolean m15918d(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
