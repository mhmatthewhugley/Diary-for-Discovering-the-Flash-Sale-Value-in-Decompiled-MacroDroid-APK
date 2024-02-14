package android.support.p004v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0088a();

    /* renamed from: a */
    private final int f232a;

    /* renamed from: c */
    private final float f233c;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    class C0088a implements Parcelable.Creator<RatingCompat> {
        C0088a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f232a = i;
        this.f233c = f;
    }

    public int describeContents() {
        return this.f232a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f232a);
        sb.append(" rating=");
        float f = this.f233c;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f232a);
        parcel.writeFloat(this.f233c);
    }
}
