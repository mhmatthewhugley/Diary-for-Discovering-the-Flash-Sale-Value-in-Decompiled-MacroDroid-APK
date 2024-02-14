package com.oneclickaway.opensource.placeautocomplete.p232ui;

import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.oneclickaway.opensource.placeautocomplete.p232ui.SearchPlaceActivity;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/LoadingManager;", "it", "Lja/u;", "onChanged", "(Lcom/oneclickaway/opensource/placeautocomplete/utils/LoadingManager;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$attachLiveObservers$3 */
/* compiled from: SearchPlaceActivity.kt */
final class SearchPlaceActivity$attachLiveObservers$3<T> implements Observer<LoadingManager> {
    final /* synthetic */ SearchPlaceActivity this$0;

    SearchPlaceActivity$attachLiveObservers$3(SearchPlaceActivity searchPlaceActivity) {
        this.this$0 = searchPlaceActivity;
    }

    public final void onChanged(LoadingManager loadingManager) {
        if (loadingManager != null) {
            switch (SearchPlaceActivity.WhenMappings.$EnumSwitchMapping$1[loadingManager.ordinal()]) {
                case 1:
                    LinearLayout recentSearchesLL = this.this$0.getRecentSearchesLL();
                    if (recentSearchesLL == null) {
                        C13706o.m87939p();
                    }
                    recentSearchesLL.setVisibility(8);
                    this.this$0.getSearchProgressBar().setVisibility(0);
                    if (this.this$0.getSecondaryInformationLL().getVisibility() != 0) {
                        this.this$0.getSearchResultsRV().setVisibility(0);
                        return;
                    }
                    return;
                case 2:
                    LinearLayout recentSearchesLL2 = this.this$0.getRecentSearchesLL();
                    if (recentSearchesLL2 == null) {
                        C13706o.m87939p();
                    }
                    recentSearchesLL2.setVisibility(8);
                    this.this$0.getSearchResultsRV().setVisibility(0);
                    this.this$0.getSearchProgressBar().setVisibility(8);
                    this.this$0.getSecondaryInformationLL().setVisibility(8);
                    return;
                case 3:
                    LinearLayout recentSearchesLL3 = this.this$0.getRecentSearchesLL();
                    if (recentSearchesLL3 == null) {
                        C13706o.m87939p();
                    }
                    recentSearchesLL3.setVisibility(8);
                    this.this$0.setSecondaryStateInformation(LoadingManager.STATE_NO_INTERNET);
                    return;
                case 4:
                    LinearLayout recentSearchesLL4 = this.this$0.getRecentSearchesLL();
                    if (recentSearchesLL4 == null) {
                        C13706o.m87939p();
                    }
                    recentSearchesLL4.setVisibility(8);
                    this.this$0.setSecondaryStateInformation(LoadingManager.STATE_ERROR);
                    return;
                case 5:
                    LinearLayout recentSearchesLL5 = this.this$0.getRecentSearchesLL();
                    if (recentSearchesLL5 == null) {
                        C13706o.m87939p();
                    }
                    recentSearchesLL5.setVisibility(8);
                    this.this$0.setSecondaryStateInformation(LoadingManager.STATE_NO_RESULT);
                    return;
                case 6:
                    this.this$0.getEraseCurrentEntryIV().setVisibility(8);
                    this.this$0.getSearchResultsRV().setVisibility(8);
                    this.this$0.getSearchProgressBar().setVisibility(8);
                    this.this$0.getSecondaryInformationLL().setVisibility(8);
                    LinearLayout recentSearchesLL6 = this.this$0.getRecentSearchesLL();
                    if (recentSearchesLL6 == null) {
                        C13706o.m87939p();
                    }
                    recentSearchesLL6.setVisibility(0);
                    return;
            }
        }
        System.out.print("No loading state detected");
    }
}
