package com.mycompany.property_management.service;

import com.mycompany.property_management.dto.PropertyDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PropertyService {
    public PropertyDTO saveProperty(PropertyDTO propertyDTO);
    List<PropertyDTO> getAllProperties();
    PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);
    PropertyDTO updatePropertyDescription( PropertyDTO propertyDTO, Long propertyId);
    PropertyDTO updatePropertyPrice( PropertyDTO propertyDTO, Long propertyId);
    void deleteProperty(Long propertyId);

}
