/**
 * Copyright (c) 2014 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 *
 */
package org.eclipse.scada.configuration.world.setup.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.scada.configuration.world.setup.OperatingSystemDescriptor;
import org.eclipse.scada.configuration.world.setup.SetupModule;
import org.eclipse.scada.configuration.world.setup.SetupModuleContainer;
import org.eclipse.scada.configuration.world.setup.SetupPackage;
import org.eclipse.scada.configuration.world.setup.SubContainerModule;
import org.eclipse.scada.utils.ecore.validation.ValidationContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Container Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.setup.impl.SubContainerModuleImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubContainerModuleImpl extends MinimalEObjectImpl.Container implements SubContainerModule
{
    /**
     * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainer()
     * @generated
     * @ordered
     */
    protected SetupModuleContainer container;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubContainerModuleImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return SetupPackage.Literals.SUB_CONTAINER_MODULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SetupModuleContainer getContainer ()
    {
        if ( container != null && container.eIsProxy () )
        {
            InternalEObject oldContainer = (InternalEObject)container;
            container = (SetupModuleContainer)eResolveProxy ( oldContainer );
            if ( container != oldContainer )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, SetupPackage.SUB_CONTAINER_MODULE__CONTAINER, oldContainer, container ) );
            }
        }
        return container;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetupModuleContainer basicGetContainer ()
    {
        return container;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setContainer ( SetupModuleContainer newContainer )
    {
        SetupModuleContainer oldContainer = container;
        container = newContainer;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SetupPackage.SUB_CONTAINER_MODULE__CONTAINER, oldContainer, container ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void validateOperatingSystem ( final OperatingSystemDescriptor descriptor, final ValidationContext ctx )
    {
        if ( this.container == null )
        {
            ctx.add ( "A sub container module must reference a setup container" );
        }

        for ( final SetupModule module : this.container.getModules () )
        {
            module.validateOperatingSystem ( descriptor, ctx );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case SetupPackage.SUB_CONTAINER_MODULE__CONTAINER:
                if ( resolve )
                    return getContainer ();
                return basicGetContainer ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case SetupPackage.SUB_CONTAINER_MODULE__CONTAINER:
                setContainer ( (SetupModuleContainer)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case SetupPackage.SUB_CONTAINER_MODULE__CONTAINER:
                setContainer ( (SetupModuleContainer)null );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case SetupPackage.SUB_CONTAINER_MODULE__CONTAINER:
                return container != null;
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke ( int operationID, EList<?> arguments ) throws InvocationTargetException
    {
        switch ( operationID )
        {
            case SetupPackage.SUB_CONTAINER_MODULE___VALIDATE_OPERATING_SYSTEM__OPERATINGSYSTEMDESCRIPTOR_VALIDATIONCONTEXT:
                validateOperatingSystem ( (OperatingSystemDescriptor)arguments.get ( 0 ), (ValidationContext)arguments.get ( 1 ) );
                return null;
        }
        return super.eInvoke ( operationID, arguments );
    }

} //SubContainerModuleImpl
