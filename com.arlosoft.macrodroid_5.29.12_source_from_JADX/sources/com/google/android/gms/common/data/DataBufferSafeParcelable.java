package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {

    /* renamed from: d */
    private static final String[] f3519d = {Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA};

    /* renamed from: c */
    private final Parcelable.Creator f3520c;

    @KeepForSdk
    public DataBufferSafeParcelable(@NonNull DataHolder dataHolder, @NonNull Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.f3520c = creator;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public T get(int i) {
        DataHolder dataHolder = (DataHolder) Preconditions.m4488k(this.f3506a);
        byte[] m2 = dataHolder.mo21568m2(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA, i, dataHolder.mo21573r2(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(m2, 0, m2.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.f3520c.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
