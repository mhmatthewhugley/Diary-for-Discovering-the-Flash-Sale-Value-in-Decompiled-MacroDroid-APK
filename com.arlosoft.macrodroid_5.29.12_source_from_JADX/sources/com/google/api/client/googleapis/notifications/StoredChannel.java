package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Objects;
import java.io.Serializable;
import java.util.concurrent.locks.Lock;

@Beta
public final class StoredChannel implements Serializable {

    /* renamed from: a */
    public static final String f52338a = StoredChannel.class.getSimpleName();
    private static final long serialVersionUID = 1;
    private String clientToken;
    private Long expiration;

    /* renamed from: id */
    private final String f52339id;
    private final Lock lock;
    private final UnparsedNotificationCallback notificationCallback;
    private String topicId;

    /* renamed from: a */
    public String mo60295a() {
        this.lock.lock();
        try {
            return this.clientToken;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: b */
    public Long mo60296b() {
        this.lock.lock();
        try {
            return this.expiration;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: c */
    public UnparsedNotificationCallback mo60297c() {
        this.lock.lock();
        try {
            return this.notificationCallback;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: d */
    public String mo60298d() {
        this.lock.lock();
        try {
            return this.topicId;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredChannel)) {
            return false;
        }
        return getId().equals(((StoredChannel) obj).getId());
    }

    public String getId() {
        this.lock.lock();
        try {
            return this.f52339id;
        } finally {
            this.lock.unlock();
        }
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return Objects.m72709b(StoredChannel.class).mo60778a("notificationCallback", mo60297c()).mo60778a("clientToken", mo60295a()).mo60778a("expiration", mo60296b()).mo60778a("id", getId()).mo60778a("topicId", mo60298d()).toString();
    }
}
