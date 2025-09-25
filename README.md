# Track

**Descrição:**  
Aplicação em Java (Spring Boot) para facilitar a retirada de notas fiscais: motoristas se cadastram via QR Code e conferentes notificam quando as notas estiverem prontas.

---

## Funcionalidades

- Cadastro de motoristas via QR Code.  
- Painel para conferentes acompanhar status das notas fiscais.  
- Notificações de disponibilidade das notas.  
- Controle de status das notas fiscais (aguardando, processada, liberada).  

---

## Tecnologias

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- PostgreSQL (banco de dados)  
- Maven (gerenciador de dependências)  

---

## Estrutura do Projeto

- `entities/` → Classes de entidade mapeadas para o banco de dados  
- `dtos/` → Objetos de transferência de dados entre API e front-end  
- `repositories/` → Interfaces para persistência de dados  
- `services/` → Regras de negócio e manipulação de dados  
- `controllers/` → Endpoints REST  

