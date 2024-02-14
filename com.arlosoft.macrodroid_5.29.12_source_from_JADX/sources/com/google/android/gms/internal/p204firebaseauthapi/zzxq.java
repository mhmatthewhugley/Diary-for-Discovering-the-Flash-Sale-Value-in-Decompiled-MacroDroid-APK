package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzxq {

    /* renamed from: a */
    private final Context f40604a;

    /* renamed from: b */
    private zzyk f40605b;

    /* renamed from: c */
    private final String f40606c;

    /* renamed from: d */
    private final FirebaseApp f40607d;

    /* renamed from: e */
    private boolean f40608e = false;

    /* renamed from: f */
    private String f40609f;

    public zzxq(Context context, FirebaseApp firebaseApp, String str) {
        this.f40604a = (Context) Preconditions.m4488k(context);
        this.f40607d = (FirebaseApp) Preconditions.m4488k(firebaseApp);
        this.f40606c = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    /* renamed from: a */
    public final void mo50060a(URLConnection uRLConnection) {
        String str;
        String str2;
        if (this.f40608e) {
            str = String.valueOf(this.f40606c).concat("/FirebaseUI-Android");
        } else {
            str = String.valueOf(this.f40606c).concat("/FirebaseCore-Android");
        }
        if (this.f40605b == null) {
            Context context = this.f40604a;
            this.f40605b = new zzyk(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.f40605b.mo50076b());
        uRLConnection.setRequestProperty("X-Android-Cert", this.f40605b.mo50075a());
        uRLConnection.setRequestProperty("Accept-Language", zzxr.m58409a());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.f40609f);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.f40607d.mo61952p().mo61962c());
        HeartBeatController heartBeatController = (HeartBeatController) FirebaseAuth.getInstance(this.f40607d).mo22606Y().get();
        if (heartBeatController != null) {
            try {
                str2 = (String) Tasks.m66662a(heartBeatController.mo63201a());
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e.getMessage())));
            }
            uRLConnection.setRequestProperty("X-Firebase-Client", str2);
            this.f40609f = null;
        }
        str2 = null;
        uRLConnection.setRequestProperty("X-Firebase-Client", str2);
        this.f40609f = null;
    }

    /* renamed from: b */
    public final void mo50061b(String str) {
        this.f40608e = !TextUtils.isEmpty(str);
    }

    /* renamed from: c */
    public final void mo50062c(String str) {
        this.f40609f = str;
    }
}
