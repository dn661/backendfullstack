package com.campusdual.backendfullstack;

import com.campusdual.backendfullstack.model.dto.ContactsDTO;
import com.campusdual.backendfullstack.model.dto.ProductDTO;

import java.util.List;

public interface IContactService {

    ContactsDTO queryContact(ContactsDTO contactDTO);

    List<ContactsDTO> queryAllContacts();

    int insertContact(ContactsDTO contactDTO);

    int updateContact(ContactsDTO contactDTO);

    int deleteContact(ContactsDTO contactDTO);

}
