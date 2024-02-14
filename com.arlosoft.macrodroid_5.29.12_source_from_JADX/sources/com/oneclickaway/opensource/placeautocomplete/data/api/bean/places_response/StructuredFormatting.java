package com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/StructuredFormatting;", "", "mainTextMatchedSubstrings", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/MainTextMatchedSubstringsItem;", "secondaryText", "", "mainText", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getMainText", "()Ljava/lang/String;", "getMainTextMatchedSubstrings", "()Ljava/util/List;", "getSecondaryText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: StructuredFormatting.kt */
public final class StructuredFormatting {
    @SerializedName("main_text")
    private final String mainText;
    @SerializedName("main_text_matched_substrings")
    private final List<MainTextMatchedSubstringsItem> mainTextMatchedSubstrings;
    @SerializedName("secondary_text")
    private final String secondaryText;

    public StructuredFormatting() {
        this((List) null, (String) null, (String) null, 7, (C13695i) null);
    }

    public StructuredFormatting(List<MainTextMatchedSubstringsItem> list, String str, String str2) {
        this.mainTextMatchedSubstrings = list;
        this.secondaryText = str;
        this.mainText = str2;
    }

    public static /* synthetic */ StructuredFormatting copy$default(StructuredFormatting structuredFormatting, List<MainTextMatchedSubstringsItem> list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = structuredFormatting.mainTextMatchedSubstrings;
        }
        if ((i & 2) != 0) {
            str = structuredFormatting.secondaryText;
        }
        if ((i & 4) != 0) {
            str2 = structuredFormatting.mainText;
        }
        return structuredFormatting.copy(list, str, str2);
    }

    public final List<MainTextMatchedSubstringsItem> component1() {
        return this.mainTextMatchedSubstrings;
    }

    public final String component2() {
        return this.secondaryText;
    }

    public final String component3() {
        return this.mainText;
    }

    public final StructuredFormatting copy(List<MainTextMatchedSubstringsItem> list, String str, String str2) {
        return new StructuredFormatting(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StructuredFormatting)) {
            return false;
        }
        StructuredFormatting structuredFormatting = (StructuredFormatting) obj;
        return C13706o.m87924a(this.mainTextMatchedSubstrings, structuredFormatting.mainTextMatchedSubstrings) && C13706o.m87924a(this.secondaryText, structuredFormatting.secondaryText) && C13706o.m87924a(this.mainText, structuredFormatting.mainText);
    }

    public final String getMainText() {
        return this.mainText;
    }

    public final List<MainTextMatchedSubstringsItem> getMainTextMatchedSubstrings() {
        return this.mainTextMatchedSubstrings;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        List<MainTextMatchedSubstringsItem> list = this.mainTextMatchedSubstrings;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.secondaryText;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.mainText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "StructuredFormatting(mainTextMatchedSubstrings=" + this.mainTextMatchedSubstrings + ", secondaryText=" + this.secondaryText + ", mainText=" + this.mainText + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StructuredFormatting(List list, String str, String str2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
