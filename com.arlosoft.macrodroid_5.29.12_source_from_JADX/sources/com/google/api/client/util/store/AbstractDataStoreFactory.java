package com.google.api.client.util.store;

import com.google.api.client.util.Maps;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public abstract class AbstractDataStoreFactory implements DataStoreFactory {

    /* renamed from: c */
    private static final Pattern f52850c = Pattern.compile("\\w{1,30}");

    /* renamed from: a */
    private final Lock f52851a = new ReentrantLock();

    /* renamed from: b */
    private final Map<String, DataStore<? extends Serializable>> f52852b = Maps.m72704a();
}
