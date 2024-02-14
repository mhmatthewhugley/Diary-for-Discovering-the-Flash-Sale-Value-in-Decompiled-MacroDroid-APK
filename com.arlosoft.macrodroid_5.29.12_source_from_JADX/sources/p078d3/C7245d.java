package p078d3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModelManager;
import com.google.mlkit.p229nl.translate.TranslateRemoteModel;
import com.google.mlkit.p229nl.translate.Translation;
import com.google.mlkit.p229nl.translate.Translator;
import com.google.mlkit.p229nl.translate.TranslatorOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15497o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;
import p455ag.C17105a;

/* renamed from: d3.d */
/* compiled from: TranslationHelper.kt */
public final class C7245d {

    /* renamed from: a */
    private final Context f17674a;

    /* renamed from: b */
    private TranslatorOptions f17675b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Translator f17676c;

    /* renamed from: d3.d$a */
    /* compiled from: TranslationHelper.kt */
    static final class C7246a<TResult> implements OnSuccessListener {

        /* renamed from: a */
        final /* synthetic */ String f17677a;

        /* renamed from: b */
        final /* synthetic */ C15492n<Boolean> f17678b;

        /* renamed from: d3.d$a$a */
        /* compiled from: TranslationHelper.kt */
        static final class C7247a extends C13708q implements C16265l<Throwable, C13339u> {

            /* renamed from: a */
            public static final C7247a f17679a = new C7247a();

            C7247a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13339u.f61331a;
            }

            public final void invoke(Throwable th) {
                C13706o.m87929f(th, "it");
            }
        }

        /* renamed from: d3.d$a$b */
        /* compiled from: TranslationHelper.kt */
        static final class C7248b extends C13708q implements C16265l<Throwable, C13339u> {

            /* renamed from: a */
            public static final C7248b f17680a = new C7248b();

            C7248b() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13339u.f61331a;
            }

