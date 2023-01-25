package com.daniel.OdetteLane.domain.service;

import com.daniel.OdetteLane.domain.entities.Size;
import com.daniel.OdetteLane.domain.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeService {
    @Autowired
    private SizeRepository sizeRepository;

    public List<Size> getAll(){
        return sizeRepository.getAll();
    }
    public Optional<Size> getSize(int sizeId){
        return sizeRepository.getSize(sizeId);
    }
    public Size save(Size size){
        return sizeRepository.save(size);
    }
    public boolean delete(int sizeId){
        if (getSize(sizeId).isPresent()){
            sizeRepository.delete(sizeId);
            return true;
        } else {
            return false;
        }
    }
}
