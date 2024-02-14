package com.arlosoft.macrodroid.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p106i2.C7395a;
import p106i2.C7396b;

/* renamed from: com.arlosoft.macrodroid.utils.x0 */
/* compiled from: NotificationChannelUtil.kt */
public final class C6455x0 {

    /* renamed from: c */
    public static final C6456a f15081c = new C6456a((C13695i) null);

    /* renamed from: a */
    private final Context f15082a;

    /* renamed from: b */
    private final NotificationManager f15083b;

    /* renamed from: com.arlosoft.macrodroid.utils.x0$a */
    /* compiled from: NotificationChannelUtil.kt */
    public static final class C6456a {
        private C6456a() {
        }

        public /* synthetic */ C6456a(C13695i iVar) {
            this();
        }
    }

    public C6455x0(Context context) {
        C13706o.m87929f(context, "context");
        this.f15082a = context;
        Object systemService = context.getSystemService("notification");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f15083b = (NotificationManager) systemService;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m24777d(String str, C7395a aVar) {
        C13706o.m87929f(str, "$channelName");
        C13706o.m87929f(aVar, "it");
        return C13706o.m87924a(aVar.mo37426a(), str);
    }

    /* renamed from: g */
    private final int m24778g(int i) {
        if (i == -2) {
            return 1;
        }
        if (i == -1) {
            return 2;
        }
        if (i != 0) {
            return i != 1 ? 5 : 4;
        }
        return 3;
    }

    @RequiresApi(26)
    /* renamed from: b */
    public final void mo32506b(String str, int i) {
        C13706o.m87929f(str, "channelName");
        int g = m24778g(i);
        C7396b bVar = (C7396b) MacroDroidApplication.f9883I.mo27303b().mo27293q("NotificationChannels").mo37133c("NotificationChannels", C7396b.class);
        if (bVar == null) {
            bVar = new C7396b(new ArrayList());
        }
        mo32510h(new C7396b(C13566b0.m87443r0(bVar.mo37428a(), new C7395a(str, i))));
        this.f15083b.createNotificationChannel(new NotificationChannel(str, str, g));
    }

    @RequiresApi(26)
    /* renamed from: c */
    public final void mo32507c(String str) {
        C13706o.m87929f(str, "channelName");
        C7396b bVar = (C7396b) MacroDroidApplication.f9883I.mo27303b().mo27293q("NotificationChannels").mo37133c("NotificationChannels", C7396b.class);
        if (bVar == null) {
            bVar = new C7396b(new ArrayList());
        }
        List I0 = C13566b0.m87405I0(bVar.mo37428a());
        I0.removeIf(new C6452w0(str));
        mo32510h(new C7396b(C13566b0.m87402F0(I0)));
        this.f15083b.deleteNotificationChannel(str);
    }

    @RequiresApi(26)
    /* renamed from: e */
    public final boolean mo32508e(String str) {
        C13706o.m87929f(str, "channelName");
        return this.f15083b.getNotificationChannel(str) != null;
    }

    /* renamed from: f */
    public final C7396b mo32509f() {
        C7396b bVar = (C7396b) MacroDroidApplication.f9883I.mo27303b().mo27293q("NotificationChannels").mo37133c("NotificationChannels", C7396b.class);
        return bVar == null ? new C7396b(new ArrayList()) : bVar;
    }

    /* renamed from: h */
    public final void mo32510h(C7396b bVar) {
        C13706o.m87929f(bVar, "notificationChannelList");
        MacroDroidApplication.f9883I.mo27303b().mo27293q("NotificationChannels").mo37132b("NotificationChannels", bVar);
    }

    /* renamed from: i */
    public final void mo32511i() {
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            NotificationChannel notificationChannel = new NotificationChannel("persistent_notification", this.f15082a.getString(C17541R$string.notification_channel_persistent), 3);
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            notificationChannel.setShowBadge(false);
            arrayList.add(notificationChannel);
            arrayList.add(new NotificationChannel("action_notification_high_priority", this.f15082a.getString(C17541R$string.notification_channel_action_high_priority), 4));
            arrayList.add(new NotificationChannel("action_notification", this.f15082a.getString(C17541R$string.notification_channel_action), 3));
            arrayList.add(new NotificationChannel("info_notification", this.f15082a.getString(C17541R$string.notification_channel_info), 3));
            arrayList.add(new NotificationChannel("vital_functionality", this.f15082a.getString(C17541R$string.notification_channel_vital_functionality), 5));
            arrayList.add(new NotificationChannel("template_store_updates", this.f15082a.getString(C17541R$string.notification_channel_template_store_updates), 5));
            this.f15083b.createNotificationChannels(arrayList);
        }
    }
}
