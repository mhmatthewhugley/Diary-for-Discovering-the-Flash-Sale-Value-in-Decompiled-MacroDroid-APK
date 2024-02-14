package com.arlosoft.macrodroid.translations.data;

import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.DontObfuscate;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: TranslationData.kt */
public final class TranslationData {
    private final List<Translation> data;

    /* renamed from: com.arlosoft.macrodroid.translations.data.TranslationData$a */
    /* compiled from: Comparisons.kt */
    public static final class C5577a<T> implements Comparator {
        public final int compare(T t, T t2) {
            Translation translation = (Translation) t2;
            String substring = translation.getTranslationProgress().substring(0, translation.getTranslationProgress().length() - 1);
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Double valueOf = Double.valueOf(Double.parseDouble(substring));
            Translation translation2 = (Translation) t;
            String substring2 = translation2.getTranslationProgress().substring(0, translation2.getTranslationProgress().length() - 1);
            C13706o.m87928e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return C15612b.m94865a(valueOf, Double.valueOf(Double.parseDouble(substring2)));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.translations.data.TranslationData$b */
    /* compiled from: Comparisons.kt */
    public static final class C5578b<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ String f13547a;

        public C5578b(String str) {
            this.f13547a = str;
        }

        public final int compare(T t, T t2) {
            return C15612b.m94865a(Boolean.valueOf(C13706o.m87924a(((Translation) t2).getLanguageCode(), this.f13547a)), Boolean.valueOf(C13706o.m87924a(((Translation) t).getLanguageCode(), this.f13547a)));
        }
    }

    public TranslationData(List<Translation> list) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.data = list;
    }

    public static /* synthetic */ TranslationData copy$default(TranslationData translationData, List<Translation> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = translationData.data;
        }
        return translationData.copy(list);
    }

    public final List<Translation> component1() {
        return this.data;
    }

    public final TranslationData copy(List<Translation> list) {
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        return new TranslationData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranslationData) && C13706o.m87924a(this.data, ((TranslationData) obj).data);
    }

    public final List<Translation> getData() {
        return this.data;
    }

    public final List<Translation> getSortedTranslations() {
        Locale c = MacroDroidApplication.f9883I.mo27304c();
        if (c == null) {
            c = Locale.getDefault();
        }
        String language = c.getLanguage();
        List<Translation> list = this.data;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!((Translation) next).isBaseLanguage()) {
                arrayList.add(next);
            }
        }
        return C13566b0.m87450y0(C13566b0.m87450y0(arrayList, new C5577a()), new C5578b(language));
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "TranslationData(data=" + this.data + ')';
    }
}
