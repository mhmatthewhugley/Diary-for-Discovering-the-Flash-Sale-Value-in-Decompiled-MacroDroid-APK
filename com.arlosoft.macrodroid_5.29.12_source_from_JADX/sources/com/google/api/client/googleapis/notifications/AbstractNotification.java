package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Objects;

@Beta
public abstract class AbstractNotification {

    /* renamed from: a */
    private long f52330a;

    /* renamed from: b */
    private String f52331b;

    /* renamed from: c */
    private String f52332c;

    /* renamed from: d */
    private String f52333d;

    /* renamed from: e */
    private String f52334e;

    /* renamed from: f */
    private String f52335f;

    /* renamed from: g */
    private String f52336g;

    /* renamed from: h */
    private String f52337h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Objects.ToStringHelper mo60293a() {
        return Objects.m72709b(this).mo60778a("messageNumber", Long.valueOf(this.f52330a)).mo60778a("resourceState", this.f52331b).mo60778a("resourceId", this.f52332c).mo60778a("resourceUri", this.f52333d).mo60778a("channelId", this.f52334e).mo60778a("channelExpiration", this.f52335f).mo60778a("channelToken", this.f52336g).mo60778a("changed", this.f52337h);
    }

    public String toString() {
        return mo60293a().toString();
    }
}
