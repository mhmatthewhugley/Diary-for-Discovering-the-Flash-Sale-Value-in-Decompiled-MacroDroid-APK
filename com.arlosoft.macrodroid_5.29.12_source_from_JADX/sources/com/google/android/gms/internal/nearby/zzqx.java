package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.RangingParameters;
import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.nearby.uwb.UwbDevice;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzqx implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzrs f45044a;

    /* renamed from: b */
    public final /* synthetic */ RangingParameters f45045b;

    /* renamed from: c */
    public final /* synthetic */ zzrr f45046c;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzrv[] zzrvArr;
        zzrs zzrs = this.f45044a;
        RangingParameters rangingParameters = this.f45045b;
        zzrr zzrr = this.f45046c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        zzos zzos = (zzos) ((zzqs) obj).mo21626I();
        zzqg zzqg = new zzqg();
        zzpw zzpw = new zzpw();
        zzpw.mo53150d(rangingParameters.mo56039d());
        zzpw.mo53152f(rangingParameters.mo56041f());
        zzpw.mo53149c(rangingParameters.mo56038c());
        int i = 0;
        if (rangingParameters.mo56037b().isEmpty()) {
            zzrvArr = new zzrv[0];
        } else {
            zzrvArr = new zzrv[rangingParameters.mo56037b().size()];
            for (UwbDevice b : rangingParameters.mo56037b()) {
                zzrt zzrt = new zzrt();
                zzqo zzqo = new zzqo();
                zzqo.mo53192a(b.mo56058b().mo56046a());
                zzrt.mo53212a(zzqo.mo53193b());
                zzrvArr[i] = zzrt.mo53213b();
                i++;
            }
        }
        zzpw.mo53148b(zzrvArr);
        byte[] e = rangingParameters.mo56040e();
        if (e != null) {
            zzpw.mo53151e(e);
        }
        UwbComplexChannel a = rangingParameters.mo56036a();
        if (a != null) {
            zzqt zzqt = new zzqt();
            zzqt.mo53200a(a.mo56050a());
            zzqt.mo53201b(a.mo56051b());
            zzpw.mo53147a(zzqt.mo53202c());
        }
        zzqg.mo53177b(zzpw.mo53153g());
        zzqg.mo53176a(zzrr);
        zzqg.mo53178c(new zzrk(zzrs, taskCompletionSource));
        zzos.mo53091Lb(zzqg.mo53179d());
    }
}
