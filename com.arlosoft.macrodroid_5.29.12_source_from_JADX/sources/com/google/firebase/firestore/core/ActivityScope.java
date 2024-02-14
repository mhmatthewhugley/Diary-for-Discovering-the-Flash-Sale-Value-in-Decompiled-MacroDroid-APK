package com.google.firebase.firestore.core;

import android.app.Activity;
import android.app.Fragment;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

public class ActivityScope {

    private static class CallbackList {

        /* renamed from: a */
        private final List<Runnable> f5803a;

        private CallbackList() {
            this.f5803a = new ArrayList();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo23800a(Runnable runnable) {
            this.f5803a.add(runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo23801b() {
            for (Runnable next : this.f5803a) {
                if (next != null) {
                    next.run();
                }
            }
        }
    }

    public static class StopListenerFragment extends Fragment {

        /* renamed from: a */
        CallbackList f5804a = new CallbackList();

        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.f5804a) {
                callbackList = this.f5804a;
                this.f5804a = new CallbackList();
            }
            callbackList.mo23801b();
        }
    }

    public static class StopListenerSupportFragment extends androidx.fragment.app.Fragment {

        /* renamed from: a */
        CallbackList f5805a = new CallbackList();

        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.f5805a) {
                callbackList = this.f5805a;
                this.f5805a = new CallbackList();
            }
            callbackList.mo23801b();
        }
    }

    @Nullable
    /* renamed from: a */
    private static <T> T m8006a(Class<T> cls, @Nullable Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m8007b(Activity activity, Runnable runnable) {
        StopListenerFragment stopListenerFragment = (StopListenerFragment) m8006a(StopListenerFragment.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (stopListenerFragment == null || stopListenerFragment.isRemoving()) {
            stopListenerFragment = new StopListenerFragment();
            activity.getFragmentManager().beginTransaction().add(stopListenerFragment, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        stopListenerFragment.f5804a.mo23800a(runnable);
    }

    /* renamed from: c */
    static /* synthetic */ void m8008c(FragmentActivity fragmentActivity, Runnable runnable) {
        StopListenerSupportFragment stopListenerSupportFragment = (StopListenerSupportFragment) m8006a(StopListenerSupportFragment.class, fragmentActivity.getSupportFragmentManager().findFragmentByTag("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (stopListenerSupportFragment == null || stopListenerSupportFragment.isRemoving()) {
            stopListenerSupportFragment = new StopListenerSupportFragment();
            fragmentActivity.getSupportFragmentManager().beginTransaction().add((androidx.fragment.app.Fragment) stopListenerSupportFragment, "FirestoreOnStopObserverSupportFragment").commitAllowingStateLoss();
            fragmentActivity.getSupportFragmentManager().executePendingTransactions();
        }
        stopListenerSupportFragment.f5805a.mo23800a(runnable);
    }
}
