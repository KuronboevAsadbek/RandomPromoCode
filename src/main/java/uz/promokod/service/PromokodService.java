package uz.promokod.service;

import org.springframework.stereotype.Service;
import uz.promokod.component.PromoCodeGenerator;
import uz.promokod.enumuration.PromokodEnum;
import uz.promokod.model.Promokod;
import uz.promokod.repository.PromokodRepository;

@Service
public class PromokodService {
    private final PromoCodeGenerator promoCodeGenerator;
    private final PromokodRepository promokodRepository;

    public PromokodService(PromoCodeGenerator promoCodeGenerator, PromokodRepository promokodRepository) {
        this.promoCodeGenerator = promoCodeGenerator;
        this.promokodRepository = promokodRepository;
    }

    public Promokod create(String sum) {
        Promokod promokod = new Promokod();
        if (Double.parseDouble(sum)>=9900) {
            promokod.setNumber(promoCodeGenerator.generatePromoCode());
            promokod.setPromokodEnum(PromokodEnum.ACTIVE);
            return promokodRepository.save(promokod);
        }else  return null;

    }
    public PromokodEnum check(String promokod){
        Promokod promokod1 = promokodRepository.findByNumber(promokod);
        return promokod1.getPromokodEnum();
    }

}
