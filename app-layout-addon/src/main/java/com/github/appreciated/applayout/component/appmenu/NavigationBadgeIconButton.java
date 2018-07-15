package com.github.appreciated.applayout.component.appmenu;

import com.github.appreciated.applayout.webcomponents.appmenu.AppMenuItem;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;

public class NavigationBadgeIconButton extends AppMenuItem {

    static int idCounter = 0;

    private final MenuBadgeComponent badge;

    public NavigationBadgeIconButton(String name, Icon icon) {
        super(name, icon.getElement().getAttribute("icon"));
        setId("menu-btn-" + idCounter++);
        badge = new MenuBadgeComponent();
        badge.setVisible(false);
        add(badge);
        getItem().getElement().getStyle().set("white-space", "nowrap");
    }

    public NavigationBadgeIconButton(String name, Icon icon, ComponentEventListener<ClickEvent<Button>> listener) {
        this(name, icon);
        if (listener != null) {
            setClickListener(appMenuIconItemClickEvent -> listener.onComponentEvent(null));
        }
    }

    private void setBadgeCaption(String status) {
        badge.setText(status);
    }

    @Override
    public void setClickListener(ComponentEventListener listener) {
        super.setClickListener(listener);
    }

}
