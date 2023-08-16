package Domain.Models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Producto {
    public long id;
    public String name;
    public String fechaRegistro;
}
