package androidx.preference;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.C15118h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¨\u0006\u0005"}, mo71668d2 = {"androidx/preference/PreferenceGroupKt$children$1", "Lkotlin/sequences/h;", "Landroidx/preference/Preference;", "", "iterator", "preference-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PreferenceGroup.kt */
public final class PreferenceGroupKt$children$1 implements C15118h<Preference> {
    final /* synthetic */ PreferenceGroup $this_children;

    PreferenceGroupKt$children$1(PreferenceGroup preferenceGroup) {
        this.$this_children = preferenceGroup;
    }

    public Iterator<Preference> iterator() {
        return PreferenceGroupKt.iterator(this.$this_children);
    }
}
