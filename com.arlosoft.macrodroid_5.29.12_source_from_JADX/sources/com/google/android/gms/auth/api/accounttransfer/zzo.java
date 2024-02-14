package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: p */
    private static final ArrayMap<String, FastJsonResponse.Field<?, ?>> f2714p;
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f2715a;
    @SafeParcelable.Field

    /* renamed from: c */
    private List<String> f2716c;
    @SafeParcelable.Field

    /* renamed from: d */
    private List<String> f2717d;
    @SafeParcelable.Field

    /* renamed from: f */
    private List<String> f2718f;
    @SafeParcelable.Field

    /* renamed from: g */
    private List<String> f2719g;
    @SafeParcelable.Field

    /* renamed from: o */
    private List<String> f2720o;

    static {
        ArrayMap<String, FastJsonResponse.Field<?, ?>> arrayMap = new ArrayMap<>();
        f2714p = arrayMap;
        arrayMap.put("registered", FastJsonResponse.Field.m4805q2("registered", 2));
        arrayMap.put("in_progress", FastJsonResponse.Field.m4805q2("in_progress", 3));
        arrayMap.put("success", FastJsonResponse.Field.m4805q2("success", 4));
        arrayMap.put("failed", FastJsonResponse.Field.m4805q2("failed", 5));
        arrayMap.put("escrowed", FastJsonResponse.Field.m4805q2("escrowed", 6));
    }

    public zzo() {
        this.f2715a = 1;
    }

    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo20789a() {
        return f2714p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo20790b(FastJsonResponse.Field field) {
        switch (field.mo21901r2()) {
            case 1:
                return Integer.valueOf(this.f2715a);
            case 2:
                return this.f2716c;
            case 3:
                return this.f2717d;
            case 4:
                return this.f2718f;
            case 5:
                return this.f2719g;
            case 6:
                return this.f2720o;
            default:
                int r2 = field.mo21901r2();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(r2);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo20791d(FastJsonResponse.Field field) {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2715a);
        SafeParcelWriter.m4588z(parcel, 2, this.f2716c, false);
        SafeParcelWriter.m4588z(parcel, 3, this.f2717d, false);
        SafeParcelWriter.m4588z(parcel, 4, this.f2718f, false);
        SafeParcelWriter.m4588z(parcel, 5, this.f2719g, false);
        SafeParcelWriter.m4588z(parcel, 6, this.f2720o, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable List<String> list, @SafeParcelable.Param @Nullable List<String> list2, @SafeParcelable.Param @Nullable List<String> list3, @SafeParcelable.Param @Nullable List<String> list4, @SafeParcelable.Param @Nullable List<String> list5) {
        this.f2715a = i;
        this.f2716c = list;
        this.f2717d = list2;
        this.f2718f = list3;
        this.f2719g = list4;
        this.f2720o = list5;
    }
}
