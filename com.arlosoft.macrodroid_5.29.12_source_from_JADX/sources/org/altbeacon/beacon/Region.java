package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Region implements Parcelable, Serializable {
    public static final Parcelable.Creator<Region> CREATOR = new C8043a();

    /* renamed from: a */
    private static final Pattern f19634a = Pattern.compile("^[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}$");
    protected final String mBluetoothAddress;
    protected final List<C8048e> mIdentifiers;
    protected final String mUniqueId;

    /* renamed from: org.altbeacon.beacon.Region$a */
    class C8043a implements Parcelable.Creator<Region> {
        C8043a() {
        }

        /* renamed from: a */
        public Region createFromParcel(Parcel parcel) {
            return new Region(parcel);
        }

        /* renamed from: b */
        public Region[] newArray(int i) {
            return new Region[i];
        }
    }

    public Region(String str, C8048e eVar, C8048e eVar2, C8048e eVar3) {
        ArrayList arrayList = new ArrayList(3);
        this.mIdentifiers = arrayList;
        arrayList.add(eVar);
        arrayList.add(eVar2);
        arrayList.add(eVar3);
        this.mUniqueId = str;
        this.mBluetoothAddress = null;
        Objects.requireNonNull(str, "uniqueId may not be null");
    }

    /* renamed from: h */
    private void m33562h(String str) throws IllegalArgumentException {
        if (str != null && !f19634a.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid mac address: '" + str + "' Must be 6 hex bytes separated by colons.");
        }
    }

    @Deprecated
    /* renamed from: a */
    public Region clone() {
        return new Region(this.mUniqueId, this.mIdentifiers, this.mBluetoothAddress);
    }

    /* renamed from: b */
    public C8048e mo38031b() {
        return mo38032c(0);
    }

    /* renamed from: c */
    public C8048e mo38032c(int i) {
        if (this.mIdentifiers.size() > i) {
            return this.mIdentifiers.get(i);
        }
        return null;
    }

    /* renamed from: d */
    public List<C8048e> mo38034d() {
        return new ArrayList(this.mIdentifiers);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo38036e() {
        return this.mUniqueId;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Region) {
            return ((Region) obj).mUniqueId.equals(this.mUniqueId);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo38038f(Region region) {
        if (region.mIdentifiers.size() != this.mIdentifiers.size()) {
            return false;
        }
        for (int i = 0; i < region.mIdentifiers.size(); i++) {
            if (region.mo38032c(i) == null && mo38032c(i) != null) {
                return false;
            }
            if (region.mo38032c(i) != null && mo38032c(i) == null) {
                return false;
            }
            if ((region.mo38032c(i) != null || mo38032c(i) != null) && !region.mo38032c(i).equals(mo38032c(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo38039g(Beacon beacon) {
        int size = this.mIdentifiers.size();
        while (true) {
            size--;
            if (size >= 0) {
                C8048e eVar = this.mIdentifiers.get(size);
                C8048e eVar2 = null;
                if (size < beacon.mIdentifiers.size()) {
                    eVar2 = beacon.mo37954j(size);
                }
                if ((eVar2 != null || eVar == null) && (eVar2 == null || eVar == null || eVar.equals(eVar2))) {
                }
            } else {
                String str = this.mBluetoothAddress;
                if (str == null || str.equalsIgnoreCase(beacon.mBluetoothAddress)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.mUniqueId.hashCode();
    }

    public String toString() {
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
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUniqueId);
        parcel.writeString(this.mBluetoothAddress);
        parcel.writeInt(this.mIdentifiers.size());
        for (C8048e next : this.mIdentifiers) {
            if (next != null) {
                parcel.writeString(next.toString());
            } else {
                parcel.writeString((String) null);
            }
        }
    }

    public Region(String str, List<C8048e> list, String str2) {
        m33562h(str2);
        this.mIdentifiers = new ArrayList(list);
        this.mUniqueId = str;
        this.mBluetoothAddress = str2;
        Objects.requireNonNull(str, "uniqueId may not be null");
    }

    protected Region(Parcel parcel) {
        this.mUniqueId = parcel.readString();
        this.mBluetoothAddress = parcel.readString();
        int readInt = parcel.readInt();
        this.mIdentifiers = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if (readString == null) {
                this.mIdentifiers.add((Object) null);
            } else {
                this.mIdentifiers.add(C8048e.m33579g(readString));
            }
        }
    }
}
