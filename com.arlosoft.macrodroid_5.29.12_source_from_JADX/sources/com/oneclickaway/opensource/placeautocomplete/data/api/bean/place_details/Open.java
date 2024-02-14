package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004HÖ\u0001R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Open;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "time", "day", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Open;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/String;", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getDay", "setDay", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: Open.kt */
public final class Open implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("day")
    private Integer day;
    @SerializedName("time")
    private String time;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C13706o.m87930g(parcel, "in");
            return new Open(parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        public final Object[] newArray(int i) {
            return new Open[i];
        }
    }

    public Open() {
        this((String) null, (Integer) null, 3, (C13695i) null);
    }

    public Open(String str, Integer num) {
        this.time = str;
        this.day = num;
    }

    public static /* synthetic */ Open copy$default(Open open, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = open.time;
        }
        if ((i & 2) != 0) {
            num = open.day;
        }
        return open.copy(str, num);
    }

    public final String component1() {
        return this.time;
    }

    public final Integer component2() {
        return this.day;
    }

    public final Open copy(String str, Integer num) {
        return new Open(str, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Open)) {
            return false;
        }
        Open open = (Open) obj;
        return C13706o.m87924a(this.time, open.time) && C13706o.m87924a(this.day, open.day);
    }

    public final Integer getDay() {
        return this.day;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.time;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.day;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final void setDay(Integer num) {
        this.day = num;
    }

    public final void setTime(String str) {
        this.time = str;
    }

    public String toString() {
        return "Open(time=" + this.time + ", day=" + this.day + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C13706o.m87930g(parcel, "parcel");
        parcel.writeString(this.time);
        Integer num = this.day;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Open(String str, Integer num, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
