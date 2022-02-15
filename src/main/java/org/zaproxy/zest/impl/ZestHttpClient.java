/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */
package org.zaproxy.zest.impl;

import java.io.IOException;
import org.zaproxy.zest.core.v1.ZestAuthentication;
import org.zaproxy.zest.core.v1.ZestOutputWriter;
import org.zaproxy.zest.core.v1.ZestRequest;
import org.zaproxy.zest.core.v1.ZestResponse;

/** @since 0.14.0 */
public interface ZestHttpClient {

    void init(ZestOutputWriter zestOutputWriter);

    void addAuthentication(ZestAuthentication zestAuthentication);

    void setProxy(String host, int port);

    ZestResponse send(ZestRequest req) throws IOException;
}
