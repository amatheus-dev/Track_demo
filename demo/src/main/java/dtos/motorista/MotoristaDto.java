package dtos.motorista;

import jakarta.validation.constraints.NotNull;

public record MotoristaDto (
        @NotNull(message = "o nome é obrigatório")
        String nome,
        @NotNull(message = "o telefone é obrigatório")
        String telefone,
        @NotNull(message = "a placa do calavo é obrigatória")
        String placaCavalo,
        String placaCarreta,
        Byte idStatus
     ){}
