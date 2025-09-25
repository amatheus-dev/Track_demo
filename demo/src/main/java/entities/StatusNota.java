package entities;


import jakarta.persistence.*;

@Entity
@Table(name = "status_nota")

public class StatusNota{
    @Column(name = "id_status")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte idStatus;
    @OneToMany
    private String status;

    public StatusNota(Byte idStatus, String status) {
        this.idStatus = idStatus;
        this.status = status;
    }

    public Byte getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Byte idStatus) {
        this.idStatus = idStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
