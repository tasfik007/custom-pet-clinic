package io.tasfik007.custompetclinic.services;
import io.tasfik007.custompetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
