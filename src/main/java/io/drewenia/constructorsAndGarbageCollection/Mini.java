package io.drewenia.constructorsAndGarbageCollection;

import java.awt.*;

public class Mini extends Car {
    Color color;

    public Mini() {
        /* Parametresiz constructor (no-arg constructor) varsayılan bir renk sağlar ve overloaded Real Constructor'ı
        çağırır (super() çağrısı yapan constructor).*/
        this(Color.RED);
    }

    /* REAL CONSTRUCTOR Bu, nesneyi başlatmanın gerçek işini yapan "The Real Constructor" dur. Nesneyi başlatmak,
    super() çağrısı da dahil olmak üzere gerçekleştirilen işlemi içerir. */
    public Mini(Color color) {
        super("Mini");
        this.color = color;
    }
}
