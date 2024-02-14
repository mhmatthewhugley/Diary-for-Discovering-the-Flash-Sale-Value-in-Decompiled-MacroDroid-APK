package com.google.api.client.util;

import com.google.api.client.util.DataMap;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericData extends AbstractMap<String, Object> implements Cloneable {

    /* renamed from: a */
    Map<String, Object> f52802a;

    /* renamed from: c */
    final ClassInfo f52803c;

    final class EntryIterator implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: a */
        private boolean f52804a;

        /* renamed from: c */
        private final Iterator<Map.Entry<String, Object>> f52805c;

        /* renamed from: d */
        private final Iterator<Map.Entry<String, Object>> f52806d;

        EntryIterator(DataMap.EntrySet entrySet) {
            this.f52805c = entrySet.iterator();
            this.f52806d = GenericData.this.f52802a.entrySet().iterator();
        }

        /* renamed from: a */
        public Map.Entry<String, Object> next() {
            if (!this.f52804a) {
                if (this.f52805c.hasNext()) {
                    return this.f52805c.next();
                }
                this.f52804a = true;
            }
            return this.f52806d.next();
        }

        public boolean hasNext() {
            return this.f52805c.hasNext() || this.f52806d.hasNext();
        }

        public void remove() {
            if (this.f52804a) {
                this.f52806d.remove();
            }
            this.f52805c.remove();
        }
    }

    final class EntrySet extends AbstractSet<Map.Entry<String, Object>> {

        /* renamed from: a */
        private final DataMap.EntrySet f52808a;

        EntrySet() {
            this.f52808a = new DataMap(GenericData.this, GenericData.this.f52803c.mo60711d()).entrySet();
        }

        public void clear() {
            GenericData.this.f52802a.clear();
            this.f52808a.clear();
        }

        public Iterator<Map.Entry<String, Object>> iterator() {
            return new EntryIterator(this.f52808a);
        }

        public int size() {
            return GenericData.this.f52802a.size() + this.f52808a.size();
        }
    }

    public enum Flags {
        IGNORE_CASE
    }

    public GenericData() {
        this(EnumSet.noneOf(Flags.class));
    }

    /* renamed from: a */
    public GenericData clone() {
        try {
            GenericData genericData = (GenericData) super.clone();
            Data.m72651b(this, genericData);
            genericData.f52802a = (Map) Data.m72650a(this.f52802a);
            return genericData;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public final ClassInfo mo60751b() {
        return this.f52803c;
    }

    /* renamed from: c */
    public final Object put(String str, Object obj) {
        FieldInfo b = this.f52803c.mo60709b(str);
        if (b != null) {
            Object g = b.mo60747g(this);
            b.mo60750m(this, obj);
            return g;
        }
        if (this.f52803c.mo60711d()) {
            str = str.toLowerCase();
        }
        return this.f52802a.put(str, obj);
    }

    /* renamed from: d */
    public GenericData mo60078d(String str, Object obj) {
        FieldInfo b = this.f52803c.mo60709b(str);
        if (b != null) {
            b.mo60750m(this, obj);
        } else {
            if (this.f52803c.mo60711d()) {
                str = str.toLowerCase();
            }
            this.f52802a.put(str, obj);
        }
        return this;
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return new EntrySet();
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        FieldInfo b = this.f52803c.mo60709b(str);
        if (b != null) {
            return b.mo60747g(this);
        }
        if (this.f52803c.mo60711d()) {
            str = str.toLowerCase();
        }
        return this.f52802a.get(str);
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            mo60078d((String) next.getKey(), next.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f52803c.mo60709b(str) == null) {
            if (this.f52803c.mo60711d()) {
                str = str.toLowerCase();
            }
            return this.f52802a.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public GenericData(EnumSet<Flags> enumSet) {
        this.f52802a = ArrayMap.m72611b();
        this.f52803c = ClassInfo.m72641g(getClass(), enumSet.contains(Flags.IGNORE_CASE));
    }
}
