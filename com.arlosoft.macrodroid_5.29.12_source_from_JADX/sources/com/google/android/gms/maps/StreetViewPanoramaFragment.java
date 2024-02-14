package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaFragment extends Fragment {

    /* renamed from: a */
    private final zzb f46174a = new zzb(this);

    @VisibleForTesting
    static class zza implements StreetViewLifecycleDelegate {

        /* renamed from: a */
        private final Fragment f46175a;

        /* renamed from: b */
        private final IStreetViewPanoramaFragmentDelegate f46176b;

        public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.f46176b = (IStreetViewPanoramaFragmentDelegate) Preconditions.m4488k(iStreetViewPanoramaFragmentDelegate);
            this.f46175a = (Fragment) Preconditions.m4488k(fragment);
        }

        /* renamed from: N */
        public final void mo22037N() {
            try {
                this.f46176b.mo54603N();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: S */
        public final void mo22038S(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.m65132b(bundle, bundle2);
                Bundle arguments = this.f46175a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    zzby.m65133c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f46176b.mo54604S(bundle2);
                zzby.m65132b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: U */
        public final void mo22039U(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.m65132b(bundle, bundle2);
                this.f46176b.mo54605U(bundle2);
                zzby.m65132b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo54550a(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.f46176b.mo54607j1(new zzah(this, onStreetViewPanoramaReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f46176b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.f46176b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f46176b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f46176b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f46176b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: s0 */
        public final void mo22045s0() {
            try {
                this.f46176b.mo54614s0();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: t0 */
        public final void mo22046t0(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                zzby.m65132b(bundle2, bundle3);
                this.f46176b.mo54606g9(ObjectWrapper.m5051g8(activity), (StreetViewPanoramaOptions) null, bundle3);
                zzby.m65132b(bundle3, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: u0 */
        public final View mo22047u0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.m65132b(bundle, bundle2);
                IObjectWrapper n1 = this.f46176b.mo54608n1(ObjectWrapper.m5051g8(layoutInflater), ObjectWrapper.m5051g8(viewGroup), bundle2);
                zzby.m65132b(bundle2, bundle);
                return (View) ObjectWrapper.m5050A1(n1);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @VisibleForTesting
    static class zzb extends DeferredLifecycleHelper<zza> {

        /* renamed from: e */
        private final Fragment f46177e;

        /* renamed from: f */
        private OnDelegateCreatedListener<zza> f46178f;

        /* renamed from: g */
        private Activity f46179g;

        /* renamed from: h */
        private final List<OnStreetViewPanoramaReadyCallback> f46180h = new ArrayList();

        @VisibleForTesting
        zzb(Fragment fragment) {
            this.f46177e = fragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public final void m64982v(Activity activity) {
            this.f46179g = activity;
            m64984x();
        }

        /* renamed from: x */
        private final void m64984x() {
            if (this.f46179g != null && this.f46178f != null && mo21998b() == null) {
                try {
                    MapsInitializer.m64967a(this.f46179g);
                    this.f46178f.mo22048a(new zza(this.f46177e, zzbz.m65134a(this.f46179g).mo54656d0(ObjectWrapper.m5051g8(this.f46179g))));
                    for (OnStreetViewPanoramaReadyCallback a : this.f46180h) {
                        ((zza) mo21998b()).mo54550a(a);
                    }
                    this.f46180h.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo21997a(OnDelegateCreatedListener<zza> onDelegateCreatedListener) {
            this.f46178f = onDelegateCreatedListener;
            m64984x();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f46174a.m64982v(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46174a.mo22000d(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f46174a.mo22001e(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f46174a.mo22002f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f46174a.mo22003g();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f46174a.m64982v(activity);
            this.f46174a.mo22004h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f46174a.mo22005i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f46174a.mo22006j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f46174a.mo22007k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f46174a.mo22008l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f46174a.mo22009m();
    }

    public void onStop() {
        this.f46174a.mo22010n();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
