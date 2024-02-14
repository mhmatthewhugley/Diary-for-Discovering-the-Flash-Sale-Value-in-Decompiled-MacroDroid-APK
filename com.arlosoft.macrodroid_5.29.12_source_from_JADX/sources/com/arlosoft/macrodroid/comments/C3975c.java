package com.arlosoft.macrodroid.comments;

import android.view.ViewGroup;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.comments.c */
/* compiled from: CommentsAdapter.kt */
public final class C3975c extends PagedListAdapter<Comment, C3968b> {

    /* renamed from: a */
    private final CommentableItem f10300a;

    /* renamed from: b */
    private final C16265l<Comment, C13339u> f10301b;

    /* renamed from: c */
    private final C16265l<Comment, C13339u> f10302c;

    /* renamed from: d */
    private final C16269p<Comment, Boolean, C13339u> f10303d;

    /* renamed from: e */
    private final User f10304e;

    /* renamed from: f */
    private final C5331h f10305f;

    /* renamed from: g */
    private final List<C4391d> f10306g;

    /* renamed from: com.arlosoft.macrodroid.comments.c$a */
    /* compiled from: CommentsAdapter.kt */
    public static final class C3976a extends DiffUtil.ItemCallback<Comment> {
        /* renamed from: a */
        public boolean areContentsTheSame(Comment comment, Comment comment2) {
            C13706o.m87929f(comment, "oldItem");
            C13706o.m87929f(comment2, "newItem");
            return C13706o.m87924a(comment, comment2);
        }

        /* renamed from: b */
        public boolean areItemsTheSame(Comment comment, Comment comment2) {
            C13706o.m87929f(comment, "oldItem");
            C13706o.m87929f(comment2, "newItem");
            return comment.getId() == comment2.getId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3975c(CommentableItem commentableItem, C16265l<? super Comment, C13339u> lVar, C16265l<? super Comment, C13339u> lVar2, C16269p<? super Comment, ? super Boolean, C13339u> pVar, User user, C5331h hVar, List<C4391d> list) {
        super(new C3976a());
        C13706o.m87929f(commentableItem, "commentableItem");
        C13706o.m87929f(lVar, "editClickListener");
        C13706o.m87929f(lVar2, "userClickListener");
        C13706o.m87929f(pVar, "commentClickListener");
        C13706o.m87929f(user, "currentUser");
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(list, "blockedUsers");
        this.f10300a = commentableItem;
        this.f10301b = lVar;
        this.f10302c = lVar2;
        this.f10303d = pVar;
        this.f10304e = user;
        this.f10305f = hVar;
        this.f10306g = list;
    }

    /* renamed from: B */
    public void onBindViewHolder(C3968b bVar, int i) {
        C13706o.m87929f(bVar, "holder");
        Object item = getItem(i);
        C13706o.m87926c(item);
        bVar.mo27683x((Comment) item);
    }

    /* renamed from: C */
    public C3968b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        return new C3968b(viewGroup, this.f10300a, this.f10301b, this.f10302c, this.f10303d, this.f10304e, this.f10305f, this.f10306g);
    }
}
