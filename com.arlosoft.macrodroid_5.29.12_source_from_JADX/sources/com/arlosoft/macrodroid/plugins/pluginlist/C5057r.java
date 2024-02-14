package com.arlosoft.macrodroid.plugins.pluginlist;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.text.util.LinkifyCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.varunest.sparkbutton.SparkButton2;
import java.util.Calendar;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p063b5.C2253f;
import p083e4.C7271c;
import p297ja.C13332o;
import p297ja.C13339u;
import p346o8.C15819a;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.r */
/* compiled from: PluginListAdapter.kt */
public final class C5057r extends RecyclerView.ViewHolder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final View f12665a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5048q f12666b;

    /* renamed from: c */
    private final C5331h f12667c;

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.r$a */
    /* compiled from: PluginListAdapter.kt */
    static final class C5058a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ PluginDetail $pluginDetail;
        int label;
        final /* synthetic */ C5057r this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5058a(C5057r rVar, PluginDetail pluginDetail, C13635d<? super C5058a> dVar) {
            super(3, dVar);
            this.this$0 = rVar;
            this.$pluginDetail = pluginDetail;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5058a(this.this$0, this.$pluginDetail, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f12666b.mo29921r(this.$pluginDetail);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.r$b */
    /* compiled from: PluginListAdapter.kt */
    static final class C5059b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ PluginDetail $pluginDetail;
        int label;
        final /* synthetic */ C5057r this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5059b(C5057r rVar, PluginDetail pluginDetail, C13635d<? super C5059b> dVar) {
            super(3, dVar);
            this.this$0 = rVar;
            this.$pluginDetail = pluginDetail;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5059b(this.this$0, this.$pluginDetail, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f12666b.mo29922s(this.$pluginDetail);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.r$c */
    /* compiled from: PluginListAdapter.kt */
    public static final class C5060c implements C15819a {

        /* renamed from: a */
        final /* synthetic */ C5057r f12668a;

        /* renamed from: b */
        final /* synthetic */ PluginDetail f12669b;

        C5060c(C5057r rVar, PluginDetail pluginDetail) {
            this.f12668a = rVar;
            this.f12669b = pluginDetail;
        }

        /* renamed from: a */
        public void mo29733a(ImageView imageView, boolean z) {
            C13706o.m87929f(imageView, "button");
            this.f12668a.f12666b.mo29926z(this.f12669b);
            View t = this.f12668a.f12665a;
            int i = C17532R$id.starRating;
            Object tag = ((TextView) t.findViewById(i)).getTag();
            C13706o.m87927d(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            if (z) {
                int i2 = intValue + 1;
                ((TextView) this.f12668a.f12665a.findViewById(i)).setTag(Integer.valueOf(i2));
                ((TextView) this.f12668a.f12665a.findViewById(i)).setText(String.valueOf(i2));
                return;
            }
            int i3 = intValue - 1;
            ((TextView) this.f12668a.f12665a.findViewById(i)).setTag(Integer.valueOf(i3));
            ((TextView) this.f12668a.f12665a.findViewById(i)).setText(String.valueOf(i3));
        }

        /* renamed from: b */
        public void mo29734b(ImageView imageView, boolean z) {
        }

        /* renamed from: c */
        public void mo29735c(ImageView imageView, boolean z) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5057r(View view, C5048q qVar, C5331h hVar) {
        super(view);
        C13706o.m87929f(view, "view");
        C13706o.m87929f(qVar, "viewModel");
        C13706o.m87929f(hVar, "profileImageProvider");
        this.f12665a = view;
        this.f12666b = qVar;
        this.f12667c = hVar;
    }

    /* renamed from: v */
    public final void mo29928v(PluginDetail pluginDetail) {
        String str;
        C13706o.m87929f(pluginDetail, "pluginDetail");
        ((TextView) this.f12665a.findViewById(C17532R$id.pluginName)).setText(pluginDetail.getName());
        String developerName = pluginDetail.getDeveloperName();
        if (developerName == null || developerName.length() == 0) {
            TextView textView = (TextView) this.f12665a.findViewById(C17532R$id.developerName);
            C13706o.m87928e(textView, "view.developerName");
            textView.setVisibility(8);
        } else {
            View view = this.f12665a;
            int i = C17532R$id.developerName;
            TextView textView2 = (TextView) view.findViewById(i);
            C13706o.m87928e(textView2, "view.developerName");
            textView2.setVisibility(0);
            ((TextView) this.f12665a.findViewById(i)).setText(pluginDetail.getDeveloperName());
        }
        ((TextView) this.f12665a.findViewById(C17532R$id.description)).setText(pluginDetail.getDescription());
        View view2 = this.f12665a;
        int i2 = C17532R$id.link;
        ((TextView) view2.findViewById(i2)).setText(pluginDetail.getDownloadLink());
        LinkifyCompat.addLinks((TextView) this.f12665a.findViewById(i2), 1);
        View view3 = this.f12665a;
        int i3 = C17532R$id.starRating;
        ((TextView) view3.findViewById(i3)).setText(String.valueOf(pluginDetail.getStarCount()));
        ((TextView) this.f12665a.findViewById(C17532R$id.commentCount)).setText(String.valueOf(pluginDetail.getCommentCount()));
        FrameLayout frameLayout = (FrameLayout) this.f12665a.findViewById(C17532R$id.commentsButton);
        C13706o.m87928e(frameLayout, "view.commentsButton");
        C4666m.m18147o(frameLayout, (C13640g) null, new C5058a(this, pluginDetail, (C13635d<? super C5058a>) null), 1, (Object) null);
        ((TextView) this.f12665a.findViewById(C17532R$id.usernameEdit)).setText(pluginDetail.getUsername());
        ((TextView) this.f12665a.findViewById(C17532R$id.timeLabel)).setText(String.valueOf(DateUtils.getRelativeTimeSpanString(pluginDetail.getTimestamp(), Calendar.getInstance().getTimeInMillis(), 60000)));
        C5331h hVar = this.f12667c;
        AvatarView avatarView = (AvatarView) this.f12665a.findViewById(C17532R$id.avatarImage);
        C13706o.m87928e(avatarView, "view.avatarImage");
        hVar.mo30528b(avatarView, pluginDetail.getUserImage(), pluginDetail.getUsername());
        ImageView imageView = (ImageView) this.f12665a.findViewById(C17532R$id.overflowButton);
        C13706o.m87928e(imageView, "view.overflowButton");
        C4666m.m18147o(imageView, (C13640g) null, new C5059b(this, pluginDetail, (C13635d<? super C5059b>) null), 1, (Object) null);
        if (C15177w.m93663N(pluginDetail.getIconUrl(), "/", false, 2, (Object) null)) {
            str = pluginDetail.getIconUrl();
        } else {
            str = "https://backend.macrodroid.com/profilepics/" + pluginDetail.getIconUrl();
        }
        C7271c.m30017t(this.f12665a.getContext()).mo37190t(str).mo24491a(new C2253f().mo24503h()).mo37169G0((ImageView) this.f12665a.findViewById(C17532R$id.pluginIcon));
        ((TextView) this.f12665a.findViewById(i3)).setTag(Integer.valueOf(pluginDetail.getStarCount()));
        View view4 = this.f12665a;
        int i4 = C17532R$id.starIcon;
        ((SparkButton2) view4.findViewById(i4)).setChecked(pluginDetail.getStarred());
        SparkButton2 sparkButton2 = (SparkButton2) this.f12665a.findViewById(i4);
        C13706o.m87928e(sparkButton2, "view.starIcon");
        C4666m.m18139g(sparkButton2, this.itemView.getContext().getResources().getDimensionPixelOffset(C17529R$dimen.margin_small));
        ((SparkButton2) this.f12665a.findViewById(i4)).setEventListener(new C5060c(this, pluginDetail));
    }
}
