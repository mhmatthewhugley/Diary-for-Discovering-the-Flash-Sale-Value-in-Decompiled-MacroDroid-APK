package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.SearchResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p216ba.C11114e;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo71668d2 = {"<anonymous>", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "it", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/SearchResponse;", "apply"}, mo71669k = 3, mo71670mv = {1, 1, 15})
/* compiled from: SearchPlacesRepo.kt */
final class SearchPlacesRepo$requestListOfSearchResults$2<T, R> implements C11114e<T, R> {
    public static final SearchPlacesRepo$requestListOfSearchResults$2 INSTANCE = new SearchPlacesRepo$requestListOfSearchResults$2();

    SearchPlacesRepo$requestListOfSearchResults$2() {
    }

    public final List<PredictionsItem> apply(SearchResponse searchResponse) {
        C13706o.m87930g(searchResponse, "it");
        return searchResponse.getPredictions();
    }
}
