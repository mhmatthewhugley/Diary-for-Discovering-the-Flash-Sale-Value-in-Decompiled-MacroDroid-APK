package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterSignResult implements Parcelable {
    public static final Parcelable.Creator<SoterSignResult> CREATOR = new Parcelable.Creator<SoterSignResult>() {
        public SoterSignResult createFromParcel(Parcel parcel) {
            return new SoterSignResult(parcel);
        }

        public SoterSignResult[] newArray(int i) {
            return new SoterSignResult[i];
        }
    };
    public byte[] exportData;
    public int exportDataLength;
    public int resultCode;

    public SoterSignResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.resultCode);
        parcel.writeByteArray(this.exportData);
        parcel.writeInt(this.exportDataLength);
    }

    protected SoterSignResult(Parcel parcel) {
        this.resultCode = parcel.readInt();
        this.exportData = parcel.createByteArray();
        this.exportDataLength = parcel.readInt();
    }
}
