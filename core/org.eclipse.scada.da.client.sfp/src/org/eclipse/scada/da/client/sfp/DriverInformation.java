/*******************************************************************************
 * Copyright (c) 2013 Jens Reimann and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.da.client.sfp;

import org.eclipse.scada.core.ConnectionInformation;
import org.eclipse.scada.core.client.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverInformation implements org.eclipse.scada.core.client.DriverInformation
{

    private final static Logger logger = LoggerFactory.getLogger ( DriverInformation.class );

    @Override
    public Connection create ( final ConnectionInformation connectionInformation )
    {
        if ( connectionInformation.getSecondaryTarget () == null )
        {
            return null;
        }

        try
        {
            return new org.eclipse.scada.da.client.sfp.ConnectionImpl ( connectionInformation );
        }
        catch ( final Exception e )
        {
            logger.warn ( "Failed to create connection", e );
            return null;
        }
    }

    @Override
    public Class<?> getConnectionClass ()
    {
        return org.eclipse.scada.da.client.sfp.ConnectionImpl.class;
    }

    @Override
    public void validate ( final ConnectionInformation connectionInformation ) throws Throwable
    {
    }

}
