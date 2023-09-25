package com.campusdual.backendfullstack.model.dto.dtomapper;

import com.campusdual.backendfullstack.model.Contacts;
import com.campusdual.backendfullstack.model.Product;
import com.campusdual.backendfullstack.model.dto.ContactsDTO;
import com.campusdual.backendfullstack.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ContactsMapper {
    ContactsMapper INSTANCE = Mappers.getMapper(ContactsMapper.class);

    ContactsDTO toDTO(Contacts contacts);

    List<ContactsDTO> toDTOList(List<Contacts> contacts);

    Contacts toEntity(ContactsDTO contacts);
}
