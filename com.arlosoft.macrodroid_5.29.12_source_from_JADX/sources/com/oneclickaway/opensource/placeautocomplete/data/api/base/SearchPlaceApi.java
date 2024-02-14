package com.oneclickaway.opensource.placeautocomplete.data.api.base;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlacesDetailsResponse;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.SearchResponse;
import kotlin.Metadata;
import p414v9.C16735i;
import p458df.C17127f;
import p458df.C17141t;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¨\u0006\r"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/base/SearchPlaceApi;", "", "", "placeId", "apiKey", "Lv9/i;", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlacesDetailsResponse;", "getPlaceDetailsFromPlaceId", "placeHint", "location", "radius", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/SearchResponse;", "getPlaceResults", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: SearchPlaceApi.kt */
public interface SearchPlaceApi {
    @C17127f("details/json")
    C16735i<PlacesDetailsResponse> getPlaceDetailsFromPlaceId(@C17141t("placeid") String str, @C17141t("key") String str2);

    @C17127f("autocomplete/json")
    C16735i<SearchResponse> getPlaceResults(@C17141t("input") String str, @C17141t("key") String str2, @C17141t("location") String str3, @C17141t("radius") String str4);
}
