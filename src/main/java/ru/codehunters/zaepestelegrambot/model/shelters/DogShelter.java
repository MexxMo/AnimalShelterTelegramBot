package ru.codehunters.zaepestelegrambot.model.shelters;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.codehunters.zaepestelegrambot.model.animals.Dog;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dog_Shelter")
public class DogShelter {
    @Id
    @GeneratedValue
    private Long idShelter; // id для приюта
    @Column
    private String name; // Название приюта
    @Column
    private String location; // Адрес и схема проезда
    @Column
    private String timetable; // Расписание
    @Column
    private String aboutMe; // О приюте
    @OneToMany
    private List<Dog> list; // Список животных в приюте
    @Column
    private String security; // Способ связи с охраной
    @Column(name = "safety_advice")
    private String safetyAdvice; // Рекомендации о технике безопасности на территории приюта
}
