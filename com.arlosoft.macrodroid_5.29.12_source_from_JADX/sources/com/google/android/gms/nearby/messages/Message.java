package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zznh;
import java.util.Arrays;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Message> CREATOR = new zza();

    /* renamed from: p */
    private static final zznh[] f47623p = {zznh.f44962f};
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47624a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final byte[] f47625c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f47626d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f47627f;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: g */
    final zznh[] f47628g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final long f47629o;

    @SafeParcelable.Constructor
    Message(@SafeParcelable.Param int i, @SafeParcelable.Param @NonNull byte[] bArr, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @NonNull String str2, @SafeParcelable.Param @Nullable zznh[] zznhArr, @SafeParcelable.Param long j) {
        this.f47624a = i;
        this.f47626d = (String) Preconditions.m4488k(str2);
        this.f47627f = str == null ? "" : str;
        this.f47629o = j;
        Preconditions.m4488k(bArr);
        int length = bArr.length;
        Preconditions.m4480c(length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), 102400);
        this.f47625c = bArr;
        this.f47628g = (zznhArr == null || zznhArr.length == 0) ? f47623p : zznhArr;
        Preconditions.m4480c(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.f47627f, message.f47627f) && TextUtils.equals(this.f47626d, message.f47626d) && Arrays.equals(this.f47625c, message.f47625c) && this.f47629o == message.f47629o;
    }

    public int hashCode() {
        return Objects.m4471b(this.f47627f, this.f47626d, Integer.valueOf(Arrays.hashCode(this.f47625c)), Long.valueOf(this.f47629o));
    }

    @NonNull
    /* renamed from: l2 */
    public byte[] mo55883l2() {
        return this.f47625c;
    }

    @NonNull
    /* renamed from: m2 */
    public String mo55884m2() {
        return this.f47627f;
    }

    @NonNull
    /* renamed from: n2 */
    public String mo55885n2() {
        return this.f47626d;
    }

    @NonNull
    public String toString() {
        String str = this.f47627f;
        String str2 = this.f47626d;
        byte[] bArr = this.f47625c;
        int length = bArr == null ? 0 : bArr.length;
        return "Message{namespace='" + str + "', type='" + str2 + "', content=[" + length + " bytes]}";
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4569g(parcel, 1, mo55883l2(), false);
        SafeParcelWriter.m4586x(parcel, 2, mo55885n2(), false);
        SafeParcelWriter.m4586x(parcel, 3, mo55884m2(), false);
        SafeParcelWriter.m4557A(parcel, 4, this.f47628g, i, false);
        SafeParcelWriter.m4581s(parcel, 5, this.f47629o);
        SafeParcelWriter.m4576n(parcel, 1000, this.f47624a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
