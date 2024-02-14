package android.support.p004v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0099a();

    /* renamed from: a */
    public int f262a;

    /* renamed from: c */
    public int f263c;

    /* renamed from: d */
    public int f264d;

    /* renamed from: f */
    public int f265f;

    /* renamed from: g */
    public int f266g;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    class C0099a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0099a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f262a = parcel.readInt();
        this.f264d = parcel.readInt();
        this.f265f = parcel.readInt();
        this.f266g = parcel.readInt();
        this.f263c = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f262a);
        parcel.writeInt(this.f264d);
        parcel.writeInt(this.f265f);
        parcel.writeInt(this.f266g);
        parcel.writeInt(this.f263c);
    }
}
