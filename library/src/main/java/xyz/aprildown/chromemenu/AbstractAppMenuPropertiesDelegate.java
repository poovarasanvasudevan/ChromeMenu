// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package xyz.aprildown.chromemenu;

import android.view.Menu;
import android.view.View;

public class AbstractAppMenuPropertiesDelegate implements AppMenuPropertiesDelegate {
    @Override
    public boolean shouldShowAppMenu() {
        return true;
    }

    @Override
    public void prepareMenu(Menu menu) {

    }

    @Override
    public int getFooterResourceId() {
        return 0;
    }

    @Override
    public int getHeaderResourceId() {
        return 0;
    }

    @Override
    public boolean shouldShowFooter(int maxMenuHeight) {
        return false;
    }

    @Override
    public boolean shouldShowHeader(int maxMenuHeight) {
        return false;
    }

    @Override
    public void onHeaderViewInflated(AppMenu appMenu, View view) {

    }

    @Override
    public void onFooterViewInflated(AppMenu appMenu, View view) {

    }
}