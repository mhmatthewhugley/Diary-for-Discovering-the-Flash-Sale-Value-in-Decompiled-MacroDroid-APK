package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlacesDetailsResponse;
import com.oneclickaway.opensource.placeautocomplete.utils.SearchPlacesStatusCodes;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p216ba.C11116g;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo71668d2 = {"<anonymous>", "", "it", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlacesDetailsResponse;", "test"}, mo71669k = 3, mo71670mv = {1, 1, 15})
/* compiled from: SearchPlacesRepo.kt */
final class SearchPlacesRepo$requestPlaceDetails$1<T> implements C11116g<PlacesDetailsResponse> {
    public static final SearchPlacesRepo$requestPlaceDetails$1 INSTANCE = new SearchPlacesRepo$requestPlaceDetails$1();

    SearchPlacesRepo$requestPlaceDetails$1() {
    }

    public final boolean test(PlacesDetailsResponse placesDetailsResponse) {
        C13706o.m87930g(placesDetailsResponse, "it");
        return C15176v.m93642w(placesDetailsResponse.getStatus(), SearchPlacesStatusCodes.INSTANCE.getGOOGLE_SEARCH_RESULT_OK(), false, 2, (Object) null);
    }
}
