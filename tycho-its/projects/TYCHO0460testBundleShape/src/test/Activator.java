/*******************************************************************************
 * Copyright (c) 2008, 2011 Sonatype Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/
package test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator
    implements BundleActivator
{
    public static BundleContext context;

    public void start( BundleContext context )
        throws Exception
    {
        Activator.context = context;
    }

    public void stop( BundleContext context )
        throws Exception
    {
    }

}
