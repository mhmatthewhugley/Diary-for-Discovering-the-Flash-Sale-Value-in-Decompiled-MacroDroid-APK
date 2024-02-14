package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class DataMap extends AbstractMap<String, Object> {

    /* renamed from: a */
    final Object f52769a;

    /* renamed from: c */
    final ClassInfo f52770c;

    final class Entry implements Map.Entry<String, Object> {

        /* renamed from: a */
        private Object f52771a;

        /* renamed from: c */
        private final FieldInfo f52772c;

        Entry(FieldInfo fieldInfo, Object obj) {
            this.f52772c = fieldInfo;
            this.f52771a = Preconditions.m72716d(obj);
        }

        /* renamed from: a */
        public String getKey() {
            String e = this.f52772c.mo60745e();
            return DataMap.this.f52770c.mo60711d() ? e.toLowerCase() : e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!getKey().equals(entry.getKey()) || !getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getValue() {
            return this.f52771a;
        }

        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public Object setValue(Object obj) {
            Object obj2 = this.f52771a;
            this.f52771a = Preconditions.m72716d(obj);
            this.f52772c.mo60750m(DataMap.this.f52769a, obj);
            return obj2;
        }
    }

    final class EntryIterator implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: a */
        private int f52774a = -1;

        /* renamed from: c */
        private FieldInfo f52775c;

        /* renamed from: d */
        private Object f52776d;

        /* renamed from: f */
        private boolean f52777f;

        /* renamed from: g */
        private boolean f52778g;

        /* renamed from: o */
        private FieldInfo f52779o;

        EntryIterator() {
        }

        /* renamed from: a */
        public Map.Entry<String, Object> next() {
            if (hasNext()) {
                FieldInfo fieldInfo = this.f52775c;
                this.f52779o = fieldInfo;
                Object obj = this.f52776d;
                this.f52778g = false;
                this.f52777f = false;
                this.f52775c = null;
                this.f52776d = null;
                return new Entry(fieldInfo, obj);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (!this.f52778g) {
                this.f52778g = true;
                this.f52776d = null;
                while (this.f52776d == null) {
                    int i = this.f52774a + 1;
                    this.f52774a = i;
                    if (i >= DataMap.this.f52770c.f52753d.size()) {
                        break;
                    }
                    ClassInfo classInfo = DataMap.this.f52770c;
                    FieldInfo b = classInfo.mo60709b(classInfo.f52753d.get(this.f52774a));
                    this.f52775c = b;
                    this.f52776d = b.mo60747g(DataMap.this.f52769a);
                }
            }
            if (this.f52776d != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            Preconditions.m72719g(this.f52779o != null && !this.f52777f);
            this.f52777f = true;
            this.f52779o.mo60750m(DataMap.this.f52769a, (Object) null);
        }
    }

    final class EntrySet extends AbstractSet<Map.Entry<String, Object>> {
        EntrySet() {
        }

        /* renamed from: c */
        public EntryIterator iterator() {
            return new EntryIterator();
        }

        public void clear() {
            for (String b : DataMap.this.f52770c.f52753d) {
                DataMap.this.f52770c.mo60709b(b).mo60750m(DataMap.this.f52769a, (Object) null);
            }
        }

        public boolean isEmpty() {
            for (String b : DataMap.this.f52770c.f52753d) {
                if (DataMap.this.f52770c.mo60709b(b).mo60747g(DataMap.this.f52769a) != null) {
                    return false;
                }
            }
            return true;
        }

        public int size() {
            int i = 0;
            for (String b : DataMap.this.f52770c.f52753d) {
                if (DataMap.this.f52770c.mo60709b(b).mo60747g(DataMap.this.f52769a) != null) {
                    i++;
                }
            }
            return i;
        }
    }

    DataMap(Object obj, boolean z) {
        this.f52769a = obj;
        ClassInfo g = ClassInfo.m72641g(obj.getClass(), z);
        this.f52770c = g;
        Preconditions.m72713a(!g.mo60712e());
    }

    /* renamed from: a */
    public EntrySet entrySet() {
        return new EntrySet();
    }

    /* renamed from: b */
    public Object put(String str, Object obj) {
        FieldInfo b = this.f52770c.mo60709b(str);
        String valueOf = String.valueOf(str);
        Preconditions.m72717e(b, valueOf.length() != 0 ? "no field of key ".concat(valueOf) : new String("no field of key "));
        Object g = b.mo60747g(this.f52769a);
        b.mo60750m(this.f52769a, Preconditions.m72716d(obj));
        return g;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public Object get(Object obj) {
        FieldInfo b;
        if ((obj instanceof String) && (b = this.f52770c.mo60709b((String) obj)) != null) {
            return b.mo60747g(this.f52769a);
        }
        return null;
    }
}
