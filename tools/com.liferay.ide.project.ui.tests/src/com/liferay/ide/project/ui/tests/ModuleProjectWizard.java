/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.project.ui.tests;

import com.liferay.ide.ui.tests.UIBase;

/**
 * @author Ying Xu
 */
public interface ModuleProjectWizard extends UIBase
{

    public final String LABEL_MODULE_PROJECT_NAME = "Project name:";
    public final String LABEL_MODULE_LOCATION = "Location:";
    public final String LABEL_MODULE_BUILD_TYPE = "Build type:";
    public final String LABEL_MODULE_PROJECT_TEMPLATE_NAME = "Project Template Name:";
    public final String LABEL_MODULE_COMPONENT_CLASS_NAME = "Component Class Name:";
    public final String LABEL_MODULE_PACKAGE_NAME = "Package Name:";
    public final String LABEL_MODULE_PROPERTIES = "Properties:";
    public final String LABEL_MODULE_SERVICE_NAME = "Service Name:";
    public final String LABEL_MODULE_SELECT_SERVICE_NAME = "Select Service Name:";

    public final String CHECKBOX_USE_DEFAULT_LOCATION = "Use default location";

    public final String TABLE_NAME = "Name";
    public final String TABLE_VALUE = "Value";

    public final String TOOLBARBOTTON_ADD_PROPERTY_KEY = "Add Property Key";
    public final String TOOLBARBOTTON_MOVE_UP = "Move Up";
    public final String TOOLBARBOTTON_MOVE_DOWN = "Move Down";
    public final String TOOLBARBOTTON_DELETE = "Delete";

    public final String MENU_MODULE_MVCPORTLET = "mvcportlet";
    public final String MENU_MODULE_ACTIVATOR = "activator";
    public final String MENU_MODULE_CONTENTTARGETINGRULE = "contenttargetingrule";
    public final String MENU_MODULE_CONTENTTARGETINGTRACKINGACTION = "contenttargetingtrackingaction";
    public final String MENU_MODULE_CONTROLMENUENTRY = "controlmenuentry";
    public final String MENU_MODULE_PORTLET = "portlet";
    public final String MENU_MODULE_SERVICE = "service";
    public final String MENU_MODULE_SERVICEBUILDER = "servicebuilder";
    public final String MENU_MODULE_SERVICEWRAPPER = "servicewrapper";
    public final String MENU_MODULE_CONTENTTARGETINGGREPORT = "contenttargetingreport";
    public final String MENU_MODULE_PANELAPP = "panelapp";
    public final String MENU_MODULE_PORTLETPROVIDER = "portletprovider";

    public final String TEXT_BUILD_TYPE = "gradle-module";
    public final String TEXT_ENTER_MODULE_PROJECT_NAME_MESSAGE = "Please enter a project name.";
    public final String TEXT_DOWNLOADING_TEMPLATE_MESSAGE = " Downloading templates, please wait...";
    public final String TEXT_NEW_LIFERAY_MODULE_MESSAGE =
        "Enter a name and choose a template to use for a new Liferay module.";
    public final String TEXT_MUST_SPECIFIED_PROJECT_NAME = " Project name must be specified";
    public final String TEXT_CONFIGURE_COMPONENT_CLASS = "Configure Component Class";
    public final String TEXT_INVALID_CHARACTER_IN_RESOURCE_NAME = " is an invalid character in resource name ";
    public final String TEXT_INVALID_NAME_ON_PLATFORM = " is an invalid name on this platform.";
    public final String TEXT_INVALID_NAME_FOR_GRADLE_PROJECT = " The project name is invalid for a gradle project";
    public final String TEXT_SERVICE_NAME_MUST_BE_SPECIFIED = " Service Name must be specified";

    public final int INDEX_NEW_LIFERAY_MODULE_PROJECT_VALIDATION_MESSAGE = 2;
    public final int INDEX_CONFIGURE_COMPONENT_CLASS_VALIDATION_MESSAGE = 2;
    public final int INDEX_SERVICEBUILDER_CONFIGURE_COMPONENT_CLASS_VALIDATION_MESSAGE = 1;
    public final int INDEX_MUST_SPECIFY_SERVICE_NAME_VALIDATIOIN_MESSAGE = 3;

}
