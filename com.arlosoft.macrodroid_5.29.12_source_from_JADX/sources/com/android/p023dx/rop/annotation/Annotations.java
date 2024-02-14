package com.android.p023dx.rop.annotation;

import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.util.MutabilityControl;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.android.dx.rop.annotation.Annotations */
public final class Annotations extends MutabilityControl implements Comparable<Annotations> {
    public static final Annotations EMPTY;
    private final TreeMap<CstType, Annotation> annotations = new TreeMap<>();

    static {
        Annotations annotations2 = new Annotations();
        EMPTY = annotations2;
        annotations2.setImmutable();
    }

    public static Annotations combine(Annotations annotations2, Annotations annotations3) {
        Annotations annotations4 = new Annotations();
        annotations4.addAll(annotations2);
        annotations4.addAll(annotations3);
        annotations4.setImmutable();
        return annotations4;
    }

    public void add(Annotation annotation) {
        throwIfImmutable();
        Objects.requireNonNull(annotation, "annotation == null");
        CstType type = annotation.getType();
        if (!this.annotations.containsKey(type)) {
            this.annotations.put(type, annotation);
            return;
        }
        throw new IllegalArgumentException("duplicate type: " + type.toHuman());
    }

    public void addAll(Annotations annotations2) {
        throwIfImmutable();
        Objects.requireNonNull(annotations2, "toAdd == null");
        for (Annotation add : annotations2.annotations.values()) {
            add(add);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Annotations)) {
            return false;
        }
        return this.annotations.equals(((Annotations) obj).annotations);
    }

    public Collection<Annotation> getAnnotations() {
        return Collections.unmodifiableCollection(this.annotations.values());
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    public int size() {
        return this.annotations.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("annotations{");
        boolean z = true;
        for (Annotation next : this.annotations.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next.toHuman());
        }
        sb.append("}");
        return sb.toString();
    }

    public int compareTo(Annotations annotations2) {
        Iterator<Annotation> it = this.annotations.values().iterator();
        Iterator<Annotation> it2 = annotations2.annotations.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = it.next().compareTo(it2.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public static Annotations combine(Annotations annotations2, Annotation annotation) {
        Annotations annotations3 = new Annotations();
        annotations3.addAll(annotations2);
        annotations3.add(annotation);
        annotations3.setImmutable();
        return annotations3;
    }
}
