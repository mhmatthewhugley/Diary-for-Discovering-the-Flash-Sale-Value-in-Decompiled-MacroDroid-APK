package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepj implements zzevd {

    /* renamed from: a */
    public final Context f34646a;

    /* renamed from: b */
    public final zzq f34647b;

    /* renamed from: c */
    public final List f34648c;

    public zzepj(Context context, zzq zzq, List list) {
        this.f34646a = context;
        this.f34647b = zzq;
        this.f34648c = list;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzbkw.f27470a.mo42728e()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            zzt.m2905r();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f34646a.getSystemService("activity");
                if (activityManager != null) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || (componentName = runningTaskInfo.topActivity) == null)) {
                        str = componentName.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f34647b.f2029g);
            bundle3.putInt("height", this.f34647b.f2026c);
            bundle2.putBundle("size", bundle3);
            if (!this.f34648c.isEmpty()) {
                List list = this.f34648c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
