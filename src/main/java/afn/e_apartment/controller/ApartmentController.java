package afn.e_apartment.controller;

import afn.e_apartment.dto.ApartmentStatDto;
import afn.e_apartment.service.ApartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApartmentController {
    private  final ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @CrossOrigin
    @GetMapping("/stat/apartment")
    public ResponseEntity<ApartmentStatDto> getStatForApartment(){
        return new ResponseEntity<>(apartmentService.getApartmentStat( ), HttpStatus.OK);
    }
}
