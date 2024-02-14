package com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/TermsItem;", "", "offset", "", "value", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/TermsItem;", "equals", "", "other", "hashCode", "toString", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: TermsItem.kt */
public final class TermsItem {
    @SerializedName("offset")
    private final Integer offset;
    @SerializedName("value")
    private final String value;

    public TermsItem() {
        this((Integer) null, (String) null, 3, (C13695i) null);
    }

    public TermsItem(Integer num, String str) {
        this.offset = num;
        this.value = str;
    }

    public static /* synthetic */ TermsItem copy$default(TermsItem termsItem, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = termsItem.offset;
        }
        if ((i & 2) != 0) {
            str = termsItem.value;
        }
        return termsItem.copy(num, str);
    }

    public final Integer component1() {
        return this.offset;
    }

    public final String component2() {
        return this.value;
    }

    public final TermsItem copy(Integer num, String str) {
        return new TermsItem(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsItem)) {
            return false;
        }
        TermsItem termsItem = (TermsItem) obj;
        return C13706o.m87924a(this.offset, termsItem.offset) && C13706o.m87924a(this.value, termsItem.value);
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.offset;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.value;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TermsItem(offset=" + this.offset + ", value=" + this.value + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TermsItem(Integer num, String str, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
