/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.item.tests;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.item.ItemFactory;
import org.eclipse.scada.configuration.item.JavaScriptCustomizationPipeline;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Script Customization Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.item.JavaScriptCustomizationPipeline#getScriptEngine() <em>Get Script Engine</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class JavaScriptCustomizationPipelineTest extends ScriptCustomizationPipelineTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( JavaScriptCustomizationPipelineTest.class );
    }

    /**
     * Constructs a new Java Script Customization Pipeline test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaScriptCustomizationPipelineTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Java Script Customization Pipeline test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected JavaScriptCustomizationPipeline getFixture ()
    {
        return (JavaScriptCustomizationPipeline)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( ItemFactory.eINSTANCE.createJavaScriptCustomizationPipeline () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

    /**
     * Tests the '{@link org.eclipse.scada.configuration.item.JavaScriptCustomizationPipeline#getScriptEngine() <em>Get Script Engine</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.item.JavaScriptCustomizationPipeline#getScriptEngine()
     * @generated
     */
    public void testGetScriptEngine ()
    {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail ();
    }

} //JavaScriptCustomizationPipelineTest
