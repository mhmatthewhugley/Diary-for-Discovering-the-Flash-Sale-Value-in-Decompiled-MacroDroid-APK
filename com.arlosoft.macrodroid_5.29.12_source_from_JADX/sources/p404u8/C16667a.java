package p404u8;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import dagger.android.C11986a;
import p422w8.C16779b;

/* renamed from: u8.a */
/* compiled from: AndroidInjection */
public final class C16667a {
    /* renamed from: a */
    public static void m99103a(Activity activity) {
        C16779b.m99514b(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof C16668b) {
            C11986a<Activity> c = ((C16668b) application).mo27285c();
            C16779b.m99515c(c, "%s.activityInjector() returned null", application.getClass());
            c.mo38318a(activity);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C16668b.class.getCanonicalName()}));
    }

    /* renamed from: b */
    public static void m99104b(Service service) {
        C16779b.m99514b(service, NotificationCompat.CATEGORY_SERVICE);
        Application application = service.getApplication();
        if (application instanceof C16671e) {
            C11986a<Service> a = ((C16671e) application).mo67403a();
            C16779b.m99515c(a, "%s.serviceInjector() returned null", application.getClass());
            a.mo38318a(service);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C16671e.class.getCanonicalName()}));
    }

    /* renamed from: c */
    public static void m99105c(BroadcastReceiver broadcastReceiver, Context context) {
        C16779b.m99514b(broadcastReceiver, "broadcastReceiver");
        C16779b.m99514b(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof C16669c) {
            C11986a<BroadcastReceiver> d = ((C16669c) application).mo67405d();
            C16779b.m99515c(d, "%s.broadcastReceiverInjector() returned null", application.getClass());
            d.mo38318a(broadcastReceiver);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C16669c.class.getCanonicalName()}));
    }

    /* renamed from: d */
    public static void m99106d(ContentProvider contentProvider) {
        C16779b.m99514b(contentProvider, "contentProvider");
        Application application = (Application) contentProvider.getContext().getApplicationContext();
        if (application instanceof C16670d) {
            C11986a<ContentProvider> b = ((C16670d) application).mo67404b();
            C16779b.m99515c(b, "%s.contentProviderInjector() returned null", application.getClass());
            b.mo38318a(contentProvider);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C16670d.class.getCanonicalName()}));
    }
}
