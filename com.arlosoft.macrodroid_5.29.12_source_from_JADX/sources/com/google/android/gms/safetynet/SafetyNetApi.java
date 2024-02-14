package com.google.android.gms.safetynet;

import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

@KeepForSdkWithMembers
public interface SafetyNetApi {

    public static class AttestationResponse extends Response<zza> {
        /* renamed from: h */
        public String mo56072h() {
            return ((zza) mo21278c()).mo53762c2();
        }
    }

    public static class HarmfulAppsResponse extends Response<zzb> {
    }

    public static class RecaptchaTokenResponse extends Response<RecaptchaTokenResult> {
    }

    @Deprecated
    public interface RecaptchaTokenResult extends Result {
    }

    @KeepForSdkWithMembers
    public static class SafeBrowsingResponse extends Response<SafeBrowsingResult> {
    }

    @KeepForSdkWithMembers
    @Deprecated
    public interface SafeBrowsingResult extends Result {
    }

    public static class VerifyAppsUserResponse extends Response<zzc> {
    }

    @Deprecated
    public interface zza extends Result {
        /* renamed from: c2 */
        String mo53762c2();
    }

    @Deprecated
    public interface zzb extends Result {
    }

    @Deprecated
    public interface zzc extends Result {
    }
}
