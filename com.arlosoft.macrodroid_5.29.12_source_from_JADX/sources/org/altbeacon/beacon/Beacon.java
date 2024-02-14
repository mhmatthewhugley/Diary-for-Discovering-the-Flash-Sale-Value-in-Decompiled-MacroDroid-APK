package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p085ed.C7285a;
import p085ed.C7286b;
import p091fd.C7320c;
import p097gd.C7354d;

public class Beacon implements Parcelable, Serializable {
    @Deprecated
    public static final Parcelable.Creator<Beacon> CREATOR = new C8040a();

    /* renamed from: a */
    private static final List<Long> f19564a = Collections.unmodifiableList(new ArrayList());

    /* renamed from: c */
    private static final List<C8048e> f19565c = Collections.unmodifiableList(new ArrayList());

    /* renamed from: d */
    protected static boolean f19566d = false;

    /* renamed from: f */
    protected static C7320c f19567f = null;

    /* renamed from: g */
    protected static C7285a f19568g = new C7286b();
    protected int mBeaconTypeCode;
    protected String mBluetoothAddress;
    protected String mBluetoothName;
    protected List<Long> mDataFields;
    protected Double mDistance;
    protected List<Long> mExtraDataFields;
    protected long mFirstCycleDetectionTimestamp;
    protected List<C8048e> mIdentifiers;
    protected long mLastCycleDetectionTimestamp;
    protected int mManufacturer;
    protected boolean mMultiFrameBeacon;
    private int mPacketCount;
    protected String mParserIdentifier;
    protected int mRssi;
    private int mRssiMeasurementCount;
    private Double mRunningAverageRssi;
    protected int mServiceUuid;
    protected byte[] mServiceUuid128Bit;
    protected int mTxPower;

    /* renamed from: org.altbeacon.beacon.Beacon$a */
    class C8040a implements Parcelable.Creator<Beacon> {
        C8040a() {
        }

        /* renamed from: a */
        public Beacon createFromParcel(Parcel parcel) {
            return new Beacon(parcel);
        }

        /* renamed from: b */
        public Beacon[] newArray(int i) {
            return new Beacon[i];
        }
    }

