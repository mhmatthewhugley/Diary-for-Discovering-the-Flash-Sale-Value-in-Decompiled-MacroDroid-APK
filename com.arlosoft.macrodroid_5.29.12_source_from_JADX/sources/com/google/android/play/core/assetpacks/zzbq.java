package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbq extends zzet {

    /* renamed from: a */
    private final String f51309a;

    /* renamed from: b */
    private final long f51310b;

    /* renamed from: c */
    private final int f51311c;

    /* renamed from: d */
    private final boolean f51312d;

    /* renamed from: e */
    private final boolean f51313e;

    /* renamed from: f */
    private final byte[] f51314f;

    zzbq(@Nullable String str, long j, int i, boolean z, boolean z2, @Nullable byte[] bArr) {
        this.f51309a = str;
        this.f51310b = j;
        this.f51311c = i;
        this.f51312d = z;
        this.f51313e = z2;
        this.f51314f = bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo59678a() {
        return this.f51311c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo59679b() {
        return this.f51310b;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public final String mo59680c() {
        return this.f51309a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo59681d() {
        return this.f51313e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo59682e() {
        return this.f51312d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzet) {
            zzet zzet = (zzet) obj;
            String str = this.f51309a;
            if (str != null ? str.equals(zzet.mo59680c()) : zzet.mo59680c() == null) {
                if (this.f51310b == zzet.mo59679b() && this.f51311c == zzet.mo59678a() && this.f51312d == zzet.mo59682e() && this.f51313e == zzet.mo59681d()) {
                    if (Arrays.equals(this.f51314f, zzet instanceof zzbq ? ((zzbq) zzet).f51314f : zzet.mo59684f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: f */
    public final byte[] mo59684f() {
        return this.f51314f;
    }

    public final int hashCode() {
        int i;
        String str = this.f51309a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f51310b;
        int i2 = 1237;
        int i3 = (((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f51311c) * 1000003) ^ (true != this.f51312d ? 1237 : 1231)) * 1000003;
        if (true == this.f51313e) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ Arrays.hashCode(this.f51314f);
    }

    public final String toString() {
        String str = this.f51309a;
        long j = this.f51310b;
        int i = this.f51311c;
        boolean z = this.f51312d;
        boolean z2 = this.f51313e;
        String arrays = Arrays.toString(this.f51314f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
