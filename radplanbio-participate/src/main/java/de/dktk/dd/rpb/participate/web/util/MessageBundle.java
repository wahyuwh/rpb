/*
 * This file is part of RadPlanBio
 *
 * Copyright (C) 2013-2016 Tomas Skripcak
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.dktk.dd.rpb.participate.web.util;

import java.util.Enumeration;
import java.util.ResourceBundle;

import de.dktk.dd.rpb.core.util.ResourcesUtil;

/**
 * This ResourceBundle is set in faces-config.xml under 'msg' var.
 * From your JSF2 pages, you may use <code>#{msg.property_key}</code>.
 *
 * _HACK_ as it is a tricky JSF/Spring integration point.
 *
 * @author initial source code generated by Celerio, a Jaxio product
 */
@SuppressWarnings("ALL")
public class MessageBundle extends ResourceBundle
{
    //region Members

    private ResourcesUtil resourcesUtil;

    //endregion

    //region Overrides

    @Override
    public Enumeration<String> getKeys() {
        return null;
    }

    @Override
    protected Object handleGetObject(String key) {
        if (this.resourcesUtil == null) {
            this.resourcesUtil = ResourcesUtil.getInstance();
        }

        return this.resourcesUtil.getProperty(key);
    }

    //endregion

}