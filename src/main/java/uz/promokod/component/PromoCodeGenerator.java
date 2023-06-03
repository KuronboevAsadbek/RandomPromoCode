package uz.promokod.component;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PromoCodeGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 8;

    public String generatePromoCode() {
        StringBuilder promoCode = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < CODE_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            promoCode.append(CHARACTERS.charAt(index));
        }

        return promoCode.toString();
    }
}
