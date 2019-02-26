package com.github.appreciated.app.layout.annotations;

import com.github.appreciated.app.layout.component.appmenu.left.LeftNavigationComponent;
import com.vaadin.flow.component.icon.VaadinIcon;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * When using this the {@link Caption} Annotation with a {@link com.vaadin.flow.component.Component} with a {@link com.vaadin.flow.router.Route} Annotation
 * the value of this annotation will be used for the {@link LeftNavigationComponent} as icon of the button
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Icon {
    VaadinIcon value();
}
