package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zza extends InstallState {

    /* renamed from: a */
    private final int f51653a;

    /* renamed from: b */
    private final long f51654b;

    /* renamed from: c */
    private final long f51655c;

    /* renamed from: d */
    private final int f51656d;

    /* renamed from: e */
    private final String f51657e;

    zza(int i, long j, long j2, int i2, String str) {
        this.f51653a = i;
        this.f51654b = j;
        this.f51655c = j2;
        this.f51656d = i2;
        Objects.requireNonNull(str, "Null packageName");
        this.f51657e = str;
    }

    /* renamed from: a */
    public final long mo59792a() {
        return this.f51654b;
    }

    @InstallErrorCode
    /* renamed from: b */
    public final int mo59793b() {
        return this.f51656d;
    }

    @InstallStatus
    /* renamed from: c */
    public final int mo59794c() {
        return this.f51653a;
    }

    /* renamed from: d */
    public final String mo59795d() {
        return this.f51657e;
    }

    /* renamed from: e */
    public final long mo59796e() {
        return this.f51655c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f51653a == installState.mo59794c() && this.f51654b == installState.mo59792a() && this.f51655c == installState.mo59796e() && this.f51656d == installState.mo59793b() && this.f51657e.equals(installState.mo59795d());
        }
    }

    public final int hashCode() {
        int i = this.f51653a;
        long j = this.f51654b;
        long j2 = this.f51655c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f51656d) * 1000003) ^ this.f51657e.hashCode();
    }

    public final String toString() {
        int i = this.f51653a;
        long j = this.f51654b;
        long j2 = this.f51655c;
        int i2 = this.f51656d;
        String str = this.f51657e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
