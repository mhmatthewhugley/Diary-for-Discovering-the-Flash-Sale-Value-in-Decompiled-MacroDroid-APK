package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public class Rpc {

    /* renamed from: h */
    private static int f2965h;

    /* renamed from: i */
    private static PendingIntent f2966i;

    /* renamed from: j */
    private static final Executor f2967j = zzz.f3020a;

    /* renamed from: k */
    private static final Pattern f2968k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a */
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> f2969a = new SimpleArrayMap<>();

    /* renamed from: b */
    private final Context f2970b;

    /* renamed from: c */
    private final zzt f2971c;

    /* renamed from: d */
    private final ScheduledExecutorService f2972d;

    /* renamed from: e */
    private Messenger f2973e;

    /* renamed from: f */
    private Messenger f2974f;

    /* renamed from: g */
    private zzd f2975g;

    public Rpc(@NonNull Context context) {
        this.f2970b = context;
        this.f2971c = new zzt(context);
        this.f2973e = new Messenger(new zzaa(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2972d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    static /* synthetic */ Task m3434b(Bundle bundle) throws Exception {
        if (m3440j(bundle)) {
            return Tasks.m66667f(null);
        }
        return Tasks.m66667f(bundle);
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m3435d(Rpc rpc, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzc());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        rpc.f2975g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.f2974f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                            "Received InstanceID error ".concat(stringExtra2);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            rpc.m3439i(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (rpc.f2969a) {
                            for (int i = 0; i < rpc.f2969a.size(); i++) {
                                rpc.m3439i(rpc.f2969a.keyAt(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = f2968k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            rpc.m3439i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3) && stringExtra.length() != 0) {
                        "Unexpected response string: ".concat(stringExtra);
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    if (valueOf2.length() != 0) {
                        "Unexpected response action: ".concat(valueOf2);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    @AnyThread
    /* renamed from: f */
    private final Task<Bundle> m3436f(Bundle bundle) {
        String g = m3437g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f2969a) {
            this.f2969a.put(g, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f2971c.mo21118b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m3438h(this.f2970b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 5);
        sb.append("|ID|");
        sb.append(g);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
        }
        intent.putExtra("google.messenger", this.f2973e);
        if (!(this.f2974f == null && this.f2975g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f2974f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f2975g.mo21088b(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            taskCompletionSource.mo56137a().mo23703d(f2967j, new zzw(this, g, this.f2972d.schedule(new zzy(taskCompletionSource), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.mo56137a();
        }
        if (this.f2971c.mo21118b() == 2) {
            this.f2970b.sendBroadcast(intent);
        } else {
            this.f2970b.startService(intent);
        }
        taskCompletionSource.mo56137a().mo23703d(f2967j, new zzw(this, g, this.f2972d.schedule(new zzy(taskCompletionSource), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: g */
    private static synchronized String m3437g() {
        String num;
        synchronized (Rpc.class) {
            int i = f2965h;
            f2965h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m3438h(Context context, Intent intent) {
        synchronized (Rpc.class) {
            if (f2966i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f2966i = zza.m55869a(context, 0, intent2, zza.f39277a);
            }
            intent.putExtra("app", f2966i);
        }
    }

    /* renamed from: i */
    private final void m3439i(String str, @Nullable Bundle bundle) {
        String str2;
        synchronized (this.f2969a) {
            TaskCompletionSource remove = this.f2969a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            remove.mo56139c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m3440j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    /* renamed from: a */
    public Task<Bundle> mo21078a(@NonNull Bundle bundle) {
        if (this.f2971c.mo21117a() >= 12000000) {
            return zzs.m3463b(this.f2970b).mo21116d(1, bundle).mo23711l(f2967j, zzv.f3014a);
        }
        if (this.f2971c.mo21118b() != 0) {
            return m3436f(bundle).mo23713n(f2967j, new zzu(this, bundle));
        }
        return Tasks.m66666e(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    @NonNull
    /* renamed from: c */
    public final /* synthetic */ Task mo21079c(@NonNull Bundle bundle, @NonNull Task task) throws Exception {
        if (task.mo23719t() && m3440j((Bundle) task.mo23715p())) {
            return m3436f(bundle).mo23721v(f2967j, zzx.f3018a);
        }
        return task;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21080e(@NonNull String str, @NonNull ScheduledFuture scheduledFuture, @NonNull Task task) {
        synchronized (this.f2969a) {
            this.f2969a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
