package com.thoughtbot.expandablerecyclerview.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class ExpandableGroup<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ExpandableGroup> CREATOR = new C11773a();

    /* renamed from: a */
    private String f57714a;

    /* renamed from: c */
    private List<T> f57715c;

    /* renamed from: com.thoughtbot.expandablerecyclerview.models.ExpandableGroup$a */
    static class C11773a implements Parcelable.Creator<ExpandableGroup> {
        C11773a() {
        }

        /* renamed from: a */
        public ExpandableGroup createFromParcel(Parcel parcel) {
            return new ExpandableGroup(parcel);
        }

        /* renamed from: b */
        public ExpandableGroup[] newArray(int i) {
            return new ExpandableGroup[i];
        }
    }

    public ExpandableGroup(String str, List<T> list) {
        this.f57714a = str;
        this.f57715c = list;
    }

    /* renamed from: a */
    public int mo66994a() {
        List<T> list = this.f57715c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: b */
    public List<T> mo66995b() {
        return this.f57715c;
    }

    /* renamed from: c */
    public String mo66996c() {
        return this.f57714a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ExpandableGroup{title='" + this.f57714a + '\'' + ", items=" + this.f57715c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57714a);
        if (this.f57715c == null) {
            parcel.writeByte((byte) 0);
            parcel.writeInt(0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(this.f57715c.size());
        parcel.writeSerializable(((Parcelable) this.f57715c.get(0)).getClass());
        parcel.writeList(this.f57715c);
    }

    protected ExpandableGroup(Parcel parcel) {
        this.f57714a = parcel.readString();
        byte readByte = parcel.readByte();
        int readInt = parcel.readInt();
        if (readByte == 1) {
            this.f57715c = new ArrayList(readInt);
            parcel.readList(this.f57715c, ((Class) parcel.readSerializable()).getClassLoader());
            return;
        }
        this.f57715c = null;
    }
}
