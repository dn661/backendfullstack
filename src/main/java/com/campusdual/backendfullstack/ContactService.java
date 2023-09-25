package com.campusdual.backendfullstack;

import com.campusdual.backendfullstack.model.Contacts;
import com.campusdual.backendfullstack.model.dao.ContactDao;
import com.campusdual.backendfullstack.model.dto.ContactsDTO;
import com.campusdual.backendfullstack.model.dto.ProductDTO;
import com.campusdual.backendfullstack.model.dto.dtomapper.ContactsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ContactService")
@Lazy
public class ContactService implements IContactService{

    @Autowired
    private ContactDao ContactDao;


    @Override
    public ContactsDTO queryContact(ContactsDTO contactDTO) {
        Contacts Contact = ContactsMapper.INSTANCE.toEntity(contactDTO);
        return ContactsMapper.INSTANCE.toDTO(ContactDao.getReferenceById(Contact.getID()));
    }

    @Override
    public List<ContactsDTO> queryAllContacts() {

        return ContactsMapper.INSTANCE.toDTOList(ContactDao.findAll());
    }

    @Override
    public int insertContact(ContactsDTO ContactsDTO) {
        Contacts Contact  = ContactsMapper.INSTANCE.toEntity(ContactsDTO);
        ContactDao.saveAndFlush(Contact);
        return Contact.getID();
    }

    @Override
    public int updateContact(ContactsDTO ContactsDTO) {
        return insertContact(ContactsDTO);
    }

    @Override
    public int deleteContact(ContactsDTO ContactsDTO) {
        int id = ContactsDTO.getID();
        Contacts contact = ContactsMapper.INSTANCE.toEntity(ContactsDTO);

        ContactDao.delete(contact);

        return id;
    }
}
