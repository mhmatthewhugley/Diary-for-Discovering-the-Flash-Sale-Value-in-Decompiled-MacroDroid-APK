package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <T extends SafeParcelable> T m4589a(@NonNull byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        Preconditions.m4488k(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public static <T extends SafeParcelable> T m4590b(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m4589a(byteArrayExtra, creator);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static <T extends SafeParcelable> T m4591c(@NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        return m4589a(Base64Utils.m4851a(str), creator);
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    /* renamed from: d */
    public static <T extends SafeParcelable> ArrayList<T> m4592d(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(m4589a((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public static <T extends SafeParcelable> byte[] m4593e(@NonNull T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @KeepForSdk
    /* renamed from: f */
    public static <T extends SafeParcelable> void m4594f(@NonNull T t, @NonNull Intent intent, @NonNull String str) {
        intent.putExtra(str, m4593e(t));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public static <T extends SafeParcelable> String m4595g(@NonNull T t) {
        return Base64Utils.m4854d(m4593e(t));
    }
}
