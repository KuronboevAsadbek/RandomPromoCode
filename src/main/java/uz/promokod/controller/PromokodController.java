package uz.promokod.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.promokod.enumuration.PromokodEnum;
import uz.promokod.model.Promokod;
import uz.promokod.service.PromokodService;

@RestController
@RequestMapping("/api")
public class PromokodController {
    //

    private final PromokodService promokodService;

    public PromokodController(PromokodService promokodService) {
        this.promokodService = promokodService;
    }

    @PostMapping("/random")
    public ResponseEntity<Promokod> random(@RequestParam String sum){
        return ResponseEntity.ok(promokodService.create(sum));
    }

    @GetMapping("/check")
    public ResponseEntity<?> check(@RequestParam String promokod){
        return ResponseEntity.ok(promokodService.check(promokod));

    }
}
