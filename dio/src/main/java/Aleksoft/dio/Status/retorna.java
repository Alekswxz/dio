package Aleksoft.dio.Status;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
class retorna {
    /**
     * @return
     */
    @GetMapping(path = "/status")
    public String check() {
        return "OOOOIIII!!!";

    }
}