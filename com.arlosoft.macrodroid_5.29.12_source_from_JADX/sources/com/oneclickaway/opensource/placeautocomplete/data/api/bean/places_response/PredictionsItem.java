package com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00052\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006*"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "", "reference", "", "types", "", "matchedSubstrings", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/MatchedSubstringsItem;", "terms", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/TermsItem;", "structuredFormatting", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/StructuredFormatting;", "description", "id", "placeId", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/StructuredFormatting;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "getMatchedSubstrings", "()Ljava/util/List;", "getPlaceId", "getReference", "getStructuredFormatting", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/StructuredFormatting;", "getTerms", "getTypes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: PredictionsItem.kt */
public final class PredictionsItem {
    @SerializedName("description")
    private final String description;
    @SerializedName("id")

    /* renamed from: id */
    private final String f57552id;
    @SerializedName("matched_substrings")
    private final List<MatchedSubstringsItem> matchedSubstrings;
    @SerializedName("place_id")
    private final String placeId;
    @SerializedName("reference")
    private final String reference;
    @SerializedName("structured_formatting")
    private final StructuredFormatting structuredFormatting;
    @SerializedName("terms")
    private final List<TermsItem> terms;
    @SerializedName("types")
    private final List<String> types;

    public PredictionsItem() {
        this((String) null, (List) null, (List) null, (List) null, (StructuredFormatting) null, (String) null, (String) null, (String) null, 255, (C13695i) null);
    }

    public PredictionsItem(String str, List<String> list, List<MatchedSubstringsItem> list2, List<TermsItem> list3, StructuredFormatting structuredFormatting2, String str2, String str3, String str4) {
        this.reference = str;
        this.types = list;
        this.matchedSubstrings = list2;
        this.terms = list3;
        this.structuredFormatting = structuredFormatting2;
        this.description = str2;
        this.f57552id = str3;
        this.placeId = str4;
    }

    public static /* synthetic */ PredictionsItem copy$default(PredictionsItem predictionsItem, String str, List list, List list2, List list3, StructuredFormatting structuredFormatting2, String str2, String str3, String str4, int i, Object obj) {
        PredictionsItem predictionsItem2 = predictionsItem;
        int i2 = i;
        return predictionsItem.copy((i2 & 1) != 0 ? predictionsItem2.reference : str, (i2 & 2) != 0 ? predictionsItem2.types : list, (i2 & 4) != 0 ? predictionsItem2.matchedSubstrings : list2, (i2 & 8) != 0 ? predictionsItem2.terms : list3, (i2 & 16) != 0 ? predictionsItem2.structuredFormatting : structuredFormatting2, (i2 & 32) != 0 ? predictionsItem2.description : str2, (i2 & 64) != 0 ? predictionsItem2.f57552id : str3, (i2 & 128) != 0 ? predictionsItem2.placeId : str4);
    }

    public final String component1() {
        return this.reference;
    }

    public final List<String> component2() {
        return this.types;
    }

    public final List<MatchedSubstringsItem> component3() {
        return this.matchedSubstrings;
    }

    public final List<TermsItem> component4() {
        return this.terms;
    }

    public final StructuredFormatting component5() {
        return this.structuredFormatting;
    }

    public final String component6() {
        return this.description;
    }

    public final String component7() {
        return this.f57552id;
    }

    public final String component8() {
        return this.placeId;
    }

    public final PredictionsItem copy(String str, List<String> list, List<MatchedSubstringsItem> list2, List<TermsItem> list3, StructuredFormatting structuredFormatting2, String str2, String str3, String str4) {
        return new PredictionsItem(str, list, list2, list3, structuredFormatting2, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredictionsItem)) {
            return false;
        }
        PredictionsItem predictionsItem = (PredictionsItem) obj;
        return C13706o.m87924a(this.reference, predictionsItem.reference) && C13706o.m87924a(this.types, predictionsItem.types) && C13706o.m87924a(this.matchedSubstrings, predictionsItem.matchedSubstrings) && C13706o.m87924a(this.terms, predictionsItem.terms) && C13706o.m87924a(this.structuredFormatting, predictionsItem.structuredFormatting) && C13706o.m87924a(this.description, predictionsItem.description) && C13706o.m87924a(this.f57552id, predictionsItem.f57552id) && C13706o.m87924a(this.placeId, predictionsItem.placeId);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f57552id;
    }

    public final List<MatchedSubstringsItem> getMatchedSubstrings() {
        return this.matchedSubstrings;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final String getReference() {
        return this.reference;
    }

    public final StructuredFormatting getStructuredFormatting() {
        return this.structuredFormatting;
    }

    public final List<TermsItem> getTerms() {
        return this.terms;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        String str = this.reference;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.types;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<MatchedSubstringsItem> list2 = this.matchedSubstrings;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<TermsItem> list3 = this.terms;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        StructuredFormatting structuredFormatting2 = this.structuredFormatting;
        int hashCode5 = (hashCode4 + (structuredFormatting2 != null ? structuredFormatting2.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f57552id;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.placeId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "PredictionsItem(reference=" + this.reference + ", types=" + this.types + ", matchedSubstrings=" + this.matchedSubstrings + ", terms=" + this.terms + ", structuredFormatting=" + this.structuredFormatting + ", description=" + this.description + ", id=" + this.f57552id + ", placeId=" + this.placeId + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PredictionsItem(java.lang.String r10, java.util.List r11, java.util.List r12, java.util.List r13, com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.StructuredFormatting r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.C13695i r19) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.StructuredFormatting, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
