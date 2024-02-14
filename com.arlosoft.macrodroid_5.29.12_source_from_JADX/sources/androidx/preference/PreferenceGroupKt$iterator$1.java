package androidx.preference;

import java.util.Iterator;
import kotlin.Metadata;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, mo71668d2 = {"androidx/preference/PreferenceGroupKt$iterator$1", "", "Landroidx/preference/Preference;", "", "hasNext", "next", "Lja/u;", "remove", "", "index", "I", "preference-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PreferenceGroup.kt */
public final class PreferenceGroupKt$iterator$1 implements Iterator<Preference>, C16368a {
    final /* synthetic */ PreferenceGroup $this_iterator;
    private int index;

    PreferenceGroupKt$iterator$1(PreferenceGroup preferenceGroup) {
        this.$this_iterator = preferenceGroup;
    }

    public boolean hasNext() {
        return this.index < this.$this_iterator.getPreferenceCount();
    }

    public void remove() {
        PreferenceGroup preferenceGroup = this.$this_iterator;
        int i = this.index - 1;
        this.index = i;
        preferenceGroup.removePreference(preferenceGroup.getPreference(i));
    }

    public Preference next() {
        PreferenceGroup preferenceGroup = this.$this_iterator;
        int i = this.index;
        this.index = i + 1;
        Preference preference = preferenceGroup.getPreference(i);
        if (preference != null) {
            return preference;
        }
        throw new IndexOutOfBoundsException();
    }
}
