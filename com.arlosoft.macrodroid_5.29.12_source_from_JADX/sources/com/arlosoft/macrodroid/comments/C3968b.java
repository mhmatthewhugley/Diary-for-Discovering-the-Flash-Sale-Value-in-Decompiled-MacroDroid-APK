package com.arlosoft.macrodroid.comments;

import android.text.format.DateUtils;
import android.text.util.Linkify;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.comments.b */
/* compiled from: CommentViewHolder.kt */
public final class C3968b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final CommentableItem f10290a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16265l<Comment, C13339u> f10291b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C16265l<Comment, C13339u> f10292c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16269p<Comment, Boolean, C13339u> f10293d;

    /* renamed from: e */
    private final User f10294e;

    /* renamed from: f */
    private final C5331h f10295f;

    /* renamed from: g */
    private final List<C4391d> f10296g;

    /* renamed from: com.arlosoft.macrodroid.comments.b$a */
    /* compiled from: CommentViewHolder.kt */
    static final class C3969a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ boolean $isBlocked;
        final /* synthetic */ Comment $item;
        int label;
        final /* synthetic */ C3968b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3969a(C3968b bVar, Comment comment, boolean z, C13635d<? super C3969a> dVar) {
            super(3, dVar);
            this.this$0 = bVar;
            this.$item = comment;
            this.$isBlocked = z;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3969a(this.this$0, this.$item, this.$isBlocked, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f10293d.invoke(this.$item, C13654b.m87833a(this.$isBlocked));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.comments.b$b */
    /* compiled from: CommentViewHolder.kt */
    static final class C3970b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ boolean $isBlocked;
        final /* synthetic */ Comment $item;
        int label;
        final /* synthetic */ C3968b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3970b(C3968b bVar, Comment comment, boolean z, C13635d<? super C3970b> dVar) {
            super(3, dVar);
            this.this$0 = bVar;
            this.$item = comment;
            this.$isBlocked = z;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3970b(this.this$0, this.$item, this.$isBlocked, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f10293d.invoke(this.$item, C13654b.m87833a(this.$isBlocked));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.comments.b$c */
    /* compiled from: CommentViewHolder.kt */
    static final class C3971c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Comment $item;
        int label;
        final /* synthetic */ C3968b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3971c(C3968b bVar, Comment comment, C13635d<? super C3971c> dVar) {
            super(3, dVar);
            this.this$0 = bVar;
            this.$item = comment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3971c(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f10292c.invoke(this.$item);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.comments.b$d */
    /* compiled from: CommentViewHolder.kt */
    static final class C3972d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C3968b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3972d(C3968b bVar, C13635d<? super C3972d> dVar) {
            super(3, dVar);
            this.this$0 = bVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3972d(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                LinearLayout linearLayout = (LinearLayout) this.this$0.itemView.findViewById(C17532R$id.expandContainer);
                C13706o.m87928e(linearLayout, "itemView.expandContainer");
                linearLayout.setVisibility(8);
                ((TextView) this.this$0.itemView.findViewById(C17532R$id.text)).setMaxLines(100);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.comments.b$e */
    /* compiled from: CommentViewHolder.kt */
    static final class C3973e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Comment $item;
        int label;
        final /* synthetic */ C3968b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3973e(C3968b bVar, Comment comment, C13635d<? super C3973e> dVar) {
            super(3, dVar);
            this.this$0 = bVar;
            this.$item = comment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3973e(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f10291b.invoke(this.$item);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.comments.b$f */
    /* compiled from: CommentViewHolder.kt */
    public static final class C3974f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C3968b f10297a;

        /* renamed from: b */
        final /* synthetic */ Comment f10298b;

        /* renamed from: c */
        final /* synthetic */ boolean f10299c;

        C3974f(C3968b bVar, Comment comment, boolean z) {
            this.f10297a = bVar;
            this.f10298b = comment;
            this.f10299c = z;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C13706o.m87929f(motionEvent, "e");
            this.f10297a.f10293d.invoke(this.f10298b, Boolean.valueOf(this.f10299c));
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3968b(ViewGroup viewGroup, CommentableItem commentableItem, C16265l<? super Comment, C13339u> lVar, C16265l<? super Comment, C13339u> lVar2, C16269p<? super Comment, ? super Boolean, C13339u> pVar, User user, C5331h hVar, List<C4391d> list) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.item_comment, viewGroup, false));
        C13706o.m87929f(viewGroup, "parent");
        C13706o.m87929f(commentableItem, "commentableItem");
        C13706o.m87929f(lVar, "editClickListener");
        C13706o.m87929f(lVar2, "userClickListener");
        C13706o.m87929f(pVar, "commentClickListener");
        C13706o.m87929f(user, "currentUser");
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(list, "blockedUsers");
        this.f10290a = commentableItem;
        this.f10291b = lVar;
        this.f10292c = lVar2;
        this.f10293d = pVar;
        this.f10294e = user;
        this.f10295f = hVar;
        this.f10296g = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final boolean m15368y(GestureDetectorCompat gestureDetectorCompat, View view, MotionEvent motionEvent) {
        C13706o.m87929f(gestureDetectorCompat, "$detector");
        return gestureDetectorCompat.onTouchEvent(motionEvent);
    }

    /* renamed from: x */
    public final void mo27683x(Comment comment) {
        Comment comment2 = comment;
        C13706o.m87929f(comment2, "item");
        List<C4391d> list = this.f10296g;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C4391d a : list) {
            arrayList.add(Integer.valueOf(a.mo28713a()));
        }
        boolean contains = arrayList.contains(Integer.valueOf(comment.getUserId()));
        if (this.f10294e.getUserId() == comment.getUserId()) {
            ((LinearLayout) this.itemView.findViewById(C17532R$id.chatLine)).setLayoutDirection(1);
            ((LinearLayout) this.itemView.findViewById(C17532R$id.dateLayout)).setLayoutDirection(1);
            View view = this.itemView;
            int i = C17532R$id.text;
            ((TextView) view.findViewById(i)).setGravity(5);
            ViewGroup.LayoutParams layoutParams = ((TextView) this.itemView.findViewById(i)).getLayoutParams();
            C13706o.m87927d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).gravity = 5;
            View view2 = this.itemView;
            int i2 = C17532R$id.usernameEdit;
            ((TextView) view2.findViewById(i2)).setGravity(5);
            ViewGroup.LayoutParams layoutParams2 = ((TextView) this.itemView.findViewById(i2)).getLayoutParams();
            C13706o.m87927d(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 5;
            TextView textView = (TextView) this.itemView.findViewById(C17532R$id.editButton);
            C13706o.m87928e(textView, "itemView.editButton");
            textView.setVisibility(0);
        } else {
            ((LinearLayout) this.itemView.findViewById(C17532R$id.chatLine)).setLayoutDirection(0);
            ((LinearLayout) this.itemView.findViewById(C17532R$id.dateLayout)).setLayoutDirection(0);
            View view3 = this.itemView;
            int i3 = C17532R$id.text;
            ((TextView) view3.findViewById(i3)).setGravity(3);
            ViewGroup.LayoutParams layoutParams3 = ((TextView) this.itemView.findViewById(i3)).getLayoutParams();
            C13706o.m87927d(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 3;
            View view4 = this.itemView;
            int i4 = C17532R$id.usernameEdit;
            ((TextView) view4.findViewById(i4)).setGravity(3);
            ViewGroup.LayoutParams layoutParams4 = ((TextView) this.itemView.findViewById(i4)).getLayoutParams();
            C13706o.m87927d(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 3;
            TextView textView2 = (TextView) this.itemView.findViewById(C17532R$id.editButton);
            C13706o.m87928e(textView2, "itemView.editButton");
            textView2.setVisibility(8);
        }
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(this.itemView.getContext(), new C3974f(this, comment2, contains));
        View view5 = this.itemView;
        int i5 = C17532R$id.text;
        ((TextView) view5.findViewById(i5)).setOnTouchListener(new C3967a(gestureDetectorCompat));
        View view6 = this.itemView;
        int i6 = C17532R$id.usernameEdit;
        TextView textView3 = (TextView) view6.findViewById(i6);
        C13706o.m87928e(textView3, "itemView.usernameEdit");
        C4666m.m18147o(textView3, (C13640g) null, new C3969a(this, comment2, contains, (C13635d<? super C3969a>) null), 1, (Object) null);
        CardView cardView = (CardView) this.itemView.findViewById(C17532R$id.cardView);
        C13706o.m87928e(cardView, "itemView.cardView");
        C4666m.m18147o(cardView, (C13640g) null, new C3970b(this, comment2, contains, (C13635d<? super C3970b>) null), 1, (Object) null);
        View view7 = this.itemView;
        int i7 = C17532R$id.avatarImage;
        AvatarView avatarView = (AvatarView) view7.findViewById(i7);
        C13706o.m87928e(avatarView, "itemView.avatarImage");
        C4666m.m18147o(avatarView, (C13640g) null, new C3971c(this, comment2, (C13635d<? super C3971c>) null), 1, (Object) null);
        View view8 = this.itemView;
        int i8 = C17532R$id.editButton;
        TextView textView4 = (TextView) view8.findViewById(i8);
        C13706o.m87928e(textView4, "itemView.editButton");
        C4666m.m18139g(textView4, 300);
        C5331h hVar = this.f10295f;
        AvatarView avatarView2 = (AvatarView) this.itemView.findViewById(i7);
        C13706o.m87928e(avatarView2, "itemView.avatarImage");
        hVar.mo30528b(avatarView2, comment.getUserImage(), comment.getUsername());
        ((TextView) this.itemView.findViewById(i6)).setText(comment.getUsername().length() == 0 ? this.itemView.getContext().getString(C17541R$string.deleted_user_username) : comment.getUsername());
        if (contains) {
            ((TextView) this.itemView.findViewById(i5)).setPaintFlags(1);
            ((TextView) this.itemView.findViewById(i5)).setTypeface(((TextView) this.itemView.findViewById(i5)).getTypeface(), 2);
            ((TextView) this.itemView.findViewById(i5)).setAlpha(0.6f);
            ((TextView) this.itemView.findViewById(i5)).setText(this.itemView.getContext().getString(C17541R$string.blocked_user_description));
        } else {
            ((TextView) this.itemView.findViewById(i5)).setTypeface(((TextView) this.itemView.findViewById(i5)).getTypeface(), 0);
            ((TextView) this.itemView.findViewById(i5)).setAlpha(1.0f);
            ((TextView) this.itemView.findViewById(i5)).setPaintFlags(comment.getUsername().length() == 0 ? 16 : 1);
            if (comment.getText().length() > 400) {
                ((TextView) this.itemView.findViewById(i5)).setMaxLines(3);
                LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(C17532R$id.expandContainer);
                C13706o.m87928e(linearLayout, "itemView.expandContainer");
                linearLayout.setVisibility(0);
                ImageView imageView = (ImageView) this.itemView.findViewById(C17532R$id.expandButton);
                C13706o.m87928e(imageView, "itemView.expandButton");
                C4666m.m18147o(imageView, (C13640g) null, new C3972d(this, (C13635d<? super C3972d>) null), 1, (Object) null);
            }
            ((TextView) this.itemView.findViewById(i5)).setText(comment.getText());
            Linkify.addLinks((TextView) this.itemView.findViewById(i5), 15);
        }
        ((TextView) this.itemView.findViewById(C17532R$id.date)).setText(DateUtils.getRelativeTimeSpanString(comment.getTimestamp(), Calendar.getInstance().getTimeInMillis(), 60000));
        if (comment.getEditTimestamp() == 0) {
            TextView textView5 = (TextView) this.itemView.findViewById(C17532R$id.editedDate);
            C13706o.m87928e(textView5, "itemView.editedDate");
            textView5.setVisibility(8);
        } else {
            View view9 = this.itemView;
            int i9 = C17532R$id.editedDate;
            TextView textView6 = (TextView) view9.findViewById(i9);
            C13706o.m87928e(textView6, "itemView.editedDate");
            textView6.setVisibility(0);
            C13696i0 i0Var = C13696i0.f61931a;
            String string = this.itemView.getContext().getString(C17541R$string.edited_timestamp);
            C13706o.m87928e(string, "itemView.context.getStri….string.edited_timestamp)");
            String format = String.format(string, Arrays.copyOf(new Object[]{DateUtils.getRelativeTimeSpanString(comment.getEditTimestamp(), Calendar.getInstance().getTimeInMillis(), 60000)}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            ((TextView) this.itemView.findViewById(i9)).setText(format);
        }
        if (C13706o.m87924a(this.f10290a.getCommenterName(), comment.getUsername())) {
            ((TextView) this.itemView.findViewById(i6)).setTextColor(ContextCompat.getColor(this.itemView.getContext(), C17528R$color.comments_username_color));
        } else {
            ((TextView) this.itemView.findViewById(i6)).setTextColor(ContextCompat.getColor(this.itemView.getContext(), C17528R$color.comments_username_other));
        }
        TextView textView7 = (TextView) this.itemView.findViewById(i8);
        C13706o.m87928e(textView7, "itemView.editButton");
        C4666m.m18147o(textView7, (C13640g) null, new C3973e(this, comment2, (C13635d<? super C3973e>) null), 1, (Object) null);
    }
}
