package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bE\b\b\u0018\u00002\u00020\u0001B½\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\u0012\b\u0002\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0007\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0007HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0004J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÄ\u0002\u0010<\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0002\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00072\u0012\b\u0002\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010 2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b<\u0010=J\t\u0010>\u001a\u00020\u0005HÖ\u0001J\t\u0010?\u001a\u00020\u0002HÖ\u0001J\u0013\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010D\u001a\u00020\u0002HÖ\u0001J\u0019\u0010I\u001a\u00020H2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0002HÖ\u0001R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010J\u001a\u0004\bK\u0010\u0004\"\u0004\bL\u0010MR$\u0010&\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR,\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010N\u001a\u0004\bX\u0010P\"\u0004\bY\u0010RR$\u0010)\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010N\u001a\u0004\bZ\u0010P\"\u0004\b[\u0010RR$\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010\\\u001a\u0004\b]\u0010\r\"\u0004\b^\u0010_R,\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010S\u001a\u0004\b`\u0010U\"\u0004\ba\u0010WR,\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010S\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR$\u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010N\u001a\u0004\bd\u0010P\"\u0004\be\u0010RR$\u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010N\u001a\u0004\bf\u0010P\"\u0004\bg\u0010RR$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010J\u001a\u0004\bh\u0010\u0004\"\u0004\bi\u0010MR,\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010S\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR$\u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010N\u001a\u0004\bl\u0010P\"\u0004\bm\u0010RR$\u00102\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u0010N\u001a\u0004\bn\u0010P\"\u0004\bo\u0010RR$\u00103\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u00104\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR$\u00105\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010N\u001a\u0004\bz\u0010P\"\u0004\b{\u0010RR$\u00106\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u0010N\u001a\u0004\b|\u0010P\"\u0004\b}\u0010RR$\u00107\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010N\u001a\u0004\b~\u0010P\"\u0004\b\u0010RR)\u00108\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b8\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u00109\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b9\u0010N\u001a\u0005\b\u0001\u0010P\"\u0005\b\u0001\u0010RR&\u0010:\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b:\u0010N\u001a\u0005\b\u0001\u0010P\"\u0005\b\u0001\u0010RR&\u0010;\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b;\u0010N\u001a\u0005\b\u0001\u0010P\"\u0005\b\u0001\u0010R¨\u0006\u0001"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Integer;", "", "component2", "", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Double;", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/AddressComponentsItem;", "component7", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PhotosItem;", "component8", "component9", "component10", "component11", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/ReviewsItem;", "component12", "component13", "component14", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/OpeningHours;", "component15", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Geometry;", "component16", "component17", "component18", "component19", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlusCode;", "component20", "component21", "component22", "component23", "utcOffset", "formattedAddress", "types", "website", "icon", "rating", "addressComponents", "photos", "url", "reference", "userRatingsTotal", "reviews", "scope", "name", "openingHours", "geometry", "vicinity", "id", "adrAddress", "plusCode", "formattedPhoneNumber", "internationalPhoneNumber", "placeId", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/OpeningHours;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Geometry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlusCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/Integer;", "getUtcOffset", "setUtcOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getFormattedAddress", "()Ljava/lang/String;", "setFormattedAddress", "(Ljava/lang/String;)V", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "getWebsite", "setWebsite", "getIcon", "setIcon", "Ljava/lang/Double;", "getRating", "setRating", "(Ljava/lang/Double;)V", "getAddressComponents", "setAddressComponents", "getPhotos", "setPhotos", "getUrl", "setUrl", "getReference", "setReference", "getUserRatingsTotal", "setUserRatingsTotal", "getReviews", "setReviews", "getScope", "setScope", "getName", "setName", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/OpeningHours;", "getOpeningHours", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/OpeningHours;", "setOpeningHours", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/OpeningHours;)V", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Geometry;", "getGeometry", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Geometry;", "setGeometry", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Geometry;)V", "getVicinity", "setVicinity", "getId", "setId", "getAdrAddress", "setAdrAddress", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlusCode;", "getPlusCode", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlusCode;", "setPlusCode", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlusCode;)V", "getFormattedPhoneNumber", "setFormattedPhoneNumber", "getInternationalPhoneNumber", "setInternationalPhoneNumber", "getPlaceId", "setPlaceId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/OpeningHours;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/Geometry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlusCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PlaceDetails.kt */
public final class PlaceDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("address_components")
    private List<AddressComponentsItem> addressComponents;
    @SerializedName("adr_address")
    private String adrAddress;
    @SerializedName("formatted_address")
    private String formattedAddress;
    @SerializedName("formatted_phone_number")
    private String formattedPhoneNumber;
    @SerializedName("geometry")
    private Geometry geometry;
    @SerializedName("icon")
    private String icon;
    @SerializedName("id")

    /* renamed from: id */
    private String f57551id;
    @SerializedName("international_phone_number")
    private String internationalPhoneNumber;
    @SerializedName("name")
    private String name;
    @SerializedName("opening_hours")
    private OpeningHours openingHours;
    @SerializedName("photos")
    private List<PhotosItem> photos;
    @SerializedName("place_id")
    private String placeId;
    @SerializedName("plus_code")
    private PlusCode plusCode;
    @SerializedName("rating")
    private Double rating;
    @SerializedName("reference")
    private String reference;
    @SerializedName("reviews")
    private List<ReviewsItem> reviews;
    @SerializedName("scope")
    private String scope;
    @SerializedName("types")
    private List<String> types;
    @SerializedName("url")
    private String url;
    @SerializedName("user_ratings_total")
    private Integer userRatingsTotal;
    @SerializedName("utc_offset")
    private Integer utcOffset;
    @SerializedName("vicinity")
    private String vicinity;
    @SerializedName("website")
    private String website;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Parcel parcel2 = parcel;
            C13706o.m87930g(parcel2, "in");
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Double valueOf2 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readInt() != 0 ? (AddressComponentsItem) AddressComponentsItem.CREATOR.createFromParcel(parcel2) : null);
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(parcel.readInt() != 0 ? (PhotosItem) PhotosItem.CREATOR.createFromParcel(parcel2) : null);
                    readInt2--;
                }
            } else {
                arrayList2 = null;
            }
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (readInt3 != 0) {
                    arrayList3.add(parcel.readInt() != 0 ? (ReviewsItem) ReviewsItem.CREATOR.createFromParcel(parcel2) : null);
                    readInt3--;
                }
            } else {
                arrayList3 = null;
            }
            return new PlaceDetails(valueOf, readString, createStringArrayList, readString2, readString3, valueOf2, arrayList, arrayList2, readString4, readString5, valueOf3, arrayList3, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (OpeningHours) OpeningHours.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (Geometry) Geometry.CREATOR.createFromParcel(parcel2) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (PlusCode) PlusCode.CREATOR.createFromParcel(parcel2) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new PlaceDetails[i];
        }
    }

    public PlaceDetails() {
        this((Integer) null, (String) null, (List) null, (String) null, (String) null, (Double) null, (List) null, (List) null, (String) null, (String) null, (Integer) null, (List) null, (String) null, (String) null, (OpeningHours) null, (Geometry) null, (String) null, (String) null, (String) null, (PlusCode) null, (String) null, (String) null, (String) null, 8388607, (C13695i) null);
    }

    public PlaceDetails(Integer num, String str, List<String> list, String str2, String str3, Double d, List<AddressComponentsItem> list2, List<PhotosItem> list3, String str4, String str5, Integer num2, List<ReviewsItem> list4, String str6, String str7, OpeningHours openingHours2, Geometry geometry2, String str8, String str9, String str10, PlusCode plusCode2, String str11, String str12, String str13) {
        this.utcOffset = num;
        this.formattedAddress = str;
        this.types = list;
        this.website = str2;
        this.icon = str3;
        this.rating = d;
        this.addressComponents = list2;
        this.photos = list3;
        this.url = str4;
        this.reference = str5;
        this.userRatingsTotal = num2;
        this.reviews = list4;
        this.scope = str6;
        this.name = str7;
        this.openingHours = openingHours2;
        this.geometry = geometry2;
        this.vicinity = str8;
        this.f57551id = str9;
        this.adrAddress = str10;
        this.plusCode = plusCode2;
        this.formattedPhoneNumber = str11;
        this.internationalPhoneNumber = str12;
        this.placeId = str13;
    }

    public static /* synthetic */ PlaceDetails copy$default(PlaceDetails placeDetails, Integer num, String str, List list, String str2, String str3, Double d, List list2, List list3, String str4, String str5, Integer num2, List list4, String str6, String str7, OpeningHours openingHours2, Geometry geometry2, String str8, String str9, String str10, PlusCode plusCode2, String str11, String str12, String str13, int i, Object obj) {
        PlaceDetails placeDetails2 = placeDetails;
        int i2 = i;
        return placeDetails.copy((i2 & 1) != 0 ? placeDetails2.utcOffset : num, (i2 & 2) != 0 ? placeDetails2.formattedAddress : str, (i2 & 4) != 0 ? placeDetails2.types : list, (i2 & 8) != 0 ? placeDetails2.website : str2, (i2 & 16) != 0 ? placeDetails2.icon : str3, (i2 & 32) != 0 ? placeDetails2.rating : d, (i2 & 64) != 0 ? placeDetails2.addressComponents : list2, (i2 & 128) != 0 ? placeDetails2.photos : list3, (i2 & 256) != 0 ? placeDetails2.url : str4, (i2 & 512) != 0 ? placeDetails2.reference : str5, (i2 & 1024) != 0 ? placeDetails2.userRatingsTotal : num2, (i2 & 2048) != 0 ? placeDetails2.reviews : list4, (i2 & 4096) != 0 ? placeDetails2.scope : str6, (i2 & 8192) != 0 ? placeDetails2.name : str7, (i2 & 16384) != 0 ? placeDetails2.openingHours : openingHours2, (i2 & 32768) != 0 ? placeDetails2.geometry : geometry2, (i2 & 65536) != 0 ? placeDetails2.vicinity : str8, (i2 & 131072) != 0 ? placeDetails2.f57551id : str9, (i2 & 262144) != 0 ? placeDetails2.adrAddress : str10, (i2 & 524288) != 0 ? placeDetails2.plusCode : plusCode2, (i2 & 1048576) != 0 ? placeDetails2.formattedPhoneNumber : str11, (i2 & 2097152) != 0 ? placeDetails2.internationalPhoneNumber : str12, (i2 & 4194304) != 0 ? placeDetails2.placeId : str13);
    }

    public final Integer component1() {
        return this.utcOffset;
    }

    public final String component10() {
        return this.reference;
    }

    public final Integer component11() {
        return this.userRatingsTotal;
    }

    public final List<ReviewsItem> component12() {
        return this.reviews;
    }

    public final String component13() {
        return this.scope;
    }

    public final String component14() {
        return this.name;
    }

    public final OpeningHours component15() {
        return this.openingHours;
    }

    public final Geometry component16() {
        return this.geometry;
    }

    public final String component17() {
        return this.vicinity;
    }

    public final String component18() {
        return this.f57551id;
    }

    public final String component19() {
        return this.adrAddress;
    }

    public final String component2() {
        return this.formattedAddress;
    }

    public final PlusCode component20() {
        return this.plusCode;
    }

    public final String component21() {
        return this.formattedPhoneNumber;
    }

    public final String component22() {
        return this.internationalPhoneNumber;
    }

    public final String component23() {
        return this.placeId;
    }

    public final List<String> component3() {
        return this.types;
    }

    public final String component4() {
        return this.website;
    }

    public final String component5() {
        return this.icon;
    }

    public final Double component6() {
        return this.rating;
    }

    public final List<AddressComponentsItem> component7() {
        return this.addressComponents;
    }

    public final List<PhotosItem> component8() {
        return this.photos;
    }

    public final String component9() {
        return this.url;
    }

    public final PlaceDetails copy(Integer num, String str, List<String> list, String str2, String str3, Double d, List<AddressComponentsItem> list2, List<PhotosItem> list3, String str4, String str5, Integer num2, List<ReviewsItem> list4, String str6, String str7, OpeningHours openingHours2, Geometry geometry2, String str8, String str9, String str10, PlusCode plusCode2, String str11, String str12, String str13) {
        return new PlaceDetails(num, str, list, str2, str3, d, list2, list3, str4, str5, num2, list4, str6, str7, openingHours2, geometry2, str8, str9, str10, plusCode2, str11, str12, str13);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceDetails)) {
            return false;
        }
        PlaceDetails placeDetails = (PlaceDetails) obj;
        return C13706o.m87924a(this.utcOffset, placeDetails.utcOffset) && C13706o.m87924a(this.formattedAddress, placeDetails.formattedAddress) && C13706o.m87924a(this.types, placeDetails.types) && C13706o.m87924a(this.website, placeDetails.website) && C13706o.m87924a(this.icon, placeDetails.icon) && C13706o.m87924a(this.rating, placeDetails.rating) && C13706o.m87924a(this.addressComponents, placeDetails.addressComponents) && C13706o.m87924a(this.photos, placeDetails.photos) && C13706o.m87924a(this.url, placeDetails.url) && C13706o.m87924a(this.reference, placeDetails.reference) && C13706o.m87924a(this.userRatingsTotal, placeDetails.userRatingsTotal) && C13706o.m87924a(this.reviews, placeDetails.reviews) && C13706o.m87924a(this.scope, placeDetails.scope) && C13706o.m87924a(this.name, placeDetails.name) && C13706o.m87924a(this.openingHours, placeDetails.openingHours) && C13706o.m87924a(this.geometry, placeDetails.geometry) && C13706o.m87924a(this.vicinity, placeDetails.vicinity) && C13706o.m87924a(this.f57551id, placeDetails.f57551id) && C13706o.m87924a(this.adrAddress, placeDetails.adrAddress) && C13706o.m87924a(this.plusCode, placeDetails.plusCode) && C13706o.m87924a(this.formattedPhoneNumber, placeDetails.formattedPhoneNumber) && C13706o.m87924a(this.internationalPhoneNumber, placeDetails.internationalPhoneNumber) && C13706o.m87924a(this.placeId, placeDetails.placeId);
    }

    public final List<AddressComponentsItem> getAddressComponents() {
        return this.addressComponents;
    }

    public final String getAdrAddress() {
        return this.adrAddress;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getFormattedPhoneNumber() {
        return this.formattedPhoneNumber;
    }

    public final Geometry getGeometry() {
        return this.geometry;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f57551id;
    }

    public final String getInternationalPhoneNumber() {
        return this.internationalPhoneNumber;
    }

    public final String getName() {
        return this.name;
    }

    public final OpeningHours getOpeningHours() {
        return this.openingHours;
    }

    public final List<PhotosItem> getPhotos() {
        return this.photos;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final PlusCode getPlusCode() {
        return this.plusCode;
    }

    public final Double getRating() {
        return this.rating;
    }

    public final String getReference() {
        return this.reference;
    }

    public final List<ReviewsItem> getReviews() {
        return this.reviews;
    }

    public final String getScope() {
        return this.scope;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getUserRatingsTotal() {
        return this.userRatingsTotal;
    }

    public final Integer getUtcOffset() {
        return this.utcOffset;
    }

    public final String getVicinity() {
        return this.vicinity;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        Integer num = this.utcOffset;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.formattedAddress;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.types;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.website;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.icon;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Double d = this.rating;
        int hashCode6 = (hashCode5 + (d != null ? d.hashCode() : 0)) * 31;
        List<AddressComponentsItem> list2 = this.addressComponents;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<PhotosItem> list3 = this.photos;
        int hashCode8 = (hashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str4 = this.url;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.reference;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num2 = this.userRatingsTotal;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        List<ReviewsItem> list4 = this.reviews;
        int hashCode12 = (hashCode11 + (list4 != null ? list4.hashCode() : 0)) * 31;
        String str6 = this.scope;
        int hashCode13 = (hashCode12 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.name;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        OpeningHours openingHours2 = this.openingHours;
        int hashCode15 = (hashCode14 + (openingHours2 != null ? openingHours2.hashCode() : 0)) * 31;
        Geometry geometry2 = this.geometry;
        int hashCode16 = (hashCode15 + (geometry2 != null ? geometry2.hashCode() : 0)) * 31;
        String str8 = this.vicinity;
        int hashCode17 = (hashCode16 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f57551id;
        int hashCode18 = (hashCode17 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.adrAddress;
        int hashCode19 = (hashCode18 + (str10 != null ? str10.hashCode() : 0)) * 31;
        PlusCode plusCode2 = this.plusCode;
        int hashCode20 = (hashCode19 + (plusCode2 != null ? plusCode2.hashCode() : 0)) * 31;
        String str11 = this.formattedPhoneNumber;
        int hashCode21 = (hashCode20 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.internationalPhoneNumber;
        int hashCode22 = (hashCode21 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.placeId;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return hashCode22 + i;
    }

    public final void setAddressComponents(List<AddressComponentsItem> list) {
        this.addressComponents = list;
    }

    public final void setAdrAddress(String str) {
        this.adrAddress = str;
    }

    public final void setFormattedAddress(String str) {
        this.formattedAddress = str;
    }

    public final void setFormattedPhoneNumber(String str) {
        this.formattedPhoneNumber = str;
    }

    public final void setGeometry(Geometry geometry2) {
        this.geometry = geometry2;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setId(String str) {
        this.f57551id = str;
    }

    public final void setInternationalPhoneNumber(String str) {
        this.internationalPhoneNumber = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOpeningHours(OpeningHours openingHours2) {
        this.openingHours = openingHours2;
    }

    public final void setPhotos(List<PhotosItem> list) {
        this.photos = list;
    }

    public final void setPlaceId(String str) {
        this.placeId = str;
    }

    public final void setPlusCode(PlusCode plusCode2) {
        this.plusCode = plusCode2;
    }

    public final void setRating(Double d) {
        this.rating = d;
    }

    public final void setReference(String str) {
        this.reference = str;
    }

    public final void setReviews(List<ReviewsItem> list) {
        this.reviews = list;
    }

    public final void setScope(String str) {
        this.scope = str;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUserRatingsTotal(Integer num) {
        this.userRatingsTotal = num;
    }

    public final void setUtcOffset(Integer num) {
        this.utcOffset = num;
    }

    public final void setVicinity(String str) {
        this.vicinity = str;
    }

    public final void setWebsite(String str) {
        this.website = str;
    }

    public String toString() {
        return "PlaceDetails(utcOffset=" + this.utcOffset + ", formattedAddress=" + this.formattedAddress + ", types=" + this.types + ", website=" + this.website + ", icon=" + this.icon + ", rating=" + this.rating + ", addressComponents=" + this.addressComponents + ", photos=" + this.photos + ", url=" + this.url + ", reference=" + this.reference + ", userRatingsTotal=" + this.userRatingsTotal + ", reviews=" + this.reviews + ", scope=" + this.scope + ", name=" + this.name + ", openingHours=" + this.openingHours + ", geometry=" + this.geometry + ", vicinity=" + this.vicinity + ", id=" + this.f57551id + ", adrAddress=" + this.adrAddress + ", plusCode=" + this.plusCode + ", formattedPhoneNumber=" + this.formattedPhoneNumber + ", internationalPhoneNumber=" + this.internationalPhoneNumber + ", placeId=" + this.placeId + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        Integer num = this.utcOffset;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.formattedAddress);
        parcel.writeStringList(this.types);
        parcel.writeString(this.website);
        parcel.writeString(this.icon);
        Double d = this.rating;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        List<AddressComponentsItem> list = this.addressComponents;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (AddressComponentsItem next : list) {
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
        List<PhotosItem> list2 = this.photos;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (PhotosItem next2 : list2) {
                if (next2 != null) {
                    parcel.writeInt(1);
                    next2.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.reference);
        Integer num2 = this.userRatingsTotal;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<ReviewsItem> list3 = this.reviews;
        if (list3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (ReviewsItem next3 : list3) {
                if (next3 != null) {
                    parcel.writeInt(1);
                    next3.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.scope);
        parcel.writeString(this.name);
        OpeningHours openingHours2 = this.openingHours;
        if (openingHours2 != null) {
            parcel.writeInt(1);
            openingHours2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Geometry geometry2 = this.geometry;
        if (geometry2 != null) {
            parcel.writeInt(1);
            geometry2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.vicinity);
        parcel.writeString(this.f57551id);
        parcel.writeString(this.adrAddress);
        PlusCode plusCode2 = this.plusCode;
        if (plusCode2 != null) {
            parcel.writeInt(1);
            plusCode2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.formattedPhoneNumber);
        parcel.writeString(this.internationalPhoneNumber);
        parcel.writeString(this.placeId);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PlaceDetails(java.lang.Integer r25, java.lang.String r26, java.util.List r27, java.lang.String r28, java.lang.String r29, java.lang.Double r30, java.util.List r31, java.util.List r32, java.lang.String r33, java.lang.String r34, java.lang.Integer r35, java.util.List r36, java.lang.String r37, java.lang.String r38, com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.OpeningHours r39, com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Geometry r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlusCode r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, int r48, kotlin.jvm.internal.C13695i r49) {
        /*
            r24 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r25
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r26
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r27
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r28
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r29
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r30
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r31
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r32
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r33
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r34
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r35
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r36
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r37
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r38
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r39
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r40
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r41
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r42
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r43
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r44
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r45
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r46
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00d0
            r0 = 0
            goto L_0x00d2
        L_0x00d0:
            r0 = r47
        L_0x00d2:
            r25 = r24
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r2
            r41 = r16
            r42 = r17
            r43 = r18
            r44 = r19
            r45 = r20
            r46 = r21
            r47 = r22
            r48 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails.<init>(java.lang.Integer, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.Double, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.OpeningHours, com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.Geometry, java.lang.String, java.lang.String, java.lang.String, com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlusCode, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
