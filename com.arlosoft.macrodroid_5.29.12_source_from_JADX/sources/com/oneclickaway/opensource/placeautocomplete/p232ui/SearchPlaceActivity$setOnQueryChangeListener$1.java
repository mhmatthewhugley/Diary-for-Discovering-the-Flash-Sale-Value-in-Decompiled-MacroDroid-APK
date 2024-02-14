package com.oneclickaway.opensource.placeautocomplete.p232ui;

import com.oneclickaway.opensource.placeautocomplete.data.model.view.SearchPlacesViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p292io.reactivex.observers.C13230a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, mo71668d2 = {"com/oneclickaway/opensource/placeautocomplete/ui/SearchPlaceActivity$setOnQueryChangeListener$1", "Lio/reactivex/observers/a;", "", "Lja/u;", "onComplete", "t", "onNext", "", "e", "onError", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$setOnQueryChangeListener$1 */
/* compiled from: SearchPlaceActivity.kt */
public final class SearchPlaceActivity$setOnQueryChangeListener$1 extends C13230a<CharSequence> {
    final /* synthetic */ SearchPlaceActivity this$0;

    SearchPlaceActivity$setOnQueryChangeListener$1(SearchPlaceActivity searchPlaceActivity) {
        this.this$0 = searchPlaceActivity;
    }

    public void onComplete() {
        System.out.print("Completed");
    }

    public void onError(Throwable th) {
        C13706o.m87930g(th, "e");
        th.printStackTrace();
    }

    public void onNext(CharSequence charSequence) {
        C13706o.m87930g(charSequence, "t");
        this.this$0.liveQueryInEditText.postValue(charSequence.toString());
        SearchPlacesViewModel access$getViewModel = this.this$0.getViewModel();
        String obj = charSequence.toString();
        String access$getApiKey$p = this.this$0.apiKey;
        if (access$getApiKey$p == null) {
            C13706o.m87939p();
        }
        String access$getLocation$p = this.this$0.location;
        if (access$getLocation$p == null) {
            access$getLocation$p = "";
        }
        String access$getEnclosingRadius$p = this.this$0.enclosingRadius;
        if (access$getEnclosingRadius$p == null) {
            access$getEnclosingRadius$p = "500";
        }
        access$getViewModel.requestListOfSearchResults(obj, access$getApiKey$p, access$getLocation$p, access$getEnclosingRadius$p);
    }
}
