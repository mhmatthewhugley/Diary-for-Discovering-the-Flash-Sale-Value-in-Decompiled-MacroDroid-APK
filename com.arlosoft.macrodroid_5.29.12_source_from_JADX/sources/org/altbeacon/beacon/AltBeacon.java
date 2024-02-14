package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;

public class AltBeacon extends Beacon {
    public static final Parcelable.Creator<AltBeacon> CREATOR = new C8039a();

    /* renamed from: org.altbeacon.beacon.AltBeacon$a */
    class C8039a implements Parcelable.Creator<AltBeacon> {
        C8039a() {
        }

        /* renamed from: a */
        public AltBeacon createFromParcel(Parcel parcel) {
            return new AltBeacon(parcel);
        }

        /* renamed from: b */
        public AltBeacon[] newArray(int i) {
            return new AltBeacon[i];
        }
    }

    protected AltBeacon() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected AltBeacon(Parcel parcel) {
        super(parcel);
    }
}
