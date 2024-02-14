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
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {

    /* renamed from: a */
    private final zzb f46162a;

    @VisibleForTesting
    static class zza implements MapLifecycleDelegate {

        /* renamed from: a */
        private final ViewGroup f46163a;

        /* renamed from: b */
        private final IMapViewDelegate f46164b;

        /* renamed from: c */
        private View f46165c;

        public zza(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.f46164b = (IMapViewDelegate) Preconditions.m4488k(iMapViewDelegate);
            this.f46163a = (ViewGroup) Preconditions.m4488k(viewGroup);
        }

        /* renamed from: N */
        public final void mo22037N() {
            try {
                this.f46164b.mo54592N();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: S */
        public final void mo22038S(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.m65132b(bundle, bundle2);
                this.f46164b.mo54593S(bundle2);
                zzby.m65132b(bundle2, bundle);
                this.f46165c = (View) ObjectWrapper.m5050A1(this.f46164b.mo54601r0());
                this.f46163a.removeAllViews();
                this.f46163a.addView(this.f46165c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: U */
        public final void mo22039U(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.m65132b(bundle, bundle2);
                this.f46164b.mo54594U(bundle2);
                zzby.m65132b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo54529a(OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f46164b.mo54595X0(new zzac(this, onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f46164b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.f46164b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f46164b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f46164b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f46164b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: s0 */
        public final void mo22045s0() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        /* renamed from: t0 */
        public final void mo22046t0(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        /* renamed from: u0 */
        public final View mo22047u0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }
    }

    @VisibleForTesting
    static class zzb extends DeferredLifecycleHelper<zza> {

        /* renamed from: e */
        private final ViewGroup f46166e;

        /* renamed from: f */
        private final Context f46167f;

        /* renamed from: g */
        private OnDelegateCreatedListener<zza> f46168g;

        /* renamed from: h */
        private final GoogleMapOptions f46169h;

        /* renamed from: i */
        private final List<OnMapReadyCallback> f46170i = new ArrayList();

        @VisibleForTesting
        zzb(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f46166e = viewGroup;
            this.f46167f = context;
            this.f46169h = googleMapOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo21997a(OnDelegateCreatedListener<zza> onDelegateCreatedListener) {
            this.f46168g = onDelegateCreatedListener;
            if (onDelegateCreatedListener != null && mo21998b() == null) {
                try {
                    MapsInitializer.m64967a(this.f46167f);
                    IMapViewDelegate n8 = zzbz.m65134a(this.f46167f).mo54657n8(ObjectWrapper.m5051g8(this.f46167f), this.f46169h);
                    if (n8 != null) {
                        this.f46168g.mo22048a(new zza(this.f46166e, n8));
                        for (OnMapReadyCallback a : this.f46170i) {
                            ((zza) mo21998b()).mo54529a(a);
                        }
                        this.f46170i.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46162a = new zzb(this, context, GoogleMapOptions.m64924o2(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46162a = new zzb(this, context, GoogleMapOptions.m64924o2(context, attributeSet));
        setClickable(true);
    }
}
