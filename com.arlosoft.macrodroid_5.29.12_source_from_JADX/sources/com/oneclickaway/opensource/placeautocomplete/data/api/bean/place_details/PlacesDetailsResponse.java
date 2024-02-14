package com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R(\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlacesDetailsResponse;", "", "result", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "htmlAttributions", "", "status", "", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;Ljava/util/List;Ljava/lang/String;)V", "getHtmlAttributions", "()Ljava/util/List;", "setHtmlAttributions", "(Ljava/util/List;)V", "getResult", "()Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "setResult", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: PlacesDetailsResponse.kt */
public final class PlacesDetailsResponse {
    @SerializedName("html_attributions")
    private List<? extends Object> htmlAttributions;
    @SerializedName("result")
    private PlaceDetails result;
    @SerializedName("status")
    private String status;

    public PlacesDetailsResponse() {
        this((PlaceDetails) null, (List) null, (String) null, 7, (C13695i) null);
    }

    public PlacesDetailsResponse(PlaceDetails placeDetails, List<? extends Object> list, String str) {
        this.result = placeDetails;
        this.htmlAttributions = list;
        this.status = str;
    }

    public static /* synthetic */ PlacesDetailsResponse copy$default(PlacesDetailsResponse placesDetailsResponse, PlaceDetails placeDetails, List<? extends Object> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            placeDetails = placesDetailsResponse.result;
        }
        if ((i & 2) != 0) {
            list = placesDetailsResponse.htmlAttributions;
        }
        if ((i & 4) != 0) {
            str = placesDetailsResponse.status;
        }
        return placesDetailsResponse.copy(placeDetails, list, str);
    }

    public final PlaceDetails component1() {
        return this.result;
    }

    public final List<Object> component2() {
        return this.htmlAttributions;
    }

    public final String component3() {
        return this.status;
    }

    public final PlacesDetailsResponse copy(PlaceDetails placeDetails, List<? extends Object> list, String str) {
        return new PlacesDetailsResponse(placeDetails, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesDetailsResponse)) {
            return false;
        }
        PlacesDetailsResponse placesDetailsResponse = (PlacesDetailsResponse) obj;
        return C13706o.m87924a(this.result, placesDetailsResponse.result) && C13706o.m87924a(this.htmlAttributions, placesDetailsResponse.htmlAttributions) && C13706o.m87924a(this.status, placesDetailsResponse.status);
    }

    public final List<Object> getHtmlAttributions() {
        return this.htmlAttributions;
    }

    public final PlaceDetails getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        PlaceDetails placeDetails = this.result;
        int i = 0;
        int hashCode = (placeDetails != null ? placeDetails.hashCode() : 0) * 31;
        List<? extends Object> list = this.htmlAttributions;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.status;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setHtmlAttributions(List<? extends Object> list) {
        this.htmlAttributions = list;
    }

    public final void setResult(PlaceDetails placeDetails) {
        this.result = placeDetails;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "PlacesDetailsResponse(result=" + this.result + ", htmlAttributions=" + this.htmlAttributions + ", status=" + this.status + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlacesDetailsResponse(PlaceDetails placeDetails, List list, String str, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : placeDetails, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }
}
