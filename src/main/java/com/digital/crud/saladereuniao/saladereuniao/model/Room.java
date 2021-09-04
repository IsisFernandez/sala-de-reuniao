package com.digital.crud.saladereuniao.saladereuniao.model;

import javax.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity //Sinaliza ao Hibernet e ao Spring que é uma classe de config da nossa entidade
@Table(name="meetingroom") //Nome da tabela
public class Room {

    @Id //Indica ao banco de dados que isso é um ID
    @GeneratedValue(strategy = GenerationType.AUTO) //ID gerado autormaticamente por uma estratégia
    private long id; 

    @Column(name="name", nullable = false) //@Column indica ao BD que isso é uma tabela
    private String name; 

    @Column(name="date", nullable = false) //@Nullable indica que o campo não pode ser vazio
    private String date; 

    @Column(name="startHour", nullable = false)
    private String startHour; //Hora que a reserva da sala começa

    @Column(name="endHour", nullable = false)
    private String endHour; //Hora que a reserva da sala termina

    @Override
    public String toString(){
        return "Room [ id="+id+",name="+name+",startHour="+startHour+",endHour="+endHour+" ]";
    }

    
}
