/*******************************************************************************
 * Copyright (c) 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world.lib.deployment.wix;

public enum MsiPlatform
{
    WIN32
    {
        @Override
        public String toWixString ()
        {
            return "x86"; //$NON-NLS-1$
        }
    },
    WIN64
    {
        @Override
        public String toWixString ()
        {
            return "x64"; //$NON-NLS-1$
        }
    };

    public abstract String toWixString ();
}