package afn.e_apartment.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Apartment.class}, name = "p1")
public interface ApartmentProjection {
    String getNumApp();
    String getDesign();
    int getRent();
}
