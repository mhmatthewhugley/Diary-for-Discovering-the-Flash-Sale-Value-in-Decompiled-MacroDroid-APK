package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.SearchResponse;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p216ba.C11116g;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo71668d2 = {"<anonymous>", "", "it", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/SearchResponse;", "test"}, mo71669k = 3, mo71670mv = {1, 1, 15})
/* compiled from: SearchPlacesRepo.kt */
final class SearchPlacesRepo$requestListOfSearchResults$1<T> implements C11116g<SearchResponse> {
    final /* synthetic */ SearchPlacesRepo this$0;

    SearchPlacesRepo$requestListOfSearchResults$1(SearchPlacesRepo searchPlacesRepo) {
        this.this$0 = searchPlacesRepo;
    }

    public final boolean test(SearchResponse searchResponse) {
        C13706o.m87930g(searchResponse, "it");
        if (searchResponse.getPredictions() == null || !searchResponse.getPredictions().isEmpty()) {
            return true;
        }
        this.this$0.loadingPredictionManager.postValue(LoadingManager.STATE_NO_RESULT);
        return false;
    }
}
