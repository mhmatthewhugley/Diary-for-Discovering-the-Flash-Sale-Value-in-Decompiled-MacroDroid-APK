package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzbx;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public class ConsentDebugSettings {

    /* renamed from: a */
    private final boolean f51989a;

    /* renamed from: b */
    private final int f51990b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public static class Builder {

        /* renamed from: a */
        private final List<String> f51991a = new ArrayList();

        /* renamed from: b */
        private final Context f51992b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f51993c = 0;

        /* renamed from: d */
        private boolean f51994d;

        public Builder(@RecentlyNonNull Context context) {
            this.f51992b = context.getApplicationContext();
        }

        @RecentlyNonNull
        /* renamed from: a */
        public ConsentDebugSettings mo60044a() {
            Context context = this.f51992b;
            List<String> list = this.f51991a;
            boolean z = true;
            if (!zzbx.m55962b() && !list.contains(zzbx.m55961a(context)) && !this.f51994d) {
                z = false;
            }
            return new ConsentDebugSettings(z, this, (zza) null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public @interface DebugGeography {
    }

    /* synthetic */ ConsentDebugSettings(boolean z, Builder builder, zza zza) {
        this.f51989a = z;
        this.f51990b = builder.f51993c;
    }

    /* renamed from: a */
    public int mo60042a() {
        return this.f51990b;
    }

    /* renamed from: b */
    public boolean mo60043b() {
        return this.f51989a;
    }
}
