package com.android.dex;

import com.android.dex.Dex;

public final class Annotation implements Comparable<Annotation> {
    private final Dex dex;
    private final EncodedValue encodedAnnotation;
    private final byte visibility;

    public Annotation(Dex dex2, byte b, EncodedValue encodedValue) {
        this.dex = dex2;
        this.visibility = b;
        this.encodedAnnotation = encodedValue;
    }

    public EncodedValueReader getReader() {
        return new EncodedValueReader(this.encodedAnnotation, 29);
    }

    public int getTypeIndex() {
        EncodedValueReader reader = getReader();
        reader.readAnnotation();
        return reader.getAnnotationType();
    }

    public byte getVisibility() {
        return this.visibility;
    }

    public String toString() {
        if (this.dex == null) {
            return this.visibility + " " + getTypeIndex();
        }
        return this.visibility + " " + this.dex.typeNames().get(getTypeIndex());
    }

    public void writeTo(Dex.Section section) {
        section.writeByte(this.visibility);
        this.encodedAnnotation.writeTo(section);
    }

    public int compareTo(Annotation annotation) {
        return this.encodedAnnotation.compareTo(annotation.encodedAnnotation);
    }
}
