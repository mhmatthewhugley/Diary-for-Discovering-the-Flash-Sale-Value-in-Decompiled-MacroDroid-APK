package org.altbeacon.beacon.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.Serializable;
import org.altbeacon.beacon.Region;

public class StartRMData implements Serializable, Parcelable {
    public static final Parcelable.Creator<StartRMData> CREATOR = new C16009a();
    private boolean mBackgroundFlag;
    private long mBetweenScanPeriod;
    private String mCallbackPackageName;
    private Region mRegion;
    private long mScanPeriod;

    /* renamed from: org.altbeacon.beacon.service.StartRMData$a */
    class C16009a implements Parcelable.Creator<StartRMData> {
        C16009a() {
        }

        /* renamed from: a */
        public StartRMData createFromParcel(Parcel parcel) {
            return new StartRMData(parcel, (C16009a) null);
        }

        /* renamed from: b */
        public StartRMData[] newArray(int i) {
            return new StartRMData[i];
        }
    }

    /* synthetic */ StartRMData(Parcel parcel, C16009a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static StartRMData m96520a(@NonNull Bundle bundle) {
        boolean z;
        bundle.setClassLoader(Region.class.getClassLoader());
        StartRMData startRMData = new StartRMData();
        boolean z2 = true;
        if (bundle.containsKey("region")) {
            startRMData.mRegion = (Region) bundle.getSerializable("region");
            z = true;
        } else {
            z = false;
        }
        if (bundle.containsKey("scanPeriod")) {
            startRMData.mScanPeriod = ((Long) bundle.get("scanPeriod")).longValue();
        } else {
            z2 = z;
        }
        if (bundle.containsKey("betweenScanPeriod")) {
            startRMData.mBetweenScanPeriod = ((Long) bundle.get("betweenScanPeriod")).longValue();
        }
        if (bundle.containsKey("backgroundFlag")) {
            startRMData.mBackgroundFlag = ((Boolean) bundle.get("backgroundFlag")).booleanValue();
        }
        if (bundle.containsKey("callbackPackageName")) {
            startRMData.mCallbackPackageName = (String) bundle.get("callbackPackageName");
        }
        if (z2) {
            return startRMData;
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo76420b() {
        return this.mBackgroundFlag;
    }

    /* renamed from: c */
    public long mo76421c() {
        return this.mBetweenScanPeriod;
    }

    /* renamed from: d */
    public String mo76422d() {
        return this.mCallbackPackageName;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Region mo76424e() {
        return this.mRegion;
    }

    /* renamed from: f */
    public long mo76425f() {
        return this.mScanPeriod;
    }

    /* renamed from: g */
    public Bundle mo76426g() {
        Bundle bundle = new Bundle();
        bundle.putLong("scanPeriod", this.mScanPeriod);
        bundle.putLong("betweenScanPeriod", this.mBetweenScanPeriod);
        bundle.putBoolean("backgroundFlag", this.mBackgroundFlag);
        bundle.putString("callbackPackageName", this.mCallbackPackageName);
        Region region = this.mRegion;
        if (region != null) {
            bundle.putSerializable("region", region);
        }
        return bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRegion, i);
        parcel.writeString(this.mCallbackPackageName);
        parcel.writeLong(this.mScanPeriod);
        parcel.writeLong(this.mBetweenScanPeriod);
        parcel.writeByte(this.mBackgroundFlag ? (byte) 1 : 0);
    }

    private StartRMData() {
    }

    public StartRMData(long j, long j2, boolean z) {
        this.mScanPeriod = j;
        this.mBetweenScanPeriod = j2;
        this.mBackgroundFlag = z;
    }

    public StartRMData(@NonNull Region region, @NonNull String str, long j, long j2, boolean z) {
        this.mScanPeriod = j;
        this.mBetweenScanPeriod = j2;
        this.mRegion = region;
        this.mCallbackPackageName = str;
        this.mBackgroundFlag = z;
    }

    private StartRMData(Parcel parcel) {
        this.mRegion = (Region) parcel.readParcelable(StartRMData.class.getClassLoader());
        this.mCallbackPackageName = parcel.readString();
        this.mScanPeriod = parcel.readLong();
        this.mBetweenScanPeriod = parcel.readLong();
        this.mBackgroundFlag = parcel.readByte() != 0;
    }
}
