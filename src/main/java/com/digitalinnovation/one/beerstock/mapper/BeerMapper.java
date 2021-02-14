package com.digitalinnovation.one.beerstock.mapper;

import com.digitalinnovation.one.beerstock.dto.BeerDTO;
import com.digitalinnovation.one.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
