package androidx.preference;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.sequences.C15118h;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0005\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\u0002\u001a\u0015\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\n\u001a\u0015\u0010\u000e\u001a\u00020\f*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\n\u001a\r\u0010\u000f\u001a\u00020\n*\u00020\u0002H\b\u001a\r\u0010\u0010\u001a\u00020\n*\u00020\u0002H\b\u001a!\u0010\u0013\u001a\u00020\f*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u0011H\b\u001a'\u0010\u0015\u001a\u00020\f*\u00020\u00022\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u0014H\b\u001a\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016*\u00020\u0002H\u0002\"\u0016\u0010\u001a\u001a\u00020\u0007*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, mo71668d2 = {"Landroidx/preference/Preference;", "T", "Landroidx/preference/PreferenceGroup;", "", "key", "get", "(Landroidx/preference/PreferenceGroup;Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "", "index", "preference", "", "contains", "Lja/u;", "plusAssign", "minusAssign", "isEmpty", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "Lkotlin/Function2;", "forEachIndexed", "", "iterator", "getSize", "(Landroidx/preference/PreferenceGroup;)I", "size", "Lkotlin/sequences/h;", "getChildren", "(Landroidx/preference/PreferenceGroup;)Lkotlin/sequences/h;", "children", "preference-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: PreferenceGroup.kt */
public final class PreferenceGroupKt {
    public static final boolean contains(PreferenceGroup preferenceGroup, Preference preference) {
        C13706o.m87930g(preferenceGroup, "$this$contains");
        C13706o.m87930g(preference, "preference");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            if (C13706o.m87924a(preferenceGroup.getPreference(i), preference)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(PreferenceGroup preferenceGroup, C16265l<? super Preference, C13339u> lVar) {
        C13706o.m87930g(preferenceGroup, "$this$forEach");
        C13706o.m87930g(lVar, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            lVar.invoke(get(preferenceGroup, i));
        }
    }

    public static final void forEachIndexed(PreferenceGroup preferenceGroup, C16269p<? super Integer, ? super Preference, C13339u> pVar) {
        C13706o.m87930g(preferenceGroup, "$this$forEachIndexed");
        C13706o.m87930g(pVar, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            pVar.invoke(Integer.valueOf(i), get(preferenceGroup, i));
        }
    }

    public static final <T extends Preference> T get(PreferenceGroup preferenceGroup, CharSequence charSequence) {
        C13706o.m87930g(preferenceGroup, "$this$get");
        C13706o.m87930g(charSequence, "key");
        return preferenceGroup.findPreference(charSequence);
    }

    public static final C15118h<Preference> getChildren(PreferenceGroup preferenceGroup) {
        C13706o.m87930g(preferenceGroup, "$this$children");
        return new PreferenceGroupKt$children$1(preferenceGroup);
    }

    public static final int getSize(PreferenceGroup preferenceGroup) {
        C13706o.m87930g(preferenceGroup, "$this$size");
        return preferenceGroup.getPreferenceCount();
    }

    public static final boolean isEmpty(PreferenceGroup preferenceGroup) {
        C13706o.m87930g(preferenceGroup, "$this$isEmpty");
        return preferenceGroup.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(PreferenceGroup preferenceGroup) {
        C13706o.m87930g(preferenceGroup, "$this$isNotEmpty");
        return preferenceGroup.getPreferenceCount() != 0;
    }

    public static final Iterator<Preference> iterator(PreferenceGroup preferenceGroup) {
        C13706o.m87930g(preferenceGroup, "$this$iterator");
        return new PreferenceGroupKt$iterator$1(preferenceGroup);
    }

    public static final void minusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        C13706o.m87930g(preferenceGroup, "$this$minusAssign");
        C13706o.m87930g(preference, "preference");
        preferenceGroup.removePreference(preference);
    }

    public static final void plusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        C13706o.m87930g(preferenceGroup, "$this$plusAssign");
        C13706o.m87930g(preference, "preference");
        preferenceGroup.addPreference(preference);
    }

    public static final Preference get(PreferenceGroup preferenceGroup, int i) {
        C13706o.m87930g(preferenceGroup, "$this$get");
        Preference preference = preferenceGroup.getPreference(i);
        if (preference != null) {
            return preference;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + preferenceGroup.getPreferenceCount());
    }
}
