package com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/SearchResponse;", "", "predictions", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "status", "", "(Ljava/util/List;Ljava/lang/String;)V", "getPredictions", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: SearchResponse.kt */
public final class SearchResponse {
    @SerializedName("predictions")
    private final List<PredictionsItem> predictions;
    @SerializedName("status")
    private final String status;

    public SearchResponse() {
        this((List) null, (String) null, 3, (C13695i) null);
    }

    public SearchResponse(List<PredictionsItem> list, String str) {
        this.predictions = list;
        this.status = str;
    }

    public static /* synthetic */ SearchResponse copy$default(SearchResponse searchResponse, List<PredictionsItem> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchResponse.predictions;
        }
        if ((i & 2) != 0) {
            str = searchResponse.status;
        }
        return searchResponse.copy(list, str);
    }

    public final List<PredictionsItem> component1() {
        return this.predictions;
    }

    public final String component2() {
        return this.status;
    }

    public final SearchResponse copy(List<PredictionsItem> list, String str) {
        return new SearchResponse(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResponse)) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) obj;
        return C13706o.m87924a(this.predictions, searchResponse.predictions) && C13706o.m87924a(this.status, searchResponse.status);
    }

    public final List<PredictionsItem> getPredictions() {
        return this.predictions;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        List<PredictionsItem> list = this.predictions;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.status;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SearchResponse(predictions=" + this.predictions + ", status=" + this.status + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchResponse(List list, String str, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
