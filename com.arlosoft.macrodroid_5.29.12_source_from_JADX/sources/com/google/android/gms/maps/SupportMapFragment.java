package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment {

    /* renamed from: a */
    private final zzb f46200a = new zzb(this);

    @VisibleForTesting
    static class zza implements MapLifecycleDelegate {

        /* renamed from: a */
        private final Fragment f46201a;

        /* renamed from: b */
        private final IMapFragmentDelegate f46202b;

        public zza(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f46202b = (IMapFragmentDelegate) Preconditions.m4488k(iMapFragmentDelegate);
            this.f46201a = (Fragment) Preconditions.m4488k(fragment);
        }

        /* renamed from: N */
        public final void mo22037N() {
            try {
                this.f46202b.mo54580N();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: S */
        public final void mo22038S(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                zzby.m65132b(bundle, bundle2);
                Bundle arguments = this.f46201a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    zzby.m65133c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f46202b.mo54581S(bundle2);
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
                this.f46202b.mo54582U(bundle2);
                zzby.m65132b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo54560a(OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f46202b.mo54583X0(new zzak(this, onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f46202b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.f46202b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f46202b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f46202b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f46202b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: s0 */
        public final void mo22045s0() {
            try {
                this.f46202b.mo54591s0();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: t0 */
        public final void mo22046t0(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                zzby.m65132b(bundle2, bundle3);
                this.f46202b.mo54590q8(ObjectWrapper.m5051g8(activity), googleMapOptions, bundle3);
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
                IObjectWrapper n1 = this.f46202b.mo54584n1(ObjectWrapper.m5051g8(layoutInflater), ObjectWrapper.m5051g8(viewGroup), bundle2);
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
        private final Fragment f46203e;

        /* renamed from: f */
        private OnDelegateCreatedListener<zza> f46204f;

        /* renamed from: g */
        private Activity f46205g;

        /* renamed from: h */
        private final List<OnMapReadyCallback> f46206h = new ArrayList();

        @VisibleForTesting
        zzb(Fragment fragment) {
            this.f46203e = fragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public final void m65007w(Activity activity) {
            this.f46205g = activity;
            m65009y();
        }

        /* renamed from: y */
        private final void m65009y() {
            if (this.f46205g != null && this.f46204f != null && mo21998b() == null) {
                try {
                    MapsInitializer.m64967a(this.f46205g);
                    IMapFragmentDelegate Y0 = zzbz.m65134a(this.f46205g).mo54653Y0(ObjectWrapper.m5051g8(this.f46205g));
                    if (Y0 != null) {
                        this.f46204f.mo22048a(new zza(this.f46203e, Y0));
                        for (OnMapReadyCallback a : this.f46206h) {
                            ((zza) mo21998b()).mo54560a(a);
                        }
                        this.f46206h.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo21997a(OnDelegateCreatedListener<zza> onDelegateCreatedListener) {
            this.f46204f = onDelegateCreatedListener;
            m65009y();
        }

        /* renamed from: v */
        public final void mo54561v(OnMapReadyCallback onMapReadyCallback) {
            if (mo21998b() != null) {
                ((zza) mo21998b()).mo54560a(onMapReadyCallback);
            } else {
                this.f46206h.add(onMapReadyCallback);
            }
        }
    }

    /* renamed from: U */
    public void mo54559U(OnMapReadyCallback onMapReadyCallback) {
        Preconditions.m4483f("getMapAsync must be called on the main thread.");
        this.f46200a.mo54561v(onMapReadyCallback);
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f46200a.m65007w(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46200a.mo22000d(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = this.f46200a.mo22001e(layoutInflater, viewGroup, bundle);
        e.setClickable(true);
        return e;
    }

    public void onDestroy() {
        this.f46200a.mo22002f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f46200a.mo22003g();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f46200a.m65007w(activity);
            GoogleMapOptions o2 = GoogleMapOptions.m64924o2(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", o2);
            this.f46200a.mo22004h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f46200a.mo22005i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f46200a.mo22006j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f46200a.mo22007k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f46200a.mo22008l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f46200a.mo22009m();
    }

    public void onStop() {
        this.f46200a.mo22010n();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
