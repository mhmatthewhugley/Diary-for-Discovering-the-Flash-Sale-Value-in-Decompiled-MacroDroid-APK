package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzyv {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Logger f40669d = new Logger("FirebaseAuth", "SmsRetrieverHelper");

    /* renamed from: a */
    private final Context f40670a;

    /* renamed from: b */
    private final ScheduledExecutorService f40671b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap f40672c = new HashMap();

    zzyv(@NonNull Context context) {
        this.f40670a = (Context) Preconditions.m4488k(context);
        zzf.m57219a();
        this.f40671b = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    @VisibleForTesting
    /* renamed from: b */
    static String m58495b(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m58497e(zzyv zzyv, String str) {
        zzyu zzyu = (zzyu) zzyv.f40672c.get(str);
        if (zzyu != null && !zzag.m56870d(zzyu.f40663d) && !zzag.m56870d(zzyu.f40664e) && !zzyu.f40661b.isEmpty()) {
            for (zzxa o : zzyu.f40661b) {
                o.mo49999o(PhoneAuthCredential.m6086p2(zzyu.f40663d, zzyu.f40664e));
            }
            zzyu.f40667h = true;
        }
    }

    /* renamed from: m */
    private static String m58500m(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256);
            instance.update(str3.getBytes(zzo.f40266c));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            f40669d.mo21837a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            f40669d.mo21839c("NoSuchAlgorithm: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m58501n(String str) {
        zzyu zzyu = (zzyu) this.f40672c.get(str);
        if (zzyu != null && !zzyu.f40667h && !zzag.m56870d(zzyu.f40663d)) {
            f40669d.mo21844h("Timed out waiting for SMS.", new Object[0]);
            for (zzxa a : zzyu.f40661b) {
                a.mo49985a(zzyu.f40663d);
            }
            zzyu.f40668i = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void mo50080h(String str) {
        zzyu zzyu = (zzyu) this.f40672c.get(str);
        if (zzyu != null) {
            if (!zzyu.f40668i) {
                m58501n(str);
            }
            mo50082j(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo50079c() {
        Signature[] signatureArr;
        try {
            String packageName = this.f40670a.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                signatureArr = Wrappers.m4929a(this.f40670a).mo21963f(packageName, 64).signatures;
            } else {
                signatureArr = Wrappers.m4929a(this.f40670a).mo21963f(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String m = m58500m(packageName, signatureArr[0].toCharsString());
            if (m != null) {
                return m;
            }
            f40669d.mo21839c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f40669d.mo21839c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo50081i(zzxa zzxa, String str) {
        zzyu zzyu = (zzyu) this.f40672c.get(str);
        if (zzyu != null) {
            zzyu.f40661b.add(zzxa);
            if (zzyu.f40666g) {
                zzxa.mo49986b(zzyu.f40663d);
            }
            if (zzyu.f40667h) {
                zzxa.mo49999o(PhoneAuthCredential.m6086p2(zzyu.f40663d, zzyu.f40664e));
            }
            if (zzyu.f40668i) {
                zzxa.mo49985a(zzyu.f40663d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo50082j(String str) {
        zzyu zzyu = (zzyu) this.f40672c.get(str);
        if (zzyu != null) {
            ScheduledFuture scheduledFuture = zzyu.f40665f;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                zzyu.f40665f.cancel(false);
            }
            zzyu.f40661b.clear();
            this.f40672c.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo50083k(String str, zzxa zzxa, long j, boolean z) {
        this.f40672c.put(str, new zzyu(j, z));
        mo50081i(zzxa, str);
        zzyu zzyu = (zzyu) this.f40672c.get(str);
        long j2 = zzyu.f40660a;
        if (j2 <= 0) {
            f40669d.mo21844h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzyu.f40665f = this.f40671b.schedule(new zzyq(this, str), j2, TimeUnit.SECONDS);
        if (!zzyu.f40662c) {
            f40669d.mo21844h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzyt zzyt = new zzyt(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzb.m56922a(this.f40670a.getApplicationContext(), zzyt, intentFilter);
        SmsRetriever.m3278a(this.f40670a).mo20951G().mo23705f(new zzyr(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo50084l(String str) {
        return this.f40672c.get(str) != null;
    }
}
