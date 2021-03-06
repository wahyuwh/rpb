/*
 * This file is part of RadPlanBio
 *
 * Copyright (C) 2013-2015 Tomas Skripcak
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

package de.dktk.dd.rpb.core.dao.support;

import static com.google.common.collect.Lists.newArrayList;

import java.io.Serializable;
import java.util.List;

import javax.persistence.metamodel.SingularAttribute;

import de.dktk.dd.rpb.core.domain.Identifiable;

/**
 * Used to construct OR predicate for a single foreign key value. In other words you can search
 * all entities E having their x-to-one association value set to one of the selected values.
 * To avoid a join we rely on the foreign key field, not the association itself
 *
 * @author initial source code generated by Celerio, a Jaxio product
 * @since 01 Apr 2013
 */
public class EntitySelector<E, T extends Identifiable<TPK>, TPK extends Serializable> implements Serializable {

    //region Finals

    private static final long serialVersionUID = 1L;

    private final SingularAttribute<E, TPK> field;
    private final SingularAttribute<E, ?> cpkField;
    private final SingularAttribute<?, TPK> cpkInnerField;

    // endregion

    //region Members

    private List<T> selected = newArrayList();

    //endregion

    /**
     * @param field the property holding an foreign key.
     */
    public EntitySelector(SingularAttribute<E, TPK> field) {
        this.field = field;
        this.cpkField = null;
        this.cpkInnerField = null;
    }

    public EntitySelector(SingularAttribute<E, ?> cpkField, SingularAttribute<?, TPK> cpkInnerField) {
        this.cpkField = cpkField;
        this.cpkInnerField = cpkInnerField;
        this.field = null; // not used        
    }

    public SingularAttribute<E, TPK> getField() {
        return field;
    }

    @SuppressWarnings("unused")
    public SingularAttribute<E, ?> getCpkField() {
        return cpkField;
    }

    @SuppressWarnings("unused")
    public SingularAttribute<?, TPK> getCpkInnerField() {
        return cpkInnerField;
    }

    /**
     * Get the possible candidates for the x-to-one association.
     */
    public List<T> getSelected() {
        return selected;
    }

    /**
     * Set the possible candidates for the x-to-one association.
     */
    public void setSelected(List<T> selected) {
        this.selected = selected;
    }

    public boolean isNotEmpty() {
        return selected != null && !selected.isEmpty();
    }

    @SuppressWarnings("unused")
    public void clearSelected() {
        if (selected != null) {
            selected.clear();
        }
    }

    //region Static

    /**
     * Import statically this helper for smooth instantiation.
     */
    @SuppressWarnings("unused")
    static public <E2, T2 extends Identifiable<TPK2>, TPK2 extends Serializable> EntitySelector<E2, T2, TPK2> newEntitySelector(
            SingularAttribute<E2, TPK2> field) {
        return new EntitySelector<E2, T2, TPK2>(field);
    }

    /**
     * Import statically this helper for smooth instantiation.
     * It is used in the case where the PK is composite AND the pk member(s) are/is also a foreign key. 
     */
    @SuppressWarnings("unused")
    static public <E2, T2 extends Identifiable<TPK2>, TPK2 extends Serializable, CPK2> EntitySelector<E2, T2, TPK2> newEntitySelectorInCpk(
            SingularAttribute<E2, CPK2> cpkField, SingularAttribute<CPK2, TPK2> cpkInnerField) {
        return new EntitySelector<E2, T2, TPK2>(cpkField, cpkInnerField);
    }

    //endregion
}