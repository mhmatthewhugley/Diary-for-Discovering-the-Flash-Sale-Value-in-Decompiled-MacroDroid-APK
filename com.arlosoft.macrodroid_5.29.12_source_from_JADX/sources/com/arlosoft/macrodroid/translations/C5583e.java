package com.arlosoft.macrodroid.translations;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.translations.data.Translation;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p038md.C2034f;
import p058a3.C2227a;
import p139o1.C8024r0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.translations.e */
/* compiled from: TranslationsAdapter.kt */
public final class C5583e extends RecyclerView.Adapter<C5584a> {

    /* renamed from: a */
    private final List<Translation> f13555a;

    /* renamed from: b */
    private final C2227a f13556b;

    /* renamed from: c */
    private final C5573a f13557c;

    /* renamed from: com.arlosoft.macrodroid.translations.e$a */
    /* compiled from: TranslationsAdapter.kt */
    public static final class C5584a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8024r0 f13558a;

        /* renamed from: b */
        private final C2227a f13559b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C5573a f13560c;

        /* renamed from: com.arlosoft.macrodroid.translations.e$a$a */
        /* compiled from: TranslationsAdapter.kt */
        static final class C5585a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            final /* synthetic */ Translation $translation;
            int label;
            final /* synthetic */ C5584a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5585a(C5584a aVar, Translation translation, C13635d<? super C5585a> dVar) {
                super(3, dVar);
                this.this$0 = aVar;
                this.$translation = translation;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C5585a(this.this$0, this.$translation, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f13560c.mo30844c(this.$translation.getLanguageCode());
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5584a(C8024r0 r0Var, C2227a aVar, C5573a aVar2) {
            super(r0Var.getRoot());
            C13706o.m87929f(r0Var, "binding");
            C13706o.m87929f(aVar, "flagProvider");
            C13706o.m87929f(aVar2, "languageClickedListener");
            this.f13558a = r0Var;
            this.f13559b = aVar;
            this.f13560c = aVar2;
        }

        /* renamed from: u */
        public final void mo30880u(Translation translation) {
            C13706o.m87929f(translation, "translation");
            ConstraintLayout constraintLayout = this.f13558a.f19429d;
            C13706o.m87928e(constraintLayout, "binding.languageContainer");
            C4666m.m18147o(constraintLayout, (C13640g) null, new C5585a(this, translation, (C13635d<? super C5585a>) null), 1, (Object) null);
            this.f13558a.f19428c.setImageResource(this.f13559b.mo24444a(translation.getLanguageCode()));
            this.f13558a.f19430e.setText(translation.getEnglishName());
            this.f13558a.f19431f.setText(translation.getLocalName());
            if (C13706o.m87924a(translation.getTranslationProgress(), "100.0%")) {
                this.f13558a.f19432g.setText("100%");
                TextView textView = this.f13558a.f19432g;
                C13706o.m87928e(textView, "binding.percentComplete");
                C2034f.m8419a(textView, ContextCompat.getColor(this.f13558a.getRoot().getContext(), C17528R$color.translation_complete));
                return;
            }
            this.f13558a.f19432g.setText(translation.getTranslationProgress());
            TextView textView2 = this.f13558a.f19432g;
            C13706o.m87928e(textView2, "binding.percentComplete");
            C2034f.m8419a(textView2, ContextCompat.getColor(this.f13558a.getRoot().getContext(), C17528R$color.translation_not_complete));
        }
    }

    public C5583e(List<Translation> list, C2227a aVar, C5573a aVar2) {
        C13706o.m87929f(list, "translations");
        C13706o.m87929f(aVar, "flagProvider");
        C13706o.m87929f(aVar2, "languageClickedListener");
        this.f13555a = list;
        this.f13556b = aVar;
        this.f13557c = aVar2;
    }

    /* renamed from: B */
    public void onBindViewHolder(C5584a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo30880u(this.f13555a.get(i));
    }

    /* renamed from: C */
    public C5584a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8024r0 c = C8024r0.m33407c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5584a(c, this.f13556b, this.f13557c);
    }

    public int getItemCount() {
        return this.f13555a.size();
    }
}
