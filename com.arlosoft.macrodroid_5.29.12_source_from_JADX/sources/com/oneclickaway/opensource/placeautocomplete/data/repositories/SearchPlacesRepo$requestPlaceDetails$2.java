package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlacesDetailsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p216ba.C11114e;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo71668d2 = {"<anonymous>", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "it", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlacesDetailsResponse;", "apply"}, mo71669k = 3, mo71670mv = {1, 1, 15})
/* compiled from: SearchPlacesRepo.kt */
final class SearchPlacesRepo$requestPlaceDetails$2<T, R> implements C11114e<T, R> {
    public static final SearchPlacesRepo$requestPlaceDetails$2 INSTANCE = new SearchPlacesRepo$requestPlaceDetails$2();

    SearchPlacesRepo$requestPlaceDetails$2() {
    }

    public final PlaceDetails apply(PlacesDetailsResponse placesDetailsResponse) {
        C13706o.m87930g(placesDetailsResponse, "it");
        return placesDetailsResponse.getResult();
    }
}
