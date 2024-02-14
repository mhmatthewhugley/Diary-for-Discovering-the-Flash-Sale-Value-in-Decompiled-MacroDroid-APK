package com.arlosoft.macrodroid.templatestore.p071ui.templateList;

import android.content.res.ColorStateList;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.text.util.LinkifyCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.p071ui.C5276c;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.varunest.sparkbutton.SparkButton2;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15516s2;
import kotlinx.coroutines.C15561w1;
import p058a3.C2227a;
import p078d3.C7245d;
import p297ja.C13332o;
import p297ja.C13339u;
import p346o8.C15819a;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h */
/* compiled from: TemplateItemViewHolder.kt */
public final class C5418h extends RecyclerView.ViewHolder {

    /* renamed from: o */
    public static final C5419a f13312o = new C5419a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5276c f13313a;

    /* renamed from: b */
    private final C5331h f13314b;

    /* renamed from: c */
    private final C5527g f13315c;

    /* renamed from: d */
    private final C2227a f13316d;

    /* renamed from: e */
    private final boolean f13317e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<MacroTemplate> f13318f;

    /* renamed from: g */
    private final boolean f13319g;

    /* renamed from: h */
    private final boolean f13320h;

    /* renamed from: i */
    private final C7245d f13321i;

    /* renamed from: j */
    private final String f13322j;

    /* renamed from: k */
    private final String f13323k;

    /* renamed from: l */
    private final String f13324l;

    /* renamed from: m */
    private final String f13325m;

    /* renamed from: n */
    private C15478k0 f13326n;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$a */
    /* compiled from: TemplateItemViewHolder.kt */
    public static final class C5419a {
        private C5419a() {
        }

