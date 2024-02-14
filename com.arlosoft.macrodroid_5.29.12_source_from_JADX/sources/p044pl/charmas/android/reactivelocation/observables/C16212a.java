package p044pl.charmas.android.reactivelocation.observables;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Arrays;
import java.util.List;
import p459ef.C17153c;
import p459ef.C17156d;
import p459ef.C17162h;
import p464jf.C17176a;
import p470pf.C17225d;

/* renamed from: pl.charmas.android.reactivelocation.observables.a */
/* compiled from: BaseObservable */
public abstract class C16212a<T> implements C17153c.C17154a<T> {

    /* renamed from: a */
    private final Context f66494a;

    /* renamed from: c */
    private final Handler f66495c;

    /* renamed from: d */
    private final List<Api<? extends Api.ApiOptions.NotRequiredOptions>> f66496d;

    /* renamed from: pl.charmas.android.reactivelocation.observables.a$a */
    /* compiled from: BaseObservable */
    class C16213a implements C17176a {

        /* renamed from: a */
        final /* synthetic */ GoogleApiClient f66497a;

        C16213a(GoogleApiClient googleApiClient) {
            this.f66497a = googleApiClient;
        }

        public void call() {
            if (this.f66497a.mo21255l() || this.f66497a.mo21256m()) {
                C16212a.this.mo78730e(this.f66497a);
                this.f66497a.mo21250f();
            }
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.observables.a$b */
    /* compiled from: BaseObservable */
    private class C16214b implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: a */
        private final C17156d<? super T> f66499a;

        /* renamed from: c */
        private GoogleApiClient f66500c;

        /* synthetic */ C16214b(C16212a aVar, C17156d dVar, C16213a aVar2) {
            this(dVar);
        }

        /* renamed from: A1 */
        public void mo21388A1(@NonNull ConnectionResult connectionResult) {
            this.f66499a.onError(new GoogleAPIConnectionException("Error connecting to GoogleApiClient.", connectionResult));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78732a(GoogleApiClient googleApiClient) {
            this.f66500c = googleApiClient;
        }

        /* renamed from: t1 */
        public void mo21335t1(int i) {
            this.f66499a.onError(new GoogleAPIConnectionSuspendedException(i));
        }

        /* renamed from: y */
        public void mo21336y(Bundle bundle) {
            try {
                C16212a.this.mo78729d(this.f66500c, this.f66499a);
            } catch (Throwable th) {
                this.f66499a.onError(th);
            }
        }

        private C16214b(C17156d<? super T> dVar) {
            this.f66499a = dVar;
        }
    }

    @SafeVarargs
    protected C16212a(C16215b bVar, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        this.f66494a = bVar.mo78733a();
        this.f66495c = bVar.mo78734b();
        this.f66496d = Arrays.asList(apiArr);
    }

    /* renamed from: c */
    private GoogleApiClient m97459c(C17162h<? super T> hVar) {
        C16214b bVar = new C16214b(this, hVar, (C16213a) null);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.f66494a);
        for (Api<? extends Api.ApiOptions.NotRequiredOptions> a : this.f66496d) {
            builder = builder.mo21264a(a);
        }
        GoogleApiClient.Builder c = builder.mo21265b(bVar).mo21266c(bVar);
        Handler handler = this.f66495c;
        if (handler != null) {
            c = c.mo21268e(handler);
        }
        GoogleApiClient d = c.mo21267d();
        bVar.mo78732a(d);
        return d;
    }

    /* renamed from: b */
    public void mo26537a(C17162h<? super T> hVar) {
        GoogleApiClient c = m97459c(hVar);
        try {
            c.mo21249e();
        } catch (Throwable th) {
            if (!hVar.mo80449b()) {
                hVar.onError(th);
            }
        }
        hVar.mo80448a(C17225d.m100808a(new C16213a(c)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo78729d(GoogleApiClient googleApiClient, C17156d<? super T> dVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo78730e(GoogleApiClient googleApiClient);
}
