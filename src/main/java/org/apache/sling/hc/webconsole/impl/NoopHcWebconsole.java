/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.hc.webconsole.impl;

import org.apache.felix.hc.api.execution.HealthCheckExecutor;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class NoopHcWebconsole {
    private static final Logger LOG = LoggerFactory.getLogger(NoopHcWebconsole.class);

    @Reference
    protected HealthCheckExecutor executor;

    @Activate
    protected void activate() {
        LOG.debug("The Sling Health Check Core Bundle is obsolete and replaced by Felix Health Check "
                + "(found Felix HC executor: " + executor + ")");
    }

}
