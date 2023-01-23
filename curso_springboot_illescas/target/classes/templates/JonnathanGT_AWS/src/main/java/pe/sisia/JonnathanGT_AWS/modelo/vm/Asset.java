package pe.sisia.JonnathanGT_AWS.modelo.vm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Asset {
    private byte[] content;
    private String contentType;

}
