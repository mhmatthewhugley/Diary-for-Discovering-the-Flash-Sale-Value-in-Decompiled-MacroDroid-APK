package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@SafeParcelable.Class
@SafeParcelable.Reserved
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class PutDataRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new zzg();

    /* renamed from: g */
    private static final long f48085g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: o */
    private static final Random f48086o = new SecureRandom();
    @SafeParcelable.Field

    /* renamed from: a */
    private final Uri f48087a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final Bundle f48088c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private byte[] f48089d;
    @SafeParcelable.Field

    /* renamed from: f */
    private long f48090f;

    private PutDataRequest(Uri uri) {
        this(uri, new Bundle(), (byte[]) null, f48085g);
    }

    @NonNull
    /* renamed from: l2 */
    public static PutDataRequest m66811l2(@NonNull String str) {
        Preconditions.m4489l(str, "path must not be null");
        return m66812t2(m66813u2(str));
    }

    @NonNull
    /* renamed from: t2 */
    public static PutDataRequest m66812t2(@NonNull Uri uri) {
        Preconditions.m4489l(uri, "uri must not be null");
        return new PutDataRequest(uri);
    }

    /* renamed from: u2 */
    private static Uri m66813u2(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return new Uri.Builder().scheme("wear").path(str).build();
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    @Nullable
    @VisibleForTesting
    public byte[] getData() {
        return this.f48089d;
    }

    @NonNull
    /* renamed from: m2 */
    public Map<String, Asset> mo56229m2() {
        HashMap hashMap = new HashMap();
        for (String str : this.f48088c.keySet()) {
            hashMap.put(str, (Asset) this.f48088c.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @NonNull
    /* renamed from: n2 */
    public Uri mo56230n2() {
        return this.f48087a;
    }

    /* renamed from: o2 */
    public boolean mo56231o2() {
        return this.f48090f == 0;
    }

    @NonNull
    /* renamed from: p2 */
    public PutDataRequest mo56232p2(@NonNull String str, @NonNull Asset asset) {
        Preconditions.m4488k(str);
        Preconditions.m4488k(asset);
        this.f48088c.putParcelable(str, asset);
        return this;
    }

    @NonNull
    /* renamed from: q2 */
    public PutDataRequest mo56233q2(@Nullable byte[] bArr) {
        this.f48089d = bArr;
        return this;
    }

    @NonNull
    /* renamed from: r2 */
    public PutDataRequest mo56234r2() {
        this.f48090f = 0;
        return this;
    }

    @NonNull
    /* renamed from: s2 */
    public String mo56235s2(boolean z) {
        Object obj;
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f48089d;
        if (bArr == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(bArr.length);
        }
        sb.append("dataSz=".concat(obj.toString()));
        int size = this.f48088c.size();
        sb.append(", numAssets=" + size);
        sb.append(", uri=".concat(String.valueOf(this.f48087a)));
        long j = this.f48090f;
        sb.append(", syncDeadline=" + j);
        if (!z) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.f48088c.keySet()) {
            String valueOf = String.valueOf(this.f48088c.getParcelable(str));
            sb.append("\n    " + str + ": " + valueOf);
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @NonNull
    public String toString() {
        return mo56235s2(Log.isLoggable("DataMap", 3));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4489l(parcel, "dest must not be null");
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, mo56230n2(), i, false);
        SafeParcelWriter.m4567e(parcel, 4, this.f48088c, false);
        SafeParcelWriter.m4569g(parcel, 5, getData(), false);
        SafeParcelWriter.m4581s(parcel, 6, this.f48090f);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    PutDataRequest(@SafeParcelable.Param Uri uri, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param long j) {
        this.f48087a = uri;
        this.f48088c = bundle;
        bundle.setClassLoader((ClassLoader) Preconditions.m4488k(DataItemAssetParcelable.class.getClassLoader()));
        this.f48089d = bArr;
        this.f48090f = j;
    }
}
