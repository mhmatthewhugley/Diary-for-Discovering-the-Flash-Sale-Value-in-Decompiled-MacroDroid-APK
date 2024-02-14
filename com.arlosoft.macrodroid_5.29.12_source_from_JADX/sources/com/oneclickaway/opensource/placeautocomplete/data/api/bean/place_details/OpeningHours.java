package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005HÆ\u0003JD\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010HÖ\u0001R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001eR,\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R,\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#¨\u0006("}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/OpeningHours;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Boolean;", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PeriodsItem;", "component2", "", "component3", "openNow", "periods", "weekdayText", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/OpeningHours;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/Boolean;", "getOpenNow", "setOpenNow", "(Ljava/lang/Boolean;)V", "Ljava/util/List;", "getPeriods", "()Ljava/util/List;", "setPeriods", "(Ljava/util/List;)V", "getWeekdayText", "setWeekdayText", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: OpeningHours.kt */
public final class OpeningHours implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("open_now")
    private Boolean openNow;
    @SerializedName("periods")
    private List<PeriodsItem> periods;
    @SerializedName("weekday_text")
    private List<String> weekdayText;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            C13706o.m87930g(parcel, "in");
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList2.add(parcel.readInt() != 0 ? (PeriodsItem) PeriodsItem.CREATOR.createFromParcel(parcel) : null);
                    readInt--;
                }
                arrayList = arrayList2;
            }
            return new OpeningHours(bool, arrayList, parcel.createStringArrayList());
        }

        public final Object[] newArray(int i) {
            return new OpeningHours[i];
        }
    }

    public OpeningHours() {
        this((Boolean) null, (List) null, (List) null, 7, (C13695i) null);
    }

    public OpeningHours(Boolean bool, List<PeriodsItem> list, List<String> list2) {
        this.openNow = bool;
        this.periods = list;
        this.weekdayText = list2;
    }

    public static /* synthetic */ OpeningHours copy$default(OpeningHours openingHours, Boolean bool, List<PeriodsItem> list, List<String> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = openingHours.openNow;
        }
        if ((i & 2) != 0) {
            list = openingHours.periods;
        }
        if ((i & 4) != 0) {
            list2 = openingHours.weekdayText;
        }
        return openingHours.copy(bool, list, list2);
    }

    public final Boolean component1() {
        return this.openNow;
    }

    public final List<PeriodsItem> component2() {
        return this.periods;
    }

    public final List<String> component3() {
        return this.weekdayText;
    }

    public final OpeningHours copy(Boolean bool, List<PeriodsItem> list, List<String> list2) {
        return new OpeningHours(bool, list, list2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpeningHours)) {
            return false;
        }
        OpeningHours openingHours = (OpeningHours) obj;
        return C13706o.m87924a(this.openNow, openingHours.openNow) && C13706o.m87924a(this.periods, openingHours.periods) && C13706o.m87924a(this.weekdayText, openingHours.weekdayText);
    }

    public final Boolean getOpenNow() {
        return this.openNow;
    }

    public final List<PeriodsItem> getPeriods() {
        return this.periods;
    }

    public final List<String> getWeekdayText() {
        return this.weekdayText;
    }

    public int hashCode() {
        Boolean bool = this.openNow;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<PeriodsItem> list = this.periods;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.weekdayText;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setOpenNow(Boolean bool) {
        this.openNow = bool;
    }

    public final void setPeriods(List<PeriodsItem> list) {
        this.periods = list;
    }

    public final void setWeekdayText(List<String> list) {
        this.weekdayText = list;
    }

    public String toString() {
        return "OpeningHours(openNow=" + this.openNow + ", periods=" + this.periods + ", weekdayText=" + this.weekdayText + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        Boolean bool = this.openNow;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        List<PeriodsItem> list = this.periods;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (PeriodsItem next : list) {
                if (next != null) {
                    parcel.writeInt(1);
                    next.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.weekdayText);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpeningHours(Boolean bool, List list, List list2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
