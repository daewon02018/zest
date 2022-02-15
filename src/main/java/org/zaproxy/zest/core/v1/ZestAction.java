/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */
package org.zaproxy.zest.core.v1;

// TODO: Auto-generated Javadoc
/** The Class ZestAction. */
public abstract class ZestAction extends ZestStatement {

    /** Instantiates a new zest action. */
    public ZestAction() {
        super();
    }

    /**
     * Instantiates a new zest action.
     *
     * @param index the index
     */
    public ZestAction(int index) {
        super(index);
    }

    @Override
    public boolean isSameSubclass(ZestElement ze) {
        return ze instanceof ZestAction;
    }

    @Override
    void setPrefix(String oldPrefix, String newPrefix) {
        // Ignore
    }

    /**
     * Invoke.
     *
     * @param response the response
     * @return the string
     * @throws ZestActionFailException the zest action fail exception
     */
    public abstract String invoke(ZestResponse response, ZestRuntime runtime)
            throws ZestActionFailException;
}
