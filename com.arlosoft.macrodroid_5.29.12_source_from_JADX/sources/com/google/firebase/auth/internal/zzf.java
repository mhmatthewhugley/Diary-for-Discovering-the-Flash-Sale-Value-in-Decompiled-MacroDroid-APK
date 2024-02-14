package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p204firebaseauthapi.zzxc;
import com.google.android.gms.internal.p204firebaseauthapi.zzxo;
import com.google.android.gms.internal.p204firebaseauthapi.zzyz;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f4661a = "zzf";

    /* renamed from: b */
    private static final zzf f4662b = new zzf();

    private zzf() {
    }

    /* renamed from: b */
    public static zzf m6246b() {
        return f4662b;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m6249e(FirebaseAuth firebaseAuth, zzbm zzbm, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        zzbm.mo22780g(firebaseAuth.mo22612f().mo61950l(), firebaseAuth);
        Preconditions.m4488k(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (!zzax.m6185a().mo22755g(activity, taskCompletionSource2)) {
            task = Tasks.m66666e(zzxc.m58359a(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.mo22612f().mo61952p().mo61961b());
            if (!TextUtils.isEmpty(firebaseAuth.mo22618k())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.mo22618k());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzxo.m58381a().mo50038b());
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", firebaseAuth.mo22612f().mo61951o());
            activity.startActivity(intent);
            task = taskCompletionSource2.mo56137a();
        }
        task.mo23708i(new zzd(this, taskCompletionSource)).mo23705f(new zzc(this, taskCompletionSource));
    }

    /* renamed from: a */
    public final Task mo22786a(FirebaseAuth firebaseAuth, @Nullable String str, Activity activity, boolean z) {
        zzw zzw = (zzw) firebaseAuth.mo22615h();
        SafetyNetClient a = z ? SafetyNet.m66567a(firebaseAuth.mo22612f().mo61950l()) : null;
        zzbm c = zzbm.m6232c();
        if (zzyz.m58519g(firebaseAuth.mo22612f()) || zzw.mo22822e()) {
            return Tasks.m66667f(new zze((String) null, (String) null));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task b = c.mo22776b();
        if (b != null) {
            if (b.mo23719t()) {
                return Tasks.m66667f(new zze((String) null, (String) b.mo23715p()));
            }
            String str2 = f4661a;
            Log.e(str2, "Error in previous reCAPTCHA flow: ".concat(String.valueOf(b.mo23714o().getMessage())));
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (a == null || zzw.mo22820c()) {
            m6249e(firebaseAuth, c, activity, taskCompletionSource);
        } else {
            FirebaseApp f = firebaseAuth.mo22612f();
            byte[] bArr = new byte[0];
            if (str != null) {
                try {
                    bArr = str.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    Log.e(f4661a, "Failed to getBytes with exception: ".concat(String.valueOf(e.getMessage())));
                }
            }
            a.mo56073G(bArr, f.mo61952p().mo61961b()).mo23708i(new zzb(this, taskCompletionSource, firebaseAuth, c, activity)).mo23705f(new zza(this, firebaseAuth, c, activity, taskCompletionSource));
        }
        return taskCompletionSource.mo56137a();
    }
}
