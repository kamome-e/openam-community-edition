/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2012 ForgeRock US Inc. All Rights Reserved
 *
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information:
 *
 * "Portions copyright [year] [name of copyright owner]".
 *
 */
package com.iplanet.dpro.session.service;

import com.iplanet.am.util.SystemProperties;
import com.sun.identity.coretoken.interfaces.AMTokenRepository;
import com.sun.identity.sm.ldap.CTSPersistentStoreInjector;
import com.sun.identity.sm.mq.JMQSessionRepositoryInjector;

/**
 * <code>AMTokenRepositoryFactory</code> provides a default
 * factory for obtaining our Core Token services BackEnd Repository.
 *
 * ** This is a Package Protected class **
 *
 * ** This class is sort of duplicated in:
 * com.sun.identity.saml2.common.AMTokenRepositoryFactoryAccessor
 *
 */

class AMTokenRepositoryFactory {
    /**
     * Our Injector Classes for our Instance.
     */
    private static final CTSPersistentStoreInjector ctsPersistentStoreInjector = new CTSPersistentStoreInjector();
    private static final JMQSessionRepositoryInjector jmqSessionRepositoryInjector = new JMQSessionRepositoryInjector();
    /**
     * Global Definitions.
     */
    private static final String DEFAULT_CTS_REPOSITORY_CLASS_NAME =
            ctsPersistentStoreInjector.getInstanceClassName();

    private static final String CTS_REPOSITORY_CLASS_NAME = SystemProperties.get(
            AMTokenRepository.CTS_REPOSITORY_CLASS_PROPERTY, DEFAULT_CTS_REPOSITORY_CLASS_NAME);

    private static AMTokenRepository amTokenRepository;

    /**
     * Private, do not allow instantiation.
     */
    private AMTokenRepositoryFactory() {
    }

    /**
     * Common Get Instance method to obtain access to
     * Service Methods.
     *
     * @return AMTokenRepository Singleton Instance.
     * @throws Exception
     */
    protected static AMTokenRepository getInstance()
            throws Exception {
        if (amTokenRepository == null) {
            if (CTS_REPOSITORY_CLASS_NAME.equals(ctsPersistentStoreInjector.getInstanceClassName())) {
                amTokenRepository = (AMTokenRepository) ctsPersistentStoreInjector.getInstance();
            } else if (CTS_REPOSITORY_CLASS_NAME.equals(jmqSessionRepositoryInjector.getInstanceClassName())) {
                amTokenRepository = (AMTokenRepository) jmqSessionRepositoryInjector.getInstance();
            } else {
                throw new IllegalAccessException("Unable to instantiate the CTS Persistent Store as Implementation Class:["+
                        CTS_REPOSITORY_CLASS_NAME+"], is unknown to OpenAM!");
            }
        }
        return amTokenRepository;
    }

}