package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcba> CREATOR = new zzcbb();
    @SafeParcelable.Field

    /* renamed from: a */
    ParcelFileDescriptor f28117a;

    /* renamed from: c */
    private Parcelable f28118c = null;

    /* renamed from: d */
    private boolean f28119d = true;

    @SafeParcelable.Constructor
    public zzcba(@SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor) {
        this.f28117a = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l2 */
    public final SafeParcelable mo43270l2(Parcelable.Creator creator) {
        if (this.f28119d) {
            if (this.f28117a == null) {
                zzcgp.m45226d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f28117a));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                IOUtils.m4889b(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f28118c = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f28119d = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                zzcgp.m45227e("Could not read from parcel file descriptor", e);
                IOUtils.m4889b(dataInputStream);
                return null;
            } catch (Throwable th2) {
                IOUtils.m4889b(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f28118c;
    }

    /* JADX INFO: finally extract failed */
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f28117a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f28118c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        zzchc.f28456a.execute(new zzcaz(autoCloseOutputStream, marshall));
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                    zzcgp.m45227e("Error transporting the ad response", e);
                    zzt.m2904q().mo43503t(e, "LargeParcelTeleporter.pipeData.2");
                    IOUtils.m4889b(autoCloseOutputStream);
                    this.f28117a = parcelFileDescriptor;
                    int a = SafeParcelWriter.m4563a(parcel);
                    SafeParcelWriter.m4584v(parcel, 2, this.f28117a, i, false);
                    SafeParcelWriter.m4564b(parcel, a);
                }
                this.f28117a = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a2 = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f28117a, i, false);
        SafeParcelWriter.m4564b(parcel, a2);
    }
}
