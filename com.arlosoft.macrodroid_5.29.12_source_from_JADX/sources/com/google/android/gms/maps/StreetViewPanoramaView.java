package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a */
    private final zzb f46191a;

    @VisibleForTesting
    static class zza implements StreetViewLifecycleDelegate {

        /* renamed from: a */
        private final ViewGroup f46192a;

        /* renamed from: b */
        private final IStreetViewPanoramaViewDelegate f46193b;

        /* renamed from: c */
        private View f46194c;

        public zza(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.f46193b = (IStreetViewPanoramaViewDelegate) Preconditions.m4488k(iStreetViewPanoramaViewDelegate);
            this.f46192a = (ViewGroup) Preconditions.m4488k(viewGroup);
        }

        /* renamed from: N */
        public final void mo22037N() {
            try {
                this.f46193b.mo54615N();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: S */
        public final void mo22038S(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.m65132b(bundle, bundle2);
                this.f46193b.mo54616S(bundle2);
                zzby.m65132b(bundle2, bundle);
                this.f46194c = (View) ObjectWrapper.m5050A1(this.f46193b.mo54624r0());
                this.f46192a.removeAllViews();
                this.f46192a.addView(this.f46194c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: U */
        public final void mo22039U(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.m65132b(bundle, bundle2);
                this.f46193b.mo54617U(bundle2);
                zzby.m65132b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo54558a(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.f46193b.mo54618j1(new zzaj(this, onStreetViewPanoramaReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f46193b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.f46193b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f46193b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f46193b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f46193b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: s0 */
        public final void mo22045s0() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        /* renamed from: t0 */
        public final void mo22046t0(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        /* renamed from: u0 */
        public final View mo22047u0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }
    }

    @VisibleForTesting
    static class zzb extends DeferredLifecycleHelper<zza> {

        /* renamed from: e */
        private final ViewGroup f46195e;

        /* renamed from: f */
        private final Context f46196f;

        /* renamed from: g */
        private OnDelegateCreatedListener<zza> f46197g;

        /* renamed from: h */
        private final StreetViewPanoramaOptions f46198h;

        /* renamed from: i */
        private final List<OnStreetViewPanoramaReadyCallback> f46199i = new ArrayList();

        @VisibleForTesting
        zzb(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.f46195e = viewGroup;
            this.f46196f = context;
            this.f46198h = streetViewPanoramaOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo21997a(OnDelegateCreatedListener<zza> onDelegateCreatedListener) {
            this.f46197g = onDelegateCreatedListener;
            if (onDelegateCreatedListener != null && mo21998b() == null) {
                try {
                    MapsInitializer.m64967a(this.f46196f);
                    this.f46197g.mo22048a(new zza(this.f46195e, zzbz.m65134a(this.f46196f).mo54651J9(ObjectWrapper.m5051g8(this.f46196f), this.f46198h)));
                    for (OnStreetViewPanoramaReadyCallback a : this.f46199i) {
                        ((zza) mo21998b()).mo54558a(a);
                    }
                    this.f46199i.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46191a = new zzb(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46191a = new zzb(this, context, (StreetViewPanoramaOptions) null);
    }
}
