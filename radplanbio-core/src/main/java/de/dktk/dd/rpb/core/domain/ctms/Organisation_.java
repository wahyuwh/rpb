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

package de.dktk.dd.rpb.core.domain.ctms;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Organisation entity meta model which is used for JPA
 * This allows to use type save criteria API while constructing queries
 *
 * @author tomas@skripcak.net
 * @since 16 Sep 2013
 * @version 1.0.0
 */
@SuppressWarnings("unused")
@StaticMetamodel(Organisation.class)
public class Organisation_ {

    // Raw attributes
    public static volatile SingularAttribute<Organisation, Integer> id;
    public static volatile SingularAttribute<Organisation, String> name;

    // Many-to-one
    public static volatile SingularAttribute<Organisation, Organisation> parent;

    // One-to-Many
    public static volatile ListAttribute<Organisation, Organisation> children;
    public static volatile ListAttribute<Organisation, StudyOrganisation> studyOrganisations;

}