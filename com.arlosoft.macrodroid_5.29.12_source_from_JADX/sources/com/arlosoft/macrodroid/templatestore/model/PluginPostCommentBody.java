package com.arlosoft.macrodroid.templatestore.model;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: Comment.kt */
public final class PluginPostCommentBody {
    private final int pluginId;
    private final String text;
    private final int userId;

    public PluginPostCommentBody(int i, int i2, String str) {
        C13706o.m87929f(str, "text");
        this.userId = i;
        this.pluginId = i2;
        this.text = str;
    }

    public static /* synthetic */ PluginPostCommentBody copy$default(PluginPostCommentBody pluginPostCommentBody, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = pluginPostCommentBody.userId;
        }
        if ((i3 & 2) != 0) {
            i2 = pluginPostCommentBody.pluginId;
        }
        if ((i3 & 4) != 0) {
            str = pluginPostCommentBody.text;
        }
        return pluginPostCommentBody.copy(i, i2, str);
    }

    public final int component1() {
        return this.userId;
    }

    public final int component2() {
        return this.pluginId;
    }

    public final String component3() {
        return this.text;
    }

    public final PluginPostCommentBody copy(int i, int i2, String str) {
        C13706o.m87929f(str, "text");
        return new PluginPostCommentBody(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginPostCommentBody)) {
            return false;
        }
        PluginPostCommentBody pluginPostCommentBody = (PluginPostCommentBody) obj;
        return this.userId == pluginPostCommentBody.userId && this.pluginId == pluginPostCommentBody.pluginId && C13706o.m87924a(this.text, pluginPostCommentBody.text);
    }

    public final int getPluginId() {
        return this.pluginId;
    }

    public final String getText() {
        return this.text;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.userId * 31) + this.pluginId) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "PluginPostCommentBody(userId=" + this.userId + ", pluginId=" + this.pluginId + ", text=" + this.text + ')';
    }
}
