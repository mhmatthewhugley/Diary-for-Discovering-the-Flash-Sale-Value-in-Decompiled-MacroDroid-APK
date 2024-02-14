package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzd extends Fragment implements LifecycleFragment {

    /* renamed from: f */
    private static final WeakHashMap f3497f = new WeakHashMap();

    /* renamed from: a */
    private final Map f3498a = Collections.synchronizedMap(new ArrayMap());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f3499c = 0;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Bundle f3500d;

    /* renamed from: W */
    public static zzd m4279W(FragmentActivity fragmentActivity) {
        zzd zzd;
        WeakHashMap weakHashMap = f3497f;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzd = (zzd) weakReference.get()) != null) {
            return zzd;
        }
        try {
            zzd zzd2 = (zzd) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzd2 == null || zzd2.isRemoving()) {
                zzd2 = new zzd();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) zzd2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(zzd2));
            return zzd2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Nullable
    /* renamed from: N */
    public final /* synthetic */ Activity mo21371N() {
        return getActivity();
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f3498a.values()) {
            a.mo21362a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f3498a.values()) {
            e.mo21364e(i, i2, intent);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f3499c = 1;
        this.f3500d = bundle;
        for (Map.Entry entry : this.f3498a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo21365f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3499c = 5;
        for (LifecycleCallback g : this.f3498a.values()) {
            g.mo21366g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f3499c = 3;
        for (LifecycleCallback h : this.f3498a.values()) {
            h.mo21367h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f3498a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo21368i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f3499c = 2;
        for (LifecycleCallback j : this.f3498a.values()) {
            j.mo21369j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f3499c = 4;
        for (LifecycleCallback k : this.f3498a.values()) {
            k.mo21370k();
        }
    }

    /* renamed from: t */
    public final void mo21373t(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f3498a.containsKey(str)) {
            this.f3498a.put(str, lifecycleCallback);
            if (this.f3499c > 0) {
                new zzi(Looper.getMainLooper()).post(new zzc(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Nullable
    /* renamed from: u */
    public final <T extends LifecycleCallback> T mo21374u(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f3498a.get(str));
    }
}
