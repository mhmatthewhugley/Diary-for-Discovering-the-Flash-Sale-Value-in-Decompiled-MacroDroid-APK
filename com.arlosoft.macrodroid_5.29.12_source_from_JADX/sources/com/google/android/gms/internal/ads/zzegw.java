package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.C1721R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzegw extends zzbyu {

    /* renamed from: a */
    private final Context f33994a;

    /* renamed from: c */
    private final zzdxq f33995c;

    /* renamed from: d */
    private final zzcgu f33996d;

    /* renamed from: f */
    private final zzego f33997f;

    /* renamed from: g */
    private final zzfir f33998g;

    public zzegw(Context context, zzego zzego, zzcgu zzcgu, zzdxq zzdxq, zzfir zzfir) {
        this.f33994a = context;
        this.f33995c = zzdxq;
        this.f33996d = zzcgu;
        this.f33997f = zzego;
        this.f33998g = zzfir;
    }

    /* renamed from: Kb */
    public static void m48813Kb(Context context, zzdxq zzdxq, zzfir zzfir, zzego zzego, String str, String str2) {
        m48814Lb(context, zzdxq, zzfir, zzego, str, str2, new HashMap());
    }

    /* renamed from: Lb */
    public static void m48814Lb(Context context, zzdxq zzdxq, zzfir zzfir, zzego zzego, String str, String str2, Map map) {
        String str3;
        String str4 = "offline";
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27249s7)).booleanValue()) {
            zzfiq b = zzfiq.m50227b(str2);
            b.mo45774a("gqi", str);
            if (true == zzt.m2904q().mo43505v(context)) {
                str4 = CustomTabsCallback.ONLINE_EXTRAS_KEY;
            }
            b.mo45774a("device_connectivity", str4);
            b.mo45774a("event_timestamp", String.valueOf(zzt.m2889b().mo21950a()));
            for (Map.Entry entry : map.entrySet()) {
                b.mo45774a((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zzfir.mo45783b(b);
        } else {
            zzdxp a = zzdxq.mo45050a();
            a.mo45041b("gqi", str);
            a.mo45041b("action", str2);
            if (true == zzt.m2904q().mo43505v(context)) {
                str4 = CustomTabsCallback.ONLINE_EXTRAS_KEY;
            }
            a.mo45041b("device_connectivity", str4);
            a.mo45041b("event_timestamp", String.valueOf(zzt.m2889b().mo21950a()));
            for (Map.Entry entry2 : map.entrySet()) {
                a.mo45041b((String) entry2.getKey(), (String) entry2.getValue());
            }
            str3 = a.mo45045f();
        }
        zzego.mo45279f(new zzegq(zzt.m2889b().mo21950a(), str, str3, 2));
    }

    /* renamed from: Mb */
    public static void m48815Mb(Activity activity, @Nullable zzl zzl, zzbr zzbr, zzego zzego, zzdxq zzdxq, zzfir zzfir, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        zzt.m2905r();
        AlertDialog.Builder g = zzs.m2756g(activity);
        Resources d = zzt.m2904q().mo43491d();
        if (d == null) {
            str3 = "Open ad when you're back online.";
        } else {
            str3 = d.getString(C1721R.string.offline_opt_in_title);
        }
        AlertDialog.Builder title = g.setTitle(str3);
        if (d == null) {
            str4 = "We'll send you a notification with a link to the advertiser site.";
        } else {
            str4 = d.getString(C1721R.string.offline_opt_in_message);
        }
        AlertDialog.Builder message = title.setMessage(str4);
        if (d == null) {
            str5 = "OK";
        } else {
            str5 = d.getString(C1721R.string.offline_opt_in_confirm);
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton(str5, new zzegs(zzdxq, activity, zzfir, zzego, str, zzbr, str2, d, zzl));
        if (d == null) {
            str6 = "No thanks";
        } else {
            str6 = d.getString(C1721R.string.offline_opt_in_decline);
        }
        positiveButton.setNegativeButton(str6, new zzegt(zzego, str, zzdxq, activity, zzfir, zzl)).setOnCancelListener(new zzegu(zzego, str, zzdxq, activity, zzfir, zzl));
        g.create().show();
    }

    /* renamed from: Nb */
    private final void m48816Nb(String str, String str2, Map map) {
        m48814Lb(this.f33994a, this.f33995c, this.f33998g, this.f33997f, str, str2, map);
    }

    /* renamed from: B7 */
    public final void mo43226B7(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        String str4;
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        zzt.m2906s().mo20251f(context);
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i = zzfqd.f36254a;
        PendingIntent a = zzfqd.m50774a(context, 0, intent, i | BasicMeasure.EXACTLY, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a2 = zzfqd.m50774a(context, 0, intent2, i | BasicMeasure.EXACTLY, 0);
        Resources d = zzt.m2904q().mo43491d();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (d == null) {
            str3 = "View the ad you saved when you were offline";
        } else {
            str3 = d.getString(C1721R.string.offline_notification_title);
        }
        NotificationCompat.Builder contentTitle = builder.setContentTitle(str3);
        if (d == null) {
            str4 = "Tap to open ad";
        } else {
            str4 = d.getString(C1721R.string.offline_notification_text);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, contentTitle.setContentText(str4).setAutoCancel(true).setDeleteIntent(a2).setContentIntent(a).setSmallIcon(context.getApplicationInfo().icon).build());
        m48816Nb(str2, "offline_notification_impression", new HashMap());
    }

    /* renamed from: F1 */
    public final void mo43227F1(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean v = zzt.m2904q().mo43505v(this.f33994a);
            HashMap hashMap = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == v) {
                    c = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f33994a;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            m48816Nb(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f33997f.getWritableDatabase();
                if (c == 1) {
                    this.f33997f.mo45281i(writableDatabase, this.f33996d, stringExtra2);
                } else {
                    zzego.m48805m(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                zzcgp.m45226d("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    /* renamed from: c */
    public final void mo43228c() {
        this.f33997f.mo45280g(new zzegk(this.f33996d));
    }
}
