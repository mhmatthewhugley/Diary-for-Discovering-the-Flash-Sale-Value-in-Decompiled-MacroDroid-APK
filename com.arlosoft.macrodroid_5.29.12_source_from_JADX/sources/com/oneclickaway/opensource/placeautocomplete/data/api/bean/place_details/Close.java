package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Close;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "time", "day", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/String;", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "I", "getDay", "()I", "setDay", "(I)V", "<init>", "(Ljava/lang/String;I)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: Close.kt */
public final class Close implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("day")
    private int day;
    @SerializedName("time")
    private String time;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C13706o.m87930g(parcel, "in");
            return new Close(parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new Close[i];
        }
    }

    public Close(String str, int i) {
        this.time = str;
        this.day = i;
    }

    public static /* synthetic */ Close copy$default(Close close, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = close.time;
        }
        if ((i2 & 2) != 0) {
            i = close.day;
        }
        return close.copy(str, i);
    }

    public final String component1() {
        return this.time;
    }

    public final int component2() {
        return this.day;
    }

    public final Close copy(String str, int i) {
        return new Close(str, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Close) {
                Close close = (Close) obj;
                if (C13706o.m87924a(this.time, close.time)) {
                    if (this.day == close.day) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getDay() {
        return this.day;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.time;
        return ((str != null ? str.hashCode() : 0) * 31) + this.day;
    }

    public final void setDay(int i) {
        this.day = i;
    }

    public final void setTime(String str) {
        this.time = str;
    }

    public String toString() {
        return "Close(time=" + this.time + ", day=" + this.day + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        parcel.writeString(this.time);
        parcel.writeInt(this.day);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Close(String str, int i, int i2, C13695i iVar) {
        this((i2 & 1) != 0 ? null : str, i);
    }
}
