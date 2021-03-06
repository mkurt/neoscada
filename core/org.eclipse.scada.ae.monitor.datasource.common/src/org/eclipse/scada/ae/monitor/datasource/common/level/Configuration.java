/*******************************************************************************
 * Copyright (c) 2012 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.ae.monitor.datasource.common.level;

import org.eclipse.scada.ae.data.Severity;
import org.eclipse.scada.ae.monitor.common.AbstractConfiguration;
import org.eclipse.scada.ae.monitor.datasource.AbstractMasterItemMonitor;
import org.eclipse.scada.sec.UserInformation;

class Configuration extends AbstractConfiguration
{

    Double preset;

    boolean lowerOk;

    boolean includedOk;

    boolean cap;

    boolean requireAck;

    Severity severity;

    String secondPrefix;

    public Configuration ( final Configuration currentConfiguration, final AbstractMasterItemMonitor monitor )
    {
        super ( currentConfiguration, monitor );
        if ( currentConfiguration != null )
        {
            this.preset = currentConfiguration.preset;
            this.lowerOk = currentConfiguration.lowerOk;
            this.includedOk = currentConfiguration.includedOk;
            this.cap = currentConfiguration.cap;
            this.severity = currentConfiguration.severity;
            this.secondPrefix = currentConfiguration.secondPrefix;
            this.requireAck = currentConfiguration.requireAck;
        }
    }

    public void setRequireAck ( final UserInformation userInformation, final boolean requireAck )
    {
        this.requireAck = update ( userInformation, this.requireAck, requireAck );
    }

    public void setSeverity ( final UserInformation userInformation, final Severity severity )
    {
        this.severity = update ( userInformation, this.severity, severity );
    }

    public void setPreset ( final UserInformation userInformation, final Double preset )
    {
        this.preset = update ( userInformation, this.preset, preset );
    }

    public void setCap ( final UserInformation userInformation, final boolean cap )
    {
        this.cap = update ( userInformation, this.cap, cap );
    }

    public void setSecondPrefix ( final UserInformation userInformation, final String secondPrefix )
    {
        this.secondPrefix = secondPrefix;
    }

    public void setLowerOk ( final UserInformation userInformation, final boolean lowerOk )
    {
        this.lowerOk = update ( userInformation, this.lowerOk, lowerOk );
    }

    public void setIncludedOk ( final UserInformation userInformation, final boolean includedOk )
    {
        this.includedOk = update ( userInformation, this.includedOk, includedOk );
    }

}