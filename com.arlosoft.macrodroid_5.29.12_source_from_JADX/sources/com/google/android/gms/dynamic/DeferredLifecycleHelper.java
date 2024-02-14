package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public LifecycleDelegate f4015a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public Bundle f4016b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LinkedList f4017c;

    /* renamed from: d */
    private final OnDelegateCreatedListener f4018d = new zaa(this);

    @KeepForSdk
    /* renamed from: o */
    public static void m4970o(@NonNull FrameLayout frameLayout) {
        GoogleApiAvailability q = GoogleApiAvailability.m3521q();
        Context context = frameLayout.getContext();
        int i = q.mo21156i(context);
        String d = zac.m4624d(context, i);
        String c = zac.m4623c(context, i);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d);
        linearLayout.addView(textView);
        Intent d2 = q.mo21153d(context, i, (String) null);
        if (d2 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, d2));
        }
    }

    /* renamed from: t */
    private final void m4975t(int i) {
        while (!this.f4017c.isEmpty() && ((zah) this.f4017c.getLast()).mo22050a() >= i) {
            this.f4017c.removeLast();
        }
    }

    /* renamed from: u */
    private final void m4976u(@Nullable Bundle bundle, zah zah) {
        LifecycleDelegate lifecycleDelegate = this.f4015a;
        if (lifecycleDelegate != null) {
            zah.mo22051b(lifecycleDelegate);
            return;
        }
        if (this.f4017c == null) {
            this.f4017c = new LinkedList();
        }
        this.f4017c.add(zah);
        if (bundle != null) {
            Bundle bundle2 = this.f4016b;
            if (bundle2 == null) {
                this.f4016b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo21997a(this.f4018d);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public abstract void mo21997a(@NonNull OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public T mo21998b() {
        return this.f4015a;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: c */
    public void mo21999c(@NonNull FrameLayout frameLayout) {
        m4970o(frameLayout);
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo22000d(@Nullable Bundle bundle) {
        m4976u(bundle, new zac(this, bundle));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public View mo22001e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m4976u(bundle, new zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f4015a == null) {
            mo21999c(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    /* renamed from: f */
    public void mo22002f() {
        LifecycleDelegate lifecycleDelegate = this.f4015a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onDestroy();
        } else {
            m4975t(1);
        }
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo22003g() {
        LifecycleDelegate lifecycleDelegate = this.f4015a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.mo22045s0();
        } else {
            m4975t(2);
        }
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo22004h(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2) {
        m4976u(bundle2, new zab(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo22005i() {
        LifecycleDelegate lifecycleDelegate = this.f4015a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onLowMemory();
        }
    }

    @KeepForSdk
    /* renamed from: j */
    public void mo22006j() {
        LifecycleDelegate lifecycleDelegate = this.f4015a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onPause();
        } else {
            m4975t(5);
        }
    }

    @KeepForSdk
    /* renamed from: k */
    public void mo22007k() {
        m4976u((Bundle) null, new zag(this));
    }

    @KeepForSdk
    /* renamed from: l */
    public void mo22008l(@NonNull Bundle bundle) {
        LifecycleDelegate lifecycleDelegate = this.f4015a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.mo22039U(bundle);
            return;
        }
        Bundle bundle2 = this.f4016b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    /* renamed from: m */
    public void mo22009m() {
        m4976u((Bundle) null, new zaf(this));
    }

    @KeepForSdk
    /* renamed from: n */
    public void mo22010n() {
        LifecycleDelegate lifecycleDelegate = this.f4015a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.mo22037N();
        } else {
            m4975t(4);
        }
    }
}
