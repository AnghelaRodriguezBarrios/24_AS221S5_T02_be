package pe.edu.vallegrande.TranslatorText.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.TranslatorText.model.Translation;

@Repository
public interface TranslationTextRepository extends ReactiveCrudRepository<Translation, Long> {
}
