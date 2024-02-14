package com.google.api.client.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class FileContent extends AbstractInputStreamContent {

    /* renamed from: c */
    private final File f52406c;

    /* renamed from: a */
    public boolean mo60338a() {
        return true;
    }

    /* renamed from: b */
    public long mo60339b() {
        return this.f52406c.length();
    }

    /* renamed from: d */
    public InputStream mo60345d() throws FileNotFoundException {
        return new FileInputStream(this.f52406c);
    }

    /* renamed from: g */
    public FileContent mo60347f(String str) {
        return (FileContent) super.mo60347f(str);
    }
}
