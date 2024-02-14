package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaag */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaag> CREATOR = new zzaah();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List f39477a;

    public zzaag() {
        this.f39477a = new ArrayList();
    }

    /* renamed from: l2 */
    public static zzaag m56009l2(JSONArray jSONArray) throws JSONException {
        zzaae zzaae;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzaag(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                zzaae = new zzaae();
            } else {
                zzaae = new zzaae(Strings.m4911a(jSONObject.optString("federatedId", (String) null)), Strings.m4911a(jSONObject.optString("displayName", (String) null)), Strings.m4911a(jSONObject.optString("photoUrl", (String) null)), Strings.m4911a(jSONObject.optString("providerId", (String) null)), (String) null, Strings.m4911a(jSONObject.optString("phoneNumber", (String) null)), Strings.m4911a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null)));
            }
            arrayList.add(zzaae);
        }
        return new zzaag(arrayList);
    }

    /* renamed from: m2 */
    public static zzaag m56010m2(zzaag zzaag) {
        List list = zzaag.f39477a;
        zzaag zzaag2 = new zzaag();
        if (list != null) {
            zzaag2.f39477a.addAll(list);
        }
        return zzaag2;
    }

    /* renamed from: n2 */
    public final List mo48751n2() {
        return this.f39477a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 2, this.f39477a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzaag(@SafeParcelable.Param List list) {
        if (list == null || list.isEmpty()) {
            this.f39477a = Collections.emptyList();
        } else {
            this.f39477a = Collections.unmodifiableList(list);
        }
    }
}
