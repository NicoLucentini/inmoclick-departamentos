package twitter.inmoclick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class InmoclickController {

    @Autowired
    private InmoclickConsumer consumer;

    @GetMapping("/list")
    public ResponseEntity listDepartamentos(){
        try {
            var res = consumer.departamentos;
            return  ResponseEntity.status(200).body(res);
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PostMapping("/removed")
    public ResponseEntity getDifference(@RequestBody List<InmoclickPropiedad> propiedades){
        try {
            var res = consumer.getRemoveds(propiedades);
            return  ResponseEntity.status(200).body(res);
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PostMapping("/nuevas")
    public ResponseEntity getNuevas(@RequestBody List<InmoclickPropiedad> propiedades){
        try {
            var res = consumer.getNewOnes(propiedades);
            return  ResponseEntity.status(200).body(res);
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
