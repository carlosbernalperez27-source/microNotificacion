package micronotificacion.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "notificaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Notificacion {

    @Id
    private String id;

    private String usuarioId;
    private String tipo;
    private String mensaje;
    private String estado;
    private Date fechaCreacion;
    
}
