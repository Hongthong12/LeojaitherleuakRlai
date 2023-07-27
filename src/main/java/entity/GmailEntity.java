package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "Gmail")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GmailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
