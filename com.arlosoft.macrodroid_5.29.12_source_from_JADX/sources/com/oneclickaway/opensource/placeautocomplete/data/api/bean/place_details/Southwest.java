package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004\"\u0004\b\u001a\u0010\u001bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001b¨\u0006 "}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Southwest;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Double;", "component2", "lng", "lat", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Southwest;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/Double;", "getLng", "setLng", "(Ljava/lang/Double;)V", "getLat", "setLat", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@Entity(tableName = "Southwest")
/* compiled from: Southwest.kt */
public final class Southwest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("lat")
    private Double lat;
    @SerializedName("lng")
    private Double lng;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C13706o.m87930g(parcel, "in");
            Double d = null;
            Double valueOf = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            if (parcel.readInt() != 0) {
                d = Double.valueOf(parcel.readDouble());
            }
            return new Southwest(valueOf, d);
        }

        public final Object[] newArray(int i) {
            return new Southwest[i];
        }
    }

    public Southwest() {
        this((Double) null, (Double) null, 3, (C13695i) null);
    }

    public Southwest(Double d, Double d2) {
        this.lng = d;
        this.lat = d2;
    }

    public static /* synthetic */ Southwest copy$default(Southwest southwest, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = southwest.lng;
        }
        if ((i & 2) != 0) {
            d2 = southwest.lat;
        }
        return southwest.copy(d, d2);
    }

    public final Double component1() {
        return this.lng;
    }

    public final Double component2() {
        return this.lat;
    }

    public final Southwest copy(Double d, Double d2) {
        return new Southwest(d, d2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Southwest)) {
            return false;
        }
        Southwest southwest = (Southwest) obj;
        return C13706o.m87924a(this.lng, southwest.lng) && C13706o.m87924a(this.lat, southwest.lat);
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLng() {
        return this.lng;
    }

    public int hashCode() {
        Double d = this.lng;
        int i = 0;
        int hashCode = (d != null ? d.hashCode() : 0) * 31;
        Double d2 = this.lat;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode + i;
    }

    public final void setLat(Double d) {
        this.lat = d;
    }

    public final void setLng(Double d) {
        this.lng = d;
    }

    public String toString() {
        return "Southwest(lng=" + this.lng + ", lat=" + this.lat + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        Double d = this.lng;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        Double d2 = this.lat;
        if (d2 != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Southwest(Double d, Double d2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }
}
