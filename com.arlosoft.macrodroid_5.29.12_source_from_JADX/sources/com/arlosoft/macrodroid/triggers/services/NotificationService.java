package com.arlosoft.macrodroid.triggers.services;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p148q0.C8151a;

public class NotificationService extends NotificationListenerService {

    /* renamed from: A */
    private static long f14501A;

    /* renamed from: f */
    private static int f14502f;

    /* renamed from: g */
    private static NotificationService f14503g;

    /* renamed from: o */
    private static String f14504o;

    /* renamed from: p */
    private static String f14505p;

    /* renamed from: s */
    private static String f14506s;

    /* renamed from: z */
    private static String f14507z;

    /* renamed from: a */
    private final BroadcastReceiver f14508a = new C6106a();

    /* renamed from: c */
    private final BroadcastReceiver f14509c = new C6107b();

    /* renamed from: d */
    private final BroadcastReceiver f14510d = new C6108c();

    /* renamed from: com.arlosoft.macrodroid.triggers.services.NotificationService$a */
    class C6106a extends BroadcastReceiver {
        C6106a() {
        }

        public void onReceive(Context context, Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("notificaitonClearAll", false);
            boolean booleanExtra2 = intent.getBooleanExtra("notificationOngoing", false);
            if (booleanExtra) {
                try {
                    NotificationService.this.cancelAllNotifications();
                } catch (SecurityException e) {
                    C4878b.m18868g("Failed to cancel all notifications: " + e.getMessage());
                    C8151a.m33873n(e);
                }
            } else {
                String stringExtra = intent.getStringExtra("notificationKey");
                boolean booleanExtra3 = intent.getBooleanExtra("ignorePersistent", false);
                try {
                    if (Build.VERSION.SDK_INT < 26 || !booleanExtra2) {
                        NotificationService.this.cancelNotification(stringExtra);
                    } else if (booleanExtra3) {
                        NotificationService.this.snoozeNotification(stringExtra, 2147483647L);
                    }
                } catch (SecurityException e2) {
                    C4878b.m18868g("Failed to cancel notification: " + e2.getMessage());
                    C8151a.m33873n(e2);
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.NotificationService$b */
    class C6107b extends BroadcastReceiver {
        C6107b() {
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("notificationKey");
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationService.this.setNotificationsShown(new String[]{stringExtra});
                    NotificationService.this.snoozeNotification(stringExtra, 100);
                }
            } catch (SecurityException e) {
                C4878b.m18868g("Failed to cancel notification: " + e.getMessage());
                C8151a.m33873n(e);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.NotificationService$c */
    class C6108c extends BroadcastReceiver {
        C6108c() {
        }

        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("interruptionFilterType", -1);
            if (intExtra != -1) {
                try {
                    NotificationService.this.requestInterruptionFilter(intExtra);
                } catch (SecurityException unused) {
                    C4878b.m18873l("Failed to invoke set priority, please ensure you have granted MacroDroid notification access on your device.");
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.NotificationService$d */
    public static class C6109d {

        /* renamed from: a */
        public final String f14514a;

        /* renamed from: b */
        public final String f14515b;

        /* renamed from: c */
        public final String f14516c;

        /* renamed from: d */
        public final int f14517d;

        /* renamed from: e */
        public final String f14518e;

        /* renamed from: f */
        public final String f14519f;

        /* renamed from: g */
        public final String f14520g;

        /* renamed from: h */
        public final long f14521h;

        /* renamed from: i */
        public boolean f14522i;

        public C6109d(String str, String str2, String str3, int i, String str4, String str5, String str6, long j, boolean z) {
            this.f14514a = str;
            this.f14515b = str2;
            this.f14516c = str3;
            this.f14517d = i;
            this.f14518e = str4;
            this.f14519f = str5;
            this.f14520g = str5;
            this.f14521h = j;
            this.f14522i = z;
        }
    }

    /* renamed from: d */
    public static void m24179d(Context context, C6109d dVar, boolean z) {
        Intent intent = new Intent("com.arlosoft.macrodroid.CLEAR_NOTIFICATION");
        intent.putExtra("notificationKey", dVar.f14514a);
        intent.putExtra("notificationPackage", dVar.f14515b);
        intent.putExtra("notificationTag", dVar.f14516c);
        intent.putExtra("notificationId", dVar.f14517d);
        intent.putExtra("notificationOngoing", dVar.f14522i);
        intent.putExtra("ignorePersistent", z);
        context.sendBroadcast(intent);
    }

    @RequiresApi(api = 26)
    /* renamed from: e */
    public static StatusBarNotification[] m24180e() {
        try {
            NotificationService notificationService = f14503g;
            if (notificationService != null) {
                return notificationService.getSnoozedNotifications();
            }
            m24185j();
            return new StatusBarNotification[0];
        } catch (Exception e) {
            C4878b.m18868g("Failed to retrieve active notifications: " + e.toString());
        }
    }

    /* renamed from: f */
    public static List<C6109d> m24181f(int i, boolean z) {
        try {
            NotificationService notificationService = f14503g;
            if (notificationService != null) {
                StatusBarNotification[] activeNotifications = notificationService.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    return m24187l(f14503g.getActiveNotifications(), i, z);
                }
            } else {
                m24185j();
            }
        } catch (Exception e) {
            C8151a.m33873n(e);
            C4878b.m18868g("Failed to retrieve active notifications: " + e.toString());
        }
        return new ArrayList();
    }

    /* renamed from: g */
    public static StatusBarNotification[] m24182g() {
        try {
            return f14503g.getActiveNotifications();
        } catch (Exception e) {
            C8151a.m33873n(e);
            C4878b.m18868g("Failed to retrieve active notifications: " + e.toString());
            return new StatusBarNotification[0];
        }
    }

    /* renamed from: j */
    private static void m24185j() {
        int i = f14502f + 1;
        f14502f = i;
        if (i < 5) {
            C4878b.m18868g("Could not obtain an active instance of the notification service - attempting to recover");
            MacroDroidApplication.m14845u().startService(new Intent(MacroDroidApplication.m14845u(), Build.VERSION.SDK_INT >= 26 ? NotificationServiceOreo.class : NotificationService.class));
            return;
        }
        C4878b.m18868g("Could not obtain an active instance of the notification service - please check your notification access setting on your device and try rebooting");
        Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(MacroDroidApplication.m14845u());
        C4878b.m18864c("Enabled packages: " + enabledListenerPackages);
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) MacroDroidApplication.m14845u().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            C4878b.m18864c("Running service: " + runningServiceInfo.service.getClassName());
        }
    }

    /* renamed from: k */
    public static C6109d m24186k(StatusBarNotification statusBarNotification) {
        String str;
        String str2 = "";
        String key = statusBarNotification.getKey();
        Bundle bundle = statusBarNotification.getNotification().extras;
        try {
            str = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE, str2).toString().toString();
        } catch (Exception unused) {
            str = str2;
        }
        try {
            str2 = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT, str2).toString().toString();
        } catch (Exception unused2) {
        }
        return new C6109d(key, statusBarNotification.getPackageName(), statusBarNotification.getTag(), statusBarNotification.getId(), str, str2, "", statusBarNotification.getPostTime(), statusBarNotification.isOngoing());
    }

    /* renamed from: l */
    public static List<C6109d> m24187l(StatusBarNotification[] statusBarNotificationArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            if ((!z || !statusBarNotification.isOngoing()) && (currentTimeMillis - statusBarNotification.getPostTime()) / 1000 >= ((long) i)) {
                arrayList.add(m24186k(statusBarNotification));
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static void m24188m(Context context, String str) {
        Intent intent = new Intent("com.arlosoft.macrodroid.RESTORE_NOTIFICATION");
        intent.putExtra("notificationKey", str);
        context.sendBroadcast(intent);
    }

    public void onCreate() {
        super.onCreate();
        f14503g = this;
        f14502f = 0;
        C4878b.m18879r("Notification Service Created");
        registerReceiver(this.f14510d, new IntentFilter("com.arlosoft.macrodroid.SET_PRIORITY_MODE"));
        registerReceiver(this.f14508a, new IntentFilter("com.arlosoft.macrodroid.CLEAR_NOTIFICATION"));
        registerReceiver(this.f14509c, new IntentFilter("com.arlosoft.macrodroid.RESTORE_NOTIFICATION"));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r1 = this;
            r0 = 0
            f14503g = r0
            java.lang.String r0 = "Notification Service Destroyed"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)
            android.content.BroadcastReceiver r0 = r1.f14510d     // Catch:{ Exception -> 0x000d }
            r1.unregisterReceiver(r0)     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            android.content.BroadcastReceiver r0 = r1.f14508a     // Catch:{ Exception -> 0x0012 }
            r1.unregisterReceiver(r0)     // Catch:{ Exception -> 0x0012 }
        L_0x0012:
            android.content.BroadcastReceiver r0 = r1.f14509c     // Catch:{ Exception -> 0x0017 }
            r1.unregisterReceiver(r0)     // Catch:{ Exception -> 0x0017 }
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.NotificationService.onDestroy():void");
    }

    public void onListenerConnected() {
        C4878b.m18879r("Notification Listener Connected");
        f14503g = this;
    }

    public void onListenerDisconnected() {
        C4878b.m18879r("Notification Listener Disconnected");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8 A[LOOP:2: B:26:0x00a6->B:27:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotificationPosted(android.service.notification.StatusBarNotification r28) {
        /*
            r27 = this;
            r0 = r27
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000b
            android.os.Looper.prepare()
        L_0x000b:
            android.app.Notification r1 = r28.getNotification()
            android.os.Bundle r1 = r1.extras
            java.lang.String r2 = "android.title"
            java.lang.String r3 = ""
            java.lang.CharSequence r2 = r1.getCharSequence(r2, r3)
            java.lang.String r4 = "android.text"
            java.lang.CharSequence r4 = r1.getCharSequence(r4, r3)
            java.lang.String r5 = "android.bigText"
            java.lang.CharSequence r5 = r1.getCharSequence(r5, r3)
            java.lang.String r6 = "android.subText"
            java.lang.CharSequence r6 = r1.getCharSequence(r6, r3)
            android.app.Notification r7 = r28.getNotification()
            android.app.Notification$Action[] r7 = r7.actions
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 2
            r10 = 0
            if (r7 == 0) goto L_0x0061
            int r11 = r7.length
            r12 = 0
        L_0x003c:
            if (r12 >= r11) goto L_0x004d
            r13 = r7[r12]
            java.lang.CharSequence r13 = r13.title
            r8.append(r13)
            java.lang.String r13 = ", "
            r8.append(r13)
            int r12 = r12 + 1
            goto L_0x003c
        L_0x004d:
            int r7 = r8.length()
            if (r7 <= 0) goto L_0x0061
            java.lang.String r7 = r8.toString()
            int r8 = r7.length()
            int r8 = r8 - r9
            java.lang.String r7 = r7.substring(r10, r8)
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            boolean r21 = r28.isOngoing()
            java.lang.String r12 = "android.textLines"
            java.lang.CharSequence[] r12 = r1.getCharSequenceArray(r12)
            java.lang.String r13 = "\n"
            if (r12 == 0) goto L_0x0094
            int r14 = r12.length
            r15 = 0
        L_0x007c:
            if (r15 >= r14) goto L_0x0094
            r16 = r12[r15]
            if (r16 == 0) goto L_0x0089
            java.lang.String r16 = r16.toString()
            r9 = r16
            goto L_0x008a
        L_0x0089:
            r9 = r3
        L_0x008a:
            r8.append(r9)
            r8.append(r13)
            int r15 = r15 + 1
            r9 = 2
            goto L_0x007c
        L_0x0094:
            int r9 = android.os.Build.VERSION.SDK_INT
            r12 = 24
            java.lang.String r14 = "android.messages"
            if (r9 < r12) goto L_0x00c2
            java.lang.Object r9 = r1.get(r14)
            android.os.Parcelable[] r9 = (android.os.Parcelable[]) r9
            if (r9 == 0) goto L_0x00c2
            int r12 = r9.length
            r15 = 0
        L_0x00a6:
            if (r15 >= r12) goto L_0x00c2
            r16 = r9[r15]
            r10 = r16
            android.os.Bundle r10 = (android.os.Bundle) r10
            r16 = r3
            java.lang.String r3 = "text"
            java.lang.String r3 = r10.getString(r3)
            r11.append(r3)
            r11.append(r13)
            int r15 = r15 + 1
            r3 = r16
            r10 = 0
            goto L_0x00a6
        L_0x00c2:
            r16 = r3
            int r3 = r8.length()
            if (r3 != 0) goto L_0x00d9
            int r3 = r11.length()
            if (r3 <= 0) goto L_0x00d9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = r11.toString()
            r8.<init>(r3)
        L_0x00d9:
            r1.get(r14)
            java.lang.String r1 = r28.getPackageName()
            java.lang.String r3 = "com.arlosoft.macrodroid"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ef
            boolean r1 = r28.isOngoing()
            if (r1 == 0) goto L_0x00ef
            return
        L_0x00ef:
            java.lang.String r1 = r4.toString()
            f14506s = r1
            java.lang.String r1 = r2.toString()
            f14505p = r1
            java.lang.String r1 = r6.toString()
            f14507z = r1
            java.lang.String r1 = r28.getPackageName()
            f14504o = r1
            long r1 = java.lang.System.currentTimeMillis()
            f14501A = r1
            java.lang.String r1 = r28.getPackageName()
            android.app.Notification r2 = r28.getNotification()
            java.lang.CharSequence r2 = r2.tickerText
            if (r2 == 0) goto L_0x0124
            android.app.Notification r2 = r28.getNotification()
            java.lang.CharSequence r2 = r2.tickerText
            java.lang.String r3 = r2.toString()
            goto L_0x0126
        L_0x0124:
            r3 = r16
        L_0x0126:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 < r4) goto L_0x014f
            java.lang.String r2 = r28.getPackageName()
            java.lang.String r4 = "android"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x014f
            if (r21 == 0) goto L_0x014f
            java.lang.String r2 = f14505p
            java.lang.String r4 = "MacroDroid"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x014f
            java.lang.String r1 = r28.getKey()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r0.snoozeNotification(r1, r2)
            return
        L_0x014f:
            android.app.Notification r2 = r28.getNotification()
            android.net.Uri r2 = r2.sound
            r4 = 1
            if (r2 == 0) goto L_0x015a
            r2 = 1
            goto L_0x015b
        L_0x015a:
            r2 = 0
        L_0x015b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.Context r9 = r27.getApplicationContext()
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            r11 = 0
            android.content.pm.ApplicationInfo r11 = r9.getApplicationInfo(r1, r11)     // Catch:{ Exception -> 0x016e }
            goto L_0x016f
        L_0x016e:
            r11 = 0
        L_0x016f:
            if (r11 == 0) goto L_0x0176
            java.lang.CharSequence r9 = r9.getApplicationLabel(r11)
            goto L_0x0178
        L_0x0176:
            java.lang.String r9 = "(?)"
        L_0x0178:
            java.lang.String r9 = (java.lang.String) r9
            if (r11 == 0) goto L_0x017f
            java.lang.String r11 = r11.packageName
            goto L_0x0181
        L_0x017f:
            java.lang.String r11 = "?"
        L_0x0181:
            r23 = r11
            android.content.Context r11 = r27.getApplicationContext()
            com.arlosoft.macrodroid.macro.n r11 = com.arlosoft.macrodroid.macro.C4934n.m18999N(r11)
            java.util.List r11 = r11.mo29679I()
            java.util.Iterator r24 = r11.iterator()
        L_0x0193:
            boolean r11 = r24.hasNext()
            if (r11 == 0) goto L_0x03e6
            java.lang.Object r11 = r24.next()
            r15 = r11
            com.arlosoft.macrodroid.macro.Macro r15 = (com.arlosoft.macrodroid.macro.Macro) r15
            java.util.ArrayList r11 = r15.getTriggerListWithAwaitingActions()
            java.util.Iterator r11 = r11.iterator()
        L_0x01a8:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x03dd
            java.lang.Object r12 = r11.next()
            com.arlosoft.macrodroid.triggers.Trigger r12 = (com.arlosoft.macrodroid.triggers.Trigger) r12
            boolean r13 = r12 instanceof com.arlosoft.macrodroid.triggers.NotificationTrigger
            if (r13 == 0) goto L_0x03d2
            r14 = r12
            com.arlosoft.macrodroid.triggers.NotificationTrigger r14 = (com.arlosoft.macrodroid.triggers.NotificationTrigger) r14
            int r13 = r14.mo31378z3()
            if (r13 != 0) goto L_0x03d2
            if (r21 == 0) goto L_0x01ca
            boolean r13 = r14.mo31377x3()
            if (r13 == 0) goto L_0x01ca
            goto L_0x01a8
        L_0x01ca:
            boolean r13 = com.arlosoft.macrodroid.utils.C6459y0.m24787a(r1, r14)
            if (r13 != 0) goto L_0x01d1
            goto L_0x01a8
        L_0x01d1:
            int r13 = r14.mo31368C3()
            if (r13 == 0) goto L_0x01ea
            int r13 = r14.mo31368C3()
            if (r13 != r4) goto L_0x01df
            if (r2 == 0) goto L_0x01a8
        L_0x01df:
            int r13 = r14.mo31368C3()
            r4 = 2
            if (r13 != r4) goto L_0x01eb
            if (r2 == 0) goto L_0x01eb
            r4 = 1
            goto L_0x01a8
        L_0x01ea:
            r4 = 2
        L_0x01eb:
            java.lang.String r13 = r14.mo31369D3()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0247
            boolean r13 = r12.mo31374R2()
            if (r13 == 0) goto L_0x0247
            r15.setTriggerThatInvoked(r12)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r13 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r12 = r15.getTriggerThatInvoked()
            com.arlosoft.macrodroid.data.NotificationContextInfo r11 = new com.arlosoft.macrodroid.data.NotificationContextInfo
            java.lang.String r16 = f14506s
            java.lang.String r17 = f14505p
            java.lang.String r18 = r5.toString()
            java.lang.String r19 = r8.toString()
            java.lang.String r20 = f14507z
            r22 = r11
            r4 = r12
            r12 = r16
            r10 = r13
            r13 = r9
            r25 = r14
            r14 = r23
            r26 = r1
            r1 = r15
            r15 = r17
            r16 = r3
            r17 = r18
            r18 = r19
            r19 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r10.<init>((com.arlosoft.macrodroid.triggers.Trigger) r4, (com.arlosoft.macrodroid.data.NotificationContextInfo) r11)
            r1.setTriggerContextInfo(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = r1.getTriggerContextInfo()
            boolean r4 = r1.canInvoke(r4)
            if (r4 == 0) goto L_0x03df
            r6.add(r1)
            r25.mo31375W3()
            goto L_0x03df
        L_0x0247:
            r26 = r1
            r25 = r14
            r1 = r15
            java.lang.String r4 = r25.mo31369D3()
            r10 = 0
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r0, r4, r10, r1)
            java.lang.String r13 = r4.toLowerCase()
            boolean r14 = r25.mo31370E3()
            java.lang.String r13 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r13, r14)
            java.lang.String r4 = r4.toLowerCase()
            boolean r14 = r25.mo31370E3()
            java.lang.String r4 = com.arlosoft.macrodroid.utils.C6460y1.m24790b(r4, r14)
            boolean r14 = r25.mo31373H3()
            if (r14 == 0) goto L_0x02e9
            java.lang.String r13 = f14505p
            java.lang.String r13 = r13.toLowerCase()
            boolean r14 = r25.mo31370E3()
            boolean r13 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r13, r4, r14)
            if (r13 != 0) goto L_0x03d5
            java.lang.String r13 = f14506s
            java.lang.String r13 = r13.toLowerCase()
            boolean r14 = r25.mo31370E3()
            boolean r13 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r13, r4, r14)
            if (r13 != 0) goto L_0x03d5
            java.lang.String r13 = f14507z
            java.lang.String r13 = r13.toLowerCase()
            boolean r14 = r25.mo31370E3()
            boolean r4 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r13, r4, r14)
            if (r4 != 0) goto L_0x03d5
            boolean r4 = r12.mo31374R2()
            if (r4 == 0) goto L_0x03d5
            r1.setTriggerThatInvoked(r12)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r15 = r1.getTriggerThatInvoked()
            com.arlosoft.macrodroid.data.NotificationContextInfo r14 = new com.arlosoft.macrodroid.data.NotificationContextInfo
            java.lang.String r12 = f14506s
            java.lang.String r16 = f14505p
            java.lang.String r17 = r5.toString()
            java.lang.String r18 = r8.toString()
            java.lang.String r20 = f14507z
            r11 = r14
            r13 = r9
            r10 = r14
            r14 = r23
            r0 = r15
            r15 = r16
            r16 = r3
            r19 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.<init>((com.arlosoft.macrodroid.triggers.Trigger) r0, (com.arlosoft.macrodroid.data.NotificationContextInfo) r10)
            r1.setTriggerContextInfo(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r1.getTriggerContextInfo()
            boolean r0 = r1.canInvoke(r0)
            if (r0 == 0) goto L_0x03df
            r6.add(r1)
            r25.mo31375W3()
            goto L_0x03df
        L_0x02e9:
            boolean r0 = r25.mo31371F3()
            if (r0 == 0) goto L_0x0361
            java.lang.String r0 = f14505p
            java.lang.String r0 = r0.toLowerCase()
            boolean r4 = r25.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r13, r4)
            if (r0 != 0) goto L_0x031f
            java.lang.String r0 = f14506s
            java.lang.String r0 = r0.toLowerCase()
            boolean r4 = r25.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r13, r4)
            if (r0 != 0) goto L_0x031f
            java.lang.String r0 = f14507z
            java.lang.String r0 = r0.toLowerCase()
            boolean r4 = r25.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r13, r4)
            if (r0 == 0) goto L_0x03d5
        L_0x031f:
            boolean r0 = r12.mo31374R2()
            if (r0 == 0) goto L_0x03d5
            r1.setTriggerThatInvoked(r12)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r4 = r1.getTriggerThatInvoked()
            com.arlosoft.macrodroid.data.NotificationContextInfo r10 = new com.arlosoft.macrodroid.data.NotificationContextInfo
            java.lang.String r12 = f14506s
            java.lang.String r15 = f14505p
            java.lang.String r17 = r5.toString()
            java.lang.String r18 = r8.toString()
            java.lang.String r20 = f14507z
            r11 = r10
            r13 = r9
            r14 = r23
            r16 = r3
            r19 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.<init>((com.arlosoft.macrodroid.triggers.Trigger) r4, (com.arlosoft.macrodroid.data.NotificationContextInfo) r10)
            r1.setTriggerContextInfo(r0)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r1.getTriggerContextInfo()
            boolean r0 = r1.canInvoke(r0)
            if (r0 == 0) goto L_0x03df
            r6.add(r1)
            r25.mo31375W3()
            goto L_0x03df
        L_0x0361:
            java.lang.String r0 = f14505p
            java.lang.String r0 = r0.toLowerCase()
            boolean r10 = r25.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r4, r10)
            if (r0 != 0) goto L_0x0391
            java.lang.String r0 = f14506s
            java.lang.String r0 = r0.toLowerCase()
            boolean r10 = r25.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r4, r10)
            if (r0 != 0) goto L_0x0391
            java.lang.String r0 = f14507z
            java.lang.String r0 = r0.toLowerCase()
            boolean r10 = r25.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r4, r10)
            if (r0 == 0) goto L_0x03d5
        L_0x0391:
            boolean r0 = r12.mo31374R2()
            if (r0 == 0) goto L_0x03d5
            r1.setTriggerThatInvoked(r12)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r4 = r1.getTriggerThatInvoked()
            com.arlosoft.macrodroid.data.NotificationContextInfo r10 = new com.arlosoft.macrodroid.data.NotificationContextInfo
            java.lang.String r12 = f14506s
            java.lang.String r15 = f14505p
            java.lang.String r17 = r5.toString()
            java.lang.String r18 = r8.toString()
            java.lang.String r20 = f14507z
            r11 = r10
            r13 = r9
            r14 = r23
            r16 = r3
            r19 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.<init>((com.arlosoft.macrodroid.triggers.Trigger) r4, (com.arlosoft.macrodroid.data.NotificationContextInfo) r10)
            r1.setTriggerContextInfo(r0)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r1.getTriggerContextInfo()
            boolean r0 = r1.canInvoke(r0)
            if (r0 == 0) goto L_0x03df
            r6.add(r1)
            r25.mo31375W3()
            goto L_0x03df
        L_0x03d2:
            r26 = r1
            r1 = r15
        L_0x03d5:
            r4 = 1
            r0 = r27
            r15 = r1
            r1 = r26
            goto L_0x01a8
        L_0x03dd:
            r26 = r1
        L_0x03df:
            r4 = 1
            r0 = r27
            r1 = r26
            goto L_0x0193
        L_0x03e6:
            java.util.Iterator r0 = r6.iterator()
        L_0x03ea:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0412
            java.lang.Object r1 = r0.next()
            com.arlosoft.macrodroid.macro.Macro r1 = (com.arlosoft.macrodroid.macro.Macro) r1
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r3 = r1.getTriggerContextInfo()
            boolean r3 = r1.canInvoke(r3)
            if (r3 == 0) goto L_0x03ea
            com.arlosoft.macrodroid.triggers.services.i r3 = new com.arlosoft.macrodroid.triggers.services.i
            r3.<init>(r1)
            r2.post(r3)
            goto L_0x03ea
        L_0x0412:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.NotificationService.onNotificationPosted(android.service.notification.StatusBarNotification):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotificationRemoved(android.service.notification.StatusBarNotification r29) {
        /*
            r28 = this;
            if (r29 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r29.getPackageName()
            android.app.Notification r1 = r29.getNotification()
            java.lang.CharSequence r1 = r1.tickerText
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x001c
            android.app.Notification r1 = r29.getNotification()
            java.lang.CharSequence r1 = r1.tickerText
            java.lang.String r1 = r1.toString()
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            boolean r14 = r29.isOngoing()
            android.app.Notification r3 = r29.getNotification()
            android.os.Bundle r3 = r3.extras
            java.lang.String r4 = "android.title"
            java.lang.CharSequence r4 = r3.getCharSequence(r4, r2)
            java.lang.String r15 = r4.toString()
            java.lang.String r4 = "android.text"
            java.lang.CharSequence r4 = r3.getCharSequence(r4, r2)
            java.lang.String r16 = r4.toString()
            java.lang.String r4 = "android.bigText"
            java.lang.CharSequence r4 = r3.getCharSequence(r4, r2)
            java.lang.String r17 = r4.toString()
            java.lang.String r4 = "android.subText"
            java.lang.CharSequence r4 = r3.getCharSequence(r4, r2)
            java.lang.String r18 = r4.toString()
            java.lang.String r4 = "android.textLines"
            java.lang.CharSequence[] r3 = r3.getCharSequenceArray(r4)
            r4 = 0
            if (r3 == 0) goto L_0x0076
            int r5 = r3.length
            r6 = 0
        L_0x005f:
            if (r6 >= r5) goto L_0x0076
            r7 = r3[r6]
            if (r7 == 0) goto L_0x006a
            java.lang.String r7 = r7.toString()
            goto L_0x006b
        L_0x006a:
            r7 = r2
        L_0x006b:
            r13.append(r7)
            java.lang.String r7 = "\n"
            r13.append(r7)
            int r6 = r6 + 1
            goto L_0x005f
        L_0x0076:
            android.app.Notification r3 = r29.getNotification()
            android.app.Notification$Action[] r3 = r3.actions
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r3 == 0) goto L_0x00b0
            int r6 = r3.length
            r7 = 0
        L_0x0085:
            if (r7 >= r6) goto L_0x009c
            r8 = r3[r7]
            java.lang.String r9 = ", "
            if (r8 == 0) goto L_0x0096
            java.lang.CharSequence r8 = r8.title
            r5.append(r8)
            r5.append(r9)
            goto L_0x0099
        L_0x0096:
            r5.append(r9)
        L_0x0099:
            int r7 = r7 + 1
            goto L_0x0085
        L_0x009c:
            int r3 = r5.length()
            if (r3 <= 0) goto L_0x00b0
            java.lang.String r2 = r5.toString()
            int r3 = r2.length()
            int r3 = r3 + -2
            java.lang.String r2 = r2.substring(r4, r3)
        L_0x00b0:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            android.content.Context r3 = r28.getApplicationContext()
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r11 = 0
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x00c3 }
            goto L_0x00c4
        L_0x00c3:
            r4 = r11
        L_0x00c4:
            java.lang.String r5 = "(?)"
            if (r4 == 0) goto L_0x00cd
            java.lang.CharSequence r3 = r3.getApplicationLabel(r4)
            goto L_0x00ce
        L_0x00cd:
            r3 = r5
        L_0x00ce:
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            if (r4 == 0) goto L_0x00d6
            java.lang.String r5 = r4.packageName
        L_0x00d6:
            r20 = r5
            com.arlosoft.macrodroid.macro.n r3 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r3 = r3.mo29679I()
            java.util.Iterator r21 = r3.iterator()
        L_0x00e4:
            boolean r3 = r21.hasNext()
            if (r3 == 0) goto L_0x032f
            java.lang.Object r3 = r21.next()
            r10 = r3
            com.arlosoft.macrodroid.macro.Macro r10 = (com.arlosoft.macrodroid.macro.Macro) r10
            java.util.ArrayList r3 = r10.getTriggerListWithAwaitingActions()
            java.util.Iterator r3 = r3.iterator()
        L_0x00f9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0316
            java.lang.Object r4 = r3.next()
            com.arlosoft.macrodroid.triggers.Trigger r4 = (com.arlosoft.macrodroid.triggers.Trigger) r4
            boolean r5 = r4 instanceof com.arlosoft.macrodroid.triggers.NotificationTrigger
            if (r5 == 0) goto L_0x02fb
            r9 = r4
            com.arlosoft.macrodroid.triggers.NotificationTrigger r9 = (com.arlosoft.macrodroid.triggers.NotificationTrigger) r9
            int r5 = r9.mo31378z3()
            r6 = 1
            if (r5 != r6) goto L_0x02fb
            if (r14 == 0) goto L_0x011c
            boolean r5 = r9.mo31377x3()
            if (r5 == 0) goto L_0x011c
            goto L_0x00f9
        L_0x011c:
            boolean r5 = com.arlosoft.macrodroid.utils.C6459y0.m24787a(r0, r9)
            if (r5 != 0) goto L_0x0123
            goto L_0x00f9
        L_0x0123:
            java.lang.String r5 = r9.mo31369D3()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x017f
            boolean r5 = r4.mo31374R2()
            if (r5 == 0) goto L_0x017f
            r10.setTriggerThatInvoked(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r8 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r7 = r10.getTriggerThatInvoked()
            com.arlosoft.macrodroid.data.NotificationContextInfo r6 = new com.arlosoft.macrodroid.data.NotificationContextInfo
            java.lang.String r22 = r13.toString()
            r3 = r6
            r4 = r16
            r5 = r19
            r23 = r0
            r0 = r6
            r6 = r20
            r24 = r14
            r14 = r7
            r7 = r15
            r25 = r13
            r13 = r8
            r8 = r1
            r26 = r9
            r9 = r17
            r27 = r1
            r1 = r10
            r10 = r22
            r22 = r15
            r15 = r11
            r11 = r2
            r15 = r12
            r12 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.<init>((com.arlosoft.macrodroid.triggers.Trigger) r14, (com.arlosoft.macrodroid.data.NotificationContextInfo) r0)
            r1.setTriggerContextInfo(r13)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r1.getTriggerContextInfo()
            boolean r0 = r1.canInvoke(r0)
            if (r0 == 0) goto L_0x0321
            r15.add(r1)
            r26.mo31375W3()
            goto L_0x0321
        L_0x017f:
            r23 = r0
            r27 = r1
            r26 = r9
            r1 = r10
            r25 = r13
            r24 = r14
            r22 = r15
            r15 = r12
            java.lang.String r0 = r26.mo31369D3()
            r14 = 0
            r13 = r28
            java.lang.String r0 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r13, r0, r14, r1)
            java.lang.String r5 = r0.toLowerCase()
            boolean r6 = r26.mo31370E3()
            java.lang.String r5 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r5, r6)
            java.lang.String r0 = r0.toLowerCase()
            boolean r6 = r26.mo31370E3()
            java.lang.String r0 = com.arlosoft.macrodroid.utils.C6460y1.m24790b(r0, r6)
            boolean r6 = r26.mo31373H3()
            if (r6 == 0) goto L_0x0222
            java.lang.String r5 = r22.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r5 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r5, r0, r6)
            if (r5 != 0) goto L_0x0307
            java.lang.String r5 = r16.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r5 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r5, r0, r6)
            if (r5 != 0) goto L_0x0307
            java.lang.String r5 = r18.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r5, r0, r6)
            if (r0 != 0) goto L_0x0307
            boolean r0 = r4.mo31374R2()
            if (r0 == 0) goto L_0x0307
            r1.setTriggerThatInvoked(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r12 = r1.getTriggerThatInvoked()
            com.arlosoft.macrodroid.data.NotificationContextInfo r11 = new com.arlosoft.macrodroid.data.NotificationContextInfo
            java.lang.String r10 = r25.toString()
            r3 = r11
            r4 = r16
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r27
            r9 = r17
            r14 = r11
            r11 = r2
            r13 = r12
            r12 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.<init>((com.arlosoft.macrodroid.triggers.Trigger) r13, (com.arlosoft.macrodroid.data.NotificationContextInfo) r14)
            r1.setTriggerContextInfo(r0)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r1.getTriggerContextInfo()
            boolean r0 = r1.canInvoke(r0)
            if (r0 == 0) goto L_0x0321
            r15.add(r1)
            r26.mo31375W3()
            goto L_0x0321
        L_0x0222:
            boolean r6 = r26.mo31371F3()
            if (r6 == 0) goto L_0x0292
            java.lang.String r0 = r22.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r5, r6)
            if (r0 != 0) goto L_0x0252
            java.lang.String r0 = r16.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r5, r6)
            if (r0 != 0) goto L_0x0252
            java.lang.String r0 = r18.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r0, r5, r6)
            if (r0 == 0) goto L_0x0307
        L_0x0252:
            boolean r0 = r4.mo31374R2()
            if (r0 == 0) goto L_0x0307
            r1.setTriggerThatInvoked(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r13 = r1.getTriggerThatInvoked()
            com.arlosoft.macrodroid.data.NotificationContextInfo r14 = new com.arlosoft.macrodroid.data.NotificationContextInfo
            java.lang.String r10 = r25.toString()
            r3 = r14
            r4 = r16
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r27
            r9 = r17
            r11 = r2
            r12 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.<init>((com.arlosoft.macrodroid.triggers.Trigger) r13, (com.arlosoft.macrodroid.data.NotificationContextInfo) r14)
            r1.setTriggerContextInfo(r0)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r1.getTriggerContextInfo()
            boolean r0 = r1.canInvoke(r0)
            if (r0 == 0) goto L_0x0321
            r15.add(r1)
            r26.mo31375W3()
            goto L_0x0321
        L_0x0292:
            java.lang.String r5 = r22.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r5 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r5, r0, r6)
            if (r5 != 0) goto L_0x02bc
            java.lang.String r5 = r16.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r5 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r5, r0, r6)
            if (r5 != 0) goto L_0x02bc
            java.lang.String r5 = r18.toLowerCase()
            boolean r6 = r26.mo31370E3()
            boolean r0 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r5, r0, r6)
            if (r0 == 0) goto L_0x0307
        L_0x02bc:
            boolean r0 = r4.mo31374R2()
            if (r0 == 0) goto L_0x0307
            r1.setTriggerThatInvoked(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r13 = r1.getTriggerThatInvoked()
            com.arlosoft.macrodroid.data.NotificationContextInfo r14 = new com.arlosoft.macrodroid.data.NotificationContextInfo
            java.lang.String r10 = r25.toString()
            r3 = r14
            r4 = r16
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r27
            r9 = r17
            r11 = r2
            r12 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.<init>((com.arlosoft.macrodroid.triggers.Trigger) r13, (com.arlosoft.macrodroid.data.NotificationContextInfo) r14)
            r1.setTriggerContextInfo(r0)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r1.getTriggerContextInfo()
            boolean r0 = r1.canInvoke(r0)
            if (r0 == 0) goto L_0x0321
            r15.add(r1)
            r26.mo31375W3()
            goto L_0x0321
        L_0x02fb:
            r23 = r0
            r27 = r1
            r1 = r10
            r25 = r13
            r24 = r14
            r22 = r15
            r15 = r12
        L_0x0307:
            r10 = r1
            r12 = r15
            r15 = r22
            r0 = r23
            r14 = r24
            r13 = r25
            r1 = r27
            r11 = 0
            goto L_0x00f9
        L_0x0316:
            r23 = r0
            r27 = r1
            r25 = r13
            r24 = r14
            r22 = r15
            r15 = r12
        L_0x0321:
            r12 = r15
            r15 = r22
            r0 = r23
            r14 = r24
            r13 = r25
            r1 = r27
            r11 = 0
            goto L_0x00e4
        L_0x032f:
            r15 = r12
            java.util.Iterator r0 = r15.iterator()
        L_0x0334:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0352
            java.lang.Object r1 = r0.next()
            com.arlosoft.macrodroid.macro.Macro r1 = (com.arlosoft.macrodroid.macro.Macro) r1
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            com.arlosoft.macrodroid.triggers.services.j r3 = new com.arlosoft.macrodroid.triggers.services.j
            r3.<init>(r1)
            r2.post(r3)
            goto L_0x0334
        L_0x0352:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.NotificationService.onNotificationRemoved(android.service.notification.StatusBarNotification):void");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        f14503g = this;
        C4878b.m18879r("Notification listener service instance obtained");
        return 1;
    }
}
