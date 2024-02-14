package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbeb> CREATOR = new zzbec();
    @SafeParcelable.Field

    /* renamed from: A */
    public int f26679A;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public final String f26680a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final long f26681c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f26682d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f26683f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f26684g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final Bundle f26685o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final boolean f26686p;
    @SafeParcelable.Field

    /* renamed from: s */
    public long f26687s;
    @SafeParcelable.Field

    /* renamed from: z */
    public String f26688z;

    @SafeParcelable.Constructor
    zzbeb(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param long j, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param boolean z, @SafeParcelable.Param long j2, @SafeParcelable.Param String str5, @SafeParcelable.Param int i) {
        this.f26680a = str;
        this.f26681c = j;
        this.f26682d = str2 == null ? "" : str2;
        this.f26683f = str3 == null ? "" : str3;
        this.f26684g = str4 == null ? "" : str4;
        this.f26685o = bundle == null ? new Bundle() : bundle;
        this.f26686p = z;
        this.f26687s = j2;
        this.f26688z = str5;
        this.f26679A = i;
    }

    @Nullable
    /* renamed from: l2 */
    public static zzbeb m43220l2(Uri uri) {
        long parseLong;
        Uri uri2 = uri;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                zzcgp.m45229g("Expected 2 path parts for namespace and id, found :" + size);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri2.getQueryParameter("url");
            boolean equals = "1".equals(uri2.getQueryParameter("read_only"));
            String queryParameter2 = uri2.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri2.getQueryParameter(next));
                }
            }
            return new zzbeb(queryParameter, j, host, str, str2, bundle, equals, 0, "", 0);
        } catch (NullPointerException | NumberFormatException e) {
            zzcgp.m45230h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f26680a, false);
        SafeParcelWriter.m4581s(parcel, 3, this.f26681c);
        SafeParcelWriter.m4586x(parcel, 4, this.f26682d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f26683f, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f26684g, false);
        SafeParcelWriter.m4567e(parcel, 7, this.f26685o, false);
        SafeParcelWriter.m4565c(parcel, 8, this.f26686p);
        SafeParcelWriter.m4581s(parcel, 9, this.f26687s);
        SafeParcelWriter.m4586x(parcel, 10, this.f26688z, false);
        SafeParcelWriter.m4576n(parcel, 11, this.f26679A);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
