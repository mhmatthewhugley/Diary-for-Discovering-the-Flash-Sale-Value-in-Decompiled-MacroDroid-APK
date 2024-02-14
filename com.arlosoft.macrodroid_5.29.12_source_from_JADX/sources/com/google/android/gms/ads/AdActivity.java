package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcgp;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdActivity extends Activity {
    @Nullable

    /* renamed from: a */
    private zzbzc f1656a;

    /* renamed from: a */
    private final void m1672a() {
        zzbzc zzbzc = this.f1656a;
        if (zzbzc != null) {
            try {
                zzbzc.mo20212w();
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, @NonNull Intent intent) {
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20194V8(i, i2, intent);
            }
        } catch (Exception e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null && !zzbzc.mo20189P()) {
                return;
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbzc zzbzc2 = this.f1656a;
            if (zzbzc2 != null) {
                zzbzc2.mo20199e();
            }
        } catch (RemoteException e2) {
            zzcgp.m45231i("#007 Could not call remote method.", e2);
        }
    }

    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20200i0(ObjectWrapper.m5051g8(configuration));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zzbzc m = zzaw.m1916a().mo19881m(this);
        this.f1656a = m;
        if (m != null) {
            try {
                m.mo20193T0(bundle);
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
                finish();
            }
        } else {
            zzcgp.m45231i("#007 Could not call remote method.", (Throwable) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20201j();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20207n();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20205l();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20206m();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20204k0(bundle);
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20210q();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20208p();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbzc zzbzc = this.f1656a;
            if (zzbzc != null) {
                zzbzc.mo20211r();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        m1672a();
    }

    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        m1672a();
    }

    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m1672a();
    }
}
