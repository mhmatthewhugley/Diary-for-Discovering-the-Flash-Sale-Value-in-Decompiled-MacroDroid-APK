package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.SafetyNetApi;

public class zzk implements SafetyNetApi {

    static class zza implements SafetyNetApi.zza {

        /* renamed from: a */
        private final Status f45493a;

        /* renamed from: c */
        private final com.google.android.gms.safetynet.zza f45494c;

        public zza(Status status, com.google.android.gms.safetynet.zza zza) {
            this.f45493a = status;
            this.f45494c = zza;
        }

        /* renamed from: c2 */
        public final String mo53762c2() {
            com.google.android.gms.safetynet.zza zza = this.f45494c;
            if (zza == null) {
                return null;
            }
            return zza.mo56074c2();
        }

        public final Status getStatus() {
            return this.f45493a;
        }
    }

    static abstract class zzb extends zzf<SafetyNetApi.zza> {

        /* renamed from: t */
        protected zzg f45495t = new zzs(this);

        public zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return new zza(status, (com.google.android.gms.safetynet.zza) null);
        }
    }

    static abstract class zzc extends zzf<SafetyNetApi.zzc> {

        /* renamed from: t */
        protected zzg f45496t;

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return new zzj(status, false);
        }
    }

    static abstract class zzd extends zzf<SafetyNetApi.zzb> {

        /* renamed from: t */
        protected final zzg f45497t;

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return new zzg(status, (com.google.android.gms.safetynet.zzd) null);
        }
    }

    static abstract class zze extends zzf<SafetyNetApi.RecaptchaTokenResult> {

        /* renamed from: t */
        protected zzg f45498t;

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return new zzh(status, (com.google.android.gms.safetynet.zzf) null);
        }
    }

    static abstract class zzf extends zzf<SafetyNetApi.SafeBrowsingResult> {

        /* renamed from: t */
        protected zzg f45499t;

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return new zzi(status, (SafeBrowsingData) null);
        }
    }

    static class zzg implements SafetyNetApi.zzb {

        /* renamed from: a */
        private final Status f45500a;

        /* renamed from: c */
        private final com.google.android.gms.safetynet.zzd f45501c;

        public zzg(Status status, com.google.android.gms.safetynet.zzd zzd) {
            this.f45500a = status;
            this.f45501c = zzd;
        }

        public final Status getStatus() {
            return this.f45500a;
        }
    }

    static class zzh implements SafetyNetApi.RecaptchaTokenResult {

        /* renamed from: a */
        private final Status f45502a;

        /* renamed from: c */
        private final com.google.android.gms.safetynet.zzf f45503c;

        public zzh(Status status, com.google.android.gms.safetynet.zzf zzf) {
            this.f45502a = status;
            this.f45503c = zzf;
        }

        public final Status getStatus() {
            return this.f45502a;
        }
    }

    public static class zzi implements SafetyNetApi.SafeBrowsingResult {

        /* renamed from: a */
        private Status f45504a;

        /* renamed from: c */
        private final SafeBrowsingData f45505c;

        /* renamed from: d */
        private String f45506d = null;

        /* renamed from: f */
        private long f45507f;

        /* renamed from: g */
        private byte[] f45508g;

        public zzi(Status status, SafeBrowsingData safeBrowsingData) {
            this.f45504a = status;
            this.f45505c = safeBrowsingData;
            if (safeBrowsingData != null) {
                this.f45506d = safeBrowsingData.mo56069o2();
                this.f45507f = safeBrowsingData.mo56068n2();
                this.f45508g = safeBrowsingData.mo56070p2();
            } else if (status.mo21297q2()) {
                this.f45504a = new Status(8);
            }
        }

        public final Status getStatus() {
            return this.f45504a;
        }
    }

    static class zzj implements SafetyNetApi.zzc {

        /* renamed from: a */
        private Status f45509a;

        /* renamed from: c */
        private boolean f45510c;

        public zzj() {
        }

        public zzj(Status status, boolean z) {
            this.f45509a = status;
            this.f45510c = z;
        }

        public final Status getStatus() {
            return this.f45509a;
        }
    }

    /* renamed from: a */
    public static PendingResult<SafetyNetApi.zza> m63990a(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        return googleApiClient.mo21252h(new zzl(googleApiClient, bArr, str));
    }
}
