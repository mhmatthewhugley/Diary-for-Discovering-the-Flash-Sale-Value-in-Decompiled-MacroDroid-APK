package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.biometric.auth.C0271a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

@KeepForSdk
public class FcmBroadcastProcessor {

    /* renamed from: c */
    private static final Object f54970c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private static WithinAppServiceConnection f54971d;

    /* renamed from: a */
    private final Context f54972a;

    /* renamed from: b */
    private final Executor f54973b = C0271a.f317a;

    public FcmBroadcastProcessor(Context context) {
        this.f54972a = context;
    }

    /* renamed from: d */
    private static Task<Integer> m76829d(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        if (ServiceStarter.m77003b().mo63403e(context)) {
            WakeLockHolder.m77083f(context, m76830e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m76830e(context, "com.google.firebase.MESSAGING_EVENT").mo63443c(intent);
        }
        return Tasks.m66667f(-1);
    }

    /* renamed from: e */
    private static WithinAppServiceConnection m76830e(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (f54970c) {
            if (f54971d == null) {
                f54971d = new WithinAppServiceConnection(context, str);
            }
            withinAppServiceConnection = f54971d;
        }
        return withinAppServiceConnection;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Integer m76832g(Task task) throws Exception {
        return 403;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Task m76833h(Context context, Intent intent, Task task) throws Exception {
        return (!PlatformVersion.m4904i() || ((Integer) task.mo23715p()).intValue() != 402) ? task : m76829d(context, intent).mo23711l(C0271a.f317a, C11303d.f55089a);
    }

    @KeepForSdk
    /* renamed from: i */
    public Task<Integer> mo63334i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return mo63335j(this.f54972a, intent);
    }

    /* renamed from: j */
    public Task<Integer> mo63335j(Context context, Intent intent) {
        boolean z = true;
        boolean z2 = PlatformVersion.m4904i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (!z2 || z) {
            return Tasks.m66664c(this.f54973b, new C11304e(context, intent)).mo23713n(this.f54973b, new C11301c(context, intent));
        }
        return m76829d(context, intent);
    }
}
