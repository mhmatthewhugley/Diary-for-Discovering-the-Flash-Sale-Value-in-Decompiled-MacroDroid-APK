package com.oneclickaway.opensource.placeautocomplete.p232ui;

import androidx.lifecycle.Observer;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "onChanged", "(Ljava/lang/String;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$attachEraserObserver$1 */
/* compiled from: SearchPlaceActivity.kt */
final class SearchPlaceActivity$attachEraserObserver$1<T> implements Observer<String> {
    final /* synthetic */ SearchPlaceActivity this$0;

    SearchPlaceActivity$attachEraserObserver$1(SearchPlaceActivity searchPlaceActivity) {
        this.this$0 = searchPlaceActivity;
    }

    public final void onChanged(String str) {
        if (str != null) {
            if (str.length() > 0) {
                this.this$0.getEraseCurrentEntryIV().setVisibility(0);
                return;
            }
        }
        this.this$0.getEraseCurrentEntryIV().setVisibility(8);
    }
}
