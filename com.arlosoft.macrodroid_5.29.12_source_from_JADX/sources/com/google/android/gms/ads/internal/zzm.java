package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzffe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzm extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ zzs f2352a;

    zzm(zzs zzs) {
        this.f2352a = zzs;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzs = this.f2352a;
        if (zzs.f2368p != null) {
            try {
                zzs.f2368p.mo19894C(zzffe.m50085d(1, (String) null, (zze) null));
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
        zzs zzs2 = this.f2352a;
        if (zzs2.f2368p != null) {
            try {
                zzs2.f2368p.mo19893A(0);
            } catch (RemoteException e2) {
                zzcgp.m45231i("#007 Could not call remote method.", e2);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f2352a.mo20459s())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzs zzs = this.f2352a;
            if (zzs.f2368p != null) {
                try {
                    zzs.f2368p.mo19894C(zzffe.m50085d(3, (String) null, (zze) null));
                } catch (RemoteException e) {
                    zzcgp.m45231i("#007 Could not call remote method.", e);
                }
            }
            zzs zzs2 = this.f2352a;
            if (zzs2.f2368p != null) {
                try {
                    zzs2.f2368p.mo19893A(3);
                } catch (RemoteException e2) {
                    zzcgp.m45231i("#007 Could not call remote method.", e2);
                }
            }
            this.f2352a.mo20457Kb(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzs3 = this.f2352a;
            if (zzs3.f2368p != null) {
                try {
                    zzs3.f2368p.mo19894C(zzffe.m50085d(1, (String) null, (zze) null));
                } catch (RemoteException e3) {
                    zzcgp.m45231i("#007 Could not call remote method.", e3);
                }
            }
            zzs zzs4 = this.f2352a;
            if (zzs4.f2368p != null) {
                try {
                    zzs4.f2368p.mo19893A(0);
                } catch (RemoteException e4) {
                    zzcgp.m45231i("#007 Could not call remote method.", e4);
                }
            }
            this.f2352a.mo20457Kb(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzs zzs5 = this.f2352a;
            if (zzs5.f2368p != null) {
                try {
                    zzs5.f2368p.mo19899g();
                } catch (RemoteException e5) {
                    zzcgp.m45231i("#007 Could not call remote method.", e5);
                }
            }
            this.f2352a.mo20457Kb(this.f2352a.mo20460t(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzs zzs6 = this.f2352a;
            if (zzs6.f2368p != null) {
                try {
                    zzs6.f2368p.mo19895a();
                    this.f2352a.f2368p.mo19897e();
                } catch (RemoteException e6) {
                    zzcgp.m45231i("#007 Could not call remote method.", e6);
                }
            }
            zzs.m2841Tb(this.f2352a, zzs.m2838Qb(this.f2352a, str));
            return true;
        }
    }
}
