package io.${{values.java_package_name}};

import org.jboss.logging.Logger;

import io.quarkus.funqy.Funq;
import io.smallrye.mutiny.Uni;

public class EventHandler {
    private static final Logger LOGGER = Logger.getLogger(EventHandler.class.getName());

    @Funq
    public Uni<Void> incoming() {
        return Uni.createFrom().voidItem();
    }
}