package androidx.databinding.adapters;

import android.widget.SearchView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @BindingMethod(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @BindingMethod(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class SearchViewBindingAdapter {

    public interface OnQueryTextChange {
        boolean onQueryTextChange(String str);
    }

    public interface OnQueryTextSubmit {
        boolean onQueryTextSubmit(String str);
    }

    public interface OnSuggestionClick {
        boolean onSuggestionClick(int i);
    }

    public interface OnSuggestionSelect {
        boolean onSuggestionSelect(int i);
    }

    @BindingAdapter(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void setOnQueryTextListener(SearchView searchView, final OnQueryTextSubmit onQueryTextSubmit, final OnQueryTextChange onQueryTextChange) {
        if (onQueryTextSubmit == null && onQueryTextChange == null) {
            searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) null);
        } else {
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                public boolean onQueryTextChange(String str) {
                    OnQueryTextChange onQueryTextChange = onQueryTextChange;
                    if (onQueryTextChange != null) {
                        return onQueryTextChange.onQueryTextChange(str);
                    }
                    return false;
                }

                public boolean onQueryTextSubmit(String str) {
                    OnQueryTextSubmit onQueryTextSubmit = onQueryTextSubmit;
                    if (onQueryTextSubmit != null) {
                        return onQueryTextSubmit.onQueryTextSubmit(str);
                    }
                    return false;
                }
            });
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void setOnSuggestListener(SearchView searchView, final OnSuggestionSelect onSuggestionSelect, final OnSuggestionClick onSuggestionClick) {
        if (onSuggestionSelect == null && onSuggestionClick == null) {
            searchView.setOnSuggestionListener((SearchView.OnSuggestionListener) null);
        } else {
            searchView.setOnSuggestionListener(new SearchView.OnSuggestionListener() {
                public boolean onSuggestionClick(int i) {
                    OnSuggestionClick onSuggestionClick = onSuggestionClick;
                    if (onSuggestionClick != null) {
                        return onSuggestionClick.onSuggestionClick(i);
                    }
                    return false;
                }

                public boolean onSuggestionSelect(int i) {
                    OnSuggestionSelect onSuggestionSelect = onSuggestionSelect;
                    if (onSuggestionSelect != null) {
                        return onSuggestionSelect.onSuggestionSelect(i);
                    }
                    return false;
                }
            });
        }
    }
}
