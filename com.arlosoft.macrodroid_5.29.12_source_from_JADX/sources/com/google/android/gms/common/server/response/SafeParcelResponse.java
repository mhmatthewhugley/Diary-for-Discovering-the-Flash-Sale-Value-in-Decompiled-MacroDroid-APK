package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@KeepForSdk
@SafeParcelable.Class
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f3892a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final Parcel f3893c;

    /* renamed from: d */
    private final int f3894d = 2;
    @SafeParcelable.Field

    /* renamed from: f */
    private final zan f3895f;
    @Nullable

    /* renamed from: g */
    private final String f3896g;

    /* renamed from: o */
    private int f3897o;

    /* renamed from: p */
    private int f3898p;

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param int i, @SafeParcelable.Param Parcel parcel, @SafeParcelable.Param zan zan) {
        this.f3892a = i;
        this.f3893c = (Parcel) Preconditions.m4488k(parcel);
        this.f3895f = zan;
        this.f3896g = zan == null ? null : zan.mo21921l2();
        this.f3897o = 2;
    }

    /* renamed from: i */
    private final void m4817i(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).mo21901r2(), entry);
        }
        sb.append('{');
        int O = SafeParcelReader.m4528O(parcel);
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.m4553w(E));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.mo21909y2()) {
                    int i = field.f3866f;
                    switch (i) {
                        case 0:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, Integer.valueOf(SafeParcelReader.m4520G(parcel, E))));
                            break;
                        case 1:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, SafeParcelReader.m4533c(parcel, E)));
                            break;
                        case 2:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, Long.valueOf(SafeParcelReader.m4523J(parcel, E))));
                            break;
                        case 3:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, Float.valueOf(SafeParcelReader.m4516C(parcel, E))));
                            break;
                        case 4:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, Double.valueOf(SafeParcelReader.m4514A(parcel, E))));
                            break;
                        case 5:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, SafeParcelReader.m4531a(parcel, E)));
                            break;
                        case 6:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, Boolean.valueOf(SafeParcelReader.m4554x(parcel, E))));
                            break;
                        case 7:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, SafeParcelReader.m4547q(parcel, E)));
                            break;
                        case 8:
                        case 9:
                            m4819k(sb, field, FastJsonResponse.m4793f(field, SafeParcelReader.m4537g(parcel, E)));
                            break;
                        case 10:
                            Bundle f = SafeParcelReader.m4536f(parcel, E);
                            HashMap hashMap = new HashMap();
                            for (String str : f.keySet()) {
                                hashMap.put(str, (String) Preconditions.m4488k(f.getString(str)));
                            }
                            m4819k(sb, field, FastJsonResponse.m4793f(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i);
                    }
                } else if (field.f3867g) {
                    sb.append("[");
                    switch (field.f3866f) {
                        case 0:
                            ArrayUtils.m4846f(sb, SafeParcelReader.m4541k(parcel, E));
                            break;
                        case 1:
                            ArrayUtils.m4848h(sb, SafeParcelReader.m4534d(parcel, E));
                            break;
                        case 2:
                            ArrayUtils.m4847g(sb, SafeParcelReader.m4543m(parcel, E));
                            break;
                        case 3:
                            ArrayUtils.m4845e(sb, SafeParcelReader.m4540j(parcel, E));
                            break;
                        case 4:
                            ArrayUtils.m4844d(sb, SafeParcelReader.m4538h(parcel, E));
                            break;
                        case 5:
                            ArrayUtils.m4848h(sb, SafeParcelReader.m4532b(parcel, E));
                            break;
                        case 6:
                            ArrayUtils.m4849i(sb, SafeParcelReader.m4535e(parcel, E));
                            break;
                        case 7:
                            ArrayUtils.m4850j(sb, SafeParcelReader.m4548r(parcel, E));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] o = SafeParcelReader.m4545o(parcel, E);
                            int length = o.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                o[i2].setDataPosition(0);
                                m4817i(sb, field.mo21906w2(), o[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f3866f) {
                        case 0:
                            sb.append(SafeParcelReader.m4520G(parcel, E));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m4533c(parcel, E));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m4523J(parcel, E));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m4516C(parcel, E));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m4514A(parcel, E));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m4531a(parcel, E));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m4554x(parcel, E));
                            break;
                        case 7:
                            String q = SafeParcelReader.m4547q(parcel, E);
                            sb.append("\"");
                            sb.append(JsonUtils.m4893a(q));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g = SafeParcelReader.m4537g(parcel, E);
                            sb.append("\"");
                            sb.append(Base64Utils.m4853c(g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g2 = SafeParcelReader.m4537g(parcel, E);
                            sb.append("\"");
                            sb.append(Base64Utils.m4854d(g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f2 = SafeParcelReader.m4536f(parcel, E);
                            Set<String> keySet = f2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\":\"");
                                sb.append(JsonUtils.m4893a(f2.getString(str2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel n = SafeParcelReader.m4544n(parcel, E);
                            n.setDataPosition(0);
                            m4817i(sb, field.mo21906w2(), n);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == O) {
            sb.append('}');
            return;
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + O, parcel);
    }

    /* renamed from: j */
    private static final void m4818j(StringBuilder sb, int i, @Nullable Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.m4893a(Preconditions.m4488k(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.m4853c((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.m4854d((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.m4894a(sb, (HashMap) Preconditions.m4488k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    /* renamed from: k */
    private static final void m4819k(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (field.f3865d) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m4818j(sb, field.f3864c, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m4818j(sb, field.f3864c, obj);
    }

    @Nullable
    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo20789a() {
        zan zan = this.f3895f;
        if (zan == null) {
            return null;
        }
        return zan.mo21922m2((String) Preconditions.m4488k(this.f3896g));
    }

    @NonNull
    /* renamed from: c */
    public final Object mo21898c(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: e */
    public final boolean mo21899e(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @NonNull
    /* renamed from: h */
    public final Parcel mo21913h() {
        int i = this.f3897o;
        if (i == 0) {
            int a = SafeParcelWriter.m4563a(this.f3893c);
            this.f3898p = a;
            SafeParcelWriter.m4564b(this.f3893c, a);
            this.f3897o = 2;
        } else if (i == 1) {
            SafeParcelWriter.m4564b(this.f3893c, this.f3898p);
            this.f3897o = 2;
        }
        return this.f3893c;
    }

    @NonNull
    public final String toString() {
        Preconditions.m4489l(this.f3895f, "Cannot convert to JSON on client side.");
        Parcel h = mo21913h();
        h.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m4817i(sb, (Map) Preconditions.m4488k(this.f3895f.mo21922m2((String) Preconditions.m4488k(this.f3896g))), h);
        return sb.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zan zan;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3892a);
        SafeParcelWriter.m4583u(parcel, 2, mo21913h(), false);
        int i2 = this.f3894d;
        if (i2 != 0) {
            zan = i2 != 1 ? this.f3895f : this.f3895f;
        } else {
            zan = null;
        }
        SafeParcelWriter.m4584v(parcel, 3, zan, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
