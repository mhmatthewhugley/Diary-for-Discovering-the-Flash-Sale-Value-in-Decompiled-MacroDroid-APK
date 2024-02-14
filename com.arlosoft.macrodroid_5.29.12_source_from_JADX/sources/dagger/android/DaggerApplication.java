package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import com.google.errorprone.annotations.ForOverride;
import p404u8.C16668b;
import p404u8.C16669c;
import p404u8.C16670d;
import p404u8.C16671e;

public abstract class DaggerApplication extends Application implements C16668b, C16671e, C16669c, C16670d {

    /* renamed from: a */
    DispatchingAndroidInjector<Activity> f58180a;

    /* renamed from: c */
    DispatchingAndroidInjector<BroadcastReceiver> f58181c;

    /* renamed from: d */
    DispatchingAndroidInjector<Service> f58182d;

    /* renamed from: f */
    DispatchingAndroidInjector<ContentProvider> f58183f;

    /* renamed from: g */
    private volatile boolean f58184g = true;

    /* renamed from: h */
    private void m82369h() {
        if (this.f58184g) {
            synchronized (this) {
                if (this.f58184g) {
                    mo67407f().mo38318a(this);
                    if (this.f58184g) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public C11986a<ContentProvider> mo67404b() {
        m82369h();
        return this.f58183f;
    }

    /* renamed from: e */
    public DispatchingAndroidInjector<Activity> mo27285c() {
        return this.f58180a;
    }

    /* access modifiers changed from: protected */
    @ForOverride
    /* renamed from: f */
    public abstract C11986a<? extends DaggerApplication> mo67407f();

    /* renamed from: g */
    public DispatchingAndroidInjector<BroadcastReceiver> mo67405d() {
        return this.f58181c;
    }

    /* renamed from: i */
    public DispatchingAndroidInjector<Service> mo67403a() {
        return this.f58182d;
    }

    public void onCreate() {
        super.onCreate();
        m82369h();
    }
}
