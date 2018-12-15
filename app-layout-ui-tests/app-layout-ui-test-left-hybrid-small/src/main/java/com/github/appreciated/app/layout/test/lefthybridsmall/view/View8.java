package com.github.appreciated.app.layout.test.lefthybridsmall.view;

import com.github.appreciated.app.layout.test.lefthybridsmall.LeftHybridSmallBehaviour;
import com.github.appreciated.app.layout.test.view.ExampleView;
import com.vaadin.flow.router.Route;

@Route(value = "view8", layout = LeftHybridSmallBehaviour.class) // an empty view name will also be the default view
public class View8 extends ExampleView {
    @Override
    protected String getViewName() {
        return getClass().getName();
    }
}
