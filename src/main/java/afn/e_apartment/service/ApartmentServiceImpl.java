package afn.e_apartment.service;

import afn.e_apartment.dto.ApartmentStatDto;
import afn.e_apartment.repository.ApartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ApartmentServiceImpl implements ApartmentService{
    private final ApartmentRepository apartmentRepository;

    public ApartmentServiceImpl(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    @Override
    public ApartmentStatDto getApartmentStat() {
        return apartmentRepository.getStatForApartment();
    }
}
