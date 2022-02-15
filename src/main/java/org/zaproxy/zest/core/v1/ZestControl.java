/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */
package org.zaproxy.zest.core.v1;

/** An abstract class representing statements that change the flow of statements */
public abstract class ZestControl extends ZestStatement {

    /** Instantiates a new zest action. */
    public ZestControl() {
        super();
    }

    /**
     * Instantiates a new zest action.
     *
     * @param index the index
     */
    public ZestControl(int index) {
        super(index);
    }

    @Override
    public boolean isSameSubclass(ZestElement ze) {
        return ze instanceof ZestControl;
    }

    @Override
    void setPrefix(String oldPrefix, String newPrefix) {
        // Ignore
    }
}
