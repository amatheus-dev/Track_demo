package dtos.status;

import entities.StatusNota;

public record StatusNotaDto(
         Byte idStatus,
         StatusNota status
) {
}