        public /* synthetic */ C5419a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$b */
    /* compiled from: TemplateItemViewHolder.kt */
    static final class C5420b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $item;
        final /* synthetic */ C13684d0<String> $translatedName;
        final /* synthetic */ C7245d $translator;
        Object L$0;
        int label;
        final /* synthetic */ C5418h this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$b$a */
        /* compiled from: TemplateItemViewHolder.kt */
        static final class C5421a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C13684d0<String> $translatedName;
            int label;
            final /* synthetic */ C5418h this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5421a(C5418h hVar, C13684d0<String> d0Var, C13635d<? super C5421a> dVar) {
                super(2, dVar);
                this.this$0 = hVar;
                this.$translatedName = d0Var;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5421a(this.this$0, this.$translatedName, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5421a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    ((TextView) this.this$0.itemView.findViewById(C17532R$id.name)).setText((CharSequence) this.$translatedName.element);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5420b(C13684d0<String> d0Var, C7245d dVar, MacroTemplate macroTemplate, C5418h hVar, C13635d<? super C5420b> dVar2) {
            super(2, dVar2);
            this.$translatedName = d0Var;
            this.$translator = dVar;
            this.$item = macroTemplate;
            this.this$0 = hVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5420b(this.$translatedName, this.$translator, this.$item, this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5420b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(T t) {
            C13684d0<String> d0Var;
            T c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(t);
                d0Var = this.$translatedName;
                C7245d dVar = this.$translator;
                String nameTranslated = this.$item.getNameTranslated();
                if (nameTranslated == null) {
                    nameTranslated = this.$item.getName();
                }
                this.L$0 = d0Var;
                this.label = 1;
                t = dVar.mo37115k(nameTranslated, this);
                if (t == c) {
                    return c;
                }
            } else if (i == 1) {
                d0Var = (C13684d0) this.L$0;
                C13332o.m85685b(t);
            } else if (i == 2) {
                C13332o.m85685b(t);
                ((TextView) this.this$0.itemView.findViewById(C17532R$id.name)).setAlpha(1.0f);
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var.element = t;
            C15423h2 c2 = C15186a1.m93731c();
            C5421a aVar = new C5421a(this.this$0, this.$translatedName, (C13635d<? super C5421a>) null);
            this.L$0 = null;
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            ((TextView) this.this$0.itemView.findViewById(C17532R$id.name)).setAlpha(1.0f);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$c */
    /* compiled from: TemplateItemViewHolder.kt */
    static final class C5422c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $item;
        final /* synthetic */ C13684d0<String> $translatedDescription;
        final /* synthetic */ C7245d $translator;
        Object L$0;
        int label;
        final /* synthetic */ C5418h this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$c$a */
        /* compiled from: TemplateItemViewHolder.kt */
        static final class C5423a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C13684d0<String> $translatedDescription;
            int label;
            final /* synthetic */ C5418h this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5423a(C5418h hVar, C13684d0<String> d0Var, C13635d<? super C5423a> dVar) {
                super(2, dVar);
                this.this$0 = hVar;
                this.$translatedDescription = d0Var;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5423a(this.this$0, this.$translatedDescription, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5423a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    ((TextView) this.this$0.itemView.findViewById(C17532R$id.description)).setText((CharSequence) this.$translatedDescription.element);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5422c(C13684d0<String> d0Var, C7245d dVar, MacroTemplate macroTemplate, C5418h hVar, C13635d<? super C5422c> dVar2) {
            super(2, dVar2);
            this.$translatedDescription = d0Var;
            this.$translator = dVar;
            this.$item = macroTemplate;
            this.this$0 = hVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5422c(this.$translatedDescription, this.$translator, this.$item, this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5422c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(T t) {
            C13684d0<String> d0Var;
            T c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(t);
                d0Var = this.$translatedDescription;
                C7245d dVar = this.$translator;
                String descriptionTranslated = this.$item.getDescriptionTranslated();
                if (descriptionTranslated == null) {
                    descriptionTranslated = this.$item.getDescription();
                }
                this.L$0 = d0Var;
                this.label = 1;
                t = dVar.mo37115k(descriptionTranslated, this);
                if (t == c) {
                    return c;
                }
            } else if (i == 1) {
                d0Var = (C13684d0) this.L$0;
                C13332o.m85685b(t);
            } else if (i == 2) {
                C13332o.m85685b(t);
                ((TextView) this.this$0.itemView.findViewById(C17532R$id.description)).setAlpha(1.0f);
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var.element = t;
            C15423h2 c2 = C15186a1.m93731c();
            C5423a aVar = new C5423a(this.this$0, this.$translatedDescription, (C13635d<? super C5423a>) null);
            this.L$0 = null;
            this.label = 2;
            if (C15414h.m94298g(c2, aVar, this) == c) {
                return c;
            }
            ((TextView) this.this$0.itemView.findViewById(C17532R$id.description)).setAlpha(1.0f);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$d */
    /* compiled from: TemplateItemViewHolder.kt */
    static final class C5424d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $item;
        int label;
        final /* synthetic */ C5418h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5424d(C5418h hVar, MacroTemplate macroTemplate, C13635d<? super C5424d> dVar) {
            super(3, dVar);
            this.this$0 = hVar;
            this.$item = macroTemplate;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m20901r(C5418h hVar, MacroTemplate macroTemplate) {
            hVar.f13318f.add(macroTemplate);
            View view = hVar.itemView;
            int i = C17532R$id.expandAndMenuButton;
            ((ImageView) view.findViewById(i)).setImageResource(C17530R$drawable.ic_more_vert_white_24dp);
            ((ImageView) hVar.itemView.findViewById(i)).animate().alpha(1.0f).setDuration(200);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                View view = this.this$0.itemView;
                int i = C17532R$id.macroConfigContainer;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                C13706o.m87928e(linearLayout, "itemView.macroConfigContainer");
                if (linearLayout.getVisibility() == 0) {
                    this.this$0.f13313a.mo30436d(this.$item);
                } else {
                    this.this$0.m20887D(this.$item);
                    LinearLayout linearLayout2 = (LinearLayout) this.this$0.itemView.findViewById(i);
                    C13706o.m87928e(linearLayout2, "itemView.macroConfigContainer");
                    linearLayout2.setVisibility(0);
                    ((ImageView) this.this$0.itemView.findViewById(C17532R$id.expandAndMenuButton)).animate().alpha(0.3f).setDuration(200).withEndAction(new C5430i(this.this$0, this.$item));
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5424d(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$e */
    /* compiled from: TemplateItemViewHolder.kt */
    static final class C5425e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $item;
        final /* synthetic */ C13684d0<String> $translatedDescription;
        final /* synthetic */ C13684d0<String> $translatedName;
        int label;
        final /* synthetic */ C5418h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5425e(C5418h hVar, MacroTemplate macroTemplate, C13684d0<String> d0Var, C13684d0<String> d0Var2, C13635d<? super C5425e> dVar) {
            super(3, dVar);
            this.this$0 = hVar;
            this.$item = macroTemplate;
            this.$translatedName = d0Var;
            this.$translatedDescription = d0Var2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5425e(this.this$0, this.$item, this.$translatedName, this.$translatedDescription, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C5276c y = this.this$0.f13313a;
                MacroTemplate macroTemplate = this.$item;
                String str = (String) this.$translatedName.element;
                if (str == null) {
                    str = macroTemplate.getName();
                }
                String str2 = (String) this.$translatedDescription.element;
                if (str2 == null) {
                    str2 = this.$item.getDescription();
                }
                y.mo30439h(MacroTemplate.copy$default(macroTemplate, str, (String) null, (String) null, str2, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, 0, 0, 0, 0, 0, false, (Macro) null, false, false, 0, 0, 4194294, (Object) null));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$f */
    /* compiled from: TemplateItemViewHolder.kt */
    static final class C5426f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $item;
        final /* synthetic */ C13684d0<String> $translatedDescription;
        final /* synthetic */ C13684d0<String> $translatedName;
        int label;
        final /* synthetic */ C5418h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5426f(C5418h hVar, MacroTemplate macroTemplate, C13684d0<String> d0Var, C13684d0<String> d0Var2, C13635d<? super C5426f> dVar) {
            super(3, dVar);
            this.this$0 = hVar;
            this.$item = macroTemplate;
            this.$translatedName = d0Var;
            this.$translatedDescription = d0Var2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5426f(this.this$0, this.$item, this.$translatedName, this.$translatedDescription, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C5276c y = this.this$0.f13313a;
                MacroTemplate macroTemplate = this.$item;
                String str = (String) this.$translatedName.element;
                if (str == null) {
                    str = macroTemplate.getName();
                }
                String str2 = (String) this.$translatedDescription.element;
                if (str2 == null) {
                    str2 = this.$item.getDescription();
                }
                y.mo30439h(MacroTemplate.copy$default(macroTemplate, str, (String) null, (String) null, str2, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, 0, 0, 0, 0, 0, false, (Macro) null, false, false, 0, 0, 4194294, (Object) null));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$g */
    /* compiled from: TemplateItemViewHolder.kt */
    static final class C5427g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $item;
        int label;
        final /* synthetic */ C5418h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5427g(C5418h hVar, MacroTemplate macroTemplate, C13635d<? super C5427g> dVar) {
            super(3, dVar);
            this.this$0 = hVar;
            this.$item = macroTemplate;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5427g(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f13313a.mo30435c(this.$item);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$h */
    /* compiled from: TemplateItemViewHolder.kt */
    static final class C5428h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $item;
        int label;
        final /* synthetic */ C5418h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5428h(C5418h hVar, MacroTemplate macroTemplate, C13635d<? super C5428h> dVar) {
            super(3, dVar);
            this.this$0 = hVar;
            this.$item = macroTemplate;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5428h(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f13313a.mo30440i(this.$item);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.h$i */
    /* compiled from: TemplateItemViewHolder.kt */
    public static final class C5429i implements C15819a {

        /* renamed from: a */
        final /* synthetic */ C5418h f13327a;

        /* renamed from: b */
        final /* synthetic */ MacroTemplate f13328b;

        C5429i(C5418h hVar, MacroTemplate macroTemplate) {
            this.f13327a = hVar;
            this.f13328b = macroTemplate;
        }

        /* renamed from: a */
        public void mo29733a(ImageView imageView, boolean z) {
            C13706o.m87929f(imageView, "button");
            this.f13327a.f13313a.mo30438f(this.f13328b);
            View view = this.f13327a.itemView;
            int i = C17532R$id.starRating;
            Object tag = ((TextView) view.findViewById(i)).getTag();
            C13706o.m87927d(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            if (z) {
                int i2 = intValue + 1;
                ((TextView) this.f13327a.itemView.findViewById(i)).setTag(Integer.valueOf(i2));
                ((TextView) this.f13327a.itemView.findViewById(i)).setText(String.valueOf(i2));
                return;
            }
            int i3 = intValue - 1;
            ((TextView) this.f13327a.itemView.findViewById(i)).setTag(Integer.valueOf(i3));
            ((TextView) this.f13327a.itemView.findViewById(i)).setText(String.valueOf(i3));
        }

        /* renamed from: b */
        public void mo29734b(ImageView imageView, boolean z) {
        }

        /* renamed from: c */
        public void mo29735c(ImageView imageView, boolean z) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5418h(View view, C5276c cVar, C5331h hVar, C5527g gVar, C2227a aVar, boolean z, List<MacroTemplate> list, boolean z2, boolean z3, C7245d dVar) {
        super(view);
        String str;
        C13706o.m87929f(view, "itemView");
        C13706o.m87929f(cVar, "presenter");
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(aVar, "flagProvider");
        C13706o.m87929f(list, "listOfExpanded");
        this.f13313a = cVar;
        this.f13314b = hVar;
        this.f13315c = gVar;
        this.f13316d = aVar;
        this.f13317e = z;
        this.f13318f = list;
        this.f13319g = z2;
        this.f13320h = z3;
        this.f13321i = dVar;
        String string = view.getContext().getString(C17541R$string.triggers);
        C13706o.m87928e(string, "itemView.context.getString(R.string.triggers)");
        boolean z4 = true;
        String substring = string.substring(0, 1);
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        this.f13322j = substring;
        String string2 = view.getContext().getString(C17541R$string.actions);
        C13706o.m87928e(string2, "itemView.context.getString(R.string.actions)");
        String substring2 = string2.substring(0, 1);
        C13706o.m87928e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        this.f13323k = substring2;
        String string3 = view.getContext().getString(C17541R$string.constraints);
        C13706o.m87928e(string3, "itemView.context.getString(R.string.constraints)");
        String substring3 = string3.substring(0, 1);
        C13706o.m87928e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        this.f13324l = substring3;
        String language = C5163j2.m19963F0(view.getContext()).getLanguage();
        if (!(language == null || language.length() == 0)) {
            z4 = false;
        }
        if (!z4) {
            String language2 = C5163j2.m19963F0(view.getContext()).getLanguage();
            C13706o.m87928e(language2, "getLocale(itemView.context).language");
            str = language2.substring(0, 2);
            C13706o.m87928e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "en";
        }
        this.f13325m = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m20884A(C5418h hVar, MacroTemplate macroTemplate, View view) {
        C13706o.m87929f(hVar, "this$0");
        C13706o.m87929f(macroTemplate, "$item");
        C5276c cVar = hVar.f13313a;
        AvatarView avatarView = (AvatarView) hVar.itemView.findViewById(C17532R$id.avatarImage);
        C13706o.m87928e(avatarView, "itemView.avatarImage");
        cVar.mo30437e(macroTemplate, avatarView);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final void m20885B(C5418h hVar, MacroTemplate macroTemplate, View view) {
        C13706o.m87929f(hVar, "this$0");
        C13706o.m87929f(macroTemplate, "$item");
        hVar.f13313a.mo30433a(macroTemplate);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m20886C(C5418h hVar, MacroTemplate macroTemplate, boolean z, View view) {
        C13706o.m87929f(hVar, "this$0");
        C13706o.m87929f(macroTemplate, "$item");
        ProgressBar progressBar = (ProgressBar) hVar.itemView.findViewById(C17532R$id.subscribingProgress);
        C13706o.m87928e(progressBar, "itemView.subscribingProgress");
        progressBar.setVisibility(0);
        hVar.f13313a.mo30434b(macroTemplate, !z);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m20887D(MacroTemplate macroTemplate) {
        Macro macro = macroTemplate.getMacro();
        C13706o.m87926c(macro);
        TextView textView = (TextView) this.itemView.findViewById(C17532R$id.triggers);
        C13706o.m87928e(textView, "itemView.triggers");
        m20890G(macro, textView);
        ((TextView) this.itemView.findViewById(C17532R$id.triggersLabel)).setText(this.f13322j + " -");
        Macro macro2 = macroTemplate.getMacro();
        C13706o.m87926c(macro2);
        TextView textView2 = (TextView) this.itemView.findViewById(C17532R$id.actions);
        C13706o.m87928e(textView2, "itemView.actions");
        m20888E(macro2, textView2);
        ((TextView) this.itemView.findViewById(C17532R$id.actionsLabel)).setText(this.f13323k + " -");
        Macro macro3 = macroTemplate.getMacro();
        C13706o.m87926c(macro3);
        TextView textView3 = (TextView) this.itemView.findViewById(C17532R$id.constraints);
        C13706o.m87928e(textView3, "itemView.constraints");
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(C17532R$id.constraintsContainer);
        C13706o.m87928e(linearLayout, "itemView.constraintsContainer");
        m20889F(macro3, textView3, linearLayout);
        ((TextView) this.itemView.findViewById(C17532R$id.constraintsLabel)).setText(this.f13324l + " -");
        ((TextView) this.itemView.findViewById(C17532R$id.description)).setMaxLines(12);
    }

    /* renamed from: E */
    private final void m20888E(Macro macro, TextView textView) {
        String str = "";
        for (int i = 0; i < 8; i++) {
            if (macro.getActions().size() > i) {
                Action action = macro.getActions().get(i);
                try {
                    str = str + action.mo27854m1();
                    if (i < macro.getActions().size() - 1 && i < 7) {
                        str = str + ", ";
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.m6487a().mo22936d(e);
                }
            }
        }
        textView.setText(C6413o0.m24692a(str));
    }

    /* renamed from: F */
    private final void m20889F(Macro macro, TextView textView, ViewGroup viewGroup) {
        boolean z = true;
        int i = 8;
        String str = "";
        if (macro.getConstraints().size() > 0) {
            viewGroup.setVisibility(0);
            for (int i2 = 0; i2 < 8; i2++) {
                if (macro.getConstraints().size() > i2) {
                    Constraint constraint = macro.getConstraints().get(i2);
                    try {
                        str = str + constraint.mo27854m1();
                        if (i2 < macro.getConstraints().size() - 1 && i2 < 7) {
                            str = str + ", ";
                        }
                    } catch (Exception e) {
                        FirebaseCrashlytics.m6487a().mo22936d(e);
                    }
                }
            }
        } else {
            viewGroup.setVisibility(8);
        }
        textView.setText(C6413o0.m24692a(str));
        View findViewById = this.itemView.findViewById(C17532R$id.constraintsDivider);
        C13706o.m87928e(findViewById, "itemView.constraintsDivider");
        if (macro.getConstraints().size() <= 0) {
            z = false;
        }
        if (z) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }

    /* renamed from: G */
    private final void m20890G(Macro macro, TextView textView) {
        String str = "";
        for (int i = 0; i < 8; i++) {
            if (macro.getTriggerList().size() > i) {
                Trigger trigger = macro.getTriggerList().get(i);
                try {
                    str = str + trigger.mo27854m1();
                    if (i < macro.getTriggerList().size() - 1 && i < 7) {
                        str = str + ", ";
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.m6487a().mo22936d(e);
                }
            }
        }
        textView.setText(C6413o0.m24692a(str));
    }

    /* renamed from: H */
    private final String m20891H(int i) {
        return i < 100 ? String.valueOf(i) : "99+";
    }

    /* renamed from: I */
    private final String m20892I(int i) {
        return String.valueOf(i);
    }

    /* renamed from: z */
    public final void mo30621z(MacroTemplate macroTemplate, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        C7245d dVar;
        C7245d dVar2;
        float f;
        MacroTemplate macroTemplate2 = macroTemplate;
        boolean z4 = z2;
        C13706o.m87929f(macroTemplate2, "item");
        C13684d0 d0Var = new C13684d0();
        C13684d0 d0Var2 = new C13684d0();
        C15478k0 k0Var = this.f13326n;
        boolean z5 = true;
        if (k0Var != null) {
            C15482l0.m94504c(k0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f13326n = C15482l0.m94502a(C15186a1.m93730b().plus(C15516s2.m94604b((C15561w1) null, 1, (Object) null)));
        if (!this.f13320h || macroTemplate.getFlagCount() != 0) {
            ((CardView) this.itemView.findViewById(C17532R$id.cardView)).getLayoutParams().height = -2;
            ImageView imageView = (ImageView) this.itemView.findViewById(C17532R$id.userSubscriptionIndicator);
            C13706o.m87928e(imageView, "itemView.userSubscriptionIndicator");
            imageView.setVisibility(z3 ? 0 : 8);
            View view = this.itemView;
            int i3 = C17532R$id.name;
            TextView textView = (TextView) view.findViewById(i3);
            if (macroTemplate.getUseTranslatedText()) {
                if (macroTemplate.getNameTranslated() == null) {
                    macroTemplate.getName();
                }
                str = macroTemplate.getNameTranslated();
                if (str == null) {
                    str = macroTemplate.getName();
                }
            } else {
                str = macroTemplate.getName();
            }
            textView.setText(str);
            View view2 = this.itemView;
            int i4 = C17532R$id.description;
            TextView textView2 = (TextView) view2.findViewById(i4);
            if (macroTemplate.getUseTranslatedText()) {
                str2 = macroTemplate.getDescriptionTranslated();
            } else {
                str2 = macroTemplate.getDescription();
            }
            textView2.setText(str2);
            ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(C17532R$id.subscribingProgress);
            C13706o.m87928e(progressBar, "itemView.subscribingProgress");
            progressBar.setVisibility(8);
            View view3 = this.itemView;
            int i5 = C17532R$id.subscribeButton;
            ImageView imageView2 = (ImageView) view3.findViewById(i5);
            C13706o.m87928e(imageView2, "itemView.subscribeButton");
            imageView2.setVisibility(0);
            ((ImageView) this.itemView.findViewById(i5)).setImageResource(z4 ? C17530R$drawable.ic_bell_ring_white_24dp : C17530R$drawable.ic_bell);
            ImageViewCompat.setImageTintList((ImageView) this.itemView.findViewById(i5), ColorStateList.valueOf(ContextCompat.getColor(this.itemView.getContext(), z4 ? C17528R$color.subscribed_indicator_color : 2131101114)));
            if (!macroTemplate.getUseTranslatedText() || (dVar = this.f13321i) == null) {
                i = i5;
                i2 = i4;
            } else {
                ((TextView) this.itemView.findViewById(i3)).setAlpha(0.5f);
                C15478k0 k0Var2 = this.f13326n;
                if (k0Var2 != null) {
                    f = 0.5f;
                    dVar2 = dVar;
                    i = i5;
                    i2 = i4;
                    C15561w1 unused = C15473j.m94492d(k0Var2, (C13640g) null, (C15486m0) null, new C5420b(d0Var, dVar, macroTemplate, this, (C13635d<? super C5420b>) null), 3, (Object) null);
                } else {
                    dVar2 = dVar;
                    i = i5;
                    i2 = i4;
                    f = 0.5f;
                }
                ((TextView) this.itemView.findViewById(i2)).setAlpha(f);
                C15478k0 k0Var3 = this.f13326n;
                if (k0Var3 != null) {
                    C15561w1 unused2 = C15473j.m94492d(k0Var3, (C13640g) null, (C15486m0) null, new C5422c(d0Var2, dVar2, macroTemplate, this, (C13635d<? super C5422c>) null), 3, (Object) null);
                }
            }
            LinkifyCompat.addLinks((TextView) this.itemView.findViewById(i2), 1);
            TextView textView3 = (TextView) this.itemView.findViewById(i2);
            C13706o.m87928e(textView3, "itemView.description");
            MacroTemplate macroTemplate3 = macroTemplate;
            C13684d0 d0Var3 = d0Var;
            C13684d0 d0Var4 = d0Var2;
            int i6 = i2;
            C5425e eVar = r0;
            C5425e eVar2 = new C5425e(this, macroTemplate3, d0Var3, d0Var4, (C13635d<? super C5425e>) null);
            C4666m.m18147o(textView3, (C13640g) null, eVar, 1, (Object) null);
            ((TextView) this.itemView.findViewById(C17532R$id.usernameEdit)).setText(macroTemplate.getUsername());
            ((FrameLayout) this.itemView.findViewById(C17532R$id.userContainer)).setOnClickListener(new C5415e(this, macroTemplate2));
            ((FrameLayout) this.itemView.findViewById(C17532R$id.commentsButton)).setOnClickListener(new C5416f(this, macroTemplate2));
            ((ImageView) this.itemView.findViewById(i)).setOnClickListener(new C5417g(this, macroTemplate2, z4));
            View view4 = this.itemView;
            C13706o.m87928e(view4, "itemView");
            C4666m.m18147o(view4, (C13640g) null, new C5426f(this, macroTemplate3, d0Var3, d0Var4, (C13635d<? super C5426f>) null), 1, (Object) null);
            ((TextView) this.itemView.findViewById(C17532R$id.commentCount)).setText(m20891H(macroTemplate.getCommentCount()));
            View view5 = this.itemView;
            int i7 = C17532R$id.starRating;
            ((TextView) view5.findViewById(i7)).setText(m20892I(macroTemplate.getStarCount()));
            ((TextView) this.itemView.findViewById(i7)).setTag(Integer.valueOf(macroTemplate.getStarCount()));
            View view6 = this.itemView;
            int i8 = C17532R$id.flagIcon;
            ((ImageView) view6.findViewById(i8)).setAlpha(macroTemplate.getUseTranslatedText() ? 0.3f : 1.0f);
            if (!this.f13319g || macroTemplate.getFlagCount() <= 0) {
                FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(C17532R$id.reportsPanel);
                C13706o.m87928e(frameLayout, "itemView.reportsPanel");
                frameLayout.setVisibility(8);
            } else {
                ((TextView) this.itemView.findViewById(C17532R$id.reportCount)).setText(String.valueOf(macroTemplate.getFlagCount()));
                View view7 = this.itemView;
                int i9 = C17532R$id.reportsPanel;
                FrameLayout frameLayout2 = (FrameLayout) view7.findViewById(i9);
                C13706o.m87928e(frameLayout2, "itemView.reportsPanel");
                frameLayout2.setVisibility(0);
                FrameLayout frameLayout3 = (FrameLayout) this.itemView.findViewById(i9);
                C13706o.m87928e(frameLayout3, "itemView.reportsPanel");
                C4666m.m18147o(frameLayout3, (C13640g) null, new C5427g(this, macroTemplate2, (C13635d<? super C5427g>) null), 1, (Object) null);
            }
            String substring = macroTemplate.getLanguage().substring(0, 2);
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            boolean z6 = !C13706o.m87924a(substring, this.f13325m) && !C13706o.m87924a(macroTemplate.getLanguage(), macroTemplate.getTranslationLanguage());
            ImageView imageView3 = (ImageView) this.itemView.findViewById(i8);
            C13706o.m87928e(imageView3, "itemView.flagIcon");
            imageView3.setVisibility(z6 ? 0 : 8);
            ((ImageView) this.itemView.findViewById(i8)).setImageResource(this.f13316d.mo24444a(macroTemplate.getLanguage()));
            ImageView imageView4 = (ImageView) this.itemView.findViewById(i8);
            C13706o.m87928e(imageView4, "itemView.flagIcon");
            C4666m.m18147o(imageView4, (C13640g) null, new C5428h(this, macroTemplate2, (C13635d<? super C5428h>) null), 1, (Object) null);
            ImageView imageView5 = (ImageView) this.itemView.findViewById(i8);
            C13706o.m87928e(imageView5, "itemView.flagIcon");
            C4666m.m18139g(imageView5, this.itemView.getContext().getResources().getDimensionPixelOffset(C17529R$dimen.margin_small));
            if (macroTemplate.getUpdated() > 0) {
                C13696i0 i0Var = C13696i0.f61931a;
                String string = this.itemView.getContext().getString(C17541R$string.updated_timestamp);
                C13706o.m87928e(string, "itemView.context.getStri…string.updated_timestamp)");
                String format = String.format(string, Arrays.copyOf(new Object[]{DateUtils.getRelativeTimeSpanString(macroTemplate.getUpdated(), Calendar.getInstance().getTimeInMillis(), 60000)}, 1));
                C13706o.m87928e(format, "format(format, *args)");
                str3 = ' ' + format;
            } else {
                str3 = "";
            }
            ((TextView) this.itemView.findViewById(C17532R$id.timeLabel)).setText(DateUtils.getRelativeTimeSpanString(macroTemplate.getTimestamp(), Calendar.getInstance().getTimeInMillis(), 60000) + str3);
            View view8 = this.itemView;
            int i10 = C17532R$id.starIcon;
            ((SparkButton2) view8.findViewById(i10)).setChecked(macroTemplate.getStarred());
            SparkButton2 sparkButton2 = (SparkButton2) this.itemView.findViewById(i10);
            C13706o.m87928e(sparkButton2, "itemView.starIcon");
            C4666m.m18139g(sparkButton2, this.itemView.getContext().getResources().getDimensionPixelOffset(C17529R$dimen.margin_small));
            ((SparkButton2) this.itemView.findViewById(i10)).setEventListener(new C5429i(this, macroTemplate2));
            View view9 = this.itemView;
            C13706o.m87928e(view9, "itemView");
            view9.setVisibility(macroTemplate.getDeleted() ^ true ? 0 : 8);
            if (macroTemplate.getDeleted()) {
                this.itemView.getLayoutParams().width = 0;
                this.itemView.getLayoutParams().height = 0;
            } else {
                this.itemView.getLayoutParams().width = -1;
                this.itemView.getLayoutParams().height = -2;
            }
            C5331h hVar = this.f13314b;
            AvatarView avatarView = (AvatarView) this.itemView.findViewById(C17532R$id.avatarImage);
            C13706o.m87926c(avatarView);
            hVar.mo30528b(avatarView, macroTemplate.getUserImage(), macroTemplate.getUsername());
            View view10 = this.itemView;
            int i11 = C17532R$id.expandAndMenuButton;
            ImageView imageView6 = (ImageView) view10.findViewById(i11);
            C13706o.m87928e(imageView6, "itemView.expandAndMenuButton");
            C4666m.m18147o(imageView6, (C13640g) null, new C5424d(this, macroTemplate2, (C13635d<? super C5424d>) null), 1, (Object) null);
            if (!this.f13317e || this.f13318f.contains(macroTemplate2)) {
                LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(C17532R$id.macroConfigContainer);
                C13706o.m87928e(linearLayout, "itemView.macroConfigContainer");
                linearLayout.setVisibility(0);
                ((ImageView) this.itemView.findViewById(i11)).setImageResource(C17530R$drawable.ic_more_vert_white_24dp);
                m20887D(macroTemplate);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(C17532R$id.macroConfigContainer);
                C13706o.m87928e(linearLayout2, "itemView.macroConfigContainer");
                linearLayout2.setVisibility(8);
                ((ImageView) this.itemView.findViewById(i11)).setImageResource(C17530R$drawable.ic_arrow_down);
                ((TextView) this.itemView.findViewById(i6)).setMaxLines(4);
            }
            TextView textView4 = (TextView) this.itemView.findViewById(C17532R$id.rootOnlyLabel);
            C13706o.m87928e(textView4, "itemView.rootOnlyLabel");
            Macro macro = macroTemplate.getMacro();
            if (macro == null || !macro.isRootOnlyWithNoAdbHack()) {
                z5 = false;
            }
            textView4.setVisibility(z5 ? 0 : 8);
            return;
        }
        ((CardView) this.itemView.findViewById(C17532R$id.cardView)).getLayoutParams().height = 0;
    }
}
