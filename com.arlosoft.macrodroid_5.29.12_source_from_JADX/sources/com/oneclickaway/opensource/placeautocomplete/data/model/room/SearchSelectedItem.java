package com.oneclickaway.opensource.placeautocomplete.data.model.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "", "placeId", "", "mainText", "secondaryText", "searchCurrentMilliseconds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getMainText", "()Ljava/lang/String;", "setMainText", "(Ljava/lang/String;)V", "getPlaceId", "setPlaceId", "getSearchCurrentMilliseconds", "()J", "setSearchCurrentMilliseconds", "(J)V", "getSecondaryText", "setSecondaryText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
@Entity(tableName = "SearchSelectedItem")
/* compiled from: SearchSelectedItem.kt */
public final class SearchSelectedItem {
    private String mainText;
    @PrimaryKey
    private String placeId;
    private long searchCurrentMilliseconds;
    private String secondaryText;

    public SearchSelectedItem(String str, String str2, String str3, long j) {
        C13706o.m87930g(str, "placeId");
        C13706o.m87930g(str2, "mainText");
        C13706o.m87930g(str3, "secondaryText");
        this.placeId = str;
        this.mainText = str2;
        this.secondaryText = str3;
        this.searchCurrentMilliseconds = j;
    }

    public static /* synthetic */ SearchSelectedItem copy$default(SearchSelectedItem searchSelectedItem, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchSelectedItem.placeId;
        }
        if ((i & 2) != 0) {
            str2 = searchSelectedItem.mainText;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = searchSelectedItem.secondaryText;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = searchSelectedItem.searchCurrentMilliseconds;
        }
        return searchSelectedItem.copy(str, str4, str5, j);
    }

    public final String component1() {
        return this.placeId;
    }

    public final String component2() {
        return this.mainText;
    }

    public final String component3() {
        return this.secondaryText;
    }

    public final long component4() {
        return this.searchCurrentMilliseconds;
    }

    public final SearchSelectedItem copy(String str, String str2, String str3, long j) {
        C13706o.m87930g(str, "placeId");
        C13706o.m87930g(str2, "mainText");
        C13706o.m87930g(str3, "secondaryText");
        return new SearchSelectedItem(str, str2, str3, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchSelectedItem) {
                SearchSelectedItem searchSelectedItem = (SearchSelectedItem) obj;
                if (C13706o.m87924a(this.placeId, searchSelectedItem.placeId) && C13706o.m87924a(this.mainText, searchSelectedItem.mainText) && C13706o.m87924a(this.secondaryText, searchSelectedItem.secondaryText)) {
                    if (this.searchCurrentMilliseconds == searchSelectedItem.searchCurrentMilliseconds) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getMainText() {
        return this.mainText;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final long getSearchCurrentMilliseconds() {
        return this.searchCurrentMilliseconds;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        String str = this.placeId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mainText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.secondaryText;
        if (str3 != null) {
            i = str3.hashCode();
        }
        long j = this.searchCurrentMilliseconds;
        return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final void setMainText(String str) {
        C13706o.m87930g(str, "<set-?>");
        this.mainText = str;
    }

    public final void setPlaceId(String str) {
        C13706o.m87930g(str, "<set-?>");
        this.placeId = str;
    }

    public final void setSearchCurrentMilliseconds(long j) {
        this.searchCurrentMilliseconds = j;
    }

    public final void setSecondaryText(String str) {
        C13706o.m87930g(str, "<set-?>");
        this.secondaryText = str;
    }

    public String toString() {
        return "SearchSelectedItem(placeId=" + this.placeId + ", mainText=" + this.mainText + ", secondaryText=" + this.secondaryText + ", searchCurrentMilliseconds=" + this.searchCurrentMilliseconds + ")";
    }
}
