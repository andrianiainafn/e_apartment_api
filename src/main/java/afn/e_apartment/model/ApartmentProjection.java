package afn.e_apartment.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Apartment.class}, name = "fullApartment")
public class ApartmentProjection {
    private String numApp;
    private String design;
    private int rent;
}
