package com.arlosoft.macrodroid.templatestore.model;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: Comment.kt */
public final class PostCommentBody {
    private final int macroId;
    private final String text;
    private final int userId;

    public PostCommentBody(int i, int i2, String str) {
        C13706o.m87929f(str, "text");
        this.userId = i;
        this.macroId = i2;
        this.text = str;
    }

    public static /* synthetic */ PostCommentBody copy$default(PostCommentBody postCommentBody, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = postCommentBody.userId;
        }
        if ((i3 & 2) != 0) {
            i2 = postCommentBody.macroId;
        }
        if ((i3 & 4) != 0) {
            str = postCommentBody.text;
        }
        return postCommentBody.copy(i, i2, str);
    }

    public final int component1() {
        return this.userId;
    }

    public final int component2() {
        return this.macroId;
    }

    public final String component3() {
        return this.text;
    }

    public final PostCommentBody copy(int i, int i2, String str) {
        C13706o.m87929f(str, "text");
        return new PostCommentBody(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostCommentBody)) {
            return false;
        }
        PostCommentBody postCommentBody = (PostCommentBody) obj;
        return this.userId == postCommentBody.userId && this.macroId == postCommentBody.macroId && C13706o.m87924a(this.text, postCommentBody.text);
    }

    public final int getMacroId() {
        return this.macroId;
    }

    public final String getText() {
        return this.text;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.userId * 31) + this.macroId) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "PostCommentBody(userId=" + this.userId + ", macroId=" + this.macroId + ", text=" + this.text + ')';
    }
}
