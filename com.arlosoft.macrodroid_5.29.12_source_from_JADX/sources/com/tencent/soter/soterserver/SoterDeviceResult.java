package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterDeviceResult implements Parcelable {
    public static final Parcelable.Creator<SoterDeviceResult> CREATOR = new Parcelable.Creator<SoterDeviceResult>() {
        public SoterDeviceResult createFromParcel(Parcel parcel) {
            return new SoterDeviceResult(parcel);
        }

        public SoterDeviceResult[] newArray(int i) {
            return new SoterDeviceResult[i];
        }
    };
    public byte[] exportData;
    public int exportDataLength;
    public int resultCode;

    public SoterDeviceResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.resultCode);
        parcel.writeByteArray(this.exportData);
        parcel.writeInt(this.exportDataLength);
    }

    protected SoterDeviceResult(Parcel parcel) {
        this.resultCode = parcel.readInt();
        this.exportData = parcel.createByteArray();
        this.exportDataLength = parcel.readInt();
    }
}
