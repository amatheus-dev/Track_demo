package entities;

import jakarta.persistence.*;


@Entity
public class Motorista {
    @Column(name = "id_motorista")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idMotorista;
    private String nome;
    private Long cpf;
    private String telefone;
    @Column(name = "placa_cavalo")
    private String placaCavalo;
    @Column(name = "placa_carreta")
    private String placaCarreta;
    @Column(name = "id_status")
    @ManyToOne
    @JoinColumn(name = "id_status", nullable = false, referencedColumnName = "id_status")
    private Byte idStatus;

    public Motorista(Long idMotorista, String nome, Long cpf, String telefone, String placaCavalo, String placaCarreta, Byte idStatus) {
        this.idMotorista = idMotorista;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.placaCavalo = placaCavalo;
        this.placaCarreta = placaCarreta;
        this.idStatus = idStatus;
    }

    public Long getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(Long idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPlacaCavalo() {
        return placaCavalo;
    }

    public void setPlacaCavalo(String placaCavalo) {
        this.placaCavalo = placaCavalo;
    }

    public String getPlacaCarreta() {
        return placaCarreta;
    }

    public void setPlacaCarreta(String placaCarreta) {
        this.placaCarreta = placaCarreta;
    }

    public Byte getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Byte idStatus) {
        this.idStatus = idStatus;
    }
}
