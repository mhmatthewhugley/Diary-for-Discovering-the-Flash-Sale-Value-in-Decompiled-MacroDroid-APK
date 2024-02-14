package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Objects;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Beta
public final class StoredCredential implements Serializable {

    /* renamed from: a */
    public static final String f52201a = StoredCredential.class.getSimpleName();
    private static final long serialVersionUID = 1;
    private String accessToken;
    private Long expirationTimeMilliseconds;
    private final Lock lock = new ReentrantLock();
    private String refreshToken;

    public StoredCredential() {
    }

    /* renamed from: a */
    public String mo60128a() {
        this.lock.lock();
        try {
            return this.accessToken;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: b */
    public Long mo60129b() {
        this.lock.lock();
        try {
            return this.expirationTimeMilliseconds;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: c */
    public String mo60130c() {
        this.lock.lock();
        try {
            return this.refreshToken;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: d */
    public StoredCredential mo60131d(String str) {
        this.lock.lock();
        try {
            this.accessToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: e */
    public StoredCredential mo60132e(Long l) {
        this.lock.lock();
        try {
            this.expirationTimeMilliseconds = l;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredCredential)) {
            return false;
        }
        StoredCredential storedCredential = (StoredCredential) obj;
        if (!Objects.m72708a(mo60128a(), storedCredential.mo60128a()) || !Objects.m72708a(mo60130c(), storedCredential.mo60130c()) || !Objects.m72708a(mo60129b(), storedCredential.mo60129b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public StoredCredential mo60134f(String str) {
        this.lock.lock();
        try {
            this.refreshToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo60128a(), mo60130c(), mo60129b()});
    }

    public String toString() {
        return Objects.m72709b(StoredCredential.class).mo60778a("accessToken", mo60128a()).mo60778a("refreshToken", mo60130c()).mo60778a("expirationTimeMilliseconds", mo60129b()).toString();
    }

    public StoredCredential(Credential credential) {
        mo60131d(credential.mo60098e());
        mo60134f(credential.mo60104k());
        mo60132e(credential.mo60101h());
    }
}
