package p300jd;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: jd.a */
/* compiled from: ProcessUtils */
public class C13374a {

    /* renamed from: a */
    Context f61396a;

    public C13374a(@NonNull Context context) {
        this.f61396a = context;
    }

    /* renamed from: a */
    public String mo70787a() {
        return this.f61396a.getApplicationContext().getPackageName();
    }

    /* renamed from: b */
    public int mo70788b() {
        return Process.myPid();
    }

    /* renamed from: c */
    public String mo70789c() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f61396a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == mo70788b()) {
                return next.processName;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo70790d() {
        return mo70787a().equals(mo70789c());
    }
}
