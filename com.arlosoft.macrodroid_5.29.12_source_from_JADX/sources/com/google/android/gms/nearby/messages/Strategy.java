package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class Strategy extends AbstractSafeParcelable {
    @NonNull
    @Deprecated

    /* renamed from: A */
    public static final Strategy f47651A;
    @ShowFirstParty
    @NonNull
    @Deprecated

    /* renamed from: B */
    public static final Strategy f47652B;
    @NonNull
    public static final Parcelable.Creator<Strategy> CREATOR = new zzf();
    @NonNull

    /* renamed from: z */
    public static final Strategy f47653z = new Builder().mo55908a();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47654a;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c */
    final int f47655c;
    @SafeParcelable.Field

    /* renamed from: d */
    final int f47656d;
    @SafeParcelable.Field

    /* renamed from: f */
    final int f47657f;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: g */
    final boolean f47658g;
    @SafeParcelable.Field

    /* renamed from: o */
    final int f47659o;
    @SafeParcelable.Field

    /* renamed from: p */
    final int f47660p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final int f47661s;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {

        /* renamed from: a */
        private int f47662a = 3;

        /* renamed from: b */
        private int f47663b = 300;

        /* renamed from: c */
        private int f47664c = 0;

        /* renamed from: d */
        private int f47665d = -1;

        @NonNull
        /* renamed from: a */
        public Strategy mo55908a() {
            if (this.f47665d != 2 || this.f47664c != 1) {
                return new Strategy(2, 0, this.f47663b, this.f47664c, false, this.f47665d, this.f47662a, 0);
            }
            throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
        }

        @NonNull
        /* renamed from: b */
        public Builder mo55909b(int i) {
            Preconditions.m4480c(i == Integer.MAX_VALUE || (i > 0 && i <= 86400), "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), 86400);
            this.f47663b = i;
            return this;
        }

        @ShowFirstParty
        @NonNull
        /* renamed from: c */
        public final Builder mo55910c(int i) {
            this.f47665d = 2;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.mo55910c(2);
        builder.mo55909b(Integer.MAX_VALUE);
        Strategy a = builder.mo55908a();
        f47651A = a;
        f47652B = a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Strategy(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.f47654a = r2
            r1.f47655c = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto L_0x000e
        L_0x000b:
            r1.f47660p = r8
            goto L_0x0019
        L_0x000e:
            if (r3 == r0) goto L_0x0017
            r8 = 3
            if (r3 == r8) goto L_0x0014
            goto L_0x000b
        L_0x0014:
            r1.f47660p = r0
            goto L_0x0019
        L_0x0017:
            r1.f47660p = r2
        L_0x0019:
            r1.f47657f = r5
            r1.f47658g = r6
            if (r6 == 0) goto L_0x0027
            r1.f47659o = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f47656d = r2
            goto L_0x0038
        L_0x0027:
            r1.f47656d = r4
            r3 = -1
            if (r7 == r3) goto L_0x0036
            if (r7 == 0) goto L_0x0036
            if (r7 == r2) goto L_0x0036
            r2 = 6
            if (r7 == r2) goto L_0x0036
            r1.f47659o = r7
            goto L_0x0038
        L_0x0036:
            r1.f47659o = r3
        L_0x0038:
            r1.f47661s = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.Strategy.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.f47654a == strategy.f47654a && this.f47660p == strategy.f47660p && this.f47656d == strategy.f47656d && this.f47657f == strategy.f47657f && this.f47659o == strategy.f47659o && this.f47661s == strategy.f47661s;
    }

    public int hashCode() {
        return (((((((((this.f47654a * 31) + this.f47660p) * 31) + this.f47656d) * 31) + this.f47657f) * 31) + this.f47659o) * 31) + this.f47661s;
    }

    @NonNull
    public String toString() {
        String str;
        String str2;
        String str3;
        int i = this.f47656d;
        int i2 = this.f47657f;
        String str4 = "DEFAULT";
        if (i2 == 0) {
            str = str4;
        } else if (i2 != 1) {
            str = "UNKNOWN:" + i2;
        } else {
            str = "EARSHOT";
        }
        int i3 = this.f47659o;
        if (i3 == -1) {
            str2 = str4;
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i3 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                str2 = "UNKNOWN:" + i3;
            } else {
                str2 = arrayList.toString();
            }
        }
        int i4 = this.f47660p;
        if (i4 == 3) {
            str3 = str4;
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i4 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i4 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                str3 = "UNKNOWN:" + i4;
            } else {
                str3 = arrayList2.toString();
            }
        }
        int i5 = this.f47661s;
        if (i5 != 0) {
            if (i5 != 1) {
                str4 = "UNKNOWN: " + i5;
            } else {
                str4 = "ALWAYS_ON";
            }
        }
        return "Strategy{ttlSeconds=" + i + ", distanceType=" + str + ", discoveryMedium=" + str2 + ", discoveryMode=" + str3 + ", backgroundScanMode=" + str4 + "}";
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47655c);
        SafeParcelWriter.m4576n(parcel, 2, this.f47656d);
        SafeParcelWriter.m4576n(parcel, 3, this.f47657f);
        SafeParcelWriter.m4565c(parcel, 4, this.f47658g);
        SafeParcelWriter.m4576n(parcel, 5, this.f47659o);
        SafeParcelWriter.m4576n(parcel, 6, this.f47660p);
        SafeParcelWriter.m4576n(parcel, 7, this.f47661s);
        SafeParcelWriter.m4576n(parcel, 1000, this.f47654a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
