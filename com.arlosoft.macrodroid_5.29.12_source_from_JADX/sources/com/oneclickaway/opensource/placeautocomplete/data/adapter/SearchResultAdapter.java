package com.oneclickaway.opensource.placeautocomplete.data.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.oneclickaway.opensource.placeautocomplete.C11709R;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.interfaces.SearchPlaces;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p303k6.C13393a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB#\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rR,\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/SearchResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/SearchResultAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "getItemCount", "holder", "position", "Lja/u;", "onBindViewHolder", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "listOfCandidatesItem", "setSearchCandidates", "Ljava/util/List;", "getListOfCandidatesItem", "()Ljava/util/List;", "setListOfCandidatesItem", "(Ljava/util/List;)V", "Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$PlaceItemSelectedListener;", "placeItemSelectedListener", "Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$PlaceItemSelectedListener;", "getPlaceItemSelectedListener", "()Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$PlaceItemSelectedListener;", "setPlaceItemSelectedListener", "(Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$PlaceItemSelectedListener;)V", "<init>", "(Ljava/util/List;Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$PlaceItemSelectedListener;)V", "ViewHolder", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: SearchResultAdapter.kt */
public final class SearchResultAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<PredictionsItem> listOfCandidatesItem;
    private SearchPlaces.PlaceItemSelectedListener placeItemSelectedListener;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/SearchResultAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lja/u;", "inflateViews", "setItemClickListener", "Landroid/widget/TextView;", "placeTitleTV", "Landroid/widget/TextView;", "getPlaceTitleTV", "()Landroid/widget/TextView;", "setPlaceTitleTV", "(Landroid/widget/TextView;)V", "placeFormattedAddressTV", "getPlaceFormattedAddressTV", "setPlaceFormattedAddressTV", "Landroid/view/View;", "binding", "Landroid/view/View;", "getBinding", "()Landroid/view/View;", "setBinding", "(Landroid/view/View;)V", "<init>", "(Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/SearchResultAdapter;Landroid/view/View;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* compiled from: SearchResultAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private View binding;
        public TextView placeFormattedAddressTV;
        public TextView placeTitleTV;
        final /* synthetic */ SearchResultAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SearchResultAdapter searchResultAdapter, View view) {
            super(view);
            C13706o.m87930g(view, "binding");
            this.this$0 = searchResultAdapter;
            this.binding = view;
            inflateViews();
            setItemClickListener();
        }

        private final void inflateViews() {
            View findViewById = this.itemView.findViewById(C11709R.C11712id.placeTitleTV);
            C13706o.m87925b(findViewById, "itemView.findViewById(R.id.placeTitleTV)");
            this.placeTitleTV = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(C11709R.C11712id.placeFormattedAddressTV);
            C13706o.m87925b(findViewById2, "itemView.findViewById(R.….placeFormattedAddressTV)");
            this.placeFormattedAddressTV = (TextView) findViewById2;
        }

        private final void setItemClickListener() {
            C13393a.m85775a(this.binding).mo79692X(700, TimeUnit.MILLISECONDS).mo79685P(new SearchResultAdapter$ViewHolder$setItemClickListener$1(this));
        }

        public final View getBinding() {
            return this.binding;
        }

        public final TextView getPlaceFormattedAddressTV() {
            TextView textView = this.placeFormattedAddressTV;
            if (textView == null) {
                C13706o.m87945v("placeFormattedAddressTV");
            }
            return textView;
        }

        public final TextView getPlaceTitleTV() {
            TextView textView = this.placeTitleTV;
            if (textView == null) {
                C13706o.m87945v("placeTitleTV");
            }
            return textView;
        }

        public final void setBinding(View view) {
            C13706o.m87930g(view, "<set-?>");
            this.binding = view;
        }

        public final void setPlaceFormattedAddressTV(TextView textView) {
            C13706o.m87930g(textView, "<set-?>");
            this.placeFormattedAddressTV = textView;
        }

        public final void setPlaceTitleTV(TextView textView) {
            C13706o.m87930g(textView, "<set-?>");
            this.placeTitleTV = textView;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchResultAdapter(List list, SearchPlaces.PlaceItemSelectedListener placeItemSelectedListener2, int i, C13695i iVar) {
        this((i & 1) != 0 ? new ArrayList() : list, placeItemSelectedListener2);
    }

    public int getItemCount() {
        List<PredictionsItem> list = this.listOfCandidatesItem;
        Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
        if (valueOf == null) {
            C13706o.m87939p();
        }
        return valueOf.intValue();
    }

    public final List<PredictionsItem> getListOfCandidatesItem() {
        return this.listOfCandidatesItem;
    }

    public final SearchPlaces.PlaceItemSelectedListener getPlaceItemSelectedListener() {
        return this.placeItemSelectedListener;
    }

    public final void setListOfCandidatesItem(List<PredictionsItem> list) {
        this.listOfCandidatesItem = list;
    }

    public final void setPlaceItemSelectedListener(SearchPlaces.PlaceItemSelectedListener placeItemSelectedListener2) {
        C13706o.m87930g(placeItemSelectedListener2, "<set-?>");
        this.placeItemSelectedListener = placeItemSelectedListener2;
    }

    public final void setSearchCandidates(List<PredictionsItem> list) {
        this.listOfCandidatesItem = list;
        notifyDataSetChanged();
    }

    public SearchResultAdapter(List<PredictionsItem> list, SearchPlaces.PlaceItemSelectedListener placeItemSelectedListener2) {
        C13706o.m87930g(placeItemSelectedListener2, "placeItemSelectedListener");
        this.listOfCandidatesItem = list;
        this.placeItemSelectedListener = placeItemSelectedListener2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r1 = (r1 = r1.get(r5)).getStructuredFormatting();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.oneclickaway.opensource.placeautocomplete.data.adapter.SearchResultAdapter.ViewHolder r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C13706o.m87930g(r4, r0)
            android.widget.TextView r0 = r4.getPlaceTitleTV()
            java.util.List<com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem> r1 = r3.listOfCandidatesItem
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r1.get(r5)
            com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem r1 = (com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem) r1
            if (r1 == 0) goto L_0x0021
            com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.StructuredFormatting r1 = r1.getStructuredFormatting()
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = r1.getMainText()
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            r0.setText(r1)
            android.widget.TextView r4 = r4.getPlaceFormattedAddressTV()
            java.util.List<com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem> r0 = r3.listOfCandidatesItem
            if (r0 == 0) goto L_0x003f
            java.lang.Object r5 = r0.get(r5)
            com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem r5 = (com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem) r5
            if (r5 == 0) goto L_0x003f
            com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.StructuredFormatting r5 = r5.getStructuredFormatting()
            if (r5 == 0) goto L_0x003f
            java.lang.String r2 = r5.getSecondaryText()
        L_0x003f:
            r4.setText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oneclickaway.opensource.placeautocomplete.data.adapter.SearchResultAdapter.onBindViewHolder(com.oneclickaway.opensource.placeautocomplete.data.adapter.SearchResultAdapter$ViewHolder, int):void");
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87930g(viewGroup, "p0");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C11709R.C11713layout.search_result_row, viewGroup, false);
        C13706o.m87925b(inflate, "LayoutInflater.from(p0.c…ch_result_row, p0, false)");
        return new ViewHolder(this, inflate);
    }
}
