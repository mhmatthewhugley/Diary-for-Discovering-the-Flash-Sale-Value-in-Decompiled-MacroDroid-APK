package dev.skomlach.common.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"dev/skomlach/common/network/Connection$screenLockReceiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lja/u;", "onReceive", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Connection.kt */
public final class Connection$screenLockReceiver$1 extends BroadcastReceiver {
    Connection$screenLockReceiver$1() {
    }

    public void onReceive(Context context, Intent intent) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        Connection.f58385a.mo68320g().mo68329e(1);
    }
}
