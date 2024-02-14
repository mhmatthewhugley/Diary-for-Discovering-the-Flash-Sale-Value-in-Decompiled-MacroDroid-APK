package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzb extends Fragment implements LifecycleFragment {

    /* renamed from: f */
    private static final WeakHashMap f3490f = new WeakHashMap();

    /* renamed from: a */
    private final Map f3491a = Collections.synchronizedMap(new ArrayMap());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f3492c = 0;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Bundle f3493d;

    /* renamed from: c */
    public static zzb m4273c(Activity activity) {
        zzb zzb;
        WeakHashMap weakHashMap = f3490f;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzb = (zzb) weakReference.get()) != null) {
            return zzb;
        }
        try {
            zzb zzb2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzb2 == null || zzb2.isRemoving()) {
                zzb2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzb2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzb2));
            return zzb2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Nullable
    /* renamed from: N */
    public final Activity mo21371N() {
        return getActivity();
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f3491a.values()) {
            a.mo21362a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f3491a.values()) {
            e.mo21364e(i, i2, intent);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f3492c = 1;
        this.f3493d = bundle;
        for (Map.Entry entry : this.f3491a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo21365f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3492c = 5;
        for (LifecycleCallback g : this.f3491a.values()) {
            g.mo21366g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f3492c = 3;
        for (LifecycleCallback h : this.f3491a.values()) {
            h.mo21367h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f3491a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo21368i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f3492c = 2;
        for (LifecycleCallback j : this.f3491a.values()) {
            j.mo21369j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f3492c = 4;
        for (LifecycleCallback k : this.f3491a.values()) {
            k.mo21370k();
        }
    }

    /* renamed from: t */
    public final void mo21373t(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f3491a.containsKey(str)) {
            this.f3491a.put(str, lifecycleCallback);
            if (this.f3492c > 0) {
                new zzi(Looper.getMainLooper()).post(new zza(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Nullable
    /* renamed from: u */
    public final <T extends LifecycleCallback> T mo21374u(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f3491a.get(str));
    }
}
