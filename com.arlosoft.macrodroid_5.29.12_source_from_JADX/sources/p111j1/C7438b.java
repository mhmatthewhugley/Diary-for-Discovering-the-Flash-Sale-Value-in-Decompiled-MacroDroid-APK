package p111j1;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p297ja.C13337s;

/* renamed from: j1.b */
/* compiled from: LanguageDetector.kt */
public final class C7438b {

    /* renamed from: a */
    public static final C7438b f18214a = new C7438b();

    /* renamed from: b */
    private static final Map<String, String> f18215b = C13615t0.m87763m(C13337s.m85692a("en", "Copy"), C13337s.m85692a("af", "Kopieer"), C13337s.m85692a("am", "ቅዳ"), C13337s.m85692a("ar", "نسخ"), C13337s.m85692a("as", "প্ৰতিলিপি কৰক"), C13337s.m85692a("az", "Kopyalayın"), C13337s.m85692a("sr", "Kopiraj"), C13337s.m85692a("be", "Капіраваць"), C13337s.m85692a("bg", "Копиране"), C13337s.m85692a("bn", "কপি করুন"), C13337s.m85692a("bs", "Kopiraj"), C13337s.m85692a("ca", "Copia"), C13337s.m85692a("cs", "Kopírovat"), C13337s.m85692a("da", "Kopiér"), C13337s.m85692a("de", "Kopieren"), C13337s.m85692a("el", "Αντιγραφή"), C13337s.m85692a("es", "Copiar"), C13337s.m85692a("et", "Kopeerimine"), C13337s.m85692a("eu", "Kopiatu"), C13337s.m85692a("fa", "کپی"), C13337s.m85692a("fi", "Kopioi"), C13337s.m85692a("fr", "Copier"), C13337s.m85692a("gl", "Copiar"), C13337s.m85692a("gu", "કૉપિ કરો"), C13337s.m85692a("hi", "कॉपी करें"), C13337s.m85692a("hr", "Kopiraj"), C13337s.m85692a("hu", "Másolás"), C13337s.m85692a("hy", "Պատճենել"), C13337s.m85692a("in", "Salin"), C13337s.m85692a("is", "Afrita"), C13337s.m85692a("it", "Copia"), C13337s.m85692a("iw", "העתקה"), C13337s.m85692a("ja", "コピー"), C13337s.m85692a("ka", "კოპირება"), C13337s.m85692a("kk", "Көшіру"), C13337s.m85692a("km", "ចម្លង"), C13337s.m85692a("kn", "ನಕಲಿಸಿ"), C13337s.m85692a("ko", "복사"), C13337s.m85692a("ky", "Көчүрүү"), C13337s.m85692a("lo", "ສຳເນົາ"), C13337s.m85692a("lt", "Kopijuoti"), C13337s.m85692a("lv", "Kopēt"), C13337s.m85692a("mk", "Копирај"), C13337s.m85692a("m1", "പകർത്തുക"), C13337s.m85692a("mn", "Хуулах"), C13337s.m85692a("mr", "कॉपी करा"), C13337s.m85692a("ms", "Salin"), C13337s.m85692a("my", "မိတ္တူကူးရန်"), C13337s.m85692a("nb", "Kopiér"), C13337s.m85692a("ne", "प्रतिलिपि गर्नुहोस्"), C13337s.m85692a("nl", "Kopiëren"), C13337s.m85692a("or", "କପି କରନ୍ତୁ"), C13337s.m85692a("pa", "ਕਾਪੀ ਕਰੋ"), C13337s.m85692a("pl", "Kopiuj"), C13337s.m85692a("pt", "Copiar"), C13337s.m85692a("ro", "Copiați"), C13337s.m85692a("ru", "Копировать"), C13337s.m85692a("si", "පිටපත් කරන්න"), C13337s.m85692a("sk", "Kopírovať"), C13337s.m85692a("sl", "Kopiraj"), C13337s.m85692a("sq", "Kopjo"), C13337s.m85692a("sr", "Копирај"), C13337s.m85692a("sv", "Kopiera"), C13337s.m85692a("sw", "Nakili"), C13337s.m85692a("ta", "நகலெடு"), C13337s.m85692a("te", "కాపీ చేయి"), C13337s.m85692a("th", "คัดลอก"), C13337s.m85692a("tl", "Kopyahin"), C13337s.m85692a("tr", "Kopyala"), C13337s.m85692a("uk", "Скопіювати"), C13337s.m85692a("ur", "کاپی کریں"), C13337s.m85692a("uz", "Nusxa olish"), C13337s.m85692a("vi", "Sao chép"), C13337s.m85692a("zh", "复制"), C13337s.m85692a("zh-CN", "复制"), C13337s.m85692a("zh-HK", "複製"), C13337s.m85692a("zh-TW", "複製"), C13337s.m85692a("zu", "Kopisha"));

    private C7438b() {
    }

    /* renamed from: a */
    public final String mo37569a(Context context) {
        C13706o.m87929f(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
            C13706o.m87928e(language, "{\n            context.re…les[0].language\n        }");
            return language;
        }
        String language2 = context.getResources().getConfiguration().locale.getLanguage();
        C13706o.m87928e(language2, "{\n            context.re…locale.language\n        }");
        return language2;
    }

    /* renamed from: b */
    public final String mo37570b(Context context) {
        C13706o.m87929f(context, "context");
        String str = f18215b.get(mo37569a(context));
        if (str == null) {
            str = "Copy";
        }
        return str;
    }
}
