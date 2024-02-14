package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterExportResult implements Parcelable {
    public static final Parcelable.Creator<SoterExportResult> CREATOR = new Parcelable.Creator<SoterExportResult>() {
        public SoterExportResult createFromParcel(Parcel parcel) {
            return new SoterExportResult(parcel);
        }

        public SoterExportResult[] newArray(int i) {
            return new SoterExportResult[i];
        }
    };
    public byte[] exportData;
    public int exportDataLength;
    public int resultCode;

    public SoterExportResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.resultCode);
        parcel.writeByteArray(this.exportData);
        parcel.writeInt(this.exportDataLength);
    }

    public SoterExportResult(Parcel parcel) {
        this.resultCode = parcel.readInt();
        this.exportData = parcel.createByteArray();
        this.exportDataLength = parcel.readInt();
    }
}
