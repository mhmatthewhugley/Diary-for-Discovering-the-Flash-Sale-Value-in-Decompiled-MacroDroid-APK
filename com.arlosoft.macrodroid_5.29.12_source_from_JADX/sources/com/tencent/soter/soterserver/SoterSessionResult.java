package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterSessionResult implements Parcelable {
    public static final Parcelable.Creator<SoterSessionResult> CREATOR = new Parcelable.Creator<SoterSessionResult>() {
        public SoterSessionResult createFromParcel(Parcel parcel) {
            return new SoterSessionResult(parcel);
        }

        public SoterSessionResult[] newArray(int i) {
            return new SoterSessionResult[i];
        }
    };
    public int resultCode;
    public long session;

    public SoterSessionResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.session);
        parcel.writeInt(this.resultCode);
    }

    protected SoterSessionResult(Parcel parcel) {
        this.session = parcel.readLong();
        this.resultCode = parcel.readInt();
    }
}
