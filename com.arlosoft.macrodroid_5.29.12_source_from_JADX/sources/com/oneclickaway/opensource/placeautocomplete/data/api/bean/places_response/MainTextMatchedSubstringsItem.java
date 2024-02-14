package com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/MainTextMatchedSubstringsItem;", "", "offset", "", "length", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffset", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/MainTextMatchedSubstringsItem;", "equals", "", "other", "hashCode", "toString", "", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: MainTextMatchedSubstringsItem.kt */
public final class MainTextMatchedSubstringsItem {
    @SerializedName("length")
    private final Integer length;
    @SerializedName("offset")
    private final Integer offset;

    public MainTextMatchedSubstringsItem() {
        this((Integer) null, (Integer) null, 3, (C13695i) null);
    }

    public MainTextMatchedSubstringsItem(Integer num, Integer num2) {
        this.offset = num;
        this.length = num2;
    }

    public static /* synthetic */ MainTextMatchedSubstringsItem copy$default(MainTextMatchedSubstringsItem mainTextMatchedSubstringsItem, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = mainTextMatchedSubstringsItem.offset;
        }
        if ((i & 2) != 0) {
            num2 = mainTextMatchedSubstringsItem.length;
        }
        return mainTextMatchedSubstringsItem.copy(num, num2);
    }

    public final Integer component1() {
        return this.offset;
    }

    public final Integer component2() {
        return this.length;
    }

    public final MainTextMatchedSubstringsItem copy(Integer num, Integer num2) {
        return new MainTextMatchedSubstringsItem(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainTextMatchedSubstringsItem)) {
            return false;
        }
        MainTextMatchedSubstringsItem mainTextMatchedSubstringsItem = (MainTextMatchedSubstringsItem) obj;
        return C13706o.m87924a(this.offset, mainTextMatchedSubstringsItem.offset) && C13706o.m87924a(this.length, mainTextMatchedSubstringsItem.length);
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public int hashCode() {
        Integer num = this.offset;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.length;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "MainTextMatchedSubstringsItem(offset=" + this.offset + ", length=" + this.length + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainTextMatchedSubstringsItem(Integer num, Integer num2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