            public final void invoke(Throwable th) {
                C13706o.m87929f(th, "it");
            }
        }

        C7246a(String str, C15492n<? super Boolean> nVar) {
            this.f17677a = str;
            this.f17678b = nVar;
        }

        /* renamed from: a */
        public final void mo22751b(Set<TranslateRemoteModel> set) {
            C13706o.m87928e(set, "models");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(set, 10));
            for (TranslateRemoteModel f : set) {
                arrayList.add(f.mo64631f());
            }
            if (arrayList.contains(this.f17677a)) {
                this.f17678b.mo74846l(Boolean.TRUE, C7247a.f17679a);
            } else {
                this.f17678b.mo74846l(Boolean.FALSE, C7248b.f17680a);
            }
        }
    }

    /* renamed from: d3.d$b */
    /* compiled from: TranslationHelper.kt */
    static final class C7249b implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ C15492n<Boolean> f17681a;

        /* renamed from: d3.d$b$a */
        /* compiled from: TranslationHelper.kt */
        static final class C7250a extends C13708q implements C16265l<Throwable, C13339u> {

            /* renamed from: a */
            public static final C7250a f17682a = new C7250a();

            C7250a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13339u.f61331a;
            }

            public final void invoke(Throwable th) {
                C13706o.m87929f(th, "it");
            }
        }

        C7249b(C15492n<? super Boolean> nVar) {
            this.f17681a = nVar;
        }

        /* renamed from: c */
        public final void mo22733c(Exception exc) {
            C13706o.m87929f(exc, "it");
            this.f17681a.mo74846l(Boolean.FALSE, C7250a.f17682a);
        }
    }

    /* renamed from: d3.d$c */
    /* compiled from: TranslationHelper.kt */
    static final class C7251c extends C13708q implements C16265l<Throwable, C13339u> {

        /* renamed from: a */
        public static final C7251c f17683a = new C7251c();

        C7251c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            C13706o.m87929f(th, "it");
        }
    }

    /* renamed from: d3.d$d */
    /* compiled from: TranslationHelper.kt */
    static final class C7252d<TResult> implements OnSuccessListener {

        /* renamed from: a */
        final /* synthetic */ C15492n<String> f17684a;

        /* renamed from: d3.d$d$a */
        /* compiled from: TranslationHelper.kt */
        static final class C7253a extends C13708q implements C16265l<Throwable, C13339u> {

            /* renamed from: a */
            public static final C7253a f17685a = new C7253a();

            C7253a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13339u.f61331a;
            }

            public final void invoke(Throwable th) {
                C13706o.m87929f(th, "it");
            }
        }

        C7252d(C15492n<? super String> nVar) {
            this.f17684a = nVar;
        }

        /* renamed from: a */
        public final void mo22751b(String str) {
            C15492n<String> nVar = this.f17684a;
            C13706o.m87928e(str, "it");
            nVar.mo74846l(str, C7253a.f17685a);
        }
    }

    /* renamed from: d3.d$e */
    /* compiled from: TranslationHelper.kt */
    static final class C7254e implements OnFailureListener {

        /* renamed from: a */
        final /* synthetic */ C15492n<String> f17686a;

        /* renamed from: b */
        final /* synthetic */ String f17687b;

        /* renamed from: d3.d$e$a */
        /* compiled from: TranslationHelper.kt */
        static final class C7255a extends C13708q implements C16265l<Throwable, C13339u> {

            /* renamed from: a */
            public static final C7255a f17688a = new C7255a();

            C7255a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13339u.f61331a;
            }

            public final void invoke(Throwable th) {
                C13706o.m87929f(th, "it");
            }
        }

        C7254e(C15492n<? super String> nVar, String str) {
            this.f17686a = nVar;
            this.f17687b = str;
        }

        /* renamed from: c */
        public final void mo22733c(Exception exc) {
            C13706o.m87929f(exc, "it");
            this.f17686a.mo74846l(this.f17687b, C7255a.f17688a);
        }
    }

    public C7245d(Context context) {
        C13706o.m87929f(context, "context");
        this.f17674a = context;
        String i2 = C5163j2.m20177i2(context);
        if (i2 != null) {
            TranslatorOptions a = new TranslatorOptions.Builder().mo64645b("en").mo64646c(i2).mo64644a();
            this.f17675b = a;
            C13706o.m87926c(a);
            this.f17676c = Translation.m79150a(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m29958f(C16254a aVar, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(aVar, "$acceptListener");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m29959h(C16265l lVar, Void voidR) {
        C13706o.m87929f(lVar, "$translationReady");
        lVar.invoke(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m29960i(C16265l lVar, Exception exc) {
        C13706o.m87929f(lVar, "$translationReady");
        C13706o.m87929f(exc, "e");
        C17105a.m100581c("Failed to download translation model: " + exc, new Object[0]);
        lVar.invoke(Boolean.FALSE);
    }

    /* renamed from: e */
    public final void mo37112e(Activity activity, String str, C16254a<C13339u> aVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(str, "languageName");
        C13706o.m87929f(aVar, "acceptListener");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle((int) C17541R$string.language_model_required);
        C13696i0 i0Var = C13696i0.f61931a;
        String string = activity.getString(C17541R$string.language_model_required_download_for_language_name);
        C13706o.m87928e(string, "activity.getString(com.a…wnload_for_language_name)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        builder.setMessage((CharSequence) format);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C11933a(aVar));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: g */
    public final void mo37113g(String str, C16265l<? super Boolean, C13339u> lVar) {
        C13706o.m87929f(str, "language");
        C13706o.m87929f(lVar, "translationReady");
        TranslatorOptions a = new TranslatorOptions.Builder().mo64645b("en").mo64646c(str).mo64644a();
        this.f17675b = a;
        C13706o.m87926c(a);
        this.f17676c = Translation.m79150a(a);
        DownloadConditions a2 = new DownloadConditions.Builder().mo64524a();
        C13706o.m87928e(a2, "Builder().build()");
        Translator translator = this.f17676c;
        C13706o.m87926c(translator);
        translator.mo64633B1(a2).mo23708i(new C11935c(lVar)).mo23705f(new C11934b(lVar));
    }

    /* renamed from: j */
    public final Object mo37114j(String str, C13635d<? super Boolean> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        RemoteModelManager b = RemoteModelManager.m79019b();
        C13706o.m87928e(b, "getInstance()");
        b.mo64536a(TranslateRemoteModel.class).mo23708i(new C7246a(str, oVar)).mo23705f(new C7249b(oVar));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* renamed from: k */
    public final Object mo37115k(String str, C13635d<? super String> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        if (this.f17676c == null) {
            C17105a.m100581c("Translation failed. The translator is null", new Object[0]);
            oVar.mo74846l(str, C7251c.f17683a);
        }
        Translator d = this.f17676c;
        C13706o.m87926c(d);
        d.mo64635y1(str).mo23708i(new C7252d(oVar)).mo23705f(new C7254e(oVar, str));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }
}