    @Deprecated
    protected Beacon(Parcel parcel) {
        boolean z = false;
        this.mRssiMeasurementCount = 0;
        this.mPacketCount = 0;
        this.mRunningAverageRssi = null;
        this.mServiceUuid = -1;
        this.mServiceUuid128Bit = new byte[0];
        this.mMultiFrameBeacon = false;
        this.mFirstCycleDetectionTimestamp = 0;
        this.mLastCycleDetectionTimestamp = 0;
        int readInt = parcel.readInt();
        this.mIdentifiers = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.mIdentifiers.add(C8048e.m33579g(parcel.readString()));
        }
        this.mDistance = Double.valueOf(parcel.readDouble());
        this.mRssi = parcel.readInt();
        this.mTxPower = parcel.readInt();
        this.mBluetoothAddress = parcel.readString();
        this.mBeaconTypeCode = parcel.readInt();
        this.mServiceUuid = parcel.readInt();
        if (parcel.readBoolean()) {
            this.mServiceUuid128Bit = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                this.mServiceUuid128Bit[i2] = parcel.readByte();
            }
        }
        int readInt2 = parcel.readInt();
        this.mDataFields = new ArrayList(readInt2);
        for (int i3 = 0; i3 < readInt2; i3++) {
            this.mDataFields.add(Long.valueOf(parcel.readLong()));
        }
        int readInt3 = parcel.readInt();
        this.mExtraDataFields = new ArrayList(readInt3);
        for (int i4 = 0; i4 < readInt3; i4++) {
            this.mExtraDataFields.add(Long.valueOf(parcel.readLong()));
        }
        this.mManufacturer = parcel.readInt();
        this.mBluetoothName = parcel.readString();
        this.mParserIdentifier = parcel.readString();
        this.mMultiFrameBeacon = parcel.readByte() != 0 ? true : z;
        this.mRunningAverageRssi = (Double) parcel.readValue((ClassLoader) null);
        this.mRssiMeasurementCount = parcel.readInt();
        this.mPacketCount = parcel.readInt();
        this.mFirstCycleDetectionTimestamp = parcel.readLong();
        this.mLastCycleDetectionTimestamp = parcel.readLong();
    }

    /* renamed from: A */
    private StringBuilder m33452A() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (C8048e next : this.mIdentifiers) {
            if (i > 1) {
                sb.append(" ");
            }
            sb.append("id");
            sb.append(i);
            sb.append(": ");
            if (next == null) {
                str = "null";
            } else {
                str = next.toString();
            }
            sb.append(str);
            i++;
        }
        if (this.mParserIdentifier != null) {
            sb.append(" type " + this.mParserIdentifier);
        }
        return sb;
    }

    /* renamed from: a */
    protected static Double m33453a(int i, double d) {
        if (m33454e() != null) {
            return Double.valueOf(m33454e().mo37277a(i, d));
        }
        C7354d.m30377b("Beacon", "Distance calculator not set.  Distance will bet set to -1", new Object[0]);
        return Double.valueOf(-1.0d);
    }

    /* renamed from: e */
    public static C7320c m33454e() {
        return f19567f;
    }

    /* renamed from: h */
    public static boolean m33455h() {
        return f19566d;
    }

    /* renamed from: q */
    public static void m33456q(C7320c cVar) {
        f19567f = cVar;
    }

    /* renamed from: u */
    public static void m33457u(boolean z) {
        f19566d = z;
    }

    /* renamed from: b */
    public String mo37946b() {
        return this.mBluetoothAddress;
    }

    /* renamed from: c */
    public List<Long> mo37947c() {
        if (this.mDataFields.getClass().isInstance(f19564a)) {
            return this.mDataFields;
        }
        return Collections.unmodifiableList(this.mDataFields);
    }

    /* renamed from: d */
    public double mo37948d() {
        if (this.mDistance == null) {
            double d = (double) this.mRssi;
            Double d2 = this.mRunningAverageRssi;
            if (d2 != null) {
                d = d2.doubleValue();
            } else {
                C7354d.m30376a("Beacon", "Not using running average RSSI because it is null", new Object[0]);
            }
            this.mDistance = m33453a(this.mTxPower, d);
        }
        return this.mDistance.doubleValue();
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Beacon)) {
            return false;
        }
        Beacon beacon = (Beacon) obj;
        if (!this.mIdentifiers.equals(beacon.mIdentifiers)) {
            return false;
        }
        if (f19566d) {
            return mo37946b().equals(beacon.mo37946b());
        }
        return true;
    }

    /* renamed from: f */
    public List<Long> mo37950f() {
        if (this.mExtraDataFields.getClass().isInstance(f19564a)) {
            return this.mExtraDataFields;
        }
        return Collections.unmodifiableList(this.mExtraDataFields);
    }

    /* renamed from: g */
    public long mo37951g() {
        return this.mFirstCycleDetectionTimestamp;
    }

    public int hashCode() {
        StringBuilder A = m33452A();
        if (f19566d) {
            A.append(this.mBluetoothAddress);
        }
        return A.toString().hashCode();
    }

    /* renamed from: i */
    public C8048e mo37953i() {
        return this.mIdentifiers.get(0);
    }

    /* renamed from: j */
    public C8048e mo37954j(int i) {
        return this.mIdentifiers.get(i);
    }

    /* renamed from: k */
    public long mo37955k() {
        return this.mLastCycleDetectionTimestamp;
    }

    /* renamed from: l */
    public int mo37956l() {
        return this.mRssi;
    }

    /* renamed from: m */
    public int mo37957m() {
        return this.mServiceUuid;
    }

    /* renamed from: n */
    public boolean mo37958n() {
        return this.mIdentifiers.size() == 0 && this.mDataFields.size() != 0;
    }

    /* renamed from: p */
    public boolean mo37959p() {
        return this.mMultiFrameBeacon;
    }

    /* renamed from: r */
    public void mo37960r(List<Long> list) {
        this.mExtraDataFields = list;
    }

    /* renamed from: t */
    public void mo37961t(long j) {
        this.mFirstCycleDetectionTimestamp = j;
    }

    public String toString() {
        return m33452A().toString();
    }

    /* renamed from: v */
    public void mo37963v(long j) {
        this.mLastCycleDetectionTimestamp = j;
    }

    /* renamed from: w */
    public void mo37964w(int i) {
        this.mPacketCount = i;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.mIdentifiers.size());
        for (C8048e next : this.mIdentifiers) {
            if (next == null) {
                str = null;
            } else {
                str = next.toString();
            }
            parcel.writeString(str);
        }
        parcel.writeDouble(mo37948d());
        parcel.writeInt(this.mRssi);
        parcel.writeInt(this.mTxPower);
        parcel.writeString(this.mBluetoothAddress);
        parcel.writeInt(this.mBeaconTypeCode);
        parcel.writeInt(this.mServiceUuid);
        parcel.writeBoolean(this.mServiceUuid128Bit.length != 0);
        if (this.mServiceUuid128Bit.length != 0) {
            for (int i2 = 0; i2 < 16; i2++) {
                parcel.writeByte(this.mServiceUuid128Bit[i2]);
            }
        }
        parcel.writeInt(this.mDataFields.size());
        for (Long longValue : this.mDataFields) {
            parcel.writeLong(longValue.longValue());
        }
        parcel.writeInt(this.mExtraDataFields.size());
        for (Long longValue2 : this.mExtraDataFields) {
            parcel.writeLong(longValue2.longValue());
        }
        parcel.writeInt(this.mManufacturer);
        parcel.writeString(this.mBluetoothName);
        parcel.writeString(this.mParserIdentifier);
        parcel.writeByte(this.mMultiFrameBeacon ? (byte) 1 : 0);
        parcel.writeValue(this.mRunningAverageRssi);
        parcel.writeInt(this.mRssiMeasurementCount);
        parcel.writeInt(this.mPacketCount);
        parcel.writeLong(this.mFirstCycleDetectionTimestamp);
        parcel.writeLong(this.mLastCycleDetectionTimestamp);
    }

    /* renamed from: x */
    public void mo37965x(int i) {
        this.mRssi = i;
    }

    /* renamed from: y */
    public void mo37966y(int i) {
        this.mRssiMeasurementCount = i;
    }

    /* renamed from: z */
    public void mo37967z(double d) {
        this.mRunningAverageRssi = Double.valueOf(d);
        this.mDistance = null;
    }

    protected Beacon() {
        this.mRssiMeasurementCount = 0;
        this.mPacketCount = 0;
        this.mRunningAverageRssi = null;
        this.mServiceUuid = -1;
        this.mServiceUuid128Bit = new byte[0];
        this.mMultiFrameBeacon = false;
        this.mFirstCycleDetectionTimestamp = 0;
        this.mLastCycleDetectionTimestamp = 0;
        this.mIdentifiers = new ArrayList(1);
        this.mDataFields = new ArrayList(1);
        this.mExtraDataFields = new ArrayList(1);
    }
}
