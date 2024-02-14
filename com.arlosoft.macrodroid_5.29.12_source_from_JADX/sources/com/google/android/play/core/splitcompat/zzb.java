package com.google.android.play.core.splitcompat;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzb extends zzs {

    /* renamed from: a */
    private final File f51764a;

    /* renamed from: b */
    private final String f51765b;

    zzb(File file, String str) {
        Objects.requireNonNull(file, "Null splitFile");
        this.f51764a = file;
        Objects.requireNonNull(str, "Null splitId");
        this.f51765b = str;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public final File mo59935a() {
        return this.f51764a;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public final String mo59936b() {
        return this.f51765b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzs) {
            zzs zzs = (zzs) obj;
            return this.f51764a.equals(zzs.mo59935a()) && this.f51765b.equals(zzs.mo59936b());
        }
    }

    public final int hashCode() {
        return ((this.f51764a.hashCode() ^ 1000003) * 1000003) ^ this.f51765b.hashCode();
    }

    public final String toString() {
        String obj = this.f51764a.toString();
        String str = this.f51765b;
        StringBuilder sb = new StringBuilder(obj.length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(obj);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
