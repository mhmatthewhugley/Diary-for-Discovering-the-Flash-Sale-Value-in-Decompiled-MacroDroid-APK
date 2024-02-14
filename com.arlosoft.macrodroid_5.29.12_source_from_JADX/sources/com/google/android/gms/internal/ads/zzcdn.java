package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcdn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdn> CREATOR = new zzcdo();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f28249a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f28250c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final boolean f28251d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final boolean f28252f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final List f28253g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final boolean f28254o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final boolean f28255p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final List f28256s;

    @SafeParcelable.Constructor
    public zzcdn(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param List list, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4, @SafeParcelable.Param List list2) {
        this.f28249a = str;
        this.f28250c = str2;
        this.f28251d = z;
        this.f28252f = z2;
        this.f28253g = list;
        this.f28254o = z3;
        this.f28255p = z4;
        this.f28256s = list2 == null ? new ArrayList() : list2;
    }

    @Nullable
    /* renamed from: l2 */
    public static zzcdn m44980l2(JSONObject jSONObject) throws JSONException {
        return new zzcdn(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzbu.m2593c(jSONObject.optJSONArray("allowed_headers"), (List) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzbu.m2593c(jSONObject.optJSONArray("webview_permissions"), (List) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f28249a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f28250c, false);
        SafeParcelWriter.m4565c(parcel, 4, this.f28251d);
        SafeParcelWriter.m4565c(parcel, 5, this.f28252f);
        SafeParcelWriter.m4588z(parcel, 6, this.f28253g, false);
        SafeParcelWriter.m4565c(parcel, 7, this.f28254o);
        SafeParcelWriter.m4565c(parcel, 8, this.f28255p);
        SafeParcelWriter.m4588z(parcel, 9, this.f28256s, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
