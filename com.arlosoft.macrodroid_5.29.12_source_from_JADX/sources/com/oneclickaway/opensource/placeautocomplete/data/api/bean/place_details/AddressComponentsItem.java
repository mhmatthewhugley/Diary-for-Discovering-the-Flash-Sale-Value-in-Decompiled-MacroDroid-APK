package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R,\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/AddressComponentsItem;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "", "", "types", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "shortName", "Ljava/lang/String;", "getShortName", "()Ljava/lang/String;", "setShortName", "(Ljava/lang/String;)V", "longName", "getLongName", "setLongName", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: AddressComponentsItem.kt */
public final class AddressComponentsItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("long_name")
    @PrimaryKey
    private String longName;
    @SerializedName("short_name")
    private String shortName;
    @SerializedName("types")
    private List<String> types;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C13706o.m87930g(parcel, "in");
            return new AddressComponentsItem(parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new AddressComponentsItem[i];
        }
    }

    public AddressComponentsItem(List<String> list, String str, String str2) {
        C13706o.m87930g(str2, "longName");
        this.types = list;
        this.shortName = str;
        this.longName = str2;
    }

    public int describeContents() {
        return 0;
    }

    public final String getLongName() {
        return this.longName;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final void setLongName(String str) {
        C13706o.m87930g(str, "<set-?>");
        this.longName = str;
    }

    public final void setShortName(String str) {
        this.shortName = str;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        parcel.writeStringList(this.types);
        parcel.writeString(this.shortName);
        parcel.writeString(this.longName);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressComponentsItem(List list, String str, String str2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, str2);
    }
}
