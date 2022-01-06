package com.example.demo.mainView;

import javax.management.Notification;
import java.awt.*;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        add(new Button("Click me", e -> Notification.show("Hello Spring+Vaadin user!")));
    }
}