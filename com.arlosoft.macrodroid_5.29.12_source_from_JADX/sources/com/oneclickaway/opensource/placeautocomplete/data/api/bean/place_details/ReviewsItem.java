package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u00109J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003Jp\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0006HÖ\u0001R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010/R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R$\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010/R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'¨\u0006:"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/ReviewsItem;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "authorName", "profilePhotoUrl", "authorUrl", "rating", "language", "text", "time", "relativeTimeDescription", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/ReviewsItem;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/String;", "getAuthorName", "()Ljava/lang/String;", "setAuthorName", "(Ljava/lang/String;)V", "getProfilePhotoUrl", "setProfilePhotoUrl", "getAuthorUrl", "setAuthorUrl", "Ljava/lang/Integer;", "getRating", "setRating", "(Ljava/lang/Integer;)V", "getLanguage", "setLanguage", "getText", "setText", "getTime", "setTime", "getRelativeTimeDescription", "setRelativeTimeDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@Entity(tableName = "ReviewsItem")
/* compiled from: ReviewsItem.kt */
public final class ReviewsItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("author_name")
    private String authorName;
    @SerializedName("author_url")
    private String authorUrl;
    @SerializedName("language")
    private String language;
    @SerializedName("profile_photo_url")
    private String profilePhotoUrl;
    @SerializedName("rating")
    private Integer rating;
    @SerializedName("relative_time_description")
    private String relativeTimeDescription;
    @SerializedName("text")
    private String text;
    @SerializedName("time")
    private Integer time;

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C13706o.m87930g(parcel, "in");
            return new ReviewsItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new ReviewsItem[i];
        }
    }

    public ReviewsItem() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, 255, (C13695i) null);
    }

    public ReviewsItem(String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6) {
        this.authorName = str;
        this.profilePhotoUrl = str2;
        this.authorUrl = str3;
        this.rating = num;
        this.language = str4;
        this.text = str5;
        this.time = num2;
        this.relativeTimeDescription = str6;
    }

    public static /* synthetic */ ReviewsItem copy$default(ReviewsItem reviewsItem, String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6, int i, Object obj) {
        ReviewsItem reviewsItem2 = reviewsItem;
        int i2 = i;
        return reviewsItem.copy((i2 & 1) != 0 ? reviewsItem2.authorName : str, (i2 & 2) != 0 ? reviewsItem2.profilePhotoUrl : str2, (i2 & 4) != 0 ? reviewsItem2.authorUrl : str3, (i2 & 8) != 0 ? reviewsItem2.rating : num, (i2 & 16) != 0 ? reviewsItem2.language : str4, (i2 & 32) != 0 ? reviewsItem2.text : str5, (i2 & 64) != 0 ? reviewsItem2.time : num2, (i2 & 128) != 0 ? reviewsItem2.relativeTimeDescription : str6);
    }

    public final String component1() {
        return this.authorName;
    }

    public final String component2() {
        return this.profilePhotoUrl;
    }

    public final String component3() {
        return this.authorUrl;
    }

    public final Integer component4() {
        return this.rating;
    }

    public final String component5() {
        return this.language;
    }

    public final String component6() {
        return this.text;
    }

    public final Integer component7() {
        return this.time;
    }

    public final String component8() {
        return this.relativeTimeDescription;
    }

    public final ReviewsItem copy(String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6) {
        return new ReviewsItem(str, str2, str3, num, str4, str5, num2, str6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewsItem)) {
            return false;
        }
        ReviewsItem reviewsItem = (ReviewsItem) obj;
        return C13706o.m87924a(this.authorName, reviewsItem.authorName) && C13706o.m87924a(this.profilePhotoUrl, reviewsItem.profilePhotoUrl) && C13706o.m87924a(this.authorUrl, reviewsItem.authorUrl) && C13706o.m87924a(this.rating, reviewsItem.rating) && C13706o.m87924a(this.language, reviewsItem.language) && C13706o.m87924a(this.text, reviewsItem.text) && C13706o.m87924a(this.time, reviewsItem.time) && C13706o.m87924a(this.relativeTimeDescription, reviewsItem.relativeTimeDescription);
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getAuthorUrl() {
        return this.authorUrl;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final String getRelativeTimeDescription() {
        return this.relativeTimeDescription;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.authorName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.profilePhotoUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.authorUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.rating;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.language;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.text;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num2 = this.time;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str6 = this.relativeTimeDescription;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setAuthorUrl(String str) {
        this.authorUrl = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setProfilePhotoUrl(String str) {
        this.profilePhotoUrl = str;
    }

    public final void setRating(Integer num) {
        this.rating = num;
    }

    public final void setRelativeTimeDescription(String str) {
        this.relativeTimeDescription = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "ReviewsItem(authorName=" + this.authorName + ", profilePhotoUrl=" + this.profilePhotoUrl + ", authorUrl=" + this.authorUrl + ", rating=" + this.rating + ", language=" + this.language + ", text=" + this.text + ", time=" + this.time + ", relativeTimeDescription=" + this.relativeTimeDescription + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87930g(parcel, "parcel");
        parcel.writeString(this.authorName);
        parcel.writeString(this.profilePhotoUrl);
        parcel.writeString(this.authorUrl);
        Integer num = this.rating;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.language);
        parcel.writeString(this.text);
        Integer num2 = this.time;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.relativeTimeDescription);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReviewsItem(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, java.lang.String r17, int r18, kotlin.jvm.internal.C13695i r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.ReviewsItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
