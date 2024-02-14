package dev.skomlach.common.misc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p240d9.C11966a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\u0010"}, mo71668d2 = {"Ldev/skomlach/common/misc/b;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lja/u;", "b", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/IntentFilter;", "filter", "a", "c", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.common.misc.b */
/* compiled from: BroadcastTools.kt */
public final class C12113b {

    /* renamed from: a */
    public static final C12113b f58378a = new C12113b();

    private C12113b() {
    }

    /* renamed from: a */
    public final void mo68299a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intentFilter, "filter");
        Iterator<String> actionsIterator = intentFilter.actionsIterator();
        while (actionsIterator.hasNext()) {
            String next = actionsIterator.next();
            if (!(next == null || next.length() == 0)) {
                C13706o.m87928e(next, "action");
                if (!C15176v.m93634I(next, "android.", false, 2, (Object) null)) {
                    C11966a aVar = C11966a.f58161a;
                    aVar.mo67380c("BroadcastTools: You tried to register custom global BroadcastReceiver. Make sure that action `" + next + "` contains package-specific name");
                }
            }
        }
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: b */
    public final void mo68300b(Context context, Intent intent) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        String action = intent.getAction();
        if (!(action == null || action.length() == 0) && !C15176v.m93634I(action, "android.", false, 2, (Object) null)) {
            C11966a aVar = C11966a.f58161a;
            aVar.mo67380c("BroadcastTools: You tried to send custom global BroadcastIntent. Make sure that action `" + action + "` contains package-specific name");
        }
        context.sendBroadcast(intent);
    }

    /* renamed from: c */
    public final void mo68301c(Context context, BroadcastReceiver broadcastReceiver) {
        C13706o.m87929f(context, "context");
        context.unregisterReceiver(broadcastReceiver);
    }
}
