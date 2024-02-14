package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b,\u0010-J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\u0006JH\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004HÖ\u0001R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010$R,\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010$¨\u0006."}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PhotosItem;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "", "component3", "component4", "photoReference", "width", "htmlAttributions", "height", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PhotosItem;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/String;", "getPhotoReference", "()Ljava/lang/String;", "setPhotoReference", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getWidth", "setWidth", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "getHtmlAttributions", "()Ljava/util/List;", "setHtmlAttributions", "(Ljava/util/List;)V", "getHeight", "setHeight", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PhotosItem.kt */
public final class PhotosItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("height")
    private Integer height;
    @SerializedName("html_attributions")
    private List<String> htmlAttributions;
    @SerializedName("photo_reference")
    private String photoReference;
    @SerializedName("width")
    private Integer width;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C13706o.m87930g(parcel, "in");
            String readString = parcel.readString();
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new PhotosItem(readString, valueOf, createStringArrayList, num);
        }

        public final Object[] newArray(int i) {
            return new PhotosItem[i];
        }
    }

    public PhotosItem() {
        this((String) null, (Integer) null, (List) null, (Integer) null, 15, (C13695i) null);
    }

    public PhotosItem(String str, Integer num, List<String> list, Integer num2) {
        this.photoReference = str;
        this.width = num;
        this.htmlAttributions = list;
        this.height = num2;
    }

    public static /* synthetic */ PhotosItem copy$default(PhotosItem photosItem, String str, Integer num, List<String> list, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photosItem.photoReference;
        }
        if ((i & 2) != 0) {
            num = photosItem.width;
        }
        if ((i & 4) != 0) {
            list = photosItem.htmlAttributions;
        }
        if ((i & 8) != 0) {
            num2 = photosItem.height;
        }
        return photosItem.copy(str, num, list, num2);
    }

    public final String component1() {
        return this.photoReference;
    }

    public final Integer component2() {
        return this.width;
    }

    public final List<String> component3() {
        return this.htmlAttributions;
    }

    public final Integer component4() {
        return this.height;
    }

    public final PhotosItem copy(String str, Integer num, List<String> list, Integer num2) {
        return new PhotosItem(str, num, list, num2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosItem)) {
            return false;
        }
        PhotosItem photosItem = (PhotosItem) obj;
        return C13706o.m87924a(this.photoReference, photosItem.photoReference) && C13706o.m87924a(this.width, photosItem.width) && C13706o.m87924a(this.htmlAttributions, photosItem.htmlAttributions) && C13706o.m87924a(this.height, photosItem.height);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final List<String> getHtmlAttributions() {
        return this.htmlAttributions;
    }

    public final String getPhotoReference() {
        return this.photoReference;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.photoReference;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        List<String> list = this.htmlAttributions;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setHtmlAttributions(List<String> list) {
        this.htmlAttributions = list;
    }

    public final void setPhotoReference(String str) {
        this.photoReference = str;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    public String toString() {
        return "PhotosItem(photoReference=" + this.photoReference + ", width=" + this.width + ", htmlAttributions=" + this.htmlAttributions + ", height=" + this.height + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        parcel.writeString(this.photoReference);
        Integer num = this.width;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.htmlAttributions);
        Integer num2 = this.height;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhotosItem(String str, Integer num, List list, Integer num2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num2);
    }
}
