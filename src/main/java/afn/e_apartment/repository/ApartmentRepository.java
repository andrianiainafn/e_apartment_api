package afn.e_apartment.repository;

import afn.e_apartment.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestResource
@CrossOrigin (origins = "http://localhost:3000",
        methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE },
        maxAge = 3600)
public interface ApartmentRepository extends JpaRepository<Apartment,String> {
}
