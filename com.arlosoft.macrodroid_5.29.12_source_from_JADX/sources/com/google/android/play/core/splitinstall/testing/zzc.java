package com.google.android.play.core.splitinstall.testing;

import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzc extends zzt {

    /* renamed from: b */
    private final Integer f51817b;

    /* renamed from: c */
    private final Map f51818c;

    /* synthetic */ zzc(Integer num, Map map, zzb zzb) {
        this.f51817b = num;
        this.f51818c = map;
    }

    @SplitInstallErrorCode
    @Nullable
    /* renamed from: a */
    public final Integer mo59984a() {
        return this.f51817b;
    }

    /* renamed from: b */
    public final Map mo59985b() {
        return this.f51818c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzt) {
            zzt zzt = (zzt) obj;
            Integer num = this.f51817b;
            if (num != null ? num.equals(zzt.mo59984a()) : zzt.mo59984a() == null) {
                if (this.f51818c.equals(zzt.mo59985b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Integer num = this.f51817b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f51818c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f51817b);
        String valueOf2 = String.valueOf(this.f51818c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 81 + valueOf2.length());
        sb.append("LocalTestingConfig{defaultSplitInstallErrorCode=");
        sb.append(valueOf);
        sb.append(", splitInstallErrorCodeByModule=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
