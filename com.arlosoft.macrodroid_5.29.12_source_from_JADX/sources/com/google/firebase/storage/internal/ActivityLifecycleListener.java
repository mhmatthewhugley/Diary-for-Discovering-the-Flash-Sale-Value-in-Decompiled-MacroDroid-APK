package com.google.firebase.storage.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ActivityLifecycleListener {

    /* renamed from: c */
    private static final ActivityLifecycleListener f55480c = new ActivityLifecycleListener();

    /* renamed from: a */
    private final Map<Object, LifecycleEntry> f55481a = new HashMap();

    /* renamed from: b */
    private final Object f55482b = new Object();

    private static class LifecycleEntry {
        @NonNull

        /* renamed from: a */
        private final Activity f55483a;
        @NonNull

        /* renamed from: b */
        private final Runnable f55484b;
        @NonNull

        /* renamed from: c */
        private final Object f55485c;

        public LifecycleEntry(@NonNull Activity activity, @NonNull Runnable runnable, @NonNull Object obj) {
            this.f55483a = activity;
            this.f55484b = runnable;
            this.f55485c = obj;
        }

        @NonNull
        /* renamed from: a */
        public Activity mo63701a() {
            return this.f55483a;
        }

        @NonNull
        /* renamed from: b */
        public Object mo63702b() {
            return this.f55485c;
        }

        @NonNull
        /* renamed from: c */
        public Runnable mo63703c() {
            return this.f55484b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof LifecycleEntry)) {
                return false;
            }
            LifecycleEntry lifecycleEntry = (LifecycleEntry) obj;
            if (lifecycleEntry.f55485c.equals(this.f55485c) && lifecycleEntry.f55484b == this.f55484b && lifecycleEntry.f55483a == this.f55483a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f55485c.hashCode();
        }
    }

    private static class OnStopCallback extends LifecycleCallback {

        /* renamed from: c */
        private final List<LifecycleEntry> f55486c = new ArrayList();

        private OnStopCallback(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.f3200a.mo21373t("StorageOnStopCallback", this);
        }

        /* renamed from: m */
        public static OnStopCallback m77588m(Activity activity) {
            LifecycleFragment d = LifecycleCallback.m3792d(new LifecycleActivity(activity));
            OnStopCallback onStopCallback = (OnStopCallback) d.mo21374u("StorageOnStopCallback", OnStopCallback.class);
            return onStopCallback == null ? new OnStopCallback(d) : onStopCallback;
        }

        @MainThread
        /* renamed from: k */
        public void mo21370k() {
            ArrayList arrayList;
            synchronized (this.f55486c) {
                arrayList = new ArrayList(this.f55486c);
                this.f55486c.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LifecycleEntry lifecycleEntry = (LifecycleEntry) it.next();
                if (lifecycleEntry != null) {
                    lifecycleEntry.mo63703c().run();
                    ActivityLifecycleListener.m77582a().mo63699b(lifecycleEntry.mo63702b());
                }
            }
        }

        /* renamed from: l */
        public void mo63706l(LifecycleEntry lifecycleEntry) {
            synchronized (this.f55486c) {
                this.f55486c.add(lifecycleEntry);
            }
        }

        /* renamed from: n */
        public void mo63707n(LifecycleEntry lifecycleEntry) {
            synchronized (this.f55486c) {
                this.f55486c.remove(lifecycleEntry);
            }
        }
    }

    private ActivityLifecycleListener() {
    }

    @NonNull
    /* renamed from: a */
    public static ActivityLifecycleListener m77582a() {
        return f55480c;
    }

    /* renamed from: b */
    public void mo63699b(@NonNull Object obj) {
        synchronized (this.f55482b) {
            LifecycleEntry lifecycleEntry = this.f55481a.get(obj);
            if (lifecycleEntry != null) {
                OnStopCallback.m77588m(lifecycleEntry.mo63701a()).mo63707n(lifecycleEntry);
            }
        }
    }

    /* renamed from: c */
    public void mo63700c(@NonNull Activity activity, @NonNull Object obj, @NonNull Runnable runnable) {
        synchronized (this.f55482b) {
            LifecycleEntry lifecycleEntry = new LifecycleEntry(activity, runnable, obj);
            OnStopCallback.m77588m(activity).mo63706l(lifecycleEntry);
            this.f55481a.put(obj, lifecycleEntry);
        }
    }
}
