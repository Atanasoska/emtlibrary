package mk.ukim.finki.emtlibrary.repository;

import mk.ukim.finki.emtlibrary.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
